package net.vance.balls.item.custom;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.vance.balls.item.ModItems;

public class PlatinumToolMaterial implements ToolMaterial {

    public static final PlatinumToolMaterial INSTANCE = new PlatinumToolMaterial();

    @Override
    public int getDurability() {
        return 2642;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 12.0f;
    }

    @Override
    public float getAttackDamage() {
        return 5.0f;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.PLATINUM_INGOT);
    }
}