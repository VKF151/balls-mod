package net.vance.balls.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.world.World;
import net.vance.balls.BallsMod;
import net.vance.balls.item.ModArmorMaterials;
import net.vance.balls.item.ModItems;

public class PlatinumArmorItem extends ArmorItem {
    public PlatinumArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected){
        if (!world.isClient) {
            if (entity instanceof PlayerEntity) {
                PlayerEntity player = (PlayerEntity)entity;
                if (hasFullArmorSet(player)) {
                    if (player.hasStatusEffect(StatusEffects.BLINDNESS)) player.removeStatusEffect(StatusEffects.BLINDNESS);
                    if (player.hasStatusEffect(StatusEffects.DARKNESS)) player.removeStatusEffect(StatusEffects.DARKNESS);
                    if (player.hasStatusEffect(StatusEffects.WITHER)) player.removeStatusEffect(StatusEffects.WITHER);
                    if (player.isOnFire()) player.setFireTicks(0);
                }
            }
        }
    }

    private boolean hasFullArmorSet(LivingEntity user) {
        if (user.getEquippedStack(EquipmentSlot.HEAD).isOf(ModItems.PLATINUM_HELMET) && user.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.PLATINUM_CHESTPLATE) &&
        user.getEquippedStack(EquipmentSlot.LEGS).isOf(ModItems.PLATINUM_LEGGINGS) && user.getEquippedStack(EquipmentSlot.FEET).isOf(ModItems.PLATINUM_BOOTS)) {
            return true;
        }
        return false;
    }

}
