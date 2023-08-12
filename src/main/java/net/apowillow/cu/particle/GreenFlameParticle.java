package net.apowillow.cu.particle;


import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.Nullable;

public class GreenFlameParticle extends AbstractSlowingParticle {
    protected GreenFlameParticle(ClientWorld level, double xCoord, double yCoord, double zCoord,
                                 double xd, double yd, double zd) {
        super(level, xCoord, yCoord, zCoord, xd, yd, zd);

        this.velocityMultiplier = 0F;
        this.x = xd;
        this.y = yd;
        this.z = zd;
        //this.scale *= 0.75F;
        //this.maxAge = 20;
        //this.setSpriteForAge(spriteSet);

        this.red = 1f;
        this.green = 1f;
        this.blue = 1f;
    }



    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_OPAQUE;
    }

    @Override
    public void move(double xd, double yd, double zd) {
        this.setBoundingBox(this.getBoundingBox().offset(xd, yd, zd));
        this.repositionFromBoundingBox();
    }

    @Override
    public float getSize(float tickDelta) {
        float f = ((float)this.age + tickDelta) / (float)this.maxAge;
        return this.scale * (1.0f - f * f * 0.5f);
    }

    @Override
    public int getBrightness(float tint) {
        float f = ((float)this.age + tint) / (float)this.maxAge;
        f = MathHelper.clamp(f, 0.0f, 1.0f);
        int i = super.getBrightness(tint);
        int j = i & 0xFF;
        int k = i >> 16 & 0xFF;
        if ((j += (int)(f * 15.0f * 16.0f)) > 240) {
            j = 240;
        }
        return j | k << 16;
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
        public Particle createParticle(DefaultParticleType parameters, ClientWorld clientWorld, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            GreenFlameParticle greenFlameParticle = new GreenFlameParticle(clientWorld, x, y, z, velocityX, velocityY, velocityZ);
            greenFlameParticle.setSprite(this.spriteProvider);
            greenFlameParticle.scale(0.5f);
            return greenFlameParticle;
        }
    }
    
    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
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