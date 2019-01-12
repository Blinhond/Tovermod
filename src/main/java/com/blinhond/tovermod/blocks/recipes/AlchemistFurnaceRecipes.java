package com.blinhond.tovermod.blocks.recipes;

import com.blinhond.tovermod.init.ToverItems;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.apache.commons.lang3.tuple.Triple;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AlchemistFurnaceRecipes {
    private static AlchemistFurnaceRecipes INSTANCE = new AlchemistFurnaceRecipes();
    private final List<Triple<ItemStack, ItemStack, ItemStack>> smeltingList = new ArrayList<>();
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    public static AlchemistFurnaceRecipes getInstance()
    {
        if (INSTANCE == null) {
            INSTANCE = new AlchemistFurnaceRecipes();
        }

        return INSTANCE;
    }

    private AlchemistFurnaceRecipes()
    {
        addSmeltingRecipe(Blocks.LOG, Items.COAL);
        addSmeltingRecipe(Items.IRON_INGOT, Items.GOLD_INGOT);
        addSmeltingRecipe(Items.APPLE, ToverItems.itemVitalAsh);
        addSmeltingRecipe(Items.FEATHER, ToverItems.itemQuickAsh);
        addSmeltingRecipe(Items.ROTTEN_FLESH, ToverItems.itemCursedBlood);
        addSmeltingRecipe(ToverItems.itemGreedyHand, ToverItems.itemCursedBlood, ToverItems.itemBloodyHand);
        addSmeltingRecipe(ToverItems.itemGreedyHand, Items.DIAMOND, ToverItems.itemPointingHand);
        addSmeltingRecipe(ToverItems.itemCursedBlood, Items.IRON_INGOT, ToverItems.itemSolidBlood);
        addSmeltingRecipe(Items.DIAMOND, ToverItems.itemMoonstone, ToverItems.itemPrism);
        addSmeltingRecipe(ToverItems.itemChain, ToverItems.itemHardChain);
        addSmeltingRecipe(ToverItems.itemAbomination, ToverItems.itemHardChain, ToverItems.itemBoundAbomination);
        addSmeltingRecipe(Items.BEEF, ToverItems.itemSoulPrism, ToverItems.itemSaturatedSoulPrism);
        addSmeltingRecipe(ToverItems.itemSaturatedSoulPrism, ToverItems.itemBoundAbomination, ToverItems.itemHungryAbomination);
        addSmeltingRecipe(ToverItems.itemNorthstarShard, ToverItems.itemSoulPrism, ToverItems.itemIlluminatedPrism);
        addSmeltingRecipe(ToverItems.itemIlluminatedPrism, ToverItems.itemBoundAbomination, ToverItems.itemBlindAbomination);
        addSmeltingRecipe(Items.PAPER, ToverItems.itemSoulPrism, ToverItems.itemHardPrism);
        addSmeltingRecipe(ToverItems.itemHardPrism, ToverItems.itemBoundAbomination, ToverItems.itemWeakAbomination);
        addSmeltingRecipe(Items.GUNPOWDER, ToverItems.itemSoulPrism, ToverItems.itemRagingPrism);
        addSmeltingRecipe(ToverItems.itemRagingPrism, ToverItems.itemBoundAbomination, ToverItems.itemColdAbomination);
    }

    public void addSmeltingRecipe(Block input, Item result) {
        addSmeltingRecipe(input, ToverItems.itemAlchemistAsh, result);
    }

    public void addSmeltingRecipe(Item input, Item result) {
        addSmeltingRecipe(input, ToverItems.itemAlchemistAsh, result);
    }

    public void addSmeltingRecipe(Block input1, Item input2, Item result) {
        addSmeltingRecipe(new ItemStack(input1), new ItemStack(input2), new ItemStack(result), 0.5F);
    }

    public void addSmeltingRecipe(Item input1, Item input2, Item result) {
        addSmeltingRecipe(new ItemStack(input1), new ItemStack(input2), new ItemStack(result), 0.5F);
    }

    public void addSmeltingRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience)
    {
        if(getSmeltingResult(input1, input2) != ItemStack.EMPTY) return;
        this.smeltingList.add(Triple.of(input1, input2, result));
        this.experienceList.put(result, Float.valueOf(experience));
    }

    public ItemStack getSmeltingResult(ItemStack input1, ItemStack input2)
    {
        for (Triple<ItemStack, ItemStack, ItemStack> triple : smeltingList)
        {

            if (this.compareItemStacks(input1, triple.getLeft()) && this.compareItemStacks(input2, triple.getMiddle()))
            {
                return triple.getRight().copy();
            }
        }
        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem();
    }

    public List<Triple<ItemStack, ItemStack, ItemStack>> getDualSmeltingList()
    {
        return this.smeltingList;
    }

    public float getSmeltingExperience(ItemStack stack)
    {
        for (Map.Entry<ItemStack, Float> entry : this.experienceList.entrySet())
        {
            if(this.compareItemStacks(stack, (ItemStack)entry.getKey()))
            {
                return ((Float)entry.getValue()).floatValue();
            }
        }
        return 0.0F;
    }
}
