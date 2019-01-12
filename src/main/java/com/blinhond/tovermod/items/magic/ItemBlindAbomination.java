package com.blinhond.tovermod.items.magic;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import com.blinhond.tovermod.util.Constants;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemBlindAbomination extends Item {
    public ItemBlindAbomination() {
        setRegistryName(Reference.ToverModItems.BLINDABOMINATION.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.BLINDABOMINATION.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);

        if (entityIn instanceof EntityPlayer) {
            int effectDurationSeconds = 11;

            ((EntityPlayer) entityIn).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,
                    (Constants.GAME_MINUTE / Constants.SECONDS_IN_MINUTE) * effectDurationSeconds, 1));
        }
    }
}
