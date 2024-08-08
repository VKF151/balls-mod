package net.vance.balls.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.vance.balls.item.ModItems;

import java.util.List;

public class CursedSwordItem extends SwordItem implements Vanishable {

    public CursedSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        tooltip.add(Text.translatable("item.balls_mod.cursed_sword.tooltip").formatted(Formatting.DARK_PURPLE));
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(1, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        if (attacker instanceof PlayerEntity player && stack.getItem() == ModItems.CURSED_SWORD && !attacker.getWorld().isClient() && attacker.getHealth() >= 3.0f) {
            attacker.damage(attacker.getWorld().getDamageSources().outOfWorld(), 1.0f);
        }
        return true;
    }

}
