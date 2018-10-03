package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBlackAsh extends Item {
    public ItemBlackAsh() {
        setRegistryName(Reference.ToverModItems.BLACKASH.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.BLACKASH.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }

    @Override
    public int getItemBurnTime(ItemStack itemStack) {
        return super.getItemBurnTime(itemStack);
    }
}
