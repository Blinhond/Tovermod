package com.blinhond.tovermod.items.tools;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.ToverMod;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemCrookedHand extends ItemAxe {
    public ItemCrookedHand() {
        super(ToolMaterial.DIAMOND);
        setRegistryName(Reference.ToverModItems.CROOKEDHAND.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.CROOKEDHAND.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        canRepair = true;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        int random = ToverMod.RANDOM.nextInt(100);

        if (stack.getItem() == Item.getItemFromBlock(Blocks.LOG) && random <= 10 && entityLiving instanceof EntityPlayer) {
            ((EntityPlayer) entityLiving).inventory.addItemStackToInventory(new ItemStack(Blocks.LOG));
        }

        return true;
    }
}
