package net.vance.balls.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.gen.GenerationStep;
import net.vance.balls.BallsMod;
import net.vance.balls.world.ModPlacedFeatures;
import net.vance.balls.world.biome.ModBiomes;
import net.vance.balls.world.dimension.ModDimensions;

import java.util.function.Predicate;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_PLATINUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ANCIENT_RUBBLE_PLACED_KEY);
    }

    /*public static Predicate<BiomeSelectionContext> foundInTheOceanWorld() {
        return context -> context.canGenerateIn(ModDimensions.OCEANWORLD_KEY);
    }*/
}
