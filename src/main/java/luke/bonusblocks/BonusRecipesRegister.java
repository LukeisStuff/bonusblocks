package luke.bonusblocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.data.DataLoader;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.Registry;
import net.minecraft.core.data.registry.recipe.RecipeEntryBase;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryBlastFurnace;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryFurnace;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class BonusRecipesRegister implements RecipeEntrypoint {
    public static final RecipeNamespace BONUSBLOCKS = new RecipeNamespace();
    public static final RecipeGroup<RecipeEntryCrafting<?, ?>> WORKBENCH = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Block.workbench)));
    public static final RecipeGroup<RecipeEntryFurnace> FURNACE = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Block.furnaceStoneIdle)));
    public static final RecipeGroup<RecipeEntryBlastFurnace> BLAST_FURNACE = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Block.furnaceBlastIdle)));

    public static final Registry<Class<? extends RecipeEntryBase<?, ?, ?>>> RECIPE_TYPES = new Registry<>();
    @Override
    public void onRecipesReady() {
        BONUSBLOCKS.register("workbench", WORKBENCH);
        BONUSBLOCKS.register("furnace", FURNACE);
        BONUSBLOCKS.register("blast_furnace", BLAST_FURNACE);

        Registries.RECIPES.register("bonusblocks", BONUSBLOCKS);

        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logCacao.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logJacaranda.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logShrub.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logScorched.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logMaple.getDefaultStack());

/*
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.barkJacaranda.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.barkScorched.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.barkShrub.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.barkEucalyptus.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.barkBirch.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.barkCherry.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.barkOak.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.barkOakMossy.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.barkPine.getDefaultStack());
*/

        Registries.ITEM_GROUPS.getItem("minecraft:leaves").add(BonusBlocks.leavesJacaranda.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:leaves").add(BonusBlocks.leavesMaple.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:leaves").add(BonusBlocks.leavesOakMossy.getDefaultStack());

        DataLoader.loadRecipes("/assets/bonusblocks/recipes/workbench.json");
        DataLoader.loadRecipes("/assets/bonusblocks/recipes/furnace.json");
    }
}
