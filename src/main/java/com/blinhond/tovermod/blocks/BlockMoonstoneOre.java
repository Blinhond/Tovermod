package com.blinhond.tovermod.blocks;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import com.blinhond.tovermod.init.ToverItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockMoonstoneOre extends Block {
    public BlockMoonstoneOre() {
        super(Material.ROCK);
        setRegistryName(Reference.ToverModBlocks.MOONSTONEOREBLOCK.getRegistryName());
        setUnlocalizedName(Reference.ToverModBlocks.MOONSTONEOREBLOCK.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        setHarvestLevel("pickaxe", 2);
        setSoundType(SoundType.STONE);
        setHardness(1.7F);
        setLightLevel(5.0F);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ToverItems.itemMoonstone;
    }
}
