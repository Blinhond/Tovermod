package com.blinhond.tovermod.blocks;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBlood extends Block {
    public BlockBlood() {
        super(Material.ROCK);
        setRegistryName(Reference.ToverModBlocks.BLOODBLOCK.getRegistryName());
        setUnlocalizedName(Reference.ToverModBlocks.BLOODBLOCK.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        setSoundType(SoundType.SLIME);
    }
}
