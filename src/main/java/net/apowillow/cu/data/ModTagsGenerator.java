package net.apowillow.cu.data;

import net.apowillow.cu.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
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
        addsPickaxeBlocks(BlockTags.PICKAXE_MINEABLE);
        addsPickaxeBlocks(BlockTags.NEEDS_STONE_TOOL);
        addsAxeBlocks(BlockTags.AXE_MINEABLE);
    }
    private FabricTagProvider<Block>.FabricTagBuilder addsAxeBlocks(TagKey<Block> tagKey) {
        return getOrCreateTagBuilder(tagKey);
                //.add(ModBlocks.SULFATE_CAMPFIRE);
    }

    private FabricTagProvider<Block>.FabricTagBuilder addsPickaxeBlocks(TagKey<Block> tagKey){
        return getOrCreateTagBuilder(tagKey)
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
                // Vertical Cut Copper
                .add(ModBlocks.VERTICAL_CUT_COPPER)
                .add(ModBlocks.EXPOSED_VERTICAL_CUT_COPPER)
                .add(ModBlocks.WEATHERED_VERTICAL_CUT_COPPER)
                .add(ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER)
                .add(ModBlocks.WAXED_VERTICAL_CUT_COPPER)
                .add(ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER)
                .add(ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER)
                .add(ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER)
                // Vertical Cut Copper Stairs
                .add(ModBlocks.VERTICAL_CUT_COPPER_STAIRS)
                .add(ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_STAIRS)
                .add(ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_STAIRS)
                .add(ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_STAIRS)
                .add(ModBlocks.WAXED_VERTICAL_CUT_COPPER_STAIRS)
                .add(ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_STAIRS)
                .add(ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_STAIRS)
                .add(ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_STAIRS)
                // Vertical Cut Copper Slab
                .add(ModBlocks.VERTICAL_CUT_COPPER_SLAB)
                .add(ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_SLAB)
                .add(ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_SLAB)
                .add(ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_SLAB)
                .add(ModBlocks.WAXED_VERTICAL_CUT_COPPER_SLAB)
                .add(ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB)
                .add(ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB)
                .add(ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB)
                // Chiseled Copper
                .add(ModBlocks.CHISELED_COPPER)
                .add(ModBlocks.EXPOSED_CHISELED_COPPER)
                .add(ModBlocks.WEATHERED_CHISELED_COPPER)
                .add(ModBlocks.OXIDIZED_CHISELED_COPPER)
                .add(ModBlocks.WAXED_CHISELED_COPPER)
                .add(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER)
                .add(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER)
                .add(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER)
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
                .add(ModBlocks.WAXED_OXIDIZED_LEVITATOR_BLOCK)
                // Compressed Blocks
                .add(ModBlocks.BLOCK_OF_COPPER_OXIDE)
                .add(ModBlocks.BLOCK_OF_COPPER_SULFATE)
                // Sulfate Related Blocks
                .add(ModBlocks.SULFATE_LANTERN);
    }
}
