package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemHardChain extends Item {
    public ItemHardChain() {
        setRegistryName(Reference.ToverModItems.HARDCHAIN.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.HARDCHAIN.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
