package net.apowillow.cu.util.oxidization;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Degradable;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

import java.util.Iterator;

public interface IOxidizable extends Oxidizable {
    @Override
    default void tryDegrade(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockPos blockPos;
        int i = (this.getDegradationLevel()).ordinal();
        int j = 0;
        int k = 0;
        Iterator<BlockPos> iterator = BlockPos.iterateOutwards(pos, 4, 4, 4).iterator();
        while (iterator.hasNext() && (blockPos = iterator.next()).getManhattanDistance(pos) <= 4) {
            Block block;
            if (blockPos.equals(pos) || !((block = world.getBlockState(blockPos).getBlock()) instanceof Degradable)) continue;
            Enum<OxidationLevel> enum_ = ((Degradable)(block)).getDegradationLevel();
            if (this.getDegradationLevel().getClass() != enum_.getClass()) continue;
            int m = (enum_).ordinal();
            if (m < i) {
                return;
            }
            if (m > i) {
                ++k;
                continue;
            }
            ++j;
        }
        float f = (float)(k + 1) / (float)(k + j + 1);
        float g = f * f * this.getDegradationChanceMultiplier();
        if (random.nextFloat() < g) {
            this.getDegradationResult(state).ifPresent(statex -> world.setBlockState(pos, statex));
        }
    }
}
