package luke.bonusblocks;

import net.minecraft.core.data.DataLoader;
import turniplabs.halplibe.util.RecipeEntrypoint;
import net.minecraft.core.block.Block;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.Registry;
import net.minecraft.core.data.registry.recipe.RecipeEntryBase;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
import net.minecraft.core.item.ItemStack;
import luke.bonusblocks.BonusBlocks;

public class BonusRecipes implements RecipeEntrypoint {
    public static final RecipeNamespace BACKPACKS = new RecipeNamespace();
    public static final RecipeGroup<RecipeEntryCrafting<?, ?>> WORKBENCH = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Block.workbench)));
    public static final Registry<Class<? extends RecipeEntryBase<?, ?, ?>>> RECIPE_TYPES = new Registry<>();
    @Override
    public void onRecipesReady() {
        Registries.RECIPE_TYPES.register("backpacks:backpack", RecipeEntryBonus.class);

        BACKPACKS.register("workbench", WORKBENCH);

        Registries.RECIPES.register("backpacks", BACKPACKS);

        DataLoader.loadRecipes("/assets/bonusblocks/recipes/workbench/workbench.json");
    }
}
