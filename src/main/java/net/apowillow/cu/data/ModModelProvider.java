package net.apowillow.cu.data;

import net.apowillow.cu.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Adds the models for smooth copper and all it's variants including the waxed, stair and slab versions.
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EXPOSED_SMOOTH_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WEATHERED_SMOOTH_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OXIDIZED_SMOOTH_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_SMOOTH_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_COPPER_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_SMOOTH_COPPER_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_SLAB);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_COPPER_STAIRS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_SMOOTH_COPPER_STAIRS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_STAIRS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_STAIRS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS);

        //Adds all the models for variants of edgy copper including it's waxed, stair and slab versions.
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EDGY_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EXPOSED_EDGY_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WEATHERED_EDGY_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OXIDIZED_EDGY_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EDGY_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EXPOSED_EDGY_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_WEATHERED_EDGY_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EDGY_COPPER_STAIRS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EXPOSED_EDGY_COPPER_STAIRS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WEATHERED_EDGY_COPPER_STAIRS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EDGY_COPPER_STAIRS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EXPOSED_EDGY_COPPER_STAIRS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_WEATHERED_EDGY_COPPER_STAIRS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_STAIRS);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EDGY_COPPER_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EXPOSED_EDGY_COPPER_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WEATHERED_EDGY_COPPER_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OXIDIZED_EDGY_COPPER_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EDGY_COPPER_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EXPOSED_EDGY_COPPER_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_WEATHERED_EDGY_COPPER_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_SLAB);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {


    }
}
