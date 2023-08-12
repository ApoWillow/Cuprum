package net.apowillow.cu;

import net.apowillow.cu.registry.ModBlocks;
import net.apowillow.cu.registry.ModItemGroup;
import net.apowillow.cu.registry.ModItems;
import net.apowillow.cu.registry.ModParticles;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CUMod implements ModInitializer {
	public static final String MOD_ID = "cu";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroup.registerItemGroups();

		ModParticles.registerParticles();

		ModBlocks.registerModBlocks();

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


	}
}