package luke.bonusblocks;

import net.minecraft.core.data.DataLoader;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class BonusRecipes implements RecipeEntrypoint {
    @Override
    public void onRecipesReady() {

        DataLoader.loadRecipes("/resources/assets/bonusblocks/recipes/workbench.json");

    }
}
