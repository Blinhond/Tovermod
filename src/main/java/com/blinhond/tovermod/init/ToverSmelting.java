package com.blinhond.tovermod.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ToverSmelting {
    public static void init() {
        addSmeltingRecipe(ToverItems.itemRawUrn, ToverItems.itemUrn);
        addSmeltingRecipe(ToverItems.itemLuminiteShard, ToverItems.itemIlluminatedShard);
        addSmeltingRecipe(ToverItems.itemAsh, ToverItems.itemBlackAsh);

        MinecraftForge.EVENT_BUS.register(new ToverSmelting());
    }

    private static void addSmeltingRecipe(Item in, Item out) {
        GameRegistry.addSmelting(in, new ItemStack(out), 1.0f);
    }

    private static void addSmeltingRecipe(Item in, Item out, float xp) {
        GameRegistry.addSmelting(in, new ItemStack(out), xp);
    }
}
