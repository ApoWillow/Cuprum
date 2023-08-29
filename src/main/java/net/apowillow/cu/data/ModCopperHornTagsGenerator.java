package net.apowillow.cu.data;

import net.apowillow.cu.registry.copper_horn.CopperHornInstrument;
import net.apowillow.cu.registry.copper_horn.CopperHornInstrumentTags;
import net.apowillow.cu.registry.copper_horn.CopperHornInstruments;
import net.apowillow.cu.registry.copper_horn.CopperHornRegistries;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModCopperHornTagsGenerator extends FabricTagProvider<CopperHornInstrument> {

    public ModCopperHornTagsGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, CopperHornRegistries.COPPER_HORN_INSTRUMENT_KEY, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        this.getOrCreateTagBuilder(CopperHornInstrumentTags.COPPER_HORNS)
                .addTag(CopperHornInstrumentTags.REGULAR_COPPER_HORNS)
                .addTag(CopperHornInstrumentTags.SCREAMING_COPPER_HORNS);
        this.getOrCreateTagBuilder(CopperHornInstrumentTags.REGULAR_COPPER_HORNS)
                .add(CopperHornInstruments.GREAT_COPPER_HORN)
                .add(CopperHornInstruments.OLD_COPPER_HORN)
                .add(CopperHornInstruments.PURE_COPPER_HORN)
                .add(CopperHornInstruments.DRY_COPPER_HORN)
                .add(CopperHornInstruments.MUMBLE_COPPER_HORN)
                .add(CopperHornInstruments.CLEAR_COPPER_HORN);
        this.getOrCreateTagBuilder(CopperHornInstrumentTags.SCREAMING_COPPER_HORNS)
                .add(CopperHornInstruments.SWEET_COPPER_HORN)
                .add(CopperHornInstruments.FEARLESS_COPPER_HORN)
                .add(CopperHornInstruments.SECRET_COPPER_HORN)
                .add(CopperHornInstruments.FRESH_COPPER_HORN);
    }
}
