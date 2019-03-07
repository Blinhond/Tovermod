package com.blinhond.tovermod.items.treasure;

import com.blinhond.tovermod.Reference;
import net.minecraft.item.Item;

public class ItemGoldRing extends Item {
    public ItemGoldRing() {
        setRegistryName(Reference.ToverModItems.GOLDRING.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.GOLDRING.getUnlocalizedName());
//        setCreativeTab(ToverCreative.TOVERMOD);
        setMaxStackSize(1);
    }
}
