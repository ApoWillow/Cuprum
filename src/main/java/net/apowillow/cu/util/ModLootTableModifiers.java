package net.apowillow.cu.util;

import net.apowillow.cu.CUMod;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {

    //change the id and path
    private static final Identifier CREEPER_ID = new Identifier("minecraft", "entities/creeper");

    public static void modifyLootTables(){
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) ->
        {
            if (CREEPER_ID.equals(id)) {
                createLootPoolBuilder(1f, CUMod.COPPER_HORN);
            }
        });
    }

    private static LootPool.Builder createLootPoolBuilder(float chance, Item item) {
        return LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .conditionally(RandomChanceLootCondition.builder(chance))
                .with(ItemEntry.builder(item));
    }

    private static LootPool.Builder createLootPoolBuilderWithCount(float chance, Item item, float min, float max) {
        return LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .conditionally(RandomChanceLootCondition.builder(chance))
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max)))
                .with(ItemEntry.builder(item));
    }
}
