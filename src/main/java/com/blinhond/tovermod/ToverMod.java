package com.blinhond.tovermod;

import com.blinhond.tovermod.init.EventHandlerRegistrator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ToverMod.MODID, name = ToverMod.NAME, version = ToverMod.VERSION)
public class ToverMod
{
    public static final String MODID = "btm";
    public static final String NAME = "Tovermod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();

        EventHandlerRegistrator.register();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // NO OP
    }
}
