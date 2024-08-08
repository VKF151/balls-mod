package net.vance.balls.item.custom;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.vance.balls.item.ModItems;

public class StrongSwordMaterial implements ToolMaterial {

    public static final StrongSwordMaterial INSTANCE = new StrongSwordMaterial();

    @Override
    public int getDurability() {
        return 9999;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 12.0f;
    }

    @Override
    public float getAttackDamage() {
        return 7.0f;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {return 10;}

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.PLATINUM_INGOT);
    }
}