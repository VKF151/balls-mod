package net.vance.balls.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vance.balls.BallsMod;

public class ModParticles {
    public static final DefaultParticleType BLEED_PARTICLE = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(BallsMod.MOD_ID, "bleed_particle"),
                BLEED_PARTICLE);
    }

}
