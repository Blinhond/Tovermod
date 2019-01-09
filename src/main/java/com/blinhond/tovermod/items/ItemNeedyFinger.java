package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemNeedyFinger extends Item {
    public ItemNeedyFinger() {
        setRegistryName(Reference.ToverModItems.NEEDYFINGER.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.NEEDYFINGER.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
