package net.apowillow.cu.block.custom.levitatorblocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.OxidizableBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WeatheredLevitatorBlock extends OxidizableBlock {
    public WeatheredLevitatorBlock(Settings settings) {
        super(OxidationLevel.WEATHERED, settings);
    }


    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof LivingEntity livingEntity && world.isReceivingRedstonePower(pos)) {
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 200, 1));
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
