package com.blinhond.tovermod.blocks.recipes;

import com.blinhond.tovermod.init.ToverItems;
import com.google.common.collect.Maps;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
        addSmeltingRecipe(new ItemStack(Blocks.LOG), new ItemStack(ToverItems.itemAlchemistAsh), new ItemStack(Items.COAL), 5.0F);
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
