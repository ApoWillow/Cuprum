package net.apowillow.cu.registry.copper_horn;

import net.minecraft.sound.SoundEvent;

public record CopperHornInstrument(SoundEvent bassSoundEvent, SoundEvent harmonySoundEvent, SoundEvent melodySoundEvent, int useDuration, float range) { }
