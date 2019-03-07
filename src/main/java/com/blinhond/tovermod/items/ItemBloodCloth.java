package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemBloodCloth extends Item {
    public ItemBloodCloth() {
        setRegistryName(Reference.ToverModItems.BLOODCLOTH.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.BLOODCLOTH.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
