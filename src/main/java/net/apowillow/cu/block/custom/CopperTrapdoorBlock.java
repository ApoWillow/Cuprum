package net.apowillow.cu.block.custom;

import net.apowillow.cu.networking.ModPackets;
import net.apowillow.cu.registry.FasterOxidation;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class CopperTrapdoorBlock extends TrapdoorBlock implements Oxidizable {
    private final Oxidizable.OxidationLevel oxidationLevel;

    public CopperTrapdoorBlock(Oxidizable.OxidationLevel oxidationLevel, Settings settings, BlockSetType blockSetType) {
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
        if (world.isClient) {
            return;
        }

        boolean bl = world.isReceivingRedstonePower(pos);
        if (bl != state.get(POWERED)) {
            spawnParticles(world, pos);
            playToggleSound(null, world, pos, state.get(POWERED));
            world.setBlockState(pos, state.with(POWERED, bl), Block.NOTIFY_LISTENERS);
            if (state.get(WATERLOGGED)) {
                world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
            }
        }
    }

    private void spawnParticles(World world, BlockPos pos) {
        world.getPlayers().forEach(player -> {
            if (world.isPlayerInRange(pos.getX(), pos.getY(), pos.getZ(), 128)) {
                PacketByteBuf buffer = PacketByteBufs.create();
                buffer.writeBlockPos(pos);
                ServerPlayNetworking.send((ServerPlayerEntity) player, ModPackets.REDSTONE_PARTICLE_SPAWN, buffer);
            }
        });
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (FasterOxidation.oxideBoolean(world, pos)){
            world.setBlockState(pos, FasterOxidation.oxideState(this, state));
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
