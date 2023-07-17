package net.apowillow.cu.mixin;

import net.apowillow.cu.FasterOxidation;
import net.minecraft.util.math.random.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.OxidizableBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(OxidizableBlock.class)
public abstract class MixinOxidizableBlock extends Block implements Oxidizable {
    public MixinOxidizableBlock(Settings settings) {
        super(settings);
    }

    @Inject(method = "randomTick", at = @At("HEAD"), cancellable = true)
    public void injected(BlockState state, ServerWorld world, BlockPos pos, Random random, CallbackInfo ci) {
        if (FasterOxidation.oxideBoolean(world, pos)){
            world.setBlockState(pos, FasterOxidation.oxideState(this, state));
            ci.cancel();
        }
    }
}
