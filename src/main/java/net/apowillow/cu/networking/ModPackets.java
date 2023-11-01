package net.apowillow.cu.networking;

import net.apowillow.cu.CUMod;
import net.apowillow.cu.networking.custom.BlockBreakParticlesS2CPacket;
import net.apowillow.cu.networking.custom.GreenParicleS2CPacket;
import net.apowillow.cu.networking.custom.RedstoneParticleSpawn;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.util.Identifier;

public class ModPackets {

    public static final Identifier GREEN_FLAME_PARTICLE_SPAWN = new Identifier(CUMod.MOD_ID, "green_flame_particle_spawn");
    public static final Identifier BLOCK_BREAK_PARTICLES_SPAWN = new Identifier(CUMod.MOD_ID, "block_break_particles_spawn");
    public static final Identifier REDSTONE_PARTICLE_SPAWN = new Identifier(CUMod.MOD_ID, "particle.redstone.spawn");

    public static void registerC2SPackets(){

    }

    public static void registerS2CPackets(){
        ClientPlayNetworking.registerGlobalReceiver(GREEN_FLAME_PARTICLE_SPAWN, GreenParicleS2CPacket::receive);
        ClientPlayNetworking.registerGlobalReceiver(BLOCK_BREAK_PARTICLES_SPAWN, BlockBreakParticlesS2CPacket::receive);
        ClientPlayNetworking.registerGlobalReceiver(REDSTONE_PARTICLE_SPAWN, RedstoneParticleSpawn::receive);
    }
}
