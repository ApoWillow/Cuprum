package net.apowillow.cu.particle;

import net.apowillow.cu.CUMod;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final DefaultParticleType GREEN_FLAME_PARTICLE = FabricParticleTypes.simple(false);

    public static void registerParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(CUMod.MOD_ID, "green_flame_particle"), GREEN_FLAME_PARTICLE);
    }
}
