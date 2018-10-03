package com.blinhond.tovermod.items;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHealth;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemIlluminatedShard extends Item {
    public ItemIlluminatedShard() {
        setRegistryName(Reference.ToverModItems.ILLUMINATEDSHARD.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.ILLUMINATEDSHARD.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.addPotionEffect(new PotionEffect(new PotionHealth(false, 0)));

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
