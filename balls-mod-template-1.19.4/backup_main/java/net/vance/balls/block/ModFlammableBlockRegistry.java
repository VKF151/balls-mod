package net.vance.balls.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.NI_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_NI_LOG, 5, 5);
        registry.add(ModBlocks.NI_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_NI_WOOD, 5, 5);
        registry.add(ModBlocks.NI_PLANKS, 30, 60);
        registry.add(ModBlocks.NI_LEAVES, 5, 20);
    }
}
