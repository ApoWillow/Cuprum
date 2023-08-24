package net.apowillow.cu.data;

import net.apowillow.cu.block.ModBlocks;
import net.apowillow.cu.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Adds the models for smooth copper and all it's variants including the waxed, stair and slab versions.

        BlockStateModelGenerator.BlockTexturePool smoothcopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_COPPER);
        BlockStateModelGenerator.BlockTexturePool exposedsmoothcopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EXPOSED_SMOOTH_COPPER);
        BlockStateModelGenerator.BlockTexturePool weatheredsmoothcopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WEATHERED_SMOOTH_COPPER);
        BlockStateModelGenerator.BlockTexturePool oxidizedsmoothcopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OXIDIZED_SMOOTH_COPPER);
        BlockStateModelGenerator.BlockTexturePool waxedsmoothcopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_SMOOTH_COPPER);
        BlockStateModelGenerator.BlockTexturePool waxedexposedsmoothcopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER);
        BlockStateModelGenerator.BlockTexturePool waxedweatheredsmoothcopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER);
        BlockStateModelGenerator.BlockTexturePool waxedoxidizedsmoothcopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER);

        smoothcopper.slab(ModBlocks.SMOOTH_COPPER_SLAB);
        exposedsmoothcopper.slab(ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB);
        weatheredsmoothcopper.slab(ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB);
        oxidizedsmoothcopper.slab(ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB);
        waxedsmoothcopper.slab(ModBlocks.WAXED_SMOOTH_COPPER_SLAB);
        waxedexposedsmoothcopper.slab(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_SLAB);
        waxedweatheredsmoothcopper.slab(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_SLAB);
        waxedoxidizedsmoothcopper.slab(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_SLAB);

        smoothcopper.stairs(ModBlocks.SMOOTH_COPPER_STAIRS);
        exposedsmoothcopper.stairs(ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS);
        weatheredsmoothcopper.stairs(ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS);
        oxidizedsmoothcopper.stairs(ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS);
        waxedsmoothcopper.stairs(ModBlocks.WAXED_SMOOTH_COPPER_STAIRS);
        waxedexposedsmoothcopper.stairs(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_STAIRS);
        waxedweatheredsmoothcopper.stairs(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_STAIRS);
        waxedoxidizedsmoothcopper.stairs(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS);

        //Adds all the models for variants of edgy copper including it's waxed, stair and slab versions.
        BlockStateModelGenerator.BlockTexturePool edgycopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EDGY_COPPER);
        BlockStateModelGenerator.BlockTexturePool exposededgycopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EXPOSED_EDGY_COPPER);
        BlockStateModelGenerator.BlockTexturePool weatherededgycopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WEATHERED_EDGY_COPPER);
        BlockStateModelGenerator.BlockTexturePool oxidizededgycopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OXIDIZED_EDGY_COPPER);
        BlockStateModelGenerator.BlockTexturePool waxededgycopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EDGY_COPPER);
        BlockStateModelGenerator.BlockTexturePool waxedexposededgycopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EXPOSED_EDGY_COPPER);
        BlockStateModelGenerator.BlockTexturePool waxedweatherededgycopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_WEATHERED_EDGY_COPPER);
        BlockStateModelGenerator.BlockTexturePool waxedoxidizededgycopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER);

        edgycopper.slab(ModBlocks.EDGY_COPPER_SLAB);
        exposededgycopper.slab(ModBlocks.EXPOSED_EDGY_COPPER_SLAB);
        weatherededgycopper.slab(ModBlocks.WEATHERED_EDGY_COPPER_SLAB);
        oxidizededgycopper.slab(ModBlocks.OXIDIZED_EDGY_COPPER_SLAB);
        waxededgycopper.slab(ModBlocks.WAXED_EDGY_COPPER_SLAB);
        waxedexposededgycopper.slab(ModBlocks.WAXED_EXPOSED_EDGY_COPPER_SLAB);
        waxedweatherededgycopper.slab(ModBlocks.WAXED_WEATHERED_EDGY_COPPER_SLAB);
        waxedoxidizededgycopper.slab(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_SLAB);

        edgycopper.stairs(ModBlocks.EDGY_COPPER_STAIRS);
        exposededgycopper.stairs(ModBlocks.EXPOSED_EDGY_COPPER_STAIRS);
        weatherededgycopper.stairs(ModBlocks.WEATHERED_EDGY_COPPER_STAIRS);
        oxidizededgycopper.stairs(ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS);
        waxededgycopper.stairs(ModBlocks.WAXED_EDGY_COPPER_STAIRS);
        waxedexposededgycopper.stairs(ModBlocks.WAXED_EXPOSED_EDGY_COPPER_STAIRS);
        waxedweatherededgycopper.stairs(ModBlocks.WAXED_WEATHERED_EDGY_COPPER_STAIRS);
        waxedoxidizededgycopper.stairs(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_STAIRS);

        // Adds all the models for variants of vertical cut copper and all it's variants including the waxed, stair and slab versions.
        BlockStateModelGenerator.BlockTexturePool verticalcutcopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VERTICAL_CUT_COPPER);
        BlockStateModelGenerator.BlockTexturePool exposedverticalcutcopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EXPOSED_VERTICAL_CUT_COPPER);
        BlockStateModelGenerator.BlockTexturePool weatheredverticalcutcopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WEATHERED_VERTICAL_CUT_COPPER);
        BlockStateModelGenerator.BlockTexturePool oxidizedverticalcutcopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER);
        BlockStateModelGenerator.BlockTexturePool waxedverticalcutcopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_VERTICAL_CUT_COPPER);
        BlockStateModelGenerator.BlockTexturePool waxedexposedverticalcutcopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER);
        BlockStateModelGenerator.BlockTexturePool waxedweatheredverticalcutcopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER);
        BlockStateModelGenerator.BlockTexturePool waxedoxidizedverticalcutcopper =blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER);

        verticalcutcopper.slab(ModBlocks.VERTICAL_CUT_COPPER_SLAB);
        exposedverticalcutcopper.slab(ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_SLAB);
        weatheredverticalcutcopper.slab(ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_SLAB);
        oxidizedverticalcutcopper.slab(ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_SLAB);
        waxedverticalcutcopper.slab(ModBlocks.WAXED_VERTICAL_CUT_COPPER_SLAB);
        waxedexposedverticalcutcopper.slab(ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB);
        waxedweatheredverticalcutcopper.slab(ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB);
        waxedoxidizedverticalcutcopper.slab(ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB);

        verticalcutcopper.stairs(ModBlocks.VERTICAL_CUT_COPPER_STAIRS);
        exposedverticalcutcopper.stairs(ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_STAIRS);
        weatheredverticalcutcopper.stairs(ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_STAIRS);
        oxidizedverticalcutcopper.stairs(ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_STAIRS);
        waxedverticalcutcopper.stairs(ModBlocks.WAXED_VERTICAL_CUT_COPPER_STAIRS);
        waxedexposedverticalcutcopper.stairs(ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_STAIRS);
        waxedweatheredverticalcutcopper.stairs(ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_STAIRS);
        waxedoxidizedverticalcutcopper.stairs(ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_STAIRS);

        // Adds all the models for variants of chiseled copper and all it's variants including the waxed, stair and slab versions.
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHISELED_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EXPOSED_CHISELED_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WEATHERED_CHISELED_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OXIDIZED_CHISELED_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_CHISELED_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_EXPOSED_CHISELED_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_WEATHERED_CHISELED_COPPER);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER);

        //blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COPPER_SCAFFHOLDING);

        // Sulfate related blocks
        blockStateModelGenerator.registerTorch(ModBlocks.SULFATE_TORCH, ModBlocks.SULFATE_WALL_TORCH);
        blockStateModelGenerator.registerCampfire(ModBlocks.SULFATE_CAMPFIRE);
        blockStateModelGenerator.registerLantern(ModBlocks.SULFATE_LANTERN);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK_OF_COPPER_SULFATE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK_OF_COPPER_OXIDE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.COPPER_SULFATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_OXIDE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_WRENCH, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ROSE_GOLD_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_GOLD_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.ROSE_GOLD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROSE_GOLD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROSE_GOLD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROSE_GOLD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ROSE_GOLD_HOE, Models.HANDHELD);
    }
}
