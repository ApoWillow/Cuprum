package net.apowillow.cu.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.CampfireBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.CampfireBlockEntity;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CopperSulfateCampfireBlock extends CampfireBlock {
    public CopperSulfateCampfireBlock(boolean emitsParticles, int fireDamage, Settings settings) {
        super(emitsParticles, fireDamage, settings);
    }

    public static void spawnSmokeParticle(World world, BlockPos pos, boolean isSignal, boolean lotsOfSmoke) {
        Random random = world.getRandom();
        DefaultParticleType defaultParticleType = isSignal ? ParticleTypes.CAMPFIRE_SIGNAL_SMOKE : ParticleTypes.CAMPFIRE_COSY_SMOKE;
        world.addImportantParticle(defaultParticleType, true, (double)pos.getX() + 0.5 + random.nextDouble() / 3.0 * (double)(random.nextBoolean() ? 1 : -1), (double)pos.getY() + random.nextDouble() + random.nextDouble(), (double)pos.getZ() + 0.5 + random.nextDouble() / 3.0 * (double)(random.nextBoolean() ? 1 : -1), 0.0, 0.07, 0.0);
        if (lotsOfSmoke) {
            world.addParticle(ParticleTypes.SMOKE, (double)pos.getX() + 0.5 + random.nextDouble() / 4.0 * (double)(random.nextBoolean() ? 1 : -1), (double)pos.getY() + 0.4, (double)pos.getZ() + 0.5 + random.nextDouble() / 4.0 * (double)(random.nextBoolean() ? 1 : -1), 0.0, 0.005, 0.0);
        }
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (!state.get(LIT).booleanValue()) {
            return;
        }
        if (random.nextInt(10) == 0) {
            world.playSound((double) pos.getX() + 0.5, (double) pos.getY() + 0.5, (double) pos.getZ() + 0.5, SoundEvents.BLOCK_CAMPFIRE_CRACKLE, SoundCategory.BLOCKS, 0.5f + random.nextFloat(), random.nextFloat() * 0.7f + 0.6f, false);
        }
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CampfireBlockEntity(pos, state);
    }

    @Override
    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        if (world.isClient) {
            if (state.get(LIT)) {
                return CampfireBlock.checkType(type, BlockEntityType.CAMPFIRE, CampfireBlockEntity::clientTick);
            }
        } else {
            if (state.get(LIT)) {
                return CampfireBlock.checkType(type, BlockEntityType.CAMPFIRE, CampfireBlockEntity::litServerTick);
            }
            return CampfireBlock.checkType(type, BlockEntityType.CAMPFIRE, CampfireBlockEntity::unlitServerTick);
        }
        return null;
    }
}
