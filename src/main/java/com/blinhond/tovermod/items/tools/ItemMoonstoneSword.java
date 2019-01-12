package com.blinhond.tovermod.items.tools;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.ItemSword;

public class ItemMoonstoneSword extends ItemSword {
    public ItemMoonstoneSword() {
        super(ToolMaterial.IRON);
        setRegistryName(Reference.ToverModItems.MOONSTONESWORD.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.MOONSTONESWORD.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        canRepair = true;
    }
}
