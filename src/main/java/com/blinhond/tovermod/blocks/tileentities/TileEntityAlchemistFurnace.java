package com.blinhond.tovermod.blocks.tileentities;

import javax.annotation.Nullable;

import com.blinhond.tovermod.blocks.machines.BlockAlchemistFurnace;
import com.blinhond.tovermod.blocks.recipes.AlchemistFurnaceRecipes;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityAlchemistFurnace extends TileEntity implements ITickable
{
	private ItemStackHandler handler = new ItemStackHandler(4);
	private String customName;
	private ItemStack smelting = ItemStack.EMPTY;
	private AlchemistFurnaceRecipes recipes = AlchemistFurnaceRecipes.getInstance();

	private int burnTime;
	private int currentBurnTime;
	private int cookTime;
	private int totalCookTime = 200;

	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing)
	{
		return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing)
	{
		if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
		{
			return (T) handler;
		}
		return super.getCapability(capability, facing);
	}

	private boolean hasCustomName()
	{
		return customName != null && !customName.isEmpty();
	}

	private void setCustomName(String customName)
	{
		this.customName = customName;
	}

	@Override
	public ITextComponent getDisplayName()
	{
		return this.hasCustomName() ? new TextComponentString(customName) : new TextComponentTranslation("container.alchemistfurnace");
	}

	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		handler.deserializeNBT(compound.getCompoundTag("Inventory"));
		burnTime = compound.getInteger("BurnTime");
		cookTime = compound.getInteger("CookTime");
		totalCookTime = compound.getInteger("CookTimeTotal");
		currentBurnTime = getItemBurnTime((ItemStack) handler.getStackInSlot(2));

		if (compound.hasKey("CustomName", 8)) setCustomName(compound.getString("CustomName"));
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		compound.setInteger("BurnTime", (short) burnTime);
		compound.setInteger("CookTime", (short) cookTime);
		compound.setInteger("CookTimeTotal", (short) totalCookTime);
		compound.setTag("Inventory", handler.serializeNBT());

		if (hasCustomName()) compound.setString("CustomName", customName);
		return compound;
	}

	@SideOnly(Side.CLIENT)
	public static boolean isBurning(TileEntityAlchemistFurnace te)
	{
		return te.getField(0) > 0;
	}

	public void update()
	{

		boolean canSmelt = canSmelt();
		ItemStack[] inputs = new ItemStack[]{handler.getStackInSlot(0), handler.getStackInSlot(1)};
		ItemStack fuel = handler.getStackInSlot(2);

		if (isBurning())
		{
			--burnTime;
		}
		else
		{
			BlockAlchemistFurnace.setState(false, world, pos);
		}

		if (fuel.isEmpty())
		{
			ItemStack itemFuel = fuel.getItem().getContainerItem(fuel);
			handler.setStackInSlot(2, itemFuel);
		}

		if (!isBurning(this) && !fuel.isEmpty() && canSmelt)
		{
			burnTime = getItemBurnTime(fuel);
			currentBurnTime = burnTime;

			BlockAlchemistFurnace.setState(true, world, pos);

			fuel.shrink(1);

			smelting = recipes.getSmeltingResult(handler.getStackInSlot(0), handler.getStackInSlot(1));
		}

		if (isBurning() && canSmelt)
		{
			cookTime++;
		}
		else if (!canSmelt)
		{
			cookTime = 0;
		}

		if (cookTime == totalCookTime)
		{
			cookTime = 0;
			if (handler.getStackInSlot(3).isEmpty())
			{
				handler.setStackInSlot(3, smelting.copy());
			}
			else
			{
				handler.getStackInSlot(3).grow(1);
			}

			inputs[0].shrink(1);
			inputs[1].shrink(1);
		}
	}

	private boolean canSmelt()
	{
		if (handler.getStackInSlot(0).isEmpty() || handler.getStackInSlot(1).isEmpty())
		{
			return false;
		}
		else
		{
			ItemStack result = recipes.getSmeltingResult(handler.getStackInSlot(0), handler.getStackInSlot(1));

			if (result.isEmpty())
			{
				return false;
			}
			else
			{
				ItemStack output = handler.getStackInSlot(3);
				if (output.isEmpty()) return true;
				if (!output.isItemEqual(result)) return false;
				int res = output.getCount() + result.getCount();
				return res <= output.getMaxStackSize() && res <= 64;
			}
		}
	}

	private static int getItemBurnTime(ItemStack fuel)
	{
		if (fuel.isEmpty()) return 0;

		Item item = fuel.getItem();

		if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.AIR)
		{
			Block block = Block.getBlockFromItem(item);

			if (block == Blocks.WOODEN_SLAB) return 150;
			if (block.getDefaultState().getMaterial() == Material.WOOD) return 300;
			if (block == Blocks.COAL_BLOCK) return 16000;
		}

		if (item instanceof ItemTool && "WOOD".equals(((ItemTool) item).getToolMaterialName())) return 200;
		if (item instanceof ItemSword && "WOOD".equals(((ItemSword) item).getToolMaterialName())) return 200;
		if (item instanceof ItemHoe && "WOOD".equals(((ItemHoe) item).getMaterialName())) return 200;
		if (item == Items.STICK) return 100;
		if (item == Items.COAL) return 1600;
		if (item == Items.LAVA_BUCKET) return 20000;
		if (item == Item.getItemFromBlock(Blocks.SAPLING)) return 100;
		if (item == Items.BLAZE_ROD) return 2400;

		return GameRegistry.getFuelValue(fuel);

	}

	public static boolean isItemFuel(ItemStack fuel)
	{
		return getItemBurnTime(fuel) > 0;
	}

	public boolean isUsableByPlayer(EntityPlayer player)
	{
		return this.world.getTileEntity(this.pos) == this && player.getDistanceSq((double) this.pos.getX() + 0.5D, (double) this.pos.getY() + 0.5D, (double) this.pos.getZ() + 0.5D) <= 64.0D;
	}

	public int getField(int id)
	{
		switch (id)
		{
			case 0:
				return burnTime;
			case 1:
				return currentBurnTime;
			case 2:
				return cookTime;
			case 3:
				return totalCookTime;
			default:
				return 0;
		}
	}

	public void setField(int id, int value)
	{
		switch (id)
		{
			case 0:
				burnTime = value;
				break;
			case 1:
				currentBurnTime = value;
				break;
			case 2:
				cookTime = value;
				break;
			case 3:
				totalCookTime = value;
		}
	}

	private boolean isBurning()
	{
		return burnTime > 0;
	}

	@Nullable
	@Override
	public SPacketUpdateTileEntity getUpdatePacket()
	{
		NBTTagCompound update = new NBTTagCompound();
		writeToNBT(update);
		return new SPacketUpdateTileEntity(this.pos, 1, update);
	}

	@Override
	public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt)
	{
		this.readFromNBT(pkt.getNbtCompound());
	}
}
