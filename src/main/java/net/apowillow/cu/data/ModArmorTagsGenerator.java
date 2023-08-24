package net.apowillow.cu.data;

import net.apowillow.cu.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModArmorTagsGenerator extends FabricTagProvider.ItemTagProvider {
    public ModArmorTagsGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output,completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ROSE_GOLD_HELMET, ModItems.ROSE_GOLD_CHESTPLATE, ModItems.ROSE_GOLD_LEGGINGS, ModItems.ROSE_GOLD_BOOTS);
    }
}
