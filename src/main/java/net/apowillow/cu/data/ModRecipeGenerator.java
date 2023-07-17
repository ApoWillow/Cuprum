package net.apowillow.cu.data;

import net.apowillow.cu.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
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

        //Adds the recipes for smooth copper and edgy copper inside the stone cutter
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER, Blocks.COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_SLAB, Blocks.COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_STAIRS, Blocks.COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_SLAB, ModBlocks.EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_COPPER_STAIRS, ModBlocks.EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER, Blocks.COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_SLAB, Blocks.COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_STAIRS, Blocks.COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_SLAB, ModBlocks.EDGY_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EDGY_COPPER_STAIRS, ModBlocks.EDGY_COPPER);


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


        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.LINED_COPPER_LAMP)
                .pattern("CRC")
                .pattern("RGR")
                .pattern("CRC")
                .input('C', Items.COPPER_INGOT)
                .input('R', Items.REDSTONE)
                .input('G', Items.GLOWSTONE)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.REDSTONE),
                        FabricRecipeProvider.conditionsFromItem(Items.REDSTONE))
                .criterion(FabricRecipeProvider.hasItem(Items.GLOWSTONE),
                        FabricRecipeProvider.conditionsFromItem(Items.GLOWSTONE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.LINED_COPPER_LAMP)));
    }
}
