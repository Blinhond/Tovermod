package com.blinhond.tovermod.init;

import com.blinhond.tovermod.blocks.BlockAshOre;
import com.blinhond.tovermod.blocks.BlockLuminiteOre;
import com.blinhond.tovermod.blocks.BlockMoonstoneOre;
import com.blinhond.tovermod.blocks.BlockSolidAsh;
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

    public static void init() {
        // Block initialization
        blockAshOre = new BlockAshOre();
        blockLuminiteOre = new BlockLuminiteOre();
        blockSolidAsh = new BlockSolidAsh();
        blockMoonstoneOre = new BlockMoonstoneOre();
        blockAlchemistFurnace = new BlockAlchemistFurnace();

        // Block registration
        initList.add(blockAshOre);
        initList.add(blockLuminiteOre);
        initList.add(blockSolidAsh);
        initList.add(blockMoonstoneOre);
        initList.add(blockAlchemistFurnace);

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
