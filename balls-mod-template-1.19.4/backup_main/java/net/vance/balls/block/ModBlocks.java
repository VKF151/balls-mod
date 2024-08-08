package net.vance.balls.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.vance.balls.BallsMod;
import net.vance.balls.block.entity.ReplicatorBlockEntity;
import net.vance.balls.item.ModItemGroup;
import net.vance.balls.item.ModItems;
import net.vance.balls.world.tree.NiSaplingGenerator;

public class ModBlocks {
    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(5,9)));

    public static final Block DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(5,9)));

    public static final Block END_STONE_PLATINUM_ORE = registerBlock("end_stone_platinum_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(5,9)));

    public static final Block RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final Block ANCIENT_RUBBLE = registerBlock("ancient_rubble",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).strength(4.0f).requiresTool()));


    public static final Block NI_LOG = registerBlock("ni_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM).strength(3.0f)));

    public static final Block NI_WOOD = registerBlock("ni_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_HYPHAE).strength(2.0f)));

    public static final Block STRIPPED_NI_LOG = registerBlock("stripped_ni_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_STEM).strength(3.0f)));

    public static final Block STRIPPED_NI_WOOD = registerBlock("stripped_ni_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CRIMSON_HYPHAE).strength(2.0f)));


    public static final Block NI_PLANKS = registerBlock("ni_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS).strength(2.0f)));

    public static final Block NI_LEAVES = registerBlock("ni_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.2f)));

    public static final Block REPLICATOR_BLOCK = registerBlock("replicator",
            new Replicator(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));



    public static final Block NI_SAPLING = registerBlock("ni_sapling",
            new EndSaplingBlock(new NiSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).breakInstantly()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BallsMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(BallsMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerModBlocks() {
        BallsMod.LOGGER.info("Registering ModBlocks for " + BallsMod.MOD_ID);
    }
}
