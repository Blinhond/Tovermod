package com.blinhond.tovermod.items.magic;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemColdAbomination extends Item {
    public ItemColdAbomination() {
        setRegistryName(Reference.ToverModItems.COLDABOMINATION.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.COLDABOMINATION.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
