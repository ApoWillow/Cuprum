package net.apowillow.cu.util;

import net.apowillow.cu.CUMod;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.UseAction;

public class ModModelPredicateProvider {
    public static void registerModules() {
        registerCopperHorn(CUMod.COPPER_HORN);
    }

    public static void registerCopperHorn(Item item) {
        ModelPredicateProviderRegistry.register(item, new Identifier("tooting"), (stack, world, entity, seed) -> {
            if (entity != null && stack.getUseAction().equals(UseAction.TOOT_HORN) && entity.getStackInHand(Hand.MAIN_HAND).equals(stack)){
                if (entity.isUsingItem()) {
                    return 1;
                }

                return 0;
            }
            return 0;
        });
    }
}
