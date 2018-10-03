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

public class BlockLuminiteOre extends Block {
    public BlockLuminiteOre() {
        super(Material.ROCK);
        setRegistryName(Reference.ToverModBlocks.LUMINITEOREBLOCK.getRegistryName());
        setUnlocalizedName(Reference.ToverModBlocks.LUMINITEOREBLOCK.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        setHarvestLevel("pickaxe", 1);
        setSoundType(SoundType.STONE);
        setHardness(3F);
        setLightLevel(5.0F);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ToverItems.itemLuminiteShard;
    }
}
