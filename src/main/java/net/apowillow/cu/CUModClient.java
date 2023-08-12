package net.apowillow.cu;

import net.apowillow.cu.registry.ModBlocks;
import net.apowillow.cu.registry.ModParticles;
import net.apowillow.cu.particle.GreenFlameParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.RenderLayer;

public class CUModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_SCAFFHOLDING, RenderLayer.getCutout());


        ParticleFactoryRegistry.getInstance().register(ModParticles.GREEN_FLAME_PARTICLE, GreenFlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.GREEN_FLAME_PARTICLE, GreenFlameParticle.SmallFactory::new);
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SULFATE_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SULFATE_WALL_TORCH, RenderLayer.getCutout());
    }
}
