package net.vance.balls.block;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> END_ORE_REPLACEABLES = TagKey.of(RegistryKeys.BLOCK, new Identifier("balls_mod", "end_ore_replaceables"));
}
