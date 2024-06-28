package net.vance.balls.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.vance.balls.BallsMod;
import net.vance.balls.block.ModBlockTags;
import net.vance.balls.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> NI_SHRUB_KEY = registerKey("ni_shrub");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_PLATINUM_ORE_KEY = registerKey("end_platinum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANCIENT_RUBBLE_KEY = registerKey("ancient_rubble");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context){
        RuleTest endStoneReplaceables = new TagMatchRuleTest(ModBlockTags.END_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> endPlatinumOre =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, ModBlocks.END_STONE_PLATINUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> ancientRubble =
                List.of(OreFeatureConfig.createTarget(netherrackReplaceables, ModBlocks.ANCIENT_RUBBLE.getDefaultState()));

        register(context, NI_SHRUB_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.NI_LOG),
                new StraightTrunkPlacer(4, 4 ,2),
                BlockStateProvider.of(ModBlocks.NI_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, END_PLATINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endPlatinumOre, 2, 0.8f));
        register(context, ANCIENT_RUBBLE_KEY, Feature.ORE, new OreFeatureConfig(ancientRubble, 3, 1.0f));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BallsMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
