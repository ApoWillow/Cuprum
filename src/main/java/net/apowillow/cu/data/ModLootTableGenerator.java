package net.apowillow.cu.data;

import net.apowillow.cu.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //Adds all the loot tables for smooth copper variants and the waxed version
        addDrop(ModBlocks.SMOOTH_COPPER);
        addDrop(ModBlocks.EXPOSED_SMOOTH_COPPER);
        addDrop(ModBlocks.WEATHERED_SMOOTH_COPPER);
        addDrop(ModBlocks.OXIDIZED_SMOOTH_COPPER);
        addDrop(ModBlocks.WAXED_SMOOTH_COPPER);
        addDrop(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER);
        addDrop(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER);
        addDrop(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER);

        //Adds the loot table for edgy copper variants and it's waxed version
        addDrop(ModBlocks.EDGY_COPPER);
        addDrop(ModBlocks.EXPOSED_EDGY_COPPER);
        addDrop(ModBlocks.WEATHERED_EDGY_COPPER);
        addDrop(ModBlocks.OXIDIZED_EDGY_COPPER);
        addDrop(ModBlocks.WAXED_EDGY_COPPER);
        addDrop(ModBlocks.WAXED_EXPOSED_EDGY_COPPER);
        addDrop(ModBlocks.WAXED_WEATHERED_EDGY_COPPER);
        addDrop(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER);

        //Adds all the Levitator block variants including the waxed version
        addDrop(ModBlocks.LEVITATOR_BLOCK);
        addDrop(ModBlocks.EXPOSED_LEVITATOR_BLOCK);
        addDrop(ModBlocks.WEATHERED_LEVITATOR_BLOCK);
        addDrop(ModBlocks.OXIDIZED_LEVITATOR_BLOCK);
        addDrop(ModBlocks.WAXED_LEVITATOR_BLOCK);
        addDrop(ModBlocks.WAXED_EXPOSED_LEVITATOR_BLOCK);
        addDrop(ModBlocks.WAXED_WEATHERED_LEVITATOR_BLOCK);
        addDrop(ModBlocks.WAXED_OXIDIZED_LEVITATOR_BLOCK);
    }
}
