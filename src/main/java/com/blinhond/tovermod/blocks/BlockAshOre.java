package com.blinhond.tovermod.blocks;

import com.blinhond.tovermod.Reference;
import com.blinhond.tovermod.init.ToverCreative;
import com.blinhond.tovermod.init.ToverItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class BlockAshOre extends Block {

    public BlockAshOre() {
        super(Material.ROCK);
        setRegistryName(Reference.ToverModBlocks.ASHOREBLOCK.getRegistryName());
        setUnlocalizedName(Reference.ToverModBlocks.ASHOREBLOCK.getUnlocalizedName());
        setCreativeTab(ToverCreative.TOVERMOD);
        setHarvestLevel("pickaxe", 1);
        setSoundType(SoundType.STONE);
        setHardness(3F);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        super.getDrops(drops, world, pos, state, fortune);

        drops.add(new ItemStack(ToverItems.itemAsh, 2));
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        if (rand.nextInt(100) > 5) {
            return null;
        }

        return ToverItems.itemGoldRing;
    }
}
