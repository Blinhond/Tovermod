package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.Item;

public class ItemBoundAbomination extends Item {
    public ItemBoundAbomination() {
        setRegistryName(Reference.ToverModItems.BOUNDAB0MINATION.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.BOUNDAB0MINATION.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }
}
