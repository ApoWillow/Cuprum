package net.apowillow.cu.item;

import net.apowillow.cu.CUMod;
import net.apowillow.cu.ModToolMaterials;
import net.apowillow.cu.item.custom.CopperAnchor;
import net.apowillow.cu.item.custom.CopperWrenchItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    // Registers all the Rose gold related items.
    public static Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot",
            new Item(new FabricItemSettings()));
    public static SwordItem ROSE_GOLD_SWORD = (SwordItem) registerItem("rose_gold_sword",
            new SwordItem(ModToolMaterials.ROSE_GOLD, 6,0.16f,
                    new FabricItemSettings()));
    public static ShovelItem ROSE_GOLD_SHOVEL = (ShovelItem) registerItem("rose_gold_shovel",
            new ShovelItem(ModToolMaterials.ROSE_GOLD, 5,0.7f,
                    new FabricItemSettings()));
    public static PickaxeItem ROSE_GOLD_PICKAXE = (PickaxeItem) registerItem("rose_gold_pickaxe",
            new PickaxeItem(ModToolMaterials.ROSE_GOLD, 5,0.9f,
                    new FabricItemSettings()));
    public static HoeItem ROSE_GOLD_HOE = (HoeItem) registerItem("rose_gold_hoe",
            new HoeItem(ModToolMaterials.ROSE_GOLD, 1,0.9f,
                    new FabricItemSettings()));
    public static AxeItem ROSE_GOLD_AXE = (AxeItem) registerItem("rose_gold_axe",
            new AxeItem(ModToolMaterials.ROSE_GOLD, 8,0.10f,
                    new FabricItemSettings()));

    // Copper Oxide
    public static Item COPPER_OXIDE = registerItem("copper_oxide",
            new Item(new FabricItemSettings()));

    // Copper Wrench
    public static Item COPPER_WRENCH = registerItem("copper_wrench",
            new CopperWrenchItem(new FabricItemSettings().maxCount(1).maxDamage(2)));

    // Copper Anchor
    public static SwordItem COPPER_ANCHOR = (SwordItem) registerItem("copper_anchor",
            new CopperAnchor(ModToolMaterials.COPPER,6, 1.1f, new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CUMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CUMod.LOGGER.info("Registering Mod Items for " + CUMod.MOD_ID); }
}
