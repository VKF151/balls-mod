package net.vance.balls.world.biome;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.MiscConfiguredFeatures;
import net.minecraft.world.gen.feature.MiscPlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.structure.Structures;
import net.vance.balls.BallsMod;
import net.vance.balls.world.ModPlacedFeatures;
import net.vance.balls.world.gen.ModOreGeneration;

import java.security.PublicKey;

public class ModBiomes {
    /*public static final RegistryKey<Biome> SUPERDEEP = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(BallsMod.MOD_ID, "superdeep"));

    public static void bootstrap(Registerable<Biome> context) {
        context.register(SUPERDEEP, superDeep(context));
    }

    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
        DefaultBiomeFeatures.addMineables(builder);
    }

    public static Biome superDeep(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.WATER_AMBIENT, new SpawnSettings.SpawnEntry(EntityType.GLOW_SQUID, 10, 1, 2));

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
        biomeBuilder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DEEPSLATE_PLATINUM_PLACED_KEY);


        return new Biome.Builder()
                .precipitation(false)
                .downfall(0.4f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(786539)
                        .waterFogColor(31)
                        .skyColor(0)
                        .fogColor(0)
                        .moodSound(BiomeMoodSound.CAVE).build())
                .build();
    }*/
}
