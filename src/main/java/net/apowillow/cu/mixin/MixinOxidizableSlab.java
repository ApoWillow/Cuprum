package net.apowillow.cu.mixin;

import net.apowillow.cu.registry.FasterOxidation;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(OxidizableSlabBlock.class)
public abstract class MixinOxidizableSlab extends SlabBlock implements Oxidizable {
    public MixinOxidizableSlab(Settings settings) {
        super(settings);
    }

    @Inject(method = "randomTick", at = @At("HEAD"), cancellable = true)
    public void injected(BlockState state, ServerWorld world, BlockPos pos, Random random, CallbackInfo ci) {
        if (FasterOxidation.oxideBoolean(world, pos)||isWaterLogged(state)){
            world.setBlockState(pos, FasterOxidation.oxideState(this, state));
            ci.cancel();
        }
    }

    private static boolean isWaterLogged(BlockState blockState) {
        return blockState.get(WATERLOGGED);
    }
}
