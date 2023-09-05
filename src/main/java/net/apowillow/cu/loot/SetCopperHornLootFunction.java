package net.apowillow.cu.loot;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import net.apowillow.cu.CUMod;
import net.apowillow.cu.item.custom.CopperHornItem;
import net.apowillow.cu.registry.copper_horn.CopperHornInstrument;
import net.apowillow.cu.registry.copper_horn.CopperHornRegistries;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.function.ConditionalLootFunction;
import net.minecraft.loot.function.LootFunctionType;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;

public class SetCopperHornLootFunction extends ConditionalLootFunction {
    final TagKey<CopperHornInstrument> instrumentTagKey;

    SetCopperHornLootFunction(LootCondition[] lootConditions, TagKey<CopperHornInstrument> tagKey) {
        super(lootConditions);
        this.instrumentTagKey = tagKey;
    }

    @Override
    public LootFunctionType getType() {
        return CUMod.SET_COPPER_HORN_INSTRUMENT;
    }

    @Override
    public ItemStack process(ItemStack stack, LootContext context) {
        CopperHornItem.setRandomInstrumentFromTag(stack, this.instrumentTagKey, context.getRandom());
        return stack;
    }

    public static ConditionalLootFunction.Builder<?> builder(TagKey<CopperHornInstrument> tagKey) {
        return SetCopperHornLootFunction.builder((LootCondition[] lootConditions) -> new SetCopperHornLootFunction(lootConditions, tagKey));
    }

    public static class Serializer extends ConditionalLootFunction.Serializer<SetCopperHornLootFunction> {
        @Override
        public void toJson(JsonObject jsonObject, SetCopperHornLootFunction setGoatHornSoundLootFunction, JsonSerializationContext jsonSerializationContext) {
            super.toJson(jsonObject, setGoatHornSoundLootFunction, jsonSerializationContext);
            jsonObject.addProperty("options", "#" + setGoatHornSoundLootFunction.instrumentTagKey.id());
        }

        @Override
        public SetCopperHornLootFunction fromJson(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, LootCondition[] lootConditions) {
            String string = JsonHelper.getString(jsonObject, "options");
            if (!string.startsWith("#")) {
                throw new JsonSyntaxException("Inline tag value not supported: " + string);
            }
            return new SetCopperHornLootFunction(lootConditions, TagKey.of(CopperHornRegistries.COPPER_HORN_INSTRUMENT_KEY, new Identifier(string.substring(1))));
        }
    }
}
