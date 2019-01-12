package com.blinhond.tovermod.blocks;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockMoonstone extends Block {
    public BlockMoonstone() {
        super(Material.IRON);
        setRegistryName(Reference.ToverModBlocks.MOONSTONEBLOCK.getRegistryName());
        setUnlocalizedName(Reference.ToverModBlocks.MOONSTONEBLOCK.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        setHarvestLevel("pickaxe", 2);
        setSoundType(SoundType.METAL);
        setHardness(3F);
    }
}
