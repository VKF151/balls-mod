package net.vance.balls.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.vance.balls.block.ModBlocks;
import net.vance.balls.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_PLATINUM), RecipeCategory.MISC, ModItems.PLATINUM_FRAGMENT,
                1, 200, "balls");
        offerBlasting(exporter, List.of(ModItems.RAW_PLATINUM), RecipeCategory.MISC, ModItems.PLATINUM_FRAGMENT,
                1, 100, "balls");

        offerSmelting(exporter, List.of(ModBlocks.END_STONE_PLATINUM_ORE), RecipeCategory.MISC, ModItems.PLATINUM_FRAGMENT,
                1, 200, "balls");
        offerBlasting(exporter, List.of(ModBlocks.END_STONE_PLATINUM_ORE), RecipeCategory.MISC, ModItems.PLATINUM_FRAGMENT,
                1, 100, "balls");

        offerSmelting(exporter, List.of(ModBlocks.ANCIENT_RUBBLE), RecipeCategory.MISC, ModItems.TITANIUM_SCRAP,
                1, 200, "balls");
        offerBlasting(exporter, List.of(ModBlocks.ANCIENT_RUBBLE), RecipeCategory.MISC, ModItems.TITANIUM_SCRAP,
                1, 100, "balls");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.REPLICATOR_BLOCK, 1)
                .pattern("qeq")
                .pattern("bib")
                .pattern("c c")
                .input('q', Items.QUARTZ)
                .input('e', Blocks.ENCHANTING_TABLE)
                .input('b', Items.BLAZE_ROD)
                .input('i', Items.IRON_INGOT)
                .input('c', Blocks.CRAFTING_TABLE)
                .criterion(FabricRecipeProvider.hasItem(Blocks.ENCHANTING_TABLE),
                        FabricRecipeProvider.conditionsFromItem(Blocks.ENCHANTING_TABLE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.REPLICATOR_BLOCK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_INGOT)
                        .input(ModItems.TITANIUM_SCRAP)
                        .input(ModItems.TITANIUM_SCRAP)
                        .input(ModItems.TITANIUM_SCRAP)
                        .input(ModItems.TITANIUM_SCRAP)
                        .input(Items.COPPER_INGOT)
                        .input(Items.COPPER_INGOT)
                        .input(Items.COPPER_INGOT)
                        .input(Items.COPPER_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ANCIENT_RUBBLE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.ANCIENT_RUBBLE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_SCRAP)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PLATINUM_INGOT)
                        .input(ModItems.PLATINUM_FRAGMENT)
                        .input(ModItems.PLATINUM_FRAGMENT)
                        .input(ModItems.PLATINUM_FRAGMENT)
                        .input(ModItems.PLATINUM_FRAGMENT)
                        .input(Items.COPPER_INGOT)
                        .input(Items.COPPER_INGOT)
                        .input(Items.COPPER_INGOT)
                        .input(Items.COPPER_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RAW_PLATINUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RAW_PLATINUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.PLATINUM_FRAGMENT)));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PLATINUM_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.PLATINUM_BLOCK);

        offerSmithingTemplateCopyingRecipe(exporter, ModItems.PLATINUM_UPGRADE_SMITHING_TEMPLATE, Items.END_STONE);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.SWORD_UPGRADE_SMITHING_TEMPLATE, Items.COBBLED_DEEPSLATE);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.TITANIUM_UPGRADE_SMITHING_TEMPLATE, Items.NETHERRACK);

        offerBarkBlockRecipe(exporter, ModBlocks.NI_WOOD, ModBlocks.NI_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_NI_WOOD, ModBlocks.STRIPPED_NI_LOG);
        offerShapelessRecipe(exporter, ModBlocks.NI_PLANKS, ModBlocks.NI_LOG, "misc", 4);
        offerShapelessRecipe(exporter, ModBlocks.NI_PLANKS, ModBlocks.STRIPPED_NI_LOG, "misc", 4);
        offerShapelessRecipe(exporter, ModBlocks.NI_PLANKS, ModBlocks.NI_WOOD, "misc", 4);
        offerShapelessRecipe(exporter, ModBlocks.NI_PLANKS, ModBlocks.STRIPPED_NI_WOOD, "misc", 4);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.COPPER_NUGGET, RecipeCategory.MISC, Items.COPPER_INGOT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STICK, 2)
                .pattern("# ")
                .pattern("# ")
                .input('#', ModBlocks.NI_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NI_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.NI_PLANKS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.STICK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_HELMET)
                .pattern("###")
                .pattern("# #")
                .input('#', Items.COPPER_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.COPPER_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_CHESTPLATE)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', Items.COPPER_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.COPPER_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_LEGGINGS)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', Items.COPPER_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.COPPER_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_BOOTS)
                .pattern("# #")
                .pattern("# #")
                .input('#', Items.COPPER_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.COPPER_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_SWORD)
                .pattern("#")
                .pattern("#")
                .pattern("s")
                .input('#', Items.COPPER_INGOT)
                .input('s', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.COPPER_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_PICKAXE)
                .pattern("###")
                .pattern(" s ")
                .pattern(" s ")
                .input('#', Items.COPPER_INGOT)
                .input('s', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.COPPER_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_AXE)
                .pattern("##")
                .pattern("#s")
                .pattern(" s")
                .input('#', Items.COPPER_INGOT)
                .input('s', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.COPPER_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_SHOVEL)
                .pattern("#")
                .pattern("s")
                .pattern("s")
                .input('#', Items.COPPER_INGOT)
                .input('s', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.COPPER_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPER_HOE)
                .pattern("##")
                .pattern(" s")
                .pattern(" s")
                .input('#', Items.COPPER_INGOT)
                .input('s', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(Items.COPPER_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.COPPER_HOE)));


    }
}
