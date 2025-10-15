package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.material.MaterialColor;

import static net.minecraft.core.block.BlockLogicMoss.stoneToMossMap;
import static net.minecraft.core.block.Blocks.*;
import static net.minecraft.core.block.material.MaterialColor.paintedWhite;
import static net.minecraft.core.block.material.MaterialColor.registerManualBlockColor;
import static net.minecraft.core.item.tool.ItemToolPickaxe.miningLevels;

public class BonusBlockDetails {

    public void initializeBlockDetails() {

        miningLevels.put(BonusBlocks.ORE_VERDIGRIS_NETHERRACK, 1);
        miningLevels.put(BonusBlocks.BLOCK_VERDIGRIS, 1);
        miningLevels.put(BonusBlocks.BLOCK_VERDIGRIS_SHINE, 1);
        miningLevels.put(BonusBlocks.BRICK_VERDIGRIS, 1);
        miningLevels.put(BonusBlocks.BRICK_VERDIGRIS_SHINE, 1);
        miningLevels.put(BonusBlocks.STAIRS_BRICK_VERDIGRIS, 1);
        miningLevels.put(BonusBlocks.STAIRS_BRICK_VERDIGRIS_SHINE, 1);
        miningLevels.put(BonusBlocks.SLAB_BRICK_VERDIGRIS, 1);
        miningLevels.put(BonusBlocks.SLAB_BRICK_VERDIGRIS_SHINE, 1);

        miningLevels.put(BonusBlocks.FENCE_GOLD, 2);
        miningLevels.put(BonusBlocks.TRAPDOOR_GOLD, 2);
        miningLevels.put(BonusBlocks.DOOR_GOLD_BOTTOM, 2);
        miningLevels.put(BonusBlocks.DOOR_GOLD_TOP, 2);
        miningLevels.put(BonusBlocks.BED_GOLD, 2);
        miningLevels.put(BonusBlocks.SEAT_GOLD, 2);
        miningLevels.put(BonusBlocks.BLOCK_STEEL, 2);
        miningLevels.put(BonusBlocks.BRICK_STEEL, 2);
        miningLevels.put(BonusBlocks.TRAPDOOR_STEEL, 2);
        miningLevels.put(BonusBlocks.DOOR_STEEL_BOTTOM, 2);
        miningLevels.put(BonusBlocks.DOOR_STEEL_TOP, 2);
        miningLevels.put(BonusBlocks.STAIRS_BRICK_STEEL, 2);
        miningLevels.put(BonusBlocks.SLAB_BRICK_STEEL, 2);


        stoneToMossMap.put(SAPLING_OAK, BonusBlocks.SAPLING_OAK_MOSSY);
        stoneToMossMap.put(MOSS_STONE, BonusBlocks.MOSS);
        stoneToMossMap.put(MOSS_BASALT, BonusBlocks.MOSS);
        stoneToMossMap.put(MOSS_LIMESTONE, BonusBlocks.MOSS);
        stoneToMossMap.put(MOSS_GRANITE, BonusBlocks.MOSS);

        registerManualBlockColor(BonusBlocks.BLOCK_SUGAR, 0, paintedWhite);
        registerManualBlockColor(BonusBlocks.BLOCK_GUNPOWDER, 0, MaterialColor.paintedGrey);

        registerManualBlockColor(BonusBlocks.BRANCH, 0, MaterialColor.wood);

        registerManualBlockColor(BonusBlocks.LEAVES_OAK_MOSSY, 0, MaterialColor.plant);
        registerManualBlockColor(BonusBlocks.LEAVES_JACARANDA, 0, MaterialColor.paintedPurple);

        registerManualBlockColor(BonusBlocks.LOG_CACAO, 0, MaterialColor.paintedGreen);
        registerManualBlockColor(BonusBlocks.LOG_SCORCHED, 0, MaterialColor.paintedBlack);
        registerManualBlockColor(BonusBlocks.LOG_JACARANDA, 0, MaterialColor.paintedPurple);
        registerManualBlockColor(BonusBlocks.LOG_SHRUB, 0, MaterialColor.paintedGrey);

        registerManualBlockColor(BonusBlocks.FUNGI_RED, 0, MaterialColor.paintedRed);
        registerManualBlockColor(BonusBlocks.FUNGI_BROWN, 0, MaterialColor.paintedBrown);
        registerManualBlockColor(BonusBlocks.FUNGI_GRAY, 0, MaterialColor.paintedBlack);

        registerManualBlockColor(BonusBlocks.BLOCK_BONE, 0, paintedWhite);
        registerManualBlockColor(BonusBlocks.BLOCK_CLOTH, 0, MaterialColor.paintedCyan);
        registerManualBlockColor(BonusBlocks.BLOCK_SLIME, 0, MaterialColor.paintedLime);
        registerManualBlockColor(BonusBlocks.BLOCK_LEATHER, 0, MaterialColor.brick);
        registerManualBlockColor(BonusBlocks.BLOCK_WICKER, 0, MaterialColor.paintedYellow);
        registerManualBlockColor(BonusBlocks.BLOCK_FLINT, 0, MaterialColor.paintedGrey);
        registerManualBlockColor(BonusBlocks.BLOCK_STEEL, 0, MaterialColor.steel);

        registerManualBlockColor(BonusBlocks.BRICK_MUD, 0, MaterialColor.dirt);
        registerManualBlockColor(BonusBlocks.BRICK_QUARTZ, 0, MaterialColor.quartz);
        registerManualBlockColor(BonusBlocks.BRICK_OLIVINE, 0, MaterialColor.olivine);
        registerManualBlockColor(BonusBlocks.BRICK_CLAY_BAKED, 0, MaterialColor.brick);
        registerManualBlockColor(BonusBlocks.BRICK_STEEL, 0, MaterialColor.steel);

        registerManualBlockColor(BonusBlocks.BLOCK_CLAY_BAKED, 0, MaterialColor.brick);

        registerManualBlockColor(BonusBlocks.MOSS, 0, MaterialColor.paintedGreen);
        registerManualBlockColor(BonusBlocks.GRASS_OVERGROWN, 0, MaterialColor.grass);
        registerManualBlockColor(BonusBlocks.GRASS_SCORCHED_OVERGROWN, 0, MaterialColor.grassScorched);
        registerManualBlockColor(BonusBlocks.PATH_DIRT_OVERGROWN, 0, MaterialColor.grassScorched);

        registerManualBlockColor(BonusBlocks.SKULL, 0, paintedWhite);
        registerManualBlockColor(BonusBlocks.SKULL_CARVED_IDLE, 0, paintedWhite);
        registerManualBlockColor(BonusBlocks.SKULL_CARVED_ACTIVE, 0, paintedWhite);
        registerManualBlockColor(BonusBlocks.SKULL_REDSTONE, 0, paintedWhite);

        registerManualBlockColor(BonusBlocks.TATAMI, 0, MaterialColor.paintedLime);

        registerManualBlockColor(BonusBlocks.STAIRS_BRICK_MUD, 0, MaterialColor.mud);
        registerManualBlockColor(BonusBlocks.STAIRS_BRICK_OLIVINE, 0, MaterialColor.olivine);
        registerManualBlockColor(BonusBlocks.STAIRS_BRICK_QUARTZ, 0, MaterialColor.quartz);
        registerManualBlockColor(BonusBlocks.STAIRS_BRICK_CLAY_BAKED, 0, MaterialColor.brick);

        registerManualBlockColor(BonusBlocks.SLAB_BRICK_MUD, 0, MaterialColor.mud);
        registerManualBlockColor(BonusBlocks.SLAB_BRICK_OLIVINE, 0, MaterialColor.olivine);
        registerManualBlockColor(BonusBlocks.SLAB_BRICK_QUARTZ, 0, MaterialColor.quartz);
        registerManualBlockColor(BonusBlocks.SLAB_BRICK_CLAY_BAKED, 0, MaterialColor.brick);

        registerManualBlockColor(BonusBlocks.BLOCK_VERDIGRIS, 0, MaterialColor.paintedCyan);
        registerManualBlockColor(BonusBlocks.BLOCK_VERDIGRIS_SHINE, 0, MaterialColor.diamond);
        registerManualBlockColor(BonusBlocks.BRICK_VERDIGRIS, 0, MaterialColor.paintedCyan);
        registerManualBlockColor(BonusBlocks.BRICK_VERDIGRIS_SHINE, 0, MaterialColor.diamond);
        registerManualBlockColor(BonusBlocks.STAIRS_BRICK_VERDIGRIS, 0, MaterialColor.paintedCyan);
        registerManualBlockColor(BonusBlocks.STAIRS_BRICK_VERDIGRIS_SHINE, 0, MaterialColor.diamond);
        registerManualBlockColor(BonusBlocks.SLAB_BRICK_VERDIGRIS, 0, MaterialColor.paintedCyan);
        registerManualBlockColor(BonusBlocks.SLAB_BRICK_VERDIGRIS_SHINE, 0, MaterialColor.diamond);


        for (int i = 0; i < 16; ++i) {
            MaterialColor color = DYE_COLORS[i];
            for (int j = 0; j < 16; ++j) {
                MaterialColor.registerManualBlockColor(BonusBlocks.SLAB_WOOL, i << 4 | j, color);
                MaterialColor.registerManualBlockColor(BonusBlocks.STAIRS_WOOL, i << 4 | j, color);
            }
        }

    }

    public static final MaterialColor[] DYE_COLORS = {
            MaterialColor.paintedWhite,
            MaterialColor.paintedOrange,
            MaterialColor.paintedMagenta,
            MaterialColor.paintedLightblue,
            MaterialColor.paintedYellow,
            MaterialColor.paintedLime,
            MaterialColor.paintedPink,
            MaterialColor.paintedGrey,
            MaterialColor.paintedSilver,
            MaterialColor.paintedCyan,
            MaterialColor.paintedPurple,
            MaterialColor.paintedBlue,
            MaterialColor.paintedBrown,
            MaterialColor.paintedGreen,
            MaterialColor.paintedRed,
            MaterialColor.paintedBlack
    };

}