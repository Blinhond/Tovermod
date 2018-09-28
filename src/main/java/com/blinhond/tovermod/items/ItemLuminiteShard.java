package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemLuminiteShard extends Item {
    public ItemLuminiteShard() {
        setRegistryName(Reference.ToverModItems.LUMINITESHARD.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.LUMINITESHARD.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
