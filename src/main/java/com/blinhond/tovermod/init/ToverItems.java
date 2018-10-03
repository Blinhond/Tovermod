package com.blinhond.tovermod.init;

import com.blinhond.tovermod.items.*;
import com.blinhond.tovermod.items.magic.ItemNocturnalEye;
import com.blinhond.tovermod.items.treasure.ItemGoldRing;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

public class ToverItems {
    private static List<Item> initList = new ArrayList<>();

    // Items
    public static ItemAsh itemAsh;
    public static ItemUrn itemUrn;
    public static ItemRawUrn itemRawUrn;
    public static ItemCleanAsh itemCleanAsh;
    public static ItemGoldRing itemGoldRing;
    public static ItemNocturnalEye itemNocturnalEye;
    public static ItemLuminiteShard itemLuminiteShard;
    public static ItemBlackAsh itemBlackAsh;

    public static void init() {
        // Item initialization
        itemAsh = new ItemAsh();
        itemUrn = new ItemUrn();
        itemRawUrn = new ItemRawUrn();
        itemCleanAsh = new ItemCleanAsh();
        itemGoldRing = new ItemGoldRing();
        itemNocturnalEye = new ItemNocturnalEye();
        itemLuminiteShard = new ItemLuminiteShard();
        itemBlackAsh = new ItemBlackAsh();

        // Item registration
        initList.add(itemAsh);
        initList.add(itemUrn);
        initList.add(itemRawUrn);
        initList.add(itemCleanAsh);
        initList.add(itemGoldRing);
        initList.add(itemNocturnalEye);
        initList.add(itemLuminiteShard);
        initList.add(itemBlackAsh);

        MinecraftForge.EVENT_BUS.register(new ToverItems());
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> registryEvent) {
        for (Item item : initList) {
            registryEvent.getRegistry().register(item);
        }
    }

    public static void registerRenders() {
        for (Item item : initList) {
            registerRender(item);
        }
    }

    private static void registerRender(Item item) {
        if (item.getRegistryName() == null) {
            return;
        }

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
