package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemAsh extends Item {
    public ItemAsh() {
        setUnlocalizedName(Reference.ToverModItems.ASH.getUnlocalizedName());
        setRegistryName(Reference.ToverModItems.ASH.getRegistryName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
