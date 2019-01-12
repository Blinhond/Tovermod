package com.blinhond.tovermod.items.tools;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.ItemPickaxe;

public class ItemMoonstonePickaxe extends ItemPickaxe {
    public ItemMoonstonePickaxe() {
        super(ToolMaterial.IRON);
        setRegistryName(Reference.ToverModItems.MOONSTONEPICKAXE.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.MOONSTONEPICKAXE.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        canRepair = true;
    }
}
