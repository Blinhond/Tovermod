package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemGreedyHand extends Item {
    public ItemGreedyHand() {
        setRegistryName(Reference.ToverModItems.GREEDYHAND.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.GREEDYHAND.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
