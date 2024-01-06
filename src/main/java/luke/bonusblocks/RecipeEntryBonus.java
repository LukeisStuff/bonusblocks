package luke.bonusblocks;

import net.minecraft.core.data.registry.recipe.HasJsonAdapter;
import net.minecraft.core.data.registry.recipe.adapter.RecipeJsonAdapter;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCraftingShaped;

public class RecipeEntryBonus extends RecipeEntryCraftingShaped
        implements HasJsonAdapter {
    @Override
    public RecipeJsonAdapter<?> getAdapter() {
        return new RecipeBonusJsonAdapter();
    }
}
