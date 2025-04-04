package luke.bonusblocks.block;

import luke.bonusblocks.block.blockmodel.ItemBlockSlabWool;
import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.sound.BlockSound;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.CreativeHelper;

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
    public static Block<?>  BLOCK_GUNPOWDER;
    public static Block<?>  BLOCK_SUGAR;
    public static Block<BlockLogic> BLOCK_LEATHER;
    public static Block<BlockLogic> BLOCK_WICKER;
    public static Block<BlockLogic> BLOCK_FLINT;
    public static Block<BlockLogic> BLOCK_CRUDE_STEEL;
    public static Block<BlockLogic> BLOCK_RAW_GOLD;
    public static Block<BlockLogic> BLOCK_RAW_IRON;

    //STAIRS
    public static Block<BlockLogicStairs> STAIRS_WOOL;
    public static Block<BlockLogicStairs> STAIRS_COBBLESTONE_MOSSY;
    public static Block<BlockLogicStairs> STAIRS_BRICK_STONE_POLISHED_MOSSY;
    public static Block<BlockLogicStairs> STAIRS_BRICK_MUD;
    public static Block<BlockLogicStairs> STAIRS_BRICK_QUARTZ;
    public static Block<BlockLogicStairs> STAIRS_BRICK_OLIVINE;
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
    public static Block<BlockLogicSlab> SLAB_BRICK_MUD;
    public static Block<BlockLogicSlab> SLAB_BRICK_QUARTZ;
    public static Block<BlockLogicSlab> SLAB_BRICK_OLIVINE;
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


    public static Block<BlockLogic> BOX;

    public static Block<?>  CRATE;
    public static Block<?>  CRATE_PAINTED;

    public static Block<BlockLogic> BOOKSHELF_EMPTY_PLANKS_OAK;

    public static Block<BlockMossy> MOSS;

    public static Block<BlockLogic> GRASS_OVERGROWN;
    public static Block<BlockLogic> GRASS_SCORCHED_OVERGROWN;
    public static Block<BlockLogic> PATH_DIRT_OVERGROWN;

    public static Block<BlockLogicFlowerStackable> FLOWER_SILVER;
    public static Block<BlockLogicFlowerStackable> FLOWER_CYAN;
    public static Block<BlockLogicFlowerStackable> FLOWER_MAGENTA;
    public static Block<BlockLogicFlowerStackable> FLOWER_LIME;

    public static Block<?>  MUSHROOM_GRAY;

    public static Block<BlockLogic> FUNGI_RED;
    public static Block<BlockLogic> FUNGI_BROWN;
    public static Block<BlockLogic> FUNGI_GRAY;

    public static Block<?>  OVERLAY_RAW_GOLD;
    public static Block<?>  OVERLAY_RAW_IRON;

    public static Block<?>  PILLAR_SLATE;
    public static Block<?>  CAPSTONE_SLATE;

    public static Block<BlockLogic> MARBLE_POLISHED;

    public static Block<BlockLogic> SLATE_CARVED;
    public static Block<BlockLogic> MARBLE_CARVED;

    public static Block<BlockLogic> BLOCK_CLAY_BAKED;

    public static Block<?>  GLASS_OBSIDIAN;
    public static Block<?>  GLASS_QUARTZ;

    public static Block<BlockLogic> BRICK_MUD;
    public static Block<BlockLogic> BRICK_QUARTZ;
    public static Block<BlockLogic> BRICK_OLIVINE;

    public static Block<?>  CANDLE_SOULWAX;

    public static Block<BlockLogic> BRICK_CLAY_BAKED;

    public static Block<BlockLogic> DIRT_BAKED;

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

    public static Block<?>  GIRDER_IRON;
    public static Block<BlockLogicFenceThin>  FENCE_GOLD;

    public static Block<BlockLogic> TATAMI;


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


        miningLevels.put(BLOCK_RAW_GOLD, 2);
        miningLevels.put(FENCE_GOLD, 2);
        miningLevels.put(BRICK_STEEL, 2);
        miningLevels.put(BLOCK_CRUDE_STEEL, 2);


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
        CreativeHelper.setParent(GRASS_SCORCHED_OVERGROWN, GRASS_SCORCHED);
        CreativeHelper.setParent(PATH_DIRT_OVERGROWN, PATH_DIRT);

        CreativeHelper.setParent(DIRT_BAKED, DIRT);

        CreativeHelper.setParent(SKULL, PUMPKIN_CARVED_ACTIVE);
        CreativeHelper.setParent(SKULL_CARVED_IDLE, PUMPKIN_CARVED_ACTIVE);
        CreativeHelper.setParent(SKULL_CARVED_ACTIVE, PUMPKIN_CARVED_ACTIVE);

        CreativeHelper.setParent(GLASS_OBSIDIAN, GLASS);
        CreativeHelper.setParent(GLASS_QUARTZ, GLASS_TINTED);

        CreativeHelper.setParent(TRAPDOOR_GLASS_OBSIDIAN, TRAPDOOR_GLASS);

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

        CreativeHelper.setParent(BLOCK_CLAY_BAKED, BLOCK_CLAY);

        CreativeHelper.setParent(BLOCK_GUNPOWDER, GRAVEL);
        CreativeHelper.setParent(BLOCK_SUGAR, GRAVEL);

        CreativeHelper.setParent(BRICK_MUD, BRICK_IRON);
        CreativeHelper.setParent(BRICK_STEEL, BRICK_IRON);
        CreativeHelper.setParent(BRICK_QUARTZ, BRICK_IRON);
        CreativeHelper.setParent(BRICK_OLIVINE, BRICK_IRON);
        CreativeHelper.setParent(BRICK_CLAY_BAKED, BRICK_IRON);
        CreativeHelper.setParent(BRICK_LAZURITE, BRICK_IRON);
        CreativeHelper.setParent(BRICK_PERIDOT, BRICK_IRON);
        CreativeHelper.setParent(FENCE_GOLD, FENCE_CHAINLINK);


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
        CreativeHelper.setParent(BLOCK_FLINT, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_CRUDE_STEEL, BLOCK_CHARCOAL);

        CreativeHelper.setParent(SLAB_COBBLESTONE_MOSSY, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_SLATE_POLISHED, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_MARBLE_POLISHED, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_STONE_POLISHED_MOSSY, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_MUD, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_QUARTZ, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_OLIVINE, SLAB_BASALT_POLISHED);
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
        CreativeHelper.setParent(STAIRS_BRICK_MUD, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_QUARTZ, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_OLIVINE, STAIRS_BRICK_STONE);
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
                .build("log.shrub", "bonusblocks:block/log_shrub", blockID++, BlockLogicLog::new);
        LOG_CACAO = log
                .build("log.cacao", "bonusblocks:block/log_cacao", blockID++, BlockLogicLog::new);
        LOG_JACARANDA = log
                .build("log.jacaranda", "bonusblocks:block/log_jacaranda", blockID++, BlockLogicLog::new);
        LOG_SCORCHED = log
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.2f))
                .setHardness(1.8f)
                .build("log.scorched", "bonusblocks:block/log_scorched", blockID++, BlockLogicLog::new);


        // Moss
        MOSS = grass
                .setFlammability(100, 30)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
                .build("moss", "bonusblocks:block/moss", blockID++, b -> new BlockMossy(b, Material.moss));


        // Overgrown Grass
        GRASS_OVERGROWN = grass
                .build("grass.overgrown", "bonusblocks:block/grass_overgrown", blockID++, b -> new BlockLogic(b, Material.grass));
        GRASS_SCORCHED_OVERGROWN = grass
                .build("grass.scorched.overgrown", "bonusblocks:block/grass_scorched_overgrown", blockID++, b -> new BlockLogic(b, Material.grass));
        PATH_DIRT_OVERGROWN = grass
                .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                .build("path.overgrown", "bonusblocks:block/dirt_path_overgrown", blockID++, BlockLogicPathDirt::new);

        // Flowers

        FLOWER_SILVER = flower
                .build("flower.silver", "bonusblocks:block/flower_silver", blockID++, BlockLogicFlowerStackable::new);

        FLOWER_CYAN = flower
                .build("flower.cyan", "bonusblocks:block/flower_cyan", blockID++, BlockLogicFlowerStackable::new);

        FLOWER_MAGENTA = flower
                .build("flower.magenta", "bonusblocks:block/flower_magenta", blockID++, BlockLogicFlowerStackable::new);
        FLOWER_LIME = flower
                .build("flower.lime", "bonusblocks:block/flower_lime", blockID++, BlockLogicFlowerStackable::new);

        // Petals
        PETAL_YELLOW = petal
                .build("petal.yellow", "bonusblocks:block/petal_yellow", blockID++, BlockLogicPetal::new);
        PETAL_RED = petal
                .build("petal.red", "bonusblocks:block/petal_red", blockID++, BlockLogicPetal::new);
        PETAL_CYAN = petal
                .build("petal.cyan", "bonusblocks:block/petal_cyan", blockID++, BlockLogicPetal::new);
        PETAL_PURPLE = petal
                .build("petal.purple", "bonusblocks:block/petal_purple", blockID++, BlockLogicPetal::new);
        PETAL_PINK = petal
                .build("petal.pink", "bonusblocks:block/petal_pink", blockID++, BlockLogicPetal::new);
        PETAL_SILVER = petal
                .build("petal.silver", "bonusblocks:block/petal_silver", blockID++, BlockLogicPetal::new);
        PETAL_ORANGE = petal
                .build("petal.orange", "bonusblocks:block/petal_orange", blockID++, BlockLogicPetal::new);
        PETAL_LIGHT_BLUE = petal
                .build("petal.lightblue", "bonusblocks:block/petal_light_blue", blockID++, BlockLogicPetal::new);
        PETAL_MAGENTA = petal
                .build("petal.magenta", "bonusblocks:block/petal_magenta", blockID++, BlockLogicPetal::new);
        PETAL_LIME = petal
                .build("petal.lime", "bonusblocks:block/petal_lime", blockID++, BlockLogicPetal::new);

        // Petal Layers
        PETAL_LAYER_YELLOW = petalLayer
                .build("layer.petal.yellow", "bonusblocks:block/petal_layer_yellow", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_RED = petalLayer
                .build("layer.petal.red", "bonusblocks:block/petal_layer_red", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_CYAN = petalLayer
                .build("layer.petal.cyan", "bonusblocks:block/petal_layer_cyan", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_PURPLE = petalLayer
                .build("layer.petal.purple", "bonusblocks:block/petal_layer_purple", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_PINK = petalLayer
                .build("layer.petal.pink", "bonusblocks:block/petal_layer_pink", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_SILVER = petalLayer
                .build("layer.petal.silver", "bonusblocks:block/petal_layer_lightgray", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_ORANGE = petalLayer
                .build("layer.petal.orange", "bonusblocks:block/petal_layer_orange", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_LIGHT_BLUE = petalLayer
                .build("layer.petal.lightblue", "bonusblocks:block/petal_layer_lightblue", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_MAGENTA = petalLayer
                .build("layer.petal.magenta", "bonusblocks:block/petal_layer_magenta", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_LIME = petalLayer
                .build("layer.petal.lime", "bonusblocks:block/petal_layer_lime", blockID++, BlockLogicLayerPetal::new);

        // Mushroom
        MUSHROOM_GRAY = flower
                .build("mushroom.gray", "bonusblocks:block/mushroom_gray", blockID++, BlockLogicMushroom::new);

        // Mushroom Blocks
        FUNGI_BROWN = grass
                .setLuminance(2)
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build("fungi.brown", "bonusblocks:block/fungi_brown", blockID++, b -> new BlockLogic(b, Material.dirt));
        FUNGI_RED = grass
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build("fungi.red", "bonusblocks:block/fungi_red", blockID++, b -> new BlockLogic(b, Material.dirt));
        FUNGI_GRAY = grass
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build("fungi.gray", "bonusblocks:block/fungi_gray", blockID++, b -> new BlockLogic(b, Material.dirt));

        // Bone Block
        BLOCK_BONE = stone
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .build("block.bone","bonusblocks:block/block_bone", blockID++, b -> new BlockLogicAxisAligned(b, Material.dirt));

        // Cloth Block
        BLOCK_CLOTH = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.8f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.MINEABLE_BY_AXE)
                .build("block.cloth","bonusblocks:block/block_cloth", blockID++, BlockCloth::new);

        // Slime Block
        BLOCK_SLIME = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.5f))
                .setHardness(0.2f)
                .setResistance(0.2f)
                .setLightOpacity(6)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build("block.slime","bonusblocks:block/block_slime", blockID++, BlockSlime::new);

        // Sulphur Block
        BLOCK_GUNPOWDER = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                .setHardness(0.5f)
                .setResistance(0.5f)
                .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                .build("block.sulphur", "bonusblocks:block/block_gunpowder", blockID++, BlockLogicSulphur::new);

        // Sugar Block
        BLOCK_SUGAR = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                .setHardness(0.3f)
                .setResistance(0.3f)
                .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.BROKEN_BY_FLUIDS)
                .build("block.sugar","bonusblocks:block/block_sugar", blockID++, BlockLogicSand::new);

        // Leather Block
        BLOCK_LEATHER = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.6f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setFlammability(5, 10)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build("block.leather","bonusblocks:block/block_leather", blockID++, b -> new BlockLogic(b, Material.cloth));

        // Wicker Block
        BLOCK_WICKER = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.5f)
                .setResistance(0.5f)
                .setFlammability(60, 120)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build("block.wicker","bonusblocks:block/wicker", blockID++, b -> new BlockLogic(b, Material.cloth));

        // Flint Block
        BLOCK_FLINT = raw
                .setInfiniburn()
                .build("block.flint","bonusblocks:block/block_flint", blockID++, b -> new BlockLogic(b, Material.stone));

        // Crude Steel Block
        BLOCK_CRUDE_STEEL = raw
                .setHardness(4.0f)
                .setResistance(1000.0f)
                .build("block.steel.crude", "bonusblocks:block/block_steel_crude", blockID++, b -> new BlockLogic(b, Material.metal));

        // Raw Blocks
        BLOCK_RAW_IRON = raw
                .build("block.raw.iron", "bonusblocks:block/block_raw_iron", blockID++, b -> new BlockLogic(b, Material.metal));
        BLOCK_RAW_GOLD = raw
                .build("block.raw.gold", "bonusblocks:block/block_raw_gold", blockID++, b -> new BlockLogic(b, Material.metal));
        // Nuggets

        // Make Custom BlockMODEL for these fuckers
        OVERLAY_RAW_IRON = pebble
                .build("overlay.iron", "bonusblocks:block/overlay_raw_iron", blockID++, BlockLogicOverlayNuggetsIron::new);
        OVERLAY_RAW_GOLD = pebble
                .build("overlay.gold", "bonusblocks:block/overlay_raw_gold", blockID++, BlockLogicOverlayNuggetsGold::new);


        // Slate Pillar
        PILLAR_SLATE = stone
                .build("pillar.slate", "bonusblocks:block/pillar_slate", blockID++, b -> new BlockLogic(b, Material.stone));


        // Polished Stones
        MARBLE_POLISHED = stone
                .setHardness(1.0f)
                .build("marble.polished", "bonusblocks:block/marble_polished", blockID++, b -> new BlockLogic(b, Material.stone));


        // Carved Stones
        SLATE_CARVED = stone
                .build("slate.carved", "bonusblocks:block/slate_carved", blockID++, b -> new BlockLogic(b, Material.stone));
        MARBLE_CARVED = stone
                .build("marble.carved", "bonusblocks:block/marble_carved", blockID++, b -> new BlockLogic(b, Material.stone));


        // Baked Clay
        BLOCK_CLAY_BAKED = stone
                .setHardness(3.0f)
                .build("block.clay.baked", "bonusblocks:block/block_clay_baked", blockID++, b -> new BlockLogic(b, Material.stone));


        // Obsidian Glass
        GLASS_OBSIDIAN = obsidian
                .build("glass.obsidian", "bonusblocks:block/glass_obsidian", blockID++, BlockLogicGlassObsidian::new);

        TRAPDOOR_GLASS_OBSIDIAN = obsidian
                .setVisualUpdateOnMetadata()
                .build("trapdoor.glass.obsidian", "bonusblocks:block/trapdoor_glass_obsidian", blockID++, b -> new BlockTrapDoorObsidian(b, Material.glass));

        // Quartz Glass
        GLASS_QUARTZ = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(0.3F)
                .setResistance(0.3F)
                .setVisualUpdateOnMetadata()
                .setUseInternalLight()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("glass.quartz", "bonusblocks:block/glass_quartz", blockID++, BlockLogicGlassQuartz::new);


        BRICK_MUD = brick
                .setHardness(1.5f)
                .build("brick.mud", "bonusblocks:block/brick_mud", blockID++, b -> new BlockLogic(b, Material.stone));

        BRICK_QUARTZ = brick
                .setHardness(3.0f)
                .build("brick.quartz", "bonusblocks:block/brick_quartz", blockID++, b -> new BlockLogic(b, Material.stone));
        BRICK_OLIVINE = brick
                .setHardness(3.0f)
                .build("brick.olivine", "bonusblocks:block/brick_olivine", blockID++, b -> new BlockLogic(b, Material.stone));


        // Soul Candle
        CANDLE_SOULWAX = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 1.2f))
                .setHardness(0.0f)
                .setResistance(0.0f)
                .setLuminance(10)
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
        SLAB_BRICK_MUD = slab
                .build("bonusblocks:block/slab_brick_mud", blockID++, b -> new BlockLogicSlab(b, BRICK_MUD));
        SLAB_BRICK_QUARTZ = slab
                .setHardness(3.0f)
                .build("bonusblocks:block/slab_brick_quartz", blockID++, b -> new BlockLogicSlab(b, BRICK_QUARTZ));
        SLAB_BRICK_OLIVINE = slab
                .setHardness(3.0f)
                .build("bonusblocks:block/slab_brick_olivine", blockID++, b -> new BlockLogicSlab(b, BRICK_OLIVINE));


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
        STAIRS_BRICK_MUD = stairs
                .setHardness(1.5f)
                .build("bonusblocks:block/stairs_brick_mud", blockID++, b -> new BlockLogicStairs(b, BRICK_MUD));
        STAIRS_BRICK_QUARTZ = stairs
                .setHardness(3.0f)
                .build("bonusblocks:block/stairs_brick_quartz", blockID++, b -> new BlockLogicStairs(b, BRICK_QUARTZ));
        STAIRS_BRICK_OLIVINE = stairs
                .setHardness(3.0f)
                .build("bonusblocks:block/stairs_brick_olivine", blockID++, b -> new BlockLogicStairs(b, BRICK_OLIVINE));



        //2.2 New Stuff

        // Baked Clay Bricks
        BRICK_CLAY_BAKED = stone
                .build("brick.clay.baked", "bonusblocks:block/brick_clay_baked", blockID++, block -> new BlockLogic(block, Material.stone));

        SLAB_BRICK_CLAY_BAKED = slab
                .build("bonusblocks:block/slab_brick_clay_baked", blockID++, b -> new BlockLogicSlab(b, BRICK_CLAY_BAKED));

        STAIRS_BRICK_CLAY_BAKED = stairs
                .build("bonusblocks:block/stairs_brick_clay_baked", blockID++, b -> new BlockLogicStairs(b, BRICK_CLAY_BAKED));

        // Rough Dirt
        DIRT_BAKED = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.gravel", "step.gravel", 1.0f, 0.8f))
                .setHardness(0.6f)
                .setResistance(0.6f)
                .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.CAVES_CUT_THROUGH)
                .build("dirt.rough", "bonusblocks:block/dirt_baked", blockID++, block -> new BlockLogic(block, Material.dirt));

        // Skull
        SKULL_CARVED_IDLE = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("skull.carved.idle", "bonusblocks:block/skull_carved_idle", blockID++, b -> new BlockLogicSkull(b, true));

        SKULL_CARVED_ACTIVE = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setLuminance(15)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("skull.carved.active", "bonusblocks:block/skull_carved_active", blockID++, b -> new BlockLogicSkull(b, false));

        SKULL = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("skull", "bonusblocks:block/skull", blockID++, b -> new BlockLogicSkull(b, false));

        SKULL_REDSTONE = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("skull.redstone", "bonusblocks:block/skull_redstone", blockID++, BlockLogicSkullRedstone::new);




        // 2.3 New Stuff

        // Lazurite

        LAZURITE = stone
                .build("lazurite", "bonusblocks:block/lazurite", blockID++, block -> new BlockLogicStone(block, COBBLE_LAZURITE, Material.stone));

        COBBLE_LAZURITE = stone
                .setHardness(2.0f)
                .build("cobble.lazurite", "bonusblocks:block/cobble_lazurite", blockID++, block -> new BlockLogic(block, Material.stone));
        SLAB_COBBLE_LAZURITE = slab
                .setHardness(2.0F)
                .build("bonusblocks:block/slab_cobble_lazurite", blockID++, b -> new BlockLogicSlab(b, COBBLE_LAZURITE));
        STAIRS_COBBLE_LAZURITE = stairs
                .setHardness(2.0F)
                .build("bonusblocks:block/stairs_cobble_lazurite", blockID++, b -> new BlockLogicStairs(b, COBBLE_LAZURITE));

        BRICK_LAZURITE = brick
                .setHardness(1.5f)
                .build("brick.lazurite", "bonusblocks:block/brick_lazurite", blockID++, block -> new BlockLogic(block, Material.stone));
        SLAB_BRICK_LAZURITE = slab
                .setHardness(1.5f)
                .build("bonusblocks:block/slab_brick_lazurite", blockID++, b -> new BlockLogicSlab(b, BRICK_LAZURITE));
        STAIRS_BRICK_LAZURITE = stairs
                .setHardness(1.5f)
                .build("bonusblocks:block/stairs_brick_lazurite", blockID++, b -> new BlockLogicStairs(b, BRICK_LAZURITE));

        LAZURITE_POLISHED = stone
                .build("lazurite.polished", "bonusblocks:block/lazurite_polished", blockID++, block -> new BlockLogic(block, Material.stone));
        LAZURITE_CARVED = stone
                .build("lazurite.carved", "bonusblocks:block/lazurite_carved", blockID++, block -> new BlockLogic(block, Material.stone));
        SLAB_LAZURITE_POLISHED = slab
                .build("bonusblocks:block/slab_lazurite_polished", blockID++, b -> new BlockLogicSlab(b, LAZURITE_CARVED));


        // Peridot

        PERIDOT = stone
                .build("peridot", "bonusblocks:block/peridot", blockID++, block -> new BlockLogicStone(block, COBBLE_PERIDOT, Material.stone));

        COBBLE_PERIDOT = stone
                .setHardness(2.0f)
                .build("cobble.peridot", "bonusblocks:block/cobble_peridot", blockID++, block -> new BlockLogic(block, Material.stone));
        SLAB_COBBLE_PERIDOT = slab
                .setHardness(2.0F)
                .build("bonusblocks:block/slab_cobble_peridot", blockID++, b -> new BlockLogicSlab(b, COBBLE_PERIDOT));
        STAIRS_COBBLE_PERIDOT = stairs
                .setHardness(2.0F)
                .build("bonusblocks:block/stairs_cobble_peridot", blockID++, b -> new BlockLogicStairs(b, COBBLE_PERIDOT));

        BRICK_PERIDOT = brick
                .setHardness(1.5f)
                .build("brick.peridot", "bonusblocks:block/brick_peridot", blockID++, block -> new BlockLogic(block, Material.stone));
        SLAB_BRICK_PERIDOT = slab
                .setHardness(1.5f)
                .build("bonusblocks:block/slab_brick_peridot", blockID++, b -> new BlockLogicSlab(b, BRICK_PERIDOT));
        STAIRS_BRICK_PERIDOT = stairs
                .setHardness(1.5f)
                .build("bonusblocks:block/stairs_brick_peridot", blockID++, b -> new BlockLogicStairs(b, BRICK_PERIDOT));

        PERIDOT_POLISHED = stone
                .build("peridot.polished", "bonusblocks:block/peridot_polished", blockID++, block -> new BlockLogic(block, Material.stone));
        PERIDOT_CARVED = stone
                .build("peridot.carved", "bonusblocks:block/peridot_carved", blockID++, block -> new BlockLogic(block, Material.stone));
        SLAB_PERIDOT_POLISHED = slab
                .build("bonusblocks:block/slab_peridot_polished", blockID++, b -> new BlockLogicSlab(b, PERIDOT_CARVED));

        //2.4 New Stuff

//        GIRDER_IRON = raw
//                .setVisualUpdateOnMetadata()
//                .setIcon("bonusblocks:block/girder_iron")
//                .setBlockModel(block -> new DFBlockModelBuilder(MOD_ID).setBlockModel("block/girder.json").setBlockState(MOD_ID, "girder_states.json").setMetaStateInterpreter(new PipeMetaStateInterpreter()).setRender3D(false).build(GIRDER_IRON))
//                .build("girder.iron", "bonusblocks:block/girder_iron", blockID++, BlockLogicPipe::new);

        FENCE_GOLD = raw
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build("fence.gold", "bonusblocks:block/fence_gold", blockID++, BlockFenceNoClimb::new);





        //3.0 New Stuff

        DOOR_GLASS_OBSIDIAN_BOTTOM = obsidian
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.glass.obsidian.bottom", "bonusblocks:block/door_glass_obsidian_bottom", blockID++, block -> new BlockLogicDoor(block, Material.glass, false, false, () -> BonusItems.DOOR_GLASS_OBSIDIAN));
        DOOR_GLASS_OBSIDIAN_TOP = obsidian
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.glass.obsidian.top", "bonusblocks:block/door_glass_obsidian_top", blockID++, block -> new BlockLogicDoor(block, Material.glass, true, false, () -> BonusItems.DOOR_GLASS_OBSIDIAN));


        TATAMI = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 0.8f, 1.2f))
                .setHardness(0.6f)
                .setResistance(0.6f)
                .setFlammability(20, 40)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
                .build("TATAMI", "bonusblocks:block/tatami", blockID++, b -> new BlockLogic(b, Material.grass));

        //3.2 NEW STUFF

        DOOR_STONE_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.stone.bottom", "bonusblocks:block/door_stone_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_STONE));
        DOOR_STONE_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.stone.top", "bonusblocks:block/door_stone_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_STONE));


        DOOR_BASALT_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.basalt.bottom", "bonusblocks:block/door_basalt_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_BASALT));
        DOOR_BASALT_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.basalt.top", "bonusblocks:block/door_basalt_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_BASALT));


        DOOR_LIMESTONE_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.limestone.bottom", "bonusblocks:block/door_limestone_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_LIMESTONE));
        DOOR_LIMESTONE_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.limestone.top", "bonusblocks:block/door_limestone_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_LIMESTONE));


        DOOR_GRANITE_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.granite.bottom", "bonusblocks:block/door_granite_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_GRANITE));
        DOOR_GRANITE_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.granite.top", "bonusblocks:block/door_granite_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_GRANITE));


        DOOR_MARBLE_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.marble.bottom", "bonusblocks:block/door_marble_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_MARBLE));
        DOOR_MARBLE_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.marble.top", "bonusblocks:block/door_marble_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_MARBLE));


        DOOR_SLATE_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.slate.bottom", "bonusblocks:block/door_slate_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_SLATE));
        DOOR_SLATE_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.slate.top", "bonusblocks:block/door_slate_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_SLATE));


        DOOR_PERMAFROST_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.permafrost.bottom", "bonusblocks:block/door_permafrost_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_PERMAFROST));
        DOOR_PERMAFROST_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.permafrost.top", "bonusblocks:block/door_permafrost_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_PERMAFROST));


        DOOR_NETHERRACK_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.netherrack.bottom", "bonusblocks:block/door_netherrack_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_NETHERRACK));
        DOOR_NETHERRACK_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.netherrack.top", "bonusblocks:block/door_netherrack_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_NETHERRACK));


        DOOR_LAZURITE_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.lazurite.bottom", "bonusblocks:block/door_lazurite_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_LAZURITE));
        DOOR_LAZURITE_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.lazurite.top", "bonusblocks:block/door_lazurite_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_LAZURITE));


        DOOR_PERIDOT_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.peridot.bottom", "bonusblocks:block/door_peridot_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_PERIDOT));
        DOOR_PERIDOT_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.peridot.top", "bonusblocks:block/door_peridot_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_PERIDOT));


        TRAPDOOR_STONE = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.stone", "bonusblocks:block/trapdoor_stone", blockID++, BlockLogicTrapDoorStone::new);

        TRAPDOOR_BASALT = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.basalt", "bonusblocks:block/trapdoor_basalt", blockID++, BlockLogicTrapDoorStone::new);

        TRAPDOOR_LIMESTONE = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.limestone", "bonusblocks:block/trapdoor_limestone", blockID++, BlockLogicTrapDoorStone::new);

        TRAPDOOR_GRANITE = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.granite", "bonusblocks:block/trapdoor_granite", blockID++, BlockLogicTrapDoorStone::new);

        TRAPDOOR_PERMAFROST = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.permafrost", "bonusblocks:block/trapdoor_permafrost", blockID++, BlockLogicTrapDoorStone::new);

        TRAPDOOR_MARBLE = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.marble", "bonusblocks:block/trapdoor_marble", blockID++, BlockLogicTrapDoorStone::new);

        TRAPDOOR_SLATE = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.slate", "bonusblocks:block/trapdoor_slate", blockID++, BlockLogicTrapDoorStone::new);

        TRAPDOOR_NETHERRACK = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.netherrack", "bonusblocks:block/trapdoor_netherrack", blockID++, BlockLogicTrapDoorStone::new);

        TRAPDOOR_LAZURITE = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.lazurite", "bonusblocks:block/trapdoor_lazurite", blockID++, BlockLogicTrapDoorStone::new);

        TRAPDOOR_PERIDOT = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.peridot", "bonusblocks:block/trapdoor_peridot", blockID++, BlockLogicTrapDoorStone::new);

    }
}
