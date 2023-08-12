package net.apowillow.cu.networking.custom;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.math.BlockPos;

public class BlockBreakParticlesS2CPacket {
    public static void receive(MinecraftClient client, ClientPlayNetworkHandler handler, PacketByteBuf buf, PacketSender responseSender) {
        BlockPos pos = buf.readBlockPos();
        try {
            client.world.addBlockBreakParticles(pos, client.world.getBlockState(pos));
        }catch (NullPointerException ignored){}
    }
}
