package net.apowillow.cu.item;

import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Util;
import org.jetbrains.annotations.Nullable;

public class CopperWrenchItem extends Item {
    //you can change item cooldown here
    public final int cooldownInTicks = 5;
    public CopperWrenchItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockState state = context.getWorld().getBlockState(context.getBlockPos());

        if (hasFacingProperty(state)) {
            if (!context.getWorld().isClient) {
                BlockState state2 = state;

                if (state.getProperties().contains(Properties.FACING)){
                    state2 = cycle(state, Properties.FACING, false);
                }else
                    if (state.getProperties().contains(Properties.HORIZONTAL_FACING)){
                    state2 = cycle(state, Properties.HORIZONTAL_FACING, false);
                }else
                    if (state.getProperties().contains(Properties.HOPPER_FACING)){
                    state2 = cycle(state, Properties.HOPPER_FACING, false);
                }else
                    if (state.getProperties().contains(Properties.AXIS)){
                    state2 = cycle(state, Properties.AXIS, false);
                }else
                    if (state.getProperties().contains(Properties.HORIZONTAL_AXIS)){
                    state2 = cycle(state, Properties.HORIZONTAL_AXIS, false);
                }


                try {
                    context.getPlayer().getItemCooldownManager().set(this, cooldownInTicks);
                } catch (NullPointerException ignored) {}

                context.getWorld().setBlockState(context.getBlockPos(), state2);
                context.getWorld().playSound(null, context.getBlockPos(), state.getSoundGroup().getPlaceSound(), SoundCategory.BLOCKS, 1.0f, 1.0f);
            }
            context.getWorld().addBlockBreakParticles(context.getBlockPos(), state);
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }


    private boolean hasFacingProperty(BlockState state) {
        return state.getProperties().contains(Properties.FACING) || state.getProperties().contains(Properties.HOPPER_FACING)
                || state.getProperties().contains(Properties.HORIZONTAL_FACING) || state.getProperties().contains(Properties.AXIS)
                || state.getProperties().contains(Properties.HORIZONTAL_AXIS);
    }

    private static <T extends Comparable<T>> BlockState cycle(BlockState state, Property<T> property, boolean inverse) {
        return state.with(property, CopperWrenchItem.cycle(property.getValues(), state.get(property), inverse));
    }

    private static <T> T cycle(Iterable<T> elements, @Nullable T current, boolean inverse) {
        return inverse ? Util.previous(elements, current) : Util.next(elements, current);
    }
}
