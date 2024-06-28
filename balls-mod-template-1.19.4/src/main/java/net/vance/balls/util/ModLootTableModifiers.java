package net.vance.balls.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.vance.balls.item.ModItems;

public class ModLootTableModifiers {
    private static final Identifier end_City_ID = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier warden_ID = new Identifier("minecraft", "entities/warden");
    private static final Identifier buried_Treasure_ID = new Identifier("minecraft", "chests/buried_treasure");
    private static final Identifier nether_bridge_ID = new Identifier("minecraft", "chests/nether_bridge");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            if(end_City_ID.equals(id)) {
                LootPool poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f))
                        .with(ItemEntry.builder(ModItems.PLATINUM_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f))).build();
                tableBuilder.pool(poolBuilder);
            }

            if(warden_ID.equals(id)) {
                LootPool poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.55f))
                        .with(ItemEntry.builder(ModItems.CURSED_COMPOUND))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f))).build();
                tableBuilder.pool(poolBuilder);
            }

            if(buried_Treasure_ID.equals(id)) {
                LootPool poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.SWORD_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f))).build();
                tableBuilder.pool(poolBuilder);
            }

            if(nether_bridge_ID.equals(id)) {
                LootPool poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.45f))
                        .with(ItemEntry.builder(ModItems.TITANIUM_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f))).build();
                tableBuilder.pool(poolBuilder);
            }

        });
    }
}
