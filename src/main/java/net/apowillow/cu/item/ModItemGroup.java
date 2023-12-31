package net.apowillow.cu.item;


import net.apowillow.cu.CUMod;
import net.apowillow.cu.block.ModBlocks;
import net.apowillow.cu.item.custom.CopperHornItem;
import net.apowillow.cu.registry.copper_horn.CopperHornInstrument;
import net.apowillow.cu.registry.copper_horn.CopperHornInstrumentTags;
import net.apowillow.cu.registry.copper_horn.CopperHornRegistries;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroup {
    public static ItemGroup CU_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(CUMod.MOD_ID, "cu"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cu"))
                    .icon(() -> new ItemStack(ModBlocks.EDGY_COPPER)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ROSE_GOLD_INGOT);
                        entries.add(ModItems.ROSE_GOLD_SWORD);
                        entries.add(ModItems.ROSE_GOLD_AXE);
                        entries.add(ModItems.ROSE_GOLD_PICKAXE);
                        entries.add(ModItems.ROSE_GOLD_SHOVEL);
                        entries.add(ModItems.ROSE_GOLD_HOE);

                        entries.add(ModItems.ROSE_GOLD_HELMET);
                        entries.add(ModItems.ROSE_GOLD_CHESTPLATE);
                        entries.add(ModItems.ROSE_GOLD_LEGGINGS);
                        entries.add(ModItems.ROSE_GOLD_BOOTS);

                        entries.add(ModItems.COPPER_WRENCH);

                        entries.add(ModItems.SULFATE_TORCH);
                        //entries.add(ModBlocks.SULFATE_CAMPFIRE);
                        entries.add(ModBlocks.SULFATE_LANTERN);

                        entries.add(ModBlocks.SMOOTH_COPPER);
                        entries.add(ModBlocks.EXPOSED_SMOOTH_COPPER);
                        entries.add(ModBlocks.WEATHERED_SMOOTH_COPPER);
                        entries.add(ModBlocks.OXIDIZED_SMOOTH_COPPER);
                        entries.add(ModBlocks.WAXED_SMOOTH_COPPER);
                        entries.add(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER);
                        entries.add(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER);
                        entries.add(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER);

                        entries.add(ModBlocks.SMOOTH_COPPER_SLAB);
                        entries.add(ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB);
                        entries.add(ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB);
                        entries.add(ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB);
                        entries.add(ModBlocks.WAXED_SMOOTH_COPPER_SLAB);
                        entries.add(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_SLAB);
                        entries.add(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_SLAB);
                        entries.add(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_SLAB);

                        entries.add(ModBlocks.SMOOTH_COPPER_STAIRS);
                        entries.add(ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS);
                        entries.add(ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS);
                        entries.add(ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS);
                        entries.add(ModBlocks.WAXED_SMOOTH_COPPER_STAIRS);
                        entries.add(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_STAIRS);
                        entries.add(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_STAIRS);
                        entries.add(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS);

                        entries.add(ModBlocks.EDGY_COPPER);
                        entries.add(ModBlocks.EXPOSED_EDGY_COPPER);
                        entries.add(ModBlocks.WEATHERED_EDGY_COPPER);
                        entries.add(ModBlocks.OXIDIZED_EDGY_COPPER);
                        entries.add(ModBlocks.WAXED_EDGY_COPPER);
                        entries.add(ModBlocks.WAXED_EXPOSED_EDGY_COPPER);
                        entries.add(ModBlocks.WAXED_WEATHERED_EDGY_COPPER);
                        entries.add(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER);

                        entries.add(ModBlocks.EDGY_COPPER_SLAB);
                        entries.add(ModBlocks.EXPOSED_EDGY_COPPER_SLAB);
                        entries.add(ModBlocks.WEATHERED_EDGY_COPPER_SLAB);
                        entries.add(ModBlocks.OXIDIZED_EDGY_COPPER_SLAB);
                        entries.add(ModBlocks.WAXED_EDGY_COPPER_SLAB);
                        entries.add(ModBlocks.WAXED_EXPOSED_EDGY_COPPER_SLAB);
                        entries.add(ModBlocks.WAXED_WEATHERED_EDGY_COPPER_SLAB);
                        entries.add(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_SLAB);

                        entries.add(ModBlocks.EDGY_COPPER_STAIRS);
                        entries.add(ModBlocks.EXPOSED_EDGY_COPPER_STAIRS);
                        entries.add(ModBlocks.WEATHERED_EDGY_COPPER_STAIRS);
                        entries.add(ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS);
                        entries.add(ModBlocks.WAXED_EDGY_COPPER_STAIRS);
                        entries.add(ModBlocks.WAXED_EXPOSED_EDGY_COPPER_STAIRS);
                        entries.add(ModBlocks.WAXED_WEATHERED_EDGY_COPPER_STAIRS);
                        entries.add(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_STAIRS);

                        entries.add(ModBlocks.VERTICAL_CUT_COPPER);
                        entries.add(ModBlocks.EXPOSED_VERTICAL_CUT_COPPER);
                        entries.add(ModBlocks.WEATHERED_VERTICAL_CUT_COPPER);
                        entries.add(ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER);
                        entries.add(ModBlocks.WAXED_VERTICAL_CUT_COPPER);
                        entries.add(ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER);
                        entries.add(ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER);
                        entries.add(ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER);

                        entries.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB);
                        entries.add(ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_SLAB);
                        entries.add(ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_SLAB);
                        entries.add(ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_SLAB);
                        entries.add(ModBlocks.WAXED_VERTICAL_CUT_COPPER_SLAB);
                        entries.add(ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB);
                        entries.add(ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB);
                        entries.add(ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB);

                        entries.add(ModBlocks.VERTICAL_CUT_COPPER_STAIRS);
                        entries.add(ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_STAIRS);
                        entries.add(ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_STAIRS);
                        entries.add(ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_STAIRS);
                        entries.add(ModBlocks.WAXED_VERTICAL_CUT_COPPER_STAIRS);
                        entries.add(ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_STAIRS);
                        entries.add(ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_STAIRS);
                        entries.add(ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_STAIRS);

                        entries.add(ModBlocks.CHISELED_COPPER);
                        entries.add(ModBlocks.EXPOSED_CHISELED_COPPER);
                        entries.add(ModBlocks.WEATHERED_CHISELED_COPPER);
                        entries.add(ModBlocks.OXIDIZED_CHISELED_COPPER);
                        entries.add(ModBlocks.WAXED_CHISELED_COPPER);
                        entries.add(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER);
                        entries.add(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER);
                        entries.add(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER);

                        entries.add(ModBlocks.COPPER_LAMP);
                        entries.add(ModBlocks.EXPOSED_COPPER_LAMP);
                        entries.add(ModBlocks.WEATHERED_COPPER_LAMP);
                        entries.add(ModBlocks.OXIDIZED_COPPER_LAMP);
                        entries.add(ModBlocks.WAXED_COPPER_LAMP);
                        entries.add(ModBlocks.WAXED_EXPOSED_COPPER_LAMP);
                        entries.add(ModBlocks.WAXED_WEATHERED_COPPER_LAMP);
                        entries.add(ModBlocks.WAXED_OXIDIZED_COPPER_LAMP);

                        entries.add(ModBlocks.LINED_COPPER_LAMP);
                        entries.add(ModBlocks.EXPOSED_LINED_COPPER_LAMP);
                        entries.add(ModBlocks.WEATHERED_LINED_COPPER_LAMP);
                        entries.add(ModBlocks.OXIDIZED_LINED_COPPER_LAMP);
                        entries.add(ModBlocks.WAXED_LINED_COPPER_LAMP);
                        entries.add(ModBlocks.WAXED_EXPOSED_LINED_COPPER_LAMP);
                        entries.add(ModBlocks.WAXED_WEATHERED_LINED_COPPER_LAMP);
                        entries.add(ModBlocks.WAXED_OXIDIZED_LINED_COPPER_LAMP);

                        entries.add(ModBlocks.LEVITATOR_BLOCK);
                        entries.add(ModBlocks.EXPOSED_LEVITATOR_BLOCK);
                        entries.add(ModBlocks.WEATHERED_LEVITATOR_BLOCK);
                        entries.add(ModBlocks.OXIDIZED_LEVITATOR_BLOCK);
                        entries.add(ModBlocks.WAXED_LEVITATOR_BLOCK);
                        entries.add(ModBlocks.WAXED_EXPOSED_LEVITATOR_BLOCK);
                        entries.add(ModBlocks.WAXED_WEATHERED_LEVITATOR_BLOCK);
                        entries.add(ModBlocks.WAXED_OXIDIZED_LEVITATOR_BLOCK);

                        entries.add(ModBlocks.COPPER_CHAIN);
                        entries.add(ModBlocks.EXPOSED_COPPER_CHAIN);
                        entries.add(ModBlocks.WEATHERED_COPPER_CHAIN);
                        entries.add(ModBlocks.OXIDIZED_COPPER_CHAIN);
                        entries.add(ModBlocks.WAXED_COPPER_CHAIN);
                        entries.add(ModBlocks.WAXED_EXPOSED_COPPER_CHAIN);
                        entries.add(ModBlocks.WAXED_WEATHERED_COPPER_CHAIN);
                        entries.add(ModBlocks.WAXED_OXIDIZED_COPPER_CHAIN);

                        entries.add(ModBlocks.BLOCK_OF_COPPER_OXIDE);
                        entries.add(ModItems.COPPER_OXIDE);
                        entries.add(ModBlocks.BLOCK_OF_COPPER_SULFATE);
                        entries.add(ModItems.COPPER_SULFATE);


                        entries.add(ModBlocks.COPPER_DOOR);
                        entries.add(ModBlocks.EXPOSED_COPPER_DOOR);
                        entries.add(ModBlocks.WEATHERED_COPPER_DOOR);
                        entries.add(ModBlocks.OXIDIZED_COPPER_DOOR);
                        entries.add(ModBlocks.WAXED_COPPER_DOOR);
                        entries.add(ModBlocks.WAXED_EXPOSED_COPPER_DOOR);
                        entries.add(ModBlocks.WAXED_WEATHERED_COPPER_DOOR);
                        entries.add(ModBlocks.WAXED_OXIDIZED_COPPER_DOOR);


                        entries.add(ModBlocks.COPPER_TRAPDOOR);
                        entries.add(ModBlocks.EXPOSED_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.WEATHERED_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.OXIDIZED_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.WAXED_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR);
                        entries.add(ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR);

                        for (RegistryEntry<CopperHornInstrument> registryEntry : CopperHornRegistries.COPPER_HORN_INSTRUMENT.iterateEntries(CopperHornInstrumentTags.COPPER_HORNS)) {
                            entries.add(CopperHornItem.getStackForInstrument(CUMod.COPPER_HORN, registryEntry));
                        }

                    }).build());

    public static void registerItemGroups() {
        CUMod.LOGGER.info("Registering ModItemGroups for " + CUMod.MOD_ID);
    }
}
