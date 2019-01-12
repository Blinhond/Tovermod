package com.blinhond.tovermod.worldgen;

import com.blinhond.tovermod.init.ToverBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class OreGenerator implements IWorldGenerator {
    private WorldGenerator ashOreGenerator;
    private WorldGenerator luminiteOreGenerator;
    private WorldGenerator moonstoneOreGenerator;

    public OreGenerator() {
        ashOreGenerator = new WorldGenMinable(ToverBlocks.blockAshOre.getDefaultState(), 10);
        luminiteOreGenerator = new WorldGenMinable(ToverBlocks.blockLuminiteOre.getDefaultState(), 8);
        moonstoneOreGenerator = new WorldGenMinable(ToverBlocks.blockMoonstoneOre.getDefaultState(), 3);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
                         IChunkProvider chunkProvider) {
        runGenerator(ashOreGenerator, world, random, chunkX, chunkZ, 25, 0, 64);
        runGenerator(luminiteOreGenerator, world, random, chunkX, chunkZ, 15, 0, 64);
        runGenerator(moonstoneOreGenerator, world, random, chunkX, chunkZ, 20, 0, 64);
    }

    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chancesToSpawn; i++) {
            int x = chunk_X * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunk_Z * 16 + rand.nextInt(16);
            generator.generate(world, rand, new BlockPos(x, y, z));
        }
    }
}
