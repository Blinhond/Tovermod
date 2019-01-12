package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemHardPrism extends Item {
    public ItemHardPrism() {
        setRegistryName(Reference.ToverModItems.HARDPRISM.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.HARDPRISM.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);

        tooltip.add("Hardened");
    }
}
