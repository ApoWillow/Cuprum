package net.apowillow.cu.util;

import net.apowillow.cu.CUMod;
import net.apowillow.cu.item.ModItems;
import net.apowillow.cu.networking.ModPackets;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.BlockState;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.FallibleItemDispenserBehavior;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import static net.apowillow.cu.item.custom.CopperWrenchItem.cycle;
import static net.apowillow.cu.item.custom.CopperWrenchItem.hasFacingProperty;

public class ModRegistries {
   public static void registerModStuffs(){
       registerDispenserBehavior();
   }

   private static void registerDispenserBehavior(){
       DispenserBlock.registerBehavior(ModItems.COPPER_WRENCH, new FallibleItemDispenserBehavior(){
           @Override
           protected ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {

               Direction direction = pointer.getBlockState().get(DispenserBlock.FACING);
               BlockPos blockPos = pointer.getPos().offset(direction);
               BlockState state = pointer.getWorld().getBlockState(blockPos);

               if (hasFacingProperty(state)) {
                   this.setSuccess(true);
                   BlockState state2 = state;

                   if (state.getProperties().contains(Properties.FACING)) {
                       state2 = cycle(state, Properties.FACING, false);
                   } else if (state.getProperties().contains(Properties.HORIZONTAL_FACING)) {
                       state2 = cycle(state, Properties.HORIZONTAL_FACING, false);
                   } else if (state.getProperties().contains(Properties.HOPPER_FACING)) {
                       state2 = cycle(state, Properties.HOPPER_FACING, false);
                   } else if (state.getProperties().contains(Properties.AXIS)) {
                       state2 = cycle(state, Properties.AXIS, false);
                   } else if (state.getProperties().contains(Properties.HORIZONTAL_AXIS)) {
                       state2 = cycle(state, Properties.HORIZONTAL_AXIS, false);
                   }

                   pointer.getWorld().setBlockState(blockPos, state2);
                   pointer.getWorld().playSound(null, blockPos, state.getSoundGroup().getPlaceSound(), SoundCategory.BLOCKS, 1.0f, 1.0f);

                   pointer.getWorld().getPlayers().forEach(serverPlayerEntity -> {
                       PacketByteBuf buffer = PacketByteBufs.create();
                       buffer.writeBlockPos(blockPos);
                       ServerPlayNetworking.send(serverPlayerEntity, ModPackets.BLOCK_BREAK_PARTICLES_SPAWN, buffer);
                   });

               }else {
                   this.setSuccess(false);
               }

               if (this.isSuccess() && stack.damage(1, pointer.getWorld().random, null)) {
                   stack.setCount(0);
               }
               return stack;
           }
       });
   }
}
