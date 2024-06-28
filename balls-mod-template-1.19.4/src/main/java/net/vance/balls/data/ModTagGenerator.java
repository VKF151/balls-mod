package net.vance.balls.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.vance.balls.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModTagGenerator extends FabricTagProvider {
    //private static final TagKey<Item> NI_LOGS = TagKey.of(RegistryKeys.ITEM, new Identifier("balls_mod:ni_logs"));

    /**
     * Constructs a new {@link FabricTagProvider} with the default computed path.
     *
     * <p>Common implementations of this class are provided.
     *
     * @param output           the {@link FabricDataOutput} instance
     * @param registryKey
     * @param registriesFuture the backing registry for the tag type
     */
    public ModTagGenerator(FabricDataOutput output, RegistryKey registryKey, CompletableFuture registriesFuture) {
        super(output, registryKey, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        //getOrCreateTagBuilder(NI_LOGS)
        // .add(ModBlocks.NI_LOG)
        // .add(ModBlocks.STRIPPED_NI_LOG)
        //  .add(ModBlocks.NI_WOOD)
        //  .add(ModBlocks.STRIPPED_NI_WOOD);
    }
}
