package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemAlchemistAsh extends Item {
    public ItemAlchemistAsh() {
        setRegistryName(Reference.ToverModItems.ALCHEMISTASH.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.ALCHEMISTASH.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
