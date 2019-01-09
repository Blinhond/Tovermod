package com.blinhond.tovermod.blocks.recipes;

import com.blinhond.tovermod.init.ToverItems;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.Map;

public class AlchemistFurnaceRecipes {
    private static final AlchemistFurnaceRecipes INSTANCE = new AlchemistFurnaceRecipes();
    private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    public static AlchemistFurnaceRecipes getInstance()
    {
        return INSTANCE;
    }

    private AlchemistFurnaceRecipes()
    {
        //addSmeltingRecipe(new ItemStack(Blocks.ACACIA_FENCE), new ItemStack(Blocks.ACACIA_FENCE_GATE), new ItemStack(BlockInit.COPPER_CHEST), 5.0F);

        addSmeltingRecipe(new ItemStack(Blocks.LOG), new ItemStack(ToverItems.itemAlchemistAsh), new ItemStack(Items.COAL), 5.0F);
    }


    public void addSmeltingRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience)
    {
//        if(getSmeltingResult(input1, input2) != ItemStack.EMPTY) return;
        this.smeltingList.put(input1, input2, result);
        this.experienceList.put(result, Float.valueOf(experience));
    }

    public ItemStack getSmeltingResult(ItemStack input1, ItemStack input2)
    {
        for(Map.Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet())
        {
            if(this.compareItemStacks(input1, (ItemStack)entry.getKey()))
            {
                for(Map.Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
                {
                    if(this.compareItemStacks(input2, (ItemStack)ent.getKey()))
                    {
                        return (ItemStack)ent.getValue();
                    }
                }
            }
        }
        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList()
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
