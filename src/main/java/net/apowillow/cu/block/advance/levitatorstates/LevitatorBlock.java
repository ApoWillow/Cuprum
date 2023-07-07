package net.apowillow.cu.block.advance.levitatorstates;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LevitatorBlock extends Block {

    public LevitatorBlock(AbstractBlock.Settings settings) { super(settings);}

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof LivingEntity livingEntity && world.isReceivingRedstonePower(pos)) {
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 100, 0));
        }

        super.onSteppedOn(world, pos, state, entity);
    }

}
