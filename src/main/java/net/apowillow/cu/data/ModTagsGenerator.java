package net.apowillow.cu.data;

import net.apowillow.cu.block.ModBlocks;
import net.apowillow.cu.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class ModTagsGenerator extends FabricTagProvider.BlockTagProvider {
    public ModTagsGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        addBlocksToCopperWrenchIgnored();
        addBlocks(BlockTags.PICKAXE_MINEABLE);
        addBlocks(BlockTags.NEEDS_STONE_TOOL);
    }

    private void addBlocks(TagKey<Block> tagKey){
        getOrCreateTagBuilder(tagKey)
                // Smooth Copper
                .add(ModBlocks.SMOOTH_COPPER)
                .add(ModBlocks.EXPOSED_SMOOTH_COPPER)
                .add(ModBlocks.WEATHERED_SMOOTH_COPPER)
                .add(ModBlocks.OXIDIZED_SMOOTH_COPPER)
                .add(ModBlocks.WAXED_SMOOTH_COPPER)
                .add(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER)
                .add(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER)
                .add(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER)
                // Smooth Copper Stairs
                .add(ModBlocks.SMOOTH_COPPER_STAIRS)
                .add(ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS)
                .add(ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS)
                .add(ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS)
                .add(ModBlocks.WAXED_SMOOTH_COPPER_STAIRS)
                .add(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_STAIRS)
                .add(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_STAIRS)
                .add(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS)
                // Smooth Copper Slab
                .add(ModBlocks.SMOOTH_COPPER_SLAB)
                .add(ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB)
                .add(ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB)
                .add(ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB)
                .add(ModBlocks.WAXED_SMOOTH_COPPER_SLAB)
                .add(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_SLAB)
                .add(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_SLAB)
                .add(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_SLAB)
                // Edgy Copper
                .add(ModBlocks.EDGY_COPPER)
                .add(ModBlocks.EXPOSED_EDGY_COPPER)
                .add(ModBlocks.WEATHERED_EDGY_COPPER)
                .add(ModBlocks.OXIDIZED_EDGY_COPPER)
                .add(ModBlocks.WAXED_EDGY_COPPER)
                .add(ModBlocks.WAXED_EXPOSED_EDGY_COPPER)
                .add(ModBlocks.WAXED_WEATHERED_EDGY_COPPER)
                .add(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER)
                // Edgy Copper Stairs
                .add(ModBlocks.EDGY_COPPER_STAIRS)
                .add(ModBlocks.EXPOSED_EDGY_COPPER_STAIRS)
                .add(ModBlocks.WEATHERED_EDGY_COPPER_STAIRS)
                .add(ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS)
                .add(ModBlocks.WAXED_EDGY_COPPER_STAIRS)
                .add(ModBlocks.WAXED_EXPOSED_EDGY_COPPER_STAIRS)
                .add(ModBlocks.WAXED_WEATHERED_EDGY_COPPER_STAIRS)
                .add(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_STAIRS)
                // Edgy Copper Slab
                .add(ModBlocks.EDGY_COPPER_SLAB)
                .add(ModBlocks.EXPOSED_EDGY_COPPER_SLAB)
                .add(ModBlocks.WEATHERED_EDGY_COPPER_SLAB)
                .add(ModBlocks.OXIDIZED_EDGY_COPPER_SLAB)
                .add(ModBlocks.WAXED_EDGY_COPPER_SLAB)
                .add(ModBlocks.WAXED_EXPOSED_EDGY_COPPER_SLAB)
                .add(ModBlocks.WAXED_WEATHERED_EDGY_COPPER_SLAB)
                .add(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_SLAB)
                // Copper Lamp
                .add(ModBlocks.COPPER_LAMP)
                .add(ModBlocks.EXPOSED_COPPER_LAMP)
                .add(ModBlocks.WEATHERED_COPPER_LAMP)
                .add(ModBlocks.OXIDIZED_COPPER_LAMP)
                .add(ModBlocks.WAXED_COPPER_LAMP)
                .add(ModBlocks.WAXED_EXPOSED_COPPER_LAMP)
                .add(ModBlocks.WAXED_WEATHERED_COPPER_LAMP)
                .add(ModBlocks.WAXED_OXIDIZED_COPPER_LAMP)
                // Lined Copper Lamp
                .add(ModBlocks.LINED_COPPER_LAMP)
                .add(ModBlocks.EXPOSED_LINED_COPPER_LAMP)
                .add(ModBlocks.WEATHERED_LINED_COPPER_LAMP)
                .add(ModBlocks.OXIDIZED_LINED_COPPER_LAMP)
                .add(ModBlocks.WAXED_LINED_COPPER_LAMP)
                .add(ModBlocks.WAXED_EXPOSED_LINED_COPPER_LAMP)
                .add(ModBlocks.WAXED_WEATHERED_LINED_COPPER_LAMP)
                .add(ModBlocks.WAXED_OXIDIZED_LINED_COPPER_LAMP)
                // Levitator Block
                .add(ModBlocks.LEVITATOR_BLOCK)
                .add(ModBlocks.EXPOSED_LEVITATOR_BLOCK)
                .add(ModBlocks.WEATHERED_LEVITATOR_BLOCK)
                .add(ModBlocks.OXIDIZED_LEVITATOR_BLOCK)
                .add(ModBlocks.WAXED_LEVITATOR_BLOCK)
                .add(ModBlocks.WAXED_EXPOSED_LEVITATOR_BLOCK)
                .add(ModBlocks.WAXED_WEATHERED_LEVITATOR_BLOCK)
                .add(ModBlocks.WAXED_OXIDIZED_LEVITATOR_BLOCK);
    }

    private void addBlocksToCopperWrenchIgnored(){
        getOrCreateTagBuilder(ModTags.COPPER_WRENCH_IGNORED)
                .add(Blocks.WHITE_BED)
                .add(Blocks.LIGHT_GRAY_BED)
                .add(Blocks.GRAY_BED)
                .add(Blocks.BROWN_BED)
                .add(Blocks.RED_BED)
                .add(Blocks.ORANGE_BED)
                .add(Blocks.YELLOW_BED)
                .add(Blocks.LIME_BED)
                .add(Blocks.GREEN_BED)
                .add(Blocks.CYAN_BED)
                .add(Blocks.LIGHT_BLUE_BED)
                .add(Blocks.BLUE_BED)
                .add(Blocks.PURPLE_BED)
                .add(Blocks.MAGENTA_BED)
                .add(Blocks.PINK_BED)
                .add(Blocks.PISTON_HEAD)
                .add(Blocks.END_PORTAL_FRAME)
                .add(Blocks.NETHER_PORTAL)
                .add(Blocks.BUBBLE_COLUMN)
                .add(Blocks.COCOA)
                .add(Blocks.GLOW_LICHEN)
                .add(Blocks.LEVER)
                .add(Blocks.BAMBOO_BUTTON)
                .add(Blocks.BIRCH_BUTTON)
                .add(Blocks.ACACIA_BUTTON)
                .add(Blocks.CHERRY_BUTTON)
                .add(Blocks.CRIMSON_BUTTON)
                .add(Blocks.DARK_OAK_BUTTON)
                .add(Blocks.JUNGLE_BUTTON)
                .add(Blocks.MANGROVE_BUTTON)
                .add(Blocks.OAK_BUTTON)
                .add(Blocks.POLISHED_BLACKSTONE_BUTTON)
                .add(Blocks.SPRUCE_BUTTON)
                .add(Blocks.STONE_BUTTON)
                .add(Blocks.WARPED_BUTTON)
                .add(Blocks.TRIPWIRE_HOOK)
                .add(Blocks.BIG_DRIPLEAF)
                .add(Blocks.BIG_DRIPLEAF_STEM);
    }
}
