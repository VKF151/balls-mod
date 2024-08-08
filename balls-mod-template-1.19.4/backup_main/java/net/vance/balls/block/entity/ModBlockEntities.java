package net.vance.balls.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vance.balls.BallsMod;
import net.vance.balls.block.ModBlocks;

public class ModBlockEntities {
    public static final BlockEntityType<ReplicatorBlockEntity> REPLICATOR_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(BallsMod.MOD_ID, "replicator_be"),
                    FabricBlockEntityTypeBuilder.create(ReplicatorBlockEntity::new,
                            ModBlocks.REPLICATOR_BLOCK).build());

    public static void registerBlockEntities() {
        BallsMod.LOGGER.info("Registering Block Entities For " + BallsMod.MOD_ID);
    }
}
