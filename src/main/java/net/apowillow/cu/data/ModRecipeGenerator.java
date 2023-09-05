package net.apowillow.cu.data;

import net.apowillow.cu.CUMod;
import net.apowillow.cu.block.ModBlocks;
import net.apowillow.cu.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.ComplexRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        // Adds recipes for cut copper that doesn't already exist
        // Blocks
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER, ModBlocks.EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER, ModBlocks.EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER, ModBlocks.WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER, ModBlocks.OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER, ModBlocks.WAXED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER, ModBlocks.WAXED_EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER, ModBlocks.WAXED_WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER, ModBlocks.SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER, ModBlocks.EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER, ModBlocks.WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER, ModBlocks.OXIDIZED_SMOOTH_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER, ModBlocks.WAXED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER, ModBlocks.VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER, ModBlocks.WAXED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER, ModBlocks.CHISELED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER, ModBlocks.EXPOSED_CHISELED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER, ModBlocks.WEATHERED_CHISELED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER, ModBlocks.OXIDIZED_CHISELED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER, ModBlocks.WAXED_CHISELED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER, ModBlocks.WAXED_EXPOSED_CHISELED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER, ModBlocks.WAXED_WEATHERED_CHISELED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER, ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER);

        // Slabs
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER_SLAB, ModBlocks.SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER_SLAB, ModBlocks.EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER_SLAB, ModBlocks.WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER_SLAB, ModBlocks.OXIDIZED_SMOOTH_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER_SLAB, ModBlocks.WAXED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER_SLAB, ModBlocks.SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER_SLAB, ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER_SLAB, ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER_SLAB, ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER_SLAB, ModBlocks.WAXED_SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER_SLAB, ModBlocks.EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER_SLAB, ModBlocks.EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER_SLAB, ModBlocks.WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER_SLAB, ModBlocks.OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER_SLAB, ModBlocks.WAXED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER_SLAB, ModBlocks.EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER_SLAB, ModBlocks.EXPOSED_EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER_SLAB, ModBlocks.WEATHERED_EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER_SLAB, ModBlocks.OXIDIZED_EDGY_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER_SLAB, ModBlocks.WAXED_EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER_SLAB, ModBlocks.VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER_SLAB, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER_SLAB, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER_SLAB, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER_SLAB, ModBlocks.WAXED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER_SLAB, ModBlocks.VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER_SLAB, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER_SLAB, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER_SLAB, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER_SLAB, ModBlocks.WAXED_VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER_SLAB, ModBlocks.CHISELED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER_SLAB, ModBlocks.EXPOSED_CHISELED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER_SLAB, ModBlocks.WEATHERED_CHISELED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER_SLAB, ModBlocks.OXIDIZED_CHISELED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER_SLAB, ModBlocks.WAXED_CHISELED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_CHISELED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_CHISELED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_CHISELED_COPPER);

        // Stairs
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER_STAIRS, ModBlocks.EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER_STAIRS, ModBlocks.EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER_STAIRS, ModBlocks.WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER_STAIRS, ModBlocks.OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER_STAIRS, ModBlocks.WAXED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER_STAIRS, ModBlocks.EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER_STAIRS, ModBlocks.EXPOSED_EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER_STAIRS, ModBlocks.WEATHERED_EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER_STAIRS, ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER_STAIRS, ModBlocks.WAXED_EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER_STAIRS, ModBlocks.SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER_STAIRS, ModBlocks.EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER_STAIRS, ModBlocks.WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER_STAIRS, ModBlocks.OXIDIZED_SMOOTH_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER_STAIRS, ModBlocks.WAXED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER_STAIRS, ModBlocks.SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER_STAIRS, ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER_STAIRS, ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER_STAIRS, ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER_STAIRS, ModBlocks.WAXED_SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER_STAIRS, ModBlocks.VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER_STAIRS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER_STAIRS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER_STAIRS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER_STAIRS, ModBlocks.WAXED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CUT_COPPER_STAIRS, ModBlocks.VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER_STAIRS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER_STAIRS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER_STAIRS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER_STAIRS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_STAIRS);

        // Adds the recipes for Smooth Copper inside the stone cutter
        // Blocks
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER, Blocks.COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER, Blocks.EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER, Blocks.WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER, Blocks.OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER, Blocks.WAXED_COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER, Blocks.WAXED_EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER, Blocks.WAXED_WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER, Blocks.WAXED_OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER, ModBlocks.EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER, ModBlocks.EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER, ModBlocks.WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER, ModBlocks.OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER, ModBlocks.WAXED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER, ModBlocks.WAXED_EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER, ModBlocks.WAXED_WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER, Blocks.CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER, Blocks.EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER, Blocks.WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER, Blocks.OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER, Blocks.WAXED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER, Blocks.WAXED_EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER, Blocks.WAXED_WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER, Blocks.WAXED_OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER, ModBlocks.VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER, ModBlocks.WAXED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER);

        // Slabs
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_SLAB, Blocks.COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB, Blocks.EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB, Blocks.WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB, Blocks.OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER_SLAB, Blocks.WAXED_COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_SLAB, Blocks.WAXED_EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_SLAB, Blocks.WAXED_WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_SLAB, Blocks.WAXED_OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_SLAB, Blocks.CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER_SLAB, Blocks.WAXED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_SLAB, Blocks.WAXED_EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_SLAB, Blocks.WAXED_WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_SLAB, Blocks.WAXED_OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_SLAB, Blocks.CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER_SLAB, Blocks.WAXED_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_SLAB, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_SLAB, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_SLAB, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_SLAB, ModBlocks.EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB, ModBlocks.EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB, ModBlocks.WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB, ModBlocks.OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_SLAB, ModBlocks.EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB, ModBlocks.EXPOSED_EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB, ModBlocks.WEATHERED_EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB, ModBlocks.OXIDIZED_EDGY_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_SLAB, ModBlocks.VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_SLAB, ModBlocks.VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB);

        // Stairs
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_STAIRS, Blocks.COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS, Blocks.EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS, Blocks.WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS, Blocks.OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER_STAIRS, Blocks.WAXED_COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_STAIRS, Blocks.WAXED_EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_STAIRS, Blocks.WAXED_WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_STAIRS, Blocks.CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS, Blocks.EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS, Blocks.WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS, Blocks.OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER_STAIRS, Blocks.WAXED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_STAIRS, Blocks.WAXED_EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_STAIRS, Blocks.WAXED_WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_STAIRS, Blocks.CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS, Blocks.EXPOSED_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS, Blocks.WEATHERED_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS, Blocks.OXIDIZED_CUT_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER_STAIRS, Blocks.WAXED_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_STAIRS, Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_STAIRS, Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_STAIRS, ModBlocks.EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS, ModBlocks.EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS, ModBlocks.WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS, ModBlocks.OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_STAIRS, ModBlocks.EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS, ModBlocks.EXPOSED_EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS, ModBlocks.WEATHERED_EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS, ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_STAIRS, ModBlocks.VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_STAIRS, ModBlocks.VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_STAIRS);
        // Adds the recipes for Edgy Copper inside the stone cutter
        // Blocks
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER, Blocks.COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER, Blocks.EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER, Blocks.WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER, Blocks.OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER, Blocks.WAXED_COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER, Blocks.WAXED_EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER, Blocks.WAXED_WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER, Blocks.WAXED_OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER, Blocks.CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER, Blocks.EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER, Blocks.WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER, Blocks.OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER, Blocks.WAXED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER, Blocks.WAXED_EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER, Blocks.WAXED_WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER, Blocks.WAXED_OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER, ModBlocks.SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER, ModBlocks.EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER, ModBlocks.WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER, ModBlocks.OXIDIZED_SMOOTH_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER, ModBlocks.WAXED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER, ModBlocks.VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER, ModBlocks.WAXED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER);

        // Slabs
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_SLAB, Blocks.COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER_SLAB, Blocks.EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER_SLAB, Blocks.WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER_SLAB, Blocks.OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER_SLAB, Blocks.WAXED_COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_SLAB, Blocks.WAXED_EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_SLAB, Blocks.WAXED_WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_SLAB, Blocks.WAXED_OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_SLAB, Blocks.CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER_SLAB, Blocks.WAXED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_SLAB, Blocks.WAXED_EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_SLAB, Blocks.WAXED_WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_SLAB, Blocks.WAXED_OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_SLAB, Blocks.CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER_SLAB, Blocks.WAXED_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_SLAB, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_SLAB, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_SLAB, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_SLAB, ModBlocks.SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER_SLAB, ModBlocks.EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER_SLAB, ModBlocks.WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER_SLAB, ModBlocks.OXIDIZED_SMOOTH_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER_SLAB, ModBlocks.WAXED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_SLAB, ModBlocks.SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER_SLAB, ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER_SLAB, ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER_SLAB, ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER_SLAB, ModBlocks.WAXED_SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_SLAB, ModBlocks.VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER_SLAB, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER_SLAB, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER_SLAB, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER_SLAB, ModBlocks.WAXED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_SLAB, ModBlocks.VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER_SLAB, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER_SLAB, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER_SLAB, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER_SLAB, ModBlocks.WAXED_VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB);

        // Stairs
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_STAIRS, Blocks.COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER_STAIRS, Blocks.EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER_STAIRS, Blocks.WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS, Blocks.OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER_STAIRS, Blocks.WAXED_COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_STAIRS, Blocks.WAXED_EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_STAIRS, Blocks.WAXED_WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_STAIRS, Blocks.CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER_STAIRS, Blocks.EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER_STAIRS, Blocks.WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS, Blocks.OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER_STAIRS, Blocks.WAXED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_STAIRS, Blocks.WAXED_EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_STAIRS, Blocks.WAXED_WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_STAIRS, Blocks.CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER_STAIRS, Blocks.EXPOSED_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER_STAIRS, Blocks.WEATHERED_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS, Blocks.OXIDIZED_CUT_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER_STAIRS, Blocks.WAXED_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_STAIRS, Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_STAIRS, Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_STAIRS, ModBlocks.SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER_STAIRS, ModBlocks.EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER_STAIRS, ModBlocks.WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS, ModBlocks.OXIDIZED_SMOOTH_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_STAIRS, ModBlocks.SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER_STAIRS, ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER_STAIRS, ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS, ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_STAIRS, ModBlocks.VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER_STAIRS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER_STAIRS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_STAIRS, ModBlocks.VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_EDGY_COPPER_STAIRS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_EDGY_COPPER_STAIRS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_STAIRS);
        // Adds the recipes for Vertical Cut Copper inside the stone cutter
        // Blocks
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER, Blocks.COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER, Blocks.EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER, Blocks.WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER, Blocks.OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER, Blocks.WAXED_COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER, Blocks.WAXED_EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER, Blocks.WAXED_WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER, Blocks.WAXED_OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER, Blocks.CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER, Blocks.EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER, Blocks.WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER, Blocks.OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER, Blocks.WAXED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER, Blocks.WAXED_EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER, Blocks.WAXED_WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER, Blocks.WAXED_OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER, ModBlocks.EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER, ModBlocks.EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER, ModBlocks.WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER, ModBlocks.OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER, ModBlocks.WAXED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER, ModBlocks.WAXED_EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER, ModBlocks.WAXED_WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER, ModBlocks.SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER, ModBlocks.EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER, ModBlocks.WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER, ModBlocks.OXIDIZED_SMOOTH_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER, ModBlocks.WAXED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER);

        // Slabs
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER_SLAB, Blocks.COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_SLAB, Blocks.EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_SLAB, Blocks.WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_SLAB, Blocks.OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_SLAB, Blocks.WAXED_COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB, Blocks.WAXED_EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB, Blocks.WAXED_WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB, Blocks.WAXED_OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER_SLAB, Blocks.CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_SLAB, Blocks.WAXED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB, Blocks.WAXED_EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB, Blocks.WAXED_WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB, Blocks.WAXED_OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER_SLAB, Blocks.CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_SLAB, Blocks.EXPOSED_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_SLAB, Blocks.WEATHERED_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_SLAB, Blocks.OXIDIZED_CUT_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_SLAB, Blocks.WAXED_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER_SLAB, ModBlocks.SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.OXIDIZED_SMOOTH_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER_SLAB, ModBlocks.SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER_SLAB, ModBlocks.EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER_SLAB, ModBlocks.EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.EXPOSED_EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WEATHERED_EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.OXIDIZED_EDGY_COPPER_SLAB);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_SLAB);

        // Stairs
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER_STAIRS, Blocks.COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_STAIRS, Blocks.EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_STAIRS, Blocks.WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_STAIRS, Blocks.OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_STAIRS, Blocks.WAXED_COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_STAIRS, Blocks.WAXED_EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_STAIRS, Blocks.WAXED_WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER_STAIRS, Blocks.CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_STAIRS, Blocks.EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_STAIRS, Blocks.WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_STAIRS, Blocks.OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_STAIRS, Blocks.WAXED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_STAIRS, Blocks.WAXED_EXPOSED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_STAIRS, Blocks.WAXED_WEATHERED_CUT_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_CUT_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER_STAIRS, Blocks.CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_STAIRS, Blocks.EXPOSED_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_STAIRS, Blocks.WEATHERED_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_STAIRS, Blocks.OXIDIZED_CUT_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_STAIRS, Blocks.WAXED_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_STAIRS, Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_STAIRS, Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_STAIRS, Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER_STAIRS, ModBlocks.EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER_STAIRS, ModBlocks.EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.EXPOSED_EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WEATHERED_EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER_STAIRS, ModBlocks.SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.OXIDIZED_SMOOTH_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CUT_COPPER_STAIRS, ModBlocks.SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_STAIRS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS);

        // Adds the recipes for Lined Copper Lamp inside the stone cutter
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, ModBlocks.LINED_COPPER_LAMP, ModBlocks.COPPER_LAMP);
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, ModBlocks.EXPOSED_LINED_COPPER_LAMP, ModBlocks.EXPOSED_COPPER_LAMP);
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, ModBlocks.WEATHERED_LINED_COPPER_LAMP, ModBlocks.WEATHERED_COPPER_LAMP);
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, ModBlocks.OXIDIZED_LINED_COPPER_LAMP, ModBlocks.OXIDIZED_COPPER_LAMP);

        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, ModBlocks.WAXED_LINED_COPPER_LAMP, ModBlocks.WAXED_COPPER_LAMP);
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, ModBlocks.WAXED_EXPOSED_LINED_COPPER_LAMP, ModBlocks.WAXED_EXPOSED_COPPER_LAMP);
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, ModBlocks.WAXED_WEATHERED_LINED_COPPER_LAMP, ModBlocks.WAXED_WEATHERED_COPPER_LAMP);
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, ModBlocks.WAXED_OXIDIZED_LINED_COPPER_LAMP, ModBlocks.WAXED_OXIDIZED_COPPER_LAMP);

        //Adds the recipe for Levitator block
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LEVITATOR_BLOCK)
                .pattern("CCC")
                .pattern("CAC")
                .pattern("SSS")
                .input('C', Items.COPPER_INGOT)
                .input('A', Items.AMETHYST_SHARD)
                .input('S', Items.SHULKER_SHELL)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .criterion(FabricRecipeProvider.hasItem(Items.SHULKER_SHELL),
                        FabricRecipeProvider.conditionsFromItem(Items.SHULKER_SHELL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.LEVITATOR_BLOCK)));

        // Copper Lamp Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.COPPER_LAMP)
                .pattern(" C ")
                .pattern("CRC")
                .pattern(" C ")
                .input('C', Items.COPPER_INGOT)
                .input('R', Items.REDSTONE_LAMP)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.REDSTONE),
                        FabricRecipeProvider.conditionsFromItem(Items.REDSTONE))
                .criterion(FabricRecipeProvider.hasItem(Items.GLOWSTONE),
                        FabricRecipeProvider.conditionsFromItem(Items.GLOWSTONE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.COPPER_LAMP)));

        // Copper Wrench Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_WRENCH)
                .pattern(" C ")
                .pattern(" CC")
                .pattern("C  ")
                .input('C', Items.COPPER_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.COPPER_WRENCH)));

        // Copper Scaffholding Recipe
        /* ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COPPER_SCAFFHOLDING)
                .pattern("CCC")
                .pattern("S S")
                .pattern("CCC")
                .input('C', Items.COPPER_INGOT)
                .input('S', Blocks.SCAFFOLDING)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Blocks.SCAFFOLDING),
                        FabricRecipeProvider.conditionsFromItem(Blocks.SCAFFOLDING))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.COPPER_SCAFFHOLDING)));
         */
        // Copper Sulfate Recipe and everything that's related to it
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_SULFATE)
                .input(ModItems.COPPER_OXIDE)
                .input(Items.GUNPOWDER)
                .criterion(FabricRecipeProvider.hasItem(Items.GUNPOWDER),
                        FabricRecipeProvider.conditionsFromItem(Items.GUNPOWDER))
                .criterion(FabricRecipeProvider.hasItem(ModItems.COPPER_OXIDE),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.COPPER_SULFATE)));

        /*ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SULFATE_CAMPFIRE)
                .pattern(" S ")
                .pattern("SCS")
                .pattern("LLL")
                .input('S', Items.STICK)
                .input('L', Ingredient.fromTag(ItemTags.LOGS_THAT_BURN))
                .input('C', ModItems.COPPER_SULFATE)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.COPPER_SULFATE),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.SULFATE_CAMPFIRE))); */

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SULFATE_LANTERN)
                .pattern("III")
                .pattern("ITI")
                .pattern("III")
                .input('T', ModItems.SULFATE_TORCH)
                .input('I', Items.IRON_NUGGET)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_NUGGET),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_NUGGET))
                .criterion(FabricRecipeProvider.hasItem(ModItems.SULFATE_TORCH),
                        FabricRecipeProvider.conditionsFromItem(Items.TORCH))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.SULFATE_LANTERN)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_OXIDE,9)
                .input(ModBlocks.BLOCK_OF_COPPER_OXIDE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.BLOCK_OF_COPPER_OXIDE),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.COPPER_OXIDE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLOCK_OF_COPPER_OXIDE)
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.COPPER_OXIDE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.COPPER_OXIDE),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.BLOCK_OF_COPPER_OXIDE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLOCK_OF_COPPER_SULFATE)
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.COPPER_SULFATE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.COPPER_SULFATE),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.BLOCK_OF_COPPER_SULFATE)));

        ComplexRecipeJsonBuilder.create(CUMod.COPPER_HORN_RECIPE).offerTo(exporter, CUMod.id("copper_horn").toString());


    }
}

// Pain.