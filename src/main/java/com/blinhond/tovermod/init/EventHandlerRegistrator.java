package com.blinhond.tovermod.init;

import com.blinhond.tovermod.init.handlers.BlockRegistrator;
import net.minecraftforge.common.MinecraftForge;

public class EventHandlerRegistrator {
    public static void register() {
        MinecraftForge.EVENT_BUS.register(new BlockRegistrator());
    }
}
