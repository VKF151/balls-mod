package net.vance.balls.item.custom;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.vance.balls.item.ModItems;

public class CursedSwordMaterial implements ToolMaterial {

    public static final CursedSwordMaterial INSTANCE = new CursedSwordMaterial();

    @Override
    public int getDurability() {
        return 2554;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 12.0f;
    }

    @Override
    public float getAttackDamage() {
        return 11.0f;
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