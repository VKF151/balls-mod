package net.vance.balls.enchantments;

import net.minecraft.client.render.WorldRenderer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.vance.balls.particle.ModParticles;

public class Hemorrhage extends Enchantment {


    protected Hemorrhage(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }

    @Override
    public int getMinPower(int level) {
        return 10 + 20 * (level);
    }

    @Override
    public int getMaxPower(int level) {
        return super.getMinPower(level) + 50;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    int hits = 0;

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.getWorld().isClient()) {
            if (target instanceof LivingEntity) {
                hits = hits + 1;

                if (hits >= 10) {
                    hits = 0;
                    target.damage(user.getWorld().getDamageSources().outOfWorld(), ((LivingEntity) target).getMaxHealth() * 0.2f);
                    spawnParticles((ServerWorld) user.getWorld(), target);
                }
            }
        }

        super.onTargetDamaged(user, target, level);
    }

    private void spawnParticles(ServerWorld world, Entity target) {
        for(int i = 0; i < 20; i ++) {
            if (i % 2 == 0) {
                world.spawnParticles(ModParticles.BLEED_PARTICLE,
                        target.getX() + 0d, target.getY() + 1.25f, target.getZ() + 0d, 1,
                        Math.cos(i) * 0.25d, 0.25d, Math.sin(i) * 0.25d, 0.4);
            }
        }
    }

}
