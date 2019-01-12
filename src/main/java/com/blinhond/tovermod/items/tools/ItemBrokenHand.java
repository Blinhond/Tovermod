package com.blinhond.tovermod.items.tools;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.ToverMod;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemBrokenHand extends ItemSpade {
    public ItemBrokenHand() {
        super(ToolMaterial.DIAMOND);
        setRegistryName(Reference.ToverModItems.BROKENHAND.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.BROKENHAND.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        canRepair = true;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
        int random = ToverMod.RANDOM.nextInt(100);

        if ((stack.getItem() == Item.getItemFromBlock(Blocks.DIRT) || stack.getItem() == Item.getItemFromBlock(Blocks.SAND) || stack.getItem() == Item.getItemFromBlock(Blocks.GRAVEL))
                && random <= 10 && entityLiving instanceof EntityPlayer) {
            ((EntityPlayer) entityLiving).inventory.addItemStackToInventory(new ItemStack(Blocks.LOG));
        }

        return true;
    }
}
