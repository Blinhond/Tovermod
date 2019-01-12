package com.blinhond.tovermod.init;

import com.blinhond.tovermod.blocks.*;
import com.blinhond.tovermod.blocks.machines.BlockAlchemistFurnace;
import com.blinhond.tovermod.util.handlers.TileEntityHandler;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

public class ToverBlocks {
    private static List<Block> initList = new ArrayList<>();

    // Blocks
    public static BlockAshOre blockAshOre;
    public static BlockLuminiteOre blockLuminiteOre;
    public static BlockSolidAsh blockSolidAsh;
    public static BlockMoonstoneOre blockMoonstoneOre;
    public static BlockAlchemistFurnace blockAlchemistFurnace;
    public static BlockBlood blockBlood;
    public static BlockMoonstone blockMoonstone;

    public static void init() {
        // Block initialization
        blockAlchemistFurnace = new BlockAlchemistFurnace();
        blockAshOre = new BlockAshOre();
        blockLuminiteOre = new BlockLuminiteOre();
        blockSolidAsh = new BlockSolidAsh();
        blockMoonstoneOre = new BlockMoonstoneOre();
        blockMoonstone = new BlockMoonstone();
        blockBlood = new BlockBlood();

        // Block registration
        initList.add(blockAlchemistFurnace);
        initList.add(blockAshOre);
        initList.add(blockLuminiteOre);
        initList.add(blockMoonstoneOre);
        initList.add(blockSolidAsh);
        initList.add(blockMoonstone);
        initList.add(blockBlood);

        MinecraftForge.EVENT_BUS.register(new ToverBlocks());
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> registryEvent) {
        for (Block block : initList) {
            registryEvent.getRegistry().register(block);
        }

        TileEntityHandler.registerTileEntities();
    }

    @SubscribeEvent
    public void registerItemBlocks(RegistryEvent.Register<Item> registryEvent) {
        for (Block block : initList) {
            if (block.getRegistryName() == null) {
                continue;
            }

            registryEvent.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
    }

    public static void registerRenders() {
        for (Block block : initList) {
            registerRender(block);
        }
    }

    private static void registerRender(Block block) {
        if (block.getRegistryName() == null) {
            return;
        }

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
