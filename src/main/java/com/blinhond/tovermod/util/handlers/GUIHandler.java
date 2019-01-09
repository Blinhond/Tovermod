package com.blinhond.tovermod.util.handlers;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.blocks.containers.ContainerAlchemyFurnace;
import com.blinhond.tovermod.blocks.guis.GuiAlchemistFurnace;
import com.blinhond.tovermod.blocks.tileentities.TileEntityAlchemistFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class GUIHandler implements IGuiHandler {
    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == Reference.GUI_ALCHEMIST_FURNACE) {
            return new ContainerAlchemyFurnace(player.inventory, (TileEntityAlchemistFurnace) world.getTileEntity(new BlockPos(x, y, z)));
        }

        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == Reference.GUI_ALCHEMIST_FURNACE) {
            return new GuiAlchemistFurnace(player.inventory, (TileEntityAlchemistFurnace) world.getTileEntity(new BlockPos(x, y, z)));
        }

        return null;
    }
}
