package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemCursedBlood extends Item {
    public ItemCursedBlood() {
        setRegistryName(Reference.ToverModItems.CURSEDBLOOD.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.CURSEDBLOOD.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
