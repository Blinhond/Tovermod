package com.blinhond.tovermod.items.tools;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.ItemAxe;

public class ItemMoonstoneAxe extends ItemAxe {
    public ItemMoonstoneAxe() {
        super(ToolMaterial.IRON);
        setRegistryName(Reference.ToverModItems.MOONSTONEAXE.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.MOONSTONEAXE.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        canRepair = true;
    }
}
