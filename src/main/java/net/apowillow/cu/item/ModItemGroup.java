package net.apowillow.cu.item;


import net.apowillow.cu.CUMod;
import net.apowillow.cu.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
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

                        entries.add(ModItems.COPPER_ANCHOR);
                        entries.add(ModItems.COPPER_WRENCH);

                        entries.add(ModItems.COPPER_OXIDE);
                        entries.add(ModItems.COPPER_SULFATE);
                        entries.add(ModItems.SULFATE_TORCH);
                        entries.add(ModBlocks.SULFATE_CAMPFIRE);

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

                    }).build());

    public static void registerItemGroups() {
        CUMod.LOGGER.info("Registering ModItemGroups for " + CUMod.MOD_ID);
    }
}
