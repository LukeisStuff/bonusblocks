package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocksConfig;
import luke.bonusblocks.block.blockmodel.*;
import luke.bonusblocks.block.copper.*;
import luke.bonusblocks.block.silver.BlockSilverSeat;
import luke.bonusblocks.item.BonusItems;
import net.minecraft.client.render.block.color.LeavesOakBlockColor;
import net.minecraft.client.render.block.color.TallGrassBlockColor;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.colorizer.Colorizers;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.entity.ItemEntity;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.CreativeHelper;

import java.util.Random;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;
import static net.minecraft.core.block.Blocks.*;
import static net.minecraft.core.block.MossBlock.stoneToMossMap;
import static net.minecraft.core.item.tool.PickaxeToolItem.miningLevels;

public class BonusBlocks {

    public int blockID(String key) {
        return BonusBlocksConfig.cfg.getInt("Block IDs." + key);
    }

    public static Block BOX;

    public static Block CRATE;
    public static Block CRATE_PAINTED;

    public static Block BOOKSHELF_EMPTY_PLANKS_OAK;

    public static Block BRANCH;
    public static Block LEAVES_OAK_MOSSY;
    public static Block LEAVES_JACARANDA;

    public static Block SAPLING_OAK_MOSSY;
    public static Block SAPLING_JACARANDA;

    public static Block LOG_SHRUB;
    public static Block LOG_CACAO;
    public static Block LOG_JACARANDA;
    public static Block LOG_SCORCHED;

    public static Block MOSS;

    public static Block GRASS_OVERGROWN;
    public static Block GRASS_RETRO_OVERGROWN;
    public static Block GRASS_SCORCHED_OVERGROWN;
    public static Block PATH_DIRT_OVERGROWN;

    public static Block FLOWER_SILVER;
    public static Block FLOWER_CYAN;
    public static Block FLOWER_MAGENTA;
    public static Block FLOWER_LIME;

    public static Block PETAL_YELLOW;
    public static Block PETAL_RED;
    public static Block PETAL_CYAN;
    public static Block PETAL_PURPLE;
    public static Block PETAL_PINK;
    public static Block PETAL_SILVER;
    public static Block PETAL_ORANGE;
    public static Block PETAL_LIGHT_BLUE;
    public static Block PETAL_MAGENTA;
    public static Block PETAL_LIME;

    public static Block PETAL_LAYER_YELLOW;
    public static Block PETAL_LAYER_RED;
    public static Block PETAL_LAYER_CYAN;
    public static Block PETAL_LAYER_PURPLE;
    public static Block PETAL_LAYER_PINK;
    public static Block PETAL_LAYER_SILVER;
    public static Block PETAL_LAYER_ORANGE;
    public static Block PETAL_LAYER_LIGHT_BLUE;
    public static Block PETAL_LAYER_MAGENTA;
    public static Block PETAL_LAYER_LIME;

    public static Block MUSHROOM_GRAY;

    public static Block FUNGI_RED;
    public static Block FUNGI_BROWN;
    public static Block FUNGI_GRAY;

    public static Block BLOCK_BONE;
    public static Block THATCH;
    public static Block BLOCK_CLOTH;
    public static Block BLOCK_SLIME;
    public static Block BLOCK_SULPHUR;
    public static Block BLOCK_SUGAR;
    public static Block BLOCK_LEATHER;
    public static Block BLOCK_WICKER;
    public static Block BLOCK_FLINT;
    public static Block BLOCK_CRUDE_STEEL;
    public static Block BLOCK_COPPER;
    public static Block BLOCK_SILVER;

    public static Block BLOCK_RAW_GOLD;
    public static Block BLOCK_RAW_IRON;
    public static Block BLOCK_RAW_COPPER;
    public static Block BLOCK_RAW_SILVER;

    public static Block OVERLAY_RAW_GOLD;
    public static Block OVERLAY_RAW_IRON;
    public static Block OVERLAY_RAW_COPPER;
    public static Block OVERLAY_RAW_SILVER;

    public static Block ORE_COPPER_STONE;
    public static Block ORE_COPPER_BASALT;
    public static Block ORE_COPPER_LIMESTONE;
    public static Block ORE_COPPER_GRANITE;
    public static Block ORE_COPPER_PERMAFROST;

    public static Block ORE_SILVER_STONE;
    public static Block ORE_SILVER_BASALT;
    public static Block ORE_SILVER_LIMESTONE;
    public static Block ORE_SILVER_GRANITE;
    public static Block ORE_SILVER_PERMAFROST;

    public static Block MESH_COPPER;

    public static Block PIPE_COPPER;

    public static Block TRAPDOOR_COPPER;
    public static Block TRAPDOOR_SILVER;

    public static Block DOOR_COPPER_TOP;
    public static Block DOOR_COPPER_BOTTOM;

    public static Block FENCE_COPPER;
    public static Block FENCE_SILVER;

    public static Block PRESSURE_PLATE_COPPER;

    public static Block CHANDELIER_SILVER;

    public static Block CANDELABRA_SILVER;

    public static Block LANTERN_SILVER;

    public static Block VASE_SILVER;

    public static Block VANE_SILVER;

    public static Block CHIMES_SILVER;

    public static Block BED_SILVER;

    public static Block SEAT_SILVER;

    public static Block DOOR_SILVER_TOP;
    public static Block DOOR_SILVER_BOTTOM;

    public static Block SCORCHEDSTONE;

    public static Block PILLAR_SLATE;
    public static Block CAPSTONE_SLATE;

    public static Block MARBLE_POLISHED;

    public static Block SLATE_CARVED;
    public static Block MARBLE_CARVED;

    public static Block BLOCK_CLAY_BAKED;

    public static Block GLASS_OBSIDIAN;
    public static Block TRAPDOOR_GLASS_OBSIDIAN;
    public static Block GLASS_QUARTZ;

    public static Block BRICK_SCORCHEDSTONE;
    public static Block BRICK_MUD;
    public static Block BRICK_STEEL;
    public static Block BRICK_QUARTZ;
    public static Block BRICK_OLIVINE;
    public static Block BRICK_SILVER;

    public static Block CANDLE_SOULWAX;

    public static Block SLAB_WOOL;
    public static Block SLAB_COBBLESTONE_MOSSY;
    public static Block SLAB_SLATE_POLISHED;
    public static Block SLAB_MARBLE_POLISHED;
    public static Block SLAB_BRICK_STONE_POLISHED_MOSSY;
    public static Block SLAB_BRICK_GOLD;
    public static Block SLAB_BRICK_IRON;
    public static Block SLAB_BRICK_LAPIS;
    public static Block SLAB_BRICK_SCORCHEDSTONE;
    public static Block SLAB_BRICK_MUD;
    public static Block SLAB_SCORCHEDSTONE;
    public static Block SLAB_BRICK_STEEL;
    public static Block SLAB_BRICK_QUARTZ;
    public static Block SLAB_BRICK_OLIVINE;
    public static Block SLAB_BRICK_SILVER;
    public static Block SLAB_COPPER;

    public static Block STAIRS_WOOL;
    public static Block STAIRS_COBBLESTONE_MOSSY;
    public static Block STAIRS_BRICK_STONE_POLISHED_MOSSY;
    public static Block STAIRS_BRICK_GOLD;
    public static Block STAIRS_BRICK_IRON;
    public static Block STAIRS_BRICK_LAPIS;
    public static Block STAIRS_BRICK_SCORCHEDSTONE;
    public static Block STAIRS_BRICK_MUD;
    public static Block STAIRS_SCORCHEDSTONE;
    public static Block STAIRS_BRICK_STEEL;
    public static Block STAIRS_BRICK_QUARTZ;
    public static Block STAIRS_BRICK_OLIVINE;
    public static Block STAIRS_BRICK_SILVER;
    public static Block STAIRS_COPPER;

    public static Block BRICK_CLAY_BAKED;
    public static Block SLAB_BRICK_CLAY_BAKED;
    public static Block STAIRS_BRICK_CLAY_BAKED;

    public static Block DIRT_ROUGH;

    public static Block SKULL;
    public static Block SKULL_CARVED_IDLE;
    public static Block SKULL_CARVED_ACTIVE;
    public static Block SKULL_REDSTONE;

    public static Block LAZURITE;
    public static Block COBBLE_LAZURITE;
    public static Block SLAB_COBBLE_LAZURITE;
    public static Block STAIRS_COBBLE_LAZURITE;
    public static Block BRICK_LAZURITE;
    public static Block SLAB_BRICK_LAZURITE;
    public static Block STAIRS_BRICK_LAZURITE;
    public static Block LAZURITE_POLISHED;
    public static Block LAZURITE_CARVED;
    public static Block SLAB_LAZURITE_POLISHED;

    public static Block PERIDOT;
    public static Block COBBLE_PERIDOT;
    public static Block SLAB_COBBLE_PERIDOT;
    public static Block STAIRS_COBBLE_PERIDOT;
    public static Block BRICK_PERIDOT;
    public static Block SLAB_BRICK_PERIDOT;
    public static Block STAIRS_BRICK_PERIDOT;
    public static Block PERIDOT_POLISHED;
    public static Block PERIDOT_CARVED;
    public static Block SLAB_PERIDOT_POLISHED;

    public static Block POT;

    public static Block GIRDER_IRON;
    public static Block FENCE_GOLD;

    public static Block DOOR_GLASS_OBSIDIAN_BOTTOM;
    public static Block DOOR_GLASS_OBSIDIAN_TOP;
    public static Block TATAMI;

    public static Block FENCE_STEEL;

    public static Block DOOR_STONE_BOTTOM;
    public static Block DOOR_STONE_TOP;
    public static Block DOOR_BASALT_BOTTOM;
    public static Block DOOR_BASALT_TOP;
    public static Block DOOR_LIMESTONE_BOTTOM;
    public static Block DOOR_LIMESTONE_TOP;
    public static Block DOOR_GRANITE_BOTTOM;
    public static Block DOOR_GRANITE_TOP;
    public static Block DOOR_MARBLE_BOTTOM;
    public static Block DOOR_MARBLE_TOP;
    public static Block DOOR_SLATE_BOTTOM;
    public static Block DOOR_SLATE_TOP;
    public static Block DOOR_PERMAFROST_BOTTOM;
    public static Block DOOR_PERMAFROST_TOP;
    public static Block DOOR_NETHERRACK_BOTTOM;
    public static Block DOOR_NETHERRACK_TOP;
    public static Block DOOR_LAZURITE_BOTTOM;
    public static Block DOOR_LAZURITE_TOP;
    public static Block DOOR_PERIDOT_BOTTOM;
    public static Block DOOR_PERIDOT_TOP;

    public static Block TRAPDOOR_STONE;
    public static Block TRAPDOOR_BASALT;
    public static Block TRAPDOOR_LIMESTONE;
    public static Block TRAPDOOR_GRANITE;
    public static Block TRAPDOOR_MARBLE;
    public static Block TRAPDOOR_SLATE;
    public static Block TRAPDOOR_PERMAFROST;
    public static Block TRAPDOOR_NETHERRACK;
    public static Block TRAPDOOR_LAZURITE;
    public static Block TRAPDOOR_PERIDOT;

    public static Block BEDROLL;


    public void initializeBlockDetails() {
        miningLevels.put(LAZURITE, 0);
        miningLevels.put(COBBLE_LAZURITE, 0);
        miningLevels.put(BRICK_LAZURITE, 0);
        miningLevels.put(LAZURITE_POLISHED, 0);
        miningLevels.put(LAZURITE_CARVED, 0);
        miningLevels.put(SLAB_COBBLE_LAZURITE, 0);
        miningLevels.put(SLAB_BRICK_LAZURITE, 0);
        miningLevels.put(STAIRS_COBBLE_LAZURITE, 0);
        miningLevels.put(STAIRS_BRICK_LAZURITE, 0);
        miningLevels.put(PERIDOT, 0);
        miningLevels.put(COBBLE_PERIDOT, 0);
        miningLevels.put(BRICK_PERIDOT, 0);
        miningLevels.put(PERIDOT_POLISHED, 0);
        miningLevels.put(PERIDOT_CARVED, 0);
        miningLevels.put(SLAB_COBBLE_PERIDOT, 0);
        miningLevels.put(SLAB_BRICK_PERIDOT, 0);
        miningLevels.put(STAIRS_COBBLE_PERIDOT, 0);
        miningLevels.put(STAIRS_BRICK_PERIDOT, 0);


        miningLevels.put(BLOCK_RAW_IRON, 1);
        miningLevels.put(GIRDER_IRON, 1);
        miningLevels.put(BLOCK_RAW_COPPER, 1);
        miningLevels.put(ORE_COPPER_STONE, 1);
        miningLevels.put(ORE_COPPER_BASALT, 1);
        miningLevels.put(ORE_COPPER_LIMESTONE, 1);
        miningLevels.put(ORE_COPPER_GRANITE, 1);
        miningLevels.put(BLOCK_COPPER, 1);
        miningLevels.put(PIPE_COPPER, 1);
//        miningLevels.put(PIPE_COPPER_TARNISHED, 1);
//        miningLevels.put(PIPE_COPPER_CORRODED, 1);
        miningLevels.put(TRAPDOOR_COPPER, 1);
//        miningLevels.put(TRAPDOOR_COPPERTarnished, 1);
//        miningLevels.put(TRAPDOOR_COPPERCorroded, 1);
        miningLevels.put(DOOR_COPPER_TOP, 1);
        miningLevels.put(DOOR_COPPER_BOTTOM, 1);
//        miningLevels.put(doorCopperTarnishedTop, 1);
//        miningLevels.put(doorCopperTarnishedBottom, 1);
//        miningLevels.put(doorCopperCorrodedBottom, 1);
//        miningLevels.put(doorCopperCorrodedTop, 1);
        miningLevels.put(FENCE_COPPER, 1);
//        miningLevels.put(fenceCopperTarnished, 1);
//        miningLevels.put(fenceCopperCorroded, 1);
        miningLevels.put(SLAB_COPPER, 1);
//        miningLevels.put(pressureplateCopper, 1);
//        miningLevels.put(pressureplateCopperTarnished, 1);
//        miningLevels.put(pressureplateCopperCorroded, 1);
        miningLevels.put(STAIRS_COPPER, 1);
        miningLevels.put(SLAB_BRICK_LAPIS, 1);
        miningLevels.put(STAIRS_BRICK_LAPIS, 1);


        miningLevels.put(BLOCK_RAW_GOLD, 2);
        miningLevels.put(FENCE_GOLD, 2);
        miningLevels.put(SLAB_BRICK_GOLD, 2);
        miningLevels.put(STAIRS_BRICK_GOLD, 2);
        miningLevels.put(BRICK_STEEL, 2);
        miningLevels.put(SLAB_BRICK_STEEL, 2);
        miningLevels.put(STAIRS_BRICK_STEEL, 2);
        miningLevels.put(BLOCK_CRUDE_STEEL, 2);
        miningLevels.put(FENCE_STEEL, 2);

        miningLevels.put(BLOCK_SILVER, 2);
        miningLevels.put(BLOCK_RAW_SILVER, 2);
        miningLevels.put(BRICK_SILVER, 2);
        miningLevels.put(ORE_SILVER_STONE, 2);
        miningLevels.put(ORE_SILVER_BASALT, 2);
        miningLevels.put(ORE_SILVER_LIMESTONE, 2);
        miningLevels.put(ORE_SILVER_GRANITE, 2);
        miningLevels.put(ORE_SILVER_PERMAFROST, 2);
        miningLevels.put(SEAT_SILVER, 2);
        miningLevels.put(BED_SILVER, 2);
        miningLevels.put(CHANDELIER_SILVER, 2);
        miningLevels.put(CANDELABRA_SILVER, 2);
        miningLevels.put(CHIMES_SILVER, 2);
        miningLevels.put(VANE_SILVER, 2);
        miningLevels.put(VASE_SILVER, 2);
        miningLevels.put(FENCE_SILVER, 2);
        miningLevels.put(LANTERN_SILVER, 2);
        miningLevels.put(DOOR_SILVER_BOTTOM, 2);
        miningLevels.put(DOOR_SILVER_TOP, 2);
        miningLevels.put(TRAPDOOR_SILVER, 2);
        miningLevels.put(STAIRS_BRICK_SILVER, 2);
        miningLevels.put(SLAB_BRICK_SILVER, 2);


        //itemsList[CRATE_PAINTED.id] = new ItemBlockPainted(CRATE_PAINTED, false);

        stoneToMossMap.put(SAPLING_OAK, BonusBlocks.SAPLING_OAK_MOSSY);
        stoneToMossMap.put(MOSS_STONE, BonusBlocks.MOSS);
        stoneToMossMap.put(MOSS_BASALT, BonusBlocks.MOSS);
        stoneToMossMap.put(MOSS_LIMESTONE, BonusBlocks.MOSS);
        stoneToMossMap.put(MOSS_GRANITE, BonusBlocks.MOSS);

        LookupFuelFurnace.instance.addFuelEntry(LOG_JACARANDA.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(LOG_SCORCHED.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(LOG_CACAO.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(LOG_SHRUB.id, 300);

        LookupFuelFurnace.instance.addFuelEntry(BOX.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(CRATE.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(CRATE_PAINTED.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BOOKSHELF_EMPTY_PLANKS_OAK.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(THATCH.id, 400);
        LookupFuelFurnace.instance.addFuelEntry(BRANCH.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(SAPLING_JACARANDA.id, 100);
        LookupFuelFurnace.instance.addFuelEntry(SAPLING_OAK_MOSSY.id, 100);

        CreativeHelper.setParent(LAZURITE, PERMAFROST);
        CreativeHelper.setParent(PERIDOT, PERMAFROST);

        CreativeHelper.setParent(COBBLE_LAZURITE, COBBLE_PERMAFROST);
        CreativeHelper.setParent(COBBLE_PERIDOT, COBBLE_PERMAFROST);

        CreativeHelper.setParent(PILLAR_SLATE, PILLAR_MARBLE);

        CreativeHelper.setParent(SCORCHEDSTONE, SANDSTONE);

        CreativeHelper.setParent(BOX, PLANKS_OAK);

        CreativeHelper.setParent(CRATE, TROMMEL_IDLE);

        for (int color = 1; color < 17; color++) {
            CreativeHelper.setParent(CRATE_PAINTED, color - 1, TROMMEL_IDLE, 0);
        }

        for (int color = 0; color < 16; color++) {
            CreativeHelper.setParent(CRATE_PAINTED, color, TROMMEL_IDLE, 0);
        }

        CreativeHelper.setParent(BOOKSHELF_EMPTY_PLANKS_OAK, BOOKSHELF_PLANKS_OAK);

        CreativeHelper.setParent(CANDLE_SOULWAX, TORCH_COAL);

        CreativeHelper.setParent(MOSS, MOSS_GRANITE);

        CreativeHelper.setParent(STONE_CARVED, PILLAR_MARBLE);
        CreativeHelper.setParent(BASALT_CARVED, PILLAR_MARBLE);
        CreativeHelper.setParent(LIMESTONE_CARVED, PILLAR_MARBLE);
        CreativeHelper.setParent(GRANITE_CARVED, PILLAR_MARBLE);
        CreativeHelper.setParent(CAPSTONE_MARBLE, PILLAR_MARBLE);
        CreativeHelper.setParent(MARBLE_CARVED, PILLAR_MARBLE);
        CreativeHelper.setParent(SLATE_CARVED, PILLAR_MARBLE);
        CreativeHelper.setParent(PERMAFROST_CARVED, PILLAR_MARBLE);
        CreativeHelper.setParent(PERIDOT_CARVED, PILLAR_MARBLE);
        CreativeHelper.setParent(LAZURITE_CARVED, PILLAR_MARBLE);

        CreativeHelper.setParent(GRASS_OVERGROWN, GRASS_SCORCHED);
        CreativeHelper.setParent(GRASS_RETRO_OVERGROWN, GRASS_SCORCHED);
        CreativeHelper.setParent(GRASS_SCORCHED_OVERGROWN, GRASS_SCORCHED);
        CreativeHelper.setParent(PATH_DIRT_OVERGROWN, PATH_DIRT);

        CreativeHelper.setParent(DIRT_ROUGH, DIRT);

        CreativeHelper.setParent(SKULL, PUMPKIN_CARVED_ACTIVE);
        CreativeHelper.setParent(SKULL_CARVED_IDLE, PUMPKIN_CARVED_ACTIVE);
        CreativeHelper.setParent(SKULL_CARVED_ACTIVE, PUMPKIN_CARVED_ACTIVE);

        CreativeHelper.setParent(GLASS_OBSIDIAN, GLASS);
        CreativeHelper.setParent(GLASS_QUARTZ, GLASS_TINTED);

        CreativeHelper.setParent(TRAPDOOR_GLASS_OBSIDIAN, TRAPDOOR_GLASS);
        CreativeHelper.setParent(TRAPDOOR_COPPER, TRAPDOOR_GLASS);
//        CreativeHelper.setParent(TRAPDOOR_COPPERTarnished, TRAPDOOR_GLASS);
//        CreativeHelper.setParent(TRAPDOOR_COPPERCorroded, TRAPDOOR_GLASS);
        CreativeHelper.setParent(TRAPDOOR_SILVER, TRAPDOOR_GLASS);

        CreativeHelper.setParent(FLOWER_SILVER, FLOWER_RED);
        CreativeHelper.setParent(FLOWER_CYAN, FLOWER_RED);
        CreativeHelper.setParent(FLOWER_MAGENTA, FLOWER_RED);
        CreativeHelper.setParent(FLOWER_LIME, FLOWER_RED);

        CreativeHelper.setParent(PETAL_YELLOW, FLOWER_RED);
        CreativeHelper.setParent(PETAL_RED, FLOWER_RED);
        CreativeHelper.setParent(PETAL_CYAN, FLOWER_RED);
        CreativeHelper.setParent(PETAL_PURPLE, FLOWER_RED);
        CreativeHelper.setParent(PETAL_PINK, FLOWER_RED);
        CreativeHelper.setParent(PETAL_SILVER, FLOWER_RED);
        CreativeHelper.setParent(PETAL_ORANGE, FLOWER_RED);
        CreativeHelper.setParent(PETAL_LIGHT_BLUE, FLOWER_RED);
        CreativeHelper.setParent(PETAL_MAGENTA, FLOWER_RED);
        CreativeHelper.setParent(PETAL_LIME, FLOWER_RED);

        CreativeHelper.setParent(PETAL_LAYER_YELLOW, FLOWER_RED);
        CreativeHelper.setParent(PETAL_LAYER_RED, FLOWER_RED);
        CreativeHelper.setParent(PETAL_LAYER_CYAN, FLOWER_RED);
        CreativeHelper.setParent(PETAL_LAYER_PURPLE, FLOWER_RED);
        CreativeHelper.setParent(PETAL_LAYER_PINK, FLOWER_RED);
        CreativeHelper.setParent(PETAL_LAYER_SILVER, FLOWER_RED);
        CreativeHelper.setParent(PETAL_LAYER_ORANGE, FLOWER_RED);
        CreativeHelper.setParent(PETAL_LAYER_LIGHT_BLUE, FLOWER_RED);
        CreativeHelper.setParent(PETAL_LAYER_MAGENTA, FLOWER_RED);
        CreativeHelper.setParent(PETAL_LAYER_LIME, FLOWER_RED);

        CreativeHelper.setParent(MUSHROOM_GRAY, MUSHROOM_RED);

        CreativeHelper.setParent(FUNGI_BROWN, MUSHROOM_RED);
        CreativeHelper.setParent(FUNGI_RED, MUSHROOM_RED);
        CreativeHelper.setParent(FUNGI_GRAY, MUSHROOM_RED);

        CreativeHelper.setParent(LOG_SHRUB, LOG_OAK_MOSSY);
        CreativeHelper.setParent(LOG_CACAO, LOG_OAK_MOSSY);
        CreativeHelper.setParent(LOG_JACARANDA, LOG_OAK_MOSSY);
        CreativeHelper.setParent(LOG_SCORCHED, LOG_OAK_MOSSY);

        CreativeHelper.setParent(LEAVES_OAK_MOSSY, LEAVES_CACAO);
        CreativeHelper.setParent(LEAVES_JACARANDA, LEAVES_CACAO);
        CreativeHelper.setParent(BRANCH, LEAVES_CACAO);

        CreativeHelper.setParent(SAPLING_OAK_MOSSY, SAPLING_CACAO);
        CreativeHelper.setParent(SAPLING_JACARANDA, SAPLING_CACAO);

        CreativeHelper.setParent(ORE_COPPER_STONE, ORE_IRON_PERMAFROST);
        CreativeHelper.setParent(ORE_COPPER_BASALT, ORE_IRON_PERMAFROST);
        CreativeHelper.setParent(ORE_COPPER_LIMESTONE, ORE_IRON_PERMAFROST);
        CreativeHelper.setParent(ORE_COPPER_GRANITE, ORE_IRON_PERMAFROST);
        CreativeHelper.setParent(ORE_COPPER_PERMAFROST, ORE_IRON_PERMAFROST);

        CreativeHelper.setParent(ORE_SILVER_STONE, ORE_GOLD_PERMAFROST);
        CreativeHelper.setParent(ORE_SILVER_BASALT, ORE_GOLD_PERMAFROST);
        CreativeHelper.setParent(ORE_SILVER_LIMESTONE, ORE_GOLD_PERMAFROST);
        CreativeHelper.setParent(ORE_SILVER_GRANITE, ORE_GOLD_PERMAFROST);
        CreativeHelper.setParent(ORE_SILVER_PERMAFROST, ORE_GOLD_PERMAFROST);

        CreativeHelper.setParent(BLOCK_CLAY_BAKED, BLOCK_CLAY);

        CreativeHelper.setParent(BLOCK_SULPHUR, GRAVEL);
        CreativeHelper.setParent(BLOCK_SUGAR, GRAVEL);

        CreativeHelper.setParent(BRICK_SCORCHEDSTONE, BRICK_IRON);
        CreativeHelper.setParent(BRICK_MUD, BRICK_IRON);
        CreativeHelper.setParent(BRICK_STEEL, BRICK_IRON);
        CreativeHelper.setParent(BRICK_QUARTZ, BRICK_IRON);
        CreativeHelper.setParent(BRICK_OLIVINE, BRICK_IRON);
        CreativeHelper.setParent(BRICK_SILVER, BRICK_IRON);
        CreativeHelper.setParent(BRICK_CLAY_BAKED, BRICK_IRON);
        CreativeHelper.setParent(BRICK_LAZURITE, BRICK_IRON);
        CreativeHelper.setParent(BRICK_PERIDOT, BRICK_IRON);

        CreativeHelper.setParent(GIRDER_IRON, PIPE_COPPER);

        CreativeHelper.setParent(FENCE_COPPER, FENCE_CHAINLINK);
//        CreativeHelper.setParent(fenceCopperTarnished, FENCE_CHAINLINK);
//        CreativeHelper.setParent(fenceCopperCorroded, FENCE_CHAINLINK);
        CreativeHelper.setParent(FENCE_SILVER, FENCE_CHAINLINK);
        CreativeHelper.setParent(FENCE_GOLD, FENCE_CHAINLINK);
        CreativeHelper.setParent(FENCE_STEEL, FENCE_CHAINLINK);


        CreativeHelper.setParent(PRESSURE_PLATE_COPPER, PRESSURE_PLATE_COBBLE_STONE);
//        CreativeHelper.setParent(pressureplateCopperTarnished, PRESSURE_PLATE_COBBLE_STONE);
//        CreativeHelper.setParent(pressureplateCopperCorroded, PRESSURE_PLATE_COBBLE_STONE);

        CreativeHelper.setParent(MESH_COPPER, MESH);

        CreativeHelper.setParent(MARBLE_POLISHED, SLATE_POLISHED);
        CreativeHelper.setParent(LAZURITE_POLISHED, SLATE_POLISHED);
        CreativeHelper.setParent(PERIDOT_POLISHED, SLATE_POLISHED);

        CreativeHelper.setParent(BLOCK_BONE, BLOCK_CHARCOAL);
        CreativeHelper.setParent(THATCH, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_CLOTH, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_SLIME, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_LEATHER, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_WICKER, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_RAW_GOLD, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_RAW_IRON, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_RAW_COPPER, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_RAW_SILVER, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_FLINT, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_CRUDE_STEEL, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_COPPER, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_SILVER, BLOCK_CHARCOAL);

        CreativeHelper.setParent(SLAB_COBBLESTONE_MOSSY, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_SLATE_POLISHED, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_MARBLE_POLISHED, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_STONE_POLISHED_MOSSY, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_GOLD, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_IRON, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_LAPIS, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_SCORCHEDSTONE, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_SCORCHEDSTONE, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_MUD, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_STEEL, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_QUARTZ, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_OLIVINE, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_SILVER, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_COPPER, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_CLAY_BAKED, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_LAZURITE, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_LAZURITE_POLISHED, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_COBBLE_LAZURITE, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_COBBLE_PERIDOT, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_PERIDOT_POLISHED, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_PERIDOT, SLAB_BASALT_POLISHED);


        for (int color = 0; color < 16; color++) {
            CreativeHelper.setParent(SLAB_WOOL, color << 4, SLAB_BASALT_POLISHED, 0);
        }

        CreativeHelper.setParent(STAIRS_COBBLESTONE_MOSSY, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_STONE_POLISHED_MOSSY, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_GOLD, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_IRON, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_LAPIS, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_SCORCHEDSTONE, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_SCORCHEDSTONE, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_MUD, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_STEEL, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_QUARTZ, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_OLIVINE, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_SILVER, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_COPPER, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_CLAY_BAKED, STAIRS_BRICK_STONE);

        CreativeHelper.setParent(STAIRS_BRICK_LAZURITE, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_COBBLE_LAZURITE, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_PERIDOT, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_COBBLE_PERIDOT, STAIRS_BRICK_STONE);

        for (int color = 0; color < 16; color++) {
            CreativeHelper.setParent(STAIRS_WOOL, color << 4, STAIRS_BRICK_STONE, 0);
        }

    }



    public void initializeBlocks() {

        BlockBuilder boxes = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
                .setHardness(1.0f)
                .setResistance(1.0f)
                .setFlammability(5, 20)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT);

        BlockBuilder crates = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
                .setHardness(2.5f)
                .setResistance(5.0f)
                .setFlammability(5, 20)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT);

        BlockBuilder leaves = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
                .setHardness(0.2F)
                .setResistance(0.2F)
                .setFlammability(30, 60)
                .setTickOnLoad()
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_HOE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS, BlockTags.SHEARS_DO_SILK_TOUCH);

        BlockBuilder sapling = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
                .setHardness(0.0f)
                .setResistance(0.0f)
                .setBlockModel(CrossedSquaresBlockModel::new)
                .setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR);

        BlockBuilder log = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
                .setHardness(2.0F)
                .setResistance(1.0f)
                .setFlammability(5, 5)
                .setBlockModel(AxisAlignedBlockModel::new)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT);

        BlockBuilder grass = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
                .setHardness(0.6f)
                .setResistance(1.0f)
                .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.PASSIVE_MOBS_SPAWN, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH);

        BlockBuilder flower = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
                .setHardness(0.0f)
                .setResistance(0.0f)
                .setBlockModel(CrossedSquaresBlockModel::new)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR);

        BlockBuilder petal = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
                .setHardness(0.6f)
                .setResistance(0.6f)
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.GROWS_FLOWERS, BlockTags.MINEABLE_BY_AXE);

        BlockBuilder petalLayer = petal
                .setHardness(0.0f)
                .setResistance(0.0f)
                .setUseInternalLight()
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.BROKEN_BY_FLUIDS, BlockTags.MINEABLE_BY_AXE);

        BlockBuilder raw = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE);

        BlockBuilder pebble = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(0.0f)
                .setResistance(0.0f)
                .setBlockModel(PebblesBlockModel::new)
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.NOT_IN_CREATIVE_MENU);

        BlockBuilder ore = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
                .setHardness(3.0f)
                .setResistance(5.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE);

        BlockBuilder silver = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 2.0f))
                .setHardness(0.8f)
                .setResistance(2.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE);

        BlockBuilder stone = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
                .setHardness(1.5f)
                .setResistance(10.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE);

        BlockBuilder obsidian = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(5.0f)
                .setResistance(1000.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE);

        BlockBuilder brick = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
                .setResistance(10.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE);

        BlockBuilder slab = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
                .setHardness(1.0f)
                .setResistance(10.0f)
                .setUseInternalLight()
                .setVisualUpdateOnMetadata()
                .setBlockModel(SlabBlockModel::new)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE);

        BlockBuilder stairs = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
                .setHardness(1.0f)
                .setResistance(10.0f)
                .setUseInternalLight()
                .setVisualUpdateOnMetadata()
                .setBlockModel(StairsBlockModel::new)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE);



        /// Blocks

        // Box
        BOX = boxes
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/box"))
                .build(new Block("box", "bonusblocks:block/box", blockID("box"), Material.wood));

        // Crates
        CRATE = crates
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/crate"))
                .build(new Block("crate", "bonusblocks:block/crate", blockID("crate"), Material.wood));
        CRATE_PAINTED = crates
//                .setItemBlock(block -> new PaintedBlockItem(block, false))
                .setBlockModel(PaintedCrateBlockModel::new)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockPaintedCrate("crate.painted", "bonusblocks:block/crate_painted", blockID("CRATE_PAINTED")));


        // Bookshelf
        BOOKSHELF_EMPTY_PLANKS_OAK = new BlockBuilder(MOD_ID)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("minecraft:block/planks_oak", "bonusblocks:block/bookshelf_empty_side"))
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 0.8f))
                .setHardness(1.5f)
                .setResistance(1.0f)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
                .build(new Block("bookshelf.empty.planks.oak", "bonusblocks:block/bookshelf_empty_planks_oak", blockID("bookshelf.empty.planks.oak"), Material.wood));

        // Leaves and Branch
        BRANCH = leaves
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/branch"))
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 0.5f))
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
                .build(new BlockBranch("branch", "bonusblocks:block/branch", blockID("branch"), Material.leaves));

        LEAVES_OAK_MOSSY = leaves
                .setBlockModel(block -> new LeavesBlockModel<>(block, "bonusblocks:block/leaves_oak_mossy"))
                .setBlockColor(block -> (new LeavesOakBlockColor(Colorizers.oak)))
                .build(new BaseLeavesBlock("leaves.oak.mossy", "bonusblocks:block/leaves_oak_mossy", blockID("leaves.oak.mossy"), Material.leaves) {
                    @Override
                    public Block getSapling() {
                        return BonusBlocks.SAPLING_OAK_MOSSY;
                    }
                });
        LEAVES_JACARANDA = leaves
                .setBlockModel(block -> new LeavesBlockModel<>(block, "bonusblocks:block/leaves_jacaranda"))
                .build(new BaseLeavesBlock("leaves.jacaranda", "bonusblocks:block/leaves_jacaranda", blockID("LEAVES_JACARANDA"), Material.leaves) {
                    @Override
                    public Block getSapling() {
                        return BonusBlocks.SAPLING_JACARANDA;
                    }
                });


        // Saplings
        SAPLING_JACARANDA = sapling
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/sapling_jacaranda"))
                .build(new BlockSaplingJacaranda("sapling.jacaranda", "bonusblocks:block/sapling_jacaranda", blockID("saplingJacaranda")));
        SAPLING_OAK_MOSSY = sapling
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/sapling_oak_mossy"))
                .build(new BlockSaplingMossyOak("sapling.oak.mossy", "bonusblocks:block/sapling_oak_mossy", blockID("saplingOakMossy")));


        // Logs
        LOG_SHRUB = log
                .setBlockModel(block -> new AxisAlignedBlockModel<>(block).withTextures("bonusblocks:block/log_shrub_top", "bonusblocks:block/log_shrub_side"))
                .build(new LogBlock("log.shrub", "bonusblocks:block/log_shrub", blockID("logShrub")));
        LOG_CACAO = log
                .setBlockModel(block -> new AxisAlignedBlockModel<>(block).withTextures("bonusblocks:block/log_cacao_top", "bonusblocks:block/log_cacao_side"))
                .build(new LogBlock("log.cacao", "bonusblocks:block/log_cacao", blockID("LOG_CACAO")));
        LOG_JACARANDA = log
                .setBlockModel(block -> new AxisAlignedBlockModel<>(block).withTextures("bonusblocks:block/log_jacaranda_top", "bonusblocks:block/log_jacaranda_side"))
                .build(new LogBlock("log.jacaranda", "bonusblocks:block/log_jacaranda", blockID("LOG_JACARANDA")));
        LOG_SCORCHED = log
                .setBlockModel(block -> new AxisAlignedBlockModel<>(block).withTextures("bonusblocks:block/log_scorched_top", "bonusblocks:block/log_scorched_side"))
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.2f))
                .setHardness(1.8f)
                .build(new LogBlock("log.scorched", "bonusblocks:block/log_scorched", blockID("logScorched")));


        // Moss
        MOSS = grass
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/moss"))
                .setFlammability(100, 30)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
                .build(new BlockMossy("moss", "bonusblocks:block/moss", blockID("moss"), Material.moss));


        // Overgrown Grass
        GRASS_OVERGROWN = grass
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("minecraft:block/grass_top"))
                .setBlockColor(block -> (new TallGrassBlockColor(Colorizers.grass)))
                .build(new Block("grass.overgrown", "bonusblocks:block/grass_overgrown", blockID("overgrownGrass"), Material.grass));
        GRASS_RETRO_OVERGROWN = grass
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("minecraft:block/grass_retro_top"))
                .build(new Block("grass.retro.overgrown", "bonusblocks:block/grass_retro_overgrown", blockID("overgrownGrassRetro"), Material.grass));
        GRASS_SCORCHED_OVERGROWN = grass
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("minecraft:block/grass_scorched_top"))
                .build(new Block("grass.scorched.overgrown", "bonusblocks:block/grass_scorched_overgrown", blockID("overgrownGrassScorched"), Material.grass));
        PATH_DIRT_OVERGROWN = grass
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("minecraft:block/grass_path_top"))
                .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                .setBlockDrop(BonusBlocks.PATH_DIRT_OVERGROWN)
                .build(new DirtPathBlock("path.overgrown", "bonusblocks:block/dirt_path_overgrown", blockID("overgrownPath")));

        // Flowers

        FLOWER_SILVER = flower
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/flower_lightgray"))
                .build(new FlowerBlock("flower.silver", "bonusblocks:block/flower_silver", blockID("FLOWER_SILVER")));

        FLOWER_CYAN = flower
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/flower_cyan"))
                .build(new FlowerBlock("flower.cyan", "bonusblocks:block/flower_cyan", blockID("FLOWER_CYAN")));

        FLOWER_MAGENTA = flower
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/flower_magenta"))
                .build(new FlowerBlock("flower.magenta", "bonusblocks:block/flower_magenta", blockID("FLOWER_MAGENTA")));
        FLOWER_LIME = flower
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/flower_lime"))
                .build(new FlowerBlock("flower.lime", "bonusblocks:block/flower_lime", blockID("FLOWER_LIME")));

        // Petals
        PETAL_YELLOW = petal
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/petal_yellow"))
                .build(new BlockPetal("petal.yellow", "bonusblocks:block/petal_yellow", blockID("petalYellow"), Material.grass));
        PETAL_RED = petal
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/petal_red"))
                .build(new BlockPetal("petal.red", "bonusblocks:block/petal_red", blockID("petalRed"), Material.grass));
        PETAL_CYAN = petal
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/petal_cyan"))
                .build(new BlockPetal("petal.cyan", "bonusblocks:block/petal_cyan", blockID("petalCyan"), Material.grass));
        PETAL_PURPLE = petal
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/petal_purple"))
                .build(new BlockPetal("petal.purple", "bonusblocks:block/petal_purple", blockID("petalPurple"), Material.grass));
        PETAL_PINK = petal
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/petal_pink"))
                .build(new BlockPetal("petal.pink", "bonusblocks:block/petal_pink", blockID("petalPink"), Material.grass));
        PETAL_SILVER = petal
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/petal_lightgray"))
                .build(new BlockPetal("petal.silver", "bonusblocks:block/petal_silver", blockID("petalSilver"), Material.grass));
        PETAL_ORANGE = petal
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/petal_orange"))
                .build(new BlockPetal("petal.orange", "bonusblocks:block/petal_orange", blockID("petalOrange"), Material.grass));
        PETAL_LIGHT_BLUE = petal
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/petal_lightblue"))
                .build(new BlockPetal("petal.lightblue", "bonusblocks:block/petal_light_blue", blockID("petalLightBlue"), Material.grass));
        PETAL_MAGENTA = petal
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/petal_magenta"))
                .build(new BlockPetal("petal.magenta", "bonusblocks:block/petal_magenta", blockID("petalMagenta"), Material.grass));
        PETAL_LIME = petal
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/petal_lime"))
                .build(new BlockPetal("petal.lime", "bonusblocks:block/petal_lime", blockID("petalLime"), Material.grass));

        // Petal Layers
        PETAL_LAYER_YELLOW = petalLayer
                .setBlockModel(block -> new LayerBlockModel<>(block).withTextures("bonusblocks:block/petal_layer_yellow"))
                .build(new BlockLayerPetal("layer.petal.yellow", "bonusblocks:block/petal_layer_yellow", blockID("petalLayerYellow"), Material.grass));
        PETAL_LAYER_RED = petalLayer
                .setBlockModel(block -> new LayerBlockModel<>(block).withTextures("bonusblocks:block/petal_layer_red"))
                .build(new BlockLayerPetal("layer.petal.red", "bonusblocks:block/petal_layer_red", blockID("petalLayerRed"), Material.grass));
        PETAL_LAYER_CYAN = petalLayer
                .setBlockModel(block -> new LayerBlockModel<>(block).withTextures("bonusblocks:block/petal_layer_cyan"))
                .build(new BlockLayerPetal("layer.petal.cyan", "bonusblocks:block/petal_layer_cyan", blockID("petalLayerCyan"), Material.grass));
        PETAL_LAYER_PURPLE = petalLayer
                .setBlockModel(block -> new LayerBlockModel<>(block).withTextures("bonusblocks:block/petal_layer_purple"))
                .build(new BlockLayerPetal("layer.petal.purple", "bonusblocks:block/petal_layer_purple", blockID("petalLayerPurple"), Material.grass));
        PETAL_LAYER_PINK = petalLayer
                .setBlockModel(block -> new LayerBlockModel<>(block).withTextures("bonusblocks:block/petal_layer_pink"))
                .build(new BlockLayerPetal("layer.petal.pink", "bonusblocks:block/petal_layer_pink", blockID("petalLayerPink"), Material.grass));
        PETAL_LAYER_SILVER = petalLayer
                .setBlockModel(block -> new LayerBlockModel<>(block).withTextures("bonusblocks:block/petal_layer_lightgray"))
                .build(new BlockLayerPetal("layer.petal.silver", "bonusblocks:block/petal_layer_lightgray", blockID("petalLayerSilver"), Material.grass));
        PETAL_LAYER_ORANGE = petalLayer
                .setBlockModel(block -> new LayerBlockModel<>(block).withTextures("bonusblocks:block/petal_layer_orange"))
                .build(new BlockLayerPetal("layer.petal.orange", "bonusblocks:block/petal_layer_orange", blockID("petalLayerOrange"), Material.grass));
        PETAL_LAYER_LIGHT_BLUE = petalLayer
                .setBlockModel(block -> new LayerBlockModel<>(block).withTextures("bonusblocks:block/petal_layer_lightblue"))
                .build(new BlockLayerPetal("layer.petal.lightblue", "bonusblocks:block/petal_layer_lightblue", blockID("petalLayerLightBlue"), Material.grass));
        PETAL_LAYER_MAGENTA = petalLayer
                .setBlockModel(block -> new LayerBlockModel<>(block).withTextures("bonusblocks:block/petal_layer_magenta"))
                .build(new BlockLayerPetal("layer.petal.magenta", "bonusblocks:block/petal_layer_magenta", blockID("petalLayerMagenta"), Material.grass));
        PETAL_LAYER_LIME = petalLayer
                .setBlockModel(block -> new LayerBlockModel<>(block).withTextures("bonusblocks:block/petal_layer_lime"))
                .build(new BlockLayerPetal("layer.petal.lime", "bonusblocks:block/petal_layer_lime", blockID("petalLayerLime"), Material.grass));

        // Mushroom
        MUSHROOM_GRAY = flower
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/mushroom_gray"))
                .build(new MushroomBlock("mushroom.gray", "bonusblocks:block/mushroom_gray", blockID("mushroomGray")));

        // Mushroom Blocks
        FUNGI_BROWN = grass
                .setLuminance(2)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_mushroom_brown"))
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build(new Block("fungi.brown", "bonusblocks:block/fungi_brown", blockID("fungiBrown"), Material.dirt));
        FUNGI_RED = grass
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_mushroom_red"))
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build(new Block("fungi.red", "bonusblocks:block/fungi_red", blockID("fungiRed"), Material.dirt));
        FUNGI_GRAY = grass
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_mushroom_gray"))
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build(new Block("fungi.gray", "bonusblocks:block/fungi_gray", blockID("fungiGray"), Material.dirt));

        // Bone Block
        BLOCK_BONE = stone
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setBlockModel(block -> new AxisAlignedBlockModel<>(block).withTextures("bonusblocks:block/block_bone_top", "bonusblocks:block/block_bone_side"))
                .build(new AxisAlignedBlock("block.bone","bonusblocks:block/block_bone", blockID("blockBone"), Material.stone));

        // Thatch
        THATCH = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 0.6f, 1.2f))
                .setHardness(0.6f)
                .setResistance(0.6f)
                .setBlockModel(block -> new AxisAlignedBlockModel<>(block).withTextures("bonusblocks:block/thatch_top", "bonusblocks:block/thatch_side"))
                .setFlammability(60, 120)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
                .build(new BlockThatch("thatch", "bonusblocks:block/thatch", blockID("thatch"), Material.grass));

        // Cloth Block
        BLOCK_CLOTH = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.8f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_cloth"))
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.MINEABLE_BY_AXE)
                .build(new BlockCloth("block.cloth","bonusblocks:block/block_cloth", blockID("blockCloth"), Material.cloth));

        // Slime Block
        BLOCK_SLIME = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.5f))
                .setHardness(0.2f)
                .setResistance(0.2f)
                .setLightOpacity(6)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_slime"))
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build(new BlockSlime("block.slime", "bonusblocks:block/block_slime", blockID("blockSlime"), Material.leaves));

        // Sulphur Block
        BLOCK_SULPHUR = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                .setHardness(0.5f)
                .setResistance(0.5f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_sulphur"))
                .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                .build(new BlockSulphur("block.sulphur", "bonusblocks:block/block_sulphur", blockID("blockSulphur"), Material.explosive));

        // Sugar Block
        BLOCK_SUGAR = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                .setHardness(0.3f)
                .setResistance(0.3f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_sugar"))
                .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.BROKEN_BY_FLUIDS)
                .build(new SandBlock("block.sugar", "bonusblocks:block/block_sugar", blockID("blockSugar")));

        // Leather Block
        BLOCK_LEATHER = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.6f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_leather"))
                .setFlammability(5, 10)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build(new Block("block.leather","bonusblocks:block/block_leather", blockID("blockLeather"), Material.cloth));

        // Wicker Block
        BLOCK_WICKER = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.5f)
                .setResistance(0.5f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("minecraft:block/basket_bottom"))
                .setFlammability(60, 120)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build(new Block("block.wicker","bonusblocks:block/wicker", blockID("blockWicker"), Material.cloth));

        // Flint Block
        BLOCK_FLINT = raw
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_flint"))
                .setInfiniburn()
                .build(new Block("block.flint","bonusblocks:block/block_flint", blockID("blockFlint"), Material.stone));

        // Crude Steel Block
        BLOCK_CRUDE_STEEL = raw
                .setHardness(4.0f)
                .setResistance(1000.0f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_steel_crude"))
                .build(new Block("block.steel.crude", "bonusblocks:block/block_steel_crude", blockID("blockCrudeSteel"), Material.metal));

        // Raw Blocks
        BLOCK_RAW_IRON = raw
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_iron_raw"))
                .build(new Block("block.raw.iron", "bonusblocks:block/block_raw_iron", blockID("BLOCK_RAW_IRON"), Material.metal));
        BLOCK_RAW_GOLD = raw
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_gold_raw"))
                .build(new Block("block.raw.gold", "bonusblocks:block/block_raw_gold", blockID("BLOCK_RAW_GOLD"), Material.metal));
        BLOCK_RAW_COPPER = raw
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_copper_raw"))
                .setTicking(true)
                .build(new Block("block.raw.copper", "bonusblocks:block/block_raw_copper", blockID("BLOCK_RAW_COPPER"), Material.metal) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.BLOCK_RAW_COPPER.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });

        BLOCK_RAW_SILVER = silver
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_silver_raw"))
                .build(new Block("block.raw.silver", "bonusblocks:block/block_raw_silver", blockID("blockRawSilver"), Material.metal));

        // Nuggets

        // Make Custom BlockMODEL for these fuckers
        OVERLAY_RAW_IRON = pebble
                .setBlockModel(BlockModelNuggetsIron::new)
                .build(new BlockOverlayRawIron("overlay.iron", "bonusblocks:block/overlay_raw_copper", blockID("overlayRawIron"), Material.metal));
        OVERLAY_RAW_GOLD = pebble
                .setBlockModel(BlockModelNuggetsGold::new)
                .build(new BlockOverlayRawGold("overlay.gold", "bonusblocks:block/overlay_raw_gold", blockID("overlayRawGold"), Material.metal));
        OVERLAY_RAW_COPPER = pebble
                .setBlockModel(BlockModelNuggetsCopper::new)
                .build(new BlockOverlayRawCopper("overlay.copper", "bonusblocks:block/overlay_raw_copper", blockID("overlayRawCopper"), Material.metal));
        OVERLAY_RAW_SILVER = pebble
                .setBlockModel(BlockModelNuggetsSilver::new)
                .build(new BlockOverlayRawSilver("overlay.silver", "bonusblocks:block/overlay_raw_silver", blockID("OVERLAY_RAW_SILVER"), Material.metal));

        // Copper Ores
        ORE_COPPER_STONE = ore
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/ore_copper_stone"))
                .build(new CopperOreBlock("ore.copper.stone", "bonusblocks:block/ore_copper_stone", STONE.id, blockID("ORE_COPPER_STONE"), Material.stone));
        ORE_COPPER_BASALT = ore
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/ore_copper_basalt"))
                .build(new CopperOreBlock("ore.copper.basalt", "bonusblocks:block/ore_copper_basalt", BASALT.id, blockID("ORE_COPPER_BASALT"), Material.basalt));
        ORE_COPPER_LIMESTONE = ore
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/ore_copper_limestone"))
                .build(new CopperOreBlock("ore.copper.limestone", "bonusblocks:block/ore_copper_granite", LIMESTONE.id, blockID("ORE_COPPER_LIMESTONE"), Material.limestone));
        ORE_COPPER_GRANITE = ore
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/ore_copper_granite"))
                .build(new CopperOreBlock("ore.copper.granite", "bonusblocks:block/ore_copper_granite", GRANITE.id, blockID("ORE_COPPER_GRANITE"), Material.granite));
        ORE_COPPER_PERMAFROST = ore
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/ore_copper_permafrost"))
                .build(new CopperOreBlock("ore.copper.permafrost", "bonusblocks:block/ore_copper_permafrost", PERMAFROST.id, blockID("ore_copper_permafrost"), Material.permafrost));

        ORE_SILVER_STONE = ore
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/ore_silver_stone"))
                .build(new CopperOreBlock("ore.silver.stone", "bonusblocks:block/ore_silver_stone", STONE.id, blockID("ORE_SILVER_STONE"), Material.stone));
        ORE_SILVER_BASALT = ore
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/ore_silver_basalt"))
                .build(new CopperOreBlock("ore.silver.basalt", "bonusblocks:block/ore_silver_basalt", BASALT.id, blockID("ORE_SILVER_BASALT"), Material.basalt));
        ORE_SILVER_LIMESTONE = ore
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/ore_silver_limestone"))
                .build(new CopperOreBlock("ore.silver.limestone", "bonusblocks:block/ore_silver_granite", LIMESTONE.id, blockID("ORE_SILVER_LIMESTONE"), Material.limestone));
        ORE_SILVER_GRANITE = ore
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/ore_silver_granite"))
                .build(new CopperOreBlock("ore.silver.granite", "bonusblocks:block/ore_silver_granite", GRANITE.id, blockID("ORE_SILVER_GRANITE"), Material.granite));
        ORE_SILVER_PERMAFROST = ore
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/ore_silver_permafrost"))
                .build(new CopperOreBlock("ore.silver.permafrost", "bonusblocks:block/ore_silver_permafrost", PERMAFROST.id, blockID("ore_silver_permafrost"), Material.permafrost));


        // Copper Blocks
        BLOCK_COPPER = raw
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_copper"))
                .setTicking(true)
                .build(new Block("block.copper", "bonusblocks:block/block_copper", blockID("BLOCK_COPPER"), Material.metal) {
                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.BLOCK_COPPER.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });


        // Copper Mesh
        MESH_COPPER = raw
                .setBlockModel(block -> new TransparentBlockModel<>(block, true).withTextures("bonusblocks:block/mesh_copper"))
                .setTicking(true)
                .build(new TransparentBlock("mesh.copper", "bonusblocks:block/mesh_copper", blockID("meshCopper"), Material.metal) {
                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.MESH_COPPER.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });


        // Copper Pipe
        PIPE_COPPER = raw
                .setIcon("bonusblocks:block/pipe_copper")
//                .setBlockModel(block -> new DFBlockModelBuilder(MOD_ID).setBlockModel("block/pipe.json").setBlockState(MOD_ID, "pipe_states.json").setMetaStateInterpreter(new PipeMetaStateInterpreter()).setRender3D(false).build(PIPE_COPPER))
                .build(new CopperPipeBlock("pipe.copper", "bonusblocks:block/pipe_copper", blockID("PIPE_COPPER")));


        // Copper Trapdoor
        TRAPDOOR_COPPER = raw
                .setBlockModel(block -> new TrapDoorBlockModel<>(block).withTextures("bonusblocks:block/trapdoor_copper_top", "bonusblocks:block/trapdoor_copper_side"))
                .setVisualUpdateOnMetadata()
                .setTicking(true)
                .build(new TrapDoorBlock("trapdoor.copper", "bonusblocks:block/trapdoor_copper", blockID("TRAPDOOR_COPPER"), Material.stone) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.TRAPDOOR_COPPER.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });


        // Copper Doors
        DOOR_COPPER_BOTTOM = raw
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_copper_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new CopperDoorBlock("door.copper.bottom", "bonusblocks:block/door_copper_bottom", blockID("door_copper_bottom"), Material.metal, false, () -> BonusItems.DOOR_COPPER));
        DOOR_COPPER_TOP = raw
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_copper_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new CopperDoorBlock("door.copper.top", "bonusblocks:block/door_copper_top", blockID("doorCopperTop"), Material.metal, true, () -> BonusItems.DOOR_COPPER));


        // Copper Fence
        FENCE_COPPER = raw
                .setBlockModel(block -> new FenceThinBlockModel<>(block, TextureRegistry.getTexture("bonusblocks:block/fence_copper_center"), null, TextureRegistry.getTexture("bonusblocks:block/fence_copper_top"), TextureRegistry.getTexture("bonusblocks:block/fence_copper_column")).withTextures("bonusblocks:block/fence_copper_center"))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceCopper("fence.copper", "bonusblocks:block/fence_copper", blockID("fenceCopper"), Material.metal));


        //Copper Pressure Plate
        PRESSURE_PLATE_COPPER = raw
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_copper").withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS)
                .build(new CopperPressurePlateBlock("pressureplate.copper", "bonusblocks:block/pressure_plate_copper", blockID("pressureplateCopper"), ItemEntity.class));


        // Silver
        BLOCK_SILVER = silver
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_silver"))
                .build(new Block("block.silver", "bonusblocks:block/block_silver", blockID("blockSilver"), Material.metal));

        BRICK_SILVER = silver
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/brick_silver"))
                .build(new Block("brick.silver", "bonusblocks:block/brick_silver", blockID("brickSilver"), Material.metal));

        // Silver Trapdoor
        TRAPDOOR_SILVER = silver
                .setBlockModel(block -> new TrapDoorBlockModel<>(block).withTextures("bonusblocks:block/trapdoor_silver_top", "bonusblocks:block/trapdoor_silver_side"))
                .setVisualUpdateOnMetadata()
                .build(new TrapDoorBlock("trapdoor.silver", "bonusblocks:block/trapdoor_silver", blockID("trapdoorSilver"), Material.stone));

        // Silver Doors
        DOOR_SILVER_BOTTOM = silver
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_silver_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new DoorBlock("door.silver.bottom", "bonusblocks:block/door_silver_bottom", blockID("DOOR_SILVER_BOTTOM"), Material.stone, true, true, () -> BonusItems.DOOR_SILVER));
        DOOR_SILVER_TOP = silver
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_silver_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new DoorBlock("door.silver.top", "bonusblocks:block/door_silver_top", blockID("DOOR_SILVER_TOP"), Material.stone, true, true, () -> BonusItems.DOOR_SILVER));

        // Silver Fence
        FENCE_SILVER = silver
                .setBlockModel(block -> new FenceThinBlockModel<>(block, TextureRegistry.getTexture("bonusblocks:block/fence_silver_center"), null, null, TextureRegistry.getTexture("bonusblocks:block/fence_silver_column")).withTextures("bonusblocks:block/fence_silver_center"))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceNoClimb("fence.silver", "bonusblocks:block/fence_silver", blockID("fenceSilver"), Material.metal));

        // Silver Chandelier
        CHANDELIER_SILVER = silver
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/chandelier_silver"))
                .setVisualUpdateOnMetadata()
                .setLuminance(15)
                .setUseInternalLight()
                .build(new BlockChandelier("chandelier.silver", "bonusblocks:block/chandelier_silver", blockID("chandelierSilver")));

        // Silver Candelabra
        CANDELABRA_SILVER = silver
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/candelabra_silver"))
                .setVisualUpdateOnMetadata()
                .setLuminance(15)
                .setUseInternalLight()
                .build(new BlockVase("candelabra.silver", "bonusblocks:block/candelabra_silver", blockID("candelabraSilver")));

        // Silver Lantern
        LANTERN_SILVER = silver
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/lantern_silver"))
                .setVisualUpdateOnMetadata()
                .setLuminance(15)
                .setUseInternalLight()
                .build(new BlockLantern("lantern.silver", "bonusblocks:block/lantern_silver", blockID("lanternSilver")));

        // Silver Vase
        VASE_SILVER = silver
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/vase_silver"))
                .setVisualUpdateOnMetadata()
                .build(new BlockVase("vase.silver", "bonusblocks:block/vase_silver", blockID("vaseSilver")));

        // Silver Vane
        VANE_SILVER = silver
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/vane_silver"))
                .setVisualUpdateOnMetadata()
                .build(new BlockVace("vane.silver", "bonusblocks:block/vane_silver", blockID("vaneSilver")));

        // Silver Chimes
        CHIMES_SILVER = silver
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/chimes_silver"))
                .setVisualUpdateOnMetadata()
                .build(new BlockChimes("chimes.silver", "bonusblocks:block/chimes_silver", blockID("chimesSilver")));

        // Silver Bed
        BED_SILVER = silver
                .setBlockModel(BlockModelSilverBed::new)
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockSilverSeat("bed.silver", "bonusblocks:block/bed_silver", blockID("bed_silver"), Material.metal));

        // Silver Seat
        SEAT_SILVER = silver
                .setBlockModel(block -> new SeatBlockModel<>(block).withTextures("bonusblocks:block/seat_silver_top", "bonusblocks:block/block_silver", "bonusblocks:block/seat_silver_side"))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockSilverSeat("seat.silver", "bonusblocks:block/seat_silver", blockID("seatSilver"), Material.metal));


        // Scorched Stone
        SCORCHEDSTONE = stone
                .setHardness(0.8f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/scorchedstone_top", "bonusblocks:block/scorchedstone_bottom", "bonusblocks:block/scorchedstone_side"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.GROWS_TREES, BlockTags.GROWS_SPINIFEX, BlockTags.GROWS_FLOWERS, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
                .build(new Block("scorchedstone", "bonusblocks:block/scorchedstone", blockID("scorchedstone"), Material.stone));


        // Slate Pillar
        PILLAR_SLATE = stone
                .setBlockModel(block -> new AxisAlignedBlockModel<>(block).withTextures("bonusblocks:block/pillar_slate_top", "bonusblocks:block/pillar_slate_side"))
                .build(new AxisAlignedBlock("pillar.slate", "bonusblocks:block/pillar_slate", blockID("pillarSlate"), Material.stone));


        // Polished Stones
        MARBLE_POLISHED = stone
                .setHardness(1.0f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/polished_marble_top", "bonusblocks:block/polished_marble_side"))
                .build(new Block("marble.polished", "bonusblocks:block/marble_polished", blockID("marblePolished"), Material.stone));


        // Carved Stones
        SLATE_CARVED = stone
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("minecraft:block/polished_slate_top", "minecraft:block/carved_slate"))
                .build(new Block("slate.carved", "bonusblocks:block/slate_carved", blockID("slateCarved"), Material.stone));
        MARBLE_CARVED = stone
                .setHardness(1.0f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/polished_marble_top", "bonusblocks:block/carved_marble"))
                .build(new Block("marble.carved", "bonusblocks:block/marble_carved", blockID("marbleCarved"), Material.stone));


        // Baked Clay
        BLOCK_CLAY_BAKED = stone
                .setHardness(3.0f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/block_clay_baked"))
                .build(new Block("block.clay.baked", "bonusblocks:block/block_clay_baked", blockID("BLOCK_CLAY_BAKED"), Material.stone));


        // Obsidian Glass
        GLASS_OBSIDIAN = obsidian
                .setBlockModel(block -> new TransparentBlockModel<>(block, false).withTextures("bonusblocks:block/glass_obsidian"))
                .build(new ObsidianGlassBlock("glass.obsidian", "bonusblocks:block/glass_obsidian", blockID("GLASS_OBSIDIAN")));
        TRAPDOOR_GLASS_OBSIDIAN = obsidian
                .setBlockModel(block -> new TrapDoorBlockModel<>(block).withTextures("bonusblocks:block/glass_obsidian", "bonusblocks:block/trapdoor_glass_obsidian_side"))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoorObsidian("trapdoor.glass.obsidian", "bonusblocks:block/trapdoor_glass_obsidian", blockID("trapDOOR_GLASS_OBSIDIAN")));

        // Quartz Glass
        GLASS_QUARTZ = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(0.3F)
                .setResistance(0.3F)
                .setVisualUpdateOnMetadata()
                .setUseInternalLight()
                .setBlockModel(block -> new TransparentBlockModel<>(block, false).withTextures("bonusblocks:block/glass_quartz"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build(new BlockGlassQuartz("glass.quartz", "bonusblocks:block/glass_quartz", blockID("glassQuartz")));


        BRICK_SCORCHEDSTONE = brick
                .setHardness(0.8f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/brick_scorchedstone"))
                .build(new Block("brick.scorchedstone", "bonusblocks:block/brick_scorchedstone", blockID("BRICK_SCORCHEDSTONE"), Material.stone));
        BRICK_MUD = brick
                .setHardness(1.5f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/brick_mud_baked"))
                .build(new Block("brick.mud", "bonusblocks:block/brick_mud", blockID("BRICK_MUD"), Material.stone));
        BRICK_STEEL = brick
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0F)
                .setResistance(4000.0f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/brick_steel"))
                .build(new Block("brick.steel", "bonusblocks:block/brick_steel", blockID("BRICK_STEEL"), Material.metal));
        BRICK_QUARTZ = brick
                .setHardness(3.0f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/brick_quartz"))
                .build(new Block("brick.quartz", "bonusblocks:block/brick_quartz", blockID("BRICK_QUARTZ"), Material.stone));
        BRICK_OLIVINE = brick
                .setHardness(3.0f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/brick_olivine"))
                .build(new Block("brick.olivine", "bonusblocks:block/brick_olivine", blockID("BRICK_OLIVINE"), Material.stone));


        // Soul Candle
        CANDLE_SOULWAX = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 1.2f))
                .setIcon("bonusblocks:item/candle_soulwax")
                .setHardness(0.0f)
                .setResistance(0.0f)
                .setLuminance(10)
                .setBlockModel(block -> new BlockModelSoulwaxCandle<>(block).withTextures("bonusblocks:block/candle_soulwax"))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_SWORD, BlockTags.BROKEN_BY_FLUIDS)
                .build(new BlockSoulCandle("candle.soulwax", "bonusblocks:block/candle_soulwax", blockID("candleSoulwax")));


        //Slabs
        SLAB_WOOL = slab
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.8F)
                .setResistance(0.8F)
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.NOT_IN_CREATIVE_MENU)
//                .setItemBlock(SlabPaintedBlockModel::new)
                .setBlockModel(BlockModelSlabWool::new)
                .build(new SlabBlock(Blocks.WOOL, "bonusblocks:block/slab_wool", blockID("SLAB_WOOL")));

        SLAB_COBBLESTONE_MOSSY = slab
                .setHardness(2.0F)
                .build(new SlabBlock(COBBLE_STONE_MOSSY, "bonusblocks:block/slab_cobble_stone_mossy", blockID("slabCobbleStoneMossy")));
        SLAB_SLATE_POLISHED = slab
                .build(new SlabBlock(SLATE_CARVED, "bonusblocks:block/slab_slate_polished", blockID("slabSlatePolished")));
        SLAB_MARBLE_POLISHED = slab
                .build(new SlabBlock(MARBLE_CARVED, "bonusblocks:block/slab_marble_polished", blockID("slabMarblePolished")));
        SLAB_BRICK_STONE_POLISHED_MOSSY = slab
                .setHardness(2.0F)
                .build(new SlabBlock(BRICK_STONE_POLISHED_MOSSY, "bonusblocks:block/slab_brick_stone_polished_mossy", blockID("slabBrickStonePolishedMossy")));
        SLAB_BRICK_GOLD = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(3.0F)
                .build(new SlabBlock(BRICK_GOLD, "bonusblocks:block/slab_brick_gold", blockID("slabBrickGold")));
        SLAB_BRICK_LAPIS = slab
                .setHardness(3.0F)
                .build(new SlabBlock(BRICK_LAPIS, "bonusblocks:block/slab_brick_lapis", blockID("slabBrickLapis")));
        SLAB_BRICK_IRON = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0F)
                .build(new SlabBlock(BRICK_IRON, "bonusblocks:block/slab_brick_iron", blockID("slabBrickIron")));
        SLAB_BRICK_SCORCHEDSTONE = slab
                .setHardness(0.8f)
                .build(new SlabBlock(BRICK_SCORCHEDSTONE, "bonusblocks:block/slab_brick_scorchedstone", blockID("slabBRICK_SCORCHEDSTONE")));
        SLAB_BRICK_MUD = slab
                .build(new SlabBlock(BRICK_MUD, "bonusblocks:block/slab_brick_mud", blockID("slabBRICK_MUD")));
        SLAB_SCORCHEDSTONE = slab
                .setHardness(0.8F)
                .build(new SlabBlock(SCORCHEDSTONE, "bonusblocks:block/slab_scorchedstone", blockID("slabScorchedstone")));
        SLAB_BRICK_STEEL = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(4000.0f)
                .build(new SlabBlock(BRICK_STEEL, "bonusblocks:block/slab_brick_steel", blockID("slabBRICK_STEEL")));
        SLAB_BRICK_QUARTZ = slab
                .setHardness(3.0f)
                .build(new SlabBlock(BRICK_QUARTZ, "bonusblocks:block/slab_brick_quartz", blockID("slabBRICK_QUARTZ")));
        SLAB_BRICK_OLIVINE = slab
                .setHardness(3.0f)
                .build(new SlabBlock(BRICK_OLIVINE, "bonusblocks:block/slab_brick_olivine", blockID("slabBRICK_OLIVINE")));
        SLAB_BRICK_SILVER = slab
                .setHardness(0.8f)
                .setResistance(2.0f)
                .build(new SlabBlock(BRICK_SILVER, "bonusblocks:block/slab_brick_silver", blockID("slabBrickSilver")));
        SLAB_COPPER = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setTicking(true)
                .build(new CopperSlabBlock(BLOCK_COPPER, "bonusblocks:block/slab_copper", blockID("slabCopper")));


        // Stairs
        STAIRS_WOOL = stairs
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.8F)
                .setResistance(0.8F)
                .setBlockModel(BlockModelStairsWool::new)
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.NOT_IN_CREATIVE_MENU)
//                .setItemBlock(ItemBlockStairsWool::new)
                .build(new StairsBlock(WOOL, "bonusblocks:block/stairs_wool", blockID("STAIRS_WOOL")));
        STAIRS_COBBLESTONE_MOSSY = stairs
                .setHardness(2.0F)
                .build(new StairsBlock(COBBLE_STONE_MOSSY, "bonusblocks:block/stairs_cobble_stone_mossy", blockID("stairsCobbleStoneMossy")));
        STAIRS_BRICK_STONE_POLISHED_MOSSY = stairs
                .setHardness(2.0F)
                .build(new StairsBlock(BRICK_STONE_POLISHED_MOSSY, "bonusblocks:block/stairs_brick_stone_polished_mossy", blockID("stairsBrickStonePolishedMossy")));
        STAIRS_BRICK_GOLD = stairs
                .setHardness(3.0F)
                .build(new StairsBlock(BRICK_GOLD, "bonusblocks:block/stairs_brick_gold", blockID("stairsBrickGold")));
        STAIRS_BRICK_LAPIS = stairs
                .setHardness(3.0F)
                .build(new StairsBlock(BRICK_LAPIS, "bonusblocks:block/stairs_brick_lapis", blockID("stairsBrickLapis")));
        STAIRS_BRICK_IRON = stairs
                .setHardness(5.0F)
                .build(new StairsBlock(BRICK_IRON, "bonusblocks:block/stairs_brick_iron", blockID("stairsBrickIron")));
        STAIRS_BRICK_SCORCHEDSTONE = stairs
                .setHardness(0.8f)
                .build(new StairsBlock(BRICK_SCORCHEDSTONE, "bonusblocks:block/stairs_brick_scorchedstone", blockID("stairsBRICK_SCORCHEDSTONE")));
        STAIRS_BRICK_MUD = stairs
                .setHardness(1.5f)
                .build(new StairsBlock(BRICK_MUD, "bonusblocks:block/stairs_brick_mud", blockID("stairsBRICK_MUD")));
        STAIRS_BRICK_STEEL = stairs
                .setHardness(5.0f)
                .setResistance(4000.0f)
                .build(new StairsBlock(BRICK_STEEL, "bonusblocks:block/stairs_brick_steel", blockID("stairsBRICK_STEEL")));
        STAIRS_BRICK_QUARTZ = stairs
                .setHardness(3.0f)
                .build(new StairsBlock(BRICK_QUARTZ, "bonusblocks:block/stairs_brick_quartz", blockID("stairsBRICK_QUARTZ")));
        STAIRS_BRICK_OLIVINE = stairs
                .setHardness(3.0f)
                .build(new StairsBlock(BRICK_OLIVINE, "bonusblocks:block/stairs_brick_olivine", blockID("stairsBRICK_OLIVINE")));
        STAIRS_BRICK_SILVER = stairs
                .setHardness(0.8f)
                .setResistance(2.0f)
                .build(new StairsBlock(BRICK_SILVER, "bonusblocks:block/stairs_brick_silver", blockID("STAIRS_BRICK_SILVER")));
        STAIRS_COPPER = stairs
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setTicking(true)
                .build(new StairsBlock(BLOCK_COPPER, "bonusblocks:block/stairs_copper", blockID("STAIRS_COPPER")) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.STAIRS_COPPER.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });



        //2.2 New Stuff

        // Baked Clay Bricks
        BRICK_CLAY_BAKED = stone
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/brick_block_clay_baked"))
                .build(new Block("brick.clay.baked", "bonusblocks:block/brick_clay_baked", blockID("brickBLOCK_CLAY_BAKED"), Material.stone));

        SLAB_BRICK_CLAY_BAKED = slab
                .build(new SlabBlock(BRICK_CLAY_BAKED, "bonusblocks:block/slab_brick_clay_baked", blockID("slabBrickBLOCK_CLAY_BAKED")));

        STAIRS_BRICK_CLAY_BAKED = stairs
                .build(new StairsBlock(BRICK_CLAY_BAKED, "bonusblocks:block/stairs_brick_clay_baked", blockID("stairsBrickBLOCK_CLAY_BAKED")));

        // Rough Dirt
        DIRT_ROUGH = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.gravel", "step.gravel", 1.0f, 0.8f))
                .setHardness(0.6f)
                .setResistance(0.6f)
                .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.CAVES_CUT_THROUGH)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/dirt_rough"))
                .build(new Block("dirt.rough", "bonusblocks:block/dirt_rough", blockID("dirtRough"), Material.dirt));

        // Skull
        SKULL_CARVED_IDLE = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setBlockModel(block -> new HorizontalRotationBlockModel<>(block).withTextures("bonusblocks:block/skull_top", "bonusblocks:block/skull_bottom", "bonusblocks:block/skull_carved_idle", "bonusblocks:block/skull_side", "bonusblocks:block/skull_side", "bonusblocks:block/skull_side"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build(new RotatableBlock("skull.carved.idle", "bonusblocks:block/skull_carved_idle", blockID("skullCarved"), Material.stone) {
                });

        SKULL_CARVED_ACTIVE = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setLuminance(15)
                .setBlockModel(block -> new HorizontalRotationBlockModel<>(block).withTextures("bonusblocks:block/skull_top", "bonusblocks:block/skull_bottom", "bonusblocks:block/skull_carved_active", "bonusblocks:block/skull_side", "bonusblocks:block/skull_side", "bonusblocks:block/skull_side"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build(new RotatableBlock("skull.carved.active", "bonusblocks:block/skull_carved_active", blockID("skullActive"), Material.stone) {
                });

        SKULL = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setBlockModel(block -> new HorizontalRotationBlockModel<>(block).withTextures("bonusblocks:block/skull_top", "bonusblocks:block/skull_bottom", "bonusblocks:block/skull_side"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build(new RotatableBlock("skull", "bonusblocks:block/skull", blockID("skull"), Material.stone) {
                });


        // 2.3 New Stuff

        // Lazurite

        LAZURITE = stone
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/lazurite"))
                .build(new StoneBlock("lazurite", "bonusblocks:block/lazurite", blockID("lazurite"), () -> COBBLE_LAZURITE, Material.stone));

        COBBLE_LAZURITE = stone
                .setHardness(2.0f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/cobbled_lazurite"))
                .build(new Block("cobble.lazurite", "bonusblocks:block/cobble_lazurite", blockID("COBBLE_LAZURITE"), Material.stone));
        SLAB_COBBLE_LAZURITE = slab
                .setHardness(2.0F)
                .build(new SlabBlock(COBBLE_LAZURITE, "bonusblocks:block/slab_cobble_lazurite", blockID("SLAB_COBBLE_LAZURITE")));
        STAIRS_COBBLE_LAZURITE = stairs
                .setHardness(2.0F)
                .build(new StairsBlock(COBBLE_LAZURITE, "bonusblocks:block/stairs_cobble_lazurite", blockID("STAIRS_COBBLE_LAZURITE")));

        BRICK_LAZURITE = brick
                .setHardness(1.5f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/brick_lazurite"))
                .build(new Block("brick.lazurite", "bonusblocks:block/brick_lazurite", blockID("BRICK_LAZURITE"), Material.stone));
        SLAB_BRICK_LAZURITE = slab
                .setHardness(1.5f)
                .build(new SlabBlock(BRICK_LAZURITE, "bonusblocks:block/slab_brick_lazurite", blockID("SLAB_BRICK_LAZURITE")));
        STAIRS_BRICK_LAZURITE = stairs
                .setHardness(1.5f)
                .build(new StairsBlock(BRICK_LAZURITE, "bonusblocks:block/stairs_brick_lazurite", blockID("STAIRS_BRICK_LAZURITE")));

        LAZURITE_POLISHED = stone
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/polished_lazurite_top", "bonusblocks:block/polished_lazurite_side"))
                .build(new Block("lazurite.polished", "bonusblocks:block/lazurite_polished", blockID("LAZURITE_POLISHED"), Material.stone));
        LAZURITE_CARVED = stone
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/polished_lazurite_top", "bonusblocks:block/carved_lazurite"))
                .build(new Block("lazurite.carved", "bonusblocks:block/lazurite_carved", blockID("LAZURITE_CARVED"), Material.stone));
        SLAB_LAZURITE_POLISHED = slab
                .build(new SlabBlock(LAZURITE_CARVED, "bonusblocks:block/slab_lazurite_polished", blockID("SLAB_LAZURITE_POLISHED")));


        // PERIDOT

        PERIDOT = stone
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/peridot"))
                .build(new StoneBlock("peridot", "bonusblocks:block/peridot", blockID("peridot"), () -> COBBLE_PERIDOT, Material.stone));

        COBBLE_PERIDOT = stone
                .setHardness(2.0f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/cobbled_peridot"))
                .build(new Block("cobble.peridot", "bonusblocks:block/cobble_peridot", blockID("COBBLE_PERIDOT"), Material.stone));
        SLAB_COBBLE_PERIDOT = slab
                .setHardness(2.0F)
                .build(new SlabBlock(COBBLE_PERIDOT, "bonusblocks:block/slab_cobble_peridot", blockID("SLAB_COBBLE_PERIDOT")));
        STAIRS_COBBLE_PERIDOT = stairs
                .setHardness(2.0F)
                .build(new StairsBlock(COBBLE_PERIDOT, "bonusblocks:block/stairs_cobble_peridot", blockID("STAIRS_COBBLE_PERIDOT")));

        BRICK_PERIDOT = brick
                .setHardness(1.5f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/brick_peridot"))
                .build(new Block("brick.peridot", "bonusblocks:block/brick_peridot", blockID("BRICK_PERIDOT"), Material.stone));
        SLAB_BRICK_PERIDOT = slab
                .setHardness(1.5f)
                .build(new SlabBlock(BRICK_PERIDOT, "bonusblocks:block/slab_brick_peridot", blockID("SLAB_BRICK_PERIDOT")));
        STAIRS_BRICK_PERIDOT = stairs
                .setHardness(1.5f)
                .build(new StairsBlock(BRICK_PERIDOT, "bonusblocks:block/stairs_brick_peridot", blockID("STAIRS_BRICK_PERIDOT")));

        PERIDOT_POLISHED = stone
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/polished_peridot_top", "bonusblocks:block/polished_peridot_side"))
                .build(new Block("peridot.polished", "bonusblocks:block/peridot_polished", blockID("PERIDOT_POLISHED"), Material.stone));
        PERIDOT_CARVED = stone
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/polished_peridot_top", "bonusblocks:block/carved_peridot"))
                .build(new Block("peridot.carved", "bonusblocks:block/peridot_carved", blockID("PERIDOT_CARVED"), Material.stone));
        SLAB_PERIDOT_POLISHED = slab
                .build(new SlabBlock(PERIDOT_CARVED, "bonusblocks:block/slab_peridot_polished", blockID("SLAB_PERIDOT_POLISHED")));

        // Pot

        POT = new BlockBuilder(MOD_ID)
                .setHardness(0.5f)
                .setResistance(1.0f)
                .setIcon("bonusblocks:item/pot")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
//                .setBlockModel(block -> new DFBlockModelBuilder(MOD_ID).setBlockModel("block/pot.json").setRender3D(false).build(POT))
                .build(new BlockPot("pot", "bonusblocks:block/pot", blockID("pot"), Material.stone));


        //2.4 New Stuff

        GIRDER_IRON = raw
                .setVisualUpdateOnMetadata()
                .setIcon("bonusblocks:block/girder_iron")
//                .setBlockModel(block -> new DFBlockModelBuilder(MOD_ID).setBlockModel("block/girder.json").setBlockState(MOD_ID, "girder_states.json").setMetaStateInterpreter(new PipeMetaStateInterpreter()).setRender3D(false).build(GIRDER_IRON))
                .build(new BlockGirder("girder.iron", "bonusblocks:block/girder_iron", blockID("GIRDER_IRON"), Material.metal));

        FENCE_GOLD = raw
                .setBlockModel(block -> new FenceThinBlockModel<>(block, TextureRegistry.getTexture("bonusblocks:block/fence_gold_center"), null, TextureRegistry.getTexture("bonusblocks:block/fence_gold_top"), TextureRegistry.getTexture("bonusblocks:block/fence_gold_column")).withTextures("bonusblocks:block/fence_gold_center"))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceNoClimb("fence.gold", "bonusblocks:block/fence_gold", blockID("FENCE_GOLD"), Material.metal));





        //3.0 New Stuff


        STAIRS_SCORCHEDSTONE = stairs
                .setHardness(0.8F)
                .build(new StairsBlock(SCORCHEDSTONE, "bonusblocks:block/stairs_scorchedstone", blockID("STAIRS_SCORCHEDSTONE")));


        DOOR_GLASS_OBSIDIAN_BOTTOM = obsidian
                .setBlockModel(block -> new GlassDoorBlockModel<>(block).withTextures("bonusblocks:block/door_glass_obsidian_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new ObsidianGlassDoorBlock("door.glass.obsidian.bottom", "bonusblocks:block/door_glass_obsidian_bottom", blockID("DOOR_GLASS_OBSIDIAN_BOTTOM"), true, () -> BonusItems.DOOR_GLASS_OBSIDIAN));
        DOOR_GLASS_OBSIDIAN_TOP = obsidian
                .setBlockModel(block -> new GlassDoorBlockModel<>(block).withTextures("bonusblocks:block/door_glass_obsidian_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new ObsidianGlassDoorBlock("door.glass.obsidian.top", "bonusblocks:block/door_glass_obsidian_top", blockID("DOOR_GLASS_OBSIDIAN_TOP"), true, () -> BonusItems.DOOR_GLASS_OBSIDIAN));


        TATAMI = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 0.8f, 1.2f))
                .setHardness(0.6f)
                .setResistance(0.6f)
                .setBlockModel(block -> new StandardBlockModel<>(block).withTextures("bonusblocks:block/tatami"))
                .setFlammability(20, 40)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
                .build(new Block("TATAMI", "bonusblocks:block/tatami", blockID("TATAMI"), Material.grass));



        //3.1 NEW STUFF
        FENCE_STEEL = raw
                .setBlockModel(block -> new FenceThinBlockModel<>(block, TextureRegistry.getTexture("bonusblocks:block/fence_steel_center"), null, TextureRegistry.getTexture("bonusblocks:block/fence_steel_top"), TextureRegistry.getTexture("bonusblocks:block/fence_steel_column")).withTextures("bonusblocks:block/fence_steel_center"))
                .setVisualUpdateOnMetadata()
                .setHardness(5.0f)
                .setResistance(4000.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceNoClimb("fence.steel", "bonusblocks:block/fence_steel", blockID("FENCE_STEEL"), Material.metal));





        //3.2 NEW STUFF

        DOOR_STONE_BOTTOM = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_stone_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.stone.bottom", "bonusblocks:block/door_stone_bottom", blockID("door_stone_bottom"), false, () -> BonusItems.DOOR_STONE));
        DOOR_STONE_TOP = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_stone_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.stone.top", "bonusblocks:block/door_stone_top", blockID("door_stone_top"), true, () -> BonusItems.DOOR_STONE));

        DOOR_BASALT_BOTTOM = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_basalt_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.basalt.bottom", "bonusblocks:block/door_basalt_bottom", blockID("door_basalt_bottom"), false, () -> BonusItems.DOOR_BASALT));
        DOOR_BASALT_TOP = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_basalt_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.basalt.top", "bonusblocks:block/door_basalt_top", blockID("door_basalt_top"), true, () -> BonusItems.DOOR_BASALT));

        DOOR_LIMESTONE_BOTTOM = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_limestone_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.limestone.bottom", "bonusblocks:block/door_limestone_bottom", blockID("door_limestone_bottom"), false, () -> BonusItems.DOOR_LIMESTONE));
        DOOR_LIMESTONE_TOP = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_limestone_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.limestone.top", "bonusblocks:block/door_limestone_top", blockID("door_limestone_top"), true, () -> BonusItems.DOOR_LIMESTONE));

        DOOR_GRANITE_BOTTOM = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_granite_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.granite.bottom", "bonusblocks:block/door_granite_bottom", blockID("door_granite_bottom"), false, () -> BonusItems.DOOR_GRANITE));
        DOOR_GRANITE_TOP = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_granite_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.granite.top", "bonusblocks:block/door_granite_top", blockID("door_granite_top"), true, () -> BonusItems.DOOR_GRANITE));

        DOOR_MARBLE_BOTTOM = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_marble_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .setHardness(1.0f)
                .build(new BlockStoneDoor("door.marble.bottom", "bonusblocks:block/door_marble_bottom", blockID("door_marble_bottom"), false, () -> BonusItems.DOOR_MARBLE));
        DOOR_MARBLE_TOP = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_marble_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .setHardness(1.0f)
                .build(new BlockStoneDoor("door.marble.top", "bonusblocks:block/door_marble_top", blockID("door_marble_top"), true, () -> BonusItems.DOOR_MARBLE));

        DOOR_SLATE_BOTTOM = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_slate_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.slate.bottom", "bonusblocks:block/door_slate_bottom", blockID("door_slate_bottom"), false, () -> BonusItems.DOOR_SLATE));
        DOOR_SLATE_TOP = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_slate_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.slate.top", "bonusblocks:block/door_slate_top", blockID("door_slate_top"), true, () -> BonusItems.DOOR_SLATE));

        DOOR_PERMAFROST_BOTTOM = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_permafrost_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.permafrost.bottom", "bonusblocks:block/door_permafrost_bottom", blockID("door_permafrost_bottom"), false, () -> BonusItems.DOOR_PERMAFROST));
        DOOR_PERMAFROST_TOP = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_permafrost_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.permafrost.top", "bonusblocks:block/door_permafrost_top", blockID("door_permafrost_top"), true, () -> BonusItems.DOOR_PERMAFROST));

        DOOR_NETHERRACK_BOTTOM = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_netherrack_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.netherrack.bottom", "bonusblocks:block/door_netherrack_bottom", blockID("door_netherrack_bottom"), false, () -> BonusItems.DOOR_NETHERRACK));
        DOOR_NETHERRACK_TOP = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_netherrack_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.netherrack.top", "bonusblocks:block/door_netherrack_top", blockID("door_netherrack_top"), true, () -> BonusItems.DOOR_NETHERRACK));

        DOOR_LAZURITE_BOTTOM = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_lazurite_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.lazurite.bottom", "bonusblocks:block/door_lazurite_bottom", blockID("door_lazurite_bottom"), false, () -> BonusItems.DOOR_LAZURITE));
        DOOR_LAZURITE_TOP = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_lazurite_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.lazurite.top", "bonusblocks:block/door_lazurite_top", blockID("door_lazurite_top"), true, () -> BonusItems.DOOR_LAZURITE));


        DOOR_PERIDOT_BOTTOM = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_peridot_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.peridot.bottom", "bonusblocks:block/door_peridot_bottom", blockID("door_peridot_bottom"), false, () -> BonusItems.DOOR_PERIDOT));
        DOOR_PERIDOT_TOP = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_peridot_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.peridot.top", "bonusblocks:block/door_peridot_top", blockID("door_peridot_top"), true, () -> BonusItems.DOOR_PERIDOT));


        TRAPDOOR_STONE = stone
                .setBlockModel(block -> new TrapDoorBlockModel<>(block).withTextures("bonusblocks:block/trapdoor_stone_top", "bonusblocks:block/trapdoor_stone_side"))
                .setVisualUpdateOnMetadata()
                .build(new TrapDoorBlockStone("trapdoor.stone", "bonusblocks:block/trapdoor_stone", blockID("TRAPDOOR_STONE"), Material.stone));

        TRAPDOOR_BASALT = stone
                .setBlockModel(block -> new TrapDoorBlockModel<>(block).withTextures("bonusblocks:block/trapdoor_basalt_top", "bonusblocks:block/trapdoor_basalt_side"))
                .setVisualUpdateOnMetadata()
                .build(new TrapDoorBlockStone("trapdoor.basalt", "bonusblocks:block/trapdoor_basalt", blockID("TRAPDOOR_BASALT"), Material.stone));

        TRAPDOOR_LIMESTONE = stone
                .setBlockModel(block -> new TrapDoorBlockModel<>(block).withTextures("bonusblocks:block/trapdoor_limestone_top", "bonusblocks:block/trapdoor_limestone_side"))
                .setVisualUpdateOnMetadata()
                .build(new TrapDoorBlockStone("trapdoor.limestone", "bonusblocks:block/trapdoor_limestone", blockID("TRAPDOOR_LIMESTONE"), Material.stone));

        TRAPDOOR_GRANITE = stone
                .setBlockModel(block -> new TrapDoorBlockModel<>(block).withTextures("bonusblocks:block/trapdoor_granite_top", "bonusblocks:block/trapdoor_granite_side"))
                .setVisualUpdateOnMetadata()
                .build(new TrapDoorBlockStone("trapdoor.granite", "bonusblocks:block/trapdoor_granite", blockID("TRAPDOOR_GRANITE"), Material.stone));

        TRAPDOOR_PERMAFROST = stone
                .setBlockModel(block -> new TrapDoorBlockModel<>(block).withTextures("bonusblocks:block/trapdoor_permafrost_top", "bonusblocks:block/trapdoor_permafrost_side"))
                .setVisualUpdateOnMetadata()
                .build(new TrapDoorBlockStone("trapdoor.permafrost", "bonusblocks:block/trapdoor_permafrost", blockID("TRAPDOOR_PERMAFROST"), Material.stone));

        TRAPDOOR_MARBLE = stone
                .setBlockModel(block -> new TrapDoorBlockModel<>(block).withTextures("bonusblocks:block/trapdoor_marble_top", "bonusblocks:block/trapdoor_marble_side"))
                .setVisualUpdateOnMetadata()
                .build(new TrapDoorBlockStone("trapdoor.marble", "bonusblocks:block/trapdoor_marble", blockID("TRAPDOOR_MARBLE"), Material.stone));

        TRAPDOOR_SLATE = stone
                .setBlockModel(block -> new TrapDoorBlockModel<>(block).withTextures("bonusblocks:block/trapdoor_slate_top", "bonusblocks:block/trapdoor_slate_side"))
                .setVisualUpdateOnMetadata()
                .build(new TrapDoorBlockStone("trapdoor.slate", "bonusblocks:block/trapdoor_slate", blockID("TRAPDOOR_SLATE"), Material.stone));

        TRAPDOOR_NETHERRACK = stone
                .setBlockModel(block -> new TrapDoorBlockModel<>(block).withTextures("bonusblocks:block/trapdoor_netherrack_top", "bonusblocks:block/trapdoor_netherrack_side"))
                .setVisualUpdateOnMetadata()
                .build(new TrapDoorBlockStone("trapdoor.netherrack", "bonusblocks:block/trapdoor_netherrack", blockID("TRAPDOOR_NETHERRACK"), Material.stone));

        TRAPDOOR_LAZURITE = stone
                .setBlockModel(block -> new TrapDoorBlockModel<>(block).withTextures("bonusblocks:block/trapdoor_lazurite_top", "bonusblocks:block/trapdoor_lazurite_side"))
                .setVisualUpdateOnMetadata()
                .build(new TrapDoorBlockStone("trapdoor.lazurite", "bonusblocks:block/trapdoor_lazurite", blockID("TRAPDOOR_LAZURITE"), Material.stone));

        TRAPDOOR_PERIDOT = stone
                .setBlockModel(block -> new TrapDoorBlockModel<>(block).withTextures("bonusblocks:block/trapdoor_peridot_top", "bonusblocks:block/trapdoor_peridot_side"))
                .setVisualUpdateOnMetadata()
                .build(new TrapDoorBlockStone("trapdoor.peridot", "bonusblocks:block/trapdoor_peridot", blockID("TRAPDOOR_PERIDOT"), Material.stone));


        BEDROLL = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setBlockModel(BlockModelBedroll::new)
                .setHardness(0.2f)
                .setResistance(0.2f)
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_AXE)
                .build(new BlockBedroll("bedroll", "bonusblocks:block/bedroll", blockID("bedroll"), Material.cloth));

    }
}
