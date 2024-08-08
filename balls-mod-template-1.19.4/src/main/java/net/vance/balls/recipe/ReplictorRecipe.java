package net.vance.balls.recipe;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;


public class ReplictorRecipe implements Recipe<SimpleInventory> {
    private final Identifier id;
    private final ItemStack output;
    public final DefaultedList<Ingredient> recipeItems;

    public ReplictorRecipe(Identifier id, DefaultedList<Ingredient> ingredients, ItemStack itemStack) {
        this.id = id;
        this.output = itemStack;
        this.recipeItems = ingredients;
    }


    @Override
    public boolean matches(SimpleInventory inventory, World world) {
        if(world.isClient()) {
            return false;
        }
        return recipeItems.get(0).test(inventory.getStack(0)) &&
                recipeItems.get(1).test(inventory.getStack(1));
    }

    public DefaultedList<Ingredient> match0() {
        return recipeItems;
    }

    public Ingredient match1() {
        return recipeItems.get(1);
    }

    @Override
    public ItemStack craft(SimpleInventory inventory, DynamicRegistryManager registryManager) {
        return output;
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getOutput(DynamicRegistryManager registryManager) {
        return output.copy();
    }

    public ItemStack getOutput1() {
        return output.copy();
    }

    @Override
    public DefaultedList<ItemStack> getRemainder(SimpleInventory inventory) {
        return Recipe.super.getRemainder(inventory);
    }

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.ofSize(this.recipeItems.size());
        list.addAll(recipeItems);
        return list;
    }

    @Override
    public boolean isIgnoredInRecipeBook() {
        return Recipe.super.isIgnoredInRecipeBook();
    }

    @Override
    public boolean showNotification() {
        return Recipe.super.showNotification();
    }

    @Override
    public String getGroup() {
        return Recipe.super.getGroup();
    }

    @Override
    public ItemStack createIcon() {
        return Recipe.super.createIcon();
    }

    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    public static class Type implements RecipeType<ReplictorRecipe> {
        public static final Type INSTANCE = new Type();
        public static final String ID = "replicating";

    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    @Override
    public boolean isEmpty() {
        return Recipe.super.isEmpty();
    }

//    static class ReplicatorRecipeJsonFormat {JsonObject inputA;JsonObject inputB;String outputItem;int outputAmount;}

    public static class Serializer implements RecipeSerializer<ReplictorRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "replicating";


        @Override
        public ReplictorRecipe read(Identifier id, JsonObject json) {
            ItemStack output = ShapedRecipe.outputFromJson(JsonHelper.getObject(json, "output"));

            JsonArray ingredients = JsonHelper.getArray(json, "ingredients");
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(2, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new ReplictorRecipe(id, inputs, output);
        }

        @Override
        public ReplictorRecipe read(Identifier id, PacketByteBuf buf) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromPacket(buf));
            }

            ItemStack output = buf.readItemStack();
            return new ReplictorRecipe(id, inputs, output);
        }

        @Override
        public void write(PacketByteBuf buf, ReplictorRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.write(buf);
            }
            buf.writeItemStack(recipe.getOutput1());

        }
    }

}
