package com.blinhond.tovermod.items.magic;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemVitalAsh extends Item {
    public ItemVitalAsh() {
        setRegistryName(Reference.ToverModItems.VITALASH.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.VITALASH.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        setMaxStackSize(1);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 20, 1));

        return new ActionResult<ItemStack>(EnumActionResult.PASS, ItemStack.EMPTY);
    }
}
