package net.apowillow.cu.item;


import net.apowillow.cu.CUMod;
import net.apowillow.cu.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static ItemGroup SMOOTH_COPPER = Registry.register(Registries.ITEM_GROUP, new Identifier(CUMod.MOD_ID, "smooth_copper"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.cu"))
                    .icon(() -> new ItemStack(Items.COPPER_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SMOOTH_COPPER);
                        entries.add(ModBlocks.EXPOSED_SMOOTH_COPPER);
                        entries.add(ModBlocks.WEATHERED_SMOOTH_COPPER);
                        entries.add(ModBlocks.OXIDIZED_SMOOTH_COPPER);
                        entries.add(ModBlocks.WAXED_SMOOTH_COPPER);
                        entries.add(ModBlocks.WAXED_EXPOSED_SMOOTH_COPPER);
                        entries.add(ModBlocks.WAXED_WEATHERED_SMOOTH_COPPER);
                        entries.add(ModBlocks.WAXED_OXIDIZED_SMOOTH_COPPER);

                        entries.add(ModBlocks.EDGY_COPPER);
                        entries.add(ModBlocks.EXPOSED_EDGY_COPPER);
                        entries.add(ModBlocks.WEATHERED_EDGY_COPPER);
                        entries.add(ModBlocks.OXIDIZED_EDGY_COPPER);
                        entries.add(ModBlocks.WAXED_EDGY_COPPER);
                        entries.add(ModBlocks.WAXED_EXPOSED_EDGY_COPPER);
                        entries.add(ModBlocks.WAXED_WEATHERED_EDGY_COPPER);
                        entries.add(ModBlocks.WAXED_OXIDIZED_EDGY_COPPER);

                        entries.add(ModBlocks.LEVITATOR_BLOCK);
                        entries.add(ModBlocks.EXPOSED_LEVITATOR_BLOCK);
                        entries.add(ModBlocks.WEATHERED_LEVITATOR_BLOCK);
                        entries.add(ModBlocks.OXIDIZED_LEVITATOR_BLOCK);
                        entries.add(ModBlocks.WAXED_LEVITATOR_BLOCK);
                        entries.add(ModBlocks.WAXED_EXPOSED_LEVITATOR_BLOCK);
                        entries.add(ModBlocks.WAXED_WEATHERED_LEVITATOR_BLOCK);
                        entries.add(ModBlocks.WAXED_OXIDIZED_LEVITATOR_BLOCK);

                    }).build());

    public static void registerItemGroups() {

    }

}
