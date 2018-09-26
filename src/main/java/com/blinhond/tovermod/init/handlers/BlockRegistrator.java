package com.blinhond.tovermod.init.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

public class BlockRegistrator {
    private List<Block> blocks;

    public BlockRegistrator() {
        blocks = new ArrayList<>();

        // Add blocks to register here
    }

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> registryEvent) {
        registryEvent.getRegistry().registerAll((Block[]) blocks.toArray());
    }

    @SubscribeEvent
    public void registerItemBlocks(RegistryEvent.Register<Item> registryEvent) {
        for (Block block : blocks) {
            registryEvent.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
    }
}
