package net.vance.balls;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.vance.balls.block.ModBlocks;
import net.vance.balls.block.ModFlammableBlockRegistry;
import net.vance.balls.block.entity.ModBlockEntities;
import net.vance.balls.enchantments.ModEnchantments;
import net.vance.balls.item.ModItemGroup;
import net.vance.balls.item.ModItems;
import net.vance.balls.particle.ModParticles;
import net.vance.balls.screen.ModScreenHandlers;
import net.vance.balls.util.ModLootTableModifiers;
import net.vance.balls.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BallsMod implements ModInitializer {
	public static final String MOD_ID = "balls_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger("balls_mod");


	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
		ModEnchantments.registerModEnchantments();
		ModParticles.registerParticles();

		ModScreenHandlers.registerScreenhandlers();

		ModWorldGeneration.generateModWorldGen();

		ModFlammableBlockRegistry.registerFlammableBlocks();
		StrippableBlockRegistry.register(ModBlocks.NI_LOG, ModBlocks.STRIPPED_NI_LOG);
		StrippableBlockRegistry.register(ModBlocks.NI_WOOD, ModBlocks.STRIPPED_NI_WOOD);

		ModLootTableModifiers.modifyLootTables();



	}
}