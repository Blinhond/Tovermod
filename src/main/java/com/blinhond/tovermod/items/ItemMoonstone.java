package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemMoonstone extends Item {
    public ItemMoonstone() {
        setRegistryName(Reference.ToverModItems.MOONSTONE.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.MOONSTONE.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
