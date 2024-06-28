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
import net.minecraft.world.World;
import net.vance.balls.BallsMod;
import net.vance.balls.item.ModItems;

public class TitaniumArmorItem extends ArmorItem {
    public TitaniumArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected){
        if (!world.isClient) {
            if (entity instanceof PlayerEntity) {
                PlayerEntity player = (PlayerEntity)entity;
                if (hasFullArmorSet(player)) {
                    if (player.hasStatusEffect(StatusEffects.POISON)) player.removeStatusEffect(StatusEffects.POISON);
                    if (player.hasStatusEffect(StatusEffects.WEAKNESS)) player.removeStatusEffect(StatusEffects.WEAKNESS);
                    if (player.hasStatusEffect(StatusEffects.SLOWNESS)) player.removeStatusEffect(StatusEffects.SLOWNESS);
                    if (player.hasStatusEffect(StatusEffects.WITHER)) player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20, 1, false, false));
                }
            }
        }
    }

    private boolean hasFullArmorSet(LivingEntity user) {
        if (user.getEquippedStack(EquipmentSlot.HEAD).isOf(ModItems.TITANIUM_HELMET) && user.getEquippedStack(EquipmentSlot.CHEST).isOf(ModItems.TITANIUM_CHESTPLATE) &&
                user.getEquippedStack(EquipmentSlot.LEGS).isOf(ModItems.TITANIUM_LEGGINGS) && user.getEquippedStack(EquipmentSlot.FEET).isOf(ModItems.TITANIUM_BOOTS)) {
            return true;
        }
        return false;
    }

}
