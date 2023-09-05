package net.apowillow.cu.registry.copper_horn;

import net.apowillow.cu.CUMod;
import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.minecraft.registry.DefaultedRegistry;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;

public class CopperHornRegistries {
    public static final RegistryKey<Registry<CopperHornInstrument>> COPPER_HORN_INSTRUMENT_KEY = RegistryKey.ofRegistry(CUMod.id("copper_horn_instrument"));
    public static final DefaultedRegistry<CopperHornInstrument> COPPER_HORN_INSTRUMENT = FabricRegistryBuilder.createDefaulted(CopperHornInstrument.class, COPPER_HORN_INSTRUMENT_KEY.getValue(), CUMod.id("great_copper_horn")).buildAndRegister();
}
