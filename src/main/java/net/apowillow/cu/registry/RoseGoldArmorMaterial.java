package net.apowillow.cu.registry;

import net.apowillow.cu.CUMod;
import net.apowillow.cu.item.ModItems;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class RoseGoldArmorMaterial implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {643, 750, 721, 692};
    private static final int[] PROTECTION_VALUES = new int[] {2, 5, 6, 2};

    // In which A is boots, B leggings, C chestplate, and D helmet.

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return PROTECTION_VALUES[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.ROSE_GOLD_INGOT);
    }

    @Override
    public String getName() {
        return "rose_gold";
    }

    @Override
    public float getToughness() {
        return 0.5f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
