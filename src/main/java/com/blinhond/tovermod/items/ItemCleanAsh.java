package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemCleanAsh extends Item {
    public ItemCleanAsh() {
        setRegistryName(Reference.ToverModItems.CLEANASH.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.CLEANASH.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
