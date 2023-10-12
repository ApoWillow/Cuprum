package net.apowillow.cu.registry;

import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public class FasterOxidation {
    public static BlockState oxideState(Oxidizable oxidizable, BlockState state) {
        var result = oxidizable.getDegradationResult(state);
        return result.orElse(state);
    }

    public static boolean oxideBoolean(BlockView world, BlockPos pos) {
        boolean bl = false;
        BlockPos.Mutable mutable = pos.mutableCopy();
        Direction[] var4 = Direction.values();

        for (Direction direction : var4) {
            BlockState blockState = world.getBlockState(mutable);
            if (direction != Direction.DOWN || oxideBooleanTag(blockState)) {
                mutable.set(pos, direction);
                blockState = world.getBlockState(mutable);
                if (oxideBooleanTag(blockState) && !blockState.isSideSolidFullSquare(world, pos, direction.getOpposite())) {
                    bl = true;
                    break;
                }
            }
        }
        return bl;
    }

    public static boolean oxideBooleanTag(BlockState state) {
        return state.getFluidState().isIn(FluidTags.WATER);
    }
}
