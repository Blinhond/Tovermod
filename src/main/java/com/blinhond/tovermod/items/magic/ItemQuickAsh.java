package com.blinhond.tovermod.items.magic;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import com.blinhond.tovermod.util.Constants;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemQuickAsh extends Item {
    public ItemQuickAsh() {
        setRegistryName(Reference.ToverModItems.QUICKASH.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.QUICKASH.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        setMaxStackSize(1);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, Constants.GAME_MINUTE * 5, 1));

        return new ActionResult<ItemStack>(EnumActionResult.PASS, ItemStack.EMPTY);
    }
}
