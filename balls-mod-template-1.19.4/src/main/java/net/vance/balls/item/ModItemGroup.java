package net.vance.balls.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.vance.balls.BallsMod;
import net.vance.balls.block.ModBlocks;

public class ModItemGroup {
    public static ItemGroup BALLS = Registry.register(Registries.ITEM_GROUP, new Identifier(BallsMod.MOD_ID, "balls_mod"),
                    FabricItemGroup.builder()
            .displayName(Text.translatable("itemgroup.balls"))
            .icon(() -> new ItemStack(ModItems.PLATINUM_INGOT)).entries((displayContext, entries) -> {
                entries.add(ModItems.PLATINUM_INGOT);
                entries.add(ModItems.PLATINUM_FRAGMENT);
                entries.add(ModItems.RAW_PLATINUM);

                entries.add(ModBlocks.PLATINUM_BLOCK);
                entries.add(ModBlocks.RAW_PLATINUM_BLOCK);
                entries.add(ModBlocks.END_STONE_PLATINUM_ORE);
                entries.add(ModBlocks.DEEPSLATE_PLATINUM_ORE);
                entries.add(ModBlocks.PLATINUM_ORE);

                entries.add(ModItems.TITANIUM_INGOT);
                entries.add(ModItems.TITANIUM_SCRAP);
                entries.add(ModBlocks.ANCIENT_RUBBLE);

                entries.add(ModItems.PLATINUM_UPGRADE_SMITHING_TEMPLATE);
                entries.add(ModItems.TITANIUM_UPGRADE_SMITHING_TEMPLATE);
                entries.add(ModItems.SWORD_UPGRADE_SMITHING_TEMPLATE);

                entries.add(ModItems.CURSED_COMPOUND);

                entries.add(ModBlocks.NI_SAPLING);
                entries.add(ModBlocks.NI_LOG);
                entries.add(ModBlocks.NI_WOOD);
                entries.add(ModBlocks.STRIPPED_NI_LOG);
                entries.add(ModBlocks.STRIPPED_NI_WOOD);
                entries.add(ModBlocks.NI_PLANKS);
                entries.add(ModBlocks.NI_LEAVES);

                entries.add(ModItems.COPPER_NUGGET);

                entries.add(ModItems.COPPER_HELMET);
                entries.add(ModItems.COPPER_CHESTPLATE);
                entries.add(ModItems.COPPER_LEGGINGS);
                entries.add(ModItems.COPPER_BOOTS);

                entries.add(ModItems.COPPER_SWORD);
                entries.add(ModItems.COPPER_PICKAXE);
                entries.add(ModItems.COPPER_AXE);
                entries.add(ModItems.COPPER_SHOVEL);
                entries.add(ModItems.COPPER_HOE);

                entries.add(ModItems.TITANIUM_HELMET);
                entries.add(ModItems.TITANIUM_CHESTPLATE);
                entries.add(ModItems.TITANIUM_LEGGINGS);
                entries.add(ModItems.TITANIUM_BOOTS);

                entries.add(ModItems.TITANIUM_SWORD);
                entries.add(ModItems.TITANIUM_PICKAXE);
                entries.add(ModItems.TITANIUM_AXE);
                entries.add(ModItems.TITANIUM_SHOVEL);
                entries.add(ModItems.TITANIUM_HOE);

                entries.add(ModItems.PLATINUM_HELMET);
                entries.add(ModItems.PLATINUM_CHESTPLATE);
                entries.add(ModItems.PLATINUM_LEGGINGS);
                entries.add(ModItems.PLATINUM_BOOTS);

                entries.add(ModItems.PLATINUM_SWORD);
                entries.add(ModItems.PLATINUM_PICKAXE);
                entries.add(ModItems.PLATINUM_AXE);
                entries.add(ModItems.PLATINUM_SHOVEL);
                entries.add(ModItems.PLATINUM_HOE);


                entries.add(ModItems.CURSED_SWORD);
                entries.add(ModItems.ODEN_SWORD);
                entries.add(ModItems.STRONG_SWORD);
                            }).build());

    public static void registerItemGroups() {

    }



}
