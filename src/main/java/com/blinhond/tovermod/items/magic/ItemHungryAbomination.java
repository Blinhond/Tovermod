package com.blinhond.tovermod.items.magic;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemHungryAbomination extends Item {
    public ItemHungryAbomination() {
        setRegistryName(Reference.ToverModItems.HUNGRYABOMINATION.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.HUNGRYABOMINATION.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);

        if (entityIn instanceof EntityPlayer) {
            ((EntityPlayer) entityIn).getFoodStats().setFoodSaturationLevel(0F);
            ((EntityPlayer) entityIn).getFoodStats().setFoodLevel(20);
        }
    }
}
