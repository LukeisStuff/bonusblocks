package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocksConfig;
import luke.bonusblocks.block.blockmodel.*;
import luke.bonusblocks.block.copper.*;
import luke.bonusblocks.block.silver.BlockFenceSilver;
import luke.bonusblocks.block.silver.BlockOreSilver;
import luke.bonusblocks.block.silver.BlockSilverBed;
import luke.bonusblocks.block.silver.BlockSilverSeat;
import luke.bonusblocks.item.BonusItems;
import net.minecraft.client.render.block.model.AxisAlignedBlockModel;
import net.minecraft.client.render.block.model.CrossedSquaresBlockModel;
import net.minecraft.client.render.block.model.DoorBlockModel;
import net.minecraft.client.render.block.model.TrapDoorBlockModel;
import net.minecraft.client.render.colorizer.Colorizers;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
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

    public int blockID(String blockName) {
        return BonusBlocksConfig.cfg.getInt("Block IDs." + blockName);
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

    public static Block SCORCHEDSTONE;

    public static Block PILLAR_SLATE;
    public static Block CAPSTONE_SLATE;

    public static Block MARBLE_POLISHED;

    public static Block SLATE_CARVED;
    public static Block MARBLE_CARVED;

    public static Block CLAY_BAKED;

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
    public static Block STAIRS_SLATE_POLISHED;
    public static Block STAIRS_MARBLE_POLISHED;
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

    public static Block doorStoneBottom;
    public static Block doorStoneTop;
    public static Block doorBasaltBottom;
    public static Block doorBasaltTop;
    public static Block doorLimestoneBottom;
    public static Block doorLimestoneTop;
    public static Block doorGraniteBottom;
    public static Block doorGraniteTop;
    public static Block doorMarbleBottom;
    public static Block doorMarbleTop;
    public static Block doorSlateBottom;
    public static Block doorSlateTop;
    public static Block doorPermafrostBottom;
    public static Block doorPermafrostTop;
    public static Block doorNetherrackBottom;
    public static Block doorNetherrackTop;
    public static Block doorLazuriteBottom;
    public static Block doorLazuriteTop;
    public static Block doorPeridotBottom;
    public static Block doorPeridotTop;

    public static Block trapdoorStone;
    public static Block trapdoorBasalt;
    public static Block trapdoorLimestone;
    public static Block trapdoorGranite;
    public static Block trapdoorMarble;
    public static Block trapdoorSlate;
    public static Block trapdoorPermafrost;
    public static Block trapdoorNetherrack;
    public static Block trapdoorLazurite;
    public static Block trapdoorPeridot;

    public static Block BEDROLL;



    public void initializeBlockDetails() {
        miningLevels.put(LAZURITE, 0);
        miningLevels.put(COBBLE_LAZURITE, 0);
        miningLevels.put(BRICK_LAZURITE, 0);
        miningLevels.put(LAZURITE_POLISHED, 0);
        miningLevels.put(lazuriteCarved, 0);
        miningLevels.put(slabCobbleLazurite, 0);
        miningLevels.put(slabBrickLazurite, 0);
        miningLevels.put(stairsCobbleLazurite, 0);
        miningLevels.put(stairsBrickLazurite, 0);
        miningLevels.put(peridot, 0);
        miningLevels.put(cobblePeridot, 0);
        miningLevels.put(brickPeridot, 0);
        miningLevels.put(peridotPolished, 0);
        miningLevels.put(peridotCarved, 0);
        miningLevels.put(slabCobblePeridot, 0);
        miningLevels.put(slabBrickPeridot, 0);
        miningLevels.put(stairsCobblePeridot, 0);
        miningLevels.put(stairsBrickPeridot, 0);


        miningLevels.put(blockRawIron, 1);
        miningLevels.put(girderIron, 1);
        miningLevels.put(blockRawCopper, 1);
        miningLevels.put(oreCopperStone, 1);
        miningLevels.put(oreCopperBasalt, 1);
        miningLevels.put(oreCopperLimestone, 1);
        miningLevels.put(oreCopperGranite, 1);
        miningLevels.put(blockCopper, 1);
        miningLevels.put(blockCopperTarnished, 1);
        miningLevels.put(blockCopperCorroded, 1);
        miningLevels.put(pipeCopper, 1);
        miningLevels.put(pipeCopperTarnished, 1);
        miningLevels.put(pipeCopperCorroded, 1);
        miningLevels.put(trapdoorCopper, 1);
        miningLevels.put(trapdoorCopperTarnished, 1);
        miningLevels.put(trapdoorCopperCorroded, 1);
        miningLevels.put(doorCopperTop, 1);
        miningLevels.put(doorCopperBottom, 1);
        miningLevels.put(doorCopperTarnishedTop, 1);
        miningLevels.put(doorCopperTarnishedBottom, 1);
        miningLevels.put(doorCopperCorrodedBottom, 1);
        miningLevels.put(doorCopperCorrodedTop, 1);
        miningLevels.put(fenceCopper, 1);
        miningLevels.put(fenceCopperTarnished, 1);
        miningLevels.put(fenceCopperCorroded, 1);
        miningLevels.put(slabCopper, 1);
        miningLevels.put(slabCopperTarnished, 1);
        miningLevels.put(slabCopperCorroded, 1);
        miningLevels.put(pressureplateCopper, 1);
        miningLevels.put(pressureplateCopperTarnished, 1);
        miningLevels.put(pressureplateCopperCorroded, 1);
        miningLevels.put(stairsCopper, 1);
        miningLevels.put(stairsCopperTarnished, 1);
        miningLevels.put(stairsCopperCorroded, 1);
        miningLevels.put(slabBrickLapis, 1);
        miningLevels.put(stairsBrickLapis, 1);


        miningLevels.put(blockRawGold, 2);
        miningLevels.put(fenceGold, 2);
        miningLevels.put(slabBrickGold, 2);
        miningLevels.put(stairsBrickGold, 2);
        miningLevels.put(brickSteel, 2);
        miningLevels.put(slabBrickSteel, 2);
        miningLevels.put(stairsBrickSteel, 2);
        miningLevels.put(trapdoorSteel, 2);
        miningLevels.put(doorSteelTop, 2);
        miningLevels.put(doorSteelBottom, 2);
        miningLevels.put(blockCrudeSteel, 2);
        miningLevels.put(fenceSteel, 2);

        miningLevels.put(blockSilver, 2);
        miningLevels.put(blockRawSilver, 2);
        miningLevels.put(brickSilver, 2);
        miningLevels.put(oreSilverStone, 2);
        miningLevels.put(oreSilverBasalt, 2);
        miningLevels.put(oreSilverLimestone, 2);
        miningLevels.put(oreSilverGranite, 2);
        miningLevels.put(seatSilver, 2);
        miningLevels.put(bedSilver, 2);
        miningLevels.put(chandelierSilver, 2);
        miningLevels.put(candelabraSilver, 2);
        miningLevels.put(chimesSilver, 2);
        miningLevels.put(vaneSilver, 2);
        miningLevels.put(vaseSilver, 2);
        miningLevels.put(fenceSilver, 2);
        miningLevels.put(lanternSilver, 2);
        miningLevels.put(doorSilverBottom, 2);
        miningLevels.put(doorSilverTop, 2);
        miningLevels.put(trapdoorSilver, 2);
        miningLevels.put(stairsBrickSilver, 2);
        miningLevels.put(slabBrickSilver, 2);


        //itemsList[cratePainted.id] = new ItemBlockPainted(cratePainted, false);

        stoneToMossMap.put(SAPLING_OAK, BonusBlocks.saplingOakMossy);
        stoneToMossMap.put(MOSS_STONE, BonusBlocks.moss);
        stoneToMossMap.put(MOSS_BASALT, BonusBlocks.moss);
        stoneToMossMap.put(MOSS_LIMESTONE, BonusBlocks.moss);
        stoneToMossMap.put(MOSS_GRANITE, BonusBlocks.moss);

        LookupFuelFurnace.instance.addFuelEntry(logJacaranda.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(logScorched.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(logCacao.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(logShrub.id, 300);

        LookupFuelFurnace.instance.addFuelEntry(box.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(crate.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(cratePainted.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(bookshelfEmptyPlanksOak.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(thatch.id, 400);
        LookupFuelFurnace.instance.addFuelEntry(branch.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(saplingJacaranda.id, 100);
        LookupFuelFurnace.instance.addFuelEntry(saplingOakMossy.id, 100);

        CreativeHelper.setParent(lazurite, PERMAFROST);
        CreativeHelper.setParent(peridot, PERMAFROST);

        CreativeHelper.setParent(cobbleLazurite, COBBLE_PERMAFROST);
        CreativeHelper.setParent(cobblePeridot, COBBLE_PERMAFROST);

        CreativeHelper.setParent(pillarSlate, PILLAR_MARBLE);

        CreativeHelper.setParent(scorchedstone, SANDSTONE);

        CreativeHelper.setParent(box, PLANKS_OAK);

        CreativeHelper.setParent(crate, TROMMEL_IDLE);

        for (int color = 1; color < 17; color++) {
            CreativeHelper.setParent(cratePainted, color - 1, TROMMEL_IDLE, 0);
        }

        for (int color = 0; color < 16; color++) {
            CreativeHelper.setParent(cratePainted, color, TROMMEL_IDLE, 0);
        }

        CreativeHelper.setParent(bookshelfEmptyPlanksOak, BOOKSHELF_PLANKS_OAK);

        CreativeHelper.setParent(candleSoulwax, TORCH_COAL);

        CreativeHelper.setParent(moss, MOSS_GRANITE);

        CreativeHelper.setParent(STONE_CARVED, PILLAR_MARBLE);
        CreativeHelper.setParent(BASALT_CARVED, PILLAR_MARBLE);
        CreativeHelper.setParent(LIMESTONE_CARVED, PILLAR_MARBLE);
        CreativeHelper.setParent(GRANITE_CARVED, PILLAR_MARBLE);
        CreativeHelper.setParent(CAPSTONE_MARBLE, PILLAR_MARBLE);
        CreativeHelper.setParent(marbleCarved, PILLAR_MARBLE);
        CreativeHelper.setParent(slateCarved, PILLAR_MARBLE);
        CreativeHelper.setParent(PERMAFROST_CARVED, PILLAR_MARBLE);
        CreativeHelper.setParent(peridotCarved, PILLAR_MARBLE);
        CreativeHelper.setParent(lazuriteCarved, PILLAR_MARBLE);

        CreativeHelper.setParent(overgrownGrass, GRASS_SCORCHED);
        CreativeHelper.setParent(overgrownGrassRetro, GRASS_SCORCHED);
        CreativeHelper.setParent(overgrownGrassScorched, GRASS_SCORCHED);
        CreativeHelper.setParent(overgrownPath, PATH_DIRT);

        CreativeHelper.setParent(dirtRough, DIRT);

        CreativeHelper.setParent(skull, PUMPKIN_CARVED_ACTIVE);
        CreativeHelper.setParent(skullCarved, PUMPKIN_CARVED_ACTIVE);
        CreativeHelper.setParent(skullActive, PUMPKIN_CARVED_ACTIVE);

        CreativeHelper.setParent(glassObsidian, GLASS);
        CreativeHelper.setParent(glassQuartz, GLASS_TINTED);

        CreativeHelper.setParent(trapdoorGlassObsidian, TRAPDOOR_GLASS);
        CreativeHelper.setParent(trapdoorSteel, TRAPDOOR_GLASS);
        CreativeHelper.setParent(trapdoorCopper, TRAPDOOR_GLASS);
        CreativeHelper.setParent(trapdoorCopperTarnished, TRAPDOOR_GLASS);
        CreativeHelper.setParent(trapdoorCopperCorroded, TRAPDOOR_GLASS);
        CreativeHelper.setParent(trapdoorSilver, TRAPDOOR_GLASS);

        CreativeHelper.setParent(flowerSilver, FLOWER_RED);
        CreativeHelper.setParent(flowerCyan, FLOWER_RED);
        CreativeHelper.setParent(flowerMagenta, FLOWER_RED);
        CreativeHelper.setParent(flowerLime, FLOWER_RED);

        CreativeHelper.setParent(petalYellow, FLOWER_RED);
        CreativeHelper.setParent(petalRed, FLOWER_RED);
        CreativeHelper.setParent(petalCyan, FLOWER_RED);
        CreativeHelper.setParent(petalPurple, FLOWER_RED);
        CreativeHelper.setParent(petalPink, FLOWER_RED);
        CreativeHelper.setParent(petalSilver, FLOWER_RED);
        CreativeHelper.setParent(petalOrange, FLOWER_RED);
        CreativeHelper.setParent(petalLightBlue, FLOWER_RED);
        CreativeHelper.setParent(petalMagenta, FLOWER_RED);
        CreativeHelper.setParent(petalLime, FLOWER_RED);

        CreativeHelper.setParent(petalLayerYellow, FLOWER_RED);
        CreativeHelper.setParent(petalLayerRed, FLOWER_RED);
        CreativeHelper.setParent(petalLayerCyan, FLOWER_RED);
        CreativeHelper.setParent(petalLayerPurple, FLOWER_RED);
        CreativeHelper.setParent(petalLayerPink, FLOWER_RED);
        CreativeHelper.setParent(petalLayerSilver, FLOWER_RED);
        CreativeHelper.setParent(petalLayerOrange, FLOWER_RED);
        CreativeHelper.setParent(petalLayerLightBlue, FLOWER_RED);
        CreativeHelper.setParent(petalLayerMagenta, FLOWER_RED);
        CreativeHelper.setParent(petalLayerLime, FLOWER_RED);

        CreativeHelper.setParent(mushroomGray, MUSHROOM_RED);

        CreativeHelper.setParent(fungiBrown, mushroomRed);
        CreativeHelper.setParent(fungiRed, mushroomRed);
        CreativeHelper.setParent(fungiGray, mushroomRed);

        CreativeHelper.setParent(logShrub, logOakMossy);
        CreativeHelper.setParent(logCacao, logOakMossy);
        CreativeHelper.setParent(logJacaranda, logOakMossy);
        CreativeHelper.setParent(logScorched, logOakMossy);

        CreativeHelper.setParent(leavesOakMossy, leavesCacao);
        CreativeHelper.setParent(leavesJacaranda, leavesCacao);
        CreativeHelper.setParent(branch, leavesCacao);

        CreativeHelper.setParent(saplingOakMossy, saplingCacao);
        CreativeHelper.setParent(saplingJacaranda, saplingCacao);

        CreativeHelper.setParent(oreCopperStone, oreIronGranite);
        CreativeHelper.setParent(oreCopperBasalt, oreIronGranite);
        CreativeHelper.setParent(oreCopperLimestone, oreIronGranite);
        CreativeHelper.setParent(oreCopperGranite, oreIronGranite);

        CreativeHelper.setParent(oreSilverStone, oreGoldGranite);
        CreativeHelper.setParent(oreSilverBasalt, oreGoldGranite);
        CreativeHelper.setParent(oreSilverLimestone, oreGoldGranite);
        CreativeHelper.setParent(oreSilverGranite, oreGoldGranite);

        CreativeHelper.setParent(pumiceDry, spongeWet);
        CreativeHelper.setParent(pumiceWet, spongeWet);

        CreativeHelper.setParent(brimstone, bedrock);

        CreativeHelper.setParent(clayBaked, blockClay);

        CreativeHelper.setParent(blockSulphur, gravel);
        CreativeHelper.setParent(blockSugar, gravel);

        CreativeHelper.setParent(brickScorchedstone, brickIron);
        CreativeHelper.setParent(brickMud, brickIron);
        CreativeHelper.setParent(brickSteel, brickIron);
        CreativeHelper.setParent(brickQuartz, brickIron);
        CreativeHelper.setParent(brickOlivine, brickIron);
        CreativeHelper.setParent(brickSilver, brickIron);
        CreativeHelper.setParent(brickClayBaked, brickIron);
        CreativeHelper.setParent(brickLazurite, brickIron);
        CreativeHelper.setParent(brickPeridot, brickIron);

        CreativeHelper.setParent(girderIron, pipeCopperCorroded);

        CreativeHelper.setParent(fenceCopper, fenceChainlink);
        CreativeHelper.setParent(fenceCopperTarnished, fenceChainlink);
        CreativeHelper.setParent(fenceCopperCorroded, fenceChainlink);
        CreativeHelper.setParent(fenceSilver, fenceChainlink);
        CreativeHelper.setParent(fenceGold, fenceChainlink);
        CreativeHelper.setParent(fenceSteel, fenceChainlink);


        CreativeHelper.setParent(pressureplateCopper, pressureplateCobbleStone);
        CreativeHelper.setParent(pressureplateCopperTarnished, pressureplateCobbleStone);
        CreativeHelper.setParent(pressureplateCopperCorroded, pressureplateCobbleStone);

        CreativeHelper.setParent(meshCopper, mesh);
        CreativeHelper.setParent(meshCopperTarnished, Blocks.MESH);
        CreativeHelper.setParent(meshCopperCorroded, mesh);

        CreativeHelper.setParent(marblePolished, slatePolished);
        CreativeHelper.setParent(lazuritePolished, slatePolished);
        CreativeHelper.setParent(peridotPolished, slatePolished);

        CreativeHelper.setParent(soulslate, soulsand);

        CreativeHelper.setParent(blockBone, blockCharcoal);
        CreativeHelper.setParent(thatch, blockCharcoal);
        CreativeHelper.setParent(blockCloth, blockCharcoal);
        CreativeHelper.setParent(blockSlime, blockCharcoal);
        CreativeHelper.setParent(blockLeather, blockCharcoal);
        CreativeHelper.setParent(blockWicker, blockCharcoal);
        CreativeHelper.setParent(blockRawGold, blockCharcoal);
        CreativeHelper.setParent(blockRawIron, blockCharcoal);
        CreativeHelper.setParent(blockRawCopper, blockCharcoal);
        CreativeHelper.setParent(blockRawCopperTarnished, blockCharcoal);
        CreativeHelper.setParent(blockRawCopperCorroded, blockCharcoal);
        CreativeHelper.setParent(blockRawSilver, blockCharcoal);
        CreativeHelper.setParent(blockFlint, blockCharcoal);
        CreativeHelper.setParent(blockCrudeSteel, blockCharcoal);
        CreativeHelper.setParent(blockCopper, blockCharcoal);
        CreativeHelper.setParent(blockCopperTarnished, blockCharcoal);
        CreativeHelper.setParent(blockCopperCorroded, blockCharcoal);
        CreativeHelper.setParent(blockSilver, blockCharcoal);

        CreativeHelper.setParent(slabCobbleStoneMossy, slabBasaltPolished);
        CreativeHelper.setParent(slabSlatePolished, slabBasaltPolished);
        CreativeHelper.setParent(slabMarblePolished, slabBasaltPolished);
        CreativeHelper.setParent(slabBrickStonePolishedMossy, slabBasaltPolished);
        CreativeHelper.setParent(slabBrickGold, slabBasaltPolished);
        CreativeHelper.setParent(slabBrickIron, slabBasaltPolished);
        CreativeHelper.setParent(slabBrickLapis, slabBasaltPolished);
        CreativeHelper.setParent(slabScorchedstone, slabBasaltPolished);
        CreativeHelper.setParent(slabBrickScorchedstone, slabBasaltPolished);
        CreativeHelper.setParent(slabBrickMud, slabBasaltPolished);
        CreativeHelper.setParent(slabBrickSteel, slabBasaltPolished);
        CreativeHelper.setParent(slabBrickQuartz, slabBasaltPolished);
        CreativeHelper.setParent(slabBrickOlivine, slabBasaltPolished);
        CreativeHelper.setParent(slabBrickSilver, slabBasaltPolished);
        CreativeHelper.setParent(slabCopper, slabBasaltPolished);
        CreativeHelper.setParent(slabCopperTarnished, slabBasaltPolished);
        CreativeHelper.setParent(slabCopperCorroded, slabBasaltPolished);
        CreativeHelper.setParent(slabBrickClayBaked, slabBasaltPolished);
        CreativeHelper.setParent(Block.slabBrickSandstone, slabBasaltPolished);
        CreativeHelper.setParent(Block.slabCobblePermafrost, slabBasaltPolished);
        CreativeHelper.setParent(Block.slabBrickPermafrost, slabBasaltPolished);
        CreativeHelper.setParent(Block.slabPermafrostPolished, slabBasaltPolished);
        CreativeHelper.setParent(slabBrickLazurite, slabBasaltPolished);
        CreativeHelper.setParent(slabLazuritePolished, slabBasaltPolished);
        CreativeHelper.setParent(slabCobbleLazurite, slabBasaltPolished);
        CreativeHelper.setParent(slabCobblePeridot, slabBasaltPolished);
        CreativeHelper.setParent(slabPeridotPolished, slabBasaltPolished);
        CreativeHelper.setParent(slabBrickPeridot, slabBasaltPolished);


        for (int color = 0; color < 16; color++) {
            CreativeHelper.setParent(slabWool, color << 4, slabBasaltPolished, 0);
        }

        CreativeHelper.setParent(stairsCobbleStoneMossy, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickStonePolishedMossy, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickGold, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickIron, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickLapis, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickScorchedstone, stairsBrickStone);
        CreativeHelper.setParent(stairsScorchedstone, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickMud, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickSteel, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickQuartz, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickOlivine, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickSilver, stairsBrickStone);
        CreativeHelper.setParent(stairsCopper, stairsBrickStone);
        CreativeHelper.setParent(stairsCopperTarnished, stairsBrickStone);
        CreativeHelper.setParent(stairsCopperCorroded, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickClayBaked, stairsBrickStone);

        CreativeHelper.setParent(stairsBrickLazurite, stairsBrickStone);
        CreativeHelper.setParent(stairsCobbleLazurite, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickPeridot, stairsBrickStone);
        CreativeHelper.setParent(stairsCobblePeridot, stairsBrickStone);

        for (int color = 0; color < 16; color++) {
            CreativeHelper.setParent(stairsWool, color << 4, stairsBrickStone, 0);
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
                .setBlockModel(BlockModelPebbles::new)
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
                .setBlockModel(BlockModelSlab::new)
                .setItemBlock(ItemBlockSlab::new)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE);

        BlockBuilder stairs = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
                .setHardness(1.0f)
                .setResistance(10.0f)
                .setUseInternalLight()
                .setVisualUpdateOnMetadata()
                .setBlockModel(BlockModelStairs::new)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE);



        /// Blocks

        // Box
        box = boxes
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/box"))
                .build(new Block("box", blockID("box"), Material.wood));

        // Crates
        crate = crates
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/crate"))
                .build(new Block("crate", blockID("crate"), Material.wood));
        cratePainted = crates
                .setItemBlock(block -> new ItemBlockPainted(block, false))
                .setBlockModel(BlockModelCratePainted::new)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockPaintedCrate("crate.painted", blockID("cratePainted")));


        // Bookshelf
        bookshelfEmptyPlanksOak = new BlockBuilder(MOD_ID)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("minecraft:block/planks_oak", "bonusblocks:block/bookshelf_empty_side"))
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 0.8f))
                .setHardness(1.5f)
                .setResistance(1.0f)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
                .build(new Block("bookshelf.empty.planks.oak", blockID("bookshelfEmptyPlanksOak"), Material.wood));

        // Leaves and Branch
        branch = leaves
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/branch"))
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 0.5f))
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
                .build(new BlockBranch("branch", blockID("branch"), Material.leaves));

        leavesOakMossy = leaves
                .setBlockModel(block -> new BlockModelLeaves<>(block, "bonusblocks:block/leaves_oak_mossy"))
                .setBlockColor(block -> (new BlockColorCustom(Colorizers.oak)))
                .build(new BlockLeavesBase("leaves.oak.mossy", blockID("leavesOakMossy"), Material.leaves) {
                    @Override
                    public Block getSapling() {
                        return BonusBlocks.saplingOakMossy;
                    }
                });
        leavesJacaranda = leaves
                .setBlockModel(block -> new BlockModelLeaves<>(block, "bonusblocks:block/leaves_jacaranda"))
                .build(new BlockLeavesBase("leaves.jacaranda", blockID("leavesJacaranda"), Material.leaves) {
                    @Override
                    public Block getSapling() {
                        return BonusBlocks.saplingJacaranda;
                    }
                });


        // Saplings
        saplingJacaranda = sapling
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/sapling_jacaranda"))
                .build(new BlockSaplingJacaranda("sapling.jacaranda", blockID("saplingJacaranda")));
        saplingOakMossy = sapling
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/sapling_oak_mossy"))
                .build(new BlockSaplingMossyOak("sapling.oak.mossy", blockID("saplingOakMossy")));


        // Logs
        logShrub = log
                .setBlockModel(block -> new AxisAlignedBlockModel<>(block).withTextures("bonusblocks:block/log_shrub_top", "bonusblocks:block/log_shrub_side"))
                .build(new BlockLog("log.shrub", blockID("logShrub")));
        logCacao = log
                .setBlockModel(block -> new AxisAlignedBlockModel<>(block).withTextures("bonusblocks:block/log_cacao_top", "bonusblocks:block/log_cacao_side"))
                .build(new BlockLog("log.cacao", blockID("logCacao")));
        logJacaranda = log
                .setBlockModel(block -> new AxisAlignedBlockModel<>(block).withTextures("bonusblocks:block/log_jacaranda_top", "bonusblocks:block/log_jacaranda_side"))
                .build(new BlockLog("log.jacaranda", blockID("logJacaranda")));
        logScorched = log
                .setBlockModel(block -> new AxisAlignedBlockModel<>(block).withTextures("bonusblocks:block/log_scorched_top", "bonusblocks:block/log_scorched_side"))
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.2f))
                .setHardness(1.8f)
                .build(new BlockLog("log.scorched", blockID("logScorched")));


        // Moss
        moss = grass
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/moss"))
                .setFlammability(100, 30)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
                .build(new BlockMossy("moss", blockID("moss"), Material.moss));


        // Overgrown Grass
        overgrownGrass = grass
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("minecraft:block/grass_top"))
                .setBlockColor(block -> (new BlockColorCustom(Colorizers.grass)))
                .build(new Block("grass.overgrown", blockID("overgrownGrass"), Material.grass));
        overgrownGrassRetro = grass
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("minecraft:block/grass_retro_top"))
                .build(new Block("grass.retro.overgrown", blockID("overgrownGrassRetro"), Material.grass));
        overgrownGrassScorched = grass
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("minecraft:block/grass_scorched_top"))
                .build(new Block("grass.scorched.overgrown", blockID("overgrownGrassScorched"), Material.grass));
        overgrownPath = grass
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("minecraft:block/grass_path_top"))
                .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                .setBlockDrop(BonusBlocks.overgrownPath)
                .build(new BlockDirtPath("path.overgrown", blockID("overgrownPath")));

        // Flowers

        flowerSilver = flower
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/flower_lightgray"))
                .build(new BlockFlower("flower.silver", blockID("flowerSilver")));

        flowerCyan = flower
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/flower_cyan"))
                .build(new BlockFlower("flower.cyan", blockID("flowerCyan")));

        flowerMagenta = flower
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/flower_magenta"))
                .build(new BlockFlower("flower.magenta", blockID("flowerMagenta")));
        flowerLime = flower
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/flower_lime"))
                .build(new BlockFlower("flower.lime", blockID("flowerLime")));

        // Petals
        petalYellow = petal
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/petal_yellow"))
                .build(new BlockPetal("petal.yellow", blockID("petalYellow"), Material.grass));
        petalRed = petal
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/petal_red"))
                .build(new BlockPetal("petal.red", blockID("petalRed"), Material.grass));
        petalCyan = petal
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/petal_cyan"))
                .build(new BlockPetal("petal.cyan", blockID("petalCyan"), Material.grass));
        petalPurple = petal
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/petal_purple"))
                .build(new BlockPetal("petal.purple", blockID("petalPurple"), Material.grass));
        petalPink = petal
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/petal_pink"))
                .build(new BlockPetal("petal.pink", blockID("petalPink"), Material.grass));
        petalSilver = petal
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/petal_lightgray"))
                .build(new BlockPetal("petal.silver", blockID("petalSilver"), Material.grass));
        petalOrange = petal
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/petal_orange"))
                .build(new BlockPetal("petal.orange", blockID("petalOrange"), Material.grass));
        petalLightBlue = petal
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/petal_lightblue"))
                .build(new BlockPetal("petal.lightblue", blockID("petalLightBlue"), Material.grass));
        petalMagenta = petal
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/petal_magenta"))
                .build(new BlockPetal("petal.magenta", blockID("petalMagenta"), Material.grass));
        petalLime = petal
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/petal_lime"))
                .build(new BlockPetal("petal.lime", blockID("petalLime"), Material.grass));

        // Petal Layers
        petalLayerYellow = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(block).withTextures("bonusblocks:block/petal_layer_yellow"))
                .build(new BlockLayerPetal("layer.petal.yellow", blockID("petalLayerYellow"), Material.grass));
        petalLayerRed = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(block).withTextures("bonusblocks:block/petal_layer_red"))
                .build(new BlockLayerPetal("layer.petal.red", blockID("petalLayerRed"), Material.grass));
        petalLayerCyan = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(block).withTextures("bonusblocks:block/petal_layer_cyan"))
                .build(new BlockLayerPetal("layer.petal.cyan", blockID("petalLayerCyan"), Material.grass));
        petalLayerPurple = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(block).withTextures("bonusblocks:block/petal_layer_purple"))
                .build(new BlockLayerPetal("layer.petal.purple", blockID("petalLayerPurple"), Material.grass));
        petalLayerPink = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(block).withTextures("bonusblocks:block/petal_layer_pink"))
                .build(new BlockLayerPetal("layer.petal.pink", blockID("petalLayerPink"), Material.grass));
        petalLayerSilver = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(block).withTextures("bonusblocks:block/petal_layer_lightgray"))
                .build(new BlockLayerPetal("layer.petal.silver", blockID("petalLayerSilver"), Material.grass));
        petalLayerOrange = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(block).withTextures("bonusblocks:block/petal_layer_orange"))
                .build(new BlockLayerPetal("layer.petal.orange", blockID("petalLayerOrange"), Material.grass));
        petalLayerLightBlue = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(block).withTextures("bonusblocks:block/petal_layer_lightblue"))
                .build(new BlockLayerPetal("layer.petal.lightblue", blockID("petalLayerLightBlue"), Material.grass));
        petalLayerMagenta = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(block).withTextures("bonusblocks:block/petal_layer_magenta"))
                .build(new BlockLayerPetal("layer.petal.magenta", blockID("petalLayerMagenta"), Material.grass));
        petalLayerLime = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(block).withTextures("bonusblocks:block/petal_layer_lime"))
                .build(new BlockLayerPetal("layer.petal.lime", blockID("petalLayerLime"), Material.grass));

        // Mushroom
        mushroomGray = flower
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/mushroom_gray"))
                .build(new BlockMushroom("mushroom.gray", blockID("mushroomGray")));

        // Mushroom Blocks
        fungiBrown = grass
                .setLuminance(2)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_mushroom_brown"))
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build(new Block("block.mushroom.brown", blockID("fungiBrown"), Material.dirt));
        fungiRed = grass
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_mushroom_red"))
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build(new Block("block.mushroom.red", blockID("fungiRed"), Material.dirt));
        fungiGray = grass
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_mushroom_gray"))
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build(new Block("block.mushroom.gray", blockID("fungiGray"), Material.dirt));

        // Bone Block
        blockBone = stone
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setBlockModel(block -> new AxisAlignedBlockModel<>(block).withTextures("bonusblocks:block/block_bone_top", "bonusblocks:block/block_bone_side"))
                .build(new BlockAxisAligned("block.bone", blockID("blockBone"), Material.stone));

        // Thatch
        thatch = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 0.6f, 1.2f))
                .setHardness(0.6f)
                .setResistance(0.6f)
                .setBlockModel(block -> new AxisAlignedBlockModel<>(block).withTextures("bonusblocks:block/thatch_top", "bonusblocks:block/thatch_side"))
                .setFlammability(60, 120)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
                .build(new BlockThatch("thatch", blockID("thatch"), Material.grass));

        // Cloth Block
        blockCloth = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.8f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_cloth"))
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.MINEABLE_BY_AXE)
                .build(new BlockCloth("block.cloth", blockID("blockCloth"), Material.cloth));

        // Slime Block
        blockSlime = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.5f))
                .setHardness(0.2f)
                .setResistance(0.2f)
                .setLightOpacity(6)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_slime"))
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build(new BlockSlime("block.slime", blockID("blockSlime")));

        // Sulphur Block
        blockSulphur = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                .setHardness(0.5f)
                .setResistance(0.5f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_sulphur"))
                .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                .build(new BlockSulphur("block.sulphur", blockID("blockSulphur"), Material.explosive));

        // Sugar Block
        blockSugar = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                .setHardness(0.3f)
                .setResistance(0.3f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_sugar"))
                .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.BROKEN_BY_FLUIDS)
                .build(new BlockSand("block.sugar", blockID("blockSugar")));

        // Leather Block
        blockLeather = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.6f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_leather"))
                .setFlammability(5, 10)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build(new Block("block.leather", blockID("blockLeather"), Material.cloth));

        // Wicker Block
        blockWicker = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.5f)
                .setResistance(0.5f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("minecraft:block/basket_bottom"))
                .setFlammability(60, 120)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build(new Block("block.wicker", blockID("blockWicker"), Material.cloth));

        // Flint Block
        blockFlint = raw
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_flint"))
                .setInfiniburn()
                .build(new Block("block.flint", blockID("blockFlint"), Material.stone));

        // Crude Steel Block
        blockCrudeSteel = raw
                .setHardness(4.0f)
                .setResistance(1000.0f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_steel_crude"))
                .build(new Block("block.steel.crude", blockID("blockCrudeSteel"), Material.metal));

        // Raw Blocks
        blockRawIron = raw
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_iron_raw"))
                .build(new Block("block.raw.iron", blockID("blockRawIron"), Material.metal));
        blockRawGold = raw
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_gold_raw"))
                .build(new Block("block.raw.gold", blockID("blockRawGold"), Material.metal));
        blockRawCopper = raw
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_copper_raw"))
                .setTicking(true)
                .build(new Block("block.raw.copper", blockID("blockRawCopper"), Material.metal) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.blockRawCopperTarnished.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });
        blockRawCopperTarnished = raw
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_copper_tarnished_raw"))
                .setTicking(true)
                .build(new Block("block.raw.copper.tarnished", blockID("blockRawCopperTarnished"), Material.metal) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.blockRawCopperCorroded.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });
        blockRawCopperCorroded = raw
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_copper_corroded_raw"))
                .build(new Block("block.raw.copper.corroded", blockID("blockRawCopperCorroded"), Material.metal));
        blockRawSilver = silver
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_silver_raw"))
                .build(new Block("block.raw.silver", blockID("blockRawSilver"), Material.metal));

        // Nuggets

        // Make Custom BlockMODEL for these fuckers
        overlayRawIron = pebble
                .setBlockModel(BlockModelNuggetsIron::new)
                .build(new BlockOverlayRawIron("overlay.iron", blockID("overlayRawIron"), Material.metal));
        overlayRawGold = pebble
                .setBlockModel(BlockModelNuggetsGold::new)
                .build(new BlockOverlayRawGold("overlay.gold", blockID("overlayRawGold"), Material.metal));
        overlayRawCopper = pebble
                .setBlockModel(BlockModelNuggetsCopper::new)
                .build(new BlockOverlayRawCopper("overlay.copper", blockID("overlayRawCopper"), Material.metal));
        overlayRawSilver = pebble
                .setBlockModel(BlockModelNuggetsSilver::new)
                .build(new BlockOverlayRawSilver("overlay.silver", blockID("overlayRawSilver"), Material.metal));

        // Copper Ores
        oreCopperStone = ore
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/ore_copper_stone"))
                .build(new BlockOreCopper("ore.copper.stone", blockID("oreCopperStone")));
        oreCopperBasalt = ore
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/ore_copper_basalt"))
                .build(new BlockOreCopper("ore.copper.basalt", blockID("oreCopperBasalt")));
        oreCopperLimestone = ore
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/ore_copper_limestone"))
                .build(new BlockOreCopper("ore.copper.limestone", blockID("oreCopperLimestone")));
        oreCopperGranite = ore
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/ore_copper_granite"))
                .build(new BlockOreCopper("ore.copper.granite", blockID("oreCopperGranite")));

        oreSilverStone = ore
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/ore_silver_stone"))
                .build(new BlockOreSilver("ore.silver.stone", blockID("oreSilverStone")));
        oreSilverBasalt = ore
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/ore_silver_basalt"))
                .build(new BlockOreSilver("ore.silver.basalt", blockID("oreSilverBasalt")));
        oreSilverLimestone = ore
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/ore_silver_limestone"))
                .build(new BlockOreSilver("ore.silver.limestone", blockID("oreSilverLimestone")));
        oreSilverGranite = ore
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/ore_silver_granite"))
                .build(new BlockOreSilver("ore.silver.granite", blockID("oreSilverGranite")));


        // Copper Blocks
        blockCopper = raw
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_copper"))
                .setTicking(true)
                .build(new Block("block.copper", blockID("blockCopper"), Material.metal) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.blockCopperTarnished.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });
        blockCopperTarnished = raw
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_copper_tarnished"))
                .setTicking(true)
                .build(new Block("block.copper.tarnished", blockID("blockCopperTarnished"), Material.metal) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.blockCopperCorroded.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });
        blockCopperCorroded = raw
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_copper_corroded"))
                .build(new Block("block.copper.corroded", blockID("blockCopperCorroded"), Material.metal));


        // Copper Mesh
        meshCopper = raw
                .setBlockModel(block -> new BlockModelTransparent<>(block, true).withTextures("bonusblocks:block/mesh_copper"))
                .setTicking(true)
                .build(new BlockTransparent("mesh.copper", blockID("meshCopper"), Material.metal) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.meshCopperTarnished.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });
        meshCopperTarnished = raw
                .setBlockModel(block -> new BlockModelTransparent<>(block, true).withTextures("bonusblocks:block/mesh_copper_tarnished"))
                .setTicking(true)
                .build(new BlockTransparent("mesh.copper.tarnished", blockID("meshCopperTarnished"), Material.metal) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.meshCopperCorroded.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });
        meshCopperCorroded = raw
                .setBlockModel(block -> new BlockModelTransparent<>(block, true).withTextures("bonusblocks:block/mesh_copper_corroded"))
                .build(new BlockTransparent("mesh.copper.corroded", blockID("meshCopperCorroded"), Material.metal) {
                });


        // Copper Pipe
        pipeCopper = raw
                .setIcon("bonusblocks:block/pipe_copper")
                .setBlockModel(block -> new DFBlockModelBuilder(MOD_ID).setBlockModel("block/pipe.json").setBlockState(MOD_ID, "pipe_states.json").setMetaStateInterpreter(new PipeMetaStateInterpreter()).setRender3D(false).build(pipeCopper))
                .build(new BlockCopperPipe("pipe.copper", blockID("pipeCopper"), Material.metal));

        pipeCopperTarnished = raw
                .setIcon("bonusblocks:block/pipe_copper_tarnished")
                .setBlockModel(block -> new DFBlockModelBuilder(MOD_ID).setBlockModel("block/tarnishedpipe.json").setBlockState(MOD_ID, "tarnished_pipe_states.json").setMetaStateInterpreter(new PipeMetaStateInterpreter()).setRender3D(false).build(pipeCopperTarnished))
                .build(new BlockCopperPipe("pipe.copper.tarnished", blockID("pipeCopperTarnished"), Material.metal) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.pipeCopperCorroded.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });

        pipeCopperCorroded = raw
                .setIcon("bonusblocks:block/pipe_copper_corroded")
                .setVisualUpdateOnMetadata()
                .setBlockModel(block -> new DFBlockModelBuilder(MOD_ID).setBlockModel("block/corrodedpipe.json").setBlockState(MOD_ID, "corroded_pipe_states.json").setMetaStateInterpreter(new PipeMetaStateInterpreter()).setRender3D(false).build(pipeCopperCorroded))
                .build(new BlockCopperPipe("pipe.copper.corroded", blockID("pipeCopperCorroded"), Material.metal) {
                    @Override
                    public void updateTick(World world, int x, int y, int z, Random rand) {
                    }
                });


        // Copper Trapdoor
        trapdoorCopper = raw
                .setBlockModel(block -> new BlockModelTrapDoor<>(block).withTextures("bonusblocks:block/trapdoor_copper_top", "bonusblocks:block/trapdoor_copper_side"))
                .setVisualUpdateOnMetadata()
                .setTicking(true)
                .build(new BlockTrapDoor("trapdoor.copper", blockID("trapdoorCopper"), Material.stone, false) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.trapdoorCopperTarnished.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });
        trapdoorCopperTarnished = raw
                .setBlockModel(block -> new BlockModelTrapDoor<>(block).withTextures("bonusblocks:block/trapdoor_copper_tarnished_top", "bonusblocks:block/trapdoor_copper_tarnished_side"))
                .setVisualUpdateOnMetadata()
                .setTicking(true)
                .build(new BlockTrapDoor("trapdoor.copper.tarnished", blockID("trapdoorCopperTarnished"), Material.stone, false) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.trapdoorCopperCorroded.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });
        trapdoorCopperCorroded = raw
                .setBlockModel(block -> new BlockModelTrapDoor<>(block).withTextures("bonusblocks:block/trapdoor_copper_corroded_top", "bonusblocks:block/trapdoor_copper_corroded_side"))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoor("trapdoor.copper.corroded", blockID("trapdoorCopperCorroded"), Material.stone, false));


        // Copper Doors
        doorCopperBottom = raw
                .setBlockModel(block -> new BlockModelDoor<>(block).withTextures("bonusblocks:block/door_copper_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockCopperDoor("door.copper.bottom", blockID("doorCopperBottom"), Material.stone, false));
        doorCopperTop = raw
                .setBlockModel(block -> new BlockModelDoor<>(block).withTextures("bonusblocks:block/door_copper_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockCopperDoor("door.copper.top", blockID("doorCopperTop"), Material.stone, true));

        doorCopperTarnishedBottom = raw
                .setBlockModel(block -> new BlockModelDoor<>(block).withTextures("bonusblocks:block/door_copper_tarnished_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockCopperTarnishedDoor("door.copper.tarnished.bottom", blockID("doorCopperTarnishedBottom"), Material.stone, false));
        doorCopperTarnishedTop = raw
                .setBlockModel(block -> new BlockModelDoor<>(doorCopperTarnishedTop).withTextures("bonusblocks:block/door_copper_tarnished_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockCopperTarnishedDoor("door.copper.tarnished.top", blockID("doorCopperTarnishedTop"), Material.stone, true));

        doorCopperCorrodedBottom = raw
                .setBlockModel(block -> new BlockModelDoor<>(block).withTextures("bonusblocks:block/door_copper_corroded_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockCopperDoor("door.copper.corroded.bottom", blockID("doorCopperCorrodedBottom"), Material.stone, false) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorCopperCorroded)};
                        }
                        return null;
                    }
                });
        doorCopperCorrodedTop = raw
                .setBlockModel(block -> new BlockModelDoor<>(block).withTextures("bonusblocks:block/door_copper_corroded_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockCopperDoor("door.copper.corroded.top", blockID("doorCopperCorrodedTop"), Material.stone, true) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorCopperCorroded)};
                        }
                        return null;
                    }
                });


        // Copper Fence
        fenceCopper = raw
                .setBlockModel(block -> new BlockModelFenceThin<>(block, TextureRegistry.getTexture("bonusblocks:block/fence_copper_center"), null, TextureRegistry.getTexture("bonusblocks:block/fence_copper_top"), TextureRegistry.getTexture("bonusblocks:block/fence_copper_column")).withTextures("bonusblocks:block/fence_copper_center"))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceCopper("fence.copper", blockID("fenceCopper"), Material.metal));
        fenceCopperTarnished = raw
                .setBlockModel(block -> new BlockModelFenceThin<>(block, TextureRegistry.getTexture("bonusblocks:block/fence_copper_tarnished_center"), null, TextureRegistry.getTexture("bonusblocks:block/fence_copper_tarnished_top"), TextureRegistry.getTexture("bonusblocks:block/fence_copper_tarnished_column")).withTextures("bonusblocks:block/fence_copper_tarnished_center"))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceCopperTarnished("fence.copper.tarnished", blockID("fenceCopperTarnished"), Material.metal));
        fenceCopperCorroded = raw
                .setBlockModel(block -> new BlockModelFenceThin<>(block, TextureRegistry.getTexture("bonusblocks:block/fence_copper_corroded_center"), null, TextureRegistry.getTexture("bonusblocks:block/fence_copper_corroded_top"), TextureRegistry.getTexture("bonusblocks:block/fence_copper_corroded_column")).withTextures("bonusblocks:block/fence_copper_corroded_center"))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceCopperCorroded("fence.copper.corroded", blockID("fenceCopperCorroded"), Material.metal));


        //Copper Pressure Plate
        pressureplateCopper = raw
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_copper").withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS)
                .build(new BlockCopperPressurePlate("pressureplate.copper", blockID("pressureplateCopper"), Material.metal));
        pressureplateCopperTarnished = raw
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_copper_tarnished").withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS)
                .build(new BlockCopperTarnishedPressurePlate("pressureplate.copper.tarnished", blockID("pressureplateCopperTarnished"), Material.metal));
        pressureplateCopperCorroded = raw
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_copper_corroded").withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS)
                .build(new BlockCopperCorrodedPressurePlate("pressureplate.copper.corroded", blockID("pressureplateCopperCorroded"), Material.metal));


        // Steel Trapdoor
        trapdoorSteel = raw
                .setBlockModel(block -> new BlockModelTrapDoor<>(block).withTextures("bonusblocks:block/trapdoor_steel_top", "bonusblocks:block/trapdoor_steel_side"))
                .setResistance(2000.0f)
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoor("trapdoor.steel", blockID("trapdoorSteel"), Material.metal, true));


        // Steel Doors
        doorSteelBottom = raw
                .setBlockModel(block -> new BlockModelDoor<>(block).withTextures("bonusblocks:block/door_steel_bottom"))
                .setResistance(2000.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockDoor("door.steel.bottom", blockID("doorSteelBottom"), Material.metal, false) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.metal && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorSteel)};
                        }
                        return null;
                    }
                });
        doorSteelTop = raw
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_steel_top"))
                .setResistance(2000.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockDoor("door.steel.top", blockID("doorSteelTop"), Material.metal, true) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.metal && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorSteel)};
                        }
                        return null;
                    }
                });


        // Silver
        blockSilver = silver
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_silver"))
                .build(new Block("block.silver", blockID("blockSilver"), Material.metal));

        brickSilver = silver
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/brick_silver"))
                .build(new Block("brick.silver", blockID("brickSilver"), Material.metal));

        // Silver Trapdoor
        trapdoorSilver = silver
                .setBlockModel(block -> new BlockModelTrapDoor<>(block).withTextures("bonusblocks:block/trapdoor_silver_top", "bonusblocks:block/trapdoor_silver_side"))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoor("trapdoor.silver", blockID("trapdoorSilver"), Material.stone, false));

        // Silver Doors
        doorSilverBottom = silver
                .setBlockModel(block -> new BlockModelDoor<>(block).withTextures("bonusblocks:block/door_silver_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockDoor("door.silver.bottom", blockID("doorSilverBottom"), Material.stone, false) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorSilver)};
                        }
                        return null;
                    }
                });
        doorSilverTop = silver
                .setBlockModel(block -> new BlockModelDoor<>(block).withTextures("bonusblocks:block/door_silver_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockDoor("door.silver.top", blockID("doorSilverTop"), Material.stone, true) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorSilver)};
                        }
                        return null;
                    }
                });

        // Silver Fence
        fenceSilver = silver
                .setBlockModel(block -> new BlockModelFenceThin<>(block, TextureRegistry.getTexture("bonusblocks:block/fence_silver_center"), null, null, TextureRegistry.getTexture("bonusblocks:block/fence_silver_column")).withTextures("bonusblocks:block/fence_silver_center"))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceSilver("fence.silver", blockID("fenceSilver"), Material.metal));

        // Silver Chandelier
        chandelierSilver = silver
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/chandelier_silver"))
                .setVisualUpdateOnMetadata()
                .setLuminance(15)
                .setUseInternalLight()
                .build(new BlockChandolier("chandelier.silver", blockID("chandelierSilver")));

        // Silver Candelabra
        candelabraSilver = silver
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/candelabra_silver"))
                .setVisualUpdateOnMetadata()
                .setLuminance(15)
                .setUseInternalLight()
                .build(new BlockVase("candelabra.silver", blockID("candelabraSilver")));

        // Silver Lantern
        lanternSilver = silver
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/lantern_silver"))
                .setVisualUpdateOnMetadata()
                .setLuminance(15)
                .setUseInternalLight()
                .build(new BlockLantern("lantern.silver", blockID("lanternSilver")));

        // Silver Vase
        vaseSilver = silver
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/vase_silver"))
                .setVisualUpdateOnMetadata()
                .build(new BlockVase("vase.silver", blockID("vaseSilver")));

        // Silver Vane
        vaneSilver = silver
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/vane_silver"))
                .setVisualUpdateOnMetadata()
                .build(new BlockVace("vane.silver", blockID("vaneSilver")));

        // Silver Chimes
        chimesSilver = silver
                .setBlockModel(block -> new CrossedSquaresBlockModel<>(block).withTextures("bonusblocks:block/chimes_silver"))
                .setVisualUpdateOnMetadata()
                .build(new BlockChimes("chimes.silver", blockID("chimesSilver")));

        // Silver Bed
        bedSilver = silver
                .setBlockModel(BlockModelSilverBed::new)
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockSilverBed("bed.silver", blockID("bedSilver")));

        // Silver Seat
        seatSilver = silver
                .setBlockModel(block -> new BlockModelSeat<>(block).withTextures("bonusblocks:block/seat_silver_top", "bonusblocks:block/block_silver", "bonusblocks:block/seat_silver_side"))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockSilverSeat("seat.silver", blockID("seatSilver"), Material.metal));


        // Scorched Stone
        scorchedstone = stone
                .setHardness(0.8f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/scorchedstone_top", "bonusblocks:block/scorchedstone_bottom", "bonusblocks:block/scorchedstone_side"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.GROWS_TREES, BlockTags.GROWS_SPINIFEX, BlockTags.GROWS_FLOWERS, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
                .build(new Block("scorchedstone", blockID("scorchedstone"), Material.stone));


        // Slate Pillar
        pillarSlate = stone
                .setBlockModel(block -> new AxisAlignedBlockModel<>(block).withTextures("bonusblocks:block/pillar_slate_top", "bonusblocks:block/pillar_slate_side"))
                .build(new BlockAxisAligned("pillar.slate", blockID("pillarSlate"), Material.stone));


        // Polished Stones
        marblePolished = stone
                .setHardness(1.0f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/polished_marble_top", "bonusblocks:block/polished_marble_side"))
                .build(new Block("marble.polished", blockID("marblePolished"), Material.stone));


        // Carved Stones
        slateCarved = stone
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("minecraft:block/polished_slate_top", "minecraft:block/carved_slate"))
                .build(new Block("slate.carved", blockID("slateCarved"), Material.stone));
        marbleCarved = stone
                .setHardness(1.0f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/polished_marble_top", "bonusblocks:block/carved_marble"))
                .build(new Block("marble.carved", blockID("marbleCarved"), Material.stone));


        // Baked Clay
        clayBaked = stone
                .setHardness(3.0f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/block_clay_baked"))
                .build(new Block("clay.baked", blockID("clayBaked"), Material.stone));


        // Obsidian Glass
        glassObsidian = obsidian
                .setBlockModel(block -> new BlockModelTransparent<>(block, false).withTextures("bonusblocks:block/glass_obsidian"))
                .build(new BlockGlassObsidian("glass.obsidian", blockID("glassObsidian")));
        trapdoorGlassObsidian = obsidian
                .setBlockModel(block -> new BlockModelTrapDoor<>(block).withTextures("bonusblocks:block/glass_obsidian", "bonusblocks:block/trapdoor_glass_obsidian_side"))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoorObsidian("trapdoor.glass.obsidian", blockID("trapdoorGlassObsidian")));

        // Quartz Glass
        glassQuartz = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(0.3F)
                .setResistance(0.3F)
                .setVisualUpdateOnMetadata()
                .setUseInternalLight()
                .setBlockModel(block -> new BlockModelTransparent<>(block, false).withTextures("bonusblocks:block/glass_quartz"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build(new BlockGlassQuartz("glass.quartz", blockID("glassQuartz"), Material.glass));


        brickScorchedstone = brick
                .setHardness(0.8f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/brick_scorchedstone"))
                .build(new Block("brick.scorchedstone", blockID("brickScorchedstone"), Material.stone));
        brickMud = brick
                .setHardness(1.5f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/brick_mud_baked"))
                .build(new Block("brick.mud", blockID("brickMud"), Material.stone));
        brickSteel = brick
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0F)
                .setResistance(4000.0f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/brick_steel"))
                .build(new Block("brick.steel", blockID("brickSteel"), Material.metal));
        brickQuartz = brick
                .setHardness(3.0f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/brick_quartz"))
                .build(new Block("brick.quartz", blockID("brickQuartz"), Material.stone));
        brickOlivine = brick
                .setHardness(3.0f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/brick_olivine"))
                .build(new Block("brick.olivine", blockID("brickOlivine"), Material.stone));


        // Soulslate
        soulslate = stone
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.6f))
                .setHardness(2.0f)
                .setResistance(20.0f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/soulslate"))
                .build(new Block("soulslate", blockID("soulslate"), Material.stone));


        // Brimstone
        brimstone = stone
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.4f))
                .setHardness(200.0f)
                .setResistance(20000.0f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/brimstone"))
                .setInfiniburn()
                .build(new BlockBrimstone("brimstone", blockID("brimstone"), Material.piston));


        // Pumice
        pumiceDry = stone
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/pumice"))
                .build(new BlockPumice("pumice.dry", blockID("pumiceDry"), false));
        pumiceWet = stone
                .setLuminance(13)
                .setUseInternalLight()
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/pumice_molten").withOverbrightTexture("bonusblocks:block/pumice_molten_overlay"))
                .build(new BlockPumice("pumice.wet", blockID("pumiceWet"), true));


        // Soul Candle
        candleSoulwax = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 1.2f))
                .setIcon("bonusblocks:item/candle_soulwax")
                .setHardness(0.0f)
                .setResistance(0.0f)
                .setLuminance(10)
                .setBlockModel(block -> new BlockModelSoulwaxCandle<>(block).withTextures("bonusblocks:block/candle_soulwax"))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_SWORD, BlockTags.BROKEN_BY_FLUIDS)
                .build(new BlockSoulCandle("candle.soulwax", blockID("candleSoulwax")));


        //Slabs
        slabWool = slab
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.8F)
                .setResistance(0.8F)
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.NOT_IN_CREATIVE_MENU)
                .setItemBlock(ItemBlockSlabPainted::new)
                .setBlockModel(BlockModelSlabWool::new)
                .build(new BlockWoolSlab(wool, blockID("slabWool")));
        slabCobbleStoneMossy = slab
                .setHardness(2.0F)
                .build(new BlockSlab(cobbleStoneMossy, blockID("slabCobbleStoneMossy")));
        slabSlatePolished = slab
                .build(new BlockSlab(slateCarved, blockID("slabSlatePolished")));
        slabMarblePolished = slab
                .build(new BlockSlab(marbleCarved, blockID("slabMarblePolished")));

        slabBrickStonePolishedMossy = slab
                .setHardness(2.0F)
                .build(new BlockSlab(brickStonePolishedMossy, blockID("slabBrickStonePolishedMossy")));

        slabBrickGold = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(3.0F)
                .build(new BlockSlab(brickGold, blockID("slabBrickGold")));
        slabBrickLapis = slab
                .setHardness(3.0F)
                .build(new BlockSlab(brickLapis, blockID("slabBrickLapis")));

        slabBrickIron = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0F)
                .build(new BlockSlab(brickIron, blockID("slabBrickIron")));
        slabBrickScorchedstone = slab
                .setHardness(0.8f)
                .build(new BlockSlab(brickScorchedstone, blockID("slabBrickScorchedstone")));
        slabBrickMud = slab
                .build(new BlockSlab(brickMud, blockID("slabBrickMud")));

        slabScorchedstone = slab
                .setHardness(0.8F)
                .build(new BlockSlab(scorchedstone, blockID("slabScorchedstone")));
        slabBrickSteel = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(4000.0f)
                .build(new BlockSlab(brickSteel, blockID("slabBrickSteel")));
        slabBrickQuartz = slab
                .setHardness(3.0f)
                .build(new BlockSlab(brickQuartz, blockID("slabBrickQuartz")));
        slabBrickOlivine = slab
                .setHardness(3.0f)
                .build(new BlockSlab(brickOlivine, blockID("slabBrickOlivine")));
        slabBrickSilver = slab
                .setHardness(0.8f)
                .setResistance(2.0f)
                .build(new BlockSlab(brickSilver, blockID("slabBrickSilver")));
        slabCopper = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setTicking(true)
                .build(new BlockSlab(blockCopper, blockID("slabCopper")) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.slabCopperTarnished.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });
        slabCopperTarnished = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setTicking(true)
                .build(new BlockSlab(blockCopperTarnished, blockID("slabCopperTarnished")) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.slabCopperCorroded.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });
        slabCopperCorroded = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .build(new BlockSlab(blockCopperCorroded, blockID("slabCopperCorroded")));


        // Stairs
        stairsWool = stairs
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.8F)
                .setResistance(0.8F)
                .setBlockModel(BlockModelStairsWool::new)
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.NOT_IN_CREATIVE_MENU)
                .setItemBlock(ItemBlockStairsPainted::new)
                .build(new BlockStairs(wool, blockID("stairsWool")));
        stairsCobbleStoneMossy = stairs
                .setHardness(2.0F)
                .build(new BlockStairs(cobbleStoneMossy, blockID("stairsCobbleStoneMossy")));
        stairsBrickStonePolishedMossy = stairs
                .setHardness(2.0F)
                .build(new BlockStairs(brickStonePolishedMossy, blockID("stairsBrickStonePolishedMossy")));
        stairsBrickGold = stairs
                .setHardness(3.0F)
                .build(new BlockStairs(brickGold, blockID("stairsBrickGold")));
        stairsBrickLapis = stairs
                .setHardness(3.0F)
                .build(new BlockStairs(brickLapis, blockID("stairsBrickLapis")));
        stairsBrickIron = stairs
                .setHardness(5.0F)
                .build(new BlockStairs(brickIron, blockID("stairsBrickIron")));
        stairsBrickScorchedstone = stairs
                .setHardness(0.8f)
                .build(new BlockStairs(brickScorchedstone, blockID("stairsBrickScorchedstone")));
        stairsBrickMud = stairs
                .setHardness(1.5f)
                .build(new BlockStairs(brickMud, blockID("stairsBrickMud")));
        stairsBrickSteel = stairs
                .setHardness(5.0f)
                .setResistance(4000.0f)
                .build(new BlockStairs(brickSteel, blockID("stairsBrickSteel")));
        stairsBrickQuartz = stairs
                .setHardness(3.0f)
                .build(new BlockStairs(brickQuartz, blockID("stairsBrickQuartz")));
        stairsBrickOlivine = stairs
                .setHardness(3.0f)
                .build(new BlockStairs(brickOlivine, blockID("stairsBrickOlivine")));
        stairsBrickSilver = stairs
                .setHardness(0.8f)
                .setResistance(2.0f)
                .build(new BlockStairs(brickSilver, blockID("stairsBrickSilver")));
        stairsCopper = stairs
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setTicking(true)
                .build(new BlockStairs(blockCopper, blockID("stairsCopper")) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.stairsCopperTarnished.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });
        stairsCopperTarnished = stairs
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setTicking(true)
                .build(new BlockStairs(blockCopperTarnished, blockID("stairsCopperTarnished")) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.stairsCopperCorroded.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });
        stairsCopperCorroded = stairs
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .build(new BlockStairs(blockCopperCorroded, blockID("stairsCopperCorroded")));



        //2.2 New Stuff

        // Baked Clay Bricks
        brickClayBaked = stone
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/brick_block_clay_baked"))
                .build(new Block("brick.clay.baked", blockID("brickClayBaked"), Material.stone));

        slabBrickClayBaked = slab
                .build(new BlockSlab(brickClayBaked, blockID("slabBrickClayBaked")));

        stairsBrickClayBaked = stairs
                .build(new BlockStairs(brickClayBaked, blockID("stairsBrickClayBaked")));

        // Rough Dirt
        dirtRough = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.gravel", "step.gravel", 1.0f, 0.8f))
                .setHardness(0.6f)
                .setResistance(0.6f)
                .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.CAVES_CUT_THROUGH)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/dirt_rough"))
                .build(new Block("dirt.rough", blockID("dirtRough"), Material.dirt));

        // Skull
        skullCarved = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setBlockModel(block -> new BlockModelHorizontalRotation<>(block).withTextures("bonusblocks:block/skull_top", "bonusblocks:block/skull_bottom", "bonusblocks:block/skull_carved_idle", "bonusblocks:block/skull_side", "bonusblocks:block/skull_side", "bonusblocks:block/skull_side"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build(new BlockRotatableHorizontal("skull.carved", blockID("skullCarved"), Material.stone) {
                });

        skullActive = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setLuminance(15)
                .setBlockModel(block -> new BlockModelHorizontalRotation<>(block).withTextures("bonusblocks:block/skull_top", "bonusblocks:block/skull_bottom", "bonusblocks:block/skull_carved_active", "bonusblocks:block/skull_side", "bonusblocks:block/skull_side", "bonusblocks:block/skull_side"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build(new BlockRotatableHorizontal("skull.active", blockID("skullActive"), Material.stone) {
                });

        skull = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setBlockModel(block -> new BlockModelHorizontalRotation<>(block).withTextures("bonusblocks:block/skull_top", "bonusblocks:block/skull_bottom", "bonusblocks:block/skull_side"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build(new BlockRotatableHorizontal("skull", blockID("skull"), Material.stone) {
                });


        // 2.3 New Stuff

        // Lazurite

        lazurite = stone
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/lazurite"))
                .build(new Block("lazurite", blockID("lazurite"), Material.stone) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        switch (dropCause) {
                            case WORLD:
                            case EXPLOSION:
                            case PROPER_TOOL:
                                return new ItemStack[]{new ItemStack(cobbleLazurite)};
                            case PICK_BLOCK:
                            case SILK_TOUCH:
                                return new ItemStack[]{new ItemStack(this)};
                            default:
                                return null;
                        }
                    }
                });

        cobbleLazurite = stone
                .setHardness(2.0f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/cobbled_lazurite"))
                .build(new Block("cobble.lazurite", blockID("cobbleLazurite"), Material.stone));
        slabCobbleLazurite = slab
                .setHardness(2.0F)
                .build(new BlockSlab(BonusBlocks.cobbleLazurite, blockID("slabCobbleLazurite")));
        stairsCobbleLazurite = stairs
                .setHardness(2.0F)
                .build(new BlockStairs(BonusBlocks.cobbleLazurite, blockID("stairsCobbleLazurite")));

        brickLazurite = brick
                .setHardness(1.5f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/brick_lazurite"))
                .build(new Block("brick.lazurite", blockID("brickLazurite"), Material.stone));
        slabBrickLazurite = slab
                .setHardness(1.5f)
                .build(new BlockSlab(BonusBlocks.brickLazurite, blockID("slabBrickLazurite")));
        stairsBrickLazurite = stairs
                .setHardness(1.5f)
                .build(new BlockStairs(BonusBlocks.brickLazurite, blockID("stairsBrickLazurite")));

        lazuritePolished = stone
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/polished_lazurite_top", "bonusblocks:block/polished_lazurite_side"))
                .build(new Block("lazurite.polished", blockID("lazuritePolished"), Material.stone));
        lazuriteCarved = stone
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/polished_lazurite_top", "bonusblocks:block/carved_lazurite"))
                .build(new Block("lazurite.carved", blockID("lazuriteCarved"), Material.stone));
        slabLazuritePolished = slab
                .build(new BlockSlab(lazuriteCarved, blockID("slabLazuritePolished")));


        // Peridot

        peridot = stone
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/peridot"))
                .build(new Block("peridot", blockID("peridot"), Material.stone) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        switch (dropCause) {
                            case WORLD:
                            case EXPLOSION:
                            case PROPER_TOOL:
                                return new ItemStack[]{new ItemStack(cobblePeridot)};
                            case PICK_BLOCK:
                            case SILK_TOUCH:
                                return new ItemStack[]{new ItemStack(this)};
                            default:
                                return null;
                        }
                    }
                });

        cobblePeridot = stone
                .setHardness(2.0f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/cobbled_peridot"))
                .build(new Block("cobble.peridot", blockID("cobblePeridot"), Material.stone));
        slabCobblePeridot = slab
                .setHardness(2.0F)
                .build(new BlockSlab(BonusBlocks.cobblePeridot, blockID("slabCobblePeridot")));
        stairsCobblePeridot = stairs
                .setHardness(2.0F)
                .build(new BlockStairs(BonusBlocks.cobblePeridot, blockID("stairsCobblePeridot")));

        brickPeridot = brick
                .setHardness(1.5f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/brick_peridot"))
                .build(new Block("brick.peridot", blockID("brickPeridot"), Material.stone));
        slabBrickPeridot = slab
                .setHardness(1.5f)
                .build(new BlockSlab(BonusBlocks.brickPeridot, blockID("slabBrickPeridot")));
        stairsBrickPeridot = stairs
                .setHardness(1.5f)
                .build(new BlockStairs(BonusBlocks.brickPeridot, blockID("stairsBrickPeridot")));

        peridotPolished = stone
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/polished_peridot_top", "bonusblocks:block/polished_peridot_side"))
                .build(new Block("peridot.polished", blockID("peridotPolished"), Material.stone));
        peridotCarved = stone
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/polished_peridot_top", "bonusblocks:block/carved_peridot"))
                .build(new Block("peridot.carved", blockID("peridotCarved"), Material.stone));
        slabPeridotPolished = slab
                .build(new BlockSlab(peridotCarved, blockID("slabPeridotPolished")));

        // Pot

        pot = new BlockBuilder(MOD_ID)
                .setHardness(0.5f)
                .setResistance(1.0f)
                .setIcon("bonusblocks:item/pot")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .setBlockModel(block -> new DFBlockModelBuilder(MOD_ID).setBlockModel("block/pot.json").setRender3D(false).build(pot))
                .build(new BlockPot("pot", blockID("pot"), Material.stone));


        //2.4 New Stuff

        girderIron = raw
                .setVisualUpdateOnMetadata()
                .setIcon("bonusblocks:block/girder_iron")
                .setBlockModel(block -> new DFBlockModelBuilder(MOD_ID).setBlockModel("block/girder.json").setBlockState(MOD_ID, "girder_states.json").setMetaStateInterpreter(new PipeMetaStateInterpreter()).setRender3D(false).build(girderIron))
                .build(new BlockGirder("girder.iron", blockID("girderIron"), Material.metal));

        fenceGold = raw
                .setBlockModel(block -> new BlockModelFenceThin<>(block, TextureRegistry.getTexture("bonusblocks:block/fence_gold_center"), null, TextureRegistry.getTexture("bonusblocks:block/fence_gold_top"), TextureRegistry.getTexture("bonusblocks:block/fence_gold_column")).withTextures("bonusblocks:block/fence_gold_center"))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceGold("fence.gold", blockID("fenceGold"), Material.metal));





        //3.0 New Stuff


        stairsScorchedstone = stairs
                .setHardness(0.8F)
                .build(new BlockStairs(scorchedstone, blockID("stairsScorchedstone")));


        doorGlassObsidianBottom = obsidian
                .setBlockModel(block -> new BlockModelDoorGlass<>(block).withTextures("bonusblocks:block/door_glass_obsidian_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockDoorGlassObsidian("door.glass.obsidian.bottom", blockID("doorGlassObsidianBottom"), Material.glass, false));
        doorGlassObsidianTop = obsidian
                .setBlockModel(block -> new BlockModelDoorGlass<>(block).withTextures("bonusblocks:block/door_glass_obsidian_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockDoorGlassObsidian("door.glass.obsidian.top", blockID("doorGlassObsidianTop"), Material.glass, true));


        tatami = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 0.8f, 1.2f))
                .setHardness(0.6f)
                .setResistance(0.6f)
                .setBlockModel(block -> new BlockModelStandard<>(block).withTextures("bonusblocks:block/tatami"))
                .setFlammability(20, 40)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
                .build(new Block("tatami", blockID("tatami"), Material.grass));



        //3.1 NEW STUFF
        fenceSteel = raw
                .setBlockModel(block -> new BlockModelFenceThin<>(block, TextureRegistry.getTexture("bonusblocks:block/fence_steel_center"), null, TextureRegistry.getTexture("bonusblocks:block/fence_steel_top"), TextureRegistry.getTexture("bonusblocks:block/fence_steel_column")).withTextures("bonusblocks:block/fence_steel_center"))
                .setVisualUpdateOnMetadata()
                .setHardness(5.0f)
                .setResistance(4000.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceSteel("fence.steel", blockID("fenceSteel"), Material.metal));





        //3.2 NEW STUFF

        doorStoneBottom = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_stone_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.stone.bottom", blockID("doorStoneBottom"), Material.stone, false) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorStone)};
                        }
                        return null;
                    }
                });
        doorStoneTop = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_stone_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.stone.top", blockID("doorStoneTop"), Material.stone, true) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorStone)};
                        }
                        return null;
                    }
                });

        doorBasaltBottom = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_basalt_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.basalt.bottom", blockID("doorBasaltBottom"), Material.stone, false) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorBasalt)};
                        }
                        return null;
                    }
                });
        doorBasaltTop = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_basalt_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.basalt.top", blockID("doorBasaltTop"), Material.stone, true) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorBasalt)};
                        }
                        return null;
                    }
                });

        doorLimestoneBottom = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_limestone_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.limestone.bottom", blockID("doorLimestoneBottom"), Material.stone, false) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorLimestone)};
                        }
                        return null;
                    }
                });
        doorLimestoneTop = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_limestone_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.limestone.top", blockID("doorLimestoneTop"), Material.stone, true) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorLimestone)};
                        }
                        return null;
                    }
                });

        doorGraniteBottom = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_granite_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.granite.bottom", blockID("doorGraniteBottom"), Material.stone, false) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorGranite)};
                        }
                        return null;
                    }
                });
        doorGraniteTop = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_granite_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.granite.top", blockID("doorGraniteTop"), Material.stone, true) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorGranite)};
                        }
                        return null;
                    }
                });

        doorMarbleBottom = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_marble_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .setHardness(1.0f)
                .build(new BlockStoneDoor("door.marble.bottom", blockID("doorMarbleBottom"), Material.stone, false) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorMarble)};
                        }
                        return null;
                    }
                });
        doorMarbleTop = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_marble_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .setHardness(1.0f)
                .build(new BlockStoneDoor("door.marble.top", blockID("doorMarbleTop"), Material.stone, true) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorMarble)};
                        }
                        return null;
                    }
                });

        doorSlateBottom = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_slate_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.slate.bottom", blockID("doorSlateBottom"), Material.stone, false) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorSlate)};
                        }
                        return null;
                    }
                });
        doorSlateTop = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_slate_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.slate.top", blockID("doorSlateTop"), Material.stone, true) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorSlate)};
                        }
                        return null;
                    }
                });

        doorPermafrostBottom = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_permafrost_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.permafrost.bottom", blockID("doorPermafrostBottom"), Material.stone, false) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorPermafrost)};
                        }
                        return null;
                    }
                });
        doorPermafrostTop = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_permafrost_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.permafrost.top", blockID("doorPermafrostTop"), Material.stone, true) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorPermafrost)};
                        }
                        return null;
                    }
                });

        doorNetherrackBottom = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_netherrack_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.netherrack.bottom", blockID("doorNetherrackBottom"), Material.stone, false) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorNetherrack)};
                        }
                        return null;
                    }
                });
        doorNetherrackTop = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_netherrack_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.netherrack.top", blockID("doorNetherrackTop"), Material.stone, true) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorNetherrack)};
                        }
                        return null;
                    }
                });

        doorLazuriteBottom = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_lazurite_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.lazurite.bottom", blockID("doorLazuriteBottom"), Material.stone, false) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorLazurite)};
                        }
                        return null;
                    }
                });
        doorLazuriteTop = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_lazurite_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.lazurite.top", blockID("doorLazuriteTop"), Material.stone, true) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorLazurite)};
                        }
                        return null;
                    }
                });

        doorPeridotBottom = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_peridot_bottom"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.peridot.bottom", blockID("doorPeridotBottom"), Material.stone, false) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorPeridot)};
                        }
                        return null;
                    }
                });
        doorPeridotTop = stone
                .setBlockModel(block -> new DoorBlockModel<>(block).withTextures("bonusblocks:block/door_peridot_top"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockStoneDoor("door.peridot.top", blockID("doorPeridotTop"), Material.stone, true) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                            return new ItemStack[]{new ItemStack(BonusItems.doorPeridot)};
                        }
                        return null;
                    }
                });

        trapdoorStone = stone
                .setBlockModel(block -> new TrapDoorBlockModel<>(block).withTextures("bonusblocks:block/trapdoor_stone_top", "bonusblocks:block/trapdoor_stone_side"))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoorStone("trapdoor.stone", blockID("trapdoorStone"), Material.stone, false));

        trapdoorBasalt = stone
                .setBlockModel(block -> new TrapDoorBlockModel<>(block).withTextures("bonusblocks:block/trapdoor_basalt_top", "bonusblocks:block/trapdoor_basalt_side"))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoorStone("trapdoor.basalt", blockID("trapdoorBasalt"), Material.stone, false));

        trapdoorLimestone = stone
                .setBlockModel(block -> new TrapDoorBlockModel<>(block).withTextures("bonusblocks:block/trapdoor_limestone_top", "bonusblocks:block/trapdoor_limestone_side"))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoorStone("trapdoor.limestone", blockID("trapdoorLimestone"), Material.stone, false));

        trapdoorGranite = stone
                .setBlockModel(block -> new BlockModelTrapDoor<>(block).withTextures("bonusblocks:block/trapdoor_granite_top", "bonusblocks:block/trapdoor_granite_side"))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoorStone("trapdoor.granite", blockID("trapdoorGranite"), Material.stone, false));

        trapdoorPermafrost = stone
                .setBlockModel(block -> new BlockModelTrapDoor<>(block).withTextures("bonusblocks:block/trapdoor_permafrost_top", "bonusblocks:block/trapdoor_permafrost_side"))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoorStone("trapdoor.permafrost", blockID("trapdoorPermafrost"), Material.stone, false));

        trapdoorMarble = stone
                .setBlockModel(block -> new BlockModelTrapDoor<>(block).withTextures("bonusblocks:block/trapdoor_marble_top", "bonusblocks:block/trapdoor_marble_side"))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoorStone("trapdoor.marble", blockID("trapdoorMarble"), Material.stone, false));

        trapdoorSlate = stone
                .setBlockModel(block -> new BlockModelTrapDoor<>(block).withTextures("bonusblocks:block/trapdoor_slate_top", "bonusblocks:block/trapdoor_slate_side"))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoorStone("trapdoor.slate", blockID("trapdoorSlate"), Material.stone, false));

        trapdoorNetherrack = stone
                .setBlockModel(block -> new BlockModelTrapDoor<>(block).withTextures("bonusblocks:block/trapdoor_netherrack_top", "bonusblocks:block/trapdoor_netherrack_side"))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoorStone("trapdoor.netherrack", blockID("trapdoorNetherrack"), Material.stone, false));

        trapdoorLazurite = stone
                .setBlockModel(block -> new BlockModelTrapDoor<>(block).withTextures("bonusblocks:block/trapdoor_lazurite_top", "bonusblocks:block/trapdoor_lazurite_side"))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoorStone("trapdoor.lazurite", blockID("trapdoorLazurite"), Material.stone, false));

        trapdoorPeridot = stone
                .setBlockModel(block -> new BlockModelTrapDoor<>(block).withTextures("bonusblocks:block/trapdoor_peridot_top", "bonusblocks:block/trapdoor_peridot_side"))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoorStone("trapdoor.peridot", blockID("trapdoorPeridot"), Material.stone, false));


        bedroll = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setBlockModel(BlockModelBedroll::new)
                .setHardness(0.2f)
                .setResistance(0.2f)
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_AXE)
                .build(new BlockBedroll("bedroll", blockID("bedroll")));

    }
}
