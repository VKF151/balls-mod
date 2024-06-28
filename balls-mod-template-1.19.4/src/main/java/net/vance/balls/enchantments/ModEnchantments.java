package net.vance.balls.enchantments;

import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vance.balls.BallsMod;

public class ModEnchantments {

    public static Enchantment HEMORRHAGE = register("hemorrhage",
            new Hemorrhage(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    private static Enchantment register(String name, Enchantment enchantment) {
       return Registry.register(Registries.ENCHANTMENT, new Identifier(BallsMod.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {

    }
}
