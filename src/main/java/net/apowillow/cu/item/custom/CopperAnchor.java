package net.apowillow.cu.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CopperAnchor extends SwordItem {
    public CopperAnchor(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
        return super.canMine(state, world, pos, miner);
    }

    @Override
    public float getAttackDamage() {
        return 0.0f;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return true;
    }
}