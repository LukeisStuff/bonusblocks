package luke.bonusblocks;

import luke.bonusblocks.block.blockmodel.*;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorCustom;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.color.BlockColorLeavesOak;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.colorizer.Colorizers;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

public class BonusModels implements ModelEntrypoint {
    @Override
    public void initBlockModels(BlockModelDispatcher dispatcher) {

        dispatcher.addDispatch(BonusBlocks.BOOKSHELF_EMPTY_PLANKS_OAK, new BlockModelStandard<>(BonusBlocks.BOOKSHELF_EMPTY_PLANKS_OAK)
                .setTex(0, "bonusblocks:block/bookshelf_empty_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "minecraft:block/planks/oak", Side.TOP, Side.BOTTOM));

        dispatcher.addDispatch(BonusBlocks.BRANCH, new BlockModelStandard<>(BonusBlocks.BRANCH)
                .setAllTextures(0, "bonusblocks:block/branch"));

        dispatcher.addDispatch(BonusBlocks.LEAVES_OAK_MOSSY, new BlockModelLeaves<>(BonusBlocks.LEAVES_OAK_MOSSY,"bonusblocks:block/leaves/leaves_oak_mossy", false));
        dispatcher.addDispatch(BonusBlocks.LEAVES_JACARANDA, new BlockModelLeaves<>(BonusBlocks.LEAVES_JACARANDA,"bonusblocks:block/leaves/leaves_jacaranda", false));

        dispatcher.addDispatch(BonusBlocks.SAPLING_OAK_MOSSY, new BlockModelCrossedSquares<>(BonusBlocks.SAPLING_OAK_MOSSY)
                .setAllTextures(0, "bonusblocks:block/sapling/sapling_oak_mossy"));
        dispatcher.addDispatch(BonusBlocks.SAPLING_JACARANDA, new BlockModelCrossedSquares<>(BonusBlocks.SAPLING_JACARANDA)
                .setAllTextures(0, "bonusblocks:block/sapling/sapling_jacaranda"));

        dispatcher.addDispatch(BonusBlocks.LOG_CACAO, new BlockModelAxisAligned<>(BonusBlocks.LOG_CACAO)
                .setTex(0, "bonusblocks:block/log/cacao_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/log/cacao_top", Side.TOP, Side.BOTTOM));
        dispatcher.addDispatch(BonusBlocks.LOG_SHRUB, new BlockModelAxisAligned<>(BonusBlocks.LOG_SHRUB)
                .setTex(0, "bonusblocks:block/log/shrub_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/log/shrub_top", Side.TOP, Side.BOTTOM));
        dispatcher.addDispatch(BonusBlocks.LOG_JACARANDA, new BlockModelAxisAligned<>(BonusBlocks.LOG_JACARANDA)
                .setTex(0, "bonusblocks:block/log/jacaranda_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/log/jacaranda_top", Side.TOP, Side.BOTTOM));
        dispatcher.addDispatch(BonusBlocks.LOG_SCORCHED, new BlockModelAxisAligned<>(BonusBlocks.LOG_SCORCHED)
                .setTex(0, "bonusblocks:block/log/scorched_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/log/scorched_top", Side.TOP, Side.BOTTOM));

        dispatcher.addDispatch(BonusBlocks.MOSS, new BlockModelStandard<>(BonusBlocks.MOSS)
                .setAllTextures(0, "bonusblocks:block/moss"));

        dispatcher.addDispatch(BonusBlocks.GRASS_OVERGROWN, new BlockModelStandard<>(BonusBlocks.GRASS_OVERGROWN)
                .setAllTextures(0, "minecraft:block/grass/top")
                .setAllTextures(2, "minecraft:block/grass_retro/top"));
        dispatcher.addDispatch(BonusBlocks.GRASS_SCORCHED_OVERGROWN, new BlockModelStandard<>(BonusBlocks.GRASS_SCORCHED_OVERGROWN)
                .setAllTextures(0, "minecraft:block/grass_scorched/top"));
        dispatcher.addDispatch(BonusBlocks.PATH_DIRT_OVERGROWN, new BlockModelStandard<>(BonusBlocks.PATH_DIRT_OVERGROWN)
                .setAllTextures(0, "minecraft:block/grass_path/top"));

        dispatcher.addDispatch(BonusBlocks.FLOWER_CYAN, new BlockModelFlowerStackable<>(BonusBlocks.FLOWER_CYAN, "bonusblocks:block/flower_cyan/"));
        dispatcher.addDispatch(BonusBlocks.FLOWER_MAGENTA, new BlockModelFlowerStackable<>(BonusBlocks.FLOWER_MAGENTA, "bonusblocks:block/flower_magenta/"));
        dispatcher.addDispatch(BonusBlocks.FLOWER_SILVER, new BlockModelFlowerStackable<>(BonusBlocks.FLOWER_SILVER, "bonusblocks:block/flower_silver/"));
        dispatcher.addDispatch(BonusBlocks.FLOWER_LIME, new BlockModelFlowerStackable<>(BonusBlocks.FLOWER_LIME, "bonusblocks:block/flower_lime/"));

        dispatcher.addDispatch(BonusBlocks.PETAL_RED, new BlockModelStandard<>(BonusBlocks.PETAL_RED).setAllTextures(0, "bonusblocks:block/petal/red"));
        dispatcher.addDispatch(BonusBlocks.PETAL_YELLOW, new BlockModelStandard<>(BonusBlocks.PETAL_YELLOW).setAllTextures(0, "bonusblocks:block/petal/yellow"));
        dispatcher.addDispatch(BonusBlocks.PETAL_CYAN, new BlockModelStandard<>(BonusBlocks.PETAL_CYAN).setAllTextures(0, "bonusblocks:block/petal/cyan"));
        dispatcher.addDispatch(BonusBlocks.PETAL_MAGENTA, new BlockModelStandard<>(BonusBlocks.PETAL_MAGENTA).setAllTextures(0, "bonusblocks:block/petal/magenta"));
        dispatcher.addDispatch(BonusBlocks.PETAL_PINK, new BlockModelStandard<>(BonusBlocks.PETAL_PINK).setAllTextures(0, "bonusblocks:block/petal/pink"));
        dispatcher.addDispatch(BonusBlocks.PETAL_PURPLE, new BlockModelStandard<>(BonusBlocks.PETAL_PURPLE).setAllTextures(0, "bonusblocks:block/petal/purple"));
        dispatcher.addDispatch(BonusBlocks.PETAL_ORANGE, new BlockModelStandard<>(BonusBlocks.PETAL_ORANGE).setAllTextures(0, "bonusblocks:block/petal/orange"));
        dispatcher.addDispatch(BonusBlocks.PETAL_SILVER, new BlockModelStandard<>(BonusBlocks.PETAL_SILVER).setAllTextures(0, "bonusblocks:block/petal/silver"));
        dispatcher.addDispatch(BonusBlocks.PETAL_LIME, new BlockModelStandard<>(BonusBlocks.PETAL_LIME).setAllTextures(0, "bonusblocks:block/petal/lime"));
        dispatcher.addDispatch(BonusBlocks.PETAL_LIGHT_BLUE, new BlockModelStandard<>(BonusBlocks.PETAL_LIGHT_BLUE).setAllTextures(0, "bonusblocks:block/petal/lightblue"));

        dispatcher.addDispatch(BonusBlocks.PETAL_LAYER_RED, new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_RED)
                .setAllTextures(0, "bonusblocks:block/petal/red_layer"));
        dispatcher.addDispatch(BonusBlocks.PETAL_LAYER_YELLOW, new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_YELLOW)
                .setAllTextures(0, "bonusblocks:block/petal/yellow_layer"));
        dispatcher.addDispatch(BonusBlocks.PETAL_LAYER_CYAN, new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_CYAN)
                .setAllTextures(0, "bonusblocks:block/petal/cyan_layer"));
        dispatcher.addDispatch(BonusBlocks.PETAL_LAYER_MAGENTA, new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_MAGENTA)
                .setAllTextures(0, "bonusblocks:block/petal/magenta_layer"));
        dispatcher.addDispatch(BonusBlocks.PETAL_LAYER_PINK, new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_PINK)
                .setAllTextures(0, "bonusblocks:block/petal/pink_layer"));
        dispatcher.addDispatch(BonusBlocks.PETAL_LAYER_PURPLE, new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_PURPLE)
                .setAllTextures(0, "bonusblocks:block/petal/purple_layer"));
        dispatcher.addDispatch(BonusBlocks.PETAL_LAYER_ORANGE, new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_ORANGE)
                .setAllTextures(0, "bonusblocks:block/petal/orange_layer"));
        dispatcher.addDispatch(BonusBlocks.PETAL_LAYER_SILVER, new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_SILVER)
                .setAllTextures(0, "bonusblocks:block/petal/silver_layer"));
        dispatcher.addDispatch(BonusBlocks.PETAL_LAYER_LIME, new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_LIME)
                .setAllTextures(0, "bonusblocks:block/petal/lime_layer"));
        dispatcher.addDispatch(BonusBlocks.PETAL_LAYER_LIGHT_BLUE, new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_LIGHT_BLUE)
                .setAllTextures(0, "bonusblocks:block/petal/lightblue_layer"));

        dispatcher.addDispatch(BonusBlocks.MUSHROOM_GRAY, new BlockModelCrossedSquares<>(BonusBlocks.MUSHROOM_GRAY)
                .setAllTextures(0, "bonusblocks:block/mushroom_gray"));

        dispatcher.addDispatch(BonusBlocks.FUNGI_RED, new BlockModelStandard<>(BonusBlocks.FUNGI_RED)
                .setAllTextures(0, "bonusblocks:block/fungi_red"));
        dispatcher.addDispatch(BonusBlocks.FUNGI_BROWN, new BlockModelStandard<>(BonusBlocks.FUNGI_BROWN)
                .setAllTextures(0, "bonusblocks:block/fungi_brown"));
        dispatcher.addDispatch(BonusBlocks.FUNGI_GRAY, new BlockModelStandard<>(BonusBlocks.FUNGI_GRAY)
                .setAllTextures(0, "bonusblocks:block/fungi_gray"));

        dispatcher.addDispatch(BonusBlocks.BLOCK_BONE, new BlockModelAxisAligned<>(BonusBlocks.BLOCK_BONE)
                .setTex(0, "bonusblocks:block/block_bone/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/block_bone/top", Side.TOP, Side.BOTTOM));

        dispatcher.addDispatch(BonusBlocks.BLOCK_CLOTH, new BlockModelStandard<>(BonusBlocks.BLOCK_CLOTH)
                .setAllTextures(0, "bonusblocks:block/block_cloth"));
        dispatcher.addDispatch(BonusBlocks.BLOCK_SLIME, new BlockModelTransparent<>(BonusBlocks.BLOCK_SLIME, true).onRenderLayer(1)
                .setAllTextures(0, "bonusblocks:block/block_slime"));
        dispatcher.addDispatch(BonusBlocks.BLOCK_GUNPOWDER, new BlockModelStandard<>(BonusBlocks.BLOCK_GUNPOWDER)
                .setAllTextures(0, "bonusblocks:block/block_gunpowder"));
        dispatcher.addDispatch(BonusBlocks.BLOCK_SUGAR, new BlockModelStandard<>(BonusBlocks.BLOCK_SUGAR)
                .setAllTextures(0, "bonusblocks:block/block_sugar"));
        dispatcher.addDispatch(BonusBlocks.BLOCK_LEATHER, new BlockModelStandard<>(BonusBlocks.BLOCK_LEATHER)
                .setAllTextures(0, "bonusblocks:block/block_leather"));
        dispatcher.addDispatch(BonusBlocks.BLOCK_WICKER, new BlockModelStandard<>(BonusBlocks.BLOCK_WICKER)
                .setAllTextures(0, "minecraft:block/basket/bottom"));
        dispatcher.addDispatch(BonusBlocks.BLOCK_FLINT, new BlockModelStandard<>(BonusBlocks.BLOCK_FLINT)
                .setAllTextures(0, "bonusblocks:block/block_flint"));
        dispatcher.addDispatch(BonusBlocks.BLOCK_RAW_IRON, new BlockModelStandard<>(BonusBlocks.BLOCK_RAW_IRON)
                .setAllTextures(0, "bonusblocks:block/block_iron_raw"));
        dispatcher.addDispatch(BonusBlocks.BLOCK_RAW_GOLD, new BlockModelStandard<>(BonusBlocks.BLOCK_RAW_GOLD)
                .setAllTextures(0, "bonusblocks:block/block_gold_raw"));
        dispatcher.addDispatch(BonusBlocks.BLOCK_STEEL, new BlockModelStandard<>(BonusBlocks.BLOCK_STEEL)
                .setAllTextures(0, "bonusblocks:block/block_steel"));

        dispatcher.addDispatch(BonusBlocks.OVERLAY_RAW_IRON, new BlockModelNuggetsIron<>(BonusBlocks.OVERLAY_RAW_IRON));
        dispatcher.addDispatch(BonusBlocks.OVERLAY_RAW_GOLD, new BlockModelNuggetsGold<>(BonusBlocks.OVERLAY_RAW_IRON));
        dispatcher.addDispatch(BonusBlocks.OVERLAY_FLINT, new BlockModelNuggetsFlint<>(BonusBlocks.OVERLAY_FLINT));

        dispatcher.addDispatch(BonusBlocks.MARBLE_POLISHED, new BlockModelStandard<>(BonusBlocks.MARBLE_POLISHED)
                .setTex(0, "bonusblocks:block/polished_marble_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/polished_marble_top", Side.TOP, Side.BOTTOM));

        dispatcher.addDispatch(BonusBlocks.MARBLE_CARVED, new BlockModelStandard<>(BonusBlocks.MARBLE_CARVED)
                .setTex(0, "bonusblocks:block/carved_marble", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/polished_marble_top", Side.TOP, Side.BOTTOM));
        dispatcher.addDispatch(BonusBlocks.SLATE_CARVED, new BlockModelStandard<>(BonusBlocks.SLATE_CARVED)
                .setTex(0, "minecraft:block/carved_slate", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "minecraft:block/polished_slate_top", Side.TOP, Side.BOTTOM));

        dispatcher.addDispatch(BonusBlocks.BLOCK_CLAY_BAKED, new BlockModelStandard<>(BonusBlocks.BLOCK_CLAY_BAKED)
                .setAllTextures(0, "bonusblocks:block/block_clay_baked"));

        dispatcher.addDispatch(BonusBlocks.GLASS_OBSIDIAN, new BlockModelTransparent<>(BonusBlocks.GLASS_OBSIDIAN, false).onRenderLayer(1)
                .setAllTextures(0, "bonusblocks:block/glass_obsidian"));
        dispatcher.addDispatch(BonusBlocks.GLASS_QUARTZ, new BlockModelTransparent<>(BonusBlocks.GLASS_QUARTZ, false)
                .setAllTextures(0, "bonusblocks:block/glass_quartz"));

        dispatcher.addDispatch(BonusBlocks.BRICK_MUD, new BlockModelStandard<>(BonusBlocks.BRICK_MUD)
                .setAllTextures(0, "bonusblocks:block/brick_mud_baked"));
        dispatcher.addDispatch(BonusBlocks.BRICK_QUARTZ, new BlockModelStandard<>(BonusBlocks.BRICK_QUARTZ)
                .setAllTextures(0, "bonusblocks:block/brick_quartz"));
        dispatcher.addDispatch(BonusBlocks.BRICK_OLIVINE, new BlockModelStandard<>(BonusBlocks.BRICK_OLIVINE)
                .setAllTextures(0, "bonusblocks:block/brick_olivine"));
        dispatcher.addDispatch(BonusBlocks.BRICK_CLAY_BAKED, new BlockModelStandard<>(BonusBlocks.BRICK_CLAY_BAKED)
                .setAllTextures(0, "bonusblocks:block/brick_clay_baked"));
        dispatcher.addDispatch(BonusBlocks.BRICK_STEEL, new BlockModelStandard<>(BonusBlocks.BRICK_STEEL)
                .setAllTextures(0, "bonusblocks:block/brick_steel"));

        dispatcher.addDispatch(BonusBlocks.DIRT_BAKED, new BlockModelStandard<>(BonusBlocks.DIRT_BAKED)
                .setAllTextures(0, "bonusblocks:block/dirt_baked"));

        dispatcher.addDispatch(BonusBlocks.CANDLE_SOULWAX, new BlockModelSoulwaxCandle<>(BonusBlocks.CANDLE_SOULWAX)
                .setAllTextures(0, "bonusblocks:block/candle_soulwax"));

        dispatcher.addDispatch(BonusBlocks.SKULL, new BlockModelStandard<>(BonusBlocks.SKULL)
                .setTex(0, "bonusblocks:block/skull/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/skull/top", Side.TOP, Side.BOTTOM));

        dispatcher.addDispatch(BonusBlocks.SKULL_CARVED_IDLE, new BlockModelVeryRotatable<>(BonusBlocks.SKULL_CARVED_IDLE)
                .setTex(0, "bonusblocks:block/skull/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/skull/front_idle", Side.SOUTH)
                .setTex(0, "bonusblocks:block/skull/side", Side.WEST, Side.EAST, Side.NORTH));

        dispatcher.addDispatch(BonusBlocks.SKULL_CARVED_ACTIVE, new BlockModelVeryRotatable<>(BonusBlocks.SKULL_CARVED_ACTIVE)
                .setTex(0, "bonusblocks:block/skull/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/skull/front_active", Side.SOUTH)
                .setTex(0, "bonusblocks:block/skull/side", Side.WEST, Side.EAST, Side.NORTH));

        dispatcher.addDispatch(BonusBlocks.SKULL_REDSTONE, new BlockModelVeryRotatable<>(BonusBlocks.SKULL_REDSTONE)
                .setTex(0, "bonusblocks:block/skull/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/skull/front_redstone", Side.SOUTH)
                .setTex(0, "bonusblocks:block/skull/side", Side.WEST, Side.EAST, Side.NORTH)
                .setTex(1, "bonusblocks:block/skull/front_overlay", Side.SOUTH));

        dispatcher.addDispatch(BonusBlocks.TATAMI, new BlockModelStandard<>(BonusBlocks.TATAMI)
                .setAllTextures(0, "bonusblocks:block/tatami"));

        dispatcher.addDispatch(BonusBlocks.FENCE_GOLD, new BlockModelFenceThin<>(BonusBlocks.FENCE_GOLD,
                TextureRegistry.getTexture("bonusblocks:block/fence_gold/center"),
                null, TextureRegistry.getTexture("bonusblocks:block/fence_gold/top"),
                TextureRegistry.getTexture("bonusblocks:block/fence_gold/column"))
                .setAllTextures(0, "bonusblocks:block/fence_gold/center"));

        dispatcher.addDispatch(BonusBlocks.DOOR_STONE_BOTTOM, new BlockModelDoor<>(BonusBlocks.DOOR_STONE_BOTTOM)
                .setTex(0, "bonusblocks:block/door/stone/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/stone/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.DOOR_STONE_TOP, new BlockModelDoor<>(BonusBlocks.DOOR_STONE_TOP)
                .setTex(0, "bonusblocks:block/door/stone/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/stone/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        dispatcher.addDispatch(BonusBlocks.DOOR_BASALT_BOTTOM, new BlockModelDoor<>(BonusBlocks.DOOR_BASALT_BOTTOM)
                .setTex(0, "bonusblocks:block/door/basalt/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/basalt/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.DOOR_BASALT_TOP, new BlockModelDoor<>(BonusBlocks.DOOR_BASALT_TOP)
                .setTex(0, "bonusblocks:block/door/basalt/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/basalt/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        dispatcher.addDispatch(BonusBlocks.DOOR_LIMESTONE_BOTTOM, new BlockModelDoor<>(BonusBlocks.DOOR_LIMESTONE_BOTTOM)
                .setTex(0, "bonusblocks:block/door/limestone/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/limestone/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.DOOR_LIMESTONE_TOP, new BlockModelDoor<>(BonusBlocks.DOOR_LIMESTONE_TOP)
                .setTex(0, "bonusblocks:block/door/limestone/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/limestone/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        dispatcher.addDispatch(BonusBlocks.DOOR_GRANITE_BOTTOM, new BlockModelDoor<>(BonusBlocks.DOOR_GRANITE_BOTTOM)
                .setTex(0, "bonusblocks:block/door/granite/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/granite/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.DOOR_GRANITE_TOP, new BlockModelDoor<>(BonusBlocks.DOOR_GRANITE_TOP)
                .setTex(0, "bonusblocks:block/door/granite/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/granite/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        dispatcher.addDispatch(BonusBlocks.DOOR_PERMAFROST_BOTTOM, new BlockModelDoor<>(BonusBlocks.DOOR_PERMAFROST_BOTTOM)
                .setTex(0, "bonusblocks:block/door/permafrost/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/permafrost/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.DOOR_PERMAFROST_TOP, new BlockModelDoor<>(BonusBlocks.DOOR_PERMAFROST_TOP)
                .setTex(0, "bonusblocks:block/door/permafrost/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/permafrost/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        dispatcher.addDispatch(BonusBlocks.DOOR_NETHERRACK_BOTTOM, new BlockModelDoor<>(BonusBlocks.DOOR_NETHERRACK_BOTTOM)
                .setTex(0, "bonusblocks:block/door/netherrack/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/netherrack/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.DOOR_NETHERRACK_TOP, new BlockModelDoor<>(BonusBlocks.DOOR_NETHERRACK_TOP)
                .setTex(0, "bonusblocks:block/door/netherrack/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/netherrack/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        dispatcher.addDispatch(BonusBlocks.DOOR_MARBLE_BOTTOM, new BlockModelDoor<>(BonusBlocks.DOOR_MARBLE_BOTTOM)
                .setTex(0, "bonusblocks:block/door/marble/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/marble/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.DOOR_MARBLE_TOP, new BlockModelDoor<>(BonusBlocks.DOOR_MARBLE_TOP)
                .setTex(0, "bonusblocks:block/door/marble/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/marble/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        dispatcher.addDispatch(BonusBlocks.DOOR_SLATE_BOTTOM, new BlockModelDoor<>(BonusBlocks.DOOR_SLATE_BOTTOM)
                .setTex(0, "bonusblocks:block/door/slate/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/slate/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.DOOR_SLATE_TOP, new BlockModelDoor<>(BonusBlocks.DOOR_SLATE_TOP)
                .setTex(0, "bonusblocks:block/door/slate/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/slate/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));


        dispatcher.addDispatch(BonusBlocks.TRAPDOOR_STONE, new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_STONE)
                .setTex(0, "bonusblocks:block/trapdoor/stone/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/stone/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.TRAPDOOR_BASALT, new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_BASALT)
                .setTex(0, "bonusblocks:block/trapdoor/basalt/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/basalt/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.TRAPDOOR_LIMESTONE, new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_LIMESTONE)
                .setTex(0, "bonusblocks:block/trapdoor/limestone/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/limestone/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.TRAPDOOR_GRANITE, new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_GRANITE)
                .setTex(0, "bonusblocks:block/trapdoor/granite/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/granite/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.TRAPDOOR_PERMAFROST, new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_PERMAFROST)
                .setTex(0, "bonusblocks:block/trapdoor/permafrost/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/permafrost/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.TRAPDOOR_NETHERRACK, new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_NETHERRACK)
                .setTex(0, "bonusblocks:block/trapdoor/netherrack/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/netherrack/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.TRAPDOOR_MARBLE, new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_MARBLE)
                .setTex(0, "bonusblocks:block/trapdoor/marble/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/marble/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.TRAPDOOR_SLATE, new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_SLATE)
                .setTex(0, "bonusblocks:block/trapdoor/slate/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/slate/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));




        dispatcher.addDispatch(BonusBlocks.DOOR_GLASS_OBSIDIAN_BOTTOM, new BlockModelDoorGlass<>(BonusBlocks.DOOR_GLASS_OBSIDIAN_BOTTOM).onRenderLayer(1)
                .setTex(0, "bonusblocks:block/door/glass_obsidian/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/glass_obsidian/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.DOOR_GLASS_OBSIDIAN_TOP, new BlockModelDoorGlass<>(BonusBlocks.DOOR_GLASS_OBSIDIAN_TOP).onRenderLayer(1)
                .setTex(0, "bonusblocks:block/door/glass_obsidian/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/glass_obsidian/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.DOOR_GLASS_QUARTZ_BOTTOM, new BlockModelDoorGlass<>(BonusBlocks.DOOR_GLASS_QUARTZ_BOTTOM)
                .setTex(0, "bonusblocks:block/door/glass_quartz/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/glass_quartz/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.DOOR_GLASS_QUARTZ_TOP, new BlockModelDoorGlass<>(BonusBlocks.DOOR_GLASS_QUARTZ_TOP)
                .setTex(0, "bonusblocks:block/door/glass_quartz/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/glass_quartz/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.DOOR_GLASS_STEEL_BOTTOM, new BlockModelDoorGlass<>(BonusBlocks.DOOR_GLASS_STEEL_BOTTOM)
                .setTex(0, "bonusblocks:block/door/glass_steel/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/glass_steel/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.DOOR_GLASS_STEEL_TOP, new BlockModelDoorGlass<>(BonusBlocks.DOOR_GLASS_STEEL_TOP)
                .setTex(0, "bonusblocks:block/door/glass_steel/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/glass_steel/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        dispatcher.addDispatch(BonusBlocks.DOOR_STEEL_BOTTOM, new BlockModelDoorGlass<>(BonusBlocks.DOOR_STEEL_BOTTOM)
                .setTex(0, "bonusblocks:block/door/steel/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/steel/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.DOOR_STEEL_TOP, new BlockModelDoorGlass<>(BonusBlocks.DOOR_STEEL_TOP)
                .setTex(0, "bonusblocks:block/door/steel/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/steel/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        dispatcher.addDispatch(BonusBlocks.TRAPDOOR_GLASS_OBSIDIAN, new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_GLASS_OBSIDIAN).onRenderLayer(1)
                .setTex(0, "bonusblocks:block/trapdoor/glass_obsidian/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/glass_obsidian/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.TRAPDOOR_GLASS_QUARTZ, new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_GLASS_QUARTZ)
                .setTex(0, "bonusblocks:block/trapdoor/glass_quartz/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/glass_quartz/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        dispatcher.addDispatch(BonusBlocks.TRAPDOOR_GLASS_STEEL, new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_GLASS_STEEL)
                .setTex(0, "bonusblocks:block/trapdoor/glass_steel/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/glass_steel/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        dispatcher.addDispatch(BonusBlocks.TRAPDOOR_STEEL, new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_STEEL)
                .setTex(0, "bonusblocks:block/trapdoor/steel/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/steel/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));







        //STAIRS
        dispatcher.addDispatch(BonusBlocks.STAIRS_WOOL, new BlockModelStairsWool<>(BonusBlocks.STAIRS_WOOL));
        dispatcher.addDispatch(BonusBlocks.STAIRS_COBBLESTONE_MOSSY, new BlockModelStairs<>(BonusBlocks.STAIRS_COBBLESTONE_MOSSY));
        dispatcher.addDispatch(BonusBlocks.STAIRS_BRICK_STONE_POLISHED_MOSSY, new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_STONE_POLISHED_MOSSY));
        dispatcher.addDispatch(BonusBlocks.STAIRS_BRICK_MUD, new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_MUD));
        dispatcher.addDispatch(BonusBlocks.STAIRS_BRICK_QUARTZ, new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_QUARTZ));
        dispatcher.addDispatch(BonusBlocks.STAIRS_BRICK_OLIVINE, new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_OLIVINE));
        dispatcher.addDispatch(BonusBlocks.STAIRS_BRICK_CLAY_BAKED, new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_CLAY_BAKED));
        dispatcher.addDispatch(BonusBlocks.STAIRS_BRICK_STEEL, new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_STEEL));

        //SLABS
        dispatcher.addDispatch(BonusBlocks.SLAB_WOOL, new BlockModelSlabWool<>(BonusBlocks.SLAB_WOOL));
        dispatcher.addDispatch(BonusBlocks.SLAB_COBBLESTONE_MOSSY, new BlockModelSlab<>(BonusBlocks.SLAB_COBBLESTONE_MOSSY));
        dispatcher.addDispatch(BonusBlocks.SLAB_BRICK_STONE_POLISHED_MOSSY, new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_STONE_POLISHED_MOSSY));
        dispatcher.addDispatch(BonusBlocks.SLAB_BRICK_MUD, new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_MUD));
        dispatcher.addDispatch(BonusBlocks.SLAB_BRICK_QUARTZ, new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_QUARTZ));
        dispatcher.addDispatch(BonusBlocks.SLAB_BRICK_OLIVINE, new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_OLIVINE));
        dispatcher.addDispatch(BonusBlocks.SLAB_BRICK_CLAY_BAKED, new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_CLAY_BAKED));
        dispatcher.addDispatch(BonusBlocks.SLAB_SLATE_POLISHED, new BlockModelSlab<>(BonusBlocks.SLAB_SLATE_POLISHED));
        dispatcher.addDispatch(BonusBlocks.SLAB_MARBLE_POLISHED, new BlockModelSlab<>(BonusBlocks.SLAB_MARBLE_POLISHED));
        dispatcher.addDispatch(BonusBlocks.SLAB_BRICK_STEEL, new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_STEEL));

    }

    @Override
    public void initItemModels(ItemModelDispatcher dispatcher) {

        dispatcher.addDispatch(new ItemModelStandard(BonusItems.SOULWAX, null).setIcon("bonusblocks:item/soulwax"));
        dispatcher.addDispatch(new ItemModelStandard(BonusItems.MOSS, null).setIcon("bonusblocks:item/moss"));
        dispatcher.addDispatch(new ItemModelStandard(BonusItems.CANDLE_SOULWAX, null).setIcon("bonusblocks:item/candle_soulwax"));

        dispatcher.addDispatch(new ItemModelStandard(BonusItems.DOOR_STONE, null).setIcon("bonusblocks:item/door_stone"));
        dispatcher.addDispatch(new ItemModelStandard(BonusItems.DOOR_BASALT, null).setIcon("bonusblocks:item/door_basalt"));
        dispatcher.addDispatch(new ItemModelStandard(BonusItems.DOOR_GRANITE, null).setIcon("bonusblocks:item/door_granite"));
        dispatcher.addDispatch(new ItemModelStandard(BonusItems.DOOR_LIMESTONE, null).setIcon("bonusblocks:item/door_limestone"));
        dispatcher.addDispatch(new ItemModelStandard(BonusItems.DOOR_MARBLE, null).setIcon("bonusblocks:item/door_marble"));
        dispatcher.addDispatch(new ItemModelStandard(BonusItems.DOOR_SLATE, null).setIcon("bonusblocks:item/door_slate"));
        dispatcher.addDispatch(new ItemModelStandard(BonusItems.DOOR_PERMAFROST, null).setIcon("bonusblocks:item/door_permafrost"));
        dispatcher.addDispatch(new ItemModelStandard(BonusItems.DOOR_NETHERRACK, null).setIcon("bonusblocks:item/door_netherrack"));
        dispatcher.addDispatch(new ItemModelStandard(BonusItems.DOOR_GLASS_OBSIDIAN, null).setIcon("bonusblocks:item/door_glass_obsidian"));
        dispatcher.addDispatch(new ItemModelStandard(BonusItems.DOOR_GLASS_QUARTZ, null).setIcon("bonusblocks:item/door_glass_quartz"));
        dispatcher.addDispatch(new ItemModelStandard(BonusItems.DOOR_GLASS_STEEL, null).setIcon("bonusblocks:item/door_glass_steel"));
        dispatcher.addDispatch(new ItemModelStandard(BonusItems.DOOR_STEEL, null).setIcon("bonusblocks:item/door_steel"));

    }

    @Override
    public void initEntityModels(EntityRenderDispatcher dispatcher) {

    }

    @Override
    public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

    }

    @Override
    public void initBlockColors(BlockColorDispatcher dispatcher) {
        ModelHelper.setBlockColor(BonusBlocks.LEAVES_OAK_MOSSY, () -> new BlockColorLeavesOak(Colorizers.oak));
        ModelHelper.setBlockColor(BonusBlocks.GRASS_OVERGROWN, () -> new BlockColorCustom(Colorizers.grass));

    }
}
