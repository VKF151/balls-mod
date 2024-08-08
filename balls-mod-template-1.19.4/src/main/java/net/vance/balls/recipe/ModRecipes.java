package net.vance.balls.recipe;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vance.balls.BallsMod;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(BallsMod.MOD_ID, ReplictorRecipe.Serializer.ID),
                ReplictorRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(BallsMod.MOD_ID, ReplictorRecipe.Type.ID), ReplictorRecipe.Type.INSTANCE);
    }
}
