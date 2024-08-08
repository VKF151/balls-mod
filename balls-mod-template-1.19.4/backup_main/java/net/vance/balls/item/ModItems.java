package net.vance.balls.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.vance.balls.BallsMod;
import net.vance.balls.item.custom.*;

public class ModItems {
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item RAW_PLATINUM = registerItem("raw_platinum",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item PLATINUM_FRAGMENT = registerItem("platinum_fragment",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item CURSED_COMPOUND = registerItem("cursed_compound",
            new Item(new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item PLATINUM_HELMET = registerItem("platinum_helmet",
            new PlatinumArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item PLATINUM_CHESTPLATE = registerItem("platinum_chestplate",
            new PlatinumArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item PLATINUM_LEGGINGS = registerItem("platinum_leggings",
            new PlatinumArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item PLATINUM_BOOTS = registerItem("platinum_boots",
            new PlatinumArmorItem(ModArmorMaterials.PLATINUM, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item PLATINUM_SWORD = registerItem("platinum_sword",
            new SwordItem(PlatinumToolMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static final Item PLATINUM_PICKAXE = registerItem("platinum_pickaxe",
            new PickaxeItem(PlatinumToolMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item PLATINUM_AXE = registerItem("platinum_axe",
            new AxeItem(PlatinumToolMaterial.INSTANCE, 5, -2.9f, new FabricItemSettings().fireproof()));
    public static final Item PLATINUM_SHOVEL = registerItem("platinum_shovel",
            new ShovelItem(PlatinumToolMaterial.INSTANCE, 2, -3.0f, new FabricItemSettings().fireproof()));
    public static final Item PLATINUM_HOE = registerItem("platinum_hoe",
            new HoeItem(PlatinumToolMaterial.INSTANCE, -5, -0.0f, new FabricItemSettings().fireproof()));

    public static final Item PLATINUM_UPGRADE_SMITHING_TEMPLATE = registerItem("platinum_upgrade_smithing_template",
            (Item) PlatinumSmithingTemplateItem.createPlatinumUpgrade() );
    public static final Item TITANIUM_UPGRADE_SMITHING_TEMPLATE = registerItem("titanium_upgrade_smithing_template",
            (Item) TitaniumSmithingTemplateItem.createTitaniumUpgrade() );
    public static final Item SWORD_UPGRADE_SMITHING_TEMPLATE = registerItem("sword_upgrade_smithing_template",
            (Item) SwordSmithingTemplateItem.createSwordUpgrade() );

    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new FabricItemSettings()));

    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new CopperArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new CopperArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new CopperArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new CopperArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(CopperToolMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings()));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(CopperToolMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings()));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(CopperToolMaterial.INSTANCE, 5, -2.9f, new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(CopperToolMaterial.INSTANCE, 2, -3.0f, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(CopperToolMaterial.INSTANCE, -1, -0.0f, new FabricItemSettings()));

    public static final Item CURSED_SWORD = registerItem("cursed_sword",
            new CursedSwordItem(CursedSwordMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item ODEN_SWORD = registerItem("oden_sword",
            new OdenSwordItem(OdenSwordMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));
    public static final Item STRONG_SWORD = registerItem("strong_sword",
            new StrongSwordItem(StrongSwordMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_SCRAP = registerItem("titanium_scrap",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet",
            new TitaniumArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate",
            new TitaniumArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings",
            new TitaniumArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots",
            new TitaniumArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item TITANIUM_SWORD = registerItem("titanium_sword",
            new SwordItem(TitaniumToolMaterial.INSTANCE, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new PickaxeItem(TitaniumToolMaterial.INSTANCE, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_AXE = registerItem("titanium_axe",
            new AxeItem(TitaniumToolMaterial.INSTANCE, 5, -2.9f, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new ShovelItem(TitaniumToolMaterial.INSTANCE, 2, -3.0f, new FabricItemSettings().fireproof()));
    public static final Item TITANIUM_HOE = registerItem("titanium_hoe",
            new HoeItem(TitaniumToolMaterial.INSTANCE, -6, -0.0f, new FabricItemSettings().fireproof()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BallsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BallsMod.LOGGER.info("Registering Mod Items for " + BallsMod.MOD_ID);
    }

}
