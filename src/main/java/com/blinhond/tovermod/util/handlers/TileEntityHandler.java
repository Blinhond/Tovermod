package com.blinhond.tovermod.util.handlers;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.blocks.tileentities.TileEntityAlchemistFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
    public static void registerTileEntities() {
        GameRegistry.registerTileEntity(TileEntityAlchemistFurnace.class, new ResourceLocation(Reference.MOD_ID + ":alchemistfurnaceblock"));
    }
}
