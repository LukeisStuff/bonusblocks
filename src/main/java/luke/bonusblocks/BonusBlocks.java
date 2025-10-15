package luke.bonusblocks;

import luke.bonusblocks.block.*;
import luke.bonusblocks.block.blockmodel.ItemBlockSlabWool;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.block.ItemBlockStairsPainted;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;
import static net.minecraft.core.block.Blocks.*;

public class BonusBlocks {

    public static int blockID = BonusConfig.blockIDs;

    public static int blockID(String blockName) {
        try {
            return BonusConfig.cfg.getInt(BonusConfig.BlockIDs + "." + blockName);
        } catch (NullPointerException e) {
            BonusConfig.properties.addEntry(BonusConfig.BlockIDs + "." + blockName, blockID);
            return blockID++;
        }
    }


    //LOGS, LEAVES, SAPLINGS
    public static Block<?> BRANCH;
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
    public static Block<?> MUSHROOM_GRAY;

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
    public static Block<?> BLOCK_BONE;
    public static Block<?> BLOCK_CLOTH;
    public static Block<?> BLOCK_SLIME;
    public static Block<?> BLOCK_GUNPOWDER;
    public static Block<?> BLOCK_SUGAR;
    public static Block<BlockLogic> BLOCK_LEATHER;
    public static Block<BlockLogic> BLOCK_WICKER;
    public static Block<BlockLogic> BLOCK_FLINT;
    public static Block<BlockLogic> BLOCK_STEEL;
    public static Block<?> BLOCK_VERDIGRIS;
    public static Block<?> BLOCK_VERDIGRIS_SHINE;


    //GLASS
    public static Block<?> GLASS_OBSIDIAN;
    public static Block<?> GLASS_QUARTZ;

    //BRICKS
    public static Block<BlockLogic> BRICK_MUD;
    public static Block<BlockLogic> BRICK_QUARTZ;
    public static Block<BlockLogic> BRICK_OLIVINE;
    public static Block<BlockLogic> BRICK_CLAY_BAKED;
    public static Block<BlockLogic> BRICK_STEEL;
    public static Block<?> BRICK_VERDIGRIS;
    public static Block<?> BRICK_VERDIGRIS_SHINE;


    //ORES
    public static Block<?> ORE_VERDIGRIS_NETHERRACK;


    //STAIRS
    public static Block<BlockLogicStairsWoolPainted> STAIRS_WOOL;
    public static Block<BlockLogicStairs> STAIRS_COBBLESTONE_MOSSY;
    public static Block<BlockLogicStairs> STAIRS_BRICK_STONE_POLISHED_MOSSY;
    public static Block<BlockLogicStairs> STAIRS_BRICK_MUD;
    public static Block<BlockLogicStairs> STAIRS_BRICK_QUARTZ;
    public static Block<BlockLogicStairs> STAIRS_BRICK_OLIVINE;
    public static Block<BlockLogicStairs> STAIRS_BRICK_CLAY_BAKED;
    public static Block<BlockLogicStairs> STAIRS_BRICK_STEEL;
    public static Block<BlockLogicStairs> STAIRS_BRICK_VERDIGRIS;
    public static Block<BlockLogicStairs> STAIRS_BRICK_VERDIGRIS_SHINE;

    //SLABS
    public static Block<BlockLogicSlabWoolPainted> SLAB_WOOL;
    public static Block<BlockLogicSlab> SLAB_COBBLESTONE_MOSSY;
    public static Block<BlockLogicSlab> SLAB_SLATE_POLISHED;
    public static Block<BlockLogicSlab> SLAB_MARBLE_POLISHED;
    public static Block<BlockLogicSlab> SLAB_BRICK_STONE_POLISHED_MOSSY;
    public static Block<BlockLogicSlab> SLAB_BRICK_MUD;
    public static Block<BlockLogicSlab> SLAB_BRICK_QUARTZ;
    public static Block<BlockLogicSlab> SLAB_BRICK_OLIVINE;
    public static Block<BlockLogicSlab> SLAB_BRICK_CLAY_BAKED;
    public static Block<BlockLogicSlab> SLAB_BRICK_STEEL;
    public static Block<BlockLogicSlab> SLAB_BRICK_VERDIGRIS;
    public static Block<BlockLogicSlab> SLAB_BRICK_VERDIGRIS_SHINE;


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
    public static Block<BlockLogicTrapDoor> TRAPDOOR_STEEL;
    public static Block<BlockLogicTrapDoor> TRAPDOOR_GOLD;
    public static Block<BlockLogicTrapDoor> TRAPDOOR_VERDIGRIS;
    public static Block<BlockLogicTrapDoor> TRAPDOOR_VERDIGRIS_SHINE;


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
    public static Block<BlockLogicDoor> DOOR_STEEL_BOTTOM;
    public static Block<BlockLogicDoor> DOOR_STEEL_TOP;
    public static Block<BlockLogicDoor> DOOR_GOLD_BOTTOM;
    public static Block<BlockLogicDoor> DOOR_GOLD_TOP;
    public static Block<BlockLogicDoor> DOOR_VERDIGRIS_BOTTOM;
    public static Block<BlockLogicDoor> DOOR_VERDIGRIS_TOP;
    public static Block<BlockLogicDoor> DOOR_VERDIGRIS_SHINE_BOTTOM;
    public static Block<BlockLogicDoor> DOOR_VERDIGRIS_SHINE_TOP;

    public static Block<BlockLogic> BOOKSHELF_EMPTY_PLANKS_OAK;

    public static Block<BlockMossy> MOSS;

    public static Block<BlockLogic> GRASS_OVERGROWN;
    public static Block<BlockLogic> GRASS_SCORCHED_OVERGROWN;
    public static Block<BlockLogic> PATH_DIRT_OVERGROWN;


    public static Block<?> OVERLAY_RAW_GOLD;
    public static Block<?> OVERLAY_RAW_IRON;
    public static Block<?> OVERLAY_FLINT;
    public static Block<?> OVERLAY_RAW_VERDIGRIS;

    public static Block<BlockLogic> MARBLE_POLISHED;

    public static Block<BlockLogic> SLATE_CARVED;
    public static Block<BlockLogic> MARBLE_CARVED;

    public static Block<BlockLogic> BLOCK_CLAY_BAKED;

    public static Block<BlockLogic> DIRT_BAKED;

    public static Block<?> CANDLE_SOULWAX;

    public static Block<?> SKULL;
    public static Block<?> SKULL_CARVED_IDLE;
    public static Block<?> SKULL_CARVED_ACTIVE;
    public static Block<BlockLogicPumpkinRedstone> SKULL_REDSTONE;

    public static Block<BlockLogicFenceThin> FENCE_GOLD;
    public static Block<BlockLogicFenceThin> FENCE_VERDIGRIS;
    public static Block<BlockLogicFenceThin> FENCE_VERDIGRIS_SHINE;

    public static Block<BlockLogic> TATAMI;

    public static Block<?> MESH_VERDIGRIS;
    public static Block<?> MESH_VERDIGRIS_SHINE;

    public static Block<BlockLogicBedGold> BED_GOLD;
    public static Block<BlockLogicSeatGold> SEAT_GOLD;
    private static boolean hasInit = false;

    public static void init() {
        if (!hasInit) {
            hasInit = true;
            initializeBlocks();
        }
    }

    public static void initializeBlocks() {

        BlockBuilder leaves = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
                .setHardness(0.2F)
                .setResistance(0.2F)
                .setFlammability(30, 60)
                .setLightOpacity(1)
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
                .setBlockSound(BlockSounds.METAL)
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE);

        BlockBuilder verdigris = raw
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.5f))
                .setHardness(2.5f)
                .setResistance(5.0f);

        BlockBuilder pebble = new BlockBuilder(MOD_ID)
                .setBlockSound(BlockSounds.METAL)
                .setHardness(0.0f)
                .setResistance(0.0f)
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.NOT_IN_CREATIVE_MENU);

        BlockBuilder stone = new BlockBuilder(MOD_ID)
                .setBlockSound(BlockSounds.STONE)
                .setHardness(1.5f)
                .setResistance(10.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE);

        BlockBuilder door = stone
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata();

        BlockBuilder obsidian = new BlockBuilder(MOD_ID)
                .setBlockSound(BlockSounds.GLASS)
                .setHardness(5.0f)
                .setResistance(1000.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE);

        BlockBuilder slab = stone
                .setHardness(1.0f)
                .setUseInternalLight()
                .setVisualUpdateOnMetadata();

        BlockBuilder stairs = stone
                .setHardness(1.0f)
                .setUseInternalLight()
                .setVisualUpdateOnMetadata();


        /// Blocks

        // Bookshelf
        BOOKSHELF_EMPTY_PLANKS_OAK = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 0.8f))
                .setHardness(1.5f)
                .setResistance(1.0f)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
                .setFlammability(30, 20)
                .build("bookshelf.empty.planks.oak", "bookshelf_empty_planks_oak", blockID("BOOKSHELF_EMPTY_PLANKS_OAK"), b -> new BlockLogic(b, Material.wood));

        // Leaves and Branch
        BRANCH = leaves
                .setBlockSound(new BlockSound("step.grass", "step.grass", 0.8f, 0.8f))
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
                .build("branch", "branch", blockID("BRANCH"), b -> new BlockBranch(b, Material.leaves));

        LEAVES_OAK_MOSSY = leaves
                .build("leaves.oak.mossy", "leaves_oak_mossy", blockID("LEAVES_OAK_MOSSY"), BlockLogicLeavesOakMossy::new);

        LEAVES_JACARANDA = leaves
                .build("leaves.jacaranda", "leaves_jacaranda", blockID("LEAVES_JACARANDA"), block -> new BlockLogicLeavesBase(block, Material.leaves, SAPLING_JACARANDA));


        // Saplings
        SAPLING_JACARANDA = sapling
                .build("sapling.jacaranda", "sapling_jacaranda", blockID("SAPLING_JACARANDA"), BlockSaplingJacaranda::new);
        SAPLING_OAK_MOSSY = sapling
                .build("sapling.oak.mossy", "sapling_oak_mossy", blockID("SAPLING_OAK_MOSSY"), BlockSaplingMossyOak::new);


        // Logs
        LOG_SHRUB = log
                .build("log.shrub", "log_shrub", blockID("LOG_SHRUB"), BlockLogicLog::new);
        LOG_CACAO = log
                .build("log.cacao", "log_cacao", blockID("LOG_CACAO"), BlockLogicLog::new);
        LOG_JACARANDA = log
                .build("log.jacaranda", "log_jacaranda", blockID("LOG_JACARANDA"), BlockLogicLog::new);
        LOG_SCORCHED = log
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.2f))
                .setHardness(1.8f)
                .build("log.scorched", "log_scorched", blockID("LOG_SCORCHED"), BlockLogicLog::new);


        // Baked Dirt
        DIRT_BAKED = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.gravel", "step.gravel", 1.0f, 0.9f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.MINEABLE_BY_PICKAXE, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.CAVES_CUT_THROUGH)
                .build("dirt.rough", "dirt_baked", blockID("DIRT_BAKED"), block -> new BlockLogic(block, Material.dirt));


        // Moss
        MOSS = grass
                .setFlammability(100, 30)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
                .build("moss", "moss", blockID("MOSS"), BlockMossy::new);


        // Overgrown Grass
        GRASS_OVERGROWN = grass
                .build("grass.overgrown", "grass_overgrown", blockID("GRASS_OVERGROWN"), b -> new BlockLogic(b, Material.grass));
        GRASS_SCORCHED_OVERGROWN = grass
                .build("grass.scorched.overgrown", "grass_scorched_overgrown", blockID("GRASS_SCORCHED_OVERGROWN"), b -> new BlockLogic(b, Material.grass));
        PATH_DIRT_OVERGROWN = grass
                .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                .build("path.overgrown", "dirt_path_overgrown", blockID("PATH_DIRT_OVERGROWN"), BlockLogicPathDirt::new);

        // Flowers
        FLOWER_SILVER = flower
                .build("flower.silver", "flower_silver", blockID("FLOWER_SILVER"), b -> (BlockLogicFlowerStackable) new BlockLogicFlowerStackable(b).setBonemealable().setKilledByWeather());
        FLOWER_CYAN = flower
                .build("flower.cyan", "flower_cyan", blockID("FLOWER_CYAN"), b -> (BlockLogicFlowerStackable) new BlockLogicFlowerStackable(b).setBonemealable().setKilledByWeather());
        FLOWER_MAGENTA = flower
                .build("flower.magenta", "flower_magenta", blockID("FLOWER_MAGENTA"), b -> (BlockLogicFlowerStackable) new BlockLogicFlowerStackable(b).setBonemealable().setKilledByWeather());
        FLOWER_LIME = flower
                .build("flower.lime", "flower_lime", blockID("FLOWER_LIME"), b -> (BlockLogicFlowerStackable) new BlockLogicFlowerStackable(b).setBonemealable().setKilledByWeather());

        // Petals
        PETAL_YELLOW = petal
                .build("petal.yellow", "petal_yellow", blockID("PETAL_YELLOW"), BlockLogicPetal::new);
        PETAL_RED = petal
                .build("petal.red", "petal_red", blockID("PETAL_RED"), BlockLogicPetal::new);
        PETAL_CYAN = petal
                .build("petal.cyan", "petal_cyan", blockID("PETAL_CYAN"), BlockLogicPetal::new);
        PETAL_PURPLE = petal
                .build("petal.purple", "petal_purple", blockID("PETAL_PURPLE"), BlockLogicPetal::new);
        PETAL_PINK = petal
                .build("petal.pink", "petal_pink", blockID("PETAL_PINK"), BlockLogicPetal::new);
        PETAL_SILVER = petal
                .build("petal.silver", "petal_silver", blockID("PETAL_SILVER"), BlockLogicPetal::new);
        PETAL_ORANGE = petal
                .build("petal.orange", "petal_orange", blockID("PETAL_ORANGE"), BlockLogicPetal::new);
        PETAL_LIGHT_BLUE = petal
                .build("petal.lightblue", "petal_light_blue", blockID("PETAL_LIGHT_BLUE"), BlockLogicPetal::new);
        PETAL_MAGENTA = petal
                .build("petal.magenta", "petal_magenta", blockID("PETAL_MAGENTA"), BlockLogicPetal::new);
        PETAL_LIME = petal
                .build("petal.lime", "petal_lime", blockID("PETAL_LIME"), BlockLogicPetal::new);

        // Petal Layers
        PETAL_LAYER_YELLOW = petalLayer
                .build("layer.petal.yellow", "petal_layer_yellow", blockID("PETAL_LAYER_YELLOW"), BlockLogicLayerPetal::new);
        PETAL_LAYER_RED = petalLayer
                .build("layer.petal.red", "petal_layer_red", blockID("PETAL_LAYER_RED"), BlockLogicLayerPetal::new);
        PETAL_LAYER_CYAN = petalLayer
                .build("layer.petal.cyan", "petal_layer_cyan", blockID("PETAL_LAYER_CYAN"), BlockLogicLayerPetal::new);
        PETAL_LAYER_PURPLE = petalLayer
                .build("layer.petal.purple", "petal_layer_purple", blockID("PETAL_LAYER_PURPLE"), BlockLogicLayerPetal::new);
        PETAL_LAYER_PINK = petalLayer
                .build("layer.petal.pink", "petal_layer_pink", blockID("PETAL_LAYER_PINK"), BlockLogicLayerPetal::new);
        PETAL_LAYER_SILVER = petalLayer
                .build("layer.petal.silver", "petal_layer_lightgray", blockID("PETAL_LAYER_SILVER"), BlockLogicLayerPetal::new);
        PETAL_LAYER_ORANGE = petalLayer
                .build("layer.petal.orange", "petal_layer_orange", blockID("PETAL_LAYER_ORANGE"), BlockLogicLayerPetal::new);
        PETAL_LAYER_LIGHT_BLUE = petalLayer
                .build("layer.petal.lightblue", "petal_layer_lightblue", blockID("PETAL_LAYER_LIGHT_BLUE"), BlockLogicLayerPetal::new);
        PETAL_LAYER_MAGENTA = petalLayer
                .build("layer.petal.magenta", "petal_layer_magenta", blockID("PETAL_LAYER_MAGENTA"), BlockLogicLayerPetal::new);
        PETAL_LAYER_LIME = petalLayer
                .build("layer.petal.lime", "petal_layer_lime", blockID("PETAL_LAYER_LIME"), BlockLogicLayerPetal::new);

        // Mushrooms
        MUSHROOM_GRAY = flower
                .build("mushroom.gray", "mushroom_gray", blockID("MUSHROOM_GRAY"), BlockLogicMushroom::new);

        // Fungi Blocks
        FUNGI_BROWN = grass
                .setLuminance(2)
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build("fungi.brown", "fungi_brown", blockID("FUNGI_BROWN"), b -> new BlockLogic(b, Material.dirt));
        FUNGI_RED = grass
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build("fungi.red", "fungi_red", blockID("FUNGI_RED"), b -> new BlockLogic(b, Material.dirt));
        FUNGI_GRAY = grass
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build("fungi.gray", "fungi_gray", blockID("FUNGI_GRAY"), b -> new BlockLogic(b, Material.dirt));

        // Bone Block
        BLOCK_BONE = stone
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .build("block.bone", "block_bone", blockID("BLOCK_BONE"), b -> new BlockLogicAxisAligned(b, Material.stone));

        // Cloth Block
        BLOCK_CLOTH = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.8f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.MINEABLE_BY_AXE)
                .build("block.cloth", "block_cloth", blockID("BLOCK_CLOTH"), BlockCloth::new);

        // Slime Block
        BLOCK_SLIME = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.5f))
                .setHardness(0.2f)
                .setResistance(0.2f)
                .setLightOpacity(6)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build("block.slime", "block_slime", blockID("BLOCK_SLIME"), BlockSlime::new);

        // Sulphur Block
        BLOCK_GUNPOWDER = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                .setHardness(0.5f)
                .setResistance(0.5f)
                .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                .build("block.sulphur", "block_gunpowder", blockID("BLOCK_GUNPOWDER"), BlockLogicSulphur::new);

        // Sugar Block
        BLOCK_SUGAR = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                .setHardness(0.3f)
                .setResistance(0.3f)
                .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.BROKEN_BY_FLUIDS)
                .build("block.sugar", "block_sugar", blockID("BLOCK_SUGAR"), BlockLogicSand::new);

        // Leather Block
        BLOCK_LEATHER = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.6f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setFlammability(5, 10)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build("block.leather", "block_leather", blockID("BLOCK_LEATHER"), b -> new BlockLogic(b, Material.cloth));

        // Wicker Block
        BLOCK_WICKER = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.5f)
                .setResistance(0.5f)
                .setFlammability(60, 120)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build("block.wicker", "wicker", blockID("BLOCK_WICKER"), b -> new BlockLogic(b, Material.cloth));

        // Flint Block
        BLOCK_FLINT = raw
                .setInfiniburn()
                .build("block.flint", "block_flint", blockID("BLOCK_FLINT"), b -> new BlockLogic(b, Material.stone));

        // Raw Blocks
        BLOCK_STEEL = raw
                .setHardness(5.0f)
                .setResistance(2000.0F)
                .build("block.steel", "block_steel", blockID("BLOCK_STEEL"), b -> new BlockLogic(b, Material.steel));
        BLOCK_VERDIGRIS = verdigris
                .setFlammability(50, 50)
                .build("block.verdigris", "block_verdigris", blockID("BLOCK_VERDIGRIS"), b -> new BlockLogicVerdigris(b, BLOCK_VERDIGRIS_SHINE));
        BLOCK_VERDIGRIS_SHINE = verdigris
                .build("block.verdigris.shine", "block_verdigris_shine", blockID("BLOCK_VERDIGRIS_SHINE"), b -> new BlockLogic(b, Material.metal));

        MESH_VERDIGRIS = verdigris
                .setFlammability(50, 50)
                .build("mesh.verdigris", "mesh_verdigris", blockID("MESH_VERDIGRIS"), BlockLogicMeshVerdigris::new);
        MESH_VERDIGRIS_SHINE = verdigris
                .build("mesh.verdigris.shine", "mesh_verdigris_shine", blockID("MESH_VERDIGRIS_SHINE"), BlockLogicMeshVerdigris::new);

        ORE_VERDIGRIS_NETHERRACK = stone
                .setHardness(3.0F)
                .setResistance(5.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NETHER_MOBS_SPAWN)
                .build("ore.verdigris.netherrack", "ore_verdigris_netherrack", blockID("ORE_VERDIGRIS_NETHERRACK"), BlockLogicOreVerdigris::new);

        // Nuggets
        OVERLAY_RAW_IRON = pebble
                .build("overlay.iron", "overlay_raw_iron", blockID("OVERLAY_RAW_IRON"), BlockLogicOverlayNuggetsIron::new);
        OVERLAY_RAW_GOLD = pebble
                .build("overlay.gold", "overlay_raw_gold", blockID("OVERLAY_RAW_GOLD"), BlockLogicOverlayNuggetsGold::new);
        OVERLAY_FLINT = pebble
                .build("overlay.flint", "overlay_flint", blockID("OVERLAY_FLINT"), BlockLogicOverlayNuggetsFlint::new);
        OVERLAY_RAW_VERDIGRIS = pebble
                .build("overlay.verdigris", "overlay_verdigris", blockID("OVERLAY_RAW_VERDIGRIS"), BlockLogicOverlayNuggetsVerdigris::new);


        // Polished Stones
        MARBLE_POLISHED = stone
                .setHardness(1.0f)
                .build("marble.polished", "marble_polished", blockID("MARBLE_POLISHED"), b -> new BlockLogic(b, Material.marble));


        // Carved Stones
        SLATE_CARVED = stone
                .build("slate.carved", "slate_carved", blockID("SLATE_CARVED"), b -> new BlockLogic(b, Material.slate));
        MARBLE_CARVED = stone
                .build("marble.carved", "marble_carved", blockID("MARBLE_CARVED"), b -> new BlockLogic(b, Material.marble));


        // Baked Clay
        BLOCK_CLAY_BAKED = stone
                .setHardness(3.0f)
                .build("block.clay.baked", "block_clay_baked", blockID("BLOCK_CLAY_BAKED"), b -> new BlockLogic(b, Material.stone));


        // Glass
        GLASS_OBSIDIAN = obsidian
                .build("glass.obsidian", "glass_obsidian", blockID("GLASS_OBSIDIAN"), b -> new BlockLogicGlass(b, Material.glass));

        GLASS_QUARTZ = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(0.3F)
                .setResistance(0.3F)
                .setVisualUpdateOnMetadata()
                .setUseInternalLight()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("glass.quartz", "glass_quartz", blockID("GLASS_QUARTZ"), b -> new BlockLogicGlass(b, Material.glass));


        // Bricks
        BRICK_MUD = stone
                .setHardness(1.5f)
                .build("brick.mud", "brick_mud", blockID("BRICK_MUD"), b -> new BlockLogic(b, Material.stone));
        BRICK_QUARTZ = stone
                .setHardness(3.0f)
                .build("brick.quartz", "brick_quartz", blockID("BRICK_QUARTZ"), b -> new BlockLogic(b, Material.stone));
        BRICK_OLIVINE = stone
                .setHardness(3.0f)
                .build("brick.olivine", "brick_olivine", blockID("BRICK_OLIVINE"), b -> new BlockLogic(b, Material.stone));
        BRICK_CLAY_BAKED = stone
                .build("brick.clay.baked", "brick_clay_baked", blockID("BRICK_CLAY_BAKED"), block -> new BlockLogic(block, Material.stone));
        BRICK_STEEL = stone
                .setHardness(5.0f)
                .setResistance(2000.0F)
                .build("brick.steel", "brick_steel", blockID("BRICK_STEEL"), block -> new BlockLogic(block, Material.steel));

        BRICK_VERDIGRIS = verdigris
                .setFlammability(50, 50)
                .build("brick.verdigris", "brick_verdigris", blockID("BRICK_VERDIGRIS"), block -> new BlockLogicVerdigris(block, BRICK_VERDIGRIS_SHINE));
        BRICK_VERDIGRIS_SHINE = verdigris
                .build("brick.verdigris.shine", "brick_verdigris_shine", blockID("BRICK_VERDIGRIS_SHINE"), block -> new BlockLogic(block, Material.metal));


        // Soul Candle
        CANDLE_SOULWAX = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 1.2f))
                .setHardness(0.0f)
                .setResistance(0.0f)
                .setLuminance(10)
                .setUseInternalLight()
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_SWORD, BlockTags.BROKEN_BY_FLUIDS)
                .build("candle.soulwax", "candle_soulwax", blockID("CANDLE_SOULWAX"), BlockLogicSoulCandle::new);

        // Skulls
        SKULL_CARVED_IDLE = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("skull.carved.idle", "skull_carved_idle", blockID("SKULL_CARVED_IDLE"), b -> new BlockLogicSkull(b, false));

        SKULL_CARVED_ACTIVE = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setLuminance(15)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("skull.carved.active", "skull_carved_active", blockID("SKULL_CARVED_ACTIVE"), b -> new BlockLogicSkull(b, false));

        SKULL = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("skull", "skull", blockID("SKULL"), b -> new BlockLogicSkull(b, true));

        SKULL_REDSTONE = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setVisualUpdateOnMetadata()
                .setTicking(true)
                .setTickOnLoad()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("skull.redstone", "skull_redstone", blockID("SKULL_REDSTONE"), BlockLogicPumpkinRedstone::new);

        FENCE_GOLD = raw
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build("fence.gold", "fence_gold", blockID("FENCE_GOLD"), BlockFenceNoClimb::new);

        FENCE_VERDIGRIS = verdigris
                .setVisualUpdateOnMetadata()
                .setFlammability(50, 50)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build("fence.verdigris", "fence_verdigris", blockID("FENCE_VERDIGRIS"), BlockFenceNoClimb::new);
        FENCE_VERDIGRIS_SHINE = verdigris
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build("fence.verdigris.shine", "fence_verdigris_shine", blockID("FENCE_VERDIGRIS_SHINE"), BlockFenceNoClimb::new);


        TATAMI = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 0.8f, 1.2f))
                .setHardness(0.6f)
                .setResistance(0.6f)
                .setFlammability(20, 40)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
                .build("tatami", "tatami", blockID("TATAMI"), b -> new BlockLogic(b, Material.cactus));


        //Slabs
        SLAB_WOOL = slab
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.8F)
                .setResistance(0.8F)
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS)
                .setBlockItem(ItemBlockSlabWool::new)
                .build("slab_wool", blockID("SLAB_WOOL"), b -> new BlockLogicSlabWoolPainted(b, WOOL));
        SLAB_COBBLESTONE_MOSSY = slab
                .setHardness(2.0F)
                .build("slab_cobble_stone_mossy", blockID("SLAB_COBBLESTONE_MOSSY"), b -> new BlockLogicSlab(b, COBBLE_STONE_MOSSY));
        SLAB_SLATE_POLISHED = slab
                .build("slab_slate_polished", blockID("SLAB_SLATE_POLISHED"), b -> new BlockLogicSlab(b, SLATE_CARVED));
        SLAB_MARBLE_POLISHED = slab
                .build("slab_marble_polished", blockID("SLAB_MARBLE_POLISHED"), b -> new BlockLogicSlab(b, MARBLE_CARVED));
        SLAB_BRICK_STONE_POLISHED_MOSSY = slab
                .setHardness(2.0F)
                .build("slab_brick_stone_polished_mossy", blockID("SLAB_BRICK_STONE_POLISHED_MOSSY"), b -> new BlockLogicSlab(b, BRICK_STONE_POLISHED_MOSSY));
        SLAB_BRICK_MUD = slab
                .build("slab_brick_mud", blockID("SLAB_BRICK_MUD"), b -> new BlockLogicSlab(b, BRICK_MUD));
        SLAB_BRICK_QUARTZ = slab
                .setHardness(3.0f)
                .build("slab_brick_quartz", blockID("SLAB_BRICK_QUARTZ"), b -> new BlockLogicSlab(b, BRICK_QUARTZ));
        SLAB_BRICK_OLIVINE = slab
                .setHardness(3.0f)
                .build("slab_brick_olivine", blockID("SLAB_BRICK_OLIVINE"), b -> new BlockLogicSlab(b, BRICK_OLIVINE));
        SLAB_BRICK_CLAY_BAKED = slab
                .build("slab_brick_clay_baked", blockID("SLAB_BRICK_CLAY_BAKED"), b -> new BlockLogicSlab(b, BRICK_CLAY_BAKED));
        SLAB_BRICK_STEEL = slab
                .setHardness(5.0f)
                .setResistance(2000.0F)
                .build("slab_brick_steel", blockID("SLAB_BRICK_STEEL"), b -> new BlockLogicSlab(b, BRICK_STEEL));
        SLAB_BRICK_VERDIGRIS = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.7f))
                .setHardness(2.5f)
                .setResistance(5.0f)
                .setFlammability(50, 50)
                .build("slab_brick_verdigris", blockID("SLAB_BRICK_VERDIGRIS"), b -> new BlockLogicSlab(b, BRICK_VERDIGRIS));
        SLAB_BRICK_VERDIGRIS_SHINE = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.7f))
                .setHardness(2.5f)
                .setResistance(5.0f)
                .build("slab_brick_verdigris_shine", blockID("SLAB_BRICK_VERDIGRIS_SHINE"), b -> new BlockLogicSlab(b, BRICK_VERDIGRIS_SHINE));


        // Stairs
        STAIRS_WOOL = stairs
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.8F)
                .setResistance(0.8F)
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS)
                .setBlockItem(ItemBlockStairsPainted::new)
                .build("stairs_wool", blockID("STAIRS_WOOL"), b -> new BlockLogicStairsWoolPainted(b, WOOL));
        STAIRS_COBBLESTONE_MOSSY = stairs
                .setHardness(2.0F)
                .build("stairs_cobble_stone_mossy", blockID("STAIRS_COBBLESTONE_MOSSY"), b -> new BlockLogicStairs(b, COBBLE_STONE_MOSSY));
        STAIRS_BRICK_STONE_POLISHED_MOSSY = stairs
                .setHardness(2.0F)
                .build("stairs_brick_stone_polished_mossy", blockID("STAIRS_BRICK_STONE_POLISHED_MOSSY"), b -> new BlockLogicStairs(b, BRICK_STONE_POLISHED_MOSSY));
        STAIRS_BRICK_MUD = stairs
                .setHardness(1.5f)
                .build("stairs_brick_mud", blockID("STAIRS_BRICK_MUD"), b -> new BlockLogicStairs(b, BRICK_MUD));
        STAIRS_BRICK_QUARTZ = stairs
                .setHardness(3.0f)
                .build("stairs_brick_quartz", blockID("STAIRS_BRICK_QUARTZ"), b -> new BlockLogicStairs(b, BRICK_QUARTZ));
        STAIRS_BRICK_OLIVINE = stairs
                .setHardness(3.0f)
                .build("stairs_brick_olivine", blockID("STAIRS_BRICK_OLIVINE"), b -> new BlockLogicStairs(b, BRICK_OLIVINE));
        STAIRS_BRICK_CLAY_BAKED = stairs
                .build("stairs_brick_clay_baked", blockID("STAIRS_BRICK_CLAY_BAKED"), b -> new BlockLogicStairs(b, BRICK_CLAY_BAKED));
        STAIRS_BRICK_STEEL = stairs
                .setHardness(5.0f)
                .setResistance(2000.0F)
                .build("stairs_brick_steel", blockID("STAIRS_BRICK_STEEL"), b -> new BlockLogicStairs(b, BRICK_STEEL));
        STAIRS_BRICK_VERDIGRIS = stairs
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.7f))
                .setHardness(2.5f)
                .setResistance(5.0f)
                .setFlammability(50, 50)
                .build("stairs_brick_verdigris", blockID("STAIRS_BRICK_VERDIGRIS"), b -> new BlockLogicStairs(b, BRICK_VERDIGRIS));
        STAIRS_BRICK_VERDIGRIS_SHINE = stairs
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.7f))
                .setHardness(2.5f)
                .setResistance(5.0f)
                .build("stairs_brick_verdigris_shine", blockID("STAIRS_BRICK_VERDIGRIS_SHINE"), b -> new BlockLogicStairs(b, BRICK_VERDIGRIS_SHINE));


        // Doors
        DOOR_STONE_BOTTOM = door
                .build("door.stone.bottom", "door_stone_bottom", blockID("DOOR_STONE_BOTTOM"),
                        b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_STONE, Material.stone));
        DOOR_STONE_TOP = door
                .build("door.stone.top", "door_stone_top", blockID("DOOR_STONE_TOP"),
                        b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_STONE, Material.stone));


        DOOR_BASALT_BOTTOM = door
                .build("door.basalt.bottom", "door_basalt_bottom", blockID("DOOR_BASALT_BOTTOM"),
                        b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_BASALT, Material.basalt));
        DOOR_BASALT_TOP = door
                .build("door.basalt.top", "door_basalt_top", blockID("DOOR_BASALT_TOP"),
                        b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_BASALT, Material.basalt));


        DOOR_LIMESTONE_BOTTOM = door
                .build("door.limestone.bottom", "door_limestone_bottom", blockID("DOOR_LIMESTONE_BOTTOM"),
                        b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_LIMESTONE, Material.limestone));
        DOOR_LIMESTONE_TOP = door
                .build("door.limestone.top", "door_limestone_top", blockID("DOOR_LIMESTONE_TOP"),
                        b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_LIMESTONE, Material.limestone));


        DOOR_GRANITE_BOTTOM = door
                .build("door.granite.bottom", "door_granite_bottom", blockID("DOOR_GRANITE_BOTTOM"),
                        b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_GRANITE, Material.granite));
        DOOR_GRANITE_TOP = door
                .build("door.granite.top", "door_granite_top", blockID("DOOR_GRANITE_TOP"),
                        b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_GRANITE, Material.granite));


        DOOR_MARBLE_BOTTOM = door
                .build("door.marble.bottom", "door_marble_bottom", blockID("DOOR_MARBLE_BOTTOM"),
                        b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_MARBLE, Material.marble));
        DOOR_MARBLE_TOP = door
                .build("door.marble.top", "door_marble_top", blockID("DOOR_MARBLE_TOP"),
                        b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_MARBLE, Material.marble));


        DOOR_SLATE_BOTTOM = door
                .build("door.slate.bottom", "door_slate_bottom", blockID("DOOR_SLATE_BOTTOM"),
                        b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_SLATE, Material.slate));
        DOOR_SLATE_TOP = door
                .build("door.slate.top", "door_slate_top", blockID("DOOR_SLATE_TOP"),
                        b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_SLATE, Material.slate));


        DOOR_PERMAFROST_BOTTOM = door
                .build("door.permafrost.bottom", "door_permafrost_bottom", blockID("DOOR_PERMAFROST_BOTTOM"),
                        b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_PERMAFROST, Material.permafrost));
        DOOR_PERMAFROST_TOP = door
                .build("door.permafrost.top", "door_permafrost_top", blockID("DOOR_PERMAFROST_TOP"),
                        b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_PERMAFROST, Material.permafrost));


        DOOR_NETHERRACK_BOTTOM = door
                .build("door.netherrack.bottom", "door_netherrack_bottom", blockID("DOOR_NETHERRACK_BOTTOM"),
                        b -> new BlockLogicDoorStone(b, false, () -> BonusItems.DOOR_NETHERRACK, Material.netherrack));
        DOOR_NETHERRACK_TOP = door
                .build("door.netherrack.top", "door_netherrack_top", blockID("DOOR_NETHERRACK_TOP"),
                        b -> new BlockLogicDoorStone(b, true, () -> BonusItems.DOOR_NETHERRACK, Material.netherrack));


        DOOR_GLASS_OBSIDIAN_BOTTOM = obsidian
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.glass.obsidian.bottom", "door_glass_obsidian_bottom", blockID("DOOR_GLASS_OBSIDIAN_BOTTOM"),
                        block -> new BlockLogicDoor(block, Material.glass, false, false, () -> BonusItems.DOOR_GLASS_OBSIDIAN));
        DOOR_GLASS_OBSIDIAN_TOP = obsidian
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.glass.obsidian.top", "door_glass_obsidian_top", blockID("DOOR_GLASS_OBSIDIAN_TOP"),
                        block -> new BlockLogicDoor(block, Material.glass, true, false, () -> BonusItems.DOOR_GLASS_OBSIDIAN));

        DOOR_GLASS_QUARTZ_BOTTOM = obsidian
                .setHardness(0.3F)
                .setResistance(0.3F)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.glass.quartz.bottom", "door_glass_quartz_bottom", blockID("DOOR_GLASS_QUARTZ_BOTTOM"),
                        block -> new BlockLogicDoor(block, Material.glass, false, false, () -> BonusItems.DOOR_GLASS_QUARTZ));
        DOOR_GLASS_QUARTZ_TOP = obsidian
                .setHardness(0.3F)
                .setResistance(0.3F)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build("door.glass.quartz.top", "door_glass_quartz_top", blockID("DOOR_GLASS_QUARTZ_TOP"),
                        block -> new BlockLogicDoor(block, Material.glass, true, false, () -> BonusItems.DOOR_GLASS_QUARTZ));

        DOOR_GLASS_STEEL_BOTTOM = door
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(0.3f)
                .setResistance(2000.0F)
                .build("door.glass.steel.bottom", "door_glass_steel_bottom", blockID("DOOR_GLASS_STEEL_BOTTOM"),
                        block -> new BlockLogicDoor(block, Material.steel, false, false, () -> BonusItems.DOOR_GLASS_STEEL));
        DOOR_GLASS_STEEL_TOP = door
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(0.3f)
                .setResistance(2000.0F)
                .build("door.glass.steel.top", "door_glass_steel_top", blockID("DOOR_GLASS_STEEL_TOP"),
                        block -> new BlockLogicDoor(block, Material.steel, true, false, () -> BonusItems.DOOR_GLASS_STEEL));

        DOOR_STEEL_BOTTOM = door
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(2000.0F)
                .build("door.steel.bottom", "door_steel_bottom", blockID("DOOR_STEEL_BOTTOM"),
                        block -> new BlockLogicDoor(block, Material.steel, false, true, () -> BonusItems.DOOR_STEEL));
        DOOR_STEEL_TOP = door
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(2000.0F)
                .build("door.steel.top", "door_steel_top", blockID("DOOR_STEEL_TOP"),
                        block -> new BlockLogicDoor(block, Material.steel, true, true, () -> BonusItems.DOOR_STEEL));

        DOOR_GOLD_BOTTOM = door
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(3.0f)
                .setResistance(10.0f)
                .build("door.gold.bottom", "door_gold_bottom", blockID("DOOR_GOLD_BOTTOM"),
                        block -> new BlockLogicDoor(block, Material.metal, false, true, () -> BonusItems.DOOR_GOLD));
        DOOR_GOLD_TOP = door
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(3.0f)
                .setResistance(10.0f)
                .build("door.gold.top", "door_gold_top", blockID("DOOR_GOLD_TOP"),
                        block -> new BlockLogicDoor(block, Material.metal, true, true, () -> BonusItems.DOOR_GOLD));

        DOOR_VERDIGRIS_BOTTOM = door
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.7f))
                .setHardness(2.5f)
                .setResistance(5.0f)
                .setFlammability(50, 50)
                .build("door.verdigris.bottom", "door_verdigris_bottom", blockID("DOOR_VERDIGRIS_BOTTOM"),
                        block -> new BlockLogicDoor(block, Material.metal, false, true, () -> BonusItems.DOOR_VERDIGRIS));
        DOOR_VERDIGRIS_TOP = door
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.7f))
                .setHardness(2.5f)
                .setResistance(5.0f)
                .setFlammability(50, 50)
                .build("door.verdigris.top", "door_verdigris_top", blockID("DOOR_VERDIGRIS_TOP"),
                        block -> new BlockLogicDoor(block, Material.metal, true, true, () -> BonusItems.DOOR_VERDIGRIS));
        DOOR_VERDIGRIS_SHINE_BOTTOM = door
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.7f))
                .setHardness(2.5f)
                .setResistance(5.0f)
                .build("door.verdigris.shine.bottom", "door_verdigris_shine_bottom", blockID("DOOR_VERDIGRIS_SHINE_BOTTOM"),
                        block -> new BlockLogicDoor(block, Material.metal, false, true, () -> BonusItems.DOOR_VERDIGRIS_SHINE));
        DOOR_VERDIGRIS_SHINE_TOP = door
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.7f))
                .setHardness(2.5f)
                .setResistance(5.0f)
                .build("door.verdigris.shine.top", "door_verdigris_shine_top", blockID("DOOR_VERDIGRIS_SHINE_TOP"),
                        block -> new BlockLogicDoor(block, Material.metal, true, true, () -> BonusItems.DOOR_VERDIGRIS_SHINE));


        // Trapdoors
        TRAPDOOR_STONE = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.stone", "trapdoor_stone", blockID("TRAPDOOR_STONE"), b -> new BlockLogicTrapDoorStone(b, Material.stone));

        TRAPDOOR_BASALT = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.basalt", "trapdoor_basalt", blockID("TRAPDOOR_BASALT"), b -> new BlockLogicTrapDoorStone(b, Material.basalt));

        TRAPDOOR_LIMESTONE = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.limestone", "trapdoor_limestone", blockID("TRAPDOOR_LIMESTONE"), b -> new BlockLogicTrapDoorStone(b, Material.limestone));

        TRAPDOOR_GRANITE = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.granite", "trapdoor_granite", blockID("TRAPDOOR_GRANITE"), b -> new BlockLogicTrapDoorStone(b, Material.granite));

        TRAPDOOR_PERMAFROST = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.permafrost", "trapdoor_permafrost", blockID("TRAPDOOR_PERMAFROST"), b -> new BlockLogicTrapDoorStone(b, Material.permafrost));

        TRAPDOOR_MARBLE = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.marble", "trapdoor_marble", blockID("TRAPDOOR_MARBLE"), b -> new BlockLogicTrapDoorStone(b, Material.marble));

        TRAPDOOR_SLATE = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.slate", "trapdoor_slate", blockID("TRAPDOOR_SLATE"), b -> new BlockLogicTrapDoorStone(b, Material.slate));

        TRAPDOOR_NETHERRACK = stone
                .setVisualUpdateOnMetadata()
                .build("trapdoor.netherrack", "trapdoor_netherrack", blockID("TRAPDOOR_NETHERRACK"), b -> new BlockLogicTrapDoorStone(b, Material.netherrack));

        TRAPDOOR_GLASS_OBSIDIAN = obsidian
                .setVisualUpdateOnMetadata()
                .build("trapdoor.glass.obsidian", "trapdoor_glass_obsidian", blockID("TRAPDOOR_GLASS_OBSIDIAN"), b -> new BlockTrapDoorObsidian(b, Material.glass));

        TRAPDOOR_GLASS_QUARTZ = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(0.3F)
                .setResistance(0.3F)
                .setVisualUpdateOnMetadata()
                .setUseInternalLight()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build("trapdoor.glass.quartz", "trapdoor_glass_quartz", blockID("TRAPDOOR_GLASS_QUARTZ"), b -> new BlockLogicTrapDoor(b, Material.glass));

        TRAPDOOR_GLASS_STEEL = raw
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(0.3f)
                .setResistance(2000.0F)
                .setVisualUpdateOnMetadata()
                .setUseInternalLight()
                .build("trapdoor.glass.steel", "trapdoor_glass_steel", blockID("TRAPDOOR_GLASS_STEEL"), b -> new BlockLogicTrapDoor(b, Material.steel));

        TRAPDOOR_STEEL = raw
                .setHardness(5.0f)
                .setResistance(2000.0F)
                .setVisualUpdateOnMetadata()
                .build("trapdoor.steel", "trapdoor_steel", blockID("TRAPDOOR_STEEL"), b -> new BlockLogicTrapDoor(b, Material.steel));

        TRAPDOOR_GOLD = raw
                .setHardness(3.0f)
                .setVisualUpdateOnMetadata()
                .build("trapdoor.gold", "trapdoor_gold", blockID("TRAPDOOR_GOLD"), b -> new BlockLogicTrapDoor(b, Material.metal));

        TRAPDOOR_VERDIGRIS = verdigris
                .setVisualUpdateOnMetadata()
                .setFlammability(50, 50)
                .build("trapdoor.verdigris", "trapdoor_verdigris", blockID("TRAPDOOR_VERDIGRIS"), b -> new BlockLogicTrapDoor(b, Material.metal));
        TRAPDOOR_VERDIGRIS_SHINE = verdigris
                .setVisualUpdateOnMetadata()
                .build("trapdoor.verdigris.shine", "trapdoor_verdigris_shine", blockID("TRAPDOOR_VERDIGRIS_SHINE"), b -> new BlockLogicTrapDoor(b, Material.metal));

        BED_GOLD = raw
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .build("bed.gold", "bed_gold", blockID("BED_GOLD"), b -> new BlockLogicBedGold(b, Material.metal));

        SEAT_GOLD = raw
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .build("seat.gold", "seat_gold", blockID("SEAT_GOLD"), b -> new BlockLogicSeatGold(b, Material.metal));

        new BonusBlockDetails().initializeBlockDetails();

    }
}
