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

        //Adds all the drops for the smooth copper variants and the waxed version
        addDrop(ModBlocks.SMOOTH_COPPER);
        addDrop(ModBlocks.EXPOSED_SMOOTH_COPPER);
        addDrop(ModBlocks.WEATHERED_SMOOTH_COPPER);
        addDrop(ModBlocks.OXIDIZED_SMOOTH_COPPER);
        addDrop(ModBlocks.WAXED_SMOOTH_COPPER);
        addDrop(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER);
        addDrop(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER);
        addDrop(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER);

        addDrop(ModBlocks.SMOOTH_COPPER_SLAB, slabDrops(ModBlocks.SMOOTH_COPPER_SLAB));
        addDrop(ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB, slabDrops(ModBlocks.EXPOSED_SMOOTH_COPPER_SLAB));
        addDrop(ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB, slabDrops(ModBlocks.WEATHERED_SMOOTH_COPPER_SLAB));
        addDrop(ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB, slabDrops(ModBlocks.OXIDIZED_SMOOTH_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_SMOOTH_COPPER_SLAB, slabDrops(ModBlocks.WAXED_SMOOTH_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_SLAB, slabDrops(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_SLAB, slabDrops(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_SLAB, slabDrops(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_SLAB));

        addDrop(ModBlocks.SMOOTH_COPPER_STAIRS, ModBlocks.SMOOTH_COPPER_STAIRS);
        addDrop(ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS, ModBlocks.EXPOSED_SMOOTH_COPPER_STAIRS);
        addDrop(ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS, ModBlocks.WEATHERED_SMOOTH_COPPER_STAIRS);
        addDrop(ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS, ModBlocks.OXIDIZED_SMOOTH_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_SMOOTH_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER_STAIRS);

        //Adds the drops for the edgy copper variants and it's waxed version
        addDrop(ModBlocks.EDGY_COPPER);
        addDrop(ModBlocks.EXPOSED_EDGY_COPPER);
        addDrop(ModBlocks.WEATHERED_EDGY_COPPER);
        addDrop(ModBlocks.OXIDIZED_EDGY_COPPER);
        addDrop(ModBlocks.WAXED_EDGY_COPPER);
        addDrop(ModBlocks.WAXED_EXPOSED_EDGY_COPPER);
        addDrop(ModBlocks.WAXED_WEATHERED_EDGY_COPPER);
        addDrop(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER);

        addDrop(ModBlocks.EDGY_COPPER_SLAB, slabDrops(ModBlocks.EDGY_COPPER_SLAB));
        addDrop(ModBlocks.EXPOSED_EDGY_COPPER_SLAB, slabDrops(ModBlocks.EXPOSED_EDGY_COPPER_SLAB));
        addDrop(ModBlocks.WEATHERED_EDGY_COPPER_SLAB, slabDrops(ModBlocks.WEATHERED_EDGY_COPPER_SLAB));
        addDrop(ModBlocks.OXIDIZED_EDGY_COPPER_SLAB, slabDrops(ModBlocks.OXIDIZED_EDGY_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_EDGY_COPPER_SLAB, slabDrops(ModBlocks.WAXED_EDGY_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_EXPOSED_EDGY_COPPER_SLAB, slabDrops(ModBlocks.WAXED_EXPOSED_EDGY_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_WEATHERED_EDGY_COPPER_SLAB, slabDrops(ModBlocks.WAXED_WEATHERED_EDGY_COPPER_SLAB));
        addDrop(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_SLAB, slabDrops(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_SLAB));

        addDrop(ModBlocks.EDGY_COPPER_STAIRS, ModBlocks.EDGY_COPPER_STAIRS);
        addDrop(ModBlocks.EXPOSED_EDGY_COPPER_STAIRS, ModBlocks.EXPOSED_EDGY_COPPER_STAIRS);
        addDrop(ModBlocks.WEATHERED_EDGY_COPPER_STAIRS, ModBlocks.WEATHERED_EDGY_COPPER_STAIRS);
        addDrop(ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS, ModBlocks.OXIDIZED_EDGY_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_EDGY_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_EXPOSED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_EXPOSED_EDGY_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_WEATHERED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_WEATHERED_EDGY_COPPER_STAIRS);
        addDrop(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_STAIRS, ModBlocks.WAXED_OXIDIZED_EDGY_COPPER_STAIRS);

        //Adds all the drops for the copper lamp variants including the waxed versions
        addDrop(ModBlocks.COPPER_LAMP);
        addDrop(ModBlocks.EXPOSED_COPPER_LAMP);
        addDrop(ModBlocks.WEATHERED_COPPER_LAMP);
        addDrop(ModBlocks.OXIDIZED_COPPER_LAMP);
        addDrop(ModBlocks.WAXED_COPPER_LAMP);
        addDrop(ModBlocks.WAXED_EXPOSED_COPPER_LAMP);
        addDrop(ModBlocks.WAXED_WEATHERED_COPPER_LAMP);
        addDrop(ModBlocks.WAXED_OXIDIZED_COPPER_LAMP);

        //Adds all the drops for the lined copper lamp variants including the waxed versions
        addDrop(ModBlocks.LINED_COPPER_LAMP);
        addDrop(ModBlocks.EXPOSED_LINED_COPPER_LAMP);
        addDrop(ModBlocks.WEATHERED_LINED_COPPER_LAMP);
        addDrop(ModBlocks.OXIDIZED_LINED_COPPER_LAMP);
        addDrop(ModBlocks.WAXED_LINED_COPPER_LAMP);
        addDrop(ModBlocks.WAXED_EXPOSED_LINED_COPPER_LAMP);
        addDrop(ModBlocks.WAXED_WEATHERED_LINED_COPPER_LAMP);
        addDrop(ModBlocks.WAXED_OXIDIZED_LINED_COPPER_LAMP);

        //Adds all the drops for the Levitator block variants including the waxed version
        addDrop(ModBlocks.LEVITATOR_BLOCK);
        addDrop(ModBlocks.EXPOSED_LEVITATOR_BLOCK);
        addDrop(ModBlocks.WEATHERED_LEVITATOR_BLOCK);
        addDrop(ModBlocks.OXIDIZED_LEVITATOR_BLOCK);
        addDrop(ModBlocks.WAXED_LEVITATOR_BLOCK);
        addDrop(ModBlocks.WAXED_EXPOSED_LEVITATOR_BLOCK);
        addDrop(ModBlocks.WAXED_WEATHERED_LEVITATOR_BLOCK);
        addDrop(ModBlocks.WAXED_OXIDIZED_LEVITATOR_BLOCK);

        //Adds all the drops for the Copper Scaffholding block variants including the waxed version
        //addDrop(ModBlocks.COPPER_SCAFFHOLDING);
    }
}
