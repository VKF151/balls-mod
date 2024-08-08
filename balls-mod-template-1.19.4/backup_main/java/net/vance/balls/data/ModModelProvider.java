package net.vance.balls.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.vance.balls.block.ModBlocks;
import net.vance.balls.item.ModItems;
import net.vance.balls.item.custom.CopperArmorItem;
import net.vance.balls.item.custom.PlatinumArmorItem;
import net.vance.balls.item.custom.TitaniumArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_PLATINUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PLATINUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PLATINUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_PLATINUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.END_STONE_PLATINUM_ORE);

        blockStateModelGenerator.registerLog(ModBlocks.NI_LOG).log(ModBlocks.NI_LOG).wood(ModBlocks.NI_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_NI_LOG).log(ModBlocks.STRIPPED_NI_LOG).wood(ModBlocks.STRIPPED_NI_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NI_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NI_LEAVES);

        blockStateModelGenerator.registerTintableCross(ModBlocks.NI_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerSimpleState(ModBlocks.REPLICATOR_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PLATINUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PLATINUM_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PLATINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CURSED_COMPOUND, Models.GENERATED);

        itemModelGenerator.registerArmor(((PlatinumArmorItem)ModItems.PLATINUM_HELMET));
        itemModelGenerator.registerArmor(((PlatinumArmorItem)ModItems.PLATINUM_CHESTPLATE));
        itemModelGenerator.registerArmor((PlatinumArmorItem)(ModItems.PLATINUM_LEGGINGS));
        itemModelGenerator.registerArmor(((PlatinumArmorItem)ModItems.PLATINUM_BOOTS));

        itemModelGenerator.register(ModItems.PLATINUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PLATINUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.PLATINUM_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWORD_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.registerArmor(((CopperArmorItem)ModItems.COPPER_HELMET));
        itemModelGenerator.registerArmor(((CopperArmorItem)ModItems.COPPER_CHESTPLATE));
        itemModelGenerator.registerArmor(((CopperArmorItem)ModItems.COPPER_LEGGINGS));
        itemModelGenerator.registerArmor(((CopperArmorItem)ModItems.COPPER_BOOTS));

        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.COPPER_NUGGET, Models.HANDHELD);

        itemModelGenerator.registerArmor(((TitaniumArmorItem)ModItems.TITANIUM_HELMET));
        itemModelGenerator.registerArmor(((TitaniumArmorItem)ModItems.TITANIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((TitaniumArmorItem)ModItems.TITANIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((TitaniumArmorItem)ModItems.TITANIUM_BOOTS));

        itemModelGenerator.register(ModItems.TITANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.TITANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_SCRAP, Models.GENERATED);

        itemModelGenerator.register(Item.fromBlock(ModBlocks.NI_LOG), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.STRIPPED_NI_LOG), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.NI_WOOD), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.STRIPPED_NI_WOOD), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.NI_PLANKS), Models.GENERATED);
        itemModelGenerator.register(Item.fromBlock(ModBlocks.NI_LEAVES), Models.GENERATED);
    }
}
