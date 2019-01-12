package com.blinhond.tovermod.items.tools;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.ItemHoe;

public class ItemMoonstoneHoe extends ItemHoe {
    public ItemMoonstoneHoe() {
        super(ToolMaterial.IRON);
        setRegistryName(Reference.ToverModItems.MOONSTONEHOE.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.MOONSTONEHOE.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        canRepair = true;
    }
}
