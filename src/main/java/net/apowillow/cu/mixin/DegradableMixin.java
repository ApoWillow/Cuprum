package net.apowillow.cu.mixin;


import net.minecraft.block.BlockState;
import net.minecraft.block.Degradable;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Optional;

@Mixin(Degradable.class)
public abstract class DegradableMixin {

    @Shadow public abstract Optional<BlockState> getDegradationResult(BlockState var1);

    @Inject(method = "tryDegrade", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/Degradable;getDegradationResult(Lnet/minecraft/block/BlockState;)Ljava/util/Optional;", shift = At.Shift.BEFORE), locals = LocalCapture.CAPTURE_FAILSOFT)
    private void inject(BlockState state, ServerWorld world, BlockPos pos, Random random, CallbackInfo ci){
        if (state.getBlock() instanceof DoorBlock) {
            if (state.get(Properties.DOUBLE_BLOCK_HALF) != null) {
                if (state.get(Properties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.LOWER) {
                    getDegradationResult(state).ifPresent(statex -> world.setBlockState(pos.up(), statex));
                }else {
                    getDegradationResult(state).ifPresent(statex -> world.setBlockState(pos.down(), statex));
                }
            }
        }
    }
}
