package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import com.blinhond.tovermod.util.Constants;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemAbomination extends Item {
    public ItemAbomination() {
        setRegistryName(Reference.ToverModItems.ABOMINATION.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.ABOMINATION.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);

        if (entityIn instanceof EntityPlayer) {
            ((EntityPlayer) entityIn).addPotionEffect(new PotionEffect(MobEffects.HUNGER, Constants.GAME_MINUTE / 6, 0));
        }
    }

    @Override
    public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
        int weatherTime = Constants.GAME_MINUTE * 3;

        worldIn.getWorldInfo().setCleanWeatherTime(0);
        worldIn.getWorldInfo().setRainTime(weatherTime);
        worldIn.getWorldInfo().setThunderTime(weatherTime);
        worldIn.getWorldInfo().setRaining(true);
        worldIn.getWorldInfo().setThundering(true);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);

        tooltip.add("The product of reckless experimentation...");
    }
}
