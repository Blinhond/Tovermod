package com.blinhond.tovermod.items.tools;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.item.ItemSpade;

public class ItemBrokenHand extends ItemSpade {
    public ItemBrokenHand() {
        super(ToolMaterial.DIAMOND);
        setRegistryName(Reference.ToverModItems.BROKENHAND.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.BROKENHAND.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        canRepair = true;
    }
}
