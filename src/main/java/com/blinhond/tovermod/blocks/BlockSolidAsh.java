package com.blinhond.tovermod.blocks;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockSolidAsh extends Block {
    public BlockSolidAsh() {
        super(Material.ROCK);
        setRegistryName(Reference.ToverModBlocks.SOLIDASHBLOCK.getRegistryName());
        setUnlocalizedName(Reference.ToverModBlocks.SOLIDASHBLOCK.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        setHarvestLevel("pickaxe", 1);
        setSoundType(SoundType.STONE);
        setHardness(3F);
    }
}
