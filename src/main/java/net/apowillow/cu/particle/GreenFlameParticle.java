package net.apowillow.cu.particle;


import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import org.jetbrains.annotations.Nullable;

public class GreenFlameParticle extends SpriteBillboardParticle {
    protected GreenFlameParticle(ClientWorld level, double xCoord, double yCoord, double zCoord,
                                 double xd, double yd, double zd) {
        super(level, xCoord, yCoord, zCoord, xd, yd, zd);

        this.velocityMultiplier = 0F;
        this.x = xd;
        this.y = yd;
        this.z = zd;
        //this.scale *= 0.75F;
        this.maxAge = 20;
        //this.setSpriteForAge(spriteSet);

        this.red = 1f;
        this.green = 1f;
        this.blue = 1f;
    }



    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_OPAQUE;
    }

    @Environment(value=EnvType.CLIENT)
    public static class SmallFactory
            implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public SmallFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Nullable
        @Override
        public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            GreenFlameParticle greenFlameParticle = new GreenFlameParticle(world, x, y, z, velocityX, velocityY, velocityZ);
            greenFlameParticle.setSprite(this.spriteProvider);
            greenFlameParticle.scale(0.5f);
            return greenFlameParticle;
        }
    }
    
    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteSet) {
            this.spriteProvider = spriteProvider;
        }


        @Nullable
        @Override
        public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            GreenFlameParticle greenFlameParticle = new GreenFlameParticle(world, x, y, z, velocityX, velocityY, velocityZ);
            greenFlameParticle.setSprite(this.spriteProvider);
            return greenFlameParticle;
        }
    }
}