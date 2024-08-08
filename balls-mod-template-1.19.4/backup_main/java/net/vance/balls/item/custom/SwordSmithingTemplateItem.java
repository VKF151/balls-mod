package net.vance.balls.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.List;

public class SwordSmithingTemplateItem extends Item {

    private static final Formatting TITLE_FORMATTING = Formatting.GRAY;
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;
    private static final Text SWORD_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier("sword_upgrade"))).formatted(TITLE_FORMATTING);
    private static final Text SWORD_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.sword_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text SWORD_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.sword_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text SWORD_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.sword_upgrade.base_slot_description")));
    private static final Text SWORD_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.sword_upgrade.additions_slot_description")));private static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE = new Identifier("item/empty_armor_slot_helmet");
    private static final Identifier EMPTY_SLOT_SWORD_TEXTURE = new Identifier("item/empty_slot_sword");
    private static final Identifier EMPTY_SLOT_INGOT_TEXTURE = new Identifier("item/empty_slot_ingot");
    private final Text appliesToText;
    private final Text ingredientsText;
    private final Text titleText;
    private final Text baseSlotDescriptionText;
    private final Text additionsSlotDescriptionText;
    private final List<Identifier> emptyBaseSlotTextures;
    private final List<Identifier> emptyAdditionsSlotTextures;


    public SwordSmithingTemplateItem(Text appliesToText, Text ingredientsText, Text titleText, Text baseSlotDescriptionText, Text additionsSlotDescriptionText, List<Identifier> emptyBaseSlotTextures, List<Identifier> emptyAdditionsSlotTextures) {
        super(new Item.Settings());
        this.appliesToText = appliesToText;
        this.ingredientsText = ingredientsText;
        this.titleText = titleText;
        this.baseSlotDescriptionText = baseSlotDescriptionText;
        this.additionsSlotDescriptionText = additionsSlotDescriptionText;
        this.emptyBaseSlotTextures = emptyBaseSlotTextures;
        this.emptyAdditionsSlotTextures = emptyAdditionsSlotTextures;
    }

    public static SmithingTemplateItem createSwordUpgrade() {
        return new SmithingTemplateItem(SWORD_UPGRADE_APPLIES_TO_TEXT, SWORD_UPGRADE_INGREDIENTS_TEXT, SWORD_UPGRADE_TEXT, SWORD_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, SWORD_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, SwordSmithingTemplateItem.getSwordUpgradeEmptyBaseSlotTextures(), SwordSmithingTemplateItem.getSwordUpgradeEmptyAdditionsSlotTextures());
    }


    private static List<Identifier> getSwordUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_SLOT_SWORD_TEXTURE);
    }

    private static List<Identifier> getSwordUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }
}
