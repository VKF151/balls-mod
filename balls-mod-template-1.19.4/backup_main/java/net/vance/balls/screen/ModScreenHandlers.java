package net.vance.balls.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.vance.balls.BallsMod;

public class ModScreenHandlers {
    public static final ScreenHandlerType<ReplicatorScreenHandler> REPLICATOR_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(BallsMod.MOD_ID, "replicating"),
                    new ExtendedScreenHandlerType<>(ReplicatorScreenHandler::new));

    public static void registerScreenhandlers() {
        BallsMod.LOGGER.info("Registering Screen Handlers for " + BallsMod.MOD_ID);
    }
}
