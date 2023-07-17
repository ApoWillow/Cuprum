package net.apowillow.cu.item;

import net.apowillow.cu.CUMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {



    private static Item registeritem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CUMod.MOD_ID, name), item);

    }
    public static void registerModItems() {
        CUMod.LOGGER.debug("Registering Mod Items for " + CUMod.MOD_ID); }
}