package net.apowillow.cu.block.custom.levitatorblocks;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LevitatorBlock extends OxidizableBlock {

    public LevitatorBlock(AbstractBlock.Settings settings) { super(OxidationLevel.UNAFFECTED, settings);}

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof LivingEntity livingEntity && world.isReceivingRedstonePower(pos)) {
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 100, 1));
        }
        entity.playSound(SoundEvents.ENTITY_SHULKER_BULLET_HIT, 1.0f, 1.0f);

        super.onSteppedOn(world, pos, state, entity);
    }

}
