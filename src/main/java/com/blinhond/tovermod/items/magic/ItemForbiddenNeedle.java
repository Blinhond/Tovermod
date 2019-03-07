package com.blinhond.tovermod.items.magic;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.block.SoundType;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemForbiddenNeedle extends Item {
    public ItemForbiddenNeedle() {
        setRegistryName(Reference.ToverModItems.FORBIDDENNEEDLE.getRegistryName());
        setUnlocalizedName(Reference.ToverModItems.FORBIDDENNEEDLE.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        setMaxStackSize(1);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);

        tooltip.add("Forbidden for a reason.");
    }

    @Override
    public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target, EnumHand hand) {
        playSound(playerIn);

        target.performHurtAnimation();
        target.setHealth(0f);

        playerIn.setHeldItem(hand, ItemStack.EMPTY);

        return true;
    }

    private void playSound(EntityPlayer player) {
        final int volume = 6;
        final int pitch = 10;

        player.playSound(new SoundEvent(SoundType.ANVIL.getPlaceSound().getSoundName()), volume, pitch);
    }
}
