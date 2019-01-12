package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemNorthstarShard extends Item {
    public ItemNorthstarShard() {
        setRegistryName(Reference.ToverModItems.NORTHSTARSHARD.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.NORTHSTARSHARD.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
