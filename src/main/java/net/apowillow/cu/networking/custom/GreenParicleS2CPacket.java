package net.apowillow.cu.networking.custom;

import net.apowillow.cu.particle.ModParticles;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.PacketByteBuf;

public class GreenParicleS2CPacket {
    /*basically you want to copy this code, replace some variables to spawn green flame particles
      but you have to specify who receives it (what client). You can send to every player on current world
      this.getWorld().getPlayers().forEach(player -> {<code bellow goes here>});

            if (!world.isClient) {
            PacketByteBuf buffer = PacketByteBufs.create();
            buffer.writeDouble(x);
            buffer.writeDouble(y);
            buffer.writeDouble(z);

            buffer.writeDouble(xVelocity);
            buffer.writeDouble(yVelocity);
            buffer.writeDouble(zVelocity);
            ServerPlayNetworking.send((ServerPlayerEntity) player, ModPackets.GREEN_FLAME_PARTICLE_SPAWN, buffer);
        }*/
    public static void receive(MinecraftClient client, ClientPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender){
        double x = buf.getDouble(0);
        double y = buf.getDouble(1);
        double z = buf.getDouble(2);

        double xVelocity = buf.getDouble(2);
        double yVelocity = buf.getDouble(2);
        double zVelocity = buf.getDouble(2);

        try {
            client.world.addParticle(ModParticles.GREEN_FLAME_PARTICLE, x ,y ,z, xVelocity, yVelocity, zVelocity);
        }catch (NullPointerException ignored){}
    }
}
