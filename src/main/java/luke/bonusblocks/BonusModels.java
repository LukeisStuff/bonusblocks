package luke.bonusblocks;

import luke.bonusblocks.block.BonusBlocks;
import luke.bonusblocks.block.blockmodel.*;
import luke.bonusblocks.item.BonusItems;
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

        ModelHelper.setBlockModel(BonusBlocks.BOOKSHELF_EMPTY_PLANKS_OAK, () -> new BlockModelStandard<>(BonusBlocks.BOOKSHELF_EMPTY_PLANKS_OAK)
                .setTex(0, "bonusblocks:block/bookshelf_empty_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "minecraft:block/planks/oak", Side.TOP, Side.BOTTOM));

        ModelHelper.setBlockModel(BonusBlocks.BRANCH, () -> new BlockModelStandard<>(BonusBlocks.BRANCH)
                .setAllTextures(0, "bonusblocks:block/branch"));

        ModelHelper.setBlockModel(BonusBlocks.LEAVES_OAK_MOSSY, () -> new BlockModelLeaves<>(BonusBlocks.LEAVES_OAK_MOSSY,"bonusblocks:block/leaves/leaves_oak_mossy", false));
        ModelHelper.setBlockModel(BonusBlocks.LEAVES_JACARANDA, () -> new BlockModelLeaves<>(BonusBlocks.LEAVES_JACARANDA,"bonusblocks:block/leaves/leaves_jacaranda", false));

        ModelHelper.setBlockModel(BonusBlocks.SAPLING_OAK_MOSSY, () -> new BlockModelCrossedSquares<>(BonusBlocks.SAPLING_OAK_MOSSY)
                .setAllTextures(0, "bonusblocks:block/sapling/sapling_oak_mossy"));
        ModelHelper.setBlockModel(BonusBlocks.SAPLING_JACARANDA, () -> new BlockModelCrossedSquares<>(BonusBlocks.SAPLING_JACARANDA)
                .setAllTextures(0, "bonusblocks:block/sapling/sapling_jacaranda"));

        ModelHelper.setBlockModel(BonusBlocks.LOG_CACAO, () -> new BlockModelAxisAligned<>(BonusBlocks.LOG_CACAO)
                .setTex(0, "bonusblocks:block/log/cacao_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/log/cacao_top", Side.TOP, Side.BOTTOM));
        ModelHelper.setBlockModel(BonusBlocks.LOG_SHRUB, () -> new BlockModelAxisAligned<>(BonusBlocks.LOG_SHRUB)
                .setTex(0, "bonusblocks:block/log/shrub_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/log/shrub_top", Side.TOP, Side.BOTTOM));
        ModelHelper.setBlockModel(BonusBlocks.LOG_JACARANDA, () -> new BlockModelAxisAligned<>(BonusBlocks.LOG_JACARANDA)
                .setTex(0, "bonusblocks:block/log/jacaranda_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/log/jacaranda_top", Side.TOP, Side.BOTTOM));
        ModelHelper.setBlockModel(BonusBlocks.LOG_SCORCHED, () -> new BlockModelAxisAligned<>(BonusBlocks.LOG_SCORCHED)
                .setTex(0, "bonusblocks:block/log/scorched_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/log/scorched_top", Side.TOP, Side.BOTTOM));

        ModelHelper.setBlockModel(BonusBlocks.MOSS, () -> new BlockModelStandard<>(BonusBlocks.MOSS)
                .setAllTextures(0, "bonusblocks:block/moss"));

        ModelHelper.setBlockModel(BonusBlocks.GRASS_OVERGROWN, () -> new BlockModelStandard<>(BonusBlocks.GRASS_OVERGROWN)
                .setAllTextures(0, "minecraft:block/grass/top")
                .setAllTextures(2, "minecraft:block/grass_retro/top"));
        ModelHelper.setBlockModel(BonusBlocks.GRASS_SCORCHED_OVERGROWN, () -> new BlockModelStandard<>(BonusBlocks.GRASS_SCORCHED_OVERGROWN)
                .setAllTextures(0, "minecraft:block/grass_scorched/top"));
        ModelHelper.setBlockModel(BonusBlocks.PATH_DIRT_OVERGROWN, () -> new BlockModelStandard<>(BonusBlocks.PATH_DIRT_OVERGROWN)
                .setAllTextures(0, "minecraft:block/grass_path/top"));

        ModelHelper.setBlockModel(BonusBlocks.FLOWER_CYAN, () -> new BlockModelFlowerStackable<>(BonusBlocks.FLOWER_CYAN, "bonusblocks:block/flower_cyan/"));
        ModelHelper.setBlockModel(BonusBlocks.FLOWER_MAGENTA, () -> new BlockModelFlowerStackable<>(BonusBlocks.FLOWER_MAGENTA, "bonusblocks:block/flower_magenta/"));
        ModelHelper.setBlockModel(BonusBlocks.FLOWER_SILVER, () -> new BlockModelFlowerStackable<>(BonusBlocks.FLOWER_SILVER, "bonusblocks:block/flower_silver/"));
        ModelHelper.setBlockModel(BonusBlocks.FLOWER_LIME, () -> new BlockModelFlowerStackable<>(BonusBlocks.FLOWER_LIME, "bonusblocks:block/flower_lime/"));

        ModelHelper.setBlockModel(BonusBlocks.PETAL_RED, () -> new BlockModelStandard<>(BonusBlocks.PETAL_RED)
                .setAllTextures(0, "bonusblocks:block/petal/red"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_YELLOW, () -> new BlockModelStandard<>(BonusBlocks.PETAL_YELLOW)
                .setAllTextures(0, "bonusblocks:block/petal/yellow"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_CYAN, () -> new BlockModelStandard<>(BonusBlocks.PETAL_CYAN)
                .setAllTextures(0, "bonusblocks:block/petal/cyan"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_MAGENTA, () -> new BlockModelStandard<>(BonusBlocks.PETAL_MAGENTA)
                .setAllTextures(0, "bonusblocks:block/petal/magenta"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_PINK, () -> new BlockModelStandard<>(BonusBlocks.PETAL_PINK)
                .setAllTextures(0, "bonusblocks:block/petal/pink"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_PURPLE, () -> new BlockModelStandard<>(BonusBlocks.PETAL_PURPLE)
                .setAllTextures(0, "bonusblocks:block/petal/purple"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_ORANGE, () -> new BlockModelStandard<>(BonusBlocks.PETAL_ORANGE)
                .setAllTextures(0, "bonusblocks:block/petal/orange"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_SILVER, () -> new BlockModelStandard<>(BonusBlocks.PETAL_SILVER)
                .setAllTextures(0, "bonusblocks:block/petal/silver"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_LIME, () -> new BlockModelStandard<>(BonusBlocks.PETAL_LIME)
                .setAllTextures(0, "bonusblocks:block/petal/lime"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_LIGHT_BLUE, () -> new BlockModelStandard<>(BonusBlocks.PETAL_LIGHT_BLUE)
                .setAllTextures(0, "bonusblocks:block/petal/lightblue"));

        ModelHelper.setBlockModel(BonusBlocks.PETAL_LAYER_RED, () -> new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_RED)
                .setAllTextures(0, "bonusblocks:block/petal/red_layer"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_LAYER_YELLOW, () -> new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_YELLOW)
                .setAllTextures(0, "bonusblocks:block/petal/yellow_layer"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_LAYER_CYAN, () -> new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_CYAN)
                .setAllTextures(0, "bonusblocks:block/petal/cyan_layer"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_LAYER_MAGENTA, () -> new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_MAGENTA)
                .setAllTextures(0, "bonusblocks:block/petal/magenta_layer"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_LAYER_PINK, () -> new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_PINK)
                .setAllTextures(0, "bonusblocks:block/petal/pink_layer"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_LAYER_PURPLE, () -> new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_PURPLE)
                .setAllTextures(0, "bonusblocks:block/petal/purple_layer"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_LAYER_ORANGE, () -> new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_ORANGE)
                .setAllTextures(0, "bonusblocks:block/petal/orange_layer"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_LAYER_SILVER, () -> new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_SILVER)
                .setAllTextures(0, "bonusblocks:block/petal/silver_layer"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_LAYER_LIME, () -> new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_LIME)
                .setAllTextures(0, "bonusblocks:block/petal/lime_layer"));
        ModelHelper.setBlockModel(BonusBlocks.PETAL_LAYER_LIGHT_BLUE, () -> new BlockModelStandard<>(BonusBlocks.PETAL_LAYER_LIGHT_BLUE)
                .setAllTextures(0, "bonusblocks:block/petal/lightblue_layer"));

        ModelHelper.setBlockModel(BonusBlocks.MUSHROOM_GRAY, () -> new BlockModelCrossedSquares<>(BonusBlocks.MUSHROOM_GRAY)
                .setAllTextures(0, "bonusblocks:block/mushroom_gray"));

        ModelHelper.setBlockModel(BonusBlocks.FUNGI_RED, () -> new BlockModelStandard<>(BonusBlocks.FUNGI_RED)
                .setAllTextures(0, "bonusblocks:block/fungi_red"));
        ModelHelper.setBlockModel(BonusBlocks.FUNGI_BROWN, () -> new BlockModelStandard<>(BonusBlocks.FUNGI_BROWN)
                .setAllTextures(0, "bonusblocks:block/fungi_brown"));
        ModelHelper.setBlockModel(BonusBlocks.FUNGI_GRAY, () -> new BlockModelStandard<>(BonusBlocks.FUNGI_GRAY)
                .setAllTextures(0, "bonusblocks:block/fungi_gray"));

        ModelHelper.setBlockModel(BonusBlocks.BLOCK_BONE, () -> new BlockModelAxisAligned<>(BonusBlocks.BLOCK_BONE)
                .setTex(0, "bonusblocks:block/block_bone/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/block_bone/top", Side.TOP, Side.BOTTOM));

        ModelHelper.setBlockModel(BonusBlocks.BLOCK_CLOTH, () -> new BlockModelStandard<>(BonusBlocks.BLOCK_CLOTH)
                .setAllTextures(0, "bonusblocks:block/block_cloth"));
        ModelHelper.setBlockModel(BonusBlocks.BLOCK_SLIME, () -> new BlockModelTransparent<>(BonusBlocks.BLOCK_SLIME, true).onRenderLayer(1)
                .setAllTextures(0, "bonusblocks:block/block_slime"));
        ModelHelper.setBlockModel(BonusBlocks.BLOCK_GUNPOWDER, () -> new BlockModelStandard<>(BonusBlocks.BLOCK_GUNPOWDER)
                .setAllTextures(0, "bonusblocks:block/block_gunpowder"));
        ModelHelper.setBlockModel(BonusBlocks.BLOCK_SUGAR, () -> new BlockModelStandard<>(BonusBlocks.BLOCK_SUGAR)
                .setAllTextures(0, "bonusblocks:block/block_sugar"));
        ModelHelper.setBlockModel(BonusBlocks.BLOCK_LEATHER, () -> new BlockModelStandard<>(BonusBlocks.BLOCK_LEATHER)
                .setAllTextures(0, "bonusblocks:block/block_leather"));
        ModelHelper.setBlockModel(BonusBlocks.BLOCK_WICKER, () -> new BlockModelStandard<>(BonusBlocks.BLOCK_WICKER)
                .setAllTextures(0, "minecraft:block/basket/bottom"));
        ModelHelper.setBlockModel(BonusBlocks.BLOCK_FLINT, () -> new BlockModelStandard<>(BonusBlocks.BLOCK_FLINT)
                .setAllTextures(0, "bonusblocks:block/block_flint"));
        ModelHelper.setBlockModel(BonusBlocks.BLOCK_RAW_IRON, () -> new BlockModelStandard<>(BonusBlocks.BLOCK_RAW_IRON)
                .setAllTextures(0, "bonusblocks:block/block_iron_raw"));
        ModelHelper.setBlockModel(BonusBlocks.BLOCK_RAW_GOLD, () -> new BlockModelStandard<>(BonusBlocks.BLOCK_RAW_GOLD)
                .setAllTextures(0, "bonusblocks:block/block_gold_raw"));

        ModelHelper.setBlockModel(BonusBlocks.OVERLAY_RAW_IRON, () -> new BlockModelNuggetsIron<>(BonusBlocks.OVERLAY_RAW_IRON));
        ModelHelper.setBlockModel(BonusBlocks.OVERLAY_RAW_GOLD, () -> new BlockModelNuggetsGold<>(BonusBlocks.OVERLAY_RAW_IRON));
        ModelHelper.setBlockModel(BonusBlocks.OVERLAY_FLINT, () -> new BlockModelNuggetsFlint<>(BonusBlocks.OVERLAY_FLINT));

        ModelHelper.setBlockModel(BonusBlocks.PILLAR_SLATE, () -> new BlockModelAxisAligned<>(BonusBlocks.PILLAR_SLATE)
                .setTex(0, "bonusblocks:block/pillar_slate/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/pillar_slate/top", Side.TOP, Side.BOTTOM));

        ModelHelper.setBlockModel(BonusBlocks.MARBLE_POLISHED, () -> new BlockModelStandard<>(BonusBlocks.MARBLE_POLISHED)
                .setTex(0, "bonusblocks:block/polished_marble_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/polished_marble_top", Side.TOP, Side.BOTTOM));

        ModelHelper.setBlockModel(BonusBlocks.MARBLE_CARVED, () -> new BlockModelStandard<>(BonusBlocks.MARBLE_CARVED)
                .setTex(0, "bonusblocks:block/carved_marble", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/polished_marble_top", Side.TOP, Side.BOTTOM));
        ModelHelper.setBlockModel(BonusBlocks.SLATE_CARVED, () -> new BlockModelStandard<>(BonusBlocks.SLATE_CARVED)
                .setTex(0, "minecraft:block/carved_slate", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "minecraft:block/polished_slate_top", Side.TOP, Side.BOTTOM));

        ModelHelper.setBlockModel(BonusBlocks.BLOCK_CLAY_BAKED, () -> new BlockModelStandard<>(BonusBlocks.BLOCK_CLAY_BAKED)
                .setAllTextures(0, "bonusblocks:block/block_clay_baked"));

        ModelHelper.setBlockModel(BonusBlocks.GLASS_OBSIDIAN, () -> new BlockModelTransparent<>(BonusBlocks.GLASS_OBSIDIAN, false).onRenderLayer(1)
                .setAllTextures(0, "bonusblocks:block/glass_obsidian"));
        ModelHelper.setBlockModel(BonusBlocks.GLASS_QUARTZ, () -> new BlockModelTransparent<>(BonusBlocks.GLASS_QUARTZ, false)
                .setAllTextures(0, "bonusblocks:block/glass_quartz"));

        ModelHelper.setBlockModel(BonusBlocks.BRICK_MUD, () -> new BlockModelStandard<>(BonusBlocks.BRICK_MUD)
                .setAllTextures(0, "bonusblocks:block/brick_mud_baked"));
        ModelHelper.setBlockModel(BonusBlocks.BRICK_QUARTZ, () -> new BlockModelStandard<>(BonusBlocks.BRICK_QUARTZ)
                .setAllTextures(0, "bonusblocks:block/brick_quartz"));
        ModelHelper.setBlockModel(BonusBlocks.BRICK_OLIVINE, () -> new BlockModelStandard<>(BonusBlocks.BRICK_OLIVINE)
                .setAllTextures(0, "bonusblocks:block/brick_olivine"));
        ModelHelper.setBlockModel(BonusBlocks.BRICK_CLAY_BAKED, () -> new BlockModelStandard<>(BonusBlocks.BRICK_CLAY_BAKED)
                .setAllTextures(0, "bonusblocks:block/brick_clay_baked"));

        ModelHelper.setBlockModel(BonusBlocks.DIRT_BAKED, () -> new BlockModelStandard<>(BonusBlocks.DIRT_BAKED)
                .setAllTextures(0, "bonusblocks:block/dirt_baked"));

        ModelHelper.setBlockModel(BonusBlocks.CANDLE_SOULWAX, () -> new BlockModelSoulwaxCandle<>(BonusBlocks.CANDLE_SOULWAX)
                .setAllTextures(0, "bonusblocks:block/candle_soulwax"));

        ModelHelper.setBlockModel(BonusBlocks.SKULL, () -> new BlockModelHorizontalRotation<>(BonusBlocks.SKULL)
                .setTex(0, "bonusblocks:block/skull/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/skull/top", Side.TOP)
                        .setTex(0, "bonusblocks:block/skull/bottom", Side.BOTTOM));

        ModelHelper.setBlockModel(BonusBlocks.SKULL_CARVED_IDLE, () -> new BlockModelHorizontalRotation<>(BonusBlocks.SKULL_CARVED_IDLE)
                .setTex(0, "bonusblocks:block/skull/front_idle", Side.NORTH)
                .setTex(0, "bonusblocks:block/skull/side", Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/skull/top", Side.TOP)
                .setTex(0, "bonusblocks:block/skull/bottom", Side.BOTTOM));

        ModelHelper.setBlockModel(BonusBlocks.SKULL_CARVED_ACTIVE, () -> new BlockModelHorizontalRotation<>(BonusBlocks.SKULL_CARVED_ACTIVE)
                .setTex(0, "bonusblocks:block/skull/front_active", Side.NORTH)
                .setTex(0, "bonusblocks:block/skull/side", Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/skull/top", Side.TOP)
                .setTex(0, "bonusblocks:block/skull/bottom", Side.BOTTOM));

        ModelHelper.setBlockModel(BonusBlocks.SKULL_REDSTONE, () -> new BlockModelHorizontalRotation<>(BonusBlocks.SKULL_REDSTONE)
                .setTex(0, "bonusblocks:block/skull/front_redstone", Side.NORTH)
                .setTex(0, "bonusblocks:block/skull/side", Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "bonusblocks:block/skull/top", Side.TOP)
                .setTex(0, "bonusblocks:block/skull/bottom", Side.BOTTOM)
                .setTex(1, "bonusblocks:block/skull/front_overlay", Side.NORTH));

        ModelHelper.setBlockModel(BonusBlocks.TATAMI, () -> new BlockModelStandard<>(BonusBlocks.TATAMI)
                .setAllTextures(0, "bonusblocks:block/tatami"));

        ModelHelper.setBlockModel(BonusBlocks.FENCE_GOLD, () -> new BlockModelFenceThin<>(BonusBlocks.FENCE_GOLD,
                TextureRegistry.getTexture("bonusblocks:block/fence_gold/center"),
                null, TextureRegistry.getTexture("bonusblocks:block/fence_gold/top"),
                TextureRegistry.getTexture("bonusblocks:block/fence_gold/column"))
                .setAllTextures(0, "bonusblocks:block/fence_gold/center"));

        ModelHelper.setBlockModel(BonusBlocks.DOOR_STONE_BOTTOM, () -> new BlockModelDoor<>(BonusBlocks.DOOR_STONE_BOTTOM)
                .setTex(0, "bonusblocks:block/door/stone/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/stone/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.DOOR_STONE_TOP, () -> new BlockModelDoor<>(BonusBlocks.DOOR_STONE_TOP)
                .setTex(0, "bonusblocks:block/door/stone/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/stone/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        ModelHelper.setBlockModel(BonusBlocks.DOOR_BASALT_BOTTOM, () -> new BlockModelDoor<>(BonusBlocks.DOOR_BASALT_BOTTOM)
                .setTex(0, "bonusblocks:block/door/basalt/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/basalt/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.DOOR_BASALT_TOP, () -> new BlockModelDoor<>(BonusBlocks.DOOR_BASALT_TOP)
                .setTex(0, "bonusblocks:block/door/basalt/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/basalt/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        ModelHelper.setBlockModel(BonusBlocks.DOOR_LIMESTONE_BOTTOM, () -> new BlockModelDoor<>(BonusBlocks.DOOR_LIMESTONE_BOTTOM)
                .setTex(0, "bonusblocks:block/door/limestone/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/limestone/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.DOOR_LIMESTONE_TOP, () -> new BlockModelDoor<>(BonusBlocks.DOOR_LIMESTONE_TOP)
                .setTex(0, "bonusblocks:block/door/limestone/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/limestone/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        ModelHelper.setBlockModel(BonusBlocks.DOOR_GRANITE_BOTTOM, () -> new BlockModelDoor<>(BonusBlocks.DOOR_GRANITE_BOTTOM)
                .setTex(0, "bonusblocks:block/door/granite/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/granite/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.DOOR_GRANITE_TOP, () -> new BlockModelDoor<>(BonusBlocks.DOOR_GRANITE_TOP)
                .setTex(0, "bonusblocks:block/door/granite/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/granite/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        ModelHelper.setBlockModel(BonusBlocks.DOOR_PERMAFROST_BOTTOM, () -> new BlockModelDoor<>(BonusBlocks.DOOR_PERMAFROST_BOTTOM)
                .setTex(0, "bonusblocks:block/door/permafrost/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/permafrost/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.DOOR_PERMAFROST_TOP, () -> new BlockModelDoor<>(BonusBlocks.DOOR_PERMAFROST_TOP)
                .setTex(0, "bonusblocks:block/door/permafrost/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/permafrost/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        ModelHelper.setBlockModel(BonusBlocks.DOOR_NETHERRACK_BOTTOM, () -> new BlockModelDoor<>(BonusBlocks.DOOR_NETHERRACK_BOTTOM)
                .setTex(0, "bonusblocks:block/door/netherrack/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/netherrack/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.DOOR_NETHERRACK_TOP, () -> new BlockModelDoor<>(BonusBlocks.DOOR_NETHERRACK_TOP)
                .setTex(0, "bonusblocks:block/door/netherrack/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/netherrack/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        ModelHelper.setBlockModel(BonusBlocks.DOOR_MARBLE_BOTTOM, () -> new BlockModelDoor<>(BonusBlocks.DOOR_MARBLE_BOTTOM)
                .setTex(0, "bonusblocks:block/door/marble/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/marble/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.DOOR_MARBLE_TOP, () -> new BlockModelDoor<>(BonusBlocks.DOOR_MARBLE_TOP)
                .setTex(0, "bonusblocks:block/door/marble/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/marble/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        ModelHelper.setBlockModel(BonusBlocks.DOOR_SLATE_BOTTOM, () -> new BlockModelDoor<>(BonusBlocks.DOOR_SLATE_BOTTOM)
                .setTex(0, "bonusblocks:block/door/slate/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/slate/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.DOOR_SLATE_TOP, () -> new BlockModelDoor<>(BonusBlocks.DOOR_SLATE_TOP)
                .setTex(0, "bonusblocks:block/door/slate/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/slate/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));


        ModelHelper.setBlockModel(BonusBlocks.TRAPDOOR_STONE, () -> new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_STONE)
                .setTex(0, "bonusblocks:block/trapdoor/stone/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/stone/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.TRAPDOOR_BASALT, () -> new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_BASALT)
                .setTex(0, "bonusblocks:block/trapdoor/basalt/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/basalt/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.TRAPDOOR_LIMESTONE, () -> new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_LIMESTONE)
                .setTex(0, "bonusblocks:block/trapdoor/limestone/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/limestone/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.TRAPDOOR_GRANITE, () -> new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_GRANITE)
                .setTex(0, "bonusblocks:block/trapdoor/granite/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/granite/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.TRAPDOOR_PERMAFROST, () -> new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_PERMAFROST)
                .setTex(0, "bonusblocks:block/trapdoor/permafrost/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/permafrost/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.TRAPDOOR_NETHERRACK, () -> new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_NETHERRACK)
                .setTex(0, "bonusblocks:block/trapdoor/netherrack/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/netherrack/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.TRAPDOOR_MARBLE, () -> new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_MARBLE)
                .setTex(0, "bonusblocks:block/trapdoor/marble/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/marble/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.TRAPDOOR_SLATE, () -> new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_SLATE)
                .setTex(0, "bonusblocks:block/trapdoor/slate/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/slate/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));




        ModelHelper.setBlockModel(BonusBlocks.DOOR_GLASS_OBSIDIAN_BOTTOM, () -> new BlockModelDoorGlass<>(BonusBlocks.DOOR_GLASS_OBSIDIAN_BOTTOM).onRenderLayer(1)
                .setTex(0, "bonusblocks:block/door/glass_obsidian/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/glass_obsidian/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.DOOR_GLASS_OBSIDIAN_TOP, () -> new BlockModelDoorGlass<>(BonusBlocks.DOOR_GLASS_OBSIDIAN_TOP).onRenderLayer(1)
                .setTex(0, "bonusblocks:block/door/glass_obsidian/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/glass_obsidian/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.DOOR_GLASS_QUARTZ_BOTTOM, () -> new BlockModelDoorGlass<>(BonusBlocks.DOOR_GLASS_QUARTZ_BOTTOM)
                .setTex(0, "bonusblocks:block/door/glass_quartz/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/glass_quartz/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.DOOR_GLASS_QUARTZ_TOP, () -> new BlockModelDoorGlass<>(BonusBlocks.DOOR_GLASS_QUARTZ_TOP)
                .setTex(0, "bonusblocks:block/door/glass_quartz/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/glass_quartz/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.DOOR_GLASS_STEEL_BOTTOM, () -> new BlockModelDoorGlass<>(BonusBlocks.DOOR_GLASS_STEEL_BOTTOM)
                .setTex(0, "bonusblocks:block/door/glass_steel/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/glass_steel/bottom", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.DOOR_GLASS_STEEL_TOP, () -> new BlockModelDoorGlass<>(BonusBlocks.DOOR_GLASS_STEEL_TOP)
                .setTex(0, "bonusblocks:block/door/glass_steel/frame", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/door/glass_steel/top", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));

        ModelHelper.setBlockModel(BonusBlocks.TRAPDOOR_GLASS_OBSIDIAN, () -> new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_GLASS_OBSIDIAN).onRenderLayer(1)
                .setTex(0, "bonusblocks:block/trapdoor/glass_obsidian/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/glass_obsidian/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.TRAPDOOR_GLASS_QUARTZ, () -> new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_GLASS_QUARTZ)
                .setTex(0, "bonusblocks:block/trapdoor/glass_quartz/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/glass_quartz/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));
        ModelHelper.setBlockModel(BonusBlocks.TRAPDOOR_GLASS_STEEL, () -> new BlockModelTrapDoor<>(BonusBlocks.TRAPDOOR_GLASS_STEEL)
                .setTex(0, "bonusblocks:block/trapdoor/glass_steel/top", Side.TOP, Side.BOTTOM)
                .setTex(0, "bonusblocks:block/trapdoor/glass_steel/side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST));







        //STAIRS
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_WOOL, () -> new BlockModelStairsWool<>(BonusBlocks.STAIRS_WOOL));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_COBBLESTONE_MOSSY, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_COBBLESTONE_MOSSY));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_BRICK_STONE_POLISHED_MOSSY, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_STONE_POLISHED_MOSSY));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_BRICK_MUD, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_MUD));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_BRICK_QUARTZ, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_QUARTZ));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_BRICK_OLIVINE, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_OLIVINE));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_BRICK_CLAY_BAKED, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_CLAY_BAKED));

        //SLABS
        ModelHelper.setBlockModel(BonusBlocks.SLAB_WOOL, () -> new BlockModelSlabWool<>(BonusBlocks.SLAB_WOOL));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_COBBLESTONE_MOSSY, () -> new BlockModelSlab<>(BonusBlocks.SLAB_COBBLESTONE_MOSSY));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_BRICK_STONE_POLISHED_MOSSY, () -> new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_STONE_POLISHED_MOSSY));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_BRICK_MUD, () -> new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_MUD));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_BRICK_QUARTZ, () -> new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_QUARTZ));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_BRICK_OLIVINE, () -> new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_OLIVINE));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_BRICK_CLAY_BAKED, () -> new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_CLAY_BAKED));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_SLATE_POLISHED, () -> new BlockModelSlab<>(BonusBlocks.SLAB_SLATE_POLISHED));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_MARBLE_POLISHED, () -> new BlockModelSlab<>(BonusBlocks.SLAB_MARBLE_POLISHED));

    }

    @Override
    public void initItemModels(ItemModelDispatcher dispatcher) {
        ModelHelper.setItemModel(BonusItems.SOULWAX, () -> new ItemModelStandard(BonusItems.SOULWAX, "bonusblocks"));

        ModelHelper.setItemModel(BonusItems.MOSSBALL, () -> new ItemModelStandard(BonusItems.MOSSBALL, "bonusblocks"));

        ModelHelper.setItemModel(BonusItems.DOOR_STONE, () -> new ItemModelStandard(BonusItems.DOOR_STONE, "bonusblocks"));
        ModelHelper.setItemModel(BonusItems.DOOR_BASALT, () -> new ItemModelStandard(BonusItems.DOOR_BASALT, "bonusblocks"));
        ModelHelper.setItemModel(BonusItems.DOOR_GRANITE, () -> new ItemModelStandard(BonusItems.DOOR_GRANITE, "bonusblocks"));
        ModelHelper.setItemModel(BonusItems.DOOR_LIMESTONE, () -> new ItemModelStandard(BonusItems.DOOR_LIMESTONE, "bonusblocks"));
        ModelHelper.setItemModel(BonusItems.DOOR_MARBLE, () -> new ItemModelStandard(BonusItems.DOOR_MARBLE, "bonusblocks"));
        ModelHelper.setItemModel(BonusItems.DOOR_SLATE, () -> new ItemModelStandard(BonusItems.DOOR_SLATE, "bonusblocks"));
        ModelHelper.setItemModel(BonusItems.DOOR_PERMAFROST, () -> new ItemModelStandard(BonusItems.DOOR_PERMAFROST, "bonusblocks"));
        ModelHelper.setItemModel(BonusItems.DOOR_NETHERRACK, () -> new ItemModelStandard(BonusItems.DOOR_NETHERRACK, "bonusblocks"));
        ModelHelper.setItemModel(BonusItems.DOOR_GLASS_OBSIDIAN, () -> new ItemModelStandard(BonusItems.DOOR_GLASS_OBSIDIAN, "bonusblocks"));
        ModelHelper.setItemModel(BonusItems.DOOR_GLASS_QUARTZ, () -> new ItemModelStandard(BonusItems.DOOR_GLASS_QUARTZ, "bonusblocks"));
        ModelHelper.setItemModel(BonusItems.DOOR_GLASS_STEEL, () -> new ItemModelStandard(BonusItems.DOOR_GLASS_STEEL, "bonusblocks"));
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
