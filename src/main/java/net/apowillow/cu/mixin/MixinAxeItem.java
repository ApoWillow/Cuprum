package net.apowillow.cu.mixin;

import net.apowillow.cu.registry.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Optional;

@Mixin(AxeItem.class)
public class MixinAxeItem {
    @Inject(method = "useOnBlock", at = @At(value = "FIELD", target = "Lnet/minecraft/sound/SoundEvents;ITEM_AXE_SCRAPE:Lnet/minecraft/sound/SoundEvent;"), locals = LocalCapture.CAPTURE_FAILSOFT)
    private void spawnCopperPatina(CallbackInfoReturnable<ActionResult> callbackInfoReturnable, World world, BlockPos blockPos, PlayerEntity playerEntity, BlockState blockState, Optional optional, Optional optional2, Optional optional3, ItemStack itemStack, Optional optional4) {
        ItemStack stack = new ItemStack(ModItems.COPPER_OXIDE);
        ItemEntity itemEntity = new ItemEntity(world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), stack);
    }
}