package com.blinhond.tovermod.init;

import com.blinhond.tovermod.ToverMod;
import com.blinhond.tovermod.items.*;
import com.blinhond.tovermod.items.magic.*;
import com.blinhond.tovermod.items.tools.*;
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
    private static List<Item> magicItemList = new ArrayList<>();

    // Item declaration
    public static ItemAsh itemAsh;
    public static ItemUrn itemUrn;
    public static ItemRawUrn itemRawUrn;
    public static ItemFilledUrn itemFilledUrn;
    public static ItemCleanAsh itemCleanAsh;
    public static ItemGoldRing itemGoldRing;
    public static ItemNocturnalEye itemNocturnalEye;
    public static ItemLuminiteShard itemLuminiteShard;
    public static ItemIlluminatedShard itemIlluminatedShard;
    public static ItemBlackAsh itemBlackAsh;
    public static ItemQuickAsh itemQuickAsh;
    public static ItemVitalAsh itemVitalAsh;
    public static ItemAlchemistAsh itemAlchemistAsh;
    public static ItemNeedyFinger itemNeedyFinger;
    public static ItemMoonstone itemMoonstone;
    public static ItemMoonstoneShard itemMoonstoneShard;
    public static ItemMoonstonePickaxe itemMoonstonePickaxe;
    public static ItemGreedyHand itemGreedyHand;
    public static ItemCursedBlood itemCursedBlood;
    public static ItemBloodyHand itemBloodyHand;
    public static ItemSolidBlood itemSolidBlood;
    public static ItemPointingHand itemPointingHand;
    public static ItemNorthstarShard itemNorthstarShard;
    public static ItemPrism itemPrism;
    public static ItemChain itemChain;
    public static ItemHardChain itemHardChain;
    public static ItemAbomination itemAbomination;
    public static ItemBoundAbomination itemBoundAbomination;
    public static ItemSoulPrism itemSoulPrism;
    public static ItemHungryAbomination itemHungryAbomination;
    public static ItemSaturatedSoulPrism itemSaturatedSoulPrism;
    public static ItemBlindAbomination itemBlindAbomination;
    public static ItemIlluminatedPrism itemIlluminatedPrism;
    public static ItemWeakAbomination itemWeakAbomination;
    public static ItemHardPrism itemHardPrism;
    public static ItemColdAbomination itemColdAbomination;
    public static ItemRagingPrism itemRagingPrism;
    public static ItemMoonstoneAxe itemMoonstoneAxe;
    public static ItemMoonstoneSword itemMoonstoneSword;
    public static ItemMoonstoneHoe itemMoonstoneHoe;
    public static ItemMoonstoneShovel itemMoonstoneShovel;
    public static ItemCrookedHand itemCrookedHand;
    public static ItemBrokenHand itemBrokenHand;

    public static void init() {
        // Item initialization
        itemAsh = new ItemAsh();
        itemBlackAsh = new ItemBlackAsh();
        itemQuickAsh = new ItemQuickAsh();
        itemVitalAsh = new ItemVitalAsh();
        itemCleanAsh = new ItemCleanAsh();
        itemAlchemistAsh = new ItemAlchemistAsh();

        itemLuminiteShard = new ItemLuminiteShard();
        itemIlluminatedShard = new ItemIlluminatedShard();

        itemChain = new ItemChain();
        itemHardChain = new ItemHardChain();

        itemCursedBlood = new ItemCursedBlood();
        itemSolidBlood = new ItemSolidBlood();
        itemNeedyFinger = new ItemNeedyFinger();

        itemMoonstone = new ItemMoonstone();
        itemMoonstoneShard = new ItemMoonstoneShard();
        itemNorthstarShard = new ItemNorthstarShard();

        itemPrism = new ItemPrism();
        itemSoulPrism = new ItemSoulPrism();
        itemHardPrism = new ItemHardPrism();
        itemSaturatedSoulPrism = new ItemSaturatedSoulPrism();
        itemRagingPrism = new ItemRagingPrism();
        itemIlluminatedPrism = new ItemIlluminatedPrism();

        itemAbomination = new ItemAbomination();
        itemBoundAbomination = new ItemBoundAbomination();
        itemHungryAbomination = new ItemHungryAbomination();
        itemBlindAbomination = new ItemBlindAbomination();
        itemWeakAbomination = new ItemWeakAbomination();
        itemColdAbomination = new ItemColdAbomination();

        itemMoonstoneSword = new ItemMoonstoneSword();
        itemMoonstonePickaxe = new ItemMoonstonePickaxe();
        itemMoonstoneAxe = new ItemMoonstoneAxe();
        itemMoonstoneShovel = new ItemMoonstoneShovel();
        itemMoonstoneHoe = new ItemMoonstoneHoe();

        itemGreedyHand = new ItemGreedyHand();
        itemBloodyHand = new ItemBloodyHand();
        itemPointingHand = new ItemPointingHand();
        itemCrookedHand = new ItemCrookedHand();
        itemBrokenHand = new ItemBrokenHand();


        itemUrn = new ItemUrn();
        itemRawUrn = new ItemRawUrn();
        itemFilledUrn = new ItemFilledUrn();
        itemGoldRing = new ItemGoldRing();
        itemNocturnalEye = new ItemNocturnalEye();

        // Item registration
        initList.add(itemAsh);
        initList.add(itemBlackAsh);
        initList.add(itemCleanAsh);
        initList.add(itemAlchemistAsh);
        initList.add(itemQuickAsh);
        initList.add(itemVitalAsh);
        initList.add(itemAlchemistAsh);

        initList.add(itemLuminiteShard);
        initList.add(itemIlluminatedShard);

        initList.add(itemChain);
        initList.add(itemHardChain);

        initList.add(itemCursedBlood);
        initList.add(itemSolidBlood);
        initList.add(itemNeedyFinger);

        initList.add(itemMoonstone);
        initList.add(itemMoonstoneShard);
        initList.add(itemNorthstarShard);

        initList.add(itemPrism);
        initList.add(itemSoulPrism);
        initList.add(itemHardPrism);
        initList.add(itemRagingPrism);
        initList.add(itemIlluminatedPrism);
        initList.add(itemSaturatedSoulPrism);

        initList.add(itemAbomination);
        initList.add(itemBoundAbomination);
        initList.add(itemHungryAbomination);
        initList.add(itemBlindAbomination);
        initList.add(itemWeakAbomination);
        initList.add(itemColdAbomination);

        initList.add(itemMoonstoneSword);
        initList.add(itemMoonstonePickaxe);
        initList.add(itemMoonstoneAxe);
        initList.add(itemMoonstoneShovel);
        initList.add(itemMoonstoneHoe);

        initList.add(itemBloodyHand);
        initList.add(itemPointingHand);
        initList.add(itemGreedyHand);
        initList.add(itemCrookedHand);
        initList.add(itemBrokenHand);


        // NO OP items
        initList.add(itemUrn);
        initList.add(itemRawUrn);
        initList.add(itemFilledUrn);
        initList.add(itemGoldRing);
        initList.add(itemNocturnalEye);

        // Magical item registration
        magicItemList.add(itemGoldRing);
        magicItemList.add(itemLuminiteShard);
        magicItemList.add(itemIlluminatedShard);
        magicItemList.add(itemNeedyFinger);
        magicItemList.add(itemCursedBlood);
        magicItemList.add(itemSolidBlood);
        magicItemList.add(itemMoonstone);
        magicItemList.add(itemMoonstoneShard);
        magicItemList.add(itemVitalAsh);
        magicItemList.add(itemQuickAsh);
        magicItemList.add(itemCleanAsh);
        magicItemList.add(itemAsh);
        magicItemList.add(itemNorthstarShard);
        magicItemList.add(itemPrism);

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

    public static Item getRandomMagicItem() {
        if (magicItemList.size() == 0) {
            return null;
        }

        return magicItemList.get(ToverMod.RANDOM.nextInt(magicItemList.size() - 1));
    }

    private static void registerRender(Item item) {
        if (item.getRegistryName() == null) {
            return;
        }

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
