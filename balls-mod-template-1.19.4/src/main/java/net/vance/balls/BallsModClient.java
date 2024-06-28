package net.vance.balls;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.vance.balls.block.ModBlocks;
import net.vance.balls.particle.BleedParticle;
import net.vance.balls.particle.ModParticles;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(MinecraftClient.class)
public class BallsModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NI_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NI_SAPLING, RenderLayer.getCutout());
        ParticleFactoryRegistry.getInstance().register(ModParticles.BLEED_PARTICLE, BleedParticle.Factory::new);

    }
}