package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocksConfig;
import luke.bonusblocks.block.copper.*;
import luke.bonusblocks.block.silver.BlockFenceSilver;
import luke.bonusblocks.block.silver.BlockOreSilver;
import luke.bonusblocks.block.silver.BlockSilverBed;
import luke.bonusblocks.block.silver.BlockSilverSeat;
import luke.bonusblocks.item.BonusItems;
import net.minecraft.client.render.block.color.BlockColorCustom;
import net.minecraft.client.render.block.color.BlockColorLeavesOak;
import net.minecraft.client.render.block.color.BlockColorTallGrass;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.colorizer.Colorizer;
import net.minecraft.client.render.colorizer.Colorizers;
import net.minecraft.client.render.entity.FallingSandRenderer;
import net.minecraft.client.render.stitcher.TextureRegistry;
import net.minecraft.core.block.*;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.*;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.world.World;
import org.useless.dragonfly.helper.ModelHelper;
import org.useless.dragonfly.model.block.DFBlockModelBuilder;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.CreativeHelper;

import java.util.Random;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;
import static net.minecraft.core.block.Block.*;
import static net.minecraft.core.block.BlockMoss.stoneToMossMap;
import static net.minecraft.core.item.Item.itemsList;
import static net.minecraft.core.item.tool.ItemToolPickaxe.miningLevels;

public class BonusBlocks {

    private int blockID(String blockName) {
        return BonusBlocksConfig.cfg.getInt("Block IDs." + blockName);
    }

    public static Block box;

    public static Block crate;
    public static Block cratePainted;

    public static Block bookshelfEmptyPlanksOak;

    public static Block branch;
    public static Block leavesOakMossy;
    public static Block leavesMaple;
    public static Block leavesJacaranda;

    public static Block saplingOakMossy;
    public static Block saplingMaple;
    public static Block saplingJacaranda;

    public static Block logShrub;
    public static Block logCacao;
    public static Block logMaple;
    public static Block logJacaranda;
    public static Block logScorched;

    public static Block moss;

    public static Block overgrownGrass;
    public static Block overgrownGrassRetro;
    public static Block overgrownGrassScorched;
    public static Block overgrownPath;

    public static Block flowerSilver;
    public static Block flowerLightBlue;
    public static Block flowerMagenta;
    public static Block flowerLime;

    public static Block petalYellow;
    public static Block petalRed;
    public static Block petalCyan;
    public static Block petalPurple;
    public static Block petalPink;
    public static Block petalLightGray;
    public static Block petalOrange;
    public static Block petalLightBlue;
    public static Block petalMagenta;
    public static Block petalLime;

    public static Block petalLayerYellow;
    public static Block petalLayerRed;
    public static Block petalLayerCyan;
    public static Block petalLayerPurple;
    public static Block petalLayerPink;
    public static Block petalLayerLightGray;
    public static Block petalLayerOrange;
    public static Block petalLayerLightBlue;
    public static Block petalLayerMagenta;
    public static Block petalLayerLime;

    public static Block mushroomGray;

    public static Block fungiRed;
    public static Block fungiBrown;
    public static Block fungiGray;

    public static Block blockBone;

    public static Block thatch;
    public static Block blockCloth;
    public static Block blockSlime;
    public static Block blockSulphur;
    public static Block blockSugar;
    public static Block blockLeather;
    public static Block blockWicker;
    public static Block blockFlint;
    public static Block blockCrudeSteel;
    public static Block blockCopper;
    public static Block blockCopperTarnished;
    public static Block blockCopperCorroded;
    public static Block blockSilver;

    public static Block blockRawGold;
    public static Block blockRawIron;
    public static Block blockRawCopper;
    public static Block blockRawCopperTarnished;
    public static Block blockRawCopperCorroded;
    public static Block blockRawSilver;

    public static Block overlayRawGold;
    public static Block overlayRawIron;
    public static Block overlayRawCopper;
    public static Block overlayRawSilver;

    public static Block oreCopperStone;
    public static Block oreCopperBasalt;
    public static Block oreCopperLimestone;
    public static Block oreCopperGranite;

    public static Block oreSilverStone;
    public static Block oreSilverBasalt;
    public static Block oreSilverLimestone;
    public static Block oreSilverGranite;

    public static Block meshCopper;
    public static Block meshCopperTarnished;
    public static Block meshCopperCorroded;

    public static Block pipeCopper;
    public static Block pipeCopperTarnished;
    public static Block pipeCopperCorroded;

    public static Block trapdoorCopper;
    public static Block trapdoorCopperTarnished;
    public static Block trapdoorCopperCorroded;
    public static Block trapdoorSteel;
    public static Block trapdoorSilver;

    public static Block doorCopperTop;
    public static Block doorCopperBottom;
    public static Block doorCopperTarnishedTop;
    public static Block doorCopperTarnishedBottom;
    public static Block doorCopperCorrodedTop;
    public static Block doorCopperCorrodedBottom;
    public static Block doorSteelTop;
    public static Block doorSteelBottom;
    public static Block doorSilverTop;
    public static Block doorSilverBottom;

    public static Block fenceCopper;
    public static Block fenceCopperTarnished;
    public static Block fenceCopperCorroded;
    public static Block fenceSilver;

    public static Block pressureplateCopper;
    public static Block pressureplateCopperTarnished;
    public static Block pressureplateCopperCorroded;

    public static Block chandelierSilver;

    public static Block candelabraSilver;

    public static Block lanternSilver;

    public static Block vaseSilver;

    public static Block vaneSilver;

    public static Block chimesSilver;

    public static Block bedSilver;

    public static Block seatSilver;

    public static Block scorchedstone;

    public static Block pillarSlate;

    public static Block marblePolished;

    public static Block slateCarved;
    public static Block marbleCarved;

    public static Block clayBaked;

    public static Block glassObsidian;
    public static Block trapdoorGlassObsidian;
    public static Block glassQuartz;

    public static Block cobbleNetherrack;
    public static Block netherrack;

    public static Block brickNetherrack;
    public static Block brickScorchedstone;
    public static Block brickMud;
    public static Block brickSteel;
    public static Block brickQuartz;
    public static Block brickOlivine;
    public static Block brickSilver;

    public static Block soulslate;
    public static Block brimstone;

    public static Block pumiceDry;
    public static Block pumiceWet;

    public static Block candleSoulwax;

    public static Block slabWool;
    public static Block slabCobbleStoneMossy;
    public static Block slabSlatePolished;
    public static Block slabMarblePolished;
    public static Block slabBrickStonePolishedMossy;
    public static Block slabBrickSandstone;
    public static Block slabBrickGold;
    public static Block slabBrickIron;
    public static Block slabBrickLapis;
    public static Block slabCobbleNetherrack;
    public static Block slabCobbleNetherrackMossy;
    public static Block slabBrickNetherrack;
    public static Block slabBrickScorchedstone;
    public static Block slabBrickMud;
    public static Block slabScorchedstone;
    public static Block slabBrickSteel;
    public static Block slabBrickQuartz;
    public static Block slabBrickOlivine;
    public static Block slabBrickSilver;
    public static Block slabCopper;
    public static Block slabCopperTarnished;
    public static Block slabCopperCorroded;

    public static Block stairsWool;
    public static Block stairsCobbleStoneMossy;
    public static Block stairsBrickStonePolishedMossy;
    public static Block stairsScorchedstone;
    public static Block stairsBrickGold;
    public static Block stairsBrickIron;
    public static Block stairsBrickLapis;
    public static Block stairsCobbleNetherrack;
    public static Block stairsCobbleNetherrackMossy;
    public static Block stairsBrickNetherrack;
    public static Block stairsBrickScorchedstone;
    public static Block stairsBrickMud;
    public static Block stairsBrickSteel;
    public static Block stairsBrickQuartz;
    public static Block stairsBrickOlivine;
    public static Block stairsBrickSilver;
    public static Block stairsCopper;
    public static Block stairsCopperTarnished;
    public static Block stairsCopperCorroded;

    public static Block brickClayBaked;
    public static Block slabBrickClayBaked;
    public static Block stairsBrickClayBaked;

    public static Block dirtRough;

    public static Block skullCarved;
    public static Block skullActive;
    public static Block skull;

    public static Block lazurite;
    public static Block cobbleLazurite;
    public static Block slabCobbleLazurite;
    public static Block stairsCobbleLazurite;
    public static Block brickLazurite;
    public static Block slabBrickLazurite;
    public static Block stairsBrickLazurite;
    public static Block lazuritePolished;
    public static Block lazuriteCarved;
    public static Block slabLazuritePolished;

    public static Block peridot;
    public static Block cobblePeridot;
    public static Block slabCobblePeridot;
    public static Block stairsCobblePeridot;
    public static Block brickPeridot;
    public static Block slabBrickPeridot;
    public static Block stairsBrickPeridot;
    public static Block peridotPolished;
    public static Block peridotCarved;
    public static Block slabPeridotPolished;

    public static Block pot;

    public static Block girderIron;
    public static Block fenceGold;
    public static Block bedroll;


    private void initializeBlockDetails() {

        miningLevels.put(lazurite, 0);
        miningLevels.put(cobbleLazurite, 0);
        miningLevels.put(brickLazurite, 0);
        miningLevels.put(lazuritePolished, 0);
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


        itemsList[cratePainted.id] = new ItemBlockPainted(cratePainted, false);

        stoneToMossMap.put(saplingOak, BonusBlocks.saplingOakMossy);
        stoneToMossMap.put(BonusBlocks.cobbleNetherrack, netherrack);
        stoneToMossMap.put(mossStone, BonusBlocks.moss);
        stoneToMossMap.put(mossBasalt, BonusBlocks.moss);
        stoneToMossMap.put(mossLimestone, BonusBlocks.moss);
        stoneToMossMap.put(mossGranite, BonusBlocks.moss);

        LookupFuelFurnace.instance.addFuelEntry(logMaple.id, 300);
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
        LookupFuelFurnace.instance.addFuelEntry(saplingMaple.id, 100);
        LookupFuelFurnace.instance.addFuelEntry(saplingOakMossy.id, 100);

        CreativeHelper.setParent(netherrack, permafrost);

        CreativeHelper.setParent(cobbleNetherrack, cobblePermafrost);
        CreativeHelper.setParent(netherrack, cobblePermafrost);

        CreativeHelper.setParent(pillarSlate, pillarMarble);

        CreativeHelper.setParent(scorchedstone, sandstone);

        CreativeHelper.setParent(box, planksOak);

        CreativeHelper.setParent(crate, trommelIdle);

        for (int color = 1; color < 17; color++) {
            CreativeHelper.setParent(cratePainted, color - 1, trommelIdle, 0);
        }

        CreativeHelper.setParent(bookshelfEmptyPlanksOak, bookshelfPlanksOak);

        CreativeHelper.setParent(moss, mossGranite);

        CreativeHelper.setParent(stoneCarved, pillarMarble);
        CreativeHelper.setParent(basaltCarved, pillarMarble);
        CreativeHelper.setParent(limestoneCarved, pillarMarble);
        CreativeHelper.setParent(graniteCarved, pillarMarble);
        CreativeHelper.setParent(capstoneMarble, pillarMarble);
        CreativeHelper.setParent(marbleCarved, pillarMarble);
        CreativeHelper.setParent(slateCarved, pillarMarble);

        CreativeHelper.setParent(overgrownGrass, grassScorched);
        CreativeHelper.setParent(overgrownGrassRetro, grassScorched);
        CreativeHelper.setParent(overgrownGrassScorched, grassScorched);
        CreativeHelper.setParent(overgrownPath, pathDirt);

        CreativeHelper.setParent(dirtRough, dirt);

        CreativeHelper.setParent(skull, pumpkinCarvedActive);
        CreativeHelper.setParent(skullCarved, pumpkinCarvedActive);
        CreativeHelper.setParent(skullActive, pumpkinCarvedActive);

        CreativeHelper.setParent(glassObsidian, glass);
        CreativeHelper.setParent(glassQuartz, glassTinted);

        CreativeHelper.setParent(trapdoorGlassObsidian, trapdoorGlass);
        CreativeHelper.setParent(trapdoorSteel, trapdoorGlass);
        CreativeHelper.setParent(trapdoorCopper, trapdoorGlass);
        CreativeHelper.setParent(trapdoorCopperTarnished, trapdoorGlass);
        CreativeHelper.setParent(trapdoorCopperCorroded, trapdoorGlass);
        CreativeHelper.setParent(trapdoorSilver, trapdoorGlass);

        CreativeHelper.setParent(flowerSilver, flowerRed);
        CreativeHelper.setParent(flowerLightBlue, flowerRed);
        CreativeHelper.setParent(flowerMagenta, flowerRed);
        CreativeHelper.setParent(flowerLime, flowerRed);

        CreativeHelper.setParent(petalYellow, flowerRed);
        CreativeHelper.setParent(petalRed, flowerRed);
        CreativeHelper.setParent(petalCyan, flowerRed);
        CreativeHelper.setParent(petalPurple, flowerRed);
        CreativeHelper.setParent(petalPink, flowerRed);
        CreativeHelper.setParent(petalLightGray, flowerRed);
        CreativeHelper.setParent(petalOrange, flowerRed);
        CreativeHelper.setParent(petalLightBlue, flowerRed);
        CreativeHelper.setParent(petalMagenta, flowerRed);
        CreativeHelper.setParent(petalLime, flowerRed);

        CreativeHelper.setParent(petalLayerYellow, flowerRed);
        CreativeHelper.setParent(petalLayerRed, flowerRed);
        CreativeHelper.setParent(petalLayerCyan, flowerRed);
        CreativeHelper.setParent(petalLayerPurple, flowerRed);
        CreativeHelper.setParent(petalLayerPink, flowerRed);
        CreativeHelper.setParent(petalLayerLightGray, flowerRed);
        CreativeHelper.setParent(petalLayerOrange, flowerRed);
        CreativeHelper.setParent(petalLayerLightBlue, flowerRed);
        CreativeHelper.setParent(petalLayerMagenta, flowerRed);
        CreativeHelper.setParent(petalLayerLime, flowerRed);

        CreativeHelper.setParent(mushroomGray, mushroomRed);

        CreativeHelper.setParent(fungiBrown, mushroomRed);
        CreativeHelper.setParent(fungiRed, mushroomRed);
        CreativeHelper.setParent(fungiGray, mushroomRed);

        CreativeHelper.setParent(logShrub, logOakMossy);
        CreativeHelper.setParent(logCacao, logOakMossy);
        CreativeHelper.setParent(logMaple, logOakMossy);
        CreativeHelper.setParent(logJacaranda, logOakMossy);
        CreativeHelper.setParent(logScorched, logOakMossy);

        CreativeHelper.setParent(leavesOakMossy, leavesCacao);
        CreativeHelper.setParent(leavesMaple, leavesCacao);
        CreativeHelper.setParent(leavesJacaranda, leavesCacao);
        CreativeHelper.setParent(branch, leavesCacao);

        CreativeHelper.setParent(saplingOakMossy, saplingCacao);
        CreativeHelper.setParent(saplingMaple, saplingCacao);
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

        CreativeHelper.setParent(brickNetherrack, brickIron);
        CreativeHelper.setParent(brickScorchedstone, brickIron);
        CreativeHelper.setParent(brickMud, brickIron);
        CreativeHelper.setParent(brickSteel, brickIron);
        CreativeHelper.setParent(brickQuartz, brickIron);
        CreativeHelper.setParent(brickOlivine, brickIron);
        CreativeHelper.setParent(brickSilver, brickIron);
        CreativeHelper.setParent(brickClayBaked, brickIron);

        CreativeHelper.setParent(fenceCopper, fenceChainlink);
        CreativeHelper.setParent(fenceCopperTarnished, fenceChainlink);
        CreativeHelper.setParent(fenceCopperCorroded, fenceChainlink);
        CreativeHelper.setParent(fenceSilver, fenceChainlink);
        CreativeHelper.setParent(fenceGold, fenceChainlink);


        CreativeHelper.setParent(pressureplateCopper, pressureplateCobbleStone);
        CreativeHelper.setParent(pressureplateCopperTarnished, pressureplateCobbleStone);
        CreativeHelper.setParent(pressureplateCopperCorroded, pressureplateCobbleStone);

        CreativeHelper.setParent(meshCopper, mesh);
        CreativeHelper.setParent(meshCopperTarnished, mesh);
        CreativeHelper.setParent(meshCopperCorroded, mesh);

        CreativeHelper.setParent(marblePolished, slatePolished);

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
        CreativeHelper.setParent(slabBrickSandstone, slabBasaltPolished);
        CreativeHelper.setParent(slabBrickGold, slabBasaltPolished);
        CreativeHelper.setParent(slabBrickIron, slabBasaltPolished);
        CreativeHelper.setParent(slabBrickLapis, slabBasaltPolished);
        CreativeHelper.setParent(slabCobbleNetherrack, slabBasaltPolished);
        CreativeHelper.setParent(slabCobbleNetherrackMossy, slabBasaltPolished);
        CreativeHelper.setParent(slabScorchedstone, slabBasaltPolished);
        CreativeHelper.setParent(slabBrickNetherrack, slabBasaltPolished);
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
        for (int color = 0; color < 16; color++) {
            CreativeHelper.setParent(slabWool, color << 4, slabBasaltPolished, 0);
        }

        CreativeHelper.setParent(stairsCobbleStoneMossy, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickStonePolishedMossy, stairsBrickStone);
        CreativeHelper.setParent(stairsScorchedstone, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickGold, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickIron, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickLapis, stairsBrickStone);
        CreativeHelper.setParent(stairsCobbleNetherrack, stairsBrickStone);
        CreativeHelper.setParent(stairsCobbleNetherrackMossy, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickNetherrack, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickScorchedstone, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickMud, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickSteel, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickQuartz, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickOlivine, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickSilver, stairsBrickStone);
        CreativeHelper.setParent(stairsCopper, stairsBrickStone);
        CreativeHelper.setParent(stairsCopperTarnished, stairsBrickStone);
        CreativeHelper.setParent(stairsCopperCorroded, stairsBrickStone);
        CreativeHelper.setParent(stairsBrickClayBaked, stairsBrickStone);
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
                .setItemBlock(ItemBlockLeaves::new)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_HOE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS, BlockTags.SHEARS_DO_SILK_TOUCH);

        BlockBuilder sapling = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
                .setHardness(0.0f)
                .setResistance(0.0f)
                .setBlockModel(BlockModelCrossedSquares::new)
                .setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR);

        BlockBuilder log = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
                .setHardness(2.0F)
                .setResistance(1.0f)
                .setFlammability(5, 5)
                .setBlockModel(BlockModelAxisAligned::new)
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
                .setBlockModel(BlockModelCrossedSquares::new)
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
                .setBlockModel(block -> new BlockModelStandard<>(box).withTextures("box.png"))
                .build(new Block("box", blockID("box"), Material.wood));

        // Crates
        crate = crates
                .setBlockModel(block -> new BlockModelStandard<>(crate).withTextures("crate.png"))
                .build(new Block("crate", blockID("crate"), Material.wood));
        cratePainted = crates
                .setBlockModel(block -> new BlockModelCratePainted<>(cratePainted))
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockPaintedCrate("crate.painted", blockID("cratePainted")));


        // Bookshelf
        bookshelfEmptyPlanksOak = new BlockBuilder(MOD_ID)
                .setBlockModel(block -> new BlockModelStandard<>(bookshelfEmptyPlanksOak).withTextures("bookshelf_empty_side.png"))
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 0.8f))
                .setHardness(1.5f)
                .setResistance(1.0f)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
                .build(new Block("bookshelf.empty.planks.oak", blockID("bookshelfEmptyPlanksOak"), Material.wood));

        // Leaves and Branch
        branch = leaves
                .setBlockModel(block -> new BlockModelStandard<>(branch).withTextures("branch.png"))
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 0.5f))
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
                .build(new BlockBranch("branch", blockID("branch")));

        leavesOakMossy = leaves
                .setBlockModel(block -> new BlockModelLeaves<>(leavesOakMossy, "leaves_oak_mossy.png"))
                .setBlockColor(block -> (new BlockColorCustom(Colorizers.oak)))
                .build(new BlockLeavesBase("leaves.oak.mossy", blockID("leavesOakMossy"), Material.leaves) {
                    @Override
                    protected Block getSapling() {
                        return BonusBlocks.saplingOakMossy;
                    }
                });
        leavesMaple = leaves
                .setBlockModel(block -> new BlockModelLeaves<>(leavesMaple, "leaves_maple.png"))
                .build(new BlockLeavesBase("leaves.maple", blockID("leavesMaple"), Material.leaves) {
                    @Override
                    protected Block getSapling() {
                        return BonusBlocks.saplingMaple;
                    }
                });
        leavesJacaranda = leaves
                .setBlockModel(block -> new BlockModelLeaves<>(leavesJacaranda, "leaves_jacaranda.png"))
                .build(new BlockLeavesBase("leaves.jacaranda", blockID("leavesJacaranda"), Material.leaves) {
                    @Override
                    protected Block getSapling() {
                        return BonusBlocks.saplingJacaranda;
                    }
                });


        // Saplings
        saplingMaple = sapling
                .setBlockModel(block -> new BlockModelCrossedSquares<>(saplingMaple).withTextures("sapling_maple.png"))
                .build(new BlockSaplingMaple("sapling.maple", blockID("saplingMaple")));
        saplingJacaranda = sapling
                .setBlockModel(block -> new BlockModelCrossedSquares<>(saplingJacaranda).withTextures("sapling_jacaranda.png"))
                .build(new BlockSaplingJacaranda("sapling.jacaranda", blockID("saplingJacaranda")));
        saplingOakMossy = sapling
                .setBlockModel(block -> new BlockModelCrossedSquares<>(saplingOakMossy).withTextures("sapling_oak_mossy.png"))
                .build(new BlockSaplingMossyOak("sapling.oak.mossy", blockID("saplingOakMossy")));


        // Logs
        logShrub = log
                .setBlockModel(block -> new BlockModelAxisAligned<>(logShrub).withTextures("log_shrub_top.png", "log_shrub_side.png"))
                .build(new BlockLog("log.shrub", blockID("logShrub")));
        logCacao = log
                .setBlockModel(block -> new BlockModelAxisAligned<>(logCacao).withTextures("log_cacao_top.png", "log_cacao_side.png"))
                .build(new BlockLog("log.cacao", blockID("logCacao")));
        logMaple = log
                .setBlockModel(block -> new BlockModelAxisAligned<>(logMaple).withTextures("log_maple_top.png", "log_maple_side.png"))
                .build(new BlockLog("log.maple", blockID("logMaple")));
        logJacaranda = log
                .setBlockModel(block -> new BlockModelAxisAligned<>(logJacaranda).withTextures("log_jacaranda_top.png", "log_jacaranda_side.png"))
                .build(new BlockLog("log.jacaranda", blockID("logJacaranda")));
        logScorched = log
                .setBlockModel(block -> new BlockModelAxisAligned<>(logScorched).withTextures("log_scorched_top.png", "log_scorched_side.png"))
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.2f))
                .setHardness(1.8f)
                .build(new BlockLog("log.scorched", blockID("logScorched")));


        // Moss
        moss = grass
                .setBlockModel(block -> new BlockModelStandard<>(moss).withTextures("moss.png"))
                .setFlammability(100, 30)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
                .build(new BlockMossy("moss", blockID("moss"), Material.moss));


        // Overgrown Grass
        overgrownGrass = grass
                .setBlockModel(block -> new BlockModelGrass<>(overgrownGrass).withTextures("minecraft:block/grass_top.png"))
                .setBlockColor(block -> (new BlockColorCustom(Colorizers.grass)))
                .build(new Block("grass.overgrown", blockID("overgrownGrass"), Material.grass));
        overgrownGrassRetro = grass
                .setBlockModel(block -> new BlockModelStandard<>(overgrownGrassRetro).withTextures("minecraft:block/grass_retro_top.png"))
                .build(new Block("grass.retro.overgrown", blockID("overgrownGrassRetro"), Material.grass));
        overgrownGrassScorched = grass
                .setBlockModel(block -> new BlockModelStandard<>(overgrownGrassScorched).withTextures("minecraft:block/grass_scorched_top.png"))
                .build(new Block("grass.scorched.overgrown", blockID("overgrownGrassScorched"), Material.grass));
        overgrownPath = grass
                .setBlockModel(block -> new BlockModelStandard<>(overgrownPath).withTextures("minecraft:block/grass_path_top.png"))
                .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                .setBlockDrop(BonusBlocks.overgrownPath)
                .build(new BlockDirtPath("path.overgrown", blockID("overgrownPath")));

        // Flowers
        flowerSilver = flower
                .setBlockModel(block -> new BlockModelCrossedSquares<>(flowerSilver).withTextures("flower_lightgray.png"))
                .build(new BlockFlower("flower.silver", blockID("flowerSilver")));
        flowerLightBlue = flower
                .setBlockModel(block -> new BlockModelCrossedSquares<>(flowerLightBlue).withTextures("flower_lightblue.png"))
                .build(new BlockFlower("flower.lightblue", blockID("flowerLightBlue")));
        flowerMagenta = flower
                .setBlockModel(block -> new BlockModelCrossedSquares<>(flowerMagenta).withTextures("flower_magenta.png"))
                .build(new BlockFlower("flower.magenta", blockID("flowerMagenta")));
        flowerLime = flower
                .setBlockModel(block -> new BlockModelCrossedSquares<>(flowerLime).withTextures("flower_lime.png"))
                .build(new BlockFlower("flower.lime", blockID("flowerLime")));

        // Petals
        petalYellow = petal
                .setBlockModel(block -> new BlockModelStandard<>(petalYellow).withTextures("petal_yellow.png"))
                .build(new BlockPetal("petal.yellow", blockID("petalYellow"), Material.grass));
        petalRed = petal
                .setBlockModel(block -> new BlockModelStandard<>(petalRed).withTextures("petal_red.png"))
                .build(new BlockPetal("petal.red", blockID("petalRed"), Material.grass));
        petalCyan = petal
                .setBlockModel(block -> new BlockModelStandard<>(petalCyan).withTextures("petal_cyan.png"))
                .build(new BlockPetal("petal.cyan", blockID("petalCyan"), Material.grass));
        petalPurple = petal
                .setBlockModel(block -> new BlockModelStandard<>(petalPurple).withTextures("petal_purple.png"))
                .build(new BlockPetal("petal.purple", blockID("petalPurple"), Material.grass));
        petalPink = petal
                .setBlockModel(block -> new BlockModelStandard<>(petalPink).withTextures("petal_pink.png"))
                .build(new BlockPetal("petal.pink", blockID("petalPink"), Material.grass));
        petalLightGray = petal
                .setBlockModel(block -> new BlockModelStandard<>(petalLightGray).withTextures("petal_lightgray.png"))
                .build(new BlockPetal("petal.silver", blockID("petalSilver"), Material.grass));
        petalOrange = petal
                .setBlockModel(block -> new BlockModelStandard<>(petalOrange).withTextures("petal_orange.png"))
                .build(new BlockPetal("petal.orange", blockID("petalOrange"), Material.grass));
        petalLightBlue = petal
                .setBlockModel(block -> new BlockModelStandard<>(petalLightBlue).withTextures("petal_lightblue.png"))
                .build(new BlockPetal("petal.lightblue", blockID("petalLightBlue"), Material.grass));
        petalMagenta = petal
                .setBlockModel(block -> new BlockModelStandard<>(petalMagenta).withTextures("petal_magenta.png"))
                .build(new BlockPetal("petal.magenta", blockID("petalMagenta"), Material.grass));
        petalLime = petal
                .setBlockModel(block -> new BlockModelStandard<>(petalLime).withTextures("petal_lime.png"))
                .build(new BlockPetal("petal.lime", blockID("petalLime"), Material.grass));

        // Petal Layers
        petalLayerYellow = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(petalLayerYellow).withTextures("petal_layer_yellow.png"))
                .build(new BlockLayerPetal("layer.petal.yellow", blockID("petalLayerYellow"), Material.grass));
        petalLayerRed = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(petalLayerRed).withTextures("petal_layer_red.png"))
                .build(new BlockLayerPetal("layer.petal.red", blockID("petalLayerRed"), Material.grass));
        petalLayerCyan = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(petalLayerCyan).withTextures("petal_layer_cyan.png"))
                .build(new BlockLayerPetal("layer.petal.cyan", blockID("petalLayerCyan"), Material.grass));
        petalLayerPurple = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(petalLayerPurple).withTextures("petal_layer_purple.png"))
                .build(new BlockLayerPetal("layer.petal.purple", blockID("petalLayerPurple"), Material.grass));
        petalLayerPink = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(petalLayerPink).withTextures("petal_layer_pink.png"))
                .build(new BlockLayerPetal("layer.petal.pink", blockID("petalLayerPink"), Material.grass));
        petalLayerLightGray = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(petalLayerLightGray).withTextures("petal_layer_lightgray.png"))
                .build(new BlockLayerPetal("layer.petal.lightgray", blockID("petalLayerLightGray"), Material.grass));
        petalLayerOrange = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(petalLayerOrange).withTextures("petal_layer_orange.png"))
                .build(new BlockLayerPetal("layer.petal.orange", blockID("petalLayerOrange"), Material.grass));
        petalLayerLightBlue = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(petalLayerLightBlue).withTextures("petal_layer_lightblue.png"))
                .build(new BlockLayerPetal("layer.petal.lightblue", blockID("petalLayerLightBlue"), Material.grass));
        petalLayerMagenta = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(petalLayerMagenta).withTextures("petal_layer_magenta.png"))
                .build(new BlockLayerPetal("layer.petal.magenta", blockID("petalLayerMagenta"), Material.grass));
        petalLayerLime = petalLayer
                .setBlockModel(block -> new BlockModelLayer<>(petalLayerLime).withTextures("petal_layer_lime.png"))
                .build(new BlockLayerPetal("layer.petal.lime", blockID("petalLayerLime"), Material.grass));

        // Mushroom
        mushroomGray = flower
                .setBlockModel(block -> new BlockModelCrossedSquares<>(mushroomGray).withTextures("mushroom_gray.png"))
                .build(new BlockMushroom("mushroom.gray", blockID("mushroomGray")));

        // Mushroom Blocks
        fungiBrown = grass
                .setLuminance(2)
                .setBlockModel(block -> new BlockModelStandard<>(fungiBrown).withTextures("block_mushroom_brown.png"))
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build(new Block("block.mushroom.brown", blockID("fungiBrown"), Material.dirt));
        fungiRed = grass
                .setBlockModel(block -> new BlockModelStandard<>(fungiRed).withTextures("block_mushroom_red.png"))
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build(new Block("block.mushroom.red", blockID("fungiRed"), Material.dirt));
        fungiGray = grass
                .setBlockModel(block -> new BlockModelStandard<>(fungiGray).withTextures("block_mushroom_gray.png"))
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build(new Block("block.mushroom.gray", blockID("fungiGray"), Material.dirt));

        // Bone Block
        blockBone = stone
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setBlockModel(block -> new BlockModelAxisAligned<>(blockBone).withTextures("block_bone_top.png", "block_bone_side.png"))
                .build(new BlockAxisAligned("block.bone", blockID("blockBone"), Material.stone));

        // Thatch
        thatch = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 0.6f, 1.2f))
                .setHardness(0.6f)
                .setResistance(0.6f)
                .setBlockModel(block -> new BlockModelAxisAligned<>(thatch).withTextures("thatch_top.png", "thatch_side.png"))
                .setFlammability(60, 120)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
                .build(new BlockThatch("thatch", blockID("thatch"), Material.grass));

        // Cloth Block
        blockCloth = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.8f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setBlockModel(block -> new BlockModelStandard<>(blockCloth).withTextures("block_cloth.png"))
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.MINEABLE_BY_AXE)
                .build(new BlockCloth("block.cloth", blockID("blockCloth"), Material.cloth));

        // Slime Block
        blockSlime = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.5f))
                .setHardness(0.2f)
                .setResistance(0.2f)
                .setLightOpacity(6)
                .setBlockModel(block -> new BlockModelStandard<>(blockSlime).withTextures("block_slime.png"))
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build(new BlockSlime("block.slime", blockID("blockSlime")));

        // Sulphur Block
        blockSulphur = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                .setHardness(0.5f)
                .setResistance(0.5f)
                .setBlockModel(block -> new BlockModelStandard<>(blockSulphur).withTextures("block_sulphur.png"))
                .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                .build(new BlockSulphur("block.sulphur", blockID("blockSulphur")));

        // Sugar Block
        blockSugar = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                .setHardness(0.3f)
                .setResistance(0.3f)
                .setBlockModel(block -> new BlockModelStandard<>(blockSugar).withTextures("block_sugar.png"))
                .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.BROKEN_BY_FLUIDS)
                .build(new BlockSand("block.sugar", blockID("blockSugar")));

        // Leather Block
        blockLeather = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.6f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setBlockModel(block -> new BlockModelStandard<>(blockLeather).withTextures("block_leather.png"))
                .setFlammability(5, 10)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build(new Block("block.leather", blockID("blockLeather"), Material.cloth));

        // Wicker Block
        blockWicker = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.5f)
                .setResistance(0.5f)
                .setBlockModel(block -> new BlockModelStandard<>(blockWicker).withTextures("minecraft:block/basket_bottom.png"))
                .setFlammability(60, 120)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build(new Block("block.wicker", blockID("blockWicker"), Material.cloth));

        // Flint Block
        blockFlint = raw
                .setBlockModel(block -> new BlockModelStandard<>(blockFlint).withTextures("block_flint.png"))
                .setInfiniburn()
                .build(new Block("block.flint", blockID("blockFlint"), Material.stone));

        // Crude Steel Block
        blockCrudeSteel = raw
                .setHardness(4.0f)
                .setResistance(1000.0f)
                .setBlockModel(block -> new BlockModelStandard<>(blockCrudeSteel).withTextures("block_steel_crude.png"))
                .build(new Block("block.steel.crude", blockID("blockCrudeSteel"), Material.metal));

        // Raw Blocks
        blockRawIron = raw
                .setBlockModel(block -> new BlockModelStandard<>(blockRawIron).withTextures("block_iron_raw.png"))
                .build(new Block("block.raw.iron", blockID("blockRawIron"), Material.metal));
        blockRawGold = raw
                .setBlockModel(block -> new BlockModelStandard<>(blockRawGold).withTextures("block_gold_raw.png"))
                .build(new Block("block.raw.gold", blockID("blockRawGold"), Material.metal));
        blockRawCopper = raw
                .setBlockModel(block -> new BlockModelStandard<>(blockRawCopper).withTextures("block_copper_raw.png"))
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
                .setBlockModel(block -> new BlockModelStandard<>(blockRawCopperTarnished).withTextures("block_copper_tarnished_raw.png"))
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
                .setBlockModel(block -> new BlockModelStandard<>(blockRawCopperCorroded).withTextures("block_copper_corroded_raw.png"))
                .build(new Block("block.raw.copper.corroded", blockID("blockRawCopperCorroded"), Material.metal));
        blockRawSilver = silver
                .setBlockModel(block -> new BlockModelStandard<>(blockRawSilver).withTextures("block_silver_raw.png"))
                .build(new Block("block.raw.silver", blockID("blockRawSilver"), Material.metal));

        // Nuggets

        // Make Custom BlockMODEL for these fuckers
        overlayRawIron = pebble
                .setBlockModel(block -> new BlockModelPebbles<>(overlayRawIron).withTextures("pebbles_iron1.png", "pebbles_iron2.png", "pebbles_iron3.png"))
                .build(new BlockOverlayRawIron("overlay.iron", blockID("overlayRawIron"), Material.metal));
        overlayRawGold = pebble
                .setBlockModel(block -> new BlockModelPebbles<>(overlayRawGold).withTextures("pebbles_gold1.png", "pebbles_gold2.png", "pebbles_gold3.png"))
                .build(new BlockOverlayRawGold("overlay.gold", blockID("overlayRawGold"), Material.metal));
        overlayRawCopper = pebble
                .setBlockModel(block -> new BlockModelPebbles<>(overlayRawCopper).withTextures("pebbles_copper1.png", "pebbles_copper2.png", "pebbles_copper3.png"))
                .build(new BlockOverlayRawCopper("overlay.copper", blockID("overlayRawCopper"), Material.metal));
        overlayRawSilver = pebble
                .setBlockModel(block -> new BlockModelPebbles<>(overlayRawSilver).withTextures("pebbles_silver1.png", "pebbles_silver2.png", "pebbles_silver3.png"))
                .build(new BlockOverlayRawSilver("overlay.silver", blockID("overlayRawSilver"), Material.metal));

        // Copper Ores
        oreCopperStone = ore
                .setBlockModel(block -> new BlockModelStandard<>(oreCopperStone).withTextures("ore_copper_stone.png"))
                .build(new BlockOreCopper("ore.copper.stone", blockID("oreCopperStone")));
        oreCopperBasalt = ore
                .setBlockModel(block -> new BlockModelStandard<>(oreCopperBasalt).withTextures("ore_copper_basalt.png"))
                .build(new BlockOreCopper("ore.copper.basalt", blockID("oreCopperBasalt")));
        oreCopperLimestone = ore
                .setBlockModel(block -> new BlockModelStandard<>(oreCopperLimestone).withTextures("ore_copper_limestone.png"))
                .build(new BlockOreCopper("ore.copper.limestone", blockID("oreCopperLimestone")));
        oreCopperGranite = ore
                .setBlockModel(block -> new BlockModelStandard<>(oreCopperGranite).withTextures("ore_copper_granite.png"))
                .build(new BlockOreCopper("ore.copper.granite", blockID("oreCopperGranite")));

        oreSilverStone = ore
                .setBlockModel(block -> new BlockModelStandard<>(oreSilverStone).withTextures("ore_silver_stone.png"))
                .build(new BlockOreSilver("ore.silver.stone", blockID("oreSilverStone")));
        oreSilverBasalt = ore
                .setBlockModel(block -> new BlockModelStandard<>(oreSilverBasalt).withTextures("ore_silver_basalt.png"))
                .build(new BlockOreSilver("ore.silver.basalt", blockID("oreSilverBasalt")));
        oreSilverLimestone = ore
                .setBlockModel(block -> new BlockModelStandard<>(oreSilverLimestone).withTextures("ore_silver_limestone.png"))
                .build(new BlockOreSilver("ore.silver.limestone", blockID("oreSilverLimestone")));
        oreSilverGranite = ore
                .setBlockModel(block -> new BlockModelStandard<>(oreSilverGranite).withTextures("ore_silver_granite.png"))
                .build(new BlockOreSilver("ore.silver.granite", blockID("oreSilverGranite")));


        // Copper Blocks
        blockCopper = raw
                .setBlockModel(block -> new BlockModelStandard<>(blockCopper).withTextures("block_copper.png"))
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
                .setBlockModel(block -> new BlockModelStandard<>(blockCopperTarnished).withTextures("block_copper_tarnished.png"))
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
                .setBlockModel(block -> new BlockModelStandard<>(blockCopperCorroded).withTextures("block_copper_corroded.png"))
                .build(new Block("block.copper.corroded", blockID("blockCopperCorroded"), Material.metal));


        // Copper Mesh
        meshCopper = raw
                .setBlockModel(block -> new BlockModelTransparent<>(meshCopper, true).withTextures("mesh_copper.png"))
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
                .setBlockModel(block -> new BlockModelTransparent<>(meshCopper, true).withTextures("mesh_copper_tarnished.png"))
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
                .setBlockModel(block -> new BlockModelTransparent<>(meshCopper, true).withTextures("mesh_copper_corroded.png"))
                .build(new BlockTransparent("mesh.copper.corroded", blockID("meshCopperCorroded"), Material.metal) {
                });


        // Copper Pipe
        pipeCopper = raw
                .setBlockModel(block -> new DFBlockModelBuilder(MOD_ID).setBlockModel("block/pipe.json").setBlockState(MOD_ID, "pipe_states.json").setMetaStateInterpreter(new PipeMetaStateInterpreter()).build(pipeCopper))
                .build(new BlockCopperPipe("pipe.copper", blockID("pipeCopper"), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "pipe.json"), false));

        pipeCopperTarnished = raw
                .setBlockModel(block -> new DFBlockModelBuilder(MOD_ID).setBlockModel("block/tarnishedpipe.json").setBlockState(MOD_ID, "tarnished_pipe_states.json").setMetaStateInterpreter(new PipeMetaStateInterpreter()).build(pipeCopperTarnished))
                .build(new BlockCopperPipe("pipe.copper.tarnished", blockID("pipeCopperTarnished"), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "tarnishedpipe.json"), false) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (rand.nextInt(200) == 0) {
                            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.pipeCopperCorroded.id, world.getBlockMetadata(x, y, z));
                            }
                        }
                    }
                });

        pipeCopperCorroded = raw
                .setVisualUpdateOnMetadata()
                .setBlockModel(block -> new DFBlockModelBuilder(MOD_ID).setBlockModel("block/corrodedpipe.json").setBlockState(MOD_ID, "corroded_pipe_states.json").setMetaStateInterpreter(new PipeMetaStateInterpreter()).build(pipeCopperCorroded))
                .build(new BlockCopperPipe("pipe.copper.corroded", blockID("pipeCopperCorroded"), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "corrodedpipe.json"), false) {
                    @Override
                    public void updateTick(World world, int x, int y, int z, Random rand) {
                    }
                });


        // Copper Trapdoor
        trapdoorCopper = raw
                .setBlockModel(block -> new BlockModelTrapDoor<>(trapdoorCopper).withTextures("trapdoor_copper_top.png", "trapdoor_copper_side.png"))
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
                .setBlockModel(block -> new BlockModelTrapDoor<>(trapdoorCopperTarnished).withTextures("trapdoor_copper_tarnished_top.png", "trapdoor_copper_tarnished_side.png"))
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
                .setBlockModel(block -> new BlockModelTrapDoor<>(trapdoorCopperCorroded).withTextures("trapdoor_copper_corroded_top.png", "trapdoor_copper_corroded_side.png"))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoor("trapdoor.copper.corroded", blockID("trapdoorCopperCorroded"), Material.stone, false));


        // Copper Doors
        doorCopperBottom = raw
                .setBlockModel(block -> new BlockModelDoor<>(doorCopperBottom).withTextures("door_copper_bottom.png"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockCopperDoor("door.copper.bottom", blockID("doorCopperBottom"), Material.stone, false));
        doorCopperTop = raw
                .setBlockModel(block -> new BlockModelDoor<>(doorCopperTop).withTextures("door_copper_top.png"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockCopperDoor("door.copper.top", blockID("doorCopperTop"), Material.stone, true));

        doorCopperTarnishedBottom = raw
                .setBlockModel(block -> new BlockModelDoor<>(doorCopperTarnishedBottom).withTextures("door_copper_tarnished_bottom.png"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockCopperTarnishedDoor("door.copper.tarnished.bottom", blockID("doorCopperTarnishedBottom"), Material.stone, false));
        doorCopperTarnishedTop = raw
                .setBlockModel(block -> new BlockModelDoor<>(doorCopperTarnishedTop).withTextures("door_copper_tarnished_top.png"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockCopperTarnishedDoor("door.copper.tarnished.top", blockID("doorCopperTarnishedTop"), Material.stone, true));

        doorCopperCorrodedBottom = raw
                .setBlockModel(block -> new BlockModelDoor<>(doorCopperCorrodedBottom).withTextures("door_copper_corroded_bottom.png"))
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
                .setBlockModel(block -> new BlockModelDoor<>(doorCopperCorrodedTop).withTextures("door_copper_corroded_top.png"))
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
                .setBlockModel(block -> new BlockModelFenceThin<>(fenceCopper, TextureRegistry.getTexture("bonusblocks:block/fence_copper_center.png"), null, TextureRegistry.getTexture("bonusblocks:block/fence_copper_top.png"), TextureRegistry.getTexture("bonusblocks:block/fence_copper_column.png")))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceCopper("fence.copper", blockID("fenceCopper"), Material.metal));
        fenceCopperTarnished = raw
                .setBlockModel(block -> new BlockModelFenceThin<>(fenceCopperTarnished, TextureRegistry.getTexture("bonusblocks:block/fence_copper_tarnished_center.png"), null, TextureRegistry.getTexture("bonusblocks:block/fence_copper_tarnished_top.png"), TextureRegistry.getTexture("bonusblocks:block/fence_copper_tarnished_column.png")))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceCopperTarnished("fence.copper.tarnished", blockID("fenceCopperTarnished"), Material.metal));
        fenceCopperCorroded = raw
                .setBlockModel(block -> new BlockModelFenceThin<>(fenceCopper, TextureRegistry.getTexture("bonusblocks:block/fence_copper_corroded_center.png"), null, TextureRegistry.getTexture("bonusblocks:block/fence_copper_corroded_top.png"), TextureRegistry.getTexture("bonusblocks:block/fence_copper_corroded_column.png")))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceCopperCorroded("fence.copper.corroded", blockID("fenceCopperCorroded"), Material.metal) {
                    @Override
                    public void updateTick(World world, int x, int y, int z, Random rand) {
                    }
                });


        //Copper Pressure Plate
        pressureplateCopper = raw
                .setBlockModel(block -> new BlockModelStandard<>(pressureplateCopper).withTextures("block_copper.png").withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS)
                .build(new BlockCopperPressurePlate("pressureplate.copper", blockID("pressureplateCopper"), Material.metal));
        pressureplateCopperTarnished = raw
                .setBlockModel(block -> new BlockModelStandard<>(pressureplateCopper).withTextures("block_copper_tarnished.png").withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS)
                .build(new BlockCopperTarnishedPressurePlate("pressureplate.copper.tarnished", blockID("pressureplateCopperTarnished"), Material.metal));
        pressureplateCopperCorroded = raw
                .setBlockModel(block -> new BlockModelStandard<>(pressureplateCopper).withTextures("block_copper_corroded.png").withCustomItemBounds(0.0, 0.375, 0.0, 1.0, 0.625, 1.0))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS)
                .build(new BlockCopperCorrodedPressurePlate("pressureplate.copper.corroded", blockID("pressureplateCopperCorroded"), Material.metal));


        // Steel Trapdoor
        trapdoorSteel = raw
                .setBlockModel(block -> new BlockModelTrapDoor<>(trapdoorSteel).withTextures("trapdoor_steel_top.png", "trapdoor_steel_side.png"))
                .setResistance(2000.0f)
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoor("trapdoor.steel", blockID("trapdoorSteel"), Material.metal, true));


        // Steel Doors
        doorSteelBottom = raw
                .setBlockModel(block -> new BlockModelDoor<>(doorSteelBottom).withTextures("door_steel_bottom.png"))
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
                .setBlockModel(block -> new BlockModelDoor<>(doorSteelTop).withTextures("door_steel_top.png"))
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
                .setBlockModel(block -> new BlockModelStandard<>(blockSilver).withTextures("block_silver.png"))
                .build(new Block("block.silver", blockID("blockSilver"), Material.metal));

        brickSilver = silver
                .setBlockModel(block -> new BlockModelStandard<>(brickSilver).withTextures("brick_silver.png"))
                .build(new Block("brick.silver", blockID("brickSilver"), Material.metal));

        // Silver Trapdoor
        trapdoorSilver = silver
                .setBlockModel(block -> new BlockModelTrapDoor<>(trapdoorSteel).withTextures("trapdoor_silver_top.png", "trapdoor_silver_side.png"))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoor("trapdoor.silver", blockID("trapdoorSilver"), Material.stone, false));

        // Silver Doors
        doorSilverBottom = silver
                .setBlockModel(block -> new BlockModelDoor<>(doorSteelTop).withTextures("door_silver_top.png"))
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
                .setBlockModel(block -> new BlockModelDoor<>(doorSteelTop).withTextures("door_silver_top.png"))
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
                .setBlockModel(block -> new BlockModelFenceThin<>(fenceSilver, TextureRegistry.getTexture("bonusblocks:block/fence_silver_center.png"), null, null, TextureRegistry.getTexture("bonusblocks:block/fence_silver_column.png")))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceSilver("fence.silver", blockID("fenceSilver"), Material.metal));

        // Silver Chandelier
        chandelierSilver = silver
                .setBlockModel(block -> new BlockModelCrossedSquares<>(chandelierSilver).withTextures("chandelier_silver.png"))
                .setVisualUpdateOnMetadata()
                .setLuminance(15)
                .setUseInternalLight()
                .build(new BlockChandolier("chandelier.silver", blockID("chandelierSilver")));

        // Silver Candelabra
        candelabraSilver = silver
                .setBlockModel(block -> new BlockModelCrossedSquares<>(candelabraSilver).withTextures("candelabra_silver.png"))
                .setVisualUpdateOnMetadata()
                .setLuminance(15)
                .setUseInternalLight()
                .build(new BlockVase("candelabra.silver", blockID("candelabraSilver")));

        // Silver Lantern
        lanternSilver = silver
                .setBlockModel(block -> new BlockModelCrossedSquares<>(lanternSilver).withTextures("lantern_silver.png"))
                .setVisualUpdateOnMetadata()
                .setLuminance(15)
                .setUseInternalLight()
                .build(new BlockLantern("lantern.silver", blockID("lanternSilver")));

        // Silver Vase
        vaseSilver = silver
                .setBlockModel(block -> new BlockModelCrossedSquares<>(vaseSilver).withTextures("vase_silver.png"))
                .setVisualUpdateOnMetadata()
                .build(new BlockVase("vase.silver", blockID("vaseSilver")));

        // Silver Vane
        vaneSilver = silver
                .setBlockModel(block -> new BlockModelCrossedSquares<>(vaneSilver).withTextures("vane_silver.png"))
                .setVisualUpdateOnMetadata()
                .build(new BlockVace("vane.silver", blockID("vaneSilver")));

        // Silver Chimes
        chimesSilver = silver
                .setBlockModel(block -> new BlockModelCrossedSquares<>(chimesSilver).withTextures("chimes_silver.png"))
                .setVisualUpdateOnMetadata()
                .build(new BlockChimes("chimes.silver", blockID("chimesSilver")));

        // Silver Bed
        bedSilver = silver
                .setBlockModel(BlockModelBed::new)
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockSilverBed("bed.silver", blockID("bedSilver")));

        // Silver Seat
        seatSilver = silver
                .setBlockModel(block -> new BlockModelSeat<>(seatSilver).withTextures("seat_silver_top.png", "block_silver.png", "seat_silver_side"))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockSilverSeat("seat.silver", blockID("seatSilver"), Material.metal));


        // Scorched Stone
        scorchedstone = stone
                .setHardness(0.8f)
                .setBlockModel(block -> new BlockModelStandard<>(clayBaked).withTextures("scorchedstone_top.png", "scorchedstone_bottom", "scorchedstone_sides"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.GROWS_TREES, BlockTags.GROWS_SPINIFEX, BlockTags.GROWS_FLOWERS, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
                .build(new Block("scorchedstone", blockID("scorchedstone"), Material.stone));


        // Slate Pillar
        pillarSlate = stone
                .setBlockModel(block -> new BlockModelAxisAligned<>(pillarSlate).withTextures("pillar_slate_top.png", "pillar_slate_side.png"))
                .build(new BlockAxisAligned("pillar.slate", blockID("pillarSlate"), Material.stone));


        // Polished Stones
        marblePolished = stone
                .setHardness(1.0f)
                .setBlockModel(block -> new BlockModelStandard<>(marblePolished).withTextures("polished_marble_top.png", "polished_marble_side.png"))
                .build(new Block("marble.polished", blockID("marblePolished"), Material.stone));


        // Carved Stones
        slateCarved = stone
                .setBlockModel(block -> new BlockModelStandard<>(slateCarved).withTextures("minecraft:block/polished_slate_top.png", "minecraft:block/carved_slate.png"))
                .build(new Block("slate.carved", blockID("slateCarved"), Material.stone));
        marbleCarved = stone
                .setHardness(1.0f)
                .setBlockModel(block -> new BlockModelStandard<>(marbleCarved).withTextures("polished_marble_top.png", "carved_marble.png"))
                .build(new Block("marble.carved", blockID("marbleCarved"), Material.stone));


        // Baked Clay
        clayBaked = stone
                .setHardness(3.0f)
                .setBlockModel(block -> new BlockModelStandard<>(clayBaked).withTextures("block_clay_baked.png"))
                .build(new Block("clay.baked", blockID("clayBaked"), Material.stone));


        // Obsidian Glass
        glassObsidian = obsidian
                .setBlockModel(block -> new BlockModelTransparent<>(glassObsidian, false).withTextures("glass_obsidian.png"))
                .build(new BlockGlassObsidian("glass.obsidian", blockID("glassObsidian")));
        trapdoorGlassObsidian = obsidian
                .setBlockModel(block -> new BlockModelTrapDoor<>(trapdoorGlassObsidian).withTextures("glass_obsidian.png", "trapdoor_glass_obsidian_side.png"))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoorObsidian("trapdoor.glass.obsidian", blockID("trapdoorGlassObsidian")));

        // Quartz Glass
        glassQuartz = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(0.3F)
                .setResistance(0.3F)
                .setVisualUpdateOnMetadata()
                .setUseInternalLight()
                .setBlockModel(block -> new BlockModelTransparent<>(glassQuartz, false).withTextures("glass_quartz.png"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build(new BlockGlassQuartz("glass.quartz", blockID("glassQuartz"), Material.glass));


        // Netherrack
        cobbleNetherrack = brick
                .setHardness(0.4F)
                .setResistance(0.4F)
                .setBlockModel(block -> new BlockModelStandard<>(cobbleNetherrack).withTextures("cobbled_netherrack.png"))
                .setInfiniburn()
                .build(new Block("cobble.netherrack", blockID("cobbleNetherrack"), Material.stone));

        netherrack = brick
                .setHardness(0.9F)
                .setResistance(0.9F)
                .setBlockModel(block -> new BlockModelStandard<>(netherrack).withTextures("netherrack.png"))
                .setInfiniburn()
                .build(new Block("netherrack", blockID("netherrack"), Material.stone) {
                    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                        switch (dropCause) {
                            case WORLD:
                            case EXPLOSION:
                            case PROPER_TOOL:
                                return new ItemStack[]{new ItemStack(cobbleNetherrack)};
                            case PICK_BLOCK:
                            case SILK_TOUCH:
                                return new ItemStack[]{new ItemStack(this)};
                            default:
                                return null;
                        }
                    }
                });


        // Bricks
        brickNetherrack = brick
                .setHardness(0.9f)
                .setBlockModel(block -> new BlockModelStandard<>(brickNetherrack).withTextures("brick_netherrack.png"))
                .setInfiniburn()
                .build(new Block("brick.netherrack", blockID("brickNetherrack"), Material.stone));
        brickScorchedstone = brick
                .setHardness(0.8f)
                .setBlockModel(block -> new BlockModelStandard<>(brickScorchedstone).withTextures("brick_scorchedstone.png"))
                .build(new Block("brick.scorchedstone", blockID("brickScorchedstone"), Material.stone));
        brickMud = brick
                .setHardness(1.5f)
                .setBlockModel(block -> new BlockModelStandard<>(brickMud).withTextures("brick_mud_baked.png"))
                .build(new Block("brick.mud", blockID("brickMud"), Material.stone));
        brickSteel = brick
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0F)
                .setResistance(4000.0f)
                .setBlockModel(block -> new BlockModelStandard<>(brickSteel).withTextures("brick_steel.png"))
                .build(new Block("brick.steel", blockID("brickSteel"), Material.metal));
        brickQuartz = brick
                .setHardness(3.0f)
                .setBlockModel(block -> new BlockModelStandard<>(brickQuartz).withTextures("brick_quartz.png"))
                .build(new Block("brick.quartz", blockID("brickQuartz"), Material.stone));
        brickOlivine = brick
                .setHardness(3.0f)
                .setBlockModel(block -> new BlockModelStandard<>(brickOlivine).withTextures("brick_olivine.png"))
                .build(new Block("brick.olivine", blockID("brickOlivine"), Material.stone));


        // Soulslate
        soulslate = stone
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.6f))
                .setHardness(2.0f)
                .setResistance(20.0f)
                .setBlockModel(block -> new BlockModelStandard<>(soulslate).withTextures("soulslate.png"))
                .build(new Block("soulslate", blockID("soulslate"), Material.stone));


        // Brimstone
        brimstone = stone
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.4f))
                .setHardness(200.0f)
                .setResistance(20000.0f)
                .setBlockModel(block -> new BlockModelStandard<>(brimstone).withTextures("brimstone.png"))
                .setInfiniburn()
                .build(new BlockBrimstone("brimstone", blockID("brimstone"), Material.piston));


        // Pumice
        pumiceDry = stone
                .setBlockModel(block -> new BlockModelStandard<>(brimstone).withTextures("pumice.png"))
                .build(new BlockPumice("pumice.dry", blockID("pumiceDry"), false));
        pumiceWet = stone
                .setLuminance(13)
                .setUseInternalLight()
                .setBlockModel(block -> new BlockModelStandard<>(brimstone).withTextures("pumice_molten.png").withOverbrightTexture("pumice_molten_overlay.png"))
                .build(new BlockPumice("pumice.wet", blockID("pumiceWet"), true));


        // Soul Candle
        candleSoulwax = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 1.2f))
                .setHardness(0.0f)
                .setResistance(0.0f)
                .setLuminance(10)
                .setBlockModel(block -> new BlockModelCandle<>(candleSoulwax).withTextures("minecraft:block/candle_soulwax.png"))
                .setVisualUpdateOnMetadata()
                .setBlockModel(BlockModelCandle::new)
                .setTags(BlockTags.MINEABLE_BY_SWORD, BlockTags.BROKEN_BY_FLUIDS, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockSoulCandle("candle.soulwax", blockID("candleSoulwax")));


        //Slabs
        slabWool = slab
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.8F)
                .setResistance(0.8F)
                .setFlammability(30, 60)
                .setItemBlock(ItemBlockSlabPainted::new)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockWoolSlab(wool, blockID("slabWool")));
        slabCobbleStoneMossy = slab
                .setHardness(2.0F)
                .setBlockModel(block -> new BlockModelSlab<>(cobbleStoneMossy))
                .build(new BlockSlab(cobbleStoneMossy, blockID("slabCobbleStoneMossy")));
        slabSlatePolished = slab
                .setBlockModel(block -> new BlockModelSlab<>(slatePolished))
                .build(new BlockSlab(slateCarved, blockID("slabSlatePolished")));
        slabMarblePolished = slab
                .setBlockModel(block -> new BlockModelSlab<>(marblePolished))
                .build(new BlockSlab(marbleCarved, blockID("slabMarblePolished")));
        slabBrickStonePolishedMossy = slab
                .setHardness(2.0F)
                .setBlockModel(block -> new BlockModelSlab<>(brickStonePolishedMossy))
                .build(new BlockSlab(brickStonePolishedMossy, blockID("slabBrickStonePolishedMossy")));
        slabBrickGold = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(3.0F)
                .setBlockModel(block -> new BlockModelSlab<>(brickGold))
                .build(new BlockSlab(brickGold, blockID("slabBrickGold")));
        slabBrickLapis = slab
                .setHardness(3.0F)
                .setBlockModel(block -> new BlockModelSlab<>(brickLapis))
                .build(new BlockSlab(brickLapis, blockID("slabBrickLapis")));
        slabBrickIron = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0F)
                .setBlockModel(block -> new BlockModelSlab<>(brickIron))
                .build(new BlockSlab(brickIron, blockID("slabBrickIron")));
        slabCobbleNetherrack = slab
                .setBlockModel(block -> new BlockModelSlab<>(cobbleNetherrack))
                .build(new BlockSlab(cobbleNetherrack, blockID("slabCobbleNetherrack")));
        slabCobbleNetherrackMossy = slab
                .setBlockModel(block -> new BlockModelSlab<>(netherrack))
                .build(new BlockSlab(netherrack, blockID("slabCobbleNetherrackMossy")));
        slabBrickNetherrack = slab
                .setBlockModel(block -> new BlockModelSlab<>(brickNetherrack))
                .build(new BlockSlab(brickNetherrack, blockID("slabBrickNetherrack")));
        slabBrickScorchedstone = slab
                .setHardness(0.8f)
                .setBlockModel(block -> new BlockModelSlab<>(brickScorchedstone))
                .build(new BlockSlab(brickScorchedstone, blockID("slabBrickScorchedstone")));
        slabBrickMud = slab
                .setBlockModel(block -> new BlockModelSlab<>(brickMud))
                .build(new BlockSlab(brickMud, blockID("slabBrickMud")));
        slabScorchedstone = slab
                .setHardness(0.8F)
                .setBlockModel(block -> new BlockModelSlab<>(scorchedstone))
                .build(new BlockSlab(scorchedstone, blockID("slabScorchedstone")));
        slabBrickSteel = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(4000.0f)
                .setBlockModel(block -> new BlockModelSlab<>(brickSteel))
                .build(new BlockSlab(brickSteel, blockID("slabBrickSteel")));
        slabBrickQuartz = slab
                .setHardness(3.0f)
                .setBlockModel(block -> new BlockModelSlab<>(brickQuartz))
                .build(new BlockSlab(brickQuartz, blockID("slabBrickQuartz")));
        slabBrickOlivine = slab
                .setHardness(3.0f)
                .setBlockModel(block -> new BlockModelSlab<>(brickOlivine))
                .build(new BlockSlab(brickOlivine, blockID("slabBrickOlivine")));
        slabBrickSilver = slab
                .setHardness(0.8f)
                .setResistance(2.0f)
                .setBlockModel(block -> new BlockModelSlab<>(brickSilver))
                .build(new BlockSlab(brickSilver, blockID("slabBrickSilver")));
        slabCopper = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setBlockModel(block -> new BlockModelSlab<>(blockCopper))
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
                .setBlockModel(block -> new BlockModelSlab<>(blockCopperTarnished))
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
                .setBlockModel(block -> new BlockModelSlab<>(blockCopperCorroded))
                .build(new BlockSlab(blockCopperCorroded, blockID("slabCopperCorroded")));


        // Stairs
        stairsWool = stairs
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.8F)
                .setResistance(0.8F)
                .setFlammability(30, 60)
                .setItemBlock(ItemBlockStairsPainted::new)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockWoolStairs(wool, blockID("stairsWool")));
        stairsCobbleStoneMossy = stairs
                .setHardness(2.0F)
                .setBlockModel(block -> new BlockModelStairs<>(cobbleStoneMossy))
                .build(new BlockStairs(cobbleStoneMossy, blockID("stairsCobbleStoneMossy")));
        stairsBrickStonePolishedMossy = stairs
                .setHardness(2.0F)
                .setBlockModel(block -> new BlockModelStairs<>(brickStonePolishedMossy))
                .build(new BlockStairs(brickStonePolishedMossy, blockID("stairsBrickStonePolishedMossy")));
        stairsScorchedstone = stairs
                .setHardness(0.8F)
                .setBlockModel(block -> new BlockModelStairs<>(scorchedstone))
                .build(new BlockStairs(brickSandstone, blockID("stairsScorchedstone")));
        stairsBrickGold = stairs
                .setHardness(3.0F)
                .setBlockModel(block -> new BlockModelStairs<>(brickGold))
                .build(new BlockStairs(brickGold, blockID("stairsBrickGold")));
        stairsBrickLapis = stairs
                .setHardness(3.0F)
                .setBlockModel(block -> new BlockModelStairs<>(brickLapis))
                .build(new BlockStairs(brickLapis, blockID("stairsBrickLapis")));
        stairsBrickIron = stairs
                .setHardness(5.0F)
                .setBlockModel(block -> new BlockModelStairs<>(brickIron))
                .build(new BlockStairs(brickIron, blockID("stairsBrickIron")));
        stairsCobbleNetherrack = stairs
                .setBlockModel(block -> new BlockModelStairs<>(cobbleNetherrack))
                .build(new BlockStairs(cobbleNetherrack, blockID("stairsCobbleNetherrack")));
        stairsCobbleNetherrackMossy = stairs
                .setBlockModel(block -> new BlockModelStairs<>(netherrack))
                .build(new BlockStairs(netherrack, blockID("stairsCobbleNetherrackMossy")));
        stairsBrickNetherrack = stairs
                .setBlockModel(block -> new BlockModelStairs<>(brickNetherrack))
                .build(new BlockStairs(brickNetherrack, blockID("stairsBrickNetherrack")));
        stairsBrickScorchedstone = stairs
                .setHardness(0.8f)
                .setBlockModel(block -> new BlockModelStairs<>(brickScorchedstone))
                .build(new BlockStairs(brickScorchedstone, blockID("stairsBrickScorchedstone")));
        stairsBrickMud = stairs
                .setHardness(1.5f)
                .setBlockModel(block -> new BlockModelStairs<>(brickMud))
                .build(new BlockStairs(brickMud, blockID("stairsBrickMud")));
        stairsBrickSteel = stairs
                .setHardness(5.0f)
                .setResistance(4000.0f)
                .setBlockModel(block -> new BlockModelStairs<>(brickSteel))
                .build(new BlockStairs(brickSteel, blockID("stairsBrickSteel")));
        stairsBrickQuartz = stairs
                .setHardness(3.0f)
                .setBlockModel(block -> new BlockModelStairs<>(brickQuartz))
                .build(new BlockStairs(brickQuartz, blockID("stairsBrickQuartz")));
        stairsBrickOlivine = stairs
                .setHardness(3.0f)
                .setBlockModel(block -> new BlockModelStairs<>(brickOlivine))
                .build(new BlockStairs(brickOlivine, blockID("stairsBrickOlivine")));
        stairsBrickSilver = stairs
                .setHardness(0.8f)
                .setResistance(2.0f)
                .setBlockModel(block -> new BlockModelStairs<>(brickSilver))
                .build(new BlockStairs(brickSilver, blockID("stairsBrickSilver")));
        stairsCopper = stairs
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setBlockModel(block -> new BlockModelStairs<>(blockCopper))
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
                .setBlockModel(block -> new BlockModelStairs<>(blockCopperTarnished))
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
                .setBlockModel(block -> new BlockModelStairs<>(blockCopperCorroded))
                .build(new BlockStairs(blockCopperCorroded, blockID("stairsCopperCorroded")));



        //2.2 New Stuff

        // Baked Clay Bricks
        brickClayBaked = stone
                .setBlockModel(block -> new BlockModelStandard<>(brickClayBaked).withTextures("brick_block_clay_baked.png"))
                .build(new Block("brick.clay.baked", blockID("brickClayBaked"), Material.stone));

        slabBrickClayBaked = slab
                .setBlockModel(block -> new BlockModelSlab<>(brickClayBaked))
                .build(new BlockSlab(brickClayBaked, blockID("slabBrickClayBaked")));

        stairsBrickClayBaked = stairs
                .setBlockModel(block -> new BlockModelStairs<>(brickClayBaked))
                .build(new BlockStairs(brickClayBaked, blockID("stairsBrickClayBaked")));

        // Rough Dirt
        dirtRough = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.gravel", "step.gravel", 1.0f, 0.8f))
                .setHardness(0.6f)
                .setResistance(0.6f)
                .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.CAVES_CUT_THROUGH)
                .setBlockModel(block -> new BlockModelStandard<>(dirtRough).withTextures("dirt_rough.png"))
                .build(new Block("dirt.rough", blockID("dirtRough"), Material.dirt));

        // Skull
        skullCarved = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setBlockModel(block -> new BlockModelHorizontalRotation<>(skullCarved).withTextures("skull_top.png", "skull_bottom.png", "skull_carved_idle.png", "skull_side.png", "skull_side.png", "skull_side.png"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build(new BlockRotatableHorizontal("skull.carved", blockID("skullCarved"), Material.stone) {
                });

        skullActive = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setLuminance(15)
                .setBlockModel(block -> new BlockModelHorizontalRotation<>(skullActive).withTextures("skull_top.png", "skull_bottom.png", "skull_carved_active.png", "skull_side.png", "skull_side.png", "skull_side.png"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build(new BlockRotatableHorizontal("skull.active", blockID("skullActive"), Material.stone) {
                });

        skull = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setBlockModel(block -> new BlockModelHorizontalRotation<>(skull).withTextures("skull_top.png", "skull_bottom.png", "skull_side.png"))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build(new BlockRotatableHorizontal("skull", blockID("skull"), Material.stone) {
                });


        // 2.3 New Stuff

        // Lazurite

        lazurite = stone
                .setBlockModel(block -> new BlockModelStandard<>(lazurite).withTextures("lazurite.png"))
                .setInfiniburn()
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
                .setBlockModel(block -> new BlockModelStandard<>(cobbleLazurite).withTextures("cobbled_lazurite.png"))
                .setInfiniburn()
                .build(new Block("cobble.lazurite", blockID("cobbleLazurite"), Material.stone));
        slabCobbleLazurite = slab
                .setHardness(2.0F)
                .setBlockModel(block -> new BlockModelSlab<>(cobbleLazurite))
                .build(new BlockSlab(BonusBlocks.cobbleLazurite, blockID("slabCobbleLazurite")));
        stairsCobbleLazurite = stairs
                .setHardness(2.0F)
                .setBlockModel(block -> new BlockModelStairs<>(cobbleLazurite))
                .build(new BlockStairs(BonusBlocks.cobbleLazurite, blockID("stairsCobbleLazurite")));

        brickLazurite = brick
                .setHardness(1.5f)
                .setBlockModel(block -> new BlockModelStandard<>(brickLazurite).withTextures("brick_lazurite.png"))
                .setInfiniburn()
                .build(new Block("brick.lazurite", blockID("brickLazurite"), Material.stone));
        slabBrickLazurite = slab
                .setHardness(1.5f)
                .setBlockModel(block -> new BlockModelSlab<>(brickLazurite))
                .build(new BlockSlab(BonusBlocks.brickLazurite, blockID("slabBrickLazurite")));
        stairsBrickLazurite = stairs
                .setHardness(1.5f)
                .setBlockModel(block -> new BlockModelStairs<>(brickLazurite))
                .build(new BlockStairs(BonusBlocks.brickLazurite, blockID("stairsBrickLazurite")));

        lazuritePolished = stone
                .setBlockModel(block -> new BlockModelStandard<>(lazuritePolished).withTextures("polished_lazurite_top.png", "polished_lazurite_side.png"))
                .build(new Block("lazurite.polished", blockID("lazuritePolished"), Material.stone));
        lazuriteCarved = stone
                .setBlockModel(block -> new BlockModelStandard<>(lazuriteCarved).withTextures("polished_lazurite_top.png", "carved_lazurite.png"))
                .build(new Block("lazurite.carved", blockID("lazuriteCarved"), Material.stone));
        slabLazuritePolished = slab
                .setBlockModel(block -> new BlockModelSlab<>(lazuritePolished))
                .build(new BlockSlab(lazuriteCarved, blockID("slabLazuritePolished")));


        // Peridot

        peridot = stone
                .setBlockModel(block -> new BlockModelStandard<>(peridot).withTextures("peridot.png"))
                .setInfiniburn()
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
                .setBlockModel(block -> new BlockModelStandard<>(cobblePeridot).withTextures("cobbled_peridot.png"))
                .setInfiniburn()
                .build(new Block("cobble.peridot", blockID("cobblePeridot"), Material.stone));
        slabCobblePeridot = slab
                .setHardness(2.0F)
                .setBlockModel(block -> new BlockModelSlab<>(cobblePeridot))
                .build(new BlockSlab(BonusBlocks.cobblePeridot, blockID("slabCobblePeridot")));
        stairsCobblePeridot = stairs
                .setHardness(2.0F)
                .setBlockModel(block -> new BlockModelStairs<>(cobblePeridot))
                .build(new BlockStairs(BonusBlocks.cobblePeridot, blockID("stairsCobblePeridot")));

        brickPeridot = brick
                .setHardness(1.5f)
                .setBlockModel(block -> new BlockModelStandard<>(brickPeridot).withTextures("brick_peridot.png"))
                .setInfiniburn()
                .build(new Block("brick.peridot", blockID("brickPeridot"), Material.stone));
        slabBrickPeridot = slab
                .setHardness(1.5f)
                .setBlockModel(block -> new BlockModelSlab<>(brickPeridot))
                .build(new BlockSlab(BonusBlocks.brickPeridot, blockID("slabBrickPeridot")));
        stairsBrickPeridot = stairs
                .setHardness(1.5f)
                .setBlockModel(block -> new BlockModelStairs<>(brickPeridot))
                .build(new BlockStairs(BonusBlocks.brickPeridot, blockID("stairsBrickPeridot")));

        peridotPolished = stone
                .setBlockModel(block -> new BlockModelStandard<>(peridotPolished).withTextures("polished_peridot_top.png", "polished_peridot_side.png"))
                .build(new Block("peridot.polished", blockID("peridotPolished"), Material.stone));
        peridotCarved = stone
                .setBlockModel(block -> new BlockModelStandard<>(peridotCarved).withTextures("polished_peridot_top.png", "carved_peridot.png"))
                .build(new Block("peridot.carved", blockID("peridotCarved"), Material.stone));
        slabPeridotPolished = slab
                .setBlockModel(block -> new BlockModelSlab<>(peridotPolished))
                .build(new BlockSlab(peridotCarved, blockID("slabPeridotPolished")));

        // Pot

        pot = new BlockBuilder(MOD_ID)
                .setHardness(0.5f)
                .setResistance(1.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .setBlockModel(block -> new DFBlockModelBuilder(MOD_ID).setBlockModel("block/pot.json").build(pot))
                .build(new BlockPot("pot", blockID("pot"), Material.stone));


        //2.4 New Stuff

        girderIron = raw
                .setVisualUpdateOnMetadata()
                .setBlockModel(block -> new DFBlockModelBuilder(MOD_ID).setBlockModel("block/girder.json").setBlockState(MOD_ID, "girder_states.json").setMetaStateInterpreter(new PipeMetaStateInterpreter()).build(girderIron))
                .build(new BlockGirder("girder.iron", blockID("girderIron"), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "girder.json"), false));

        fenceGold = raw
                .setBlockModel(block -> new BlockModelFenceThin<>(fenceGold, TextureRegistry.getTexture("bonusblocks:block/fence_gold_center.png"), null, TextureRegistry.getTexture("bonusblocks:block/fence_gold_top.png"), TextureRegistry.getTexture("bonusblocks:block/fence_gold_column.png")))
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceGold("fence.gold", blockID("fenceGold"), Material.metal));

/*
    bedroll = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
            .setBlockModel(BlockModelBed::new)
            .setHardness(0.2f)
            .setResistance(0.2f)
            .setTextures("bedrollfront.png")
            .setTextures("bedrolltop2.png")
            .setTextures("bedrolltop1.png")
            .setTextures("bedrollside1.png")
            .setTextures("bedrollside2.png")
            .setTextures("bedrollback.png")
            .setVisualUpdateOnMetadata()
            .setTags(BlockTags.NOT_IN_CREATIVE_MENU, BlockTags.MINEABLE_BY_AXE)
            .build(new BlockBedroll("bedroll", blockID("bedroll")));
*/


        initializeBlockDetails();
    }
}
