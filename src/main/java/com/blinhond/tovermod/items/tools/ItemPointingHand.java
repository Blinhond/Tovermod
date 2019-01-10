package com.blinhond.tovermod.items.tools;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.ToverMod;
import com.blinhond.tovermod.init.ToverCreative;
import com.blinhond.tovermod.init.ToverItems;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemPointingHand extends ItemPickaxe {
    public ItemPointingHand() {
        super(ToolMaterial.DIAMOND);
        setRegistryName(Reference.ToverModItems.POINTINGHAND.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.POINTINGHAND.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        canRepair = false;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {

        if (ToverMod.RANDOM.nextInt(100) == 99) {
            ((EntityPlayer) entityLiving).inventory.addItemStackToInventory(new ItemStack(ToverItems.getRandomMagicItem()));
        }

        return super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving);
    }
}
