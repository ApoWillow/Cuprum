package net.apowillow.cu.util;

import net.apowillow.cu.CUMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static final TagKey<Block> COPPER_WRENCH_IGNORED = createBlockTag("copper_wrench_ignored");

    private static TagKey<Block> createBlockTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(CUMod.MOD_ID, name));
    }
}
