package net.apowillow.cu.registry;

import net.apowillow.cu.CUMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;


public class ModSounds {


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(CUMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}
