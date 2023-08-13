package net.apowillow.cu.item.custom;

import net.apowillow.cu.networking.ModPackets;
import net.apowillow.cu.util.ModTags;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Util;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class CopperWrenchItem extends Item {
    //you can change item cooldown here
    public final int cooldownInTicks = 5;

    public CopperWrenchItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockState state = context.getWorld().getBlockState(context.getBlockPos());

        if (!state.isIn(ModTags.COPPER_WRENCH_IGNORED) && hasFacingProperty(state)) {
            if (!context.getWorld().isClient) {
                BlockState state2 = state;

                if (state.getProperties().contains(Properties.FACING)) {
                    state2 = cycle(state, Properties.FACING, false);
                } else if (state.getProperties().contains(Properties.HORIZONTAL_FACING)) {
                    state2 = cycle(state, Properties.HORIZONTAL_FACING, false);
                } else if (state.getProperties().contains(Properties.HOPPER_FACING)) {
                    state2 = cycle(state, Properties.HOPPER_FACING, false);
                } else if (state.getProperties().contains(Properties.AXIS)) {
                    state2 = cycle(state, Properties.AXIS, false);
                } else if (state.getProperties().contains(Properties.HORIZONTAL_AXIS)) {
                    state2 = cycle(state, Properties.HORIZONTAL_AXIS, false);
                }


                Objects.requireNonNull(context.getPlayer()).getItemCooldownManager().set(this, cooldownInTicks);
                context.getStack().damage(1, context.getPlayer(), p -> p.sendToolBreakStatus(context.getHand()));

                context.getWorld().setBlockState(context.getBlockPos(), state2);
                context.getWorld().playSound(null, context.getBlockPos(), state.getSoundGroup().getPlaceSound(), SoundCategory.BLOCKS, 1.0f, 1.0f);

                context.getWorld().getPlayers().forEach(player -> {

                    PacketByteBuf buffer = PacketByteBufs.create();
                    buffer.writeBlockPos(context.getBlockPos());
                    ServerPlayNetworking.send((ServerPlayerEntity) Objects.requireNonNull(context.getPlayer()), ModPackets.BLOCK_BREAK_PARTICLES_SPAWN, buffer);

                });
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }


    public static boolean hasFacingProperty(BlockState state) {
        return state.getProperties().contains(Properties.FACING) || state.getProperties().contains(Properties.HOPPER_FACING)
                || state.getProperties().contains(Properties.HORIZONTAL_FACING) || state.getProperties().contains(Properties.AXIS)
                || state.getProperties().contains(Properties.HORIZONTAL_AXIS);
    }

    public static <T extends Comparable<T>> BlockState cycle(BlockState state, Property<T> property, boolean inverse) {
        return state.with(property, CopperWrenchItem.cycle(property.getValues(), state.get(property), inverse));
    }

    public static <T> T cycle(Iterable<T> elements, @Nullable T current, boolean inverse) {
        return inverse ? Util.previous(elements, current) : Util.next(elements, current);
    }
}
