package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemSolidBlood extends Item {
    public ItemSolidBlood() {
        setRegistryName(Reference.ToverModItems.SOLIDBLOOD.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.SOLIDBLOOD.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
