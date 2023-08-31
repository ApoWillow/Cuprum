package net.apowillow.cu;

import net.apowillow.cu.block.ModBlocks;
import net.apowillow.cu.item.ModItemGroup;
import net.apowillow.cu.item.ModItems;
import net.apowillow.cu.item.custom.CopperHornItem;
import net.apowillow.cu.networking.ModPackets;
import net.apowillow.cu.particle.ModParticles;
import net.apowillow.cu.registry.copper_horn.CopperHornInstrumentTags;
import net.apowillow.cu.registry.copper_horn.CopperHornInstruments;
import net.apowillow.cu.registry.copper_horn.CopperHornRegistries;
import net.apowillow.cu.util.ModModelPredicateProvider;
import net.apowillow.cu.util.ModRegistries;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CUMod implements ModInitializer {
    public static final String MOD_ID = "cu";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final Item COPPER_HORN = new CopperHornItem(new Item.Settings().maxCount(1), CopperHornInstrumentTags.COPPER_HORNS);


    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModItemGroup.registerItemGroups();

        ModPackets.registerC2SPackets();
        ModPackets.registerS2CPackets();

        ModParticles.registerParticles();

        ModBlocks.registerModBlocks();

        ModModelPredicateProvider.registerModules();

        // Adds the ability to oxidize and wax the smooth copper and all it's variants
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.SMOOTH_COPPER, ModBlocks.EXPOSED_SMOOTH_COPPER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_SMOOTH_COPPER, ModBlocks.WEATHERED_SMOOTH_COPPER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_SMOOTH_COPPER, ModBlocks.OXIDIZED_SMOOTH_COPPER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.SMOOTH_COPPER, ModBlocks.WAXED_SMOOTH_COPPER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_SMOOTH_COPPER, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_SMOOTH_COPPER, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_SMOOTH_COPPER, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.SMOOTH_COPPER_SLAB, ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB, ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB, ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.SMOOTH_COPPER_SLAB, ModBlocks.WAXED_SMOOTH_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_SLAB);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.SMOOTH_COPPER_STAIRS, ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS, ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS, ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_SMOOTH_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS);


        // Adds the ability to oxidize and wax the edgy copper and all it's variants
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EDGY_COPPER, ModBlocks.EXPOSED_EDGY_COPPER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_EDGY_COPPER, ModBlocks.WEATHERED_EDGY_COPPER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_EDGY_COPPER, ModBlocks.OXIDIZED_EDGY_COPPER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EDGY_COPPER, ModBlocks.WAXED_EDGY_COPPER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_EDGY_COPPER, ModBlocks.WAXED_EXPOSED_EDGY_COPPER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_EDGY_COPPER, ModBlocks.WAXED_WEATHERED_EDGY_COPPER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_EDGY_COPPER, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EDGY_COPPER_SLAB, ModBlocks.EXPOSED_EDGY_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_EDGY_COPPER_SLAB, ModBlocks.WEATHERED_EDGY_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_EDGY_COPPER_SLAB, ModBlocks.OXIDIZED_EDGY_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EDGY_COPPER_SLAB, ModBlocks.WAXED_EDGY_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_EDGY_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_EDGY_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_EDGY_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_SLAB);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EDGY_COPPER_STAIRS, ModBlocks.EXPOSED_EDGY_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_EDGY_COPPER_STAIRS, ModBlocks.WEATHERED_EDGY_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_EDGY_COPPER_STAIRS, ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EDGY_COPPER_STAIRS, ModBlocks.WAXED_EDGY_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_STAIRS);

        // Adds the ability to oxidize and wax the vertical cut copper and all it's variants
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.VERTICAL_CUT_COPPER, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_VERTICAL_CUT_COPPER, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_VERTICAL_CUT_COPPER, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.VERTICAL_CUT_COPPER, ModBlocks.WAXED_VERTICAL_CUT_COPPER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_VERTICAL_CUT_COPPER, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_VERTICAL_CUT_COPPER, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.VERTICAL_CUT_COPPER_SLAB, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_VERTICAL_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.VERTICAL_CUT_COPPER_STAIRS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_STAIRS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_STAIRS);

        // Adds the ability to oxidize the wax the chiseled block and all it's variants
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CHISELED_COPPER, ModBlocks.EXPOSED_CHISELED_COPPER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_CHISELED_COPPER, ModBlocks.WEATHERED_CHISELED_COPPER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_CHISELED_COPPER, ModBlocks.OXIDIZED_CHISELED_COPPER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CHISELED_COPPER, ModBlocks.WAXED_CHISELED_COPPER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_CHISELED_COPPER, ModBlocks.WAXED_EXPOSED_CHISELED_COPPER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_CHISELED_COPPER, ModBlocks.WAXED_WEATHERED_CHISELED_COPPER);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.OXIDIZED_CHISELED_COPPER, ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER);

        // Adds the ability to oxidize and wax the levitator block and all it's variants
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.LEVITATOR_BLOCK, ModBlocks.EXPOSED_LEVITATOR_BLOCK);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_LEVITATOR_BLOCK, ModBlocks.WEATHERED_LEVITATOR_BLOCK);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_LEVITATOR_BLOCK, ModBlocks.OXIDIZED_LEVITATOR_BLOCK);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.LEVITATOR_BLOCK, ModBlocks.WAXED_LEVITATOR_BLOCK);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_LEVITATOR_BLOCK, ModBlocks.WAXED_EXPOSED_LEVITATOR_BLOCK);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_LEVITATOR_BLOCK, ModBlocks.WAXED_WEATHERED_LEVITATOR_BLOCK);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_LEVITATOR_BLOCK, ModBlocks.WAXED_OXIDIZED_LEVITATOR_BLOCK);

        // Adds the ability to oxidize and wax the copper lamp and all it's variants
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_LAMP, ModBlocks.EXPOSED_COPPER_LAMP);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_LAMP, ModBlocks.WEATHERED_COPPER_LAMP);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_LAMP, ModBlocks.OXIDIZED_COPPER_LAMP);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_LAMP, ModBlocks.WAXED_COPPER_LAMP);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_LAMP, ModBlocks.WAXED_EXPOSED_COPPER_LAMP);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_LAMP, ModBlocks.WAXED_WEATHERED_COPPER_LAMP);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_LAMP, ModBlocks.WAXED_OXIDIZED_COPPER_LAMP);

        // Adds the ability to oxidize and wax the lined copper lamp and all it's variants
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.LINED_COPPER_LAMP, ModBlocks.EXPOSED_LINED_COPPER_LAMP);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_LINED_COPPER_LAMP, ModBlocks.WEATHERED_LINED_COPPER_LAMP);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_LINED_COPPER_LAMP, ModBlocks.OXIDIZED_LINED_COPPER_LAMP);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.LINED_COPPER_LAMP, ModBlocks.WAXED_LINED_COPPER_LAMP);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_LINED_COPPER_LAMP, ModBlocks.WAXED_EXPOSED_LINED_COPPER_LAMP);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_LINED_COPPER_LAMP, ModBlocks.WAXED_WEATHERED_LINED_COPPER_LAMP);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_LINED_COPPER_LAMP, ModBlocks.WAXED_OXIDIZED_LINED_COPPER_LAMP);

        ModRegistries.registerModStuffs();

        CopperHornInstruments.registerAndGetDefault(CopperHornRegistries.COPPER_HORN_INSTRUMENT);
        Registry.register(Registries.ITEM, id("copper_horn"), COPPER_HORN);
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}
