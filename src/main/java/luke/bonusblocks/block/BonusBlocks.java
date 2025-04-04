package luke.bonusblocks.block;

import luke.bonusblocks.block.blockmodel.*;
import luke.bonusblocks.block.copper.BlockLogicDoorCopper;
import luke.bonusblocks.block.copper.BlockLogicFenceCopper;
import luke.bonusblocks.block.copper.BlockLogicOreCopper;
import luke.bonusblocks.block.copper.CopperPressurePlateBlock;
import luke.bonusblocks.block.silver.BlockLogicBedSilver;
import luke.bonusblocks.block.silver.BlockLogicOreSilver;
import luke.bonusblocks.block.silver.BlockLogicSeatSilver;
import luke.bonusblocks.item.BonusItems;
import net.minecraft.client.render.block.color.BlockColorLeavesOak;
import net.minecraft.client.render.block.color.BlockColorTallGrass;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.colorizer.Colorizers;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.entity.EntityItem;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.CreativeHelper;

import java.util.Objects;
import java.util.Random;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;
import static net.minecraft.core.block.BlockLogicMoss.stoneToMossMap;
import static net.minecraft.core.block.Blocks.*;
import static net.minecraft.core.item.tool.ItemToolPickaxe.miningLevels;

public class BonusBlocks {

    int blockID = 1500;
    int stairBlockID = 5;
    int slabBlockID = 5;



    //LOGS, LEAVES, SAPLINGS
    public static Block<?>  BRANCH;
    public static Block<BlockLogicLeavesOakMossy> LEAVES_OAK_MOSSY;
    public static Block<BlockLogicLeavesBase> LEAVES_JACARANDA;

    public static Block<BlockSaplingMossyOak> SAPLING_OAK_MOSSY;
    public static Block<BlockSaplingJacaranda> SAPLING_JACARANDA;

    public static Block<BlockLogicLog> LOG_SHRUB;
    public static Block<BlockLogicLog> LOG_CACAO;
    public static Block<BlockLogicLog> LOG_JACARANDA;
    public static Block<BlockLogicLog> LOG_SCORCHED;


    //PETALS, PETAL LAYERS
    public static Block<BlockLogicPetal> PETAL_YELLOW;
    public static Block<BlockLogicPetal> PETAL_RED;
    public static Block<BlockLogicPetal> PETAL_CYAN;
    public static Block<BlockLogicPetal> PETAL_PURPLE;
    public static Block<BlockLogicPetal> PETAL_PINK;
    public static Block<BlockLogicPetal> PETAL_SILVER;
    public static Block<BlockLogicPetal> PETAL_ORANGE;
    public static Block<BlockLogicPetal> PETAL_LIGHT_BLUE;
    public static Block<BlockLogicPetal> PETAL_MAGENTA;
    public static Block<BlockLogicPetal> PETAL_LIME;

    public static Block<BlockLogicLayerPetal> PETAL_LAYER_YELLOW;
    public static Block<BlockLogicLayerPetal> PETAL_LAYER_RED;
    public static Block<BlockLogicLayerPetal> PETAL_LAYER_CYAN;
    public static Block<BlockLogicLayerPetal> PETAL_LAYER_PURPLE;
    public static Block<BlockLogicLayerPetal> PETAL_LAYER_PINK;
    public static Block<BlockLogicLayerPetal> PETAL_LAYER_SILVER;
    public static Block<BlockLogicLayerPetal> PETAL_LAYER_ORANGE;
    public static Block<BlockLogicLayerPetal> PETAL_LAYER_LIGHT_BLUE;
    public static Block<BlockLogicLayerPetal> PETAL_LAYER_MAGENTA;
    public static Block<BlockLogicLayerPetal> PETAL_LAYER_LIME;


    //COMPACT BLOCKS
    public static Block<?>  BLOCK_BONE;
    public static Block<?>  BLOCK_CLOTH;
    public static Block<?>  BLOCK_SLIME;
    public static Block<?>  BLOCK_SULPHUR;
    public static Block<?>  BLOCK_SUGAR;
    public static Block<BlockLogic> BLOCK_LEATHER;
    public static Block<BlockLogic> BLOCK_WICKER;
    public static Block<BlockLogic> BLOCK_FLINT;
    public static Block<BlockLogic> BLOCK_CRUDE_STEEL;
    public static Block<BlockLogic> BLOCK_COPPER;
    public static Block<BlockLogic> BLOCK_SILVER;
    public static Block<BlockLogic> BLOCK_RAW_GOLD;
    public static Block<BlockLogic> BLOCK_RAW_IRON;
    public static Block<BlockLogic> BLOCK_RAW_COPPER;
    public static Block<BlockLogic> BLOCK_RAW_SILVER;

    //ORES
    public static Block<BlockLogicOreCopper> ORE_COPPER_STONE;
    public static Block<BlockLogicOreCopper> ORE_COPPER_BASALT;
    public static Block<BlockLogicOreCopper> ORE_COPPER_LIMESTONE;
    public static Block<BlockLogicOreCopper> ORE_COPPER_GRANITE;
    public static Block<BlockLogicOreCopper> ORE_COPPER_PERMAFROST;

    public static Block<BlockLogicOreSilver> ORE_SILVER_STONE;
    public static Block<BlockLogicOreSilver> ORE_SILVER_BASALT;
    public static Block<BlockLogicOreSilver> ORE_SILVER_LIMESTONE;
    public static Block<BlockLogicOreSilver> ORE_SILVER_GRANITE;
    public static Block<BlockLogicOreSilver> ORE_SILVER_PERMAFROST;

    //STAIRS
    public static Block<BlockLogicStairs> STAIRS_WOOL;
    public static Block<BlockLogicStairs> STAIRS_COBBLESTONE_MOSSY;
    public static Block<BlockLogicStairs> STAIRS_BRICK_STONE_POLISHED_MOSSY;
    public static Block<BlockLogicStairs> STAIRS_BRICK_SCORCHEDSTONE;
    public static Block<BlockLogicStairs> STAIRS_BRICK_MUD;
    public static Block<BlockLogicStairs> STAIRS_SCORCHEDSTONE;
    public static Block<BlockLogicStairs> STAIRS_BRICK_QUARTZ;
    public static Block<BlockLogicStairs> STAIRS_BRICK_OLIVINE;
    public static Block<BlockLogicStairs> STAIRS_BRICK_SILVER;
    public static Block<BlockLogicStairs> STAIRS_COPPER;
    public static Block<BlockLogicStairs> STAIRS_BRICK_CLAY_BAKED;
    public static Block<BlockLogicStairs> STAIRS_COBBLE_LAZURITE;
    public static Block<BlockLogicStairs> STAIRS_BRICK_LAZURITE;
    public static Block<BlockLogicStairs> STAIRS_COBBLE_PERIDOT;
    public static Block<BlockLogicStairs> STAIRS_BRICK_PERIDOT;

    //SLABS
    public static Block<BlockLogicSlab> SLAB_WOOL;
    public static Block<BlockLogicSlab> SLAB_COBBLESTONE_MOSSY;
    public static Block<BlockLogicSlab> SLAB_SLATE_POLISHED;
    public static Block<BlockLogicSlab> SLAB_MARBLE_POLISHED;
    public static Block<BlockLogicSlab> SLAB_BRICK_STONE_POLISHED_MOSSY;
    public static Block<BlockLogicSlab> SLAB_BRICK_SCORCHEDSTONE;
    public static Block<BlockLogicSlab> SLAB_BRICK_MUD;
    public static Block<BlockLogicSlab> SLAB_SCORCHEDSTONE;
    public static Block<BlockLogicSlab> SLAB_BRICK_QUARTZ;
    public static Block<BlockLogicSlab> SLAB_BRICK_OLIVINE;
    public static Block<BlockLogicSlab> SLAB_BRICK_SILVER;
    public static Block<BlockLogicSlab> SLAB_COPPER;
    public static Block<BlockLogicSlab> SLAB_BRICK_CLAY_BAKED;
    public static Block<BlockLogicSlab> SLAB_COBBLE_LAZURITE;
    public static Block<BlockLogicSlab> SLAB_BRICK_LAZURITE;
    public static Block<BlockLogicSlab> SLAB_LAZURITE_POLISHED;
    public static Block<BlockLogicSlab> SLAB_COBBLE_PERIDOT;
    public static Block<BlockLogicSlab> SLAB_BRICK_PERIDOT;
    public static Block<BlockLogicSlab> SLAB_PERIDOT_POLISHED;

    //TRAPDOORS
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_STONE;
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_BASALT;
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_LIMESTONE;
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_GRANITE;
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_MARBLE;
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_SLATE;
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_PERMAFROST;
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_NETHERRACK;
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_LAZURITE;
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_PERIDOT;
    public static Block<BlockLogicTrapDoor>  TRAPDOOR_COPPER;
    public static Block<BlockLogicTrapDoor>  TRAPDOOR_SILVER;
    public static Block<BlockLogicTrapDoor>  TRAPDOOR_GLASS_OBSIDIAN;

    //DOORS
    public static Block<BlockLogicDoor> DOOR_STONE_BOTTOM;
    public static Block<BlockLogicDoor> DOOR_STONE_TOP;
    public static Block<BlockLogicDoor> DOOR_BASALT_BOTTOM;
    public static Block<BlockLogicDoor> DOOR_BASALT_TOP;
    public static Block<BlockLogicDoor> DOOR_LIMESTONE_BOTTOM;
    public static Block<BlockLogicDoor> DOOR_LIMESTONE_TOP;
    public static Block<BlockLogicDoor> DOOR_GRANITE_BOTTOM;
    public static Block<BlockLogicDoor> DOOR_GRANITE_TOP;
    public static Block<BlockLogicDoor> DOOR_MARBLE_BOTTOM;
    public static Block<BlockLogicDoor> DOOR_MARBLE_TOP;
    public static Block<BlockLogicDoor> DOOR_SLATE_BOTTOM;
    public static Block<BlockLogicDoor> DOOR_SLATE_TOP;
    public static Block<BlockLogicDoor> DOOR_PERMAFROST_BOTTOM;
    public static Block<BlockLogicDoor> DOOR_PERMAFROST_TOP;
    public static Block<BlockLogicDoor> DOOR_NETHERRACK_BOTTOM;
    public static Block<BlockLogicDoor> DOOR_NETHERRACK_TOP;
    public static Block<BlockLogicDoor> DOOR_LAZURITE_BOTTOM;
    public static Block<BlockLogicDoor> DOOR_LAZURITE_TOP;
    public static Block<BlockLogicDoor> DOOR_PERIDOT_BOTTOM;
    public static Block<BlockLogicDoor> DOOR_PERIDOT_TOP;
    public static Block<BlockLogicDoor>  DOOR_GLASS_OBSIDIAN_BOTTOM;
    public static Block<BlockLogicDoor>  DOOR_GLASS_OBSIDIAN_TOP;
    public static Block<BlockLogicDoor>  DOOR_COPPER_TOP;
    public static Block<BlockLogicDoor>  DOOR_COPPER_BOTTOM;
    public static Block<BlockLogicDoor>  DOOR_SILVER_TOP;
    public static Block<BlockLogicDoor>  DOOR_SILVER_BOTTOM;


    public static Block<BlockLogic> BOX;

    public static Block<?>  CRATE;
    public static Block<?>  CRATE_PAINTED;

    public static Block<BlockLogic> BOOKSHELF_EMPTY_PLANKS_OAK;

    public static Block<BlockMossy> MOSS;

    public static Block<BlockLogic> GRASS_OVERGROWN;
    public static Block<BlockLogic> GRASS_RETRO_OVERGROWN;
    public static Block<BlockLogic> GRASS_SCORCHED_OVERGROWN;
    public static Block<BlockLogic> PATH_DIRT_OVERGROWN;

    public static Block<BlockLogicFlower> FLOWER_SILVER;
    public static Block<BlockLogicFlower> FLOWER_CYAN;
    public static Block<BlockLogicFlower> FLOWER_MAGENTA;
    public static Block<BlockLogicFlower> FLOWER_LIME;

    public static Block<?>  MUSHROOM_GRAY;

    public static Block<BlockLogic> FUNGI_RED;
    public static Block<BlockLogic> FUNGI_BROWN;
    public static Block<BlockLogic> FUNGI_GRAY;

    public static Block<?>  OVERLAY_RAW_GOLD;
    public static Block<?>  OVERLAY_RAW_IRON;
    public static Block<?>  OVERLAY_RAW_COPPER;
    public static Block<?>  OVERLAY_RAW_SILVER;

    public static Block<BlockLogicTransparent> MESH_COPPER;

    public static Block<?>  PIPE_COPPER;

    public static Block<?>  FENCE_COPPER;
    public static Block<?>  FENCE_SILVER;

    public static Block<?>  PRESSURE_PLATE_COPPER;

    public static Block<?>  CHANDELIER_SILVER;

    public static Block<?>  CANDELABRA_SILVER;

    public static Block<?>  LANTERN_SILVER;

    public static Block<?>  VASE_SILVER;

    public static Block<?>  VANE_SILVER;

    public static Block<?>  CHIMES_SILVER;

    public static Block<?>  BED_SILVER;

    public static Block<?>  SEAT_SILVER;

    public static Block<BlockLogic> SCORCHEDSTONE;

    public static Block<?>  PILLAR_SLATE;
    public static Block<?>  CAPSTONE_SLATE;

    public static Block<BlockLogic> MARBLE_POLISHED;

    public static Block<BlockLogic> SLATE_CARVED;
    public static Block<BlockLogic> MARBLE_CARVED;

    public static Block<BlockLogic> BLOCK_CLAY_BAKED;

    public static Block<?>  GLASS_OBSIDIAN;
    public static Block<?>  GLASS_QUARTZ;

    public static Block<BlockLogic> BRICK_SCORCHEDSTONE;
    public static Block<BlockLogic> BRICK_MUD;
    public static Block<BlockLogic> BRICK_QUARTZ;
    public static Block<BlockLogic> BRICK_OLIVINE;
    public static Block<BlockLogic> BRICK_SILVER;

    public static Block<?>  CANDLE_SOULWAX;

    public static Block<BlockLogic> BRICK_CLAY_BAKED;

    public static Block<BlockLogic> DIRT_ROUGH;

    public static Block<?>  SKULL;
    public static Block<?>  SKULL_CARVED_IDLE;
    public static Block<?>  SKULL_CARVED_ACTIVE;
    public static Block<?>  SKULL_REDSTONE;

    public static Block<BlockLogicStone> LAZURITE;
    public static Block<BlockLogic> COBBLE_LAZURITE;
    public static Block<BlockLogic> BRICK_LAZURITE;
    public static Block<BlockLogic> LAZURITE_POLISHED;
    public static Block<BlockLogic> LAZURITE_CARVED;

    public static Block<BlockLogicStone> PERIDOT;
    public static Block<BlockLogic> COBBLE_PERIDOT;
    public static Block<BlockLogic> BRICK_PERIDOT;
    public static Block<BlockLogic> PERIDOT_POLISHED;
    public static Block<BlockLogic> PERIDOT_CARVED;

    public static Block<?>  POT;

    public static Block<?>  GIRDER_IRON;
    public static Block<?>  FENCE_GOLD;

    public static Block<BlockLogic> TATAMI;

    public static Block<?>  FENCE_STEEL;

    public static Block<?>  BEDROLL;


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


        miningLevels.put(BLOCK_RAW_GOLD, 2);
        miningLevels.put(FENCE_GOLD, 2);
        miningLevels.put(BRICK_STEEL, 2);
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


        //itemsList[CRATE_PAINTED.id()] = new ItemBlockPainted(CRATE_PAINTED, false);

        stoneToMossMap.put(SAPLING_OAK, BonusBlocks.SAPLING_OAK_MOSSY);
        stoneToMossMap.put(MOSS_STONE, BonusBlocks.MOSS);
        stoneToMossMap.put(MOSS_BASALT, BonusBlocks.MOSS);
        stoneToMossMap.put(MOSS_LIMESTONE, BonusBlocks.MOSS);
        stoneToMossMap.put(MOSS_GRANITE, BonusBlocks.MOSS);

        LookupFuelFurnace.instance.addFuelEntry(LOG_JACARANDA.id(), 300);
        LookupFuelFurnace.instance.addFuelEntry(LOG_SCORCHED.id(), 300);
        LookupFuelFurnace.instance.addFuelEntry(LOG_CACAO.id(), 300);
        LookupFuelFurnace.instance.addFuelEntry(LOG_SHRUB.id(), 300);

        LookupFuelFurnace.instance.addFuelEntry(BOX.id(), 300);
        LookupFuelFurnace.instance.addFuelEntry(CRATE.id(), 300);
        LookupFuelFurnace.instance.addFuelEntry(CRATE_PAINTED.id(), 300);
        LookupFuelFurnace.instance.addFuelEntry(BOOKSHELF_EMPTY_PLANKS_OAK.id(), 300);
        LookupFuelFurnace.instance.addFuelEntry(BRANCH.id(), 300);
        LookupFuelFurnace.instance.addFuelEntry(SAPLING_JACARANDA.id(), 100);
        LookupFuelFurnace.instance.addFuelEntry(SAPLING_OAK_MOSSY.id(), 100);

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
        CreativeHelper.setParent(SLAB_SCORCHEDSTONE, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_SCORCHEDSTONE, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_MUD, SLAB_BASALT_POLISHED);
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
        CreativeHelper.setParent(STAIRS_SCORCHEDSTONE, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_SCORCHEDSTONE, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_MUD, STAIRS_BRICK_STONE);
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
                .setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR);

        BlockBuilder log = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
                .setHardness(2.0F)
                .setResistance(1.0f)
                .setFlammability(5, 5)
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
                .setTags(BlockTags.MINEABLE_BY_PICKAXE);

        BlockBuilder stairs = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
                .setHardness(1.0f)
                .setResistance(10.0f)
                .setUseInternalLight()
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE);



        /// Blocks

        // Box
        BOX = boxes
                .build("box", "bonusblocks:block/box", blockID++, b -> new BlockLogic(b, Material.wood));


        // Crates
        CRATE = crates
                .build("crate", "bonusblocks:block/crate", blockID++, b -> new BlockLogic(b, Material.wood));

        CRATE_PAINTED = crates
                .setBlockItem(block -> new ItemBlockPainted<>(block, false))
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT, BlockTags.NOT_IN_CREATIVE_MENU)
                .build("crate.painted", "bonusblocks:block/crate_painted", blockID++, b -> new BlockPaintedCrate(b));


        // Bookshelf
        BOOKSHELF_EMPTY_PLANKS_OAK = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 0.8f))
                .setHardness(1.5f)
                .setResistance(1.0f)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
                .setFlammability(30, 20)
                .build("bookshelf.empty.planks.oak", "bonusblocks:block/bookshelf_empty_planks_oak", blockID++, b -> new BlockLogic(b, Material.wood));

        // Leaves and Branch
        BRANCH = leaves
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 0.5f))
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
                .build("branch", "bonusblocks:block/branch", blockID++, b -> new BlockBranch(b, Material.leaves));

        LEAVES_OAK_MOSSY = leaves
                .build("leaves.oak.mossy", "bonusblocks:block/leaves_oak_mossy", blockID++, BlockLogicLeavesOakMossy::new);

        LEAVES_JACARANDA = leaves
                .build("leaves.jacaranda", "bonusblocks:block/leaves_jacaranda", blockID++, block -> new BlockLogicLeavesBase(block, Material.leaves, SAPLING_JACARANDA));


        // Saplings
        SAPLING_JACARANDA = sapling
                .build("sapling.jacaranda", "bonusblocks:block/sapling_jacaranda", blockID++, BlockSaplingJacaranda::new);
        SAPLING_OAK_MOSSY = sapling
                .build("sapling.oak.mossy", "bonusblocks:block/sapling_oak_mossy", blockID++, BlockSaplingMossyOak::new);


        // Logs
        LOG_SHRUB = log
                .setSideTextures("bonusblocks:block/log_shrub_side")
                .setTopBottomTextures("bonusblocks:block/log_shrub_top")
                .build("log.shrub", "bonusblocks:block/log_shrub", blockID++, BlockLogicLog::new);
        LOG_CACAO = log
                .setSideTextures("bonusblocks:block/log_cacao_side")
                .setTopBottomTextures("bonusblocks:block/log_cacao_top")
                .build("log.cacao", "bonusblocks:block/log_cacao", blockID++, BlockLogicLog::new);
        LOG_JACARANDA = log
                .setSideTextures("bonusblocks:block/log_jacaranda_side")
                .setTopBottomTextures("bonusblocks:block/log_jacaranda_top")
                .build("log.jacaranda", "bonusblocks:block/log_jacaranda", blockID++, BlockLogicLog::new);
        LOG_SCORCHED = log
                .setSideTextures("bonusblocks:block/log_scorched_side")
                .setTopBottomTextures("bonusblocks:block/log_scorched_top")
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.2f))
                .setHardness(1.8f)
                .build("log.scorched", "bonusblocks:block/log_scorched", blockID++, BlockLogicLog::new);


        // Moss
        MOSS = grass
                .setTextures("bonusblocks:block/moss")
                .setFlammability(100, 30)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
                .build("moss", "bonusblocks:block/moss", blockID++, b -> new BlockMossy(b, Material.moss));


        // Overgrown Grass
        GRASS_OVERGROWN = grass
                .setTextures("minecraft:block/grass_top")
                .setBlockColor(block -> (new BlockColorTallGrass(Colorizers.grass)))
                .build("grass.overgrown", "bonusblocks:block/grass_overgrown", blockID++, b -> new BlockLogic(b, Material.grass));
        GRASS_RETRO_OVERGROWN = grass
                .setTextures("minecraft:block/grass_retro_top")
                .build("grass.retro.overgrown", "bonusblocks:block/grass_retro_overgrown", blockID++, b -> new BlockLogic(b, Material.grass));
        GRASS_SCORCHED_OVERGROWN = grass
                .setTextures("minecraft:block/grass_scorched_top")
                .build("grass.scorched.overgrown", "bonusblocks:block/grass_scorched_overgrown", blockID++, b -> new BlockLogic(b, Material.grass));
        PATH_DIRT_OVERGROWN = grass
                .setTextures("minecraft:block/grass_path_top")
                .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                .build("path.overgrown", "bonusblocks:block/dirt_path_overgrown", blockID++, BlockLogicPathDirt::new);

        // Flowers

        FLOWER_SILVER = flower
                .setTextures("bonusblocks:block/flower_lightgray")
                .build("flower.silver", "bonusblocks:block/flower_silver", blockID++, BlockLogicFlower::new);

        FLOWER_CYAN = flower
                .setTextures("bonusblocks:block/flower_cyan")
                .build("flower.cyan", "bonusblocks:block/flower_cyan", blockID++, BlockLogicFlower::new);

        FLOWER_MAGENTA = flower
                .setTextures("bonusblocks:block/flower_magenta")
                .build("flower.magenta", "bonusblocks:block/flower_magenta", blockID++, BlockLogicFlower::new);
        FLOWER_LIME = flower
                .setTextures("bonusblocks:block/flower_lime")
                .build("flower.lime", "bonusblocks:block/flower_lime", blockID++, BlockLogicFlower::new);

        // Petals
        PETAL_YELLOW = petal
                .setTextures("bonusblocks:block/petal_yellow")
                .build("petal.yellow", "bonusblocks:block/petal_yellow", blockID++, BlockLogicPetal::new);
        PETAL_RED = petal
                .setTextures("bonusblocks:block/petal_red")
                .build("petal.red", "bonusblocks:block/petal_red", blockID++, BlockLogicPetal::new);
        PETAL_CYAN = petal
                .setTextures("bonusblocks:block/petal_cyan")
                .build("petal.cyan", "bonusblocks:block/petal_cyan", blockID++, BlockLogicPetal::new);
        PETAL_PURPLE = petal
                .setTextures("bonusblocks:block/petal_purple")
                .build("petal.purple", "bonusblocks:block/petal_purple", blockID++, BlockLogicPetal::new);
        PETAL_PINK = petal
                .setTextures("bonusblocks:block/petal_pink")
                .build("petal.pink", "bonusblocks:block/petal_pink", blockID++, BlockLogicPetal::new);
        PETAL_SILVER = petal
                .setTextures("bonusblocks:block/petal_lightgray")
                .build("petal.silver", "bonusblocks:block/petal_silver", blockID++, BlockLogicPetal::new);
        PETAL_ORANGE = petal
                .setTextures("bonusblocks:block/petal_orange")
                .build("petal.orange", "bonusblocks:block/petal_orange", blockID++, BlockLogicPetal::new);
        PETAL_LIGHT_BLUE = petal
                .setTextures("bonusblocks:block/petal_lightblue")
                .build("petal.lightblue", "bonusblocks:block/petal_light_blue", blockID++, BlockLogicPetal::new);
        PETAL_MAGENTA = petal
                .setTextures("bonusblocks:block/petal_magenta")
                .build("petal.magenta", "bonusblocks:block/petal_magenta", blockID++, BlockLogicPetal::new);
        PETAL_LIME = petal
                .setTextures("bonusblocks:block/petal_lime")
                .build("petal.lime", "bonusblocks:block/petal_lime", blockID++, BlockLogicPetal::new);

        // Petal Layers
        PETAL_LAYER_YELLOW = petalLayer
                .setTextures("bonusblocks:block/petal_yellow")
                .build("layer.petal.yellow", "bonusblocks:block/petal_layer_yellow", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_RED = petalLayer
                .setTextures("bonusblocks:block/petal_red")
                .build("layer.petal.red", "bonusblocks:block/petal_layer_red", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_CYAN = petalLayer
                .setTextures("bonusblocks:block/petal_cyan")
                .build("layer.petal.cyan", "bonusblocks:block/petal_layer_cyan", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_PURPLE = petalLayer
                .setTextures("bonusblocks:block/petal_purple")
                .build("layer.petal.purple", "bonusblocks:block/petal_layer_purple", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_PINK = petalLayer
                .setTextures("bonusblocks:block/petal_pink")
                .build("layer.petal.pink", "bonusblocks:block/petal_layer_pink", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_SILVER = petalLayer
                .setTextures("bonusblocks:block/petal_lightgray")
                .build("layer.petal.silver", "bonusblocks:block/petal_layer_lightgray", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_ORANGE = petalLayer
                .setTextures("bonusblocks:block/petal_orange")
                .build("layer.petal.orange", "bonusblocks:block/petal_layer_orange", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_LIGHT_BLUE = petalLayer
                .setTextures("bonusblocks:block/petal_lightblue")
                .build("layer.petal.lightblue", "bonusblocks:block/petal_layer_lightblue", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_MAGENTA = petalLayer
                .setTextures("bonusblocks:block/petal_magenta")
                .build("layer.petal.magenta", "bonusblocks:block/petal_layer_magenta", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_LIME = petalLayer
                .setTextures("bonusblocks:block/petal_lime")
                .build("layer.petal.lime", "bonusblocks:block/petal_layer_lime", blockID++, BlockLogicLayerPetal::new);

        // Mushroom
        MUSHROOM_GRAY = flower
                .setTextures("bonusblocks:block/mushroom_gray")
                .build("mushroom.gray", "bonusblocks:block/mushroom_gray", blockID++, BlockLogicMushroom::new);

        // Mushroom Blocks
        FUNGI_BROWN = grass
                .setLuminance(2)
                .setTextures("bonusblocks:block/block_mushroom_brown")
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build("fungi.brown", "bonusblocks:block/fungi_brown", blockID++, b -> new BlockLogic(b, Material.dirt));
        FUNGI_RED = grass
                .setTextures("bonusblocks:block/block_mushroom_red")
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build("fungi.red", "bonusblocks:block/fungi_red", blockID++, b -> new BlockLogic(b, Material.dirt));
        FUNGI_GRAY = grass
                .setTextures("bonusblocks:block/block_mushroom_gray")
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build("fungi.gray", "bonusblocks:block/fungi_gray", blockID++, b -> new BlockLogic(b, Material.dirt));

        // Bone Block
        BLOCK_BONE = stone
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setBlockModel(BlockModelAxisAligned::new)
                .setTopBottomTextures("bonusblocks:block/block_bone_top")
                .setSideTextures("bonusblocks:block/block_bone_side")
                .build("block.bone","bonusblocks:block/block_bone", blockID++, b -> new BlockLogicAxisAligned(b, Material.dirt));

        // Cloth Block
        BLOCK_CLOTH = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.8f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setTextures("bonusblocks:block/block_cloth")
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.MINEABLE_BY_AXE)
                .build("block.cloth","bonusblocks:block/block_cloth", blockID++, BlockCloth::new);

        // Slime Block
        BLOCK_SLIME = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.5f))
                .setHardness(0.2f)
                .setResistance(0.2f)
                .setLightOpacity(6)
                .setTextures("bonusblocks:block/block_slime")
                .setBlockModel(b -> new BlockModelTransparent<>(b, true).onRenderLayer(1))
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build("block.slime","bonusblocks:block/block_slime", blockID++, BlockSlime::new);

        // Sulphur Block
        BLOCK_SULPHUR = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                .setHardness(0.5f)
                .setResistance(0.5f)
                .setTextures("bonusblocks:block/block_sulphur")
                .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                .build("block.sulphur", "bonusblocks:block/block_sulphur", blockID++, BlockLogicSulphur::new);

        // Sugar Block
        BLOCK_SUGAR = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                .setHardness(0.3f)
                .setResistance(0.3f)
                .setTextures("bonusblocks:block/block_sugar")
                .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.BROKEN_BY_FLUIDS)
                .build("block.sugar","bonusblocks:block/block_sugar", blockID++, BlockLogicSand::new);

        // Leather Block
        BLOCK_LEATHER = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.6f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setTextures("bonusblocks:block/block_leather")
                .setFlammability(5, 10)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build("block.leather","bonusblocks:block/block_leather", blockID++, b -> new BlockLogic(b, Material.cloth));

        // Wicker Block
        BLOCK_WICKER = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.5f)
                .setResistance(0.5f)
                .setTextures("minecraft:block/basket_bottom")
                .setFlammability(60, 120)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build("block.wicker","bonusblocks:block/wicker", blockID++, b -> new BlockLogic(b, Material.cloth));

        // Flint Block
        BLOCK_FLINT = raw
                .setTextures("bonusblocks:block/block_flint")
                .setInfiniburn()
                .build("block.flint","bonusblocks:block/block_flint", blockID++, b -> new BlockLogic(b, Material.stone));

        // Crude Steel Block
        BLOCK_CRUDE_STEEL = raw
                .setHardness(4.0f)
                .setResistance(1000.0f)
                .setTextures("bonusblocks:block/block_steel_crude")
                .build("block.steel.crude", "bonusblocks:block/block_steel_crude", blockID++, b -> new BlockLogic(b, Material.metal));

        // Raw Blocks
        BLOCK_RAW_IRON = raw
                .setTextures("bonusblocks:block/block_iron_raw")
                .build("block.raw.iron", "bonusblocks:block/block_raw_iron", blockID++, b -> new BlockLogic(b, Material.metal));
        BLOCK_RAW_GOLD = raw
                .setTextures("bonusblocks:block/block_gold_raw")
                .build("block.raw.gold", "bonusblocks:block/block_raw_gold", blockID++, b -> new BlockLogic(b, Material.metal));
        BLOCK_RAW_COPPER = raw
                .setTextures("bonusblocks:block/block_copper_raw")
                .setTicking(true)
                .build("block.raw.copper", "bonusblocks:block/block_raw_copper", blockID++, b -> new BlockLogic(b, Material.metal) {
                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && Objects.requireNonNull(world.getCurrentWeather()).isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.BLOCK_RAW_COPPER.id(), world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });

        BLOCK_RAW_SILVER = silver
                .setTextures("bonusblocks:block/block_silver_raw")
                .build("block.raw.silver", "bonusblocks:block/block_raw_silver", blockID++, b -> new BlockLogic(b, Material.metal));

        // Nuggets

        // Make Custom BlockMODEL for these fuckers
        OVERLAY_RAW_IRON = pebble
                .setBlockModel(BlockModelNuggetsIron::new)
                .build("overlay.iron", "bonusblocks:block/overlay_raw_copper", blockID++, BlockLogicOverlayNuggetsIron::new);
        OVERLAY_RAW_GOLD = pebble
                .setBlockModel(BlockModelNuggetsGold::new)
                .build("overlay.gold", "bonusblocks:block/overlay_raw_gold", blockID++, BlockLogicOverlayNuggetsGold::new);
        OVERLAY_RAW_COPPER = pebble
                .setBlockModel(BlockModelNuggetsCopper::new)
                .build("overlay.copper", "bonusblocks:block/overlay_raw_copper", blockID++, BlockLogicOverlayNuggetsCopper::new);
        OVERLAY_RAW_SILVER = pebble
                .setBlockModel(BlockModelNuggetsSilver::new)
                .build("overlay.silver", "bonusblocks:block/overlay_raw_silver", blockID++, BlockLogicOverlayNuggetsSilver::new);

        // Copper Ores
        ORE_COPPER_STONE = ore
                .setTextures("bonusblocks:block/ore_copper_stone")
                .build("ore.copper.stone", "bonusblocks:block/ore_copper_stone", blockID++, b -> new BlockLogicOreCopper(b, STONE, Material.stone));
        ORE_COPPER_BASALT = ore
                .setTextures("bonusblocks:block/ore_copper_basalt")
                .build("ore.copper.basalt", "bonusblocks:block/ore_copper_basalt", blockID++, b -> new BlockLogicOreCopper(b, BASALT, Material.basalt));
        ORE_COPPER_LIMESTONE = ore
                .setTextures("bonusblocks:block/ore_copper_limestone")
                .build("ore.copper.limestone", "bonusblocks:block/ore_copper_granite", blockID++, b -> new BlockLogicOreCopper(b, LIMESTONE, Material.limestone));
        ORE_COPPER_GRANITE = ore
                .setTextures("bonusblocks:block/ore_copper_granite")
                .build("ore.copper.granite", "bonusblocks:block/ore_copper_granite", blockID++, b -> new BlockLogicOreCopper(b, GRANITE, Material.granite));
        ORE_COPPER_PERMAFROST = ore
                .setTextures("bonusblocks:block/ore_copper_permafrost")
                .build("ore.copper.permafrost", "bonusblocks:block/ore_copper_permafrost", blockID++, b -> new BlockLogicOreCopper(b, PERMAFROST, Material.permafrost));


        // Silver Ores
        ORE_SILVER_STONE = ore
                .setTextures("bonusblocks:block/ore_silver_stone")
                .build("ore.silver.stone", "bonusblocks:block/ore_silver_stone", blockID++, b -> new BlockLogicOreSilver(b, STONE, Material.stone));
        ORE_SILVER_BASALT = ore
                .setTextures("bonusblocks:block/ore_silver_basalt")
                .build("ore.silver.basalt", "bonusblocks:block/ore_silver_basalt", blockID++, b -> new BlockLogicOreSilver(b, BASALT, Material.basalt));
        ORE_SILVER_LIMESTONE = ore
                .setTextures("bonusblocks:block/ore_silver_limestone")
                .build("ore.silver.limestone", "bonusblocks:block/ore_silver_granite", blockID++, b -> new BlockLogicOreSilver(b, LIMESTONE, Material.limestone));
        ORE_SILVER_GRANITE = ore
                .setTextures("bonusblocks:block/ore_silver_granite")
                .build("ore.silver.granite", "bonusblocks:block/ore_silver_granite", blockID++, b -> new BlockLogicOreSilver(b, GRANITE, Material.granite));
        ORE_SILVER_PERMAFROST = ore
                .setTextures("bonusblocks:block/ore_silver_permafrost")
                .build("ore.silver.permafrost", "bonusblocks:block/ore_silver_permafrost", blockID++, b -> new BlockLogicOreSilver(b, PERMAFROST, Material.permafrost));


        // Copper Blocks
        BLOCK_COPPER = raw
                .setTextures("bonusblocks:block/block_copper")
                .setTicking(true)
                .build("block.copper", "bonusblocks:block/block_copper", blockID++, b -> new BlockLogic(b, Material.metal) {
                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && Objects.requireNonNull(world.getCurrentWeather()).isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.BLOCK_COPPER.id(), world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });


        // Copper Mesh
        MESH_COPPER = raw
                .setBlockModel(block -> new BlockModelTransparent<>(block, true))
                .setTextures("bonusblocks:block/mesh_copper")
                .setTicking(true)
                .build("mesh.copper", "bonusblocks:block/mesh_copper", blockID++, b -> new BlockLogicTransparent(b, Material.metal) {
                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && Objects.requireNonNull(world.getCurrentWeather()).isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.MESH_COPPER.id(), world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });


        // Copper Pipe
//        PIPE_COPPER = raw
//                .setIcon("bonusblocks:block/pipe_copper")
//                .setBlockModel(block -> new DFBlockModelBuilder(MOD_ID).setBlockModel("block/pipe.json").setBlockState(MOD_ID, "pipe_states.json").setMetaStateInterpreter(new PipeMetaStateInterpreter()).setRender3D(false).build(PIPE_COPPER))
//                .build("pipe.copper", "bonusblocks:block/pipe_copper", blockID++, BlockLogicPipe::new);


        // Copper Trapdoor
        TRAPDOOR_COPPER = raw
                .setBlockModel(BlockModelTrapDoor::new)
                .setTopBottomTextures("bonusblocks:block/trapdoor_copper_top")
                .setSideTextures("bonusblocks:block/trapdoor_copper_side")
                .setVisualUpdateOnMetadata()
                .setTicking(true)
                .build("trapdoor.copper", "bonusblocks:block/trapdoor_copper", blockID++, b -> new BlockLogicTrapDoor(b, Material.stone) {
                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && Objects.requireNonNull(world.getCurrentWeather()).isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.TRAPDOOR_COPPER.id(), world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });


        // Copper Doors
        DOOR_COPPER_BOTTOM = raw
                .setBlockModel(block -> new BlockModelDoor<>(DOOR_COPPER_BOTTOM))
                .setTextures("bonusblocks:block/door_copper_bottom")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.copper.bottom", "bonusblocks:block/door_copper_bottom", blockID++, b -> new BlockLogicDoorCopper(b, Material.stone,false, true, () -> BonusItems.DOOR_COPPER));
        DOOR_COPPER_TOP = raw
                .setBlockModel(block -> new BlockModelDoor<>(DOOR_COPPER_TOP))
                .setTextures("bonusblocks:block/door_copper_top")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.copper.top", "bonusblocks:block/door_copper_top", blockID++, b -> new BlockLogicDoorCopper(b, Material.stone,true, true, () -> BonusItems.DOOR_COPPER));


        // Copper Fence
        FENCE_COPPER = raw
                .setBlockModel(block -> new BlockModelFenceThin<>(FENCE_COPPER, TextureRegistry.getTexture("bonusblocks:block/fence_copper_center"), null, TextureRegistry.getTexture("bonusblocks:block/fence_copper_top"), TextureRegistry.getTexture("bonusblocks:block/fence_copper_column")).withTextures("bonusblocks:block/fence_copper_center"))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build("fence.copper", "bonusblocks:block/fence_copper", blockID++, BlockLogicFenceCopper::new);


        //Copper Pressure Plate
        PRESSURE_PLATE_COPPER = raw
                .setTextures("bonusblocks:block/block_copper")
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS)
                .build("pressureplate.copper", "bonusblocks:block/pressure_plate_copper", blockID++, b -> new CopperPressurePlateBlock<>(b, EntityItem.class, Material.metal));


        // Silver
        BLOCK_SILVER = silver
                .setTextures("bonusblocks:block/block_silver")
                .build("block.silver", "bonusblocks:block/block_silver", blockID++, b -> new BlockLogic(b, Material.metal));

        BRICK_SILVER = silver
                .setTextures("bonusblocks:block/brick_silver")
                .build("brick.silver", "bonusblocks:block/brick_silver", blockID++, b -> new BlockLogic(b, Material.metal));

        // Silver Trapdoor
        TRAPDOOR_SILVER = silver
                .setBlockModel(BlockModelTrapDoor::new)
                .setTopBottomTextures("bonusblocks:block/trapdoor_silver_top")
                .setSideTextures("bonusblocks:block/trapdoor_silver_side")
                .setVisualUpdateOnMetadata()
                .build("trapdoor.silver", "bonusblocks:block/trapdoor_silver", blockID++, b -> new BlockLogicTrapDoor(b, Material.stone));

        // Silver Doors
        DOOR_SILVER_BOTTOM = silver
                .setBlockModel(block -> new BlockModelDoor<>(DOOR_SILVER_BOTTOM))
                .setTextures("bonusblocks:block/door_silver_bottom")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.silver.bottom", "bonusblocks:block/door_silver_bottom", blockID++, b -> new BlockLogicDoor(b, Material.stone, true, true, () -> BonusItems.DOOR_SILVER));
        DOOR_SILVER_TOP = silver
                .setBlockModel(block -> new BlockModelDoor<>(DOOR_SILVER_TOP))
                .setTextures("bonusblocks:block/door_silver_top")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.silver.top", "bonusblocks:block/door_silver_top", blockID++, b -> new BlockLogicDoor(b, Material.stone, false, true, () -> BonusItems.DOOR_SILVER));

        // Silver Fence
        FENCE_SILVER = silver
                .setBlockModel(block -> new BlockModelFenceThin<>(FENCE_COPPER, TextureRegistry.getTexture("bonusblocks:block/fence_silver_center"), null, null, TextureRegistry.getTexture("bonusblocks:block/fence_silver_column")).withTextures("bonusblocks:block/fence_silver_center"))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build("fence.silver", "bonusblocks:block/fence_silver", blockID++, BlockFenceNoClimb::new);

        // Silver Chandelier
        CHANDELIER_SILVER = silver
                .setBlockModel(BlockModelCrossedSquares::new)
                .setTextures("bonusblocks:block/chandelier_silver")
                .setVisualUpdateOnMetadata()
                .setLuminance(15)
                .setUseInternalLight()
                .build("chandelier.silver", "bonusblocks:block/chandelier_silver", blockID++, BlockChandelier::new);

        // Silver Candelabra
        CANDELABRA_SILVER = silver
                .setBlockModel(BlockModelCrossedSquares::new)
                .setTextures("bonusblocks:block/candelabra_silver")
                .setVisualUpdateOnMetadata()
                .setLuminance(15)
                .setUseInternalLight()
                .build("candelabra.silver", "bonusblocks:block/candelabra_silver", blockID++, BlockVase::new);

        // Silver Lantern
        LANTERN_SILVER = silver
                .setBlockModel(BlockModelCrossedSquares::new)
                .setTextures("bonusblocks:block/lantern_silver")
                .setVisualUpdateOnMetadata()
                .setLuminance(15)
                .setUseInternalLight()
                .build("lantern.silver", "bonusblocks:block/lantern_silver", blockID++, BlockLantern::new);

        // Silver Vase
        VASE_SILVER = silver
                .setBlockModel(BlockModelCrossedSquares::new)
                .setTextures("bonusblocks:block/vase_silver")
                .setVisualUpdateOnMetadata()
                .build("vase.silver", "bonusblocks:block/vase_silver", blockID++, BlockVase::new);

        // Silver Vane
        VANE_SILVER = silver
                .setBlockModel(BlockModelCrossedSquares::new)
                .setTextures("bonusblocks:block/vane_silver")
                .setVisualUpdateOnMetadata()
                .build("vane.silver", "bonusblocks:block/vane_silver", blockID++, BlockVase::new);

        // Silver Chimes
        CHIMES_SILVER = silver
                .setBlockModel(BlockModelCrossedSquares::new)
                .setTextures("bonusblocks:block/chimes_silver")
                .setVisualUpdateOnMetadata()
                .build("chimes.silver", "bonusblocks:block/chimes_silver", blockID++, BlockChimes::new);

        // Silver Bed
        BED_SILVER = silver
                .setBlockModel(BlockModelSilverBed::new)
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .build("bed.silver", "bonusblocks:block/bed_silver", blockID++, b -> new BlockLogicBedSilver(b, Material.metal));

        // Silver Seat
        SEAT_SILVER = silver
                .setBlockModel(BlockModelSeat::new)
                .setTopTexture("bonusblocks:block/seat_silver_top")
                .setBottomTexture("bonusblocks:block/block_silver")
                .setBottomTexture("bonusblocks:block/seat_silver_side")
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .build("seat.silver", "bonusblocks:block/seat_silver", blockID++, b -> new BlockLogicSeatSilver(b, Material.metal));


        // Scorched Stone
        SCORCHEDSTONE = stone
                .setHardness(0.8f)
                .setTopTexture("bonusblocks:block/scorchedstone_top")
                .setBottomTexture("bonusblocks:block/scorchedstone_bottom")
                .setSideTextures("bonusblocks:block/scorchedstone_side")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.GROWS_TREES, BlockTags.GROWS_SPINIFEX, BlockTags.GROWS_FLOWERS, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
                .build("scorchedstone", "bonusblocks:block/scorchedstone", blockID++, b -> new BlockLogic(b, Material.stone));


        // Slate Pillar
        PILLAR_SLATE = stone
                .setBlockModel(BlockModelAxisAligned::new)
                .setTopBottomTextures("bonusblocks:block/pillar_slate_top")
                .setSideTextures("bonusblocks:block/pillar_slate_side")
                .build("pillar.slate", "bonusblocks:block/pillar_slate", blockID++, b -> new BlockLogic(b, Material.stone));


        // Polished Stones
        MARBLE_POLISHED = stone
                .setHardness(1.0f)
                .setTopBottomTextures("bonusblocks:block/polished_marble_top")
                .setSideTextures("bonusblocks:block/polished_marble_side")
                .build("marble.polished", "bonusblocks:block/marble_polished", blockID++, b -> new BlockLogic(b, Material.stone));


        // Carved Stones
        SLATE_CARVED = stone
                .setTopBottomTextures("minecraft:block/polished_slate_top")
                .setSideTextures("minecraft:block/carved_slate")
                .build("slate.carved", "bonusblocks:block/slate_carved", blockID++, b -> new BlockLogic(b, Material.stone));
        MARBLE_CARVED = stone
                .setTopBottomTextures("minecraft:block/polished_marble_top")
                .setSideTextures("minecraft:block/carved_marble")
                .build("marble.carved", "bonusblocks:block/marble_carved", blockID++, b -> new BlockLogic(b, Material.stone));


        // Baked Clay
        BLOCK_CLAY_BAKED = stone
                .setHardness(3.0f)
                .setTextures("bonusblocks:block/block_clay_baked")
                .build("block.clay.baked", "bonusblocks:block/block_clay_baked", blockID++, b -> new BlockLogic(b, Material.stone));


        // Obsidian Glass
        GLASS_OBSIDIAN = obsidian
                .setBlockModel(block -> new BlockModelTransparent<>(block, false).onRenderLayer(1))
                .setTextures("bonusblocks:block/glass_obsidian")
                .build("glass.obsidian", "bonusblocks:block/glass_obsidian", blockID++, BlockLogicGlassObsidian::new);

        TRAPDOOR_GLASS_OBSIDIAN = obsidian
                .setBlockModel(BlockModelTrapDoor::new)
                .setSideTextures("bonusblocks:block/trapdoor_glass_obsidian_side")
                .setTopBottomTextures("bonusblocks:block/glass_obsidian")
                .setVisualUpdateOnMetadata()
                .build("trapdoor.glass.obsidian", "bonusblocks:block/trapdoor_glass_obsidian", blockID++, b -> new BlockTrapDoorObsidian(b, Material.glass));

        // Quartz Glass
        GLASS_QUARTZ = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(0.3F)
                .setResistance(0.3F)
                .setVisualUpdateOnMetadata()
                .setUseInternalLight()
                .setBlockModel(block -> new BlockModelTransparent<>(block, false))
                .setTextures("bonusblocks:block/glass_quartz")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("glass.quartz", "bonusblocks:block/glass_quartz", blockID++, BlockLogicGlassQuartz::new);


        BRICK_SCORCHEDSTONE = brick
                .setHardness(0.8f)
                .setTextures("bonusblocks:block/brick_scorchedstone")
                .build("brick.scorchedstone", "bonusblocks:block/brick_scorchedstone", blockID++, b -> new BlockLogic(b, Material.stone));
        BRICK_MUD = brick
                .setHardness(1.5f)
                .setTextures("bonusblocks:block/brick_mud_baked")
                .build("brick.mud", "bonusblocks:block/brick_mud", blockID++, b -> new BlockLogic(b, Material.stone));

        BRICK_QUARTZ = brick
                .setHardness(3.0f)
                .setTextures("bonusblocks:block/brick_quartz")
                .build("brick.quartz", "bonusblocks:block/brick_quartz", blockID++, b -> new BlockLogic(b, Material.stone));
        BRICK_OLIVINE = brick
                .setHardness(3.0f)
                .setTextures("bonusblocks:block/brick_olivine")
                .build("brick.olivine", "bonusblocks:block/brick_olivine", blockID++, b -> new BlockLogic(b, Material.stone));


        // Soul Candle
        CANDLE_SOULWAX = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 1.2f))
                .setIcon("bonusblocks:item/candle_soulwax")
                .setHardness(0.0f)
                .setResistance(0.0f)
                .setLuminance(10)
                .setBlockModel(BlockModelSoulwaxCandle::new)
                .setTextures("bonusblocks:block/candle_soulwax")
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_SWORD, BlockTags.BROKEN_BY_FLUIDS)
                .build("candle.soulwax", "bonusblocks:block/candle_soulwax", blockID++, BlockLogicSoulCandle::new);


        //Slabs
        SLAB_WOOL = slab
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.8F)
                .setResistance(0.8F)
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.NOT_IN_CREATIVE_MENU)
                .setBlockItem(ItemBlockSlabWool::new)
                .setBlockModel(b -> new BlockModelSlabWool(WOOL))
                .build("bonusblocks:block/slab_wool", blockID++, b -> new BlockLogicSlab(b, WOOL));

        SLAB_COBBLESTONE_MOSSY = slab
                .setHardness(2.0F)
                .build("bonusblocks:block/slab_cobble_stone_mossy", blockID++, b -> new BlockLogicSlab(b, COBBLE_STONE_MOSSY));
        SLAB_SLATE_POLISHED = slab
                .build("bonusblocks:block/slab_slate_polished", blockID++, b -> new BlockLogicSlab(b, SLATE_CARVED));
        SLAB_MARBLE_POLISHED = slab
                .build("bonusblocks:block/slab_marble_polished", blockID++, b -> new BlockLogicSlab(b, MARBLE_CARVED));
        SLAB_BRICK_STONE_POLISHED_MOSSY = slab
                .setHardness(2.0F)
                .build("bonusblocks:block/slab_brick_stone_polished_mossy", blockID++, b -> new BlockLogicSlab(b, BRICK_STONE_POLISHED_MOSSY));
        SLAB_BRICK_SCORCHEDSTONE = slab
                .setHardness(0.8f)
                .build("bonusblocks:block/slab_brick_scorchedstone", blockID++, b -> new BlockLogicSlab(b, BRICK_SCORCHEDSTONE));
        SLAB_BRICK_MUD = slab
                .build("bonusblocks:block/slab_brick_mud", blockID++, b -> new BlockLogicSlab(b, BRICK_MUD));
        SLAB_SCORCHEDSTONE = slab
                .setHardness(0.8F)
                .build("bonusblocks:block/slab_scorchedstone", blockID++, b -> new BlockLogicSlab(b, SCORCHEDSTONE));
        SLAB_BRICK_QUARTZ = slab
                .setHardness(3.0f)
                .build("bonusblocks:block/slab_brick_quartz", blockID++, b -> new BlockLogicSlab(b, BRICK_QUARTZ));
        SLAB_BRICK_OLIVINE = slab
                .setHardness(3.0f)
                .build("bonusblocks:block/slab_brick_olivine", blockID++, b -> new BlockLogicSlab(b, BRICK_OLIVINE));
        SLAB_BRICK_SILVER = slab
                .setHardness(0.8f)
                .setResistance(2.0f)
                .build("bonusblocks:block/slab_brick_silver", blockID++, b -> new BlockLogicSlab(b, BRICK_SILVER));
        SLAB_COPPER = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setTicking(true)
                .build("bonusblocks:block/slab_copper", blockID++, b -> new BlockLogicSlab(b, BLOCK_COPPER));


        // Stairs
        STAIRS_WOOL = stairs
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.8F)
                .setResistance(0.8F)
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.NOT_IN_CREATIVE_MENU)
                .build("bonusblocks:block/stairs_wool", blockID++, b -> new BlockLogicStairs(b, WOOL));
        STAIRS_COBBLESTONE_MOSSY = stairs
                .setHardness(2.0F)
                .build("bonusblocks:block/stairs_cobble_stone_mossy", blockID++, b -> new BlockLogicStairs(b, COBBLE_STONE_MOSSY));
        STAIRS_BRICK_STONE_POLISHED_MOSSY = stairs
                .setHardness(2.0F)
                .build("bonusblocks:block/stairs_brick_stone_polished_mossy", blockID++, b -> new BlockLogicStairs(b, BRICK_STONE_POLISHED_MOSSY));
        STAIRS_BRICK_SCORCHEDSTONE = stairs
                .setHardness(0.8f)
                .build("bonusblocks:block/stairs_brick_scorchedstone", blockID++, b -> new BlockLogicStairs(b, BRICK_SCORCHEDSTONE));
        STAIRS_BRICK_MUD = stairs
                .setHardness(1.5f)
                .build("bonusblocks:block/stairs_brick_mud", blockID++, b -> new BlockLogicStairs(b, BRICK_MUD));
        STAIRS_BRICK_QUARTZ = stairs
                .setHardness(3.0f)
                .build("bonusblocks:block/stairs_brick_quartz", blockID++, b -> new BlockLogicStairs(b, BRICK_QUARTZ));
        STAIRS_BRICK_OLIVINE = stairs
                .setHardness(3.0f)
                .build("bonusblocks:block/stairs_brick_olivine", blockID++, b -> new BlockLogicStairs(b, BRICK_OLIVINE));
        STAIRS_BRICK_SILVER = stairs
                .setHardness(0.8f)
                .setResistance(2.0f)
                .build("bonusblocks:block/stairs_brick_silver", blockID++, b -> new BlockLogicStairs(b, BRICK_SILVER));
        STAIRS_COPPER = stairs
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setTicking(true)
                .build("bonusblocks:block/stairs_copper", blockID++, b -> new BlockLogicStairs(b, BLOCK_COPPER) {
                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && Objects.requireNonNull(world.getCurrentWeather()).isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.STAIRS_COPPER.id(), world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });



        //2.2 New Stuff

        // Baked Clay Bricks
        BRICK_CLAY_BAKED = stone
                .setTextures("bonusblocks:block/brick_block_clay_baked")
                .build("brick.clay.baked", "bonusblocks:block/brick_clay_baked", blockID++, block -> new BlockLogic(block, Material.stone));

        SLAB_BRICK_CLAY_BAKED = slab
                .build("bonusblocks:block/slab_brick_clay_baked", blockID++, b -> new BlockLogicSlab(b, BRICK_CLAY_BAKED));

        STAIRS_BRICK_CLAY_BAKED = stairs
                .build("bonusblocks:block/stairs_brick_clay_baked", blockID++, b -> new BlockLogicStairs(b, BRICK_CLAY_BAKED));

        // Rough Dirt
        DIRT_ROUGH = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.gravel", "step.gravel", 1.0f, 0.8f))
                .setHardness(0.6f)
                .setResistance(0.6f)
                .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.CAVES_CUT_THROUGH)
                .setTextures("bonusblocks:block/dirt_rough")
                .build("dirt.rough", "bonusblocks:block/dirt_rough", blockID++, block -> new BlockLogic(block, Material.dirt));

        // Skull
        SKULL_CARVED_IDLE = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setBlockModel(BlockModelHorizontalRotation::new)
                .setTopTexture("bonusblocks:block/skull_top")
                .setBottomTexture("bonusblocks:block/skull_bottom")
                .setNorthTexture("bonusblocks:block/skull_carved_idle")
                .setSideTextures("bonusblocks:block/skull_side")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("skull.carved.idle", "bonusblocks:block/skull_carved_idle", blockID++, b -> new BlockLogicSkull(b, true));

        SKULL_CARVED_ACTIVE = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setLuminance(15)
                .setBlockModel(BlockModelHorizontalRotation::new)
                .setTopTexture("bonusblocks:block/skull_top")
                .setBottomTexture("bonusblocks:block/skull_bottom")
                .setNorthTexture("bonusblocks:block/skull_carved_active")
                .setSideTextures("bonusblocks:block/skull_side")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("skull.carved.active", "bonusblocks:block/skull_carved_active", blockID++, b -> new BlockLogicSkull(b, false));

        SKULL = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setBlockModel(BlockModelHorizontalRotation::new)
                .setTopTexture("bonusblocks:block/skull_top")
                .setBottomTexture("bonusblocks:block/skull_bottom")
                .setSideTextures("bonusblocks:block/skull_side")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("skull", "bonusblocks:block/skull", blockID++, b -> new BlockLogicSkull(b, false));



        // 2.3 New Stuff

        // Lazurite

        LAZURITE = stone
                .setTextures("bonusblocks:block/lazurite")
                .build("lazurite", "bonusblocks:block/lazurite", blockID++, block -> new BlockLogicStone(block, COBBLE_LAZURITE, Material.stone));

        COBBLE_LAZURITE = stone
                .setHardness(2.0f)
                .setTextures("bonusblocks:block/cobbled_lazurite")
                .build("cobble.lazurite", "bonusblocks:block/cobble_lazurite", blockID++, block -> new BlockLogic(block, Material.stone));
        SLAB_COBBLE_LAZURITE = slab
                .setHardness(2.0F)
                .build("bonusblocks:block/slab_cobble_lazurite", blockID++, b -> new BlockLogicSlab(b, COBBLE_LAZURITE));
        STAIRS_COBBLE_LAZURITE = stairs
                .setHardness(2.0F)
                .build("bonusblocks:block/stairs_cobble_lazurite", blockID++, b -> new BlockLogicStairs(b, COBBLE_LAZURITE));

        BRICK_LAZURITE = brick
                .setHardness(1.5f)
                .setTextures("bonusblocks:block/brick_lazurite")
                .build("brick.lazurite", "bonusblocks:block/brick_lazurite", blockID++, block -> new BlockLogic(block, Material.stone));
        SLAB_BRICK_LAZURITE = slab
                .setHardness(1.5f)
                .build("bonusblocks:block/slab_brick_lazurite", blockID++, b -> new BlockLogicSlab(b, BRICK_LAZURITE));
        STAIRS_BRICK_LAZURITE = stairs
                .setHardness(1.5f)
                .build("bonusblocks:block/stairs_brick_lazurite", blockID++, b -> new BlockLogicStairs(b, BRICK_LAZURITE));

        LAZURITE_POLISHED = stone
                .setTextures("bonusblocks:block/polished_lazurite_top")
                .setSideTextures("bonusblocks:block/polished_lazurite_side")
                .build("lazurite.polished", "bonusblocks:block/lazurite_polished", blockID++, block -> new BlockLogic(block, Material.stone));
        LAZURITE_CARVED = stone
                .setTextures("bonusblocks:block/polished_lazurite_top")
                .setSideTextures("bonusblocks:block/carved_lazurite")
                .build("lazurite.carved", "bonusblocks:block/lazurite_carved", blockID++, block -> new BlockLogic(block, Material.stone));
        SLAB_LAZURITE_POLISHED = slab
                .build("bonusblocks:block/slab_lazurite_polished", blockID++, b -> new BlockLogicSlab(b, LAZURITE_CARVED));


        // Peridot

        PERIDOT = stone
                .setTextures("bonusblocks:block/peridot")
                .build("peridot", "bonusblocks:block/peridot", blockID++, block -> new BlockLogicStone(block, COBBLE_PERIDOT, Material.stone));

        COBBLE_PERIDOT = stone
                .setHardness(2.0f)
                .setTextures("bonusblocks:block/cobbled_peridot")
                .build("cobble.peridot", "bonusblocks:block/cobble_peridot", blockID++, block -> new BlockLogic(block, Material.stone));
        SLAB_COBBLE_PERIDOT = slab
                .setHardness(2.0F)
                .build("bonusblocks:block/slab_cobble_peridot", blockID++, b -> new BlockLogicSlab(b, COBBLE_PERIDOT));
        STAIRS_COBBLE_PERIDOT = stairs
                .setHardness(2.0F)
                .build("bonusblocks:block/stairs_cobble_peridot", blockID++, b -> new BlockLogicStairs(b, COBBLE_PERIDOT));

        BRICK_PERIDOT = brick
                .setHardness(1.5f)
                .setTextures("bonusblocks:block/brick_peridot")
                .build("brick.peridot", "bonusblocks:block/brick_peridot", blockID++, block -> new BlockLogic(block, Material.stone));
        SLAB_BRICK_PERIDOT = slab
                .setHardness(1.5f)
                .build("bonusblocks:block/slab_brick_peridot", blockID++, b -> new BlockLogicSlab(b, BRICK_PERIDOT));
        STAIRS_BRICK_PERIDOT = stairs
                .setHardness(1.5f)
                .build("bonusblocks:block/stairs_brick_peridot", blockID++, b -> new BlockLogicStairs(b, BRICK_PERIDOT));

        PERIDOT_POLISHED = stone
                .setTextures("bonusblocks:block/polished_peridot_top")
                .setSideTextures("bonusblocks:block/polished_peridot_side")
                .build("peridot.polished", "bonusblocks:block/peridot_polished", blockID++, block -> new BlockLogic(block, Material.stone));
        PERIDOT_CARVED = stone
                .setTextures("bonusblocks:block/polished_peridot_top")
                .setSideTextures("bonusblocks:block/carved_peridot")
                .build("peridot.carved", "bonusblocks:block/peridot_carved", blockID++, block -> new BlockLogic(block, Material.stone));
        SLAB_PERIDOT_POLISHED = slab
                .build("bonusblocks:block/slab_peridot_polished", blockID++, b -> new BlockLogicSlab(b, PERIDOT_CARVED));

        // Pot

//        POT = new BlockBuilder(MOD_ID)
//                .setHardness(0.5f)
//                .setResistance(1.0f)
//                .setIcon("bonusblocks:item/pot")
//                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
//                .setBlockModel(block -> new DFBlockModelBuilder(MOD_ID).setBlockModel("block/pot.json").setRender3D(false).build(POT))
//                .build("pot", "bonusblocks:block/pot", blockID++, BlockLogicPot::new);


        //2.4 New Stuff

//        GIRDER_IRON = raw
//                .setVisualUpdateOnMetadata()
//                .setIcon("bonusblocks:block/girder_iron")
//                .setBlockModel(block -> new DFBlockModelBuilder(MOD_ID).setBlockModel("block/girder.json").setBlockState(MOD_ID, "girder_states.json").setMetaStateInterpreter(new PipeMetaStateInterpreter()).setRender3D(false).build(GIRDER_IRON))
//                .build("girder.iron", "bonusblocks:block/girder_iron", blockID++, BlockLogicPipe::new);

        FENCE_GOLD = raw
                .setBlockModel(block -> new BlockModelFenceThin<>(block, TextureRegistry.getTexture("bonusblocks:block/fence_gold_center"), null, TextureRegistry.getTexture("bonusblocks:block/fence_gold_top"), TextureRegistry.getTexture("bonusblocks:block/fence_gold_column")).withTextures("bonusblocks:block/fence_gold_center"))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build("fence.gold", "bonusblocks:block/fence_gold", blockID++, BlockFenceNoClimb::new);





        //3.0 New Stuff


        STAIRS_SCORCHEDSTONE = stairs
                .setHardness(0.8F)
                .build("bonusblocks:block/stairs_scorchedstone", blockID++, b -> new BlockLogicStairs(b, SCORCHEDSTONE));


        DOOR_GLASS_OBSIDIAN_BOTTOM = obsidian
                .setBlockModel(block -> new BlockModelDoorGlass<>(GLASS_OBSIDIAN))
                .setTextures("bonusblocks:block/door_glass_obsidian_bottom")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.glass.obsidian.bottom", "bonusblocks:block/door_glass_obsidian_bottom", blockID++, block -> new BlockLogicDoor(block, Material.glass, false, false, () -> BonusItems.DOOR_GLASS_OBSIDIAN));
        DOOR_GLASS_OBSIDIAN_TOP = obsidian
                .setBlockModel(block -> new BlockModelDoorGlass<>(GLASS_OBSIDIAN))
                .setTextures("bonusblocks:block/door_glass_obsidian_top")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.glass.obsidian.top", "bonusblocks:block/door_glass_obsidian_top", blockID++, block -> new BlockLogicDoor(block, Material.glass, true, false, () -> BonusItems.DOOR_GLASS_OBSIDIAN));


        TATAMI = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 0.8f, 1.2f))
                .setHardness(0.6f)
                .setResistance(0.6f)
                .setTextures("bonusblocks:block/tatami")
                .setFlammability(20, 40)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
                .build("TATAMI", "bonusblocks:block/tatami", blockID++, b -> new BlockLogic(b, Material.grass));



        //3.1 NEW STUFF
        FENCE_STEEL = raw
                .setBlockModel(block -> new BlockModelFenceThin<>(FENCE_STEEL, TextureRegistry.getTexture("bonusblocks:block/fence_steel_center"), null, TextureRegistry.getTexture("bonusblocks:block/fence_steel_top"), TextureRegistry.getTexture("bonusblocks:block/fence_steel_column")).withTextures("bonusblocks:block/fence_steel_center"))
                .setVisualUpdateOnMetadata()
                .setHardness(5.0f)
                .setResistance(4000.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build("fence.steel", "bonusblocks:block/fence_steel", blockID++, BlockFenceNoClimb::new);





        //3.2 NEW STUFF

        DOOR_STONE_BOTTOM = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_stone_bottom")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.stone.bottom", "bonusblocks:block/door_stone_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_STONE));
        DOOR_STONE_TOP = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_stone_top")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.stone.top", "bonusblocks:block/door_stone_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_STONE));


        DOOR_BASALT_BOTTOM = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_basalt_bottom")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.basalt.bottom", "bonusblocks:block/door_basalt_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_BASALT));
        DOOR_BASALT_TOP = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_basalt_top")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.basalt.top", "bonusblocks:block/door_basalt_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_BASALT));


        DOOR_LIMESTONE_BOTTOM = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_limestone_bottom")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.limestone.bottom", "bonusblocks:block/door_limestone_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_LIMESTONE));
        DOOR_LIMESTONE_TOP = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_limestone_top")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.limestone.top", "bonusblocks:block/door_limestone_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_LIMESTONE));


        DOOR_GRANITE_BOTTOM = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_granite_bottom")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.granite.bottom", "bonusblocks:block/door_granite_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_GRANITE));
        DOOR_GRANITE_TOP = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_granite_top")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.granite.top", "bonusblocks:block/door_granite_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_GRANITE));


        DOOR_MARBLE_BOTTOM = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_marble_bottom")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.marble.bottom", "bonusblocks:block/door_marble_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_MARBLE));
        DOOR_MARBLE_TOP = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_marble_top")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.marble.top", "bonusblocks:block/door_marble_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_MARBLE));


        DOOR_SLATE_BOTTOM = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_slate_bottom")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.slate.bottom", "bonusblocks:block/door_slate_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_SLATE));
        DOOR_SLATE_TOP = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_slate_top")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.slate.top", "bonusblocks:block/door_slate_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_SLATE));


        DOOR_PERMAFROST_BOTTOM = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_permafrost_bottom")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.permafrost.bottom", "bonusblocks:block/door_permafrost_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_PERMAFROST));
        DOOR_PERMAFROST_TOP = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_permafrost_top")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.permafrost.top", "bonusblocks:block/door_permafrost_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_PERMAFROST));


        DOOR_NETHERRACK_BOTTOM = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_netherrack_bottom")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.netherrack.bottom", "bonusblocks:block/door_netherrack_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_NETHERRACK));
        DOOR_NETHERRACK_TOP = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_netherrack_top")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.netherrack.top", "bonusblocks:block/door_netherrack_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_NETHERRACK));


        DOOR_LAZURITE_BOTTOM = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_lazurite_bottom")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.lazurite.bottom", "bonusblocks:block/door_lazurite_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_LAZURITE));
        DOOR_LAZURITE_TOP = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_lazurite_top")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.lazurite.top", "bonusblocks:block/door_lazurite_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_LAZURITE));


        DOOR_PERIDOT_BOTTOM = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_peridot_bottom")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.peridot.bottom", "bonusblocks:block/door_peridot_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_PERIDOT));
        DOOR_PERIDOT_TOP = stone
                .setBlockModel(block -> new BlockModelDoor(block))
                .setTextures("bonusblocks:block/door_peridot_top")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.peridot.top", "bonusblocks:block/door_peridot_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_PERIDOT));


        TRAPDOOR_STONE = stone
                .setBlockModel(BlockModelTrapDoor::new)
                .setTopBottomTextures("bonusblocks:block/trapdoor_stone_top")
                .setSideTextures("bonusblocks:block/trapdoor_stone_side")
                .setVisualUpdateOnMetadata()
                .build("trapdoor.stone", "bonusblocks:block/trapdoor_stone", blockID++, b -> new BlockLogicTrapDoorStone(b));

        TRAPDOOR_BASALT = stone
                .setBlockModel(BlockModelTrapDoor::new)
                .setTopBottomTextures("bonusblocks:block/trapdoor_basalt_top")
                .setSideTextures("bonusblocks:block/trapdoor_basalt_side")
                .setVisualUpdateOnMetadata()
                .build("trapdoor.basalt", "bonusblocks:block/trapdoor_basalt", blockID++, b -> new BlockLogicTrapDoorStone(b));

        TRAPDOOR_LIMESTONE = stone
                .setBlockModel(BlockModelTrapDoor::new)
                .setTopBottomTextures("bonusblocks:block/trapdoor_limestone_top")
                .setSideTextures("bonusblocks:block/trapdoor_limestone_side")
                .setVisualUpdateOnMetadata()
                .build("trapdoor.limestone", "bonusblocks:block/trapdoor_limestone", blockID++, b -> new BlockLogicTrapDoorStone(b));

        TRAPDOOR_GRANITE = stone
                .setBlockModel(BlockModelTrapDoor::new)
                .setTopBottomTextures("bonusblocks:block/trapdoor_granite_top")
                .setSideTextures("bonusblocks:block/trapdoor_granite_side")
                .setVisualUpdateOnMetadata()
                .build("trapdoor.granite", "bonusblocks:block/trapdoor_granite", blockID++, b -> new BlockLogicTrapDoorStone(b));

        TRAPDOOR_PERMAFROST = stone
                .setBlockModel(BlockModelTrapDoor::new)
                .setTopBottomTextures("bonusblocks:block/trapdoor_permafrost_top")
                .setSideTextures("bonusblocks:block/trapdoor_permafrost_side")
                .setVisualUpdateOnMetadata()
                .build("trapdoor.permafrost", "bonusblocks:block/trapdoor_permafrost", blockID++, b -> new BlockLogicTrapDoorStone(b));

        TRAPDOOR_MARBLE = stone
                .setBlockModel(BlockModelTrapDoor::new)
                .setTopBottomTextures("bonusblocks:block/trapdoor_marble_top")
                .setSideTextures("bonusblocks:block/trapdoor_marble_side")
                .setVisualUpdateOnMetadata()
                .build("trapdoor.marble", "bonusblocks:block/trapdoor_marble", blockID++, b -> new BlockLogicTrapDoorStone(b));

        TRAPDOOR_SLATE = stone
                .setBlockModel(BlockModelTrapDoor::new)
                .setTopBottomTextures("bonusblocks:block/trapdoor_slate_top")
                .setSideTextures("bonusblocks:block/trapdoor_slate_side")
                .setVisualUpdateOnMetadata()
                .build("trapdoor.slate", "bonusblocks:block/trapdoor_slate", blockID++, b -> new BlockLogicTrapDoorStone(b));

        TRAPDOOR_NETHERRACK = stone
                .setBlockModel(BlockModelTrapDoor::new)
                .setTopBottomTextures("bonusblocks:block/trapdoor_netherrack_top")
                .setSideTextures("bonusblocks:block/trapdoor_netherrack_side")
                .setVisualUpdateOnMetadata()
                .build("trapdoor.netherrack", "bonusblocks:block/trapdoor_netherrack", blockID++, b -> new BlockLogicTrapDoorStone(b));

        TRAPDOOR_LAZURITE = stone
                .setBlockModel(BlockModelTrapDoor::new)
                .setTopBottomTextures("bonusblocks:block/trapdoor_lazurite_top")
                .setSideTextures("bonusblocks:block/trapdoor_lazurite_side")
                .setVisualUpdateOnMetadata()
                .build("trapdoor.lazurite", "bonusblocks:block/trapdoor_lazurite", blockID++, b -> new BlockLogicTrapDoorStone(b));

        TRAPDOOR_PERIDOT = stone
                .setBlockModel(BlockModelTrapDoor::new)
                .setTopBottomTextures("bonusblocks:block/trapdoor_peridot_top")
                .setSideTextures("bonusblocks:block/trapdoor_peridot_side")
                .setVisualUpdateOnMetadata()
                .build("trapdoor.peridot", "bonusblocks:block/trapdoor_peridot", blockID++, b -> new BlockLogicTrapDoorStone(b));


//        BEDROLL = new BlockBuilder(MOD_ID)
//                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
//                .setBlockModel(BlockModelBedroll::new)
//                .setHardness(0.2f)
//                .setResistance(0.2f)
//                .setVisualUpdateOnMetadata()
//                .setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_AXE)
//                .build(new BlockBedroll("bedroll", "bonusblocks:block/bedroll", blockID++, Material.cloth));

    }
}
