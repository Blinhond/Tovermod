package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemUrn extends Item {
    public ItemUrn() {
        setRegistryName(Reference.ToverModItems.URN.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.URN.getUnlocalizedName());
//        setCreativeTab(ToverCreative.TOVERMOD);
        setMaxStackSize(Reference.MAX_STACK_SIZE_POTS);
    }
}
