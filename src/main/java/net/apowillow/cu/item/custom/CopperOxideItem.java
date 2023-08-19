package net.apowillow.cu.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Optional;

public class CopperOxideItem extends Item {
    public CopperOxideItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        PlayerEntity player = context.getPlayer();
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        BlockState state = world.getBlockState(pos);

        Optional<BlockState> optional = Oxidizable.getIncreasedOxidationBlock(state.getBlock()).map((block) -> block.getStateWithProperties(state));
        if (optional.isPresent() && player != null && !player.isSneaking()) {
            if (player instanceof ServerPlayerEntity serverPlayer) {
                Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity) serverPlayer, pos, context.getStack());
            }
            world.playSound(player, pos, SoundEvents.ITEM_AXE_SCRAPE, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.syncWorldEvent(player, 3005, pos, 0);
            world.setBlockState(pos, optional.get(), 11);
            context.getStack().decrement(1);

            return ActionResult.SUCCESS;
        }
        return super.useOnBlock(context);
    }
}
