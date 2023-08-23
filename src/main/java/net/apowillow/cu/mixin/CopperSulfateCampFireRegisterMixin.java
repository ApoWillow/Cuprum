package net.apowillow.cu.mixin;

import com.mojang.datafixers.types.Type;
import net.apowillow.cu.CUMod;
import net.apowillow.cu.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CampfireBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.CampfireBlockEntity;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Arrays;

@Mixin(BlockEntityType.class)
public abstract class CopperSulfateCampFireRegisterMixin {

    /*@Inject(method = "create",at = @At("HEAD"))
    private static <T extends BlockEntity> void inject(BlockEntityType.BlockEntityFactory<? extends T> factory, Block[] blocks, CallbackInfoReturnable<BlockEntityType.Builder<T>> cir){
        CUMod.LOGGER.info("injected");
        if (Arrays.stream(blocks).toList().contains(Blocks.CAMPFIRE)){
            CUMod.LOGGER.info("campfire");
            Arrays.stream(blocks).toList().add(blocks.length - 1, ModBlocks.SULFATE_CAMPFIRE);
        }
    }*/

    /*@ModifyVariable(at = @At("INVOKE"), ordinal = 1)
    private BlockEntityType<CampfireBlockEntity> injected() {
        return create("campfire", BlockEntityType.Builder.create(CampfireBlockEntity::new, Blocks.CAMPFIRE, Blocks.SOUL_CAMPFIRE));
    }*/
}
