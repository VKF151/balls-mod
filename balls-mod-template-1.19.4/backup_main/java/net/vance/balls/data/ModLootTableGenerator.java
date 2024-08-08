package net.vance.balls.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.vance.balls.block.ModBlocks;
import net.vance.balls.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PLATINUM_BLOCK);
        addDrop(ModBlocks.RAW_PLATINUM_BLOCK);
        addDrop(ModBlocks.ANCIENT_RUBBLE);

        addDrop(ModBlocks.PLATINUM_ORE, oreDrops(ModBlocks.PLATINUM_ORE, ModItems.RAW_PLATINUM));
        addDrop(ModBlocks.DEEPSLATE_PLATINUM_ORE, oreDrops(ModBlocks.DEEPSLATE_PLATINUM_ORE, ModItems.RAW_PLATINUM));
        addDrop(ModBlocks.END_STONE_PLATINUM_ORE, oreDrops(ModBlocks.END_STONE_PLATINUM_ORE, ModItems.RAW_PLATINUM));

        addDrop(ModBlocks.NI_LOG);
        addDrop(ModBlocks.STRIPPED_NI_LOG);
        addDrop(ModBlocks.NI_WOOD);
        addDrop(ModBlocks.STRIPPED_NI_WOOD);
        addDrop(ModBlocks.NI_PLANKS);
        addDrop(ModBlocks.NI_SAPLING);
    }
}
