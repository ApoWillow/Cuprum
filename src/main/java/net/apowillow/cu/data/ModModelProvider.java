package net.apowillow.cu.data;

import net.apowillow.cu.block.ModBlocks;
import net.apowillow.cu.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Adds the models for smooth copper and all it's variants including the waxed version.
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EXPOSED_SMOOTH_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WEATHERED_SMOOTH_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OXIDIZED_SMOOTH_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_SMOOTH_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER);

        //Adds all the models for variants of edgy copper including it's waxed version.
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EDGY_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EXPOSED_EDGY_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WEATHERED_EDGY_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OXIDIZED_EDGY_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EDGY_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EXPOSED_EDGY_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_WEATHERED_EDGY_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER);

        //Adds all the models for Levitator block variants including the waxed version
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LEVITATOR_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EXPOSED_LEVITATOR_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WEATHERED_LEVITATOR_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OXIDIZED_LEVITATOR_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_LEVITATOR_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EXPOSED_LEVITATOR_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_WEATHERED_LEVITATOR_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_OXIDIZED_LEVITATOR_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        //Adds the copper coin model
        itemModelGenerator.register(ModItems.COPPER_COIN, Models.GENERATED);
    }
}
