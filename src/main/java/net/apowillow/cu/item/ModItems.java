package net.apowillow.cu.item;

import net.apowillow.cu.CUMod;
import net.apowillow.cu.item.custom.CopperAnchorItem;
import net.apowillow.cu.item.custom.CopperOxideItem;
import net.apowillow.cu.item.custom.CopperWrenchItem;
import net.apowillow.cu.block.ModBlocks;
import net.apowillow.cu.registry.RoseGoldArmorMaterial;
import net.apowillow.cu.registry.RoseGoldToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;


public class ModItems {

    // Registers all the sulfate related items.
    public static Item COPPER_SULFATE = registerItem("copper_sulfate",
            new Item(new FabricItemSettings()));
    public static final Item SULFATE_TORCH = registerItem("sulfate_torch", new VerticallyAttachableBlockItem(ModBlocks.SULFATE_TORCH,
            ModBlocks.SULFATE_WALL_TORCH, new FabricItemSettings(), Direction.DOWN));

    // Registers all the Rose gold related tools.
    public static Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot",
            new Item(new FabricItemSettings()));
    public static Item ROSE_GOLD_SWORD = registerItem("rose_gold_sword",
            new SwordItem(RoseGoldToolMaterial.ROSE_GOLD, 5,-2.3f,
                    new FabricItemSettings()));
    public static Item ROSE_GOLD_SHOVEL = registerItem("rose_gold_shovel",
            new ShovelItem(RoseGoldToolMaterial.ROSE_GOLD, 4,-3.0f,
                    new FabricItemSettings()));
    public static Item ROSE_GOLD_PICKAXE = registerItem("rose_gold_pickaxe",
            new PickaxeItem(RoseGoldToolMaterial.ROSE_GOLD, 4,-2.8f,
                    new FabricItemSettings()));
    public static Item ROSE_GOLD_HOE = registerItem("rose_gold_hoe",
            new HoeItem(RoseGoldToolMaterial.ROSE_GOLD, 0,-1.0f,
                    new FabricItemSettings()));
    public static Item ROSE_GOLD_AXE = registerItem("rose_gold_axe",
            new AxeItem(RoseGoldToolMaterial.ROSE_GOLD, 8,-3.1f,
                    new FabricItemSettings()));
    // Rose Gold Armor Material
    public static final ArmorMaterial ROSE_GOLD_ARMOR_MATERIAL = new RoseGoldArmorMaterial();

    // Rose Gold Armor
    public static final Item ROSE_GOLD_HELMET = registerItem("rose_gold_helmet",
            new ArmorItem(ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new FabricItemSettings()));
    public static final Item ROSE_GOLD_CHESTPLATE = registerItem("rose_gold_chestplate",
            new ArmorItem(ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings()));
    public static final Item ROSE_GOLD_LEGGINGS = registerItem("rose_gold_leggings",
            new ArmorItem(ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings()));
    public static final Item ROSE_GOLD_BOOTS = registerItem("rose_gold_boots",
            new ArmorItem(ROSE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new FabricItemSettings()));

    // Copper Oxide
    public static Item COPPER_OXIDE = registerItem("copper_oxide",
            new CopperOxideItem(new FabricItemSettings()));

    // Copper Wrench
    public static Item COPPER_WRENCH = registerItem("copper_wrench",
            new CopperWrenchItem(new FabricItemSettings().maxCount(1).maxDamage(64)));

    // Copper Anchor
    public static SwordItem COPPER_ANCHOR = (SwordItem) registerItem("copper_anchor",
            new CopperAnchorItem(RoseGoldToolMaterial.COPPER,6,-2.7f, new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CUMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CUMod.LOGGER.info("Registering Mod Items for " + CUMod.MOD_ID); }
}
