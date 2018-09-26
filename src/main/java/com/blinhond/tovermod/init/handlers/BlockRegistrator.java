package com.blinhond.tovermod.init.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockRegistrator {
    private Block[] blocks;

    public BlockRegistrator() {
        blocks = new Block[]{
                // Add blocks here

        };
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> registryEvent) {
        registryEvent.getRegistry().registerAll(blocks);
    }

    @SubscribeEvent
    public void registerItemBlocks(RegistryEvent.Register<Item> registryEvent) {
        for (Block block : blocks) {
            if (block.getRegistryName() == null) {
                continue;
            }

            registryEvent.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
    }
}
