package net.apowillow.cu.registry.copper_horn;

import net.apowillow.cu.CUMod;
import net.apowillow.cu.sound.CopperHornSoundEvents;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;

public interface CopperHornInstruments {
    RegistryKey<CopperHornInstrument> GREAT_COPPER_HORN = CopperHornInstruments.of("great_copper_horn");
    RegistryKey<CopperHornInstrument> OLD_COPPER_HORN = CopperHornInstruments.of("old_copper_horn");
    RegistryKey<CopperHornInstrument> PURE_COPPER_HORN = CopperHornInstruments.of("pure_copper_horn");
    RegistryKey<CopperHornInstrument> MUMBLE_COPPER_HORN = CopperHornInstruments.of("mumble_copper_horn");
    RegistryKey<CopperHornInstrument> DRY_COPPER_HORN = CopperHornInstruments.of("dry_copper_horn");
    RegistryKey<CopperHornInstrument> CLEAR_COPPER_HORN = CopperHornInstruments.of("clear_copper_horn");
    RegistryKey<CopperHornInstrument> FRESH_COPPER_HORN = CopperHornInstruments.of("fresh_copper_horn");
    RegistryKey<CopperHornInstrument> SECRET_COPPER_HORN = CopperHornInstruments.of("secret_copper_horn");
    RegistryKey<CopperHornInstrument> FEARLESS_COPPER_HORN = CopperHornInstruments.of("fearless_copper_horn");
    RegistryKey<CopperHornInstrument> SWEET_COPPER_HORN = CopperHornInstruments.of("sweet_copper_horn");
    private static RegistryKey<CopperHornInstrument> of(String id) {
        return RegistryKey.of(CopperHornRegistries.COPPER_HORN_INSTRUMENT_KEY, CUMod.id(id));
    }

    static void registerAndGetDefault(Registry<CopperHornInstrument> registry) {
        Registry.register(registry, GREAT_COPPER_HORN, new CopperHornInstrument(
                CopperHornSoundEvents.COPPER_HORN_BASS_SOUNDS.get(0),
                CopperHornSoundEvents.COPPER_HORN_HARMONY_SOUNDS.get(0),
                CopperHornSoundEvents.COPPER_HORN_MELODY_SOUNDS.get(0),
                140, 256.0f));
        Registry.register(registry, OLD_COPPER_HORN, new CopperHornInstrument(
                CopperHornSoundEvents.COPPER_HORN_BASS_SOUNDS.get(1),
                CopperHornSoundEvents.COPPER_HORN_HARMONY_SOUNDS.get(1),
                CopperHornSoundEvents.COPPER_HORN_MELODY_SOUNDS.get(1),
                140, 256.0f));
        Registry.register(registry, PURE_COPPER_HORN, new CopperHornInstrument(
                CopperHornSoundEvents.COPPER_HORN_BASS_SOUNDS.get(2),
                CopperHornSoundEvents.COPPER_HORN_HARMONY_SOUNDS.get(2),
                CopperHornSoundEvents.COPPER_HORN_MELODY_SOUNDS.get(2),
                140, 256.0f));
        Registry.register(registry, MUMBLE_COPPER_HORN, new CopperHornInstrument(
                CopperHornSoundEvents.COPPER_HORN_BASS_SOUNDS.get(3),
                CopperHornSoundEvents.COPPER_HORN_HARMONY_SOUNDS.get(3),
                CopperHornSoundEvents.COPPER_HORN_MELODY_SOUNDS.get(3),
                140, 256.0f));
        Registry.register(registry, DRY_COPPER_HORN, new CopperHornInstrument(
                CopperHornSoundEvents.COPPER_HORN_BASS_SOUNDS.get(4),
                CopperHornSoundEvents.COPPER_HORN_HARMONY_SOUNDS.get(4),
                CopperHornSoundEvents.COPPER_HORN_MELODY_SOUNDS.get(4),
                140, 256.0f));
        Registry.register(registry, CLEAR_COPPER_HORN, new CopperHornInstrument(
                CopperHornSoundEvents.COPPER_HORN_BASS_SOUNDS.get(5),
                CopperHornSoundEvents.COPPER_HORN_HARMONY_SOUNDS.get(5),
                CopperHornSoundEvents.COPPER_HORN_MELODY_SOUNDS.get(5),
                140, 256.0f));
        Registry.register(registry, FRESH_COPPER_HORN, new CopperHornInstrument(
                CopperHornSoundEvents.COPPER_HORN_BASS_SOUNDS.get(6),
                CopperHornSoundEvents.COPPER_HORN_HARMONY_SOUNDS.get(6),
                CopperHornSoundEvents.COPPER_HORN_MELODY_SOUNDS.get(6),
                140, 256.0f));
        Registry.register(registry, SECRET_COPPER_HORN, new CopperHornInstrument(
                CopperHornSoundEvents.COPPER_HORN_BASS_SOUNDS.get(7),
                CopperHornSoundEvents.COPPER_HORN_HARMONY_SOUNDS.get(7),
                CopperHornSoundEvents.COPPER_HORN_MELODY_SOUNDS.get(7),
                140, 256.0f));
        Registry.register(registry, FEARLESS_COPPER_HORN, new CopperHornInstrument(
                CopperHornSoundEvents.COPPER_HORN_BASS_SOUNDS.get(8),
                CopperHornSoundEvents.COPPER_HORN_HARMONY_SOUNDS.get(8),
                CopperHornSoundEvents.COPPER_HORN_MELODY_SOUNDS.get(8),
                140, 256.0f));
        Registry.register(registry, SWEET_COPPER_HORN, new CopperHornInstrument(
                CopperHornSoundEvents.COPPER_HORN_BASS_SOUNDS.get(9),
                CopperHornSoundEvents.COPPER_HORN_HARMONY_SOUNDS.get(9),
                CopperHornSoundEvents.COPPER_HORN_MELODY_SOUNDS.get(9),
                140, 256.0f));
    }
}
