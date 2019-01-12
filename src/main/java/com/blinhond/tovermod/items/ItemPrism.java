package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemPrism extends Item {
    public ItemPrism() {
        setRegistryName(Reference.ToverModItems.PRISM.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.PRISM.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
