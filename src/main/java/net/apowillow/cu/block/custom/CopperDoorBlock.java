package net.apowillow.cu.block.custom;

import com.google.common.collect.ImmutableMap;
import net.apowillow.cu.CUMod;
import net.apowillow.cu.registry.FasterOxidation;
import net.apowillow.cu.util.oxidization.IOxidizable;
import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class CopperDoorBlock extends DoorBlock implements IOxidizable {
    private final Oxidizable.OxidationLevel oxidationLevel;

    public CopperDoorBlock(Oxidizable.OxidationLevel oxidationLevel, Settings settings, BlockSetType blockSetType) {
        super(settings, blockSetType);
        this.oxidationLevel = oxidationLevel;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!state.get(POWERED)) {
            return super.onUse(state, world, pos, player, hand, hit);
        }

        return ActionResult.PASS;
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        boolean bl = world.isReceivingRedstonePower(pos) || world.isReceivingRedstonePower(pos.offset(state.get(HALF) == DoubleBlockHalf.LOWER ? Direction.UP : Direction.DOWN)) || (bl = false);
        if (!this.getDefaultState().isOf(sourceBlock) && bl != state.get(POWERED)) {
            if (!state.get(POWERED)) {
                playOpenCloseSound(null, world, pos, false);
            } else {
                playOpenCloseSound(null, world, pos, true);
            }

            world.setBlockState(pos, (state.with(POWERED, bl)).with(OPEN, state.get(OPEN)), Block.NOTIFY_LISTENERS);
        }
    }

    public void playOpenCloseSound(@Nullable Entity entity, World world, BlockPos pos, boolean open) {
        world.playSound(entity, pos, open ? this.getBlockSetType().doorOpen() : this.getBlockSetType().doorClose(), SoundCategory.BLOCKS, 1.0f, world.getRandom().nextFloat() * 0.1f + 0.9f);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        /*if (state.get(HALF).equals(DoubleBlockHalf.LOWER)) {
            if (Oxidizable.getIncreasedOxidationBlock(world.getBlockState(pos.up()).getBlock()).equals(state.getBlock())) {
                CUMod.LOGGER.info("lower stayed");
                return;
            }
        }else {
            if (Oxidizable.getIncreasedOxidationBlock(world.getBlockState(pos.down()).getBlock()).equals(state.getBlock())) {
                CUMod.LOGGER.info("upper stayed");
                return;
            }
        }*/

        super.onBreak(world, pos, state, player);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!world.isClient()) {
            if ((Oxidizable.getIncreasedOxidationBlock(neighborState.getBlock()).isPresent()/* || Oxidizable.getDecreasedOxidationBlock(neighborState.getBlock()).isPresent()*/) && state.get(HALF).equals(DoubleBlockHalf.LOWER)) {
                if (Oxidizable.getIncreasedOxidationBlock(state.getBlock()).get().equals(state.getBlock())/* || Oxidizable.getDecreasedOxidationBlock(state.getBlock()).get().equals(state.getBlock())*/) {
                    CUMod.LOGGER.info("setted state");
                    return neighborState.with(HALF, DoubleBlockHalf.UPPER);
                }
            }

            if ((Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent()/* || Oxidizable.getDecreasedOxidationBlock(neighborState.getBlock()).isPresent()*/) && state.get(HALF).equals(DoubleBlockHalf.UPPER)) {
                if (Oxidizable.getIncreasedOxidationBlock(state.getBlock()).get().equals(neighborState.getBlock())/* || Oxidizable.getDecreasedOxidationBlock(state.getBlock()).get().equals(state.getBlock())*/) {
                    CUMod.LOGGER.info("setted state");
                    return neighborState.with(HALF, DoubleBlockHalf.LOWER);
                }
            }
        }


        /*        if (Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent() && Oxidizable.getDecreasedOxidationBlock(state.getBlock()).isPresent() && Oxidizable.getIncreasedOxidationBlock(state.getBlock()).get().equals(state.getBlock()) && Oxidizable.getDecreasedOxidationBlock(state.getBlock()).get().equals(state.getBlock())) {
            CUMod.LOGGER.info("setted state");
            return neighborState.with(HALF, state.get(HALF).equals(DoubleBlockHalf.LOWER) ? DoubleBlockHalf.LOWER : DoubleBlockHalf.UPPER);
        }*/
        CUMod.LOGGER.info(state.toString());
        CUMod.LOGGER.info(neighborState.toString());
        CUMod.LOGGER.info("update");

        /*DoubleBlockHalf doubleBlockHalf = state.get(HALF);
        if (direction.getAxis() == Direction.Axis.Y && doubleBlockHalf == DoubleBlockHalf.LOWER == (direction == Direction.UP)) {
            if (neighborState.isOf(this) && neighborState.get(HALF) != doubleBlockHalf) {
                return (((state.with(FACING, neighborState.get(FACING))).with(OPEN, neighborState.get(OPEN))).with(HINGE, neighborState.get(HINGE))).with(POWERED, neighborState.get(POWERED));
            }
            return Blocks.AIR.getDefaultState();
        }
        if (doubleBlockHalf == DoubleBlockHalf.LOWER && direction == Direction.DOWN && !state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        }*/
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (FasterOxidation.oxideBoolean(world, pos)) {
            if (state.get(HALF).equals(DoubleBlockHalf.LOWER)) {
                world.setBlockState(pos.up(), FasterOxidation.oxideState(this, state/*.with(HALF, DoubleBlockHalf.UPPER)*/));
            }
            return;
        }


        this.tickDegradation(state, world, pos, random);
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    @Override
    public OxidationLevel getDegradationLevel() {
        return this.oxidationLevel;
    }
}
