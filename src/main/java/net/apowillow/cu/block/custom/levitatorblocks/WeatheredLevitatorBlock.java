package net.apowillow.cu.block.custom.levitatorblocks;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WeatheredLevitatorBlock extends LevitatorBlock {
    public WeatheredLevitatorBlock(OxidationLevel oxidationLevel, Settings settings) {
        super(oxidationLevel, settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof LivingEntity livingEntity && world.isReceivingRedstonePower(pos)) {
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 250, 1));
            entity.playSound(SoundEvents.ENTITY_SHULKER_BULLET_HIT, 1.0f, 1.0f);
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
