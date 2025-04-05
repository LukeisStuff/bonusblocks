package luke.bonusblocks;

import luke.bonusblocks.block.*;
import luke.bonusblocks.block.blockmodel.ItemBlockSlabWool;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.crafting.LookupFuelFurnaceBlast;
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


    //FLOWERS
    public static Block<BlockLogicFlowerStackable> FLOWER_SILVER;
    public static Block<BlockLogicFlowerStackable> FLOWER_CYAN;
    public static Block<BlockLogicFlowerStackable> FLOWER_MAGENTA;
    public static Block<BlockLogicFlowerStackable> FLOWER_LIME;


    //MUSHROOMS
    public static Block<?>  MUSHROOM_GRAY;

    public static Block<BlockLogic> FUNGI_RED;
    public static Block<BlockLogic> FUNGI_BROWN;
    public static Block<BlockLogic> FUNGI_GRAY;


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
    public static Block<BlockLogic> BLOCK_RAW_GOLD;
    public static Block<BlockLogic> BLOCK_RAW_IRON;


    //GLASS
    public static Block<?>  GLASS_OBSIDIAN;
    public static Block<?>  GLASS_QUARTZ;

    //BRICKS
    public static Block<BlockLogic> BRICK_MUD;
    public static Block<BlockLogic> BRICK_QUARTZ;
    public static Block<BlockLogic> BRICK_OLIVINE;
    public static Block<BlockLogic> BRICK_CLAY_BAKED;


    //STAIRS
    public static Block<BlockLogicStairs> STAIRS_WOOL;
    public static Block<BlockLogicStairs> STAIRS_COBBLESTONE_MOSSY;
    public static Block<BlockLogicStairs> STAIRS_BRICK_STONE_POLISHED_MOSSY;
    public static Block<BlockLogicStairs> STAIRS_BRICK_MUD;
    public static Block<BlockLogicStairs> STAIRS_BRICK_QUARTZ;
    public static Block<BlockLogicStairs> STAIRS_BRICK_OLIVINE;
    public static Block<BlockLogicStairs> STAIRS_BRICK_CLAY_BAKED;


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


    //TRAPDOORS
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_STONE;
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_BASALT;
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_LIMESTONE;
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_GRANITE;
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_MARBLE;
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_SLATE;
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_PERMAFROST;
    public static Block<BlockLogicTrapDoorStone> TRAPDOOR_NETHERRACK;
    public static Block<BlockLogicTrapDoor> TRAPDOOR_GLASS_OBSIDIAN;
    public static Block<BlockLogicTrapDoor> TRAPDOOR_GLASS_QUARTZ;
    public static Block<BlockLogicTrapDoor> TRAPDOOR_GLASS_STEEL;


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
    public static Block<BlockLogicDoor> DOOR_GLASS_OBSIDIAN_BOTTOM;
    public static Block<BlockLogicDoor> DOOR_GLASS_OBSIDIAN_TOP;
    public static Block<BlockLogicDoor> DOOR_GLASS_QUARTZ_BOTTOM;
    public static Block<BlockLogicDoor> DOOR_GLASS_QUARTZ_TOP;
    public static Block<BlockLogicDoor> DOOR_GLASS_STEEL_BOTTOM;
    public static Block<BlockLogicDoor> DOOR_GLASS_STEEL_TOP;

    public static Block<BlockLogic> BOOKSHELF_EMPTY_PLANKS_OAK;

    public static Block<BlockMossy> MOSS;

    public static Block<BlockLogic> GRASS_OVERGROWN;
    public static Block<BlockLogic> GRASS_SCORCHED_OVERGROWN;
    public static Block<BlockLogic> PATH_DIRT_OVERGROWN;


    public static Block<?>  OVERLAY_RAW_GOLD;
    public static Block<?>  OVERLAY_RAW_IRON;
    public static Block<?>  OVERLAY_FLINT;

    public static Block<?>  PILLAR_SLATE;
    public static Block<?>  CAPSTONE_SLATE;

    public static Block<BlockLogic> MARBLE_POLISHED;

    public static Block<BlockLogic> SLATE_CARVED;
    public static Block<BlockLogic> MARBLE_CARVED;

    public static Block<BlockLogic> BLOCK_CLAY_BAKED;

    public static Block<?>  CANDLE_SOULWAX;

    public static Block<BlockLogic> DIRT_BAKED;

    public static Block<?>  SKULL;
    public static Block<?>  SKULL_CARVED_IDLE;
    public static Block<?>  SKULL_CARVED_ACTIVE;
    public static Block<?>  SKULL_REDSTONE;

    public static Block<BlockLogicFenceThin>  FENCE_GOLD;

    public static Block<BlockLogic> TATAMI;


    public void initializeBlockDetails() {
        miningLevels.put(BLOCK_RAW_IRON, 1);


        miningLevels.put(BLOCK_RAW_GOLD, 2);
        miningLevels.put(FENCE_GOLD, 2);
        miningLevels.put(BRICK_STEEL, 2);


        stoneToMossMap.put(SAPLING_OAK, BonusBlocks.SAPLING_OAK_MOSSY);
        stoneToMossMap.put(MOSS_STONE, BonusBlocks.MOSS);
        stoneToMossMap.put(MOSS_BASALT, BonusBlocks.MOSS);
        stoneToMossMap.put(MOSS_LIMESTONE, BonusBlocks.MOSS);
        stoneToMossMap.put(MOSS_GRANITE, BonusBlocks.MOSS);


        LookupFuelFurnace.instance.addFuelEntry(LOG_JACARANDA.id(), 300);
        LookupFuelFurnace.instance.addFuelEntry(LOG_SCORCHED.id(), 300);
        LookupFuelFurnace.instance.addFuelEntry(LOG_CACAO.id(), 300);
        LookupFuelFurnace.instance.addFuelEntry(LOG_SHRUB.id(), 300);

        LookupFuelFurnace.instance.addFuelEntry(BOOKSHELF_EMPTY_PLANKS_OAK.id(), 300);
        LookupFuelFurnace.instance.addFuelEntry(BRANCH.id(), 300);
        LookupFuelFurnace.instance.addFuelEntry(SAPLING_JACARANDA.id(), 100);
        LookupFuelFurnace.instance.addFuelEntry(SAPLING_OAK_MOSSY.id(), 100);

        LookupFuelFurnaceBlast.instance.addFuelEntry(BRICK_OLIVINE.id(), 200);
        LookupFuelFurnaceBlast.instance.addFuelEntry(STAIRS_BRICK_OLIVINE.id(), 200);
        LookupFuelFurnaceBlast.instance.addFuelEntry(SLAB_BRICK_OLIVINE.id(), 100);


        CreativeHelper.setParent(PILLAR_SLATE, PILLAR_MARBLE);

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
        CreativeHelper.setParent(FENCE_GOLD, FENCE_CHAINLINK);


        CreativeHelper.setParent(MARBLE_POLISHED, SLATE_POLISHED);

        CreativeHelper.setParent(BLOCK_BONE, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_CLOTH, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_SLIME, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_LEATHER, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_WICKER, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_RAW_GOLD, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_RAW_IRON, BLOCK_CHARCOAL);
        CreativeHelper.setParent(BLOCK_FLINT, BLOCK_CHARCOAL);

        CreativeHelper.setParent(SLAB_COBBLESTONE_MOSSY, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_SLATE_POLISHED, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_MARBLE_POLISHED, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_STONE_POLISHED_MOSSY, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_MUD, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_QUARTZ, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_OLIVINE, SLAB_BASALT_POLISHED);
        CreativeHelper.setParent(SLAB_BRICK_CLAY_BAKED, SLAB_BASALT_POLISHED);


        for (int color = 0; color < 16; color++) {
            CreativeHelper.setParent(SLAB_WOOL, color << 4, SLAB_BASALT_POLISHED, 0);
        }

        CreativeHelper.setParent(STAIRS_COBBLESTONE_MOSSY, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_STONE_POLISHED_MOSSY, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_MUD, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_QUARTZ, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_OLIVINE, STAIRS_BRICK_STONE);
        CreativeHelper.setParent(STAIRS_BRICK_CLAY_BAKED, STAIRS_BRICK_STONE);

        for (int color = 0; color < 16; color++) {
            CreativeHelper.setParent(STAIRS_WOOL, color << 4, STAIRS_BRICK_STONE, 0);
        }

    }



    public void initializeBlocks() {

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
                .setHardness(0.3f)
                .setResistance(0.3f)
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

        // Bookshelf
        BOOKSHELF_EMPTY_PLANKS_OAK = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 0.8f))
                .setHardness(1.5f)
                .setResistance(1.0f)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
                .setFlammability(30, 20)
                .build("bookshelf.empty.planks.oak", "bookshelf_empty_planks_oak", blockID++, b -> new BlockLogic(b, Material.wood));

        // Leaves and Branch
        BRANCH = leaves
                .setBlockSound(new BlockSound("step.grass", "step.grass", 0.8f, 0.8f))
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
                .build("branch", "branch", blockID++, b -> new BlockBranch(b, Material.leaves));

        LEAVES_OAK_MOSSY = leaves
                .build("leaves.oak.mossy", "leaves_oak_mossy", blockID++, BlockLogicLeavesOakMossy::new);

        LEAVES_JACARANDA = leaves
                .build("leaves.jacaranda", "leaves_jacaranda", blockID++, block -> new BlockLogicLeavesBase(block, Material.leaves, SAPLING_JACARANDA));


        // Saplings
        SAPLING_JACARANDA = sapling
                .build("sapling.jacaranda", "sapling_jacaranda", blockID++, BlockSaplingJacaranda::new);
        SAPLING_OAK_MOSSY = sapling
                .build("sapling.oak.mossy", "sapling_oak_mossy", blockID++, BlockSaplingMossyOak::new);


        // Logs
        LOG_SHRUB = log
                .build("log.shrub", "log_shrub", blockID++, BlockLogicLog::new);
        LOG_CACAO = log
                .build("log.cacao", "log_cacao", blockID++, BlockLogicLog::new);
        LOG_JACARANDA = log
                .build("log.jacaranda", "log_jacaranda", blockID++, BlockLogicLog::new);
        LOG_SCORCHED = log
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.2f))
                .setHardness(1.8f)
                .build("log.scorched", "log_scorched", blockID++, BlockLogicLog::new);


        // Baked Dirt
        DIRT_BAKED = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.gravel", "step.gravel", 1.0f, 0.9f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.CAVES_CUT_THROUGH)
                .build("dirt.rough", "dirt_baked", blockID++, block -> new BlockLogic(block, Material.dirt));


        // Moss
        MOSS = grass
                .setFlammability(100, 30)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
                .build("moss", "moss", blockID++, b -> new BlockMossy(b, Material.moss));


        // Overgrown Grass
        GRASS_OVERGROWN = grass
                .build("grass.overgrown", "grass_overgrown", blockID++, b -> new BlockLogic(b, Material.grass));
        GRASS_SCORCHED_OVERGROWN = grass
                .build("grass.scorched.overgrown", "grass_scorched_overgrown", blockID++, b -> new BlockLogic(b, Material.grass));
        PATH_DIRT_OVERGROWN = grass
                .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                .build("path.overgrown", "dirt_path_overgrown", blockID++, BlockLogicPathDirt::new);

        // Flowers
        FLOWER_SILVER = flower
                .build("flower.silver", "flower_silver", blockID++, BlockLogicFlowerStackable::new);

        FLOWER_CYAN = flower
                .build("flower.cyan", "flower_cyan", blockID++, BlockLogicFlowerStackable::new);

        FLOWER_MAGENTA = flower
                .build("flower.magenta", "flower_magenta", blockID++, BlockLogicFlowerStackable::new);
        FLOWER_LIME = flower
                .build("flower.lime", "flower_lime", blockID++, BlockLogicFlowerStackable::new);

        // Petals
        PETAL_YELLOW = petal
                .build("petal.yellow", "petal_yellow", blockID++, BlockLogicPetal::new);
        PETAL_RED = petal
                .build("petal.red", "petal_red", blockID++, BlockLogicPetal::new);
        PETAL_CYAN = petal
                .build("petal.cyan", "petal_cyan", blockID++, BlockLogicPetal::new);
        PETAL_PURPLE = petal
                .build("petal.purple", "petal_purple", blockID++, BlockLogicPetal::new);
        PETAL_PINK = petal
                .build("petal.pink", "petal_pink", blockID++, BlockLogicPetal::new);
        PETAL_SILVER = petal
                .build("petal.silver", "petal_silver", blockID++, BlockLogicPetal::new);
        PETAL_ORANGE = petal
                .build("petal.orange", "petal_orange", blockID++, BlockLogicPetal::new);
        PETAL_LIGHT_BLUE = petal
                .build("petal.lightblue", "petal_light_blue", blockID++, BlockLogicPetal::new);
        PETAL_MAGENTA = petal
                .build("petal.magenta", "petal_magenta", blockID++, BlockLogicPetal::new);
        PETAL_LIME = petal
                .build("petal.lime", "petal_lime", blockID++, BlockLogicPetal::new);

        // Petal Layers
        PETAL_LAYER_YELLOW = petalLayer
                .build("layer.petal.yellow", "petal_layer_yellow", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_RED = petalLayer
                .build("layer.petal.red", "petal_layer_red", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_CYAN = petalLayer
                .build("layer.petal.cyan", "petal_layer_cyan", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_PURPLE = petalLayer
                .build("layer.petal.purple", "petal_layer_purple", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_PINK = petalLayer
                .build("layer.petal.pink", "petal_layer_pink", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_SILVER = petalLayer
                .build("layer.petal.silver", "petal_layer_lightgray", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_ORANGE = petalLayer
                .build("layer.petal.orange", "petal_layer_orange", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_LIGHT_BLUE = petalLayer
                .build("layer.petal.lightblue", "petal_layer_lightblue", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_MAGENTA = petalLayer
                .build("layer.petal.magenta", "petal_layer_magenta", blockID++, BlockLogicLayerPetal::new);
        PETAL_LAYER_LIME = petalLayer
                .build("layer.petal.lime", "petal_layer_lime", blockID++, BlockLogicLayerPetal::new);

        // Mushrooms
        MUSHROOM_GRAY = flower
                .build("mushroom.gray", "mushroom_gray", blockID++, BlockLogicMushroom::new);

        // Fungi Blocks
        FUNGI_BROWN = grass
                .setLuminance(2)
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build("fungi.brown", "fungi_brown", blockID++, b -> new BlockLogic(b, Material.dirt));
        FUNGI_RED = grass
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build("fungi.red", "fungi_red", blockID++, b -> new BlockLogic(b, Material.dirt));
        FUNGI_GRAY = grass
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build("fungi.gray", "fungi_gray", blockID++, b -> new BlockLogic(b, Material.dirt));

        // Bone Block
        BLOCK_BONE = stone
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .build("block.bone","block_bone", blockID++, b -> new BlockLogicAxisAligned(b, Material.stone));

        // Cloth Block
        BLOCK_CLOTH = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.8f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.MINEABLE_BY_AXE)
                .build("block.cloth","block_cloth", blockID++, BlockCloth::new);

        // Slime Block
        BLOCK_SLIME = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.5f))
                .setHardness(0.2f)
                .setResistance(0.2f)
                .setLightOpacity(6)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build("block.slime","block_slime", blockID++, BlockSlime::new);

        // Sulphur Block
        BLOCK_GUNPOWDER = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                .setHardness(0.5f)
                .setResistance(0.5f)
                .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                .build("block.sulphur", "block_gunpowder", blockID++, BlockLogicSulphur::new);

        // Sugar Block
        BLOCK_SUGAR = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                .setHardness(0.3f)
                .setResistance(0.3f)
                .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.BROKEN_BY_FLUIDS)
                .build("block.sugar","block_sugar", blockID++, BlockLogicSand::new);

        // Leather Block
        BLOCK_LEATHER = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.6f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setFlammability(5, 10)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build("block.leather","block_leather", blockID++, b -> new BlockLogic(b, Material.cloth));

        // Wicker Block
        BLOCK_WICKER = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.5f)
                .setResistance(0.5f)
                .setFlammability(60, 120)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build("block.wicker","wicker", blockID++, b -> new BlockLogic(b, Material.cloth));

        // Flint Block
        BLOCK_FLINT = raw
                .setInfiniburn()
                .build("block.flint","block_flint", blockID++, b -> new BlockLogic(b, Material.stone));

        // Raw Blocks
        BLOCK_RAW_IRON = raw
                .build("block.raw.iron", "block_raw_iron", blockID++, b -> new BlockLogic(b, Material.metal));
        BLOCK_RAW_GOLD = raw
                .build("block.raw.gold", "block_raw_gold", blockID++, b -> new BlockLogic(b, Material.metal));

        // Nuggets
        OVERLAY_RAW_IRON = pebble
                .build("overlay.iron", "overlay_raw_iron", blockID++, BlockLogicOverlayNuggetsIron::new);
        OVERLAY_RAW_GOLD = pebble
                .build("overlay.gold", "overlay_raw_gold", blockID++, BlockLogicOverlayNuggetsGold::new);
        OVERLAY_FLINT = pebble
                .build("overlay.flint", "overlay_flint", blockID++, BlockLogicOverlayNuggetsFlint::new);


        // Slate Pillar
        PILLAR_SLATE = stone
                .build("pillar.slate", "pillar_slate", blockID++, b -> new BlockLogic(b, Material.slate));


        // Polished Stones
        MARBLE_POLISHED = stone
                .setHardness(1.0f)
                .build("marble.polished", "marble_polished", blockID++, b -> new BlockLogic(b, Material.marble));


        // Carved Stones
        SLATE_CARVED = stone
                .build("slate.carved", "slate_carved", blockID++, b -> new BlockLogic(b, Material.slate));
        MARBLE_CARVED = stone
                .build("marble.carved", "marble_carved", blockID++, b -> new BlockLogic(b, Material.marble));


        // Baked Clay
        BLOCK_CLAY_BAKED = stone
                .setHardness(3.0f)
                .build("block.clay.baked", "block_clay_baked", blockID++, b -> new BlockLogic(b, Material.stone));


        // Glass
        GLASS_OBSIDIAN = obsidian
                .build("glass.obsidian", "glass_obsidian", blockID++, BlockLogicGlassObsidian::new);

        GLASS_QUARTZ = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(0.3F)
                .setResistance(0.3F)
                .setVisualUpdateOnMetadata()
                .setUseInternalLight()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("glass.quartz", "glass_quartz", blockID++, BlockLogicGlassQuartz::new);


        // Bricks
        BRICK_MUD = brick
                .setHardness(1.5f)
                .build("brick.mud", "brick_mud", blockID++, b -> new BlockLogic(b, Material.stone));
        BRICK_QUARTZ = brick
                .setHardness(3.0f)
                .build("brick.quartz", "brick_quartz", blockID++, b -> new BlockLogic(b, Material.stone));
        BRICK_OLIVINE = brick
                .setHardness(3.0f)
                .build("brick.olivine", "brick_olivine", blockID++, b -> new BlockLogic(b, Material.stone));
        BRICK_CLAY_BAKED = stone
                .build("brick.clay.baked", "brick_clay_baked", blockID++, block -> new BlockLogic(block, Material.stone));


        // Soul Candle
        CANDLE_SOULWAX = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 1.2f))
                .setHardness(0.0f)
                .setResistance(0.0f)
                .setLuminance(10)
                .setUseInternalLight()
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_SWORD, BlockTags.BROKEN_BY_FLUIDS)
                .build("candle.soulwax", "candle_soulwax", blockID++, BlockLogicSoulCandle::new);

        // Skulls
        SKULL_CARVED_IDLE = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("skull.carved.idle", "skull_carved_idle", blockID++, b -> new BlockLogicSkull(b, true));

        SKULL_CARVED_ACTIVE = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setLuminance(15)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("skull.carved.active", "skull_carved_active", blockID++, b -> new BlockLogicSkull(b, false));

        SKULL = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("skull", "skull", blockID++, b -> new BlockLogicSkull(b, false));

        SKULL_REDSTONE = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("skull.redstone", "skull_redstone", blockID++, BlockLogicPumpkinRedstone::new);


        FENCE_GOLD = raw
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build("fence.gold", "fence_gold", blockID++, BlockFenceNoClimb::new);


        TATAMI = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 0.8f, 1.2f))
                .setHardness(0.6f)
                .setResistance(0.6f)
                .setFlammability(20, 40)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
                .build("tatami", "tatami", blockID++, b -> new BlockLogic(b, Material.cactus));


        //Slabs
        SLAB_WOOL = slab
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.8F)
                .setResistance(0.8F)
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.NOT_IN_CREATIVE_MENU)
                .setBlockItem(ItemBlockSlabWool::new)
                .build("slab_wool", blockID++, b -> new BlockLogicSlabWoolPainted(b, WOOL));
        SLAB_COBBLESTONE_MOSSY = slab
                .setHardness(2.0F)
                .build("slab_cobble_stone_mossy", blockID++, b -> new BlockLogicSlab(b, COBBLE_STONE_MOSSY));
        SLAB_SLATE_POLISHED = slab
                .build("slab_slate_polished", blockID++, b -> new BlockLogicSlab(b, SLATE_CARVED));
        SLAB_MARBLE_POLISHED = slab
                .build("slab_marble_polished", blockID++, b -> new BlockLogicSlab(b, MARBLE_CARVED));
        SLAB_BRICK_STONE_POLISHED_MOSSY = slab
                .setHardness(2.0F)
                .build("slab_brick_stone_polished_mossy", blockID++, b -> new BlockLogicSlab(b, BRICK_STONE_POLISHED_MOSSY));
        SLAB_BRICK_MUD = slab
                .build("slab_brick_mud", blockID++, b -> new BlockLogicSlab(b, BRICK_MUD));
        SLAB_BRICK_QUARTZ = slab
                .setHardness(3.0f)
                .build("slab_brick_quartz", blockID++, b -> new BlockLogicSlab(b, BRICK_QUARTZ));
        SLAB_BRICK_OLIVINE = slab
                .setHardness(3.0f)
                .build("slab_brick_olivine", blockID++, b -> new BlockLogicSlab(b, BRICK_OLIVINE));
        SLAB_BRICK_CLAY_BAKED = slab
                .build("slab_brick_clay_baked", blockID++, b -> new BlockLogicSlab(b, BRICK_CLAY_BAKED));


        // Stairs
        STAIRS_WOOL = stairs
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.8F)
                .setResistance(0.8F)
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.NOT_IN_CREATIVE_MENU)
                .build("stairs_wool", blockID++, b -> new BlockLogicStairsWoolPainted(b, WOOL));
        STAIRS_COBBLESTONE_MOSSY = stairs
                .setHardness(2.0F)
                .build("stairs_cobble_stone_mossy", blockID++, b -> new BlockLogicStairs(b, COBBLE_STONE_MOSSY));
        STAIRS_BRICK_STONE_POLISHED_MOSSY = stairs
                .setHardness(2.0F)
                .build("stairs_brick_stone_polished_mossy", blockID++, b -> new BlockLogicStairs(b, BRICK_STONE_POLISHED_MOSSY));
        STAIRS_BRICK_MUD = stairs
                .setHardness(1.5f)
                .build("stairs_brick_mud", blockID++, b -> new BlockLogicStairs(b, BRICK_MUD));
        STAIRS_BRICK_QUARTZ = stairs
                .setHardness(3.0f)
                .build("stairs_brick_quartz", blockID++, b -> new BlockLogicStairs(b, BRICK_QUARTZ));
        STAIRS_BRICK_OLIVINE = stairs
                .setHardness(3.0f)
                .build("stairs_brick_olivine", blockID++, b -> new BlockLogicStairs(b, BRICK_OLIVINE));
        STAIRS_BRICK_CLAY_BAKED = stairs
                .build("stairs_brick_clay_baked", blockID++, b -> new BlockLogicStairs(b, BRICK_CLAY_BAKED));


        // Doors
        DOOR_STONE_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.stone.bottom", "door_stone_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_STONE, Material.stone));
        DOOR_STONE_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.stone.top", "door_stone_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_STONE, Material.stone));


        DOOR_BASALT_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.basalt.bottom", "door_basalt_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_BASALT, Material.basalt));
        DOOR_BASALT_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.basalt.top", "door_basalt_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_BASALT, Material.basalt));


        DOOR_LIMESTONE_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.limestone.bottom", "door_limestone_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_LIMESTONE, Material.limestone));
        DOOR_LIMESTONE_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.limestone.top", "door_limestone_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_LIMESTONE, Material.limestone));


        DOOR_GRANITE_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.granite.bottom", "door_granite_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_GRANITE, Material.granite));
        DOOR_GRANITE_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.granite.top", "door_granite_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_GRANITE, Material.granite));


        DOOR_MARBLE_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.marble.bottom", "door_marble_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_MARBLE, Material.marble));
        DOOR_MARBLE_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.marble.top", "door_marble_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_MARBLE, Material.marble));


        DOOR_SLATE_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.slate.bottom", "door_slate_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_SLATE, Material.slate));
        DOOR_SLATE_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.slate.top", "door_slate_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_SLATE, Material.slate));


        DOOR_PERMAFROST_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.permafrost.bottom", "door_permafrost_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_PERMAFROST, Material.permafrost));
        DOOR_PERMAFROST_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.permafrost.top", "door_permafrost_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_PERMAFROST, Material.permafrost));


        DOOR_NETHERRACK_BOTTOM = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.netherrack.bottom", "door_netherrack_bottom", blockID++, b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_NETHERRACK, Material.netherrack));
        DOOR_NETHERRACK_TOP = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.netherrack.top", "door_netherrack_top", blockID++, b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_NETHERRACK, Material.netherrack));


        DOOR_GLASS_OBSIDIAN_BOTTOM = obsidian
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.glass.obsidian.bottom", "door_glass_obsidian_bottom", blockID++, block -> new BlockLogicDoor(block, Material.glass, false, false, () -> BonusItems.DOOR_GLASS_OBSIDIAN));
        DOOR_GLASS_OBSIDIAN_TOP = obsidian
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.glass.obsidian.top", "door_glass_obsidian_top", blockID++, block -> new BlockLogicDoor(block, Material.glass, true, false, () -> BonusItems.DOOR_GLASS_OBSIDIAN));

        DOOR_GLASS_QUARTZ_BOTTOM = obsidian
                .setHardness(0.3F)
                .setResistance(0.3F)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.glass.quartz.bottom", "door_glass_quartz_bottom", blockID++, block -> new BlockLogicDoor(block, Material.glass, false, false, () -> BonusItems.DOOR_GLASS_QUARTZ));
        DOOR_GLASS_QUARTZ_TOP = obsidian
                .setHardness(0.3F)
                .setResistance(0.3F)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.glass.quartz.top", "door_glass_quartz_top", blockID++, block -> new BlockLogicDoor(block, Material.glass, true, false, () -> BonusItems.DOOR_GLASS_QUARTZ));

        DOOR_GLASS_STEEL_BOTTOM = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(0.3f)
                .setResistance(2000.0F)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.glass.steel.bottom", "door_glass_steel_bottom", blockID++, block -> new BlockLogicDoor(block, Material.steel, false, false, () -> BonusItems.DOOR_GLASS_STEEL));
        DOOR_GLASS_STEEL_TOP = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(0.3f)
                .setResistance(2000.0F)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.glass.steel.top", "door_glass_steel_top", blockID++, block -> new BlockLogicDoor(block, Material.steel, true, false, () -> BonusItems.DOOR_GLASS_STEEL));


        // Trapdoors
        TRAPDOOR_STONE = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.stone", "trapdoor_stone", blockID++, b -> new BlockLogicTrapDoorStone(b, Material.stone));

        TRAPDOOR_BASALT = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.basalt", "trapdoor_basalt", blockID++, b -> new BlockLogicTrapDoorStone(b, Material.basalt));

        TRAPDOOR_LIMESTONE = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.limestone", "trapdoor_limestone", blockID++, b -> new BlockLogicTrapDoorStone(b, Material.limestone));

        TRAPDOOR_GRANITE = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.granite", "trapdoor_granite", blockID++, b -> new BlockLogicTrapDoorStone(b, Material.granite));

        TRAPDOOR_PERMAFROST = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.permafrost", "trapdoor_permafrost", blockID++, b -> new BlockLogicTrapDoorStone(b, Material.permafrost));

        TRAPDOOR_MARBLE = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.marble", "trapdoor_marble", blockID++, b -> new BlockLogicTrapDoorStone(b, Material.marble));

        TRAPDOOR_SLATE = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.slate", "trapdoor_slate", blockID++, b -> new BlockLogicTrapDoorStone(b, Material.slate));

        TRAPDOOR_NETHERRACK = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.netherrack", "trapdoor_netherrack", blockID++, b -> new BlockLogicTrapDoorStone(b, Material.netherrack));

        TRAPDOOR_GLASS_OBSIDIAN = obsidian
                .setVisualUpdateOnMetadata()
                .build("trapdoor.glass.obsidian", "trapdoor_glass_obsidian", blockID++, b -> new BlockTrapDoorObsidian(b, Material.glass));

        TRAPDOOR_GLASS_QUARTZ = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(0.3F)
                .setResistance(0.3F)
                .setVisualUpdateOnMetadata()
                .setUseInternalLight()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("trapdoor.glass.quartz", "trapdoor_glass_quartz", blockID++, b -> new BlockLogicTrapDoor(b, Material.glass));

        TRAPDOOR_GLASS_STEEL = raw
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(0.3f)
                .setResistance(2000.0F)
                .setVisualUpdateOnMetadata()
                .setUseInternalLight()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("trapdoor.glass.steel", "trapdoor_glass_steel", blockID++, b -> new BlockLogicTrapDoor(b, Material.steel));

    }
}
