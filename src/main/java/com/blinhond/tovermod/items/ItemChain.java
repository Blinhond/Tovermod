package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemChain extends Item {
    public ItemChain() {
        setRegistryName(Reference.ToverModItems.CHAIN.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.CHAIN.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
