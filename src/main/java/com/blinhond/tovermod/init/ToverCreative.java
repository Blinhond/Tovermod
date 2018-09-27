package com.blinhond.tovermod.init;

import com.blinhond.tovermod.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ToverCreative {
    public static final CreativeTabs TOVERMOD = new CreativeTabs(Reference.NAME) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ToverItems.itemAsh);
        }
    };
}
