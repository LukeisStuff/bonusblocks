package luke.bonusblocks;

import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryDyeing;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryUndyeing;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.util.helper.DyeColor;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.RecipeEntrypoint;

import java.util.ArrayList;
import java.util.List;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;

public class BonusRecipes implements RecipeEntrypoint {

    @Override
    public void onRecipesReady() {
        BonusRecipes.workbenchRecipes();
        BonusRecipes.furnaceRecipes();
        BonusRecipes.blastFurnaceRecipes();
        BonusRecipes.trommelRecipes();
    }

    public static void workbenchRecipes() {
        BonusRecipes.doorRecipes();

        RecipeBuilderShaped logToPlanks = new RecipeBuilderShaped(MOD_ID, "X");
        logToPlanks.addInput('X', BonusBlocks.LOG_JACARANDA).create("log_jacaranda_to_planks", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 10));
        logToPlanks.addInput('X', BonusBlocks.LOG_SCORCHED).create("log_scorched_to_planks", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 15));
        logToPlanks.addInput('X', BonusBlocks.LOG_SHRUB).create("log_shrub_to_planks", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 8));
        logToPlanks.addInput('X', BonusBlocks.LOG_CACAO).create("log_cacao_to_planks", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 5));


        RecipeBuilderShaped itemToBlock = new RecipeBuilderShaped(MOD_ID, "XXX", "XXX", "XXX");
        itemToBlock.addInput('X', Items.BONE).create("block_of_bone", new ItemStack(BonusBlocks.BLOCK_BONE, 1));
        itemToBlock.addInput('X', new ItemStack(Items.DYE, 1, 15)).create("skull", new ItemStack(BonusBlocks.SKULL, 1));
        itemToBlock.addInput('X', Items.SLIMEBALL).create("block_of_slime", new ItemStack(BonusBlocks.BLOCK_SLIME, 1));
        itemToBlock.addInput('X', Items.SULPHUR).create("block_of_sulphur", new ItemStack(BonusBlocks.BLOCK_GUNPOWDER, 1));
        itemToBlock.addInput('X', Items.DUST_SUGAR).create("block_of_sugar", new ItemStack(BonusBlocks.BLOCK_SUGAR, 1));
        itemToBlock.addInput('X', Items.CLOTH).create("block_of_cloth", new ItemStack(BonusBlocks.BLOCK_CLOTH, 1));
        itemToBlock.addInput('X', Items.FLINT).create("block_of_flint", new ItemStack(BonusBlocks.BLOCK_FLINT, 1));
        itemToBlock.addInput('X', Items.LEATHER).create("block_of_leather", new ItemStack(BonusBlocks.BLOCK_LEATHER, 1));
        itemToBlock.addInput('X', Items.INGOT_STEEL).create("block_of_steel", new ItemStack(BonusBlocks.BLOCK_STEEL, 1));
        itemToBlock.addInput('X', Items.INGOT_STEEL_CRUDE).create("block_of_crude_steel", new ItemStack(Blocks.BLOCK_STEEL, 1));
        itemToBlock.addInput('X', BonusItems.ORE_RAW_VERDIGRIS).create("block_of_verdigris", new ItemStack(BonusBlocks.BLOCK_VERDIGRIS, 1));
        itemToBlock.addInput('X', BonusItems.INGOT_VERDIGRIS).create("block_of_verdigris_shine", new ItemStack(BonusBlocks.BLOCK_VERDIGRIS_SHINE, 1));


        RecipeBuilderShaped blockToItem = new RecipeBuilderShaped(MOD_ID, "X");
        blockToItem.addInput('X', BonusBlocks.BLOCK_BONE).create("block_of_bone_to_bone", new ItemStack(Items.BONE, 9));
        blockToItem.addInput('X', BonusBlocks.BLOCK_SLIME).create("block_of_slime_to_slime", new ItemStack(Items.SLIMEBALL, 9));
        blockToItem.addInput('X', BonusBlocks.BLOCK_GUNPOWDER).create("block_of_sulphur_to_sulphur", new ItemStack(Items.SULPHUR, 9));
        blockToItem.addInput('X', BonusBlocks.BLOCK_SUGAR).create("block_of_sugar_to_sugar", new ItemStack(Items.DUST_SUGAR, 9));
        blockToItem.addInput('X', BonusBlocks.BLOCK_CLOTH).create("block_of_cloth_to_cloth", new ItemStack(Items.CLOTH, 9));
        blockToItem.addInput('X', BonusBlocks.BLOCK_FLINT).create("block_of_flint_to_flint", new ItemStack(Items.FLINT, 9));
        blockToItem.addInput('X', BonusBlocks.BLOCK_LEATHER).create("block_of_leather_to_leather", new ItemStack(Items.LEATHER, 9));
        blockToItem.addInput('X', BonusBlocks.BLOCK_STEEL).create("block_of_steel_to_steel", new ItemStack(Items.INGOT_STEEL, 9));
        blockToItem.addInput('X', Blocks.BLOCK_STEEL).create("block_of_crude_steel_to_crude_steel", new ItemStack(Items.INGOT_STEEL_CRUDE, 9));
        blockToItem.addInput('X', BonusBlocks.BLOCK_VERDIGRIS).create("block_of_verdigris_to_verdigris", new ItemStack(BonusItems.ORE_RAW_VERDIGRIS, 9));
        blockToItem.addInput('X', BonusBlocks.BLOCK_VERDIGRIS_SHINE).create("block_of_burnished_verdigris_to_verdigris", new ItemStack(BonusItems.INGOT_VERDIGRIS, 9));

        RecipeBuilderShaped mesh = new RecipeBuilderShaped(MOD_ID, "XXX", "X X", "XXX");
        mesh.addInput('X', BonusItems.ORE_RAW_VERDIGRIS).create("mesh_verdigris", new ItemStack(BonusBlocks.MESH_VERDIGRIS, 1));
        mesh.addInput('X', BonusItems.INGOT_VERDIGRIS).create("mesh_verdigris_shine", new ItemStack(BonusBlocks.MESH_VERDIGRIS_SHINE, 1));

        RecipeBuilderShaped templateFlowertoDye = new RecipeBuilderShaped(MOD_ID, "X");
        templateFlowertoDye.addInput('X', BonusBlocks.FLOWER_SILVER).create("flower_silver_to_dye", new ItemStack(Items.DYE, 2, 7));
        templateFlowertoDye.addInput('X', BonusBlocks.FLOWER_CYAN).create("flower_cyan_to_dye", new ItemStack(Items.DYE, 2, 6));
        templateFlowertoDye.addInput('X', BonusBlocks.FLOWER_MAGENTA).create("flower_magenta_to_dye", new ItemStack(Items.DYE, 2, 13));
        templateFlowertoDye.addInput('X', BonusBlocks.FLOWER_LIME).create("flower_lime_to_dye", new ItemStack(Items.DYE, 2, 10));
        templateFlowertoDye.addInput('X', BonusBlocks.MUSHROOM_GRAY).create("mushroom_gray_to_dye", new ItemStack(Items.DYE, 2, 8));
        templateFlowertoDye.addInput('X', Blocks.ALGAE).create("algae_to_slime", new ItemStack(Items.SLIMEBALL, 2));
        templateFlowertoDye.addInput('X', BonusItems.ORE_RAW_VERDIGRIS).create("verdigris_to_dye", new ItemStack(Items.DYE, 2, 6));


        RecipeBuilderShaped templateMushroomToBlock = new RecipeBuilderShaped(MOD_ID, "XX", "XX");
        templateMushroomToBlock.addInput('X', Blocks.MUSHROOM_RED).create("red_mushroom_block", new ItemStack(BonusBlocks.FUNGI_RED, 4));
        templateMushroomToBlock.addInput('X', Blocks.MUSHROOM_BROWN).create("brown_mushroom_block", new ItemStack(BonusBlocks.FUNGI_BROWN, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.MUSHROOM_GRAY).create("gray_mushroom_block", new ItemStack(BonusBlocks.FUNGI_GRAY, 4));

        templateMushroomToBlock.addInput('X', Blocks.FLOWER_RED).create("petal_red", new ItemStack(BonusBlocks.PETAL_RED, 4));
        templateMushroomToBlock.addInput('X', Blocks.FLOWER_YELLOW).create("petal_yellow", new ItemStack(BonusBlocks.PETAL_YELLOW, 4));
        templateMushroomToBlock.addInput('X', Blocks.FLOWER_LIGHT_BLUE).create("petal_cyan", new ItemStack(BonusBlocks.PETAL_LIGHT_BLUE, 4));
        templateMushroomToBlock.addInput('X', Blocks.FLOWER_PURPLE).create("petal_purple", new ItemStack(BonusBlocks.PETAL_PURPLE, 4));
        templateMushroomToBlock.addInput('X', Blocks.FLOWER_PINK).create("petal_pink", new ItemStack(BonusBlocks.PETAL_PINK, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.FLOWER_SILVER).create("petal_silver", new ItemStack(BonusBlocks.PETAL_SILVER, 4));
        templateMushroomToBlock.addInput('X', Blocks.FLOWER_ORANGE).create("petal_orange", new ItemStack(BonusBlocks.PETAL_ORANGE, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.FLOWER_CYAN).create("petal_lightblue", new ItemStack(BonusBlocks.PETAL_CYAN, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.FLOWER_MAGENTA).create("petal_magenta", new ItemStack(BonusBlocks.PETAL_MAGENTA, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.FLOWER_LIME).create("petal_lime", new ItemStack(BonusBlocks.PETAL_LIME, 4));


        RecipeBuilderShaped templateFlowerBed = new RecipeBuilderShaped(MOD_ID, "XX");
        templateFlowerBed.addInput('X', BonusBlocks.PETAL_RED).create("petal_red_to_layer", new ItemStack(BonusBlocks.PETAL_LAYER_RED, 8));
        templateFlowerBed.addInput('X', BonusBlocks.PETAL_YELLOW).create("petal_yellow_to_layer", new ItemStack(BonusBlocks.PETAL_LAYER_YELLOW, 8));
        templateFlowerBed.addInput('X', BonusBlocks.PETAL_CYAN).create("petal_cyan_to_layer", new ItemStack(BonusBlocks.PETAL_LAYER_CYAN, 8));
        templateFlowerBed.addInput('X', BonusBlocks.PETAL_PURPLE).create("petal_purple_to_layer", new ItemStack(BonusBlocks.PETAL_LAYER_PURPLE, 8));
        templateFlowerBed.addInput('X', BonusBlocks.PETAL_PINK).create("petal_pink_to_layer", new ItemStack(BonusBlocks.PETAL_LAYER_PINK, 8));
        templateFlowerBed.addInput('X', BonusBlocks.PETAL_SILVER).create("petal_silver_to_layer", new ItemStack(BonusBlocks.PETAL_LAYER_SILVER, 8));
        templateFlowerBed.addInput('X', BonusBlocks.PETAL_ORANGE).create("petal_orange_to_layer", new ItemStack(BonusBlocks.PETAL_LAYER_ORANGE, 8));
        templateFlowerBed.addInput('X', BonusBlocks.PETAL_LIGHT_BLUE).create("petal_lightblue_to_layer", new ItemStack(BonusBlocks.PETAL_LAYER_LIGHT_BLUE, 8));
        templateFlowerBed.addInput('X', BonusBlocks.PETAL_MAGENTA).create("petal_magenta_to_layer", new ItemStack(BonusBlocks.PETAL_LAYER_MAGENTA, 8));
        templateFlowerBed.addInput('X', BonusBlocks.PETAL_LIME).create("petal_lime_to_layer", new ItemStack(BonusBlocks.PETAL_LAYER_LIME, 8));


        RecipeBuilderShaped templateBricks = new RecipeBuilderShaped(MOD_ID, "XX", "XX");
        templateBricks.addInput('X', BonusBlocks.BLOCK_CLAY_BAKED).create("clay_bricks", new ItemStack(BonusBlocks.BRICK_CLAY_BAKED, 4));
        templateBricks.addInput('X', Blocks.MUD_BAKED).create("mud_bricks", new ItemStack(BonusBlocks.BRICK_MUD, 4));
        templateBricks.addInput('X', Items.QUARTZ).create("quartz_bricks", new ItemStack(BonusBlocks.BRICK_QUARTZ, 4));
        templateBricks.addInput('X', Items.OLIVINE).create("olivine_bricks", new ItemStack(BonusBlocks.BRICK_OLIVINE, 4));
        templateBricks.addInput('X', Blocks.SOULSAND).create("soulschist", new ItemStack(Blocks.SOULSCHIST, 4));
        templateBricks.addInput('X', Items.INGOT_STEEL).create("steel_bricks", new ItemStack(BonusBlocks.BRICK_STEEL, 4));
        templateBricks.addInput('X', BonusItems.ORE_RAW_VERDIGRIS).create("verdigris_bricks", new ItemStack(BonusBlocks.BRICK_VERDIGRIS, 4));
        templateBricks.addInput('X', BonusItems.INGOT_VERDIGRIS).create("verdigris_shine_bricks", new ItemStack(BonusBlocks.BRICK_VERDIGRIS_SHINE, 4));
        templateBricks.addInput('X', Blocks.CACTUS).create("tatami", new ItemStack(BonusBlocks.TATAMI, 4));


        RecipeBuilderShaped templateOvergrown = new RecipeBuilderShaped(MOD_ID, "X", "X");
        templateOvergrown.addInput('X', Blocks.GRASS).create("overgrown_grass", new ItemStack(BonusBlocks.GRASS_OVERGROWN, 2));
        templateOvergrown.addInput('X', Blocks.GRASS_RETRO).create("overgrown_grass_retro", new ItemStack(BonusBlocks.GRASS_OVERGROWN, 2));
        templateOvergrown.addInput('X', Blocks.GRASS_SCORCHED).create("overgrown_grass_scorched", new ItemStack(BonusBlocks.GRASS_SCORCHED_OVERGROWN, 2));
        templateOvergrown.addInput('X', Blocks.PATH_DIRT).create("overgrown_path", new ItemStack(BonusBlocks.PATH_DIRT_OVERGROWN, 2));


        RecipeBuilderShaped templatePebbles = new RecipeBuilderShaped(MOD_ID, "PX", "XP");
        templatePebbles.addInput('X', Blocks.STONE).addInput('P', BonusItems.MOSS).create("stone_to_moss_stone", new ItemStack(Blocks.MOSS_STONE, 2));
        templatePebbles.addInput('X', Blocks.COBBLE_STONE).addInput('P', BonusItems.MOSS).create("cobble_stone_to_moss_stone", new ItemStack(Blocks.COBBLE_STONE_MOSSY, 2));
        templatePebbles.addInput('X', Blocks.BRICK_STONE_POLISHED).addInput('P', BonusItems.MOSS).create("polished_stone_brick_to_mossy_polished_stone_brick", new ItemStack(Blocks.BRICK_STONE_POLISHED_MOSSY, 2));
        templatePebbles.addInput('X', Blocks.BASALT).addInput('P', BonusItems.MOSS).create("basalt_to_moss_stone", new ItemStack(Blocks.MOSS_BASALT, 2));
        templatePebbles.addInput('X', Blocks.LIMESTONE).addInput('P', BonusItems.MOSS).create("limestone_to_moss_stone", new ItemStack(Blocks.MOSS_LIMESTONE, 2));
        templatePebbles.addInput('X', Blocks.GRANITE).addInput('P', BonusItems.MOSS).create("granite_to_moss_stone", new ItemStack(Blocks.MOSS_GRANITE, 2));
        templatePebbles.addInput('X', Blocks.LOG_OAK).addInput('P', BonusItems.MOSS).create("oak_log_to_moss_oak_log", new ItemStack(Blocks.LOG_OAK_MOSSY, 2));
        templatePebbles.addInput('X', BonusItems.MOSS).addInput('P', BonusItems.MOSS).create("moss_balls_to_moss", new ItemStack(BonusBlocks.MOSS, 1));
        templatePebbles.addInput('X', Blocks.DIRT).addInput('P', Blocks.MUD_BAKED).create("rough_dirt", new ItemStack(BonusBlocks.DIRT_BAKED, 4));


        RecipeBuilderShaped templatePillar = new RecipeBuilderShaped(MOD_ID, "X", "X", "X");
        templatePillar.addInput('X', Blocks.MARBLE).create("marble_pillar", new ItemStack(Blocks.PILLAR_MARBLE, 3));


        RecipeBuilderShaped templatePolished = new RecipeBuilderShaped(MOD_ID, "X", "X");
        templatePolished.addInput('X', Blocks.MARBLE).create("marble_polished", new ItemStack(BonusBlocks.MARBLE_POLISHED, 2));

        RecipeBuilderShaped templateCarvedSlab = new RecipeBuilderShaped(MOD_ID, "X", "X");
        templateCarvedSlab.addInput('X', Blocks.SLAB_CAPSTONE_MARBLE).create("marble_capstone", new ItemStack(Blocks.CAPSTONE_MARBLE, 1));
        templateCarvedSlab.addInput('X', Blocks.SLAB_BASALT_POLISHED).create("basalt_carved", new ItemStack(Blocks.BASALT_CARVED, 1));
        templateCarvedSlab.addInput('X', Blocks.SLAB_STONE_POLISHED).create("stone_carved", new ItemStack(Blocks.STONE_CARVED, 1));
        templateCarvedSlab.addInput('X', Blocks.SLAB_LIMESTONE_POLISHED).create("limestone_carved", new ItemStack(Blocks.LIMESTONE_CARVED, 1));
        templateCarvedSlab.addInput('X', Blocks.SLAB_GRANITE_POLISHED).create("granite_carved", new ItemStack(Blocks.GRANITE_CARVED, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.SLAB_MARBLE_POLISHED).create("marble_carved", new ItemStack(BonusBlocks.MARBLE_CARVED, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.SLAB_SLATE_POLISHED).create("slate_carved", new ItemStack(BonusBlocks.SLATE_CARVED, 1));
        templateCarvedSlab.addInput('X', Blocks.SLAB_PERMAFROST_POLISHED).create("permafrost_carved", new ItemStack(Blocks.PERMAFROST_CARVED, 1));
        templateCarvedSlab.addInput('X', Blocks.SLAB_NETHERRACK_POLISHED).create("netherrack_carved", new ItemStack(Blocks.NETHERRACK_CARVED, 1));


        RecipeBuilderShaped templateSlab = new RecipeBuilderShaped(MOD_ID, "XXX");
        templateSlab.addInput('X', Blocks.SLATE_POLISHED).create("slate_polished_slab", new ItemStack(BonusBlocks.SLAB_SLATE_POLISHED, 6));
        templateSlab.addInput('X', BonusBlocks.MARBLE_POLISHED).create("marble_polished_slab", new ItemStack(BonusBlocks.SLAB_MARBLE_POLISHED, 6));
        templateSlab.addInput('X', BonusBlocks.BRICK_MUD).create("mud_brick_slab", new ItemStack(BonusBlocks.SLAB_BRICK_MUD, 6));
        templateSlab.addInput('X', Blocks.BRICK_STONE_POLISHED_MOSSY).create("stone_polished_mossy_brick_slab", new ItemStack(BonusBlocks.SLAB_BRICK_STONE_POLISHED_MOSSY, 6));
        templateSlab.addInput('X', BonusBlocks.BRICK_QUARTZ).create("quartz_brick_slab", new ItemStack(BonusBlocks.SLAB_BRICK_QUARTZ, 6));
        templateSlab.addInput('X', BonusBlocks.BRICK_OLIVINE).create("olivine_brick_slab", new ItemStack(BonusBlocks.SLAB_BRICK_OLIVINE, 6));
        templateSlab.addInput('X', Blocks.COBBLE_STONE_MOSSY).create("cobblestone_mossy_slab", new ItemStack(BonusBlocks.SLAB_COBBLESTONE_MOSSY, 6));
        templateSlab.addInput('X', BonusBlocks.BRICK_CLAY_BAKED).create("baked_clay_slab", new ItemStack(BonusBlocks.SLAB_BRICK_CLAY_BAKED, 6));
        templateSlab.addInput('X', BonusBlocks.BRICK_STEEL).create("steel_brick_slab", new ItemStack(BonusBlocks.SLAB_BRICK_STEEL, 6));
        templateSlab.addInput('X', BonusBlocks.BRICK_VERDIGRIS).create("verdigris_brick_slab", new ItemStack(BonusBlocks.SLAB_BRICK_VERDIGRIS, 6));
        templateSlab.addInput('X', BonusBlocks.BRICK_VERDIGRIS_SHINE).create("verdigris_shine_brick_slab", new ItemStack(BonusBlocks.SLAB_BRICK_VERDIGRIS_SHINE, 6));


        RecipeBuilderShaped templateStairs = new RecipeBuilderShaped(MOD_ID, "X ", "XX ", "XXX");
        templateStairs.addInput('X', BonusBlocks.BRICK_MUD).create("mud_brick_stairs", new ItemStack(BonusBlocks.STAIRS_BRICK_MUD, 6));
        templateStairs.addInput('X', Blocks.BRICK_STONE_POLISHED_MOSSY).create("stone_polished_mossy_brick_stairs", new ItemStack(BonusBlocks.STAIRS_BRICK_STONE_POLISHED_MOSSY, 6));
        templateStairs.addInput('X', BonusBlocks.BRICK_QUARTZ).create("quartz_brick_stairs", new ItemStack(BonusBlocks.STAIRS_BRICK_QUARTZ, 6));
        templateStairs.addInput('X', BonusBlocks.BRICK_OLIVINE).create("olivine_brick_stairs", new ItemStack(BonusBlocks.STAIRS_BRICK_OLIVINE, 6));
        templateStairs.addInput('X', Blocks.COBBLE_STONE_MOSSY).create("cobblestone_mossy_stairs", new ItemStack(BonusBlocks.STAIRS_COBBLESTONE_MOSSY, 6));
        templateStairs.addInput('X', BonusBlocks.BRICK_CLAY_BAKED).create("baked_clay_stairs", new ItemStack(BonusBlocks.STAIRS_BRICK_CLAY_BAKED, 6));
        templateStairs.addInput('X', BonusBlocks.BRICK_STEEL).create("steel_brick_stairs", new ItemStack(BonusBlocks.STAIRS_BRICK_STEEL, 6));
        templateStairs.addInput('X', BonusBlocks.BRICK_VERDIGRIS).create("verdigris_brick_stairs", new ItemStack(BonusBlocks.STAIRS_BRICK_VERDIGRIS, 6));
        templateStairs.addInput('X', BonusBlocks.BRICK_VERDIGRIS_SHINE).create("verdigris_shine_brick_stairs", new ItemStack(BonusBlocks.STAIRS_BRICK_VERDIGRIS_SHINE, 6));

        RecipeBuilder.Shaped(MOD_ID, "CPC", "CPC")
                .addInput('P', Items.INGOT_GOLD)
                .addInput('C', Blocks.BLOCK_GOLD)
                .create("fence_gold", new ItemStack(BonusBlocks.FENCE_GOLD, 16));

        RecipeBuilder.Shaped(MOD_ID, "S", "S")
                .addInput('S', BonusBlocks.LOG_SCORCHED)
                .create("scorched_log_to_charcoal", new ItemStack(Items.COAL, 2, 1));

        RecipeBuilder.Shaped(MOD_ID, "WS", "SW")
                .addInput('W', Items.WHEAT)
                .addInput('S', Items.LEATHER)
                .create("block_of_wicker", new ItemStack(BonusBlocks.BLOCK_WICKER, 4));

        RecipeBuilder.Shaped(MOD_ID, "GQ", "QG")
                .addInput('G', Blocks.GLASS)
                .addInput('Q', Items.QUARTZ)
                .create("glass_quartz", new ItemStack(BonusBlocks.GLASS_QUARTZ, 4));

        RecipeBuilder.Shaped(MOD_ID, "OOO", "OBO", "OOO")
                .addInput('O', Blocks.OBSIDIAN)
                .addInput('B', Items.BONE)
                .create("boneshale", new ItemStack(Blocks.BONESHALE, 4));

        RecipeBuilder.Shaped(MOD_ID, "S", "W")
                .addInput('S', (Items.STRING))
                .addInput('W', (BonusItems.SOULWAX))
                .create("soulwax_candle", new ItemStack(BonusBlocks.CANDLE_SOULWAX, 2));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "   ", "PPP")
                .addInput('P', ("minecraft:planks"))
                .create("empty_bookshelf", new ItemStack(BonusBlocks.BOOKSHELF_EMPTY_PLANKS_OAK, 1));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP")
                .addInput('P', (Items.STICK))
                .create("branches", new ItemStack(BonusBlocks.BRANCH, 2));

        RecipeBuilder.Shaped(MOD_ID, "S", "C")
                .addInput('S', BonusBlocks.SKULL_CARVED_IDLE)
                .addInput('C', BonusBlocks.CANDLE_SOULWAX)
                .create("skull_lantern", new ItemStack(BonusBlocks.SKULL_CARVED_ACTIVE, 1));

        RecipeBuilder.Shaped(MOD_ID, "S", "C")
                .addInput('S', BonusBlocks.SKULL_CARVED_IDLE)
                .addInput('C', Blocks.TORCH_REDSTONE_ACTIVE)
                .create("redstone_skull", new ItemStack(BonusBlocks.SKULL_REDSTONE, 1));

        RecipeBuilder.Shapeless(MOD_ID)
                .addInput(new ItemStack(Items.DYE, 1, 2))
                .addInput(new ItemStack(Items.DYE, 1, 11))
                .create("green_dye_white_dye_to_lime_dye", new ItemStack(Items.DYE, 2, 10));

        for (int color = 0; color < 16; color++) {

            RecipeBuilder.Shaped(MOD_ID, "CCC", "CCC")
                    .addInput('C', new ItemStack(Blocks.WOOL, 1, color))
                    .create("wool_slabs", new ItemStack(BonusBlocks.SLAB_WOOL, 6, color << 4));

            RecipeBuilder.Shaped(MOD_ID, "C  ", "CC ", "CCC")
                    .addInput('C', new ItemStack(Blocks.WOOL, 1, color))
                    .create("wool_stairs", new ItemStack(BonusBlocks.STAIRS_WOOL, 6, color << 4));
        }

        Registries.RECIPES.addCustomRecipe(
                "bonusblocks:workbench/wool_stairs_dying",
                new RecipeEntryDyeing(
                        new RecipeSymbol("bonusblocks:wool_stairs"),
                        BonusBlocks.STAIRS_WOOL.getDefaultStack(), true, false
                )
        );

        Registries.RECIPES.addCustomRecipe(
                "bonusblocks:workbench/wool_stairs_undying",
                new RecipeEntryUndyeing(
                        new RecipeSymbol("bonusblocks:wool_stairs"),
                        BonusBlocks.STAIRS_WOOL.getDefaultStack()
                )
        );

        Registries.RECIPES.addCustomRecipe(
                "bonusblocks:workbench/wool_slabs_dying",
                new RecipeEntryDyeing(
                        new RecipeSymbol("bonusblocks:wool_slabs"),
                        BonusBlocks.SLAB_WOOL.getDefaultStack(), true, false
                )
        );

        Registries.RECIPES.addCustomRecipe(
                "bonusblocks:workbench/wool_slabs_undying",
                new RecipeEntryUndyeing(
                        new RecipeSymbol("bonusblocks:wool_slabs"),
                        BonusBlocks.SLAB_WOOL.getDefaultStack()
                )
        );


        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("marble_pillar");
        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("green_dye_white_dye_to_lime_dye");

        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("block_of_steel");
        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("block_of_steel_to_steel_ingot");
    }

    public static void doorRecipes() {
        RecipeBuilderShaped templateDoor = new RecipeBuilderShaped(MOD_ID, "PP", "PP", "PP");

        templateDoor.addInput('P', BonusBlocks.GLASS_OBSIDIAN).create("door_glass_obsdian", new ItemStack(BonusItems.DOOR_GLASS_OBSIDIAN, 2));
        templateDoor.addInput('P', BonusBlocks.GLASS_QUARTZ).create("door_glass_quartz", new ItemStack(BonusItems.DOOR_GLASS_QUARTZ, 2));
        templateDoor.addInput('P', Blocks.GLASS_STEEL).create("door_glass_steel", new ItemStack(BonusItems.DOOR_GLASS_STEEL, 2));
        templateDoor.addInput('P', Items.INGOT_STEEL).create("door_steel", new ItemStack(BonusItems.DOOR_STEEL, 2));
        templateDoor.addInput('P', Items.INGOT_GOLD).create("door_gold", new ItemStack(BonusItems.DOOR_GOLD, 2));
        templateDoor.addInput('P', BonusItems.ORE_RAW_VERDIGRIS).create("door_verdigris", new ItemStack(BonusItems.DOOR_VERDIGRIS, 2));
        templateDoor.addInput('P', BonusItems.INGOT_VERDIGRIS).create("door_verdigris_shine", new ItemStack(BonusItems.DOOR_VERDIGRIS_SHINE, 2));

        templateDoor.addInput('P', Blocks.STONE).create("door_stone", new ItemStack(BonusItems.DOOR_STONE, 2));
        templateDoor.addInput('P', Blocks.BASALT).create("door_basalt", new ItemStack(BonusItems.DOOR_BASALT, 2));
        templateDoor.addInput('P', Blocks.LIMESTONE).create("door_limestone", new ItemStack(BonusItems.DOOR_LIMESTONE, 2));
        templateDoor.addInput('P', Blocks.GRANITE).create("door_granite", new ItemStack(BonusItems.DOOR_GRANITE, 2));
        templateDoor.addInput('P', Blocks.PERMAFROST).create("door_permafrost", new ItemStack(BonusItems.DOOR_PERMAFROST, 2));
        templateDoor.addInput('P', Blocks.MARBLE).create("door_marble", new ItemStack(BonusItems.DOOR_MARBLE, 2));
        templateDoor.addInput('P', Blocks.SLATE).create("door_slate", new ItemStack(BonusItems.DOOR_SLATE, 2));
        templateDoor.addInput('P', Blocks.NETHERRACK).create("door_netherrack", new ItemStack(BonusItems.DOOR_NETHERRACK, 2));


        RecipeBuilderShaped templateTrapdoor = new RecipeBuilderShaped(MOD_ID, "PPP", "PPP");

        templateTrapdoor.addInput('P', BonusBlocks.GLASS_OBSIDIAN).create("glass_obsidian_trapdoor", new ItemStack(BonusBlocks.TRAPDOOR_GLASS_OBSIDIAN, 6));
        templateTrapdoor.addInput('P', BonusBlocks.GLASS_QUARTZ).create("glass_quartz_trapdoor", new ItemStack(BonusBlocks.TRAPDOOR_GLASS_QUARTZ, 6));
        templateTrapdoor.addInput('P', Blocks.GLASS_STEEL).create("glass_steel_trapdoor", new ItemStack(BonusBlocks.TRAPDOOR_GLASS_STEEL, 6));
        templateTrapdoor.addInput('P', Items.INGOT_STEEL).create("steel_trapdoor", new ItemStack(BonusBlocks.TRAPDOOR_STEEL, 6));
        templateTrapdoor.addInput('P', Items.INGOT_GOLD).create("gold_trapdoor", new ItemStack(BonusBlocks.TRAPDOOR_GOLD, 6));
        templateTrapdoor.addInput('P', BonusItems.ORE_RAW_VERDIGRIS).create("verdigris_trapdoor", new ItemStack(BonusBlocks.TRAPDOOR_VERDIGRIS, 6));
        templateTrapdoor.addInput('P', BonusItems.INGOT_VERDIGRIS).create("verdigris_shine_trapdoor", new ItemStack(BonusBlocks.TRAPDOOR_VERDIGRIS_SHINE, 6));

        templateTrapdoor.addInput('P', Blocks.STONE).create("trapdoor_stone", new ItemStack(BonusBlocks.TRAPDOOR_STONE, 6));
        templateTrapdoor.addInput('P', Blocks.BASALT).create("trapdoor_basalt", new ItemStack(BonusBlocks.TRAPDOOR_BASALT, 6));
        templateTrapdoor.addInput('P', Blocks.LIMESTONE).create("trapdoor_limestone", new ItemStack(BonusBlocks.TRAPDOOR_LIMESTONE, 6));
        templateTrapdoor.addInput('P', Blocks.GRANITE).create("trapdoor_granite", new ItemStack(BonusBlocks.TRAPDOOR_GRANITE, 6));
        templateTrapdoor.addInput('P', Blocks.PERMAFROST).create("trapdoor_permafrost", new ItemStack(BonusBlocks.TRAPDOOR_PERMAFROST, 6));
        templateTrapdoor.addInput('P', Blocks.MARBLE).create("trapdoor_marble", new ItemStack(BonusBlocks.TRAPDOOR_MARBLE, 6));
        templateTrapdoor.addInput('P', Blocks.SLATE).create("trapdoor_slate", new ItemStack(BonusBlocks.TRAPDOOR_SLATE, 6));
        templateTrapdoor.addInput('P', Blocks.NETHERRACK).create("trapdoor_netherrack", new ItemStack(BonusBlocks.TRAPDOOR_NETHERRACK, 6));


    }

    public static void furnaceRecipes() {
        RecipeBuilder.Furnace(MOD_ID)
                .setInput(Blocks.BLOCK_CLAY)
                .create("baked_clay_furnace", BonusBlocks.BLOCK_CLAY_BAKED.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(Blocks.SOULSAND)
                .create("soulwax", BonusItems.SOULWAX.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(BonusItems.ORE_RAW_VERDIGRIS)
                .create("raw_verdigris_to_verdigris_ingot", BonusItems.INGOT_VERDIGRIS.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput("bonusblocks:verdigris_ores")
                .create("verdigris_ores_to_verdigris_ingot", BonusItems.INGOT_VERDIGRIS.getDefaultStack());
    }

    public static void blastFurnaceRecipes() {
        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.BLOCK_CLAY)
                .create("baked_clay_blast", BonusBlocks.BLOCK_CLAY_BAKED.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.OBSIDIAN)
                .create("obsidian_glass", BonusBlocks.GLASS_OBSIDIAN.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.SOULSAND)
                .create("soulwax_blast", BonusItems.SOULWAX.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.COBBLE_STONE)
                .create("cobble_stone_to_stone", Blocks.STONE.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.COBBLE_BASALT)
                .create("cobble_basalt_to_basalt", Blocks.BASALT.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.COBBLE_STONE)
                .create("cobble_granite_to_granite", Blocks.GRANITE.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.COBBLE_LIMESTONE)
                .create("cobble_limestone_to_limestone", Blocks.LIMESTONE.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.LIMESTONE)
                .create("limestone_to_marble", Blocks.MARBLE.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.STONE)
                .create("stone_to_slate", Blocks.SLATE.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.BASALT)
                .create("basalt_to_olivine", Items.OLIVINE.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.GRANITE)
                .create("granite_to_quartz", Items.QUARTZ.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput("minecraft:logs")
                .create("logs_to_scorched_logs", BonusBlocks.LOG_SCORCHED.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(BonusItems.ORE_RAW_VERDIGRIS)
                .create("raw_verdigris_to_verdigris_ingot", BonusItems.INGOT_VERDIGRIS.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput("bonusblocks:verdigris_ores")
                .create("verdigris_ores_to_verdigris_ingot", BonusItems.ORE_RAW_VERDIGRIS.getDefaultStack());

        RecipeBuilder.ModifyBlastFurnace("minecraft").removeRecipe("cobble_basalt_to_olivine");
        RecipeBuilder.ModifyBlastFurnace("minecraft").removeRecipe("cobble_stone_to_slate");
        RecipeBuilder.ModifyBlastFurnace("minecraft").removeRecipe("cobble_granite_to_quartz");
        RecipeBuilder.ModifyBlastFurnace("minecraft").removeRecipe("cobble_limestone_to_marble");

        RecipeBuilder.ModifyBlastFurnace("minecraft").removeRecipe("logs_to_charcoal");
    }

    public static void trommelRecipes() {
        RecipeBuilder.Trommel(MOD_ID)
                .setInput(BonusBlocks.DIRT_RICH)
                .addEntry(new WeightedRandomLootObject(Items.ORE_RAW_GOLD.getDefaultStack(), 1), 10.0)
                .addEntry(new WeightedRandomLootObject(Items.ORE_RAW_IRON.getDefaultStack(), 1, 2), 15.0)
                .addEntry(new WeightedRandomLootObject(Items.QUARTZ.getDefaultStack(), 1, 4), 25.0)
                .addEntry(new WeightedRandomLootObject(Items.OLIVINE.getDefaultStack(), 1, 4), 25.0)
                .addEntry(new WeightedRandomLootObject(new ItemStack(Items.DYE, 1, 4), 2, 4), 20.0)
                .addEntry(new WeightedRandomLootObject(Items.CLAY.getDefaultStack(), 4, 8), 10.0)
                .addEntry(new WeightedRandomLootObject(Items.AMMO_PEBBLE.getDefaultStack(), 1, 5), 5.0)
                .create("trommel_dirt_rich");

        RecipeBuilder.Trommel(MOD_ID)
                .setInput(BonusBlocks.GRAVEL_RICH)
                .addEntry(new WeightedRandomLootObject(Items.ORE_RAW_IRON.getDefaultStack(), 1, 2), 30.0)
                .addEntry(new WeightedRandomLootObject(Items.OLIVINE.getDefaultStack(), 1, 3), 20.0)
                .addEntry(new WeightedRandomLootObject(Items.QUARTZ.getDefaultStack(), 1), 0.5)
                .addEntry(new WeightedRandomLootObject(new ItemStack(Items.DYE, 1, 4), 2, 6), 20.0)
                .addEntry(new WeightedRandomLootObject(Items.SULPHUR.getDefaultStack(), 1, 3), 10.0)
                .addEntry(new WeightedRandomLootObject(Items.FLINT.getDefaultStack(), 1, 2), 5.0)
                .addEntry(new WeightedRandomLootObject(Items.AMMO_PEBBLE.getDefaultStack(), 1, 5), 5.0)
                .create("trommel_gravel_rich");

        RecipeBuilder.Trommel(MOD_ID)
                .setInput(BonusBlocks.SAND_RICH)
                .addEntry(new WeightedRandomLootObject(Items.ORE_RAW_GOLD.getDefaultStack(), 1, 2), 30.0)
                .addEntry(new WeightedRandomLootObject(Items.QUARTZ.getDefaultStack(), 1, 3), 20.0)
                .addEntry(new WeightedRandomLootObject(Items.CLAY.getDefaultStack(), 4, 8), 10.0)
                .addEntry(new WeightedRandomLootObject(Items.OLIVINE.getDefaultStack(), 1), 10.0)
                .addEntry(new WeightedRandomLootObject(Items.BONE.getDefaultStack(), 1, 3), 10.0)
                .addEntry(new WeightedRandomLootObject(Items.SULPHUR.getDefaultStack(), 1), 5.0)
                .addEntry(new WeightedRandomLootObject(Items.FLINT.getDefaultStack(), 1, 3), 5.0)
                .addEntry(new WeightedRandomLootObject(Items.AMMO_PEBBLE.getDefaultStack(), 1, 4), 5.0)
                .create("trommel_sand_rich");
    }

    @Override
    public void initNamespaces() {
        RecipeBuilder.initNameSpace(MOD_ID);
        RecipeBuilder.getRecipeNamespace(MOD_ID);

        Registries.ITEM_GROUPS.getItem("minecraft:trommel_dirt").add(BonusBlocks.DIRT_BAKED.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:trommel_dirt").add(Blocks.MUD.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.LOG_SCORCHED.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.LOG_SHRUB.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.LOG_JACARANDA.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.LOG_CACAO.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:moss_stones").add(BonusBlocks.MOSS.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:leaves").add(BonusBlocks.LEAVES_OAK_MOSSY.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:leaves").add(BonusBlocks.LEAVES_JACARANDA.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:stones").add(Blocks.PERMAFROST.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:stones").add(Blocks.NETHERRACK.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:grasses").add(BonusBlocks.GRASS_OVERGROWN.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:grasses").add(BonusBlocks.GRASS_SCORCHED_OVERGROWN.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:grasses").add(Blocks.GRASS_SCORCHED.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:dirt").add(BonusBlocks.DIRT_BAKED.getDefaultStack());

        Registries.ITEM_GROUPS.register("bonusblocks:verdigris_ores", Registries.stackListOf(new ItemStack(BonusBlocks.ORE_VERDIGRIS_NETHERRACK, 1)));

        DyeColor[] var17 = DyeColor.values();
        List<ItemStack> stairsStackList = new ArrayList<>();
        List<ItemStack> slabStackList = new ArrayList<>();

        for (DyeColor color : var17) {
            stairsStackList.add(new ItemStack(BonusBlocks.STAIRS_WOOL, 1, color.blockMeta << 4));
            slabStackList.add(new ItemStack(BonusBlocks.SLAB_WOOL, 1, color.blockMeta << 4));
        }

        Registries.ITEM_GROUPS.register("bonusblocks:wool_slabs", slabStackList);
        Registries.ITEM_GROUPS.register("bonusblocks:wool_stairs", stairsStackList);

    }
}