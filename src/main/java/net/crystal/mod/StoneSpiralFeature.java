package net.crystal.mod;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.gen.StructureAccessor;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.Heightmap;

import java.util.Random;

import com.google.common.base.Function;
import com.mojang.serialization.Dynamic;

public class StoneSpiralFeature extends Feature<DefaultFeatureConfig> {

    public StoneSpiralFeature(Function<Dynamic<?>, ? extends DefaultFeatureConfig> config) {
        //super(config);
        super(DefaultFeatureConfig.CODEC);
    }
     
    @Override
    public boolean generate(ServerWorldAccess world, StructureAccessor structureAccessor, ChunkGenerator chunkGenerator,
    Random random, BlockPos pos, DefaultFeatureConfig config) {
        BlockPos topPos = world.getTopPosition(Heightmap.Type.WORLD_SURFACE, pos);
        Direction offset = Direction.NORTH;
 
        for (int y = 1; y < 16; y++) {
            offset = offset.rotateYClockwise();
            world.setBlockState(topPos.up(y).offset(offset), Blocks.STONE.getDefaultState(), 3);
        }
 
        return true;
    }
}