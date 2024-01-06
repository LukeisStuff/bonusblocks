package luke.bonusblocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.data.DataLoader;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.Registry;
import net.minecraft.core.data.registry.recipe.RecipeEntryBase;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class BonusRecipes implements RecipeEntrypoint {
    public static final RecipeNamespace bonusblocks = new RecipeNamespace();
    public static final RecipeGroup<RecipeEntryCrafting<?, ?>> WORKBENCH = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Block.workbench)));
    public static final Registry<Class<? extends RecipeEntryBase<?, ?, ?>>> RECIPE_TYPES = new Registry<>();
    @Override
    public void onRecipesReady() {
        bonusblocks.register("workbench", WORKBENCH);

        Registries.RECIPES.register("bonusblocks", bonusblocks);

        DataLoader.loadRecipes("/assets/bonusblocks/recipes/workbench.json");
    }
}
