package net.apowillow.cu.block.custom.levitatorblocks;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LevitatorBlock extends LevitatorBlockTemplate {
    public LevitatorBlock(AbstractBlock.Settings settings) { super(OxidationLevel.UNAFFECTED, settings);}
}
