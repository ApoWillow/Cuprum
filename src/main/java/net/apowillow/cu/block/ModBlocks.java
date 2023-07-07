package net.apowillow.cu.block;

import net.apowillow.cu.CUMod;
import net.apowillow.cu.block.advance.levitatorstates.ExposedLevitatorBlock;
import net.apowillow.cu.block.advance.levitatorstates.LevitatorBlock;
import net.apowillow.cu.block.advance.levitatorstates.OxidizedLevitatorBlock;
import net.apowillow.cu.block.advance.levitatorstates.WeatheredLevitatorBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.OxidizableBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SMOOTH_COPPER = registerBlock("smooth_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block EXPOSED_SMOOTH_COPPER = registerBlock("exposed_smooth_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.EXPOSED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WEATHERED_SMOOTH_COPPER = registerBlock("weathered_smooth_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.WEATHERED_COPPER).strength(3.0f).requiresTool()));

    public static final Block OXIDIZED_SMOOTH_COPPER = registerBlock("oxidized_smooth_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.OXIDIZED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WAXED_SMOOTH_COPPER = registerBlock("waxed_smooth_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_EXPOSED_SMOOTH_COPPER = registerBlock("waxed_exposed_smooth_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_EXPOSED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WAXED_WEATHERED_SMOOTH_COPPER = registerBlock("waxed_weathered_smooth_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_WEATHERED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WAXED_OXIDIZED_SMOOTH_COPPER = registerBlock("waxed_oxidized_smooth_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_OXIDIZED_COPPER).strength(3.0f).requiresTool()));

    public static final Block EDGY_COPPER = registerBlock("edgy_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block EXPOSED_EDGY_COPPER = registerBlock("exposed_edgy_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WEATHERED_EDGY_COPPER = registerBlock("weathered_edgy_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block OXIDIZED_EDGY_COPPER = registerBlock("oxidized_edgy_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_EDGY_COPPER = registerBlock("waxed_edgy_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_EXPOSED_EDGY_COPPER = registerBlock("waxed_exposed_edgy_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_WEATHERED_EDGY_COPPER = registerBlock("waxed_weathered_edgy_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_OXIDIZED_EDGY_COPPER = registerBlock("waxed_oxidized_edgy_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_BLOCK).strength(3.0f).requiresTool()));


    public static final Block LEVITATOR_BLOCK = registerBlock("levitator_block",
            new LevitatorBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block EXPOSED_LEVITATOR_BLOCK = registerBlock("exposed_levitator_block",
            new ExposedLevitatorBlock(FabricBlockSettings.copyOf(Blocks.EXPOSED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WEATHERED_LEVITATOR_BLOCK = registerBlock("weathered_levitator_block",
            new WeatheredLevitatorBlock(FabricBlockSettings.copyOf(Blocks.WEATHERED_COPPER).strength(3.0f).requiresTool()));

    public static final Block OXIDIZED_LEVITATOR_BLOCK = registerBlock("oxidized_levitator_block",
            new OxidizedLevitatorBlock(FabricBlockSettings.copyOf(Blocks.OXIDIZED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WAXED_LEVITATOR_BLOCK = registerBlock("waxed_levitator_block",
            new LevitatorBlock(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_EXPOSED_LEVITATOR_BLOCK = registerBlock("waxed_exposed_levitator_block",
            new ExposedLevitatorBlock(FabricBlockSettings.copyOf(Blocks.WAXED_EXPOSED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WAXED_WEATHERED_LEVITATOR_BLOCK = registerBlock("waxed_weathered_levitator_block",
            new WeatheredLevitatorBlock(FabricBlockSettings.copyOf(Blocks.WAXED_WEATHERED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WAXED_OXIDIZED_LEVITATOR_BLOCK = registerBlock("waxed_oxidized_levitator_block",
            new OxidizedLevitatorBlock(FabricBlockSettings.copyOf(Blocks.WAXED_WEATHERED_COPPER).strength(3.0f).requiresTool()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CUMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(CUMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerModBlocks() {
        CUMod.LOGGER.info("Registering CUBlocks");
    }
}
