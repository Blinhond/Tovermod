package com.blinhond.tovermod.items.tools;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.ItemSpade;

public class ItemMoonstoneShovel extends ItemSpade {
    public ItemMoonstoneShovel() {
        super(ToolMaterial.IRON);
        setRegistryName(Reference.ToverModItems.MOONSTONESHOVEL.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.MOONSTONESHOVEL.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        canRepair = true;
    }
}
