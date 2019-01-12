package com.blinhond.tovermod.items.magic;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemWeakAbomination extends Item {
    public ItemWeakAbomination() {
        setRegistryName(Reference.ToverModItems.WEAKABOMINATION.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.WEAKABOMINATION.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
