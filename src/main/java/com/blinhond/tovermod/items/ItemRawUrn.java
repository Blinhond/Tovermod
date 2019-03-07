package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import net.minecraft.item.Item;

public class ItemRawUrn extends Item {
    public ItemRawUrn() {
        setRegistryName(Reference.ToverModItems.RAWURN.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.RAWURN.getUnlocalizedName());
//        setCreativeTab(ToverCreative.TOVERMOD);
        setMaxStackSize(Reference.MAX_STACK_SIZE_POTS);
    }
}
