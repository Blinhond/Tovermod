package com.blinhond.tovermod;

import com.blinhond.tovermod.init.ToverBlocks;
import com.blinhond.tovermod.init.ToverItems;
import com.blinhond.tovermod.init.ToverSmelting;
import com.blinhond.tovermod.worldgen.OreGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class ToverMod
{
    public static final String MODID = "btm";
    public static final String NAME = "Tovermod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @Mod.Instance
    public static ToverMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        ToverItems.init();
        ToverBlocks.init();
        ToverSmelting.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        GameRegistry.registerWorldGenerator(new OreGenerator(), 0);
        ToverItems.registerRenders();
        ToverBlocks.registerRenders();
    }
}
