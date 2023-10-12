package net.apowillow.cu.block;

import net.apowillow.cu.CUMod;
import net.apowillow.cu.block.custom.CopperDoorBlock;
import net.apowillow.cu.block.custom.CopperLampBlock;
import net.apowillow.cu.block.custom.CopperTrapdoorBlock;
import net.apowillow.cu.block.custom.chain.CopperChainBlock;
import net.apowillow.cu.block.custom.levitatorblocks.ExposedLevitatorBlock;
import net.apowillow.cu.block.custom.levitatorblocks.LevitatorBlock;
import net.apowillow.cu.block.custom.levitatorblocks.OxidizedLevitatorBlock;
import net.apowillow.cu.block.custom.levitatorblocks.WeatheredLevitatorBlock;
import net.apowillow.cu.particle.ModParticles;
import net.apowillow.cu.util.ModBlockSetTypes;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ModBlocks {

    // Registering all the types of smooth copper blocks
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

    public static final Block SMOOTH_COPPER_STAIRS = registerBlock("smooth_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, ModBlocks.SMOOTH_COPPER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block EXPOSED_SMOOTH_COPPER_STAIRS = registerBlock("exposed_smooth_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, ModBlocks.EXPOSED_SMOOTH_COPPER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WEATHERED_SMOOTH_COPPER_STAIRS = registerBlock("weathered_smooth_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, ModBlocks.WEATHERED_SMOOTH_COPPER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block OXIDIZED_SMOOTH_COPPER_STAIRS = registerBlock("oxidized_smooth_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, ModBlocks.OXIDIZED_SMOOTH_COPPER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_SMOOTH_COPPER_STAIRS = registerBlock("waxed_smooth_copper_stairs",
            new StairsBlock(ModBlocks.WAXED_SMOOTH_COPPER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_EXPOSED_SMOOTH_COPPER_STAIRS = registerBlock("waxed_exposed_smooth_copper_stairs",
            new StairsBlock(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_WEATHERED_SMOOTH_COPPER_STAIRS = registerBlock("waxed_weathered_smooth_copper_stairs",
            new StairsBlock(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS = registerBlock("waxed_oxidized_smooth_copper_stairs",
            new StairsBlock(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block SMOOTH_COPPER_SLAB = registerBlock("smooth_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block EXPOSED_SMOOTH_COPPER_SLAB = registerBlock("exposed_smooth_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.EXPOSED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WEATHERED_SMOOTH_COPPER_SLAB = registerBlock("weathered_smooth_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.WEATHERED_COPPER).strength(3.0f).requiresTool()));

    public static final Block OXIDIZED_SMOOTH_COPPER_SLAB = registerBlock("oxidized_smooth_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.OXIDIZED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WAXED_SMOOTH_COPPER_SLAB = registerBlock("waxed_smooth_copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_EXPOSED_SMOOTH_COPPER_SLAB = registerBlock("waxed_exposed_smooth_copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_WEATHERED_SMOOTH_COPPER_SLAB = registerBlock("waxed_weathered_smooth_copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_OXIDIZED_SMOOTH_COPPER_SLAB = registerBlock("waxed_oxidized_smooth_copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    // Registering all the types of edgy copper blocks
    public static final Block EDGY_COPPER = registerBlock("edgy_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block EXPOSED_EDGY_COPPER = registerBlock("exposed_edgy_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.EXPOSED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WEATHERED_EDGY_COPPER = registerBlock("weathered_edgy_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.WEATHERED_COPPER).strength(3.0f).requiresTool()));

    public static final Block OXIDIZED_EDGY_COPPER = registerBlock("oxidized_edgy_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.OXIDIZED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WAXED_EDGY_COPPER = registerBlock("waxed_edgy_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_EXPOSED_EDGY_COPPER = registerBlock("waxed_exposed_edgy_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_WEATHERED_EDGY_COPPER = registerBlock("waxed_weathered_edgy_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_OXIDIZED_EDGY_COPPER = registerBlock("waxed_oxidized_edgy_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block EDGY_COPPER_STAIRS = registerBlock("edgy_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, ModBlocks.EDGY_COPPER.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block EXPOSED_EDGY_COPPER_STAIRS = registerBlock("exposed_edgy_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, ModBlocks.EDGY_COPPER.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WEATHERED_EDGY_COPPER_STAIRS = registerBlock("weathered_edgy_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, ModBlocks.EDGY_COPPER.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block OXIDIZED_EDGY_COPPER_STAIRS = registerBlock("oxidized_edgy_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, ModBlocks.EDGY_COPPER.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_EDGY_COPPER_STAIRS = registerBlock("waxed_edgy_copper_stairs",
            new StairsBlock(ModBlocks.EDGY_COPPER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_EXPOSED_EDGY_COPPER_STAIRS = registerBlock("waxed_exposed_edgy_copper_stairs",
            new StairsBlock(ModBlocks.EXPOSED_EDGY_COPPER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.EXPOSED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WAXED_WEATHERED_EDGY_COPPER_STAIRS = registerBlock("waxed_weathered_edgy_copper_stairs",
            new StairsBlock(ModBlocks.WEATHERED_EDGY_COPPER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WEATHERED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WAXED_OXIDIZED_EDGY_COPPER_STAIRS = registerBlock("waxed_oxidized_edgy_copper_stairs",
            new StairsBlock(ModBlocks.OXIDIZED_EDGY_COPPER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OXIDIZED_COPPER).strength(3.0f).requiresTool()));

    public static final Block EDGY_COPPER_SLAB = registerBlock("edgy_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block EXPOSED_EDGY_COPPER_SLAB = registerBlock("exposed_edgy_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WEATHERED_EDGY_COPPER_SLAB = registerBlock("weathered_edgy_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block OXIDIZED_EDGY_COPPER_SLAB = registerBlock("oxidized_edgy_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_EDGY_COPPER_SLAB = registerBlock("waxed_edgy_copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_EXPOSED_EDGY_COPPER_SLAB = registerBlock("waxed_exposed_edgy_copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_WEATHERED_EDGY_COPPER_SLAB = registerBlock("waxed_weathered_edgy_copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_OXIDIZED_EDGY_COPPER_SLAB = registerBlock("waxed_oxidized_edgy_copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    //Registering all the normal copper lamps and it's variants
    public static final Block COPPER_LAMP = registerBlock("copper_lamp",
            new CopperLampBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()
                    .luminance(state -> state.get(CopperLampBlock.LIT) ? 15 : 0)));

    public static final Block EXPOSED_COPPER_LAMP = registerBlock("exposed_copper_lamp",
            new CopperLampBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()
                    .luminance(state -> state.get(CopperLampBlock.LIT) ? 15 : 0)));

    public static final Block WEATHERED_COPPER_LAMP = registerBlock("weathered_copper_lamp",
            new CopperLampBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()
                    .luminance(state -> state.get(CopperLampBlock.LIT) ? 15 : 0)));

    public static final Block OXIDIZED_COPPER_LAMP = registerBlock("oxidized_copper_lamp",
            new CopperLampBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()
                    .luminance(state -> state.get(CopperLampBlock.LIT) ? 15 : 0)));

    public static final Block WAXED_COPPER_LAMP = registerBlock("waxed_copper_lamp",
            new CopperLampBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()
                    .luminance(state -> state.get(CopperLampBlock.LIT) ? 15 : 0)));

    public static final Block WAXED_EXPOSED_COPPER_LAMP = registerBlock("waxed_exposed_copper_lamp",
            new CopperLampBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()
                    .luminance(state -> state.get(CopperLampBlock.LIT) ? 15 : 0)));

    public static final Block WAXED_WEATHERED_COPPER_LAMP = registerBlock("waxed_weathered_copper_lamp",
            new CopperLampBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()
                    .luminance(state -> state.get(CopperLampBlock.LIT) ? 15 : 0)));

    public static final Block WAXED_OXIDIZED_COPPER_LAMP = registerBlock("waxed_oxidized_copper_lamp",
            new CopperLampBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()
                    .luminance(state -> state.get(CopperLampBlock.LIT) ? 15 : 0)));

    // Registering all the types of vertical cut copper blocks
    public static final Block VERTICAL_CUT_COPPER = registerBlock("vertical_cut_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block EXPOSED_VERTICAL_CUT_COPPER = registerBlock("exposed_vertical_cut_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.EXPOSED_CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block WEATHERED_VERTICAL_CUT_COPPER = registerBlock("weathered_vertical_cut_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.WEATHERED_CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block OXIDIZED_VERTICAL_CUT_COPPER = registerBlock("oxidized_vertical_cut_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.OXIDIZED_CUT_COPPER).strength(3.0f).requiresTool()));

    public static final Block WAXED_VERTICAL_CUT_COPPER = registerBlock("waxed_vertical_cut_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block WAXED_EXPOSED_VERTICAL_CUT_COPPER = registerBlock("waxed_exposed_vertical_cut_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_EXPOSED_CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block WAXED_WEATHERED_VERTICAL_CUT_COPPER = registerBlock("waxed_weathered_vertical_cut_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_WEATHERED_CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block WAXED_OXIDIZED_VERTICAL_CUT_COPPER = registerBlock("waxed_oxidized_vertical_cut_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_OXIDIZED_CUT_COPPER).strength(3.0f).requiresTool()));

    public static final Block VERTICAL_CUT_COPPER_STAIRS = registerBlock("vertical_cut_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, ModBlocks.VERTICAL_CUT_COPPER.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block EXPOSED_VERTICAL_CUT_COPPER_STAIRS = registerBlock("exposed_vertical_cut_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, ModBlocks.EXPOSED_VERTICAL_CUT_COPPER.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.EXPOSED_CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block WEATHERED_VERTICAL_CUT_COPPER_STAIRS = registerBlock("weathered_vertical_cut_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, ModBlocks.WEATHERED_VERTICAL_CUT_COPPER.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.WEATHERED_CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block OXIDIZED_VERTICAL_CUT_COPPER_STAIRS = registerBlock("oxidized_vertical_cut_copper_stairs",
            new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, ModBlocks.OXIDIZED_VERTICAL_CUT_COPPER.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.OXIDIZED_CUT_COPPER).strength(3.0f).requiresTool()));

    public static final Block WAXED_VERTICAL_CUT_COPPER_STAIRS = registerBlock("waxed_vertical_cut_copper_stairs",
            new StairsBlock(ModBlocks.WAXED_VERTICAL_CUT_COPPER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block WAXED_EXPOSED_VERTICAL_CUT_COPPER_STAIRS = registerBlock("waxed_exposed_vertical_cut_copper_stairs",
            new StairsBlock(ModBlocks.WAXED_EXPOSED_VERTICAL_CUT_COPPER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.EXPOSED_CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block WAXED_WEATHERED_VERTICAL_CUT_COPPER_STAIRS = registerBlock("waxed_weathered_vertical_cut_copper_stairs",
            new StairsBlock(ModBlocks.WAXED_WEATHERED_VERTICAL_CUT_COPPER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WEATHERED_CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block WAXED_OXIDIZED_VERTICAL_CUT_COPPER_STAIRS = registerBlock("waxed_oxidized_vertical_cut_copper_stairs",
            new StairsBlock(ModBlocks.WAXED_OXIDIZED_VERTICAL_CUT_COPPER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OXIDIZED_CUT_COPPER).strength(3.0f).requiresTool()));

    public static final Block VERTICAL_CUT_COPPER_SLAB = registerBlock("vertical_cut_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));
    public static final Block EXPOSED_VERTICAL_CUT_COPPER_SLAB = registerBlock("exposed_vertical_cut_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));
    public static final Block WEATHERED_VERTICAL_CUT_COPPER_SLAB = registerBlock("weathered_vertical_cut_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));
    public static final Block OXIDIZED_VERTICAL_CUT_COPPER_SLAB = registerBlock("oxidized_vertical_cut_copper_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_VERTICAL_CUT_COPPER_SLAB = registerBlock("waxed_vertical_cut_copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WAXED_CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block WAXED_EXPOSED_VERTICAL_CUT_COPPER_SLAB = registerBlock("waxed_exposed_vertical_cut_copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WAXED_EXPOSED_CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block WAXED_WEATHERED_VERTICAL_CUT_COPPER_SLAB = registerBlock("waxed_weathered_vertical_cut_copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WAXED_WEATHERED_CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block WAXED_OXIDIZED_VERTICAL_CUT_COPPER_SLAB = registerBlock("waxed_oxidized_vertical_cut_copper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.WAXED_OXIDIZED_CUT_COPPER).strength(3.0f).requiresTool()));

    // Registering all the types of chiseled copper
    public static final Block CHISELED_COPPER = registerBlock("chiseled_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED,
                    FabricBlockSettings.copyOf(Blocks.CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block EXPOSED_CHISELED_COPPER = registerBlock("exposed_chiseled_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED,
                    FabricBlockSettings.copyOf(Blocks.EXPOSED_CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block WEATHERED_CHISELED_COPPER = registerBlock("weathered_chiseled_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED,
                    FabricBlockSettings.copyOf(Blocks.WEATHERED_CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block OXIDIZED_CHISELED_COPPER = registerBlock("oxidized_chiseled_copper",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED,
                    FabricBlockSettings.copyOf(Blocks.OXIDIZED_CUT_COPPER).strength(3.0f).requiresTool()));

    public static final Block WAXED_CHISELED_COPPER = registerBlock("waxed_chiseled_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER = registerBlock("waxed_exposed_chiseled_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER = registerBlock("waxed_weathered_chiseled_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_CUT_COPPER).strength(3.0f).requiresTool()));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER = registerBlock("waxed_oxidized_chiseled_copper",
            new Block(FabricBlockSettings.copyOf(Blocks.WAXED_CUT_COPPER).strength(3.0f).requiresTool()));

    // Registering all the types of lined copper lamp blocks
    public static final Block LINED_COPPER_LAMP = registerBlock("lined_copper_lamp",
            new CopperLampBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()
                    .luminance(state -> state.get(CopperLampBlock.LIT) ? 15 : 0)));

    public static final Block EXPOSED_LINED_COPPER_LAMP = registerBlock("exposed_lined_copper_lamp",
            new CopperLampBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()
                    .luminance(state -> state.get(CopperLampBlock.LIT) ? 15 : 0)));

    public static final Block WEATHERED_LINED_COPPER_LAMP = registerBlock("weathered_lined_copper_lamp",
            new CopperLampBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()
                    .luminance(state -> state.get(CopperLampBlock.LIT) ? 15 : 0)));

    public static final Block OXIDIZED_LINED_COPPER_LAMP = registerBlock("oxidized_lined_copper_lamp",
            new CopperLampBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()
                    .luminance(state -> state.get(CopperLampBlock.LIT) ? 15 : 0)));

    public static final Block WAXED_LINED_COPPER_LAMP = registerBlock("waxed_lined_copper_lamp",
            new CopperLampBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()
                    .luminance(state -> state.get(CopperLampBlock.LIT) ? 15 : 0)));

    public static final Block WAXED_EXPOSED_LINED_COPPER_LAMP = registerBlock("waxed_exposed_lined_copper_lamp",
            new CopperLampBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()
                    .luminance(state -> state.get(CopperLampBlock.LIT) ? 15 : 0)));

    public static final Block WAXED_WEATHERED_LINED_COPPER_LAMP = registerBlock("waxed_weathered_lined_copper_lamp",
            new CopperLampBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()
                    .luminance(state -> state.get(CopperLampBlock.LIT) ? 15 : 0)));

    public static final Block WAXED_OXIDIZED_LINED_COPPER_LAMP = registerBlock("waxed_oxidized_lined_copper_lamp",
            new CopperLampBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()
                    .luminance(state -> state.get(CopperLampBlock.LIT) ? 15 : 0)));



    // Registering all the chain blocks
    public static final Block COPPER_CHAIN = registerBlock("copper_chain",
            new CopperChainBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CHAIN).strength(3.0f).requiresTool()));

    public static final Block EXPOSED_COPPER_CHAIN = registerBlock("exposed_copper_chain",
            new CopperChainBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.CHAIN).strength(3.0f).requiresTool()));

    public static final Block WEATHERED_COPPER_CHAIN = registerBlock("weathered_copper_chain",
            new CopperChainBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.CHAIN).strength(3.0f).requiresTool()));

    public static final Block OXIDIZED_COPPER_CHAIN = registerBlock("oxidized_copper_chain",
            new CopperChainBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.CHAIN).strength(3.0f).requiresTool()));

    public static final Block WAXED_COPPER_CHAIN = registerBlock("waxed_copper_chain",
            new CopperChainBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CHAIN).strength(3.0f).requiresTool()));

    public static final Block WAXED_EXPOSED_COPPER_CHAIN = registerBlock("waxed_exposed_copper_chain",
            new CopperChainBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.CHAIN).strength(3.0f).requiresTool()));

    public static final Block WAXED_WEATHERED_COPPER_CHAIN = registerBlock("waxed_weathered_copper_chain",
            new CopperChainBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.CHAIN).strength(3.0f).requiresTool()));

    public static final Block WAXED_OXIDIZED_COPPER_CHAIN = registerBlock("waxed_oxidized_copper_chain",
            new CopperChainBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.CHAIN).strength(3.0f).requiresTool()));



    // Registering all the door blocks
    public static final Block COPPER_DOOR = registerBlock("copper_door",
            new CopperDoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.create().mapColor(Blocks.COPPER_BLOCK.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(4.0f).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).strength(3.0f).requiresTool(),
                    ModBlockSetTypes.COPPER));
    public static final Block EXPOSED_COPPER_DOOR = registerBlock("exposed_copper_door",
            new CopperDoorBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(COPPER_DOOR), ModBlockSetTypes.COPPER));

    public static final Block WEATHERED_COPPER_DOOR = registerBlock("weathered_copper_door",
            new CopperDoorBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(COPPER_DOOR), ModBlockSetTypes.COPPER));

    public static final Block OXIDIZED_COPPER_DOOR = registerBlock("oxidized_copper_door",
            new CopperDoorBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(COPPER_DOOR), ModBlockSetTypes.COPPER));

    public static final Block WAXED_COPPER_DOOR = registerBlock("waxed_copper_door",
            new CopperDoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(COPPER_DOOR), ModBlockSetTypes.COPPER));

    public static final Block WAXED_EXPOSED_COPPER_DOOR = registerBlock("waxed_exposed_copper_door",
            new CopperDoorBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(COPPER_DOOR), ModBlockSetTypes.COPPER));

    public static final Block WAXED_WEATHERED_COPPER_DOOR = registerBlock("waxed_weathered_copper_door",
            new CopperDoorBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(COPPER_DOOR), ModBlockSetTypes.COPPER));

    public static final Block WAXED_OXIDIZED_COPPER_DOOR = registerBlock("waxed_oxidized_copper_door",
            new CopperDoorBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(COPPER_DOOR), ModBlockSetTypes.COPPER));




    // Registering all the trapdoor blocks
    public static final Block COPPER_TRAPDOOR = registerBlock("copper_trapdoor",
            new CopperTrapdoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.create().mapColor(Blocks.COPPER_BLOCK.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(4.0f).nonOpaque().allowsSpawning(ModBlocks::neverAllowsSpawning), ModBlockSetTypes.COPPER));
    public static final Block EXPOSED_COPPER_TRAPDOOR = registerBlock("exposed_copper_trapdoor",
            new CopperTrapdoorBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(COPPER_TRAPDOOR), ModBlockSetTypes.COPPER));

    public static final Block WEATHERED_COPPER_TRAPDOOR = registerBlock("weathered_copper_trapdoor",
            new CopperTrapdoorBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(COPPER_TRAPDOOR), ModBlockSetTypes.COPPER));

    public static final Block OXIDIZED_COPPER_TRAPDOOR = registerBlock("oxidized_copper_trapdoor",
            new CopperTrapdoorBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(COPPER_TRAPDOOR), ModBlockSetTypes.COPPER));

    public static final Block WAXED_COPPER_TRAPDOOR = registerBlock("waxed_copper_trapdoor",
            new CopperTrapdoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(COPPER_TRAPDOOR), ModBlockSetTypes.COPPER));

    public static final Block WAXED_EXPOSED_COPPER_TRAPDOOR = registerBlock("waxed_exposed_copper_trapdoor",
            new CopperTrapdoorBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(COPPER_TRAPDOOR), ModBlockSetTypes.COPPER));

    public static final Block WAXED_WEATHERED_COPPER_TRAPDOOR = registerBlock("waxed_weathered_copper_trapdoor",
            new CopperTrapdoorBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(COPPER_TRAPDOOR), ModBlockSetTypes.COPPER));

    public static final Block WAXED_OXIDIZED_COPPER_TRAPDOOR = registerBlock("waxed_oxidized_copper_trapdoor",
            new CopperTrapdoorBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(COPPER_TRAPDOOR), ModBlockSetTypes.COPPER));




    // Registering all the types of levitator blocks
    public static final Block LEVITATOR_BLOCK = registerBlock("levitator_block",
            new LevitatorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block EXPOSED_LEVITATOR_BLOCK = registerBlock("exposed_levitator_block",
            new ExposedLevitatorBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.EXPOSED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WEATHERED_LEVITATOR_BLOCK = registerBlock("weathered_levitator_block",
            new WeatheredLevitatorBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.WEATHERED_COPPER).strength(3.0f).requiresTool()));

    public static final Block OXIDIZED_LEVITATOR_BLOCK = registerBlock("oxidized_levitator_block",
            new OxidizedLevitatorBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.OXIDIZED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WAXED_LEVITATOR_BLOCK = registerBlock("waxed_levitator_block",
            new LevitatorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.WAXED_COPPER_BLOCK).strength(3.0f).requiresTool()));

    public static final Block WAXED_EXPOSED_LEVITATOR_BLOCK = registerBlock("waxed_exposed_levitator_block",
            new ExposedLevitatorBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.WAXED_EXPOSED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WAXED_WEATHERED_LEVITATOR_BLOCK = registerBlock("waxed_weathered_levitator_block",
            new WeatheredLevitatorBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.WAXED_WEATHERED_COPPER).strength(3.0f).requiresTool()));

    public static final Block WAXED_OXIDIZED_LEVITATOR_BLOCK = registerBlock("waxed_oxidized_levitator_block",
            new OxidizedLevitatorBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.WAXED_OXIDIZED_COPPER).strength(3.0f).requiresTool()));

    // Copper Sulfate related blocks
    public static final TorchBlock SULFATE_TORCH = (TorchBlock) registerCustomBlock("sulfate_torch",
            new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH).breakInstantly(), ModParticles.GREEN_FLAME_PARTICLE));

    public static final TorchBlock SULFATE_WALL_TORCH = (TorchBlock) registerCustomBlock("sulfate_wall_torch",
            new WallTorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH).breakInstantly(), ModParticles.GREEN_FLAME_PARTICLE));

    //public static final Block SULFATE_CAMPFIRE = registerBlock("sulfate_campfire",
            //new CopperSulfateCampfireBlock(false, 1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));

    public static final LanternBlock SULFATE_LANTERN = (LanternBlock) registerBlock("sulfate_lantern",
            new LanternBlock(FabricBlockSettings.copyOf(Blocks.LANTERN).requiresTool()));

    public static final Block BLOCK_OF_COPPER_SULFATE = registerBlock("block_of_copper_sulfate",
            new Block(FabricBlockSettings.copyOf(Blocks.BASALT)));

    public static final Block BLOCK_OF_COPPER_OXIDE = registerBlock("block_of_copper_oxide",
            new Block(FabricBlockSettings.copyOf(Blocks.BASALT)));


    // Copper Scaffholding Block
    //public static final Block COPPER_SCAFFHOLDING = registerBlock("copper_scaffholding",
           // new CopperScaffholdingBlock(FabricBlockSettings.copyOf(Blocks.SCAFFOLDING).strength(3.0f).sounds(BlockSoundGroup.COPPER)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CUMod.MOD_ID, name), block);
    }

    private static Block registerCustomBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(CUMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CUMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static Boolean neverAllowsSpawning(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return false;
    }

    /*private static ToIntFunction<BlockState> createLightLevelFromLitBlockState(int litLevel) {
        return state -> state.get(Properties.LIT) ? litLevel : 0;
    }*/

    public static void registerModBlocks() {
        CUMod.LOGGER.info("Registering ModBlocks for " + CUMod.MOD_ID);
    }
}
