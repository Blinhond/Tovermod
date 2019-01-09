package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemMoonstoneShard extends Item {
    public ItemMoonstoneShard() {
        setRegistryName(Reference.ToverModItems.MOONSTONESHARD.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.MOONSTONESHARD.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
