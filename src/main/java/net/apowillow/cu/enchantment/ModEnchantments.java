package net.apowillow.cu.enchantment;

import net.apowillow.cu.CUMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {

    private static Enchantment register(String name, Enchantment enchantment){
        return Registry.register(Registries.ENCHANTMENT, new Identifier(CUMod.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments(){
        CUMod.LOGGER.info("Registering Enchantments for " + CUMod.MOD_ID);
    }
}
