package com.blinhond.tovermod.util.handlers;

import com.blinhond.tovermod.init.ToverItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EntityHurtHandler {

    public static void init() {
        MinecraftForge.EVENT_BUS.register(new EntityHurtHandler());
    }

    @SubscribeEvent
    public void entityHurtEvent(LivingHurtEvent event) {
        if (event.getSource().getTrueSource() != null && event.getEntity() instanceof EntityPlayer
                && ((EntityPlayer) event.getEntity()).inventory.hasItemStack(new ItemStack(ToverItems.itemWeakAbomination))) {
            event.setAmount(event.getAmount() / 2);
        }

        if (event.getSource().getTrueSource() != null && event.getEntity() instanceof EntityPlayer
                && ((EntityPlayer) event.getEntity()).inventory.hasItemStack(new ItemStack(ToverItems.itemColdAbomination))) {
            int fireDuration = 10;
            event.getSource().getTrueSource().setFire(fireDuration);
        }
    }
}
