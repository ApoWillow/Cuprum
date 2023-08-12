package net.apowillow.cu.data;

import net.apowillow.cu.registry.ModBlocks;
import net.apowillow.cu.registry.ModItems;
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
        offerStonecuttingRecipe(exporter, RecipeCategory.REDSTONE, ModBlocks.LINED_COPPER_LAMP, ModBlocks.COPPER_LAMP);

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

        // Copper Anchor Recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_ANCHOR)
                .pattern(" CC")
                .pattern(" CC")
                .pattern("B  ")
                .input('C', Items.COPPER_INGOT)
                .input('B', Blocks.COPPER_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Blocks.COPPER_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(Blocks.COPPER_BLOCK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.COPPER_ANCHOR)));

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
    }
}
