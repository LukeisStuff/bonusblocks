package luke.bonusblocks;

import luke.bonusblocks.block.BonusBlocks;
import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;

public class BonusRecipes implements RecipeEntrypoint {

    public void initializeRecipes() {
        RecipeBuilderShaped templateLogtoPlank = new RecipeBuilderShaped(MOD_ID, "X");
        templateLogtoPlank.addInput('X', BonusBlocks.LOG_JACARANDA).create("log_jacaranda_to_planks", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 10));
        templateLogtoPlank.addInput('X', BonusBlocks.LOG_SCORCHED).create("log_scorched_to_planks", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 15));
        templateLogtoPlank.addInput('X', BonusBlocks.LOG_SHRUB).create("log_shrub_to_planks", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 8));
        templateLogtoPlank.addInput('X', BonusBlocks.LOG_CACAO).create("log_cacao_to_planks", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 5));

        RecipeBuilderShaped templateItemtoBlock = new RecipeBuilderShaped(MOD_ID, "XXX", "XXX", "XXX");
        templateItemtoBlock.addInput('X', Items.BONE).create("block_of_bone", new ItemStack(BonusBlocks.BLOCK_BONE, 1));
        templateItemtoBlock.addInput('X', new ItemStack(Items.DYE, 1, 15)).create("skull", new ItemStack(BonusBlocks.SKULL, 1));
        templateItemtoBlock.addInput('X', Items.SLIMEBALL).create("block_of_slime", new ItemStack(BonusBlocks.BLOCK_SLIME, 1));
        templateItemtoBlock.addInput('X', Items.SULPHUR).create("block_of_sulphur", new ItemStack(BonusBlocks.BLOCK_SULPHUR, 1));
        templateItemtoBlock.addInput('X', Items.DUST_SUGAR).create("block_of_sugar", new ItemStack(BonusBlocks.BLOCK_SUGAR, 1));
        templateItemtoBlock.addInput('X', Items.CLOTH).create("block_of_cloth", new ItemStack(BonusBlocks.BLOCK_CLOTH, 1));
        templateItemtoBlock.addInput('X', Items.INGOT_STEEL_CRUDE).create("block_of_crude_steel", new ItemStack(BonusBlocks.BLOCK_CRUDE_STEEL, 1));
        templateItemtoBlock.addInput('X', Items.FLINT).create("block_of_flint", new ItemStack(BonusBlocks.BLOCK_FLINT, 1));
        templateItemtoBlock.addInput('X', Items.ORE_RAW_GOLD).create("block_of_raw_gold", new ItemStack(BonusBlocks.BLOCK_RAW_GOLD, 1));
        templateItemtoBlock.addInput('X', Items.ORE_RAW_IRON).create("block_of_raw_iron", new ItemStack(BonusBlocks.BLOCK_RAW_IRON, 1));
        templateItemtoBlock.addInput('X', BonusItems.oreRawCopper).create("block_of_raw_copper", new ItemStack(BonusBlocks.BLOCK_RAW_COPPER, 1));
        templateItemtoBlock.addInput('X', BonusItems.oreRawSilver).create("block_of_raw_silver", new ItemStack(BonusBlocks.BLOCK_RAW_SILVER, 1));
        templateItemtoBlock.addInput('X', Items.LEATHER).create("block_of_leather", new ItemStack(BonusBlocks.BLOCK_LEATHER, 1));

        RecipeBuilderShaped templateBlocktoItem = new RecipeBuilderShaped(MOD_ID, "X");
        templateBlocktoItem.addInput('X', BonusBlocks.BLOCK_BONE).create("block_of_bone_to_bone", new ItemStack(Items.BONE, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.BLOCK_SLIME).create("block_of_slime_to_slime", new ItemStack(Items.SLIMEBALL, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.BLOCK_SULPHUR).create("block_of_sulphur_to_sulphur", new ItemStack(Items.SULPHUR, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.BLOCK_SUGAR).create("block_of_sugar_to_sugar", new ItemStack(Items.DUST_SUGAR, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.BLOCK_CLOTH).create("block_of_cloth_to_cloth", new ItemStack(Items.CLOTH, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.BLOCK_CRUDE_STEEL).create("block_of_crude_steel_to_crude_steel", new ItemStack(Items.INGOT_STEEL_CRUDE, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.BLOCK_FLINT).create("block_of_flint_to_flint", new ItemStack(Items.FLINT, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.BLOCK_RAW_GOLD).create("block_of_raw_gold_to_raw_gold", new ItemStack(Items.ORE_RAW_GOLD, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.BLOCK_RAW_IRON).create("block_of_raw_iron_to_raw_iron", new ItemStack(Items.ORE_RAW_IRON, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.BLOCK_RAW_COPPER).create("block_of_raw_copper_to_raw_copper", new ItemStack(BonusItems.oreRawCopper, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.BLOCK_RAW_SILVER).create("block_of_raw_silver_to_raw_silver", new ItemStack(BonusItems.oreRawSilver, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.BLOCK_LEATHER).create("block_of_leather_to_leather", new ItemStack(Items.LEATHER, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.BLOCK_COPPER).create("block_of_copper_to_copper", new ItemStack(BonusItems.ingotCopper, 2));
        templateBlocktoItem.addInput('X', BonusBlocks.BLOCK_SILVER).create("block_of_silver_to_silver", new ItemStack(BonusItems.ingotSilver, 2));

        RecipeBuilder.Shaped(MOD_ID, " S ", "SGS", "SSS")
                .addInput('S', BonusItems.ingotSilver)
                .addInput('G', Blocks.GLOWSTONE)
                .create("silver_chandelier", new ItemStack(BonusBlocks.CHANDELIER_SILVER, 1));

        RecipeBuilder.Shaped(MOD_ID, "T T", "SSS", " S ")
                .addInput('S', BonusItems.ingotSilver)
                .addInput('T', Blocks.TORCH_COAL)
                .create("silver_candelabra", new ItemStack(BonusBlocks.CANDELABRA_SILVER, 2));

        RecipeBuilder.Shaped(MOD_ID, " S ", "STS", " S ")
                .addInput('S', BonusItems.ingotSilver)
                .addInput('T', Blocks.TORCH_COAL)
                .create("silver_lantern", new ItemStack(BonusBlocks.LANTERN_SILVER, 2));

        RecipeBuilder.Shaped(MOD_ID, "S S", "S S", " S ")
                .addInput('S', BonusItems.ingotSilver)
                .create("silver_vase", new ItemStack(BonusBlocks.VASE_SILVER, 4));

        RecipeBuilder.Shaped(MOD_ID, " S ", "SSS", " S ")
                .addInput('S', BonusItems.ingotSilver)
                .create("silver_vane", new ItemStack(BonusBlocks.VANE_SILVER, 4));

        RecipeBuilder.Shaped(MOD_ID, " S ", "SSS", "S S")
                .addInput('S', BonusItems.ingotSilver)
                .create("silver_chimes", new ItemStack(BonusBlocks.CHIMES_SILVER, 2));

        RecipeBuilder.Shaped(MOD_ID, "WWW", "SSS")
                .addInput('W', ("minecraft:wools"))
                .addInput('S', BonusItems.ingotSilver)
                .create("silver_bed", new ItemStack(BonusItems.bedSilver, 1));

        RecipeBuilder.Shaped(MOD_ID, "CCC", "S S")
                .addInput('C', Items.CLOTH)
                .addInput('S', BonusItems.ingotSilver)
                .create("silver_seat", new ItemStack(BonusItems.seatSilver, 1));


        RecipeBuilder.Shaped(MOD_ID, "WS", "SW")
                .addInput('W', Items.WHEAT)
                .addInput('S', Items.STICK)
                .create("block_of_thatch", new ItemStack(BonusBlocks.THATCH, 4));

        RecipeBuilder.Shaped(MOD_ID, "CCC", "C C", "CCC")
                .addInput('C', BonusItems.ingotCopper)
                .create("copper_mesh", new ItemStack(BonusBlocks.MESH_COPPER, 8));

        RecipeBuilder.Shaped(MOD_ID, "WS", "SW")
                .addInput('W', Items.WHEAT)
                .addInput('S', Items.LEATHER)
                .create("block_of_wicker", new ItemStack(BonusBlocks.BLOCK_WICKER, 4));

        RecipeBuilder.Shaped(MOD_ID, "GGG", "GGG")
                .addInput('G', BonusBlocks.GLASS_OBSIDIAN)
                .create("glass_obsidian_trapdoor", new ItemStack(BonusBlocks.TRAPDOOR_GLASS_OBSIDIAN, 8));

        RecipeBuilder.Shaped(MOD_ID, "GQ", "QG")
                .addInput('G', Blocks.GLASS)
                .addInput('Q', Items.QUARTZ)
                .create("glass_quartz", new ItemStack(BonusBlocks.GLASS_QUARTZ, 4));

        RecipeBuilder.Shaped(MOD_ID, "CIC")
                .addInput('C', BonusBlocks.BLOCK_COPPER)
                .addInput('I', BonusItems.ingotCopper)
                .create("copper_pipe", new ItemStack(BonusBlocks.PIPE_COPPER, 8));
        RecipeBuilder.Shaped(MOD_ID, "C", "I", "C")
                .addInput('C', BonusBlocks.BLOCK_COPPER)
                .addInput('I', BonusItems.ingotCopper)
                .create("copper_pipe", new ItemStack(BonusBlocks.PIPE_COPPER, 8));

        RecipeBuilder.Shaped(MOD_ID, "CIC")
                .addInput('C', Blocks.BLOCK_IRON)
                .addInput('I', Items.INGOT_IRON)
                .create("iron_girder", new ItemStack(BonusBlocks.GIRDER_IRON, 8));
        RecipeBuilder.Shaped(MOD_ID, "C", "I", "C")
                .addInput('C', Blocks.BLOCK_IRON)
                .addInput('I', Items.INGOT_IRON)
                .create("iron_girder", new ItemStack(BonusBlocks.GIRDER_IRON, 8));

        RecipeBuilderShaped templateFlowertoDye = new RecipeBuilderShaped(MOD_ID, "X");
        templateFlowertoDye.addInput('X', BonusBlocks.FLOWER_SILVER).create("flower_silver_to_dye", new ItemStack(Items.DYE, 2, 7));
        templateFlowertoDye.addInput('X', BonusBlocks.FLOWER_CYAN).create("flower_cyan_to_dye", new ItemStack(Items.DYE, 2, 6));
        templateFlowertoDye.addInput('X', BonusBlocks.FLOWER_MAGENTA).create("flower_magenta_to_dye", new ItemStack(Items.DYE, 2, 13));
        templateFlowertoDye.addInput('X', BonusBlocks.FLOWER_LIME).create("flower_lime_to_dye", new ItemStack(Items.DYE, 2, 10));
        templateFlowertoDye.addInput('X', BonusBlocks.MUSHROOM_GRAY).create("mushroom_gray_to_dye", new ItemStack(Items.DYE, 2, 8));
        templateFlowertoDye.addInput('X', Blocks.ALGAE).create("algae_to_slime", new ItemStack(Items.SLIMEBALL, 2));

        RecipeBuilderShaped templateMushroomToBlock = new RecipeBuilderShaped(MOD_ID, "XX", "XX");
        templateMushroomToBlock.addInput('X', Blocks.MUSHROOM_RED).create("red_mushroom_block", new ItemStack(BonusBlocks.FUNGI_RED, 4));
        templateMushroomToBlock.addInput('X', Blocks.MUSHROOM_BROWN).create("brown_mushroom_block", new ItemStack(BonusBlocks.FUNGI_BROWN, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.MUSHROOM_GRAY).create("gray_mushroom_block", new ItemStack(BonusBlocks.FUNGI_GRAY, 4));

        templateMushroomToBlock.addInput('X', BonusItems.ingotCopper).create("block_of_copper", new ItemStack(BonusBlocks.BLOCK_COPPER, 2));
        templateMushroomToBlock.addInput('X', BonusItems.ingotSilver).create("block_of_silver", new ItemStack(BonusBlocks.BLOCK_SILVER, 2));
        templateMushroomToBlock.addInput('X', BonusBlocks.BLOCK_SILVER).create("silver_bricks", new ItemStack(BonusBlocks.BRICK_SILVER, 4));

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
        templateBricks.addInput('X', BonusBlocks.CLAY_BAKED).create("clay_bricks", new ItemStack(BonusBlocks.brickClayBaked, 4));
        templateBricks.addInput('X', BonusBlocks.SCORCHEDSTONE).create("scorched_bricks", new ItemStack(BonusBlocks.brickScorchedstone, 4));
        templateBricks.addInput('X', Blocks.MUD_BAKED).create("mud_bricks", new ItemStack(BonusBlocks.brickMud, 4));
        templateBricks.addInput('X', Items.INGOT_STEEL).create("steel_bricks", new ItemStack(BonusBlocks.brickSteel, 4));
        templateBricks.addInput('X', Items.QUARTZ).create("quartz_bricks", new ItemStack(BonusBlocks.brickQuartz, 4));
        templateBricks.addInput('X', Items.OLIVINE).create("olivine_bricks", new ItemStack(BonusBlocks.brickOlivine, 4));
        templateBricks.addInput('X', BonusBlocks.LAZURITE).create("lazurite_bricks", new ItemStack(BonusBlocks.brickLazurite, 4));
        templateBricks.addInput('X', BonusBlocks.PERIDOT).create("peridot_bricks", new ItemStack(BonusBlocks.brickPeridot, 4));

        templateBricks.addInput('X', Blocks.CACTUS).create("tatami", new ItemStack(BonusBlocks.TATAMI, 4));

        templateBricks.addInput('X', Blocks.DIRT_SCORCHED).create("scorchedstone", new ItemStack(BonusBlocks.SCORCHEDSTONE, 4));

        RecipeBuilderShaped templateOvergrown = new RecipeBuilderShaped(MOD_ID, "X", "X");
        templateOvergrown.addInput('X', Blocks.GRASS).create("overgrown_grass", new ItemStack(BonusBlocks.GRASS_OVERGROWN, 2));
        templateOvergrown.addInput('X', Blocks.GRASS_RETRO).create("overgrown_grass_retro", new ItemStack(BonusBlocks.GRASS_RETRO_OVERGROWN, 2));
        templateOvergrown.addInput('X', Blocks.GRASS_SCORCHED).create("overgrown_grass_scorched", new ItemStack(BonusBlocks.GRASS_SCORCHED_OVERGROWN, 2));
        templateOvergrown.addInput('X', Blocks.PATH_DIRT).create("overgrown_path", new ItemStack(BonusBlocks.PATH_DIRT_OVERGROWN, 2));

        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("marble_pillar");
        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("green_dye_white_dye_to_lime_dye");
        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("pebbles_to_granite");
        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("bed");

        RecipeBuilder.ModifyBlastFurnace("minecraft").removeRecipe("cobble_basalt_to_olivine");
        RecipeBuilder.ModifyBlastFurnace("minecraft").removeRecipe("cobble_stone_to_slate");
        RecipeBuilder.ModifyBlastFurnace("minecraft").removeRecipe("cobble_granite_to_quartz");

        RecipeBuilder.Shapeless(MOD_ID)
                .addInput(new ItemStack(Items.DYE, 1, 2))
                .addInput(new ItemStack(Items.DYE, 1, 11))
                .create("green_dye_white_dye_to_lime_dye", new ItemStack(Items.DYE, 2, 10));

        RecipeBuilderShaped templatePebbles = new RecipeBuilderShaped(MOD_ID, "PX", "XP");
        templatePebbles.addInput('X', Items.QUARTZ).addInput('P', Items.AMMO_PEBBLE).create("pebbles_to_granite", new ItemStack(Blocks.GRANITE, 2));
        templatePebbles.addInput('X', Blocks.ICE).addInput('P', Items.AMMO_PEBBLE).create("pebbles_to_permafrost", new ItemStack(Blocks.COBBLE_PERMAFROST, 2));

        templatePebbles.addInput('X', Items.OLIVINE).addInput('P', Items.AMMO_PEBBLE).create("pebbles_to_peridot", new ItemStack(BonusBlocks.cobblePeridot, 2));
        templatePebbles.addInput('X', Items.DYE, 4).addInput('P', Items.AMMO_PEBBLE).create("pebbles_to_lazurite", new ItemStack(BonusBlocks.cobbleLazurite, 2));

        templatePebbles.addInput('X', Blocks.STONE).addInput('P', BonusItems.MOSSBALL).create("stone_to_moss_stone", new ItemStack(Blocks.MOSS_STONE, 2));
        templatePebbles.addInput('X', Blocks.COBBLE_STONE).addInput('P', BonusItems.MOSSBALL).create("cobble_stone_to_moss_stone", new ItemStack(Blocks.COBBLE_STONE_MOSSY, 2));
        templatePebbles.addInput('X', Blocks.BRICK_STONE_POLISHED).addInput('P', BonusItems.MOSSBALL).create("polished_stone_brick_to_mossy_polished_stone_brick", new ItemStack(Blocks.BRICK_STONE_POLISHED_MOSSY, 2));
        templatePebbles.addInput('X', Blocks.BASALT).addInput('P', BonusItems.MOSSBALL).create("basalt_to_moss_stone", new ItemStack(Blocks.MOSS_BASALT, 2));
        templatePebbles.addInput('X', Blocks.LIMESTONE).addInput('P', BonusItems.MOSSBALL).create("limestone_to_moss_stone", new ItemStack(Blocks.MOSS_LIMESTONE, 2));
        templatePebbles.addInput('X', Blocks.GRANITE).addInput('P', BonusItems.MOSSBALL).create("granite_to_moss_stone", new ItemStack(Blocks.MOSS_GRANITE, 2));
        templatePebbles.addInput('X', Blocks.LOG_OAK).addInput('P', BonusItems.MOSSBALL).create("oak_log_to_moss_oak_log", new ItemStack(Blocks.LOG_OAK_MOSSY, 2));

        templatePebbles.addInput('X', BonusItems.MOSSBALL).addInput('P', BonusItems.MOSSBALL).create("moss_balls_to_moss", new ItemStack(BonusBlocks.MOSS, 1));

        templatePebbles.addInput('X', Blocks.DIRT).addInput('P', Blocks.MUD_BAKED).create("rough_dirt", new ItemStack(BonusBlocks.DIRT_ROUGH, 4));


        RecipeBuilder.Shaped(MOD_ID, "WWW", "PPP")
                .addInput('P',("minecraft:planks"))
                .addInput('W', ("minecraft:wools"))
                .create("bed", new ItemStack(Items.BED, 1));

//        RecipeBuilder.Shaped(MOD_ID, "WWW")
//                .addInput('W', (Items.cloth))
//                .create("sleepingbag", new ItemStack(BonusBlocks.bedrollItem, 1));

        RecipeBuilderShaped templatePillar = new RecipeBuilderShaped(MOD_ID, "X", "X", "X");
        templatePillar.addInput('X', Blocks.MARBLE).create("marble_pillar", new ItemStack(Blocks.PILLAR_MARBLE, 3));
        templatePillar.addInput('X', Blocks.SLATE).create("slate_pillar", new ItemStack(BonusBlocks.PILLAR_SLATE, 3));


        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP", "PPP")
                .addInput('P', Blocks.PLANKS_OAK)
                .create("box", new ItemStack(BonusBlocks.BOX, 9));

        RecipeBuilder.Shaped(MOD_ID, "CC", "CC")
                .addInput('C', Blocks.CHEST_PLANKS_OAK)
                .create("crate", new ItemStack(BonusBlocks.CRATE, 8));

        RecipeBuilder.Shaped(MOD_ID, "S", "C")
                .addInput('S', BonusBlocks.skullCarved)
                .addInput('C', BonusBlocks.candleSoulwax)
                .create("skull_lantern", new ItemStack(BonusBlocks.skullActive, 1));

        for (int color = 0; color < 16; color++) {
            RecipeBuilder.Shapeless(MOD_ID)
                    .addInput("bonusblocks:block/crates")
                    .addInput(new ItemStack(Items.DYE, 1, 15 - color))
                    .create("painted_crate_dye", new ItemStack(BonusBlocks.cratePainted, 1, color));

            RecipeBuilder.Shaped(MOD_ID, "CC", "CC")
                    .addInput('C', new ItemStack(Blocks.CHEST_PLANKS_OAK_PAINTED, 1, color << 4))
                    .create("painted_crate", new ItemStack(BonusBlocks.cratePainted, 8, color));
        }

        for (int color = 0; color < 16; color++) {
            RecipeBuilder.Shapeless(MOD_ID)
                    .addInput("bonusblocks:block/wool_slab")
                    .addInput(new ItemStack(Items.DYE, 1, 15 - color))
                    .create("wool_slab_dye", new ItemStack(BonusBlocks.slabWool, 1, color << 4));

            RecipeBuilder.Shaped(MOD_ID, "CCC", "CCC")
                    .addInput('C', new ItemStack(Blocks.WOOL, 1, color))
                    .create("wool_slab", new ItemStack(BonusBlocks.slabWool, 6, color << 4));
        }
        for (int color = 0; color < 16; color++) {
            RecipeBuilder.Shapeless(MOD_ID)
                    .addInput("bonusblocks:block/wool_stairs")
                    .addInput(new ItemStack(Items.DYE, 1, 15 - color))
                    .create("wool_stairs_dye", new ItemStack(BonusBlocks.stairsWool, 1, color << 4));

            RecipeBuilder.Shaped(MOD_ID, "C  ", "CC ", "CCC")
                    .addInput('C', new ItemStack(Blocks.WOOL, 1, color))
                    .create("wool_stairs", new ItemStack(BonusBlocks.stairsWool, 6, color << 4));
        }

        RecipeBuilder.Shaped(MOD_ID, "PPP", "   ", "PPP")
                .addInput('P', ("minecraft:planks"))
                .create("empty_bookshelf", new ItemStack(BonusBlocks.BOOKSHELF_EMPTY_PLANKS_OAK, 1));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP")
                .addInput('P', (Items.STICK))
                .create("branches", new ItemStack(BonusBlocks.BRANCH, 2));


        RecipeBuilderShaped templatePolished = new RecipeBuilderShaped(MOD_ID, "X", "X");
        templatePolished.addInput('X', Blocks.marble).create("marble_polished", new ItemStack(BonusBlocks.marblePolished, 2));

        RecipeBuilderShaped templateCarvedSlab = new RecipeBuilderShaped(MOD_ID, "X", "X");
        templateCarvedSlab.addInput('X', Blocks.slabCapstoneMarble).create("marble_capstone_carved", new ItemStack(Blocks.capstoneMarble, 1));

        templateCarvedSlab.addInput('X', Blocks.slabBasaltPolished).create("basalt_carved", new ItemStack(Blocks.basaltCarved, 1));
        templateCarvedSlab.addInput('X', Blocks.slabStonePolished).create("stone_carved", new ItemStack(Blocks.stoneCarved, 1));
        templateCarvedSlab.addInput('X', Blocks.slabLimestonePolished).create("limestone_carved", new ItemStack(Blocks.limestoneCarved, 1));
        templateCarvedSlab.addInput('X', Blocks.slabGranitePolished).create("granite_carved", new ItemStack(Blocks.graniteCarved, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.slabMarblePolished).create("marble_carved", new ItemStack(BonusBlocks.marbleCarved, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.slabSlatePolished).create("slate_carved", new ItemStack(BonusBlocks.slateCarved, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.slabLazuritePolished).create("lazurite_carved", new ItemStack(BonusBlocks.lazuriteCarved, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.slabPeridotPolished).create("peridot_carved", new ItemStack(BonusBlocks.peridotCarved, 1));

        RecipeBuilder.Shaped(MOD_ID, "S", "W")
                .addInput('S', (Items.STRING))
                .addInput('W', (BonusItems.soulwax))
                .create("soulwax_candle", new ItemStack(BonusBlocks.candleSoulwax, 2));

        RecipeBuilder.Shaped(MOD_ID, " B ", "B B", " B ")
                .addInput('B', (Items.BRICK_CLAY))
                .create("clay_pot", new ItemStack(BonusBlocks.pot, 2));

        RecipeBuilderShaped templateSlab = new RecipeBuilderShaped(MOD_ID, "XXX");
        templateSlab.addInput('X', Blocks.slatePolished).create("slate_polished_slab", new ItemStack(BonusBlocks.slabSlatePolished, 6));
        templateSlab.addInput('X', BonusBlocks.marblePolished).create("marble_polished_slab", new ItemStack(BonusBlocks.slabMarblePolished, 6));
        templateSlab.addInput('X', Blocks.brickGold).create("gold_brick_slab", new ItemStack(BonusBlocks.slabBrickGold, 6));
        templateSlab.addInput('X', Blocks.brickIron).create("iron_brick_slab", new ItemStack(BonusBlocks.slabBrickIron, 6));
        templateSlab.addInput('X', Blocks.brickLapis).create("lapis_brick_slab", new ItemStack(BonusBlocks.slabBrickLapis, 6));
        templateSlab.addInput('X', BonusBlocks.brickMud).create("mud_brick_slab", new ItemStack(BonusBlocks.slabBrickMud, 6));
        templateSlab.addInput('X', BonusBlocks.brickNetherrack).create("netherrack_brick_slab", new ItemStack(BonusBlocks.slabBrickNetherrack, 6));
        templateSlab.addInput('X', Blocks.brickStonePolishedMossy).create("stone_polished_mossy_brick_slab", new ItemStack(BonusBlocks.slabBrickStonePolishedMossy, 6));
        templateSlab.addInput('X', BonusBlocks.brickScorchedstone).create("scorchedstone_brick_slab", new ItemStack(BonusBlocks.slabBrickScorchedstone, 6));
        templateSlab.addInput('X', BonusBlocks.brickSteel).create("steel_brick_slab", new ItemStack(BonusBlocks.slabBrickSteel, 6));
        templateSlab.addInput('X', BonusBlocks.brickQuartz).create("quartz_brick_slab", new ItemStack(BonusBlocks.slabBrickQuartz, 6));
        templateSlab.addInput('X', BonusBlocks.brickOlivine).create("olivine_brick_slab", new ItemStack(BonusBlocks.slabBrickOlivine, 6));
        templateSlab.addInput('X', BonusBlocks.scorchedstone).create("scorchedstone_slab", new ItemStack(BonusBlocks.slabScorchedstone, 6));
        templateSlab.addInput('X', Blocks.cobbleStoneMossy).create("cobblestone_mossy_slab", new ItemStack(BonusBlocks.slabCobbleStoneMossy, 6));
        templateSlab.addInput('X', Blocks.netherrack).create("cobblestone_netherrack_mossy_slab", new ItemStack(BonusBlocks.slabCobbleNetherrackMossy, 6));
        templateSlab.addInput('X', BonusBlocks.cobbleNetherrack).create("cobblestone_netherrack_slab", new ItemStack(BonusBlocks.slabCobbleNetherrack, 6));
        templateSlab.addInput('X', BonusItems.ingotCopper).create("copper_slab", new ItemStack(BonusBlocks.slabCopper, 3));
        templateSlab.addInput('X', BonusBlocks.brickSilver).create("silver_brick_slab", new ItemStack(BonusBlocks.slabBrickSilver, 6));
        templateSlab.addInput('X', BonusBlocks.brickClayBaked).create("baked_clay_slab", new ItemStack(BonusBlocks.slabBrickClayBaked, 6));
        templateSlab.addInput('X', BonusBlocks.cobbleLazurite).create("cobbled_lazurite_slab", new ItemStack(BonusBlocks.slabCobbleLazurite, 6));
        templateSlab.addInput('X', BonusBlocks.cobblePeridot).create("cobbled_peridot_slab", new ItemStack(BonusBlocks.slabCobblePeridot, 6));
        templateSlab.addInput('X', BonusBlocks.brickLazurite).create("lazurite_brick_slab", new ItemStack(BonusBlocks.slabBrickLazurite, 6));
        templateSlab.addInput('X', BonusBlocks.brickPeridot).create("peridot_brick_slab", new ItemStack(BonusBlocks.slabBrickPeridot, 6));
        templateSlab.addInput('X', BonusBlocks.lazuritePolished).create("lazurite_polished_slab", new ItemStack(BonusBlocks.slabLazuritePolished, 6));
        templateSlab.addInput('X', BonusBlocks.peridotPolished).create("peridot_polished_slab", new ItemStack(BonusBlocks.slabPeridotPolished, 6));

        RecipeBuilderShaped templateStairs = new RecipeBuilderShaped(MOD_ID, "X ", "XX ", "XXX");
        templateStairs.addInput('X', Blocks.brickGold).create("gold_brick_stairs", new ItemStack(BonusBlocks.stairsBrickGold, 6));
        templateStairs.addInput('X', Blocks.brickIron).create("iron_brick_stairs", new ItemStack(BonusBlocks.stairsBrickIron, 6));
        templateStairs.addInput('X', Blocks.brickLapis).create("lapis_brick_stairs", new ItemStack(BonusBlocks.stairsBrickLapis, 6));
        templateStairs.addInput('X', BonusBlocks.brickMud).create("mud_brick_stairs", new ItemStack(BonusBlocks.stairsBrickMud, 6));
        templateStairs.addInput('X', BonusBlocks.brickNetherrack).create("netherrack_brick_stairs", new ItemStack(BonusBlocks.stairsBrickNetherrack, 6));
        templateStairs.addInput('X', BonusBlocks.scorchedstone).create("scorchedstone_stairs", new ItemStack(BonusBlocks.stairsScorchedstone, 6));
        templateStairs.addInput('X', Blocks.brickStonePolishedMossy).create("stone_polished_mossy_brick_stairs", new ItemStack(BonusBlocks.stairsBrickStonePolishedMossy, 6));
        templateStairs.addInput('X', BonusBlocks.brickScorchedstone).create("scorchedstone_brick_stairs", new ItemStack(BonusBlocks.stairsBrickScorchedstone, 6));
        templateStairs.addInput('X', BonusBlocks.brickSteel).create("steel_brick_stairs", new ItemStack(BonusBlocks.stairsBrickSteel, 6));
        templateStairs.addInput('X', BonusBlocks.brickQuartz).create("quartz_brick_stairs", new ItemStack(BonusBlocks.stairsBrickQuartz, 6));
        templateStairs.addInput('X', BonusBlocks.brickOlivine).create("olivine_brick_stairs", new ItemStack(BonusBlocks.stairsBrickOlivine, 6));
        templateStairs.addInput('X', Blocks.cobbleStoneMossy).create("cobblestone_mossy_stairs", new ItemStack(BonusBlocks.stairsCobbleStoneMossy, 6));
        templateStairs.addInput('X', Blocks.netherrack).create("cobblestone_netherrack_mossy_stairs", new ItemStack(BonusBlocks.stairsCobbleNetherrackMossy, 6));
        templateStairs.addInput('X', BonusBlocks.cobbleNetherrack).create("cobblestone_netherrack_stairs", new ItemStack(BonusBlocks.stairsCobbleNetherrack, 6));
        templateStairs.addInput('X', BonusItems.ingotCopper).create("copper_stairs", new ItemStack(BonusBlocks.stairsCopper, 3));
        templateStairs.addInput('X', BonusBlocks.brickSilver).create("silver_brick_stairs", new ItemStack(BonusBlocks.stairsBrickSilver, 6));
        templateStairs.addInput('X', BonusBlocks.brickClayBaked).create("baked_clay_stairs", new ItemStack(BonusBlocks.stairsBrickClayBaked, 6));
        templateStairs.addInput('X', BonusBlocks.cobbleLazurite).create("cobbled_lazurite_stairs", new ItemStack(BonusBlocks.stairsCobbleLazurite, 6));
        templateStairs.addInput('X', BonusBlocks.cobblePeridot).create("cobbled_peridot_stairs", new ItemStack(BonusBlocks.stairsCobblePeridot, 6));
        templateStairs.addInput('X', BonusBlocks.brickLazurite).create("lazurite_brick_stairs", new ItemStack(BonusBlocks.stairsBrickLazurite, 6));
        templateStairs.addInput('X', BonusBlocks.brickPeridot).create("peridot_brick_stairs", new ItemStack(BonusBlocks.stairsBrickPeridot, 6));


        RecipeBuilder.Shaped(MOD_ID, "PP", "PP", "PP")
                .addInput('P', BonusItems.ingotCopper)
                .create("door_copper", new ItemStack(BonusItems.doorCopper, 2));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP", "PP")
                .addInput('P', BonusItems.ingotSilver)
                .create("door_silver", new ItemStack(BonusItems.doorSilver, 2));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP", "PP")
                .addInput('P', Items.ingotSteel)
                .create("door_steel", new ItemStack(BonusItems.doorSteel, 2));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP", "PP")
                .addInput('P', BonusBlocks.glassObsidian)
                .create("door_glass_obsdian", new ItemStack(BonusItems.doorGlassObsidian, 2));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP", "PP")
                .addInput('P', Blocks.stone)
                .create("door_stone", new ItemStack(BonusItems.doorStone, 2));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP", "PP")
                .addInput('P', Blocks.basalt)
                .create("door_basalt", new ItemStack(BonusItems.doorBasalt, 2));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP", "PP")
                .addInput('P', Blocks.limestone)
                .create("door_limestone", new ItemStack(BonusItems.doorLimestone, 2));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP", "PP")
                .addInput('P', Blocks.granite)
                .create("door_granite", new ItemStack(BonusItems.doorGranite, 2));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP", "PP")
                .addInput('P', Blocks.permafrost)
                .create("door_permafrost", new ItemStack(BonusItems.doorPermafrost, 2));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP", "PP")
                .addInput('P', Blocks.marble)
                .create("door_marble", new ItemStack(BonusItems.doorMarble, 2));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP", "PP")
                .addInput('P', Blocks.slate)
                .create("door_slate", new ItemStack(BonusItems.doorSlate, 2));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP", "PP")
                .addInput('P', BonusBlocks.netherrack)
                .create("door_netherrack", new ItemStack(BonusItems.doorNetherrack, 2));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP", "PP")
                .addInput('P', BonusBlocks.lazurite)
                .create("door_lazurite", new ItemStack(BonusItems.doorLazurite, 2));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP", "PP")
                .addInput('P', BonusBlocks.peridot)
                .create("door_peridot", new ItemStack(BonusItems.doorPeridot, 2));

        RecipeBuilder.Shaped(MOD_ID, "CPC", "CPC")
                .addInput('P', BonusItems.ingotCopper)
                .addInput('C', BonusBlocks.blockCopper)
                .create("fence_copper", new ItemStack(BonusBlocks.fenceCopper, 8));

        RecipeBuilder.Shaped(MOD_ID, "CPC", "CPC")
                .addInput('P', BonusItems.ingotSilver)
                .addInput('C', BonusBlocks.blockSilver)
                .create("fence_silver", new ItemStack(BonusBlocks.fenceSilver, 8));

        RecipeBuilder.Shaped(MOD_ID, "CPC", "CPC")
                .addInput('P', Items.ingotGold)
                .addInput('C', Blocks.blockGold)
                .create("fence_gold", new ItemStack(BonusBlocks.fenceGold, 16));

        RecipeBuilder.Shaped(MOD_ID, "CPC", "CPC")
                .addInput('P', Items.ingotSteelCrude)
                .addInput('C', Items.ingotSteel)
                .create("fence_steel", new ItemStack(BonusBlocks.fenceSteel, 8));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP")
                .addInput('P', BonusItems.ingotCopper)
                .create("trapdoor_copper", new ItemStack(BonusBlocks.TRAPDOOR_COPPER, 6));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP")
                .addInput('P', BonusItems.ingotSilver)
                .create("trapdoor_silver", new ItemStack(BonusBlocks.trapdoorSilver, 6));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP")
                .addInput('P', Items.ingotSteel)
                .create("trapdoor_steel", new ItemStack(BonusBlocks.trapdoorSteel, 6));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP")
                .addInput('P', Blocks.stone)
                .create("trapdoor_stone", new ItemStack(BonusBlocks.trapdoorStone, 6));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP")
                .addInput('P', Blocks.basalt)
                .create("trapdoor_basalt", new ItemStack(BonusBlocks.trapdoorBasalt, 6));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP")
                .addInput('P', Blocks.limestone)
                .create("trapdoor_limestone", new ItemStack(BonusBlocks.trapdoorLimestone, 6));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP")
                .addInput('P', Blocks.granite)
                .create("trapdoor_granite", new ItemStack(BonusBlocks.trapdoorGranite, 6));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP")
                .addInput('P', Blocks.permafrost)
                .create("trapdoor_permafrost", new ItemStack(BonusBlocks.trapdoorPermafrost, 6));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP")
                .addInput('P', Blocks.marble)
                .create("trapdoor_marble", new ItemStack(BonusBlocks.trapdoorMarble, 6));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP")
                .addInput('P', Blocks.slate)
                .create("trapdoor_slate", new ItemStack(BonusBlocks.trapdoorSlate, 6));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP")
                .addInput('P', BonusBlocks.netherrack)
                .create("trapdoor_netherrack", new ItemStack(BonusBlocks.trapdoorNetherrack, 6));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP")
                .addInput('P', BonusBlocks.lazurite)
                .create("trapdoor_lazurite", new ItemStack(BonusBlocks.trapdoorLazurite, 6));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP")
                .addInput('P', BonusBlocks.peridot)
                .create("trapdoor_peridot", new ItemStack(BonusBlocks.trapdoorPeridot, 6));

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(BonusBlocks.cobbleLazurite)
                .create("cobble_lazurite_to_lazurite", BonusBlocks.lazurite.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(BonusBlocks.cobblePeridot)
                .create("cobble_peridot_to_peridot", BonusBlocks.peridot.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput("bonusblocks:block/copper_ores")
                .create("copper_ores_to_copper", BonusItems.ingotCopper.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput("bonusblocks:block/silver_ores")
                .create("silver_ores_to_silver", BonusItems.ingotSilver.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(Blocks.blockClay)
                .create("baked_clay_furnace", BonusBlocks.clayBaked.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(BonusItems.oreRawCopper)
                .create("copper_ingot", BonusItems.ingotCopper.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(BonusItems.oreRawSilver)
                .create("silver_ingot", BonusItems.ingotSilver.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(Blocks.soulsand)
                .create("soulwax", BonusItems.soulwax.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(BonusBlocks.cobbleLazurite)
                .create("cobble_lazurite_to_lazurite_blast", BonusBlocks.lazurite.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(BonusBlocks.cobblePeridot)
                .create("cobble_peridot_to_peridot_blast", BonusBlocks.peridot.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput("bonusblocks:block/copper_ores")
                .create("copper_ores_to_copper_blast", BonusItems.ingotCopper.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput("bonusblocks:block/silver_ores")
                .create("silver_ores_to_silver", BonusItems.ingotSilver.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.blockClay)
                .create("baked_clay_blast", BonusBlocks.clayBaked.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(BonusItems.oreRawCopper)
                .create("copper_ingot_blast", BonusItems.ingotCopper.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(BonusItems.oreRawSilver)
                .create("silver_ingot", BonusItems.ingotSilver.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.obsidian)
                .create("obsidian_glass", BonusBlocks.glassObsidian.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.soulsand)
                .create("soulwax_blast", BonusItems.soulwax.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.cobbleStone)
                .create("cobble_stone_to_stone", Blocks.stone.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.cobbleBasalt)
                .create("cobble_basalt_to_basalt", Blocks.basalt.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.cobbleGranite)
                .create("cobble_granite_to_granite", Blocks.granite.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.limestone)
                .create("limestone_to_marble", Blocks.marble.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.stone)
                .create("stone_to_slate", Blocks.slate.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.basalt)
                .create("basalt_to_olivine", Items.olivine.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Blocks.granite)
                .create("granite_to_quartz", Items.quartz.getDefaultStack());

        RecipeBuilder.initNameSpace(MOD_ID);

    }

    @Override
    public void onRecipesReady() {
        initializeRecipes();
    }

    @Override
    public void initNamespaces() {
        RecipeBuilder.initNameSpace(MOD_ID);
        RecipeBuilder.getRecipeNamespace(MOD_ID);

        Registries.ITEM_GROUPS.getItem("minecraft:trommel_dirt").add(BonusBlocks.dirtRough.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:trommel_dirt").add(Blocks.mud.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logScorched.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logShrub.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.LOG_JACARANDA.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.LOG_CACAO.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:moss_stones").add(BonusBlocks.moss.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:leaves").add(BonusBlocks.LEAVES_OAK_MOSSY.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:leaves").add(BonusBlocks.LEAVES_JACARANDA.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:stones").add(Blocks.permafrost.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:stones").add(BonusBlocks.netherrack.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:stones").add(BonusBlocks.lazurite.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:stones").add(BonusBlocks.peridot.getDefaultStack());


        Registries.ITEM_GROUPS.getItem("minecraft:cobblestones").add(BonusBlocks.cobbleNetherrack.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:cobblestones").add(BonusBlocks.cobbleLazurite.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:cobblestones").add(BonusBlocks.cobblePeridot.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:grasses").add(BonusBlocks.overgrownGrass.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:grasses").add(BonusBlocks.overgrownGrassRetro.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:grasses").add(BonusBlocks.overgrownGrassScorched.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:grasses").add(Blocks.grassScorched.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:dirt").add(BonusBlocks.dirtRough.getDefaultStack());

        Registries.ITEM_GROUPS.register("bonusblocks:block/copper_ores", Registries.stackListOf(BonusBlocks.oreCopperStone, BonusBlocks.oreCopperBasalt, BonusBlocks.oreCopperGranite, BonusBlocks.oreCopperLimestone));

        Registries.ITEM_GROUPS.register("bonusblocks:block/silver_ores", Registries.stackListOf(BonusBlocks.oreSilverStone, BonusBlocks.oreSilverBasalt, BonusBlocks.oreSilverGranite, BonusBlocks.oreSilverLimestone));

        Registries.ITEM_GROUPS.register("bonusblocks:block/crates", Registries.stackListOf(BonusBlocks.crate, new ItemStack(BonusBlocks.cratePainted, 1, 0),
                new ItemStack(BonusBlocks.cratePainted, 1, 1),
                new ItemStack(BonusBlocks.cratePainted, 1, 2),
                new ItemStack(BonusBlocks.cratePainted, 1, 3),
                new ItemStack(BonusBlocks.cratePainted, 1, 4),
                new ItemStack(BonusBlocks.cratePainted, 1, 5),
                new ItemStack(BonusBlocks.cratePainted, 1, 6),
                new ItemStack(BonusBlocks.cratePainted, 1, 7),
                new ItemStack(BonusBlocks.cratePainted, 1, 8),
                new ItemStack(BonusBlocks.cratePainted, 1, 9),
                new ItemStack(BonusBlocks.cratePainted, 1, 10),
                new ItemStack(BonusBlocks.cratePainted, 1, 11),
                new ItemStack(BonusBlocks.cratePainted, 1, 12),
                new ItemStack(BonusBlocks.cratePainted, 1, 13),
                new ItemStack(BonusBlocks.cratePainted, 1, 14),
                new ItemStack(BonusBlocks.cratePainted, 1, 15)));

        Registries.ITEM_GROUPS.register("bonusblocks:block/wool_slab", Registries.stackListOf(new ItemStack(BonusBlocks.slabWool, 1, 0),
                new ItemStack(BonusBlocks.slabWool, 1, 16),
                new ItemStack(BonusBlocks.slabWool, 1, 32),
                new ItemStack(BonusBlocks.slabWool, 1, 48),
                new ItemStack(BonusBlocks.slabWool, 1, 64),
                new ItemStack(BonusBlocks.slabWool, 1, 80),
                new ItemStack(BonusBlocks.slabWool, 1, 96),
                new ItemStack(BonusBlocks.slabWool, 1, 112),
                new ItemStack(BonusBlocks.slabWool, 1, 128),
                new ItemStack(BonusBlocks.slabWool, 1, 144),
                new ItemStack(BonusBlocks.slabWool, 1, 160),
                new ItemStack(BonusBlocks.slabWool, 1, 176),
                new ItemStack(BonusBlocks.slabWool, 1, 192),
                new ItemStack(BonusBlocks.slabWool, 1, 208),
                new ItemStack(BonusBlocks.slabWool, 1, 224),
                new ItemStack(BonusBlocks.slabWool, 1, 240)));

        Registries.ITEM_GROUPS.register("bonusblocks:block/wool_stairs", Registries.stackListOf(new ItemStack(BonusBlocks.stairsWool, 1, 0),
                new ItemStack(BonusBlocks.stairsWool, 1, 16),
                new ItemStack(BonusBlocks.stairsWool, 1, 32),
                new ItemStack(BonusBlocks.stairsWool, 1, 48),
                new ItemStack(BonusBlocks.stairsWool, 1, 64),
                new ItemStack(BonusBlocks.stairsWool, 1, 80),
                new ItemStack(BonusBlocks.stairsWool, 1, 96),
                new ItemStack(BonusBlocks.stairsWool, 1, 112),
                new ItemStack(BonusBlocks.stairsWool, 1, 128),
                new ItemStack(BonusBlocks.stairsWool, 1, 144),
                new ItemStack(BonusBlocks.stairsWool, 1, 160),
                new ItemStack(BonusBlocks.stairsWool, 1, 176),
                new ItemStack(BonusBlocks.stairsWool, 1, 192),
                new ItemStack(BonusBlocks.stairsWool, 1, 208),
                new ItemStack(BonusBlocks.stairsWool, 1, 224),
                new ItemStack(BonusBlocks.stairsWool, 1, 240)));
    }
}