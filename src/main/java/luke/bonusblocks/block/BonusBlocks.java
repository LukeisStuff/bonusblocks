package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocksConfig;
import luke.bonusblocks.block.copper.*;
import luke.bonusblocks.block.silver.BlockFenceSilver;
import luke.bonusblocks.block.silver.BlockOreSilver;
import luke.bonusblocks.block.silver.BlockSilverBed;
import luke.bonusblocks.block.silver.BlockSilverSeat;
import luke.bonusblocks.item.BonusItems;
import net.minecraft.client.render.block.color.BlockColorGrass;
import net.minecraft.client.render.block.color.BlockColorLeavesOak;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.block.*;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.*;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.CreativeHelper;
import useless.dragonfly.helper.ModelHelper;
import useless.dragonfly.model.block.BlockModelDragonFly;

import java.util.Random;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;
import static net.minecraft.core.block.Block.dirt;
import static net.minecraft.core.block.BlockMoss.stoneToMossMap;

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

    public static Block flowerCyan;
    public static Block flowerPurple;
    public static Block flowerPink;
    public static Block flowerSilver;
    public static Block flowerOrange;
    public static Block flowerLightBlue;
    public static Block flowerMagenta;
    public static Block flowerLime;

    public static Block petalYellow;
    public static Block petalRed;
    public static Block petalCyan;
    public static Block petalPurple;
    public static Block petalPink;
    public static Block petalSilver;
    public static Block petalOrange;
    public static Block petalLightBlue;
    public static Block petalMagenta;
    public static Block petalLime;

    public static Block petalLayerYellow;
    public static Block petalLayerRed;
    public static Block petalLayerCyan;
    public static Block petalLayerPurple;
    public static Block petalLayerPink;
    public static Block petalLayerSilver;
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
    public static Block permafrostPolished;

    public static Block slateCarved;
    public static Block marbleCarved;
    public static Block permafrostCarved;

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

    public static Block pie;

    public static Block slabWool;
    public static Block slabCobbleStoneMossy;
    public static Block slabSlatePolished;
    public static Block slabMarblePolished;
    public static Block slabPermafrostPolished;
    public static Block slabBrickStonePolishedMossy;
    public static Block slabBrickSandstone;
    public static Block slabBrickGold;
    public static Block slabBrickIron;
    public static Block slabBrickLapis;
    public static Block slabBrickPermafrost;
    public static Block slabCobbleNetherrack;
    public static Block slabCobbleNetherrackMossy;
    public static Block slabBrickNetherrack;
    public static Block slabBrickScorchedstone;
    public static Block slabBrickMud;
    public static Block slabCobblePermafrost;
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
    public static Block stairsBrickSandstone;
    public static Block stairsBrickGold;
    public static Block stairsBrickIron;
    public static Block stairsBrickLapis;
    public static Block stairsBrickPermafrost;
    public static Block stairsCobbleNetherrack;
    public static Block stairsCobbleNetherrackMossy;
    public static Block stairsBrickNetherrack;
    public static Block stairsBrickScorchedstone;
    public static Block stairsBrickMud;
    public static Block stairsCobblePermafrost;
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

    public static Block skull;
    public static Block skullActive;


    private void initializeBlockDetails() {
        ItemToolPickaxe.miningLevels.put(blockRawIron, 1);
        ItemToolPickaxe.miningLevels.put(blockRawCopper, 1);
        ItemToolPickaxe.miningLevels.put(oreCopperStone, 1);
        ItemToolPickaxe.miningLevels.put(oreCopperBasalt, 1);
        ItemToolPickaxe.miningLevels.put(oreCopperLimestone, 1);
        ItemToolPickaxe.miningLevels.put(oreCopperGranite, 1);
        ItemToolPickaxe.miningLevels.put(blockCopper, 1);
        ItemToolPickaxe.miningLevels.put(blockCopperTarnished, 1);
        ItemToolPickaxe.miningLevels.put(blockCopperCorroded, 1);
        ItemToolPickaxe.miningLevels.put(pipeCopper, 1);
        ItemToolPickaxe.miningLevels.put(pipeCopperTarnished, 1);
        ItemToolPickaxe.miningLevels.put(pipeCopperCorroded, 1);
        ItemToolPickaxe.miningLevels.put(trapdoorCopper, 1);
        ItemToolPickaxe.miningLevels.put(trapdoorCopperTarnished, 1);
        ItemToolPickaxe.miningLevels.put(trapdoorCopperCorroded, 1);
        ItemToolPickaxe.miningLevels.put(doorCopperTop, 1);
        ItemToolPickaxe.miningLevels.put(doorCopperBottom, 1);
        ItemToolPickaxe.miningLevels.put(doorCopperTarnishedTop, 1);
        ItemToolPickaxe.miningLevels.put(doorCopperTarnishedBottom, 1);
        ItemToolPickaxe.miningLevels.put(doorCopperCorrodedBottom, 1);
        ItemToolPickaxe.miningLevels.put(doorCopperCorrodedTop, 1);
        ItemToolPickaxe.miningLevels.put(fenceCopper, 1);
        ItemToolPickaxe.miningLevels.put(fenceCopperTarnished, 1);
        ItemToolPickaxe.miningLevels.put(fenceCopperCorroded, 1);
        ItemToolPickaxe.miningLevels.put(slabCopper, 1);
        ItemToolPickaxe.miningLevels.put(slabCopperTarnished, 1);
        ItemToolPickaxe.miningLevels.put(slabCopperCorroded, 1);
        ItemToolPickaxe.miningLevels.put(pressureplateCopper, 1);
        ItemToolPickaxe.miningLevels.put(pressureplateCopperTarnished, 1);
        ItemToolPickaxe.miningLevels.put(pressureplateCopperCorroded, 1);
        ItemToolPickaxe.miningLevels.put(stairsCopper, 1);
        ItemToolPickaxe.miningLevels.put(stairsCopperTarnished, 1);
        ItemToolPickaxe.miningLevels.put(stairsCopperCorroded, 1);
        ItemToolPickaxe.miningLevels.put(slabBrickLapis, 1);
        ItemToolPickaxe.miningLevels.put(stairsBrickLapis, 1);


        ItemToolPickaxe.miningLevels.put(blockRawGold, 2);
        ItemToolPickaxe.miningLevels.put(slabBrickGold, 2);
        ItemToolPickaxe.miningLevels.put(stairsBrickGold, 2);
        ItemToolPickaxe.miningLevels.put(brickSteel, 2);
        ItemToolPickaxe.miningLevels.put(slabBrickSteel, 2);
        ItemToolPickaxe.miningLevels.put(stairsBrickSteel, 2);
        ItemToolPickaxe.miningLevels.put(trapdoorSteel, 2);
        ItemToolPickaxe.miningLevels.put(doorSteelTop, 2);
        ItemToolPickaxe.miningLevels.put(doorSteelBottom, 2);
        ItemToolPickaxe.miningLevels.put(blockCrudeSteel, 2);

        ItemToolPickaxe.miningLevels.put(blockSilver, 2);
        ItemToolPickaxe.miningLevels.put(blockRawSilver, 2);
        ItemToolPickaxe.miningLevels.put(brickSilver, 2);
        ItemToolPickaxe.miningLevels.put(oreSilverStone, 2);
        ItemToolPickaxe.miningLevels.put(oreSilverBasalt, 2);
        ItemToolPickaxe.miningLevels.put(oreSilverLimestone, 2);
        ItemToolPickaxe.miningLevels.put(oreSilverGranite, 2);
        ItemToolPickaxe.miningLevels.put(seatSilver, 2);
        ItemToolPickaxe.miningLevels.put(bedSilver, 2);
        ItemToolPickaxe.miningLevels.put(chandelierSilver, 2);
        ItemToolPickaxe.miningLevels.put(candelabraSilver, 2);
        ItemToolPickaxe.miningLevels.put(chimesSilver, 2);
        ItemToolPickaxe.miningLevels.put(vaneSilver, 2);
        ItemToolPickaxe.miningLevels.put(vaseSilver, 2);
        ItemToolPickaxe.miningLevels.put(fenceSilver, 2);
        ItemToolPickaxe.miningLevels.put(lanternSilver, 2);
        ItemToolPickaxe.miningLevels.put(doorSilverBottom, 2);
        ItemToolPickaxe.miningLevels.put(doorSilverTop, 2);
        ItemToolPickaxe.miningLevels.put(trapdoorSilver, 2);
        ItemToolPickaxe.miningLevels.put(stairsBrickSilver, 2);
        ItemToolPickaxe.miningLevels.put(slabBrickSilver, 2);


        Item.itemsList[cratePainted.id] = new ItemBlockPainted(cratePainted, false);

        stoneToMossMap.put(Block.saplingOak, BonusBlocks.saplingOakMossy);
        stoneToMossMap.put(BonusBlocks.cobbleNetherrack, Block.netherrack);
        stoneToMossMap.put(Block.mossStone, BonusBlocks.moss);
        stoneToMossMap.put(Block.mossBasalt, BonusBlocks.moss);
        stoneToMossMap.put(Block.mossLimestone, BonusBlocks.moss);
        stoneToMossMap.put(Block.mossGranite, BonusBlocks.moss);

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
        LookupFuelFurnace.instance.addFuelEntry(saplingJacaranda.id, 10);
        LookupFuelFurnace.instance.addFuelEntry(saplingMaple.id, 10);
        LookupFuelFurnace.instance.addFuelEntry(saplingOakMossy.id, 10);

        CreativeHelper.setParent(netherrack, Block.permafrost);

        CreativeHelper.setParent(cobbleNetherrack, Block.cobblePermafrost);
        CreativeHelper.setParent(Block.netherrack, Block.cobblePermafrost);

        CreativeHelper.setParent(pillarSlate, Block.pillarMarble);

        CreativeHelper.setParent(scorchedstone, Block.sandstone);

        CreativeHelper.setParent(box, Block.planksOak);

        CreativeHelper.setParent(crate, Block.trommelIdle);

        for (int color = 1; color < 17; color++) {
            CreativeHelper.setParent(cratePainted, color - 1, Block.trommelIdle, 0);
        }

        CreativeHelper.setParent(bookshelfEmptyPlanksOak, Block.bookshelfPlanksOak);

        CreativeHelper.setParent(moss, Block.mossGranite);

        CreativeHelper.setParent(Block.stoneCarved, Block.pillarMarble);
        CreativeHelper.setParent(Block.basaltCarved, Block.pillarMarble);
        CreativeHelper.setParent(Block.limestoneCarved, Block.pillarMarble);
        CreativeHelper.setParent(Block.graniteCarved, Block.pillarMarble);
        CreativeHelper.setParent(Block.capstoneMarble, Block.pillarMarble);
        CreativeHelper.setParent(marbleCarved, Block.pillarMarble);
        CreativeHelper.setParent(slateCarved, Block.pillarMarble);
        CreativeHelper.setParent(permafrostCarved, Block.pillarMarble);

        CreativeHelper.setParent(overgrownGrass, Block.grassScorched);
        CreativeHelper.setParent(overgrownGrassRetro, Block.grassScorched);
        CreativeHelper.setParent(overgrownGrassScorched, Block.grassScorched);
        CreativeHelper.setParent(overgrownPath, Block.pathDirt);

        CreativeHelper.setParent(dirtRough, dirt);

        CreativeHelper.setParent(skull, Block.pumpkinCarvedActive);
        CreativeHelper.setParent(skullActive, Block.pumpkinCarvedActive);

        CreativeHelper.setParent(glassObsidian, Block.glass);
        CreativeHelper.setParent(glassQuartz, Block.glassTinted);

        CreativeHelper.setParent(trapdoorGlassObsidian, Block.trapdoorGlass);
        CreativeHelper.setParent(trapdoorSteel, Block.trapdoorGlass);
        CreativeHelper.setParent(trapdoorCopper, Block.trapdoorGlass);
        CreativeHelper.setParent(trapdoorCopperTarnished, Block.trapdoorGlass);
        CreativeHelper.setParent(trapdoorCopperCorroded, Block.trapdoorGlass);
        CreativeHelper.setParent(trapdoorSilver, Block.trapdoorGlass);

        CreativeHelper.setParent(flowerCyan, Block.flowerRed);
        CreativeHelper.setParent(flowerPurple, Block.flowerRed);
        CreativeHelper.setParent(flowerPink, Block.flowerRed);
        CreativeHelper.setParent(flowerSilver, Block.flowerRed);
        CreativeHelper.setParent(flowerOrange, Block.flowerRed);
        CreativeHelper.setParent(flowerLightBlue, Block.flowerRed);
        CreativeHelper.setParent(flowerMagenta, Block.flowerRed);
        CreativeHelper.setParent(flowerLime, Block.flowerRed);

        CreativeHelper.setParent(petalYellow, Block.flowerRed);
        CreativeHelper.setParent(petalRed, Block.flowerRed);
        CreativeHelper.setParent(petalCyan, Block.flowerRed);
        CreativeHelper.setParent(petalPurple, Block.flowerRed);
        CreativeHelper.setParent(petalPink, Block.flowerRed);
        CreativeHelper.setParent(petalSilver, Block.flowerRed);
        CreativeHelper.setParent(petalOrange, Block.flowerRed);
        CreativeHelper.setParent(petalLightBlue, Block.flowerRed);
        CreativeHelper.setParent(petalMagenta, Block.flowerRed);
        CreativeHelper.setParent(petalLime, Block.flowerRed);

        CreativeHelper.setParent(petalLayerYellow, Block.flowerRed);
        CreativeHelper.setParent(petalLayerRed, Block.flowerRed);
        CreativeHelper.setParent(petalLayerCyan, Block.flowerRed);
        CreativeHelper.setParent(petalLayerPurple, Block.flowerRed);
        CreativeHelper.setParent(petalLayerPink, Block.flowerRed);
        CreativeHelper.setParent(petalLayerSilver, Block.flowerRed);
        CreativeHelper.setParent(petalLayerOrange, Block.flowerRed);
        CreativeHelper.setParent(petalLayerLightBlue, Block.flowerRed);
        CreativeHelper.setParent(petalLayerMagenta, Block.flowerRed);
        CreativeHelper.setParent(petalLayerLime, Block.flowerRed);

        CreativeHelper.setParent(mushroomGray, Block.mushroomRed);

        CreativeHelper.setParent(fungiBrown, Block.mushroomRed);
        CreativeHelper.setParent(fungiRed, Block.mushroomRed);
        CreativeHelper.setParent(fungiGray, Block.mushroomRed);

        CreativeHelper.setParent(logShrub, Block.logOakMossy);
        CreativeHelper.setParent(logCacao, Block.logOakMossy);
        CreativeHelper.setParent(logMaple, Block.logOakMossy);
        CreativeHelper.setParent(logJacaranda, Block.logOakMossy);
        CreativeHelper.setParent(logScorched, Block.logOakMossy);

        CreativeHelper.setParent(leavesOakMossy, Block.leavesCacao);
        CreativeHelper.setParent(leavesMaple, Block.leavesCacao);
        CreativeHelper.setParent(leavesJacaranda, Block.leavesCacao);
        CreativeHelper.setParent(branch, Block.leavesCacao);

        CreativeHelper.setParent(saplingOakMossy, Block.saplingCacao);
        CreativeHelper.setParent(saplingMaple, Block.saplingCacao);
        CreativeHelper.setParent(saplingJacaranda, Block.saplingCacao);

        CreativeHelper.setParent(oreCopperStone, Block.oreIronGranite);
        CreativeHelper.setParent(oreCopperBasalt, Block.oreIronGranite);
        CreativeHelper.setParent(oreCopperLimestone, Block.oreIronGranite);
        CreativeHelper.setParent(oreCopperGranite, Block.oreIronGranite);

        CreativeHelper.setParent(oreSilverStone, Block.oreGoldGranite);
        CreativeHelper.setParent(oreSilverBasalt, Block.oreGoldGranite);
        CreativeHelper.setParent(oreSilverLimestone, Block.oreGoldGranite);
        CreativeHelper.setParent(oreSilverGranite, Block.oreGoldGranite);

        CreativeHelper.setParent(pumiceDry, Block.spongeWet);
        CreativeHelper.setParent(pumiceWet, Block.spongeWet);

        CreativeHelper.setParent(brimstone, Block.bedrock);

        CreativeHelper.setParent(clayBaked, Block.blockClay);

        CreativeHelper.setParent(blockSulphur, Block.gravel);
        CreativeHelper.setParent(blockSugar, Block.gravel);

        CreativeHelper.setParent(brickNetherrack, Block.brickIron);
        CreativeHelper.setParent(brickScorchedstone, Block.brickIron);
        CreativeHelper.setParent(brickMud, Block.brickIron);
        CreativeHelper.setParent(brickSteel, Block.brickIron);
        CreativeHelper.setParent(brickQuartz, Block.brickIron);
        CreativeHelper.setParent(brickOlivine, Block.brickIron);
        CreativeHelper.setParent(brickSilver, Block.brickIron);
        CreativeHelper.setParent(brickClayBaked, Block.brickIron);

        CreativeHelper.setParent(fenceCopper, Block.fenceChainlink);
        CreativeHelper.setParent(fenceCopperTarnished, Block.fenceChainlink);
        CreativeHelper.setParent(fenceCopperCorroded, Block.fenceChainlink);
        CreativeHelper.setParent(fenceSilver, Block.fenceChainlink);

        CreativeHelper.setParent(pressureplateCopper, Block.pressureplateCobbleStone);
        CreativeHelper.setParent(pressureplateCopperTarnished, Block.pressureplateCobbleStone);
        CreativeHelper.setParent(pressureplateCopperCorroded, Block.pressureplateCobbleStone);

        CreativeHelper.setParent(meshCopper, Block.mesh);
        CreativeHelper.setParent(meshCopperTarnished, Block.mesh);
        CreativeHelper.setParent(meshCopperCorroded, Block.mesh);

        CreativeHelper.setParent(marblePolished, Block.slatePolished);
        CreativeHelper.setParent(permafrostPolished, Block.slatePolished);

        CreativeHelper.setParent(soulslate, Block.soulsand);

        CreativeHelper.setParent(blockBone, Block.blockCharcoal);
        CreativeHelper.setParent(thatch, Block.blockCharcoal);
        CreativeHelper.setParent(blockCloth, Block.blockCharcoal);
        CreativeHelper.setParent(blockSlime, Block.blockCharcoal);
        CreativeHelper.setParent(blockLeather, Block.blockCharcoal);
        CreativeHelper.setParent(blockWicker, Block.blockCharcoal);
        CreativeHelper.setParent(blockRawGold, Block.blockCharcoal);
        CreativeHelper.setParent(blockRawIron, Block.blockCharcoal);
        CreativeHelper.setParent(blockRawCopper, Block.blockCharcoal);
        CreativeHelper.setParent(blockRawCopperTarnished, Block.blockCharcoal);
        CreativeHelper.setParent(blockRawCopperCorroded, Block.blockCharcoal);
        CreativeHelper.setParent(blockRawSilver, Block.blockCharcoal);
        CreativeHelper.setParent(blockFlint, Block.blockCharcoal);
        CreativeHelper.setParent(blockCrudeSteel, Block.blockCharcoal);
        CreativeHelper.setParent(blockCopper, Block.blockCharcoal);
        CreativeHelper.setParent(blockCopperTarnished, Block.blockCharcoal);
        CreativeHelper.setParent(blockCopperCorroded, Block.blockCharcoal);
        CreativeHelper.setParent(blockSilver, Block.blockCharcoal);

        CreativeHelper.setParent(slabCobbleStoneMossy, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabSlatePolished, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabMarblePolished, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabPermafrostPolished, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabBrickStonePolishedMossy, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabBrickSandstone, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabBrickGold, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabBrickIron, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabBrickLapis, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabBrickPermafrost, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabCobbleNetherrack, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabCobbleNetherrackMossy, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabCobblePermafrost, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabScorchedstone, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabBrickNetherrack, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabBrickScorchedstone, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabBrickMud, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabBrickSteel, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabBrickQuartz, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabBrickOlivine, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabBrickSilver, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabCopper, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabCopperTarnished, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabCopperCorroded, Block.slabBasaltPolished);
        CreativeHelper.setParent(slabBrickClayBaked, Block.slabBasaltPolished);
        for (int color = 0; color < 16; color++) {
            CreativeHelper.setParent(slabWool, color << 4, Block.slabBasaltPolished, 0);
        }

        CreativeHelper.setParent(stairsCobbleStoneMossy, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsBrickStonePolishedMossy, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsBrickSandstone, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsBrickGold, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsBrickIron, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsBrickLapis, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsBrickPermafrost, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsCobbleNetherrack, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsCobbleNetherrackMossy, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsCobblePermafrost, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsBrickNetherrack, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsBrickScorchedstone, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsBrickMud, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsBrickSteel, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsBrickQuartz, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsBrickOlivine, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsBrickSilver, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsCopper, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsCopperTarnished, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsCopperCorroded, Block.stairsBrickStone);
        CreativeHelper.setParent(stairsBrickClayBaked, Block.stairsBrickStone);
        for (int color = 0; color < 16; color++) {
            CreativeHelper.setParent(stairsWool, color << 4, Block.stairsBrickStone, 0);
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
                .setBlockModel(new BlockModelRenderBlocks(1))
                .setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR);

        BlockBuilder log = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
                .setHardness(2.0F)
                .setResistance(1.0f)
                .setFlammability(5, 5)
                .setBlockModel(new BlockModelRenderBlocks(27))
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
                .setBlockModel(new BlockModelRenderBlocks(1))
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
                .setBlockModel(new BlockModelRenderBlocks(29))
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
                .setHardness(1.0f)
                .setResistance(10.0f)
                .setTags(BlockTags.MINEABLE_BY_PICKAXE);

        BlockBuilder obsidian = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(5.0f)
                .setResistance(1000.0f)
                .setTextures("obsidianglass.png")
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
                .setBlockModel(new BlockModelRenderBlocks(10))
                .setTags(BlockTags.MINEABLE_BY_PICKAXE);



        /// Blocks

        // Box
        box = boxes
                .setTextures("box.png")
                .build(new Block("box", blockID("box"), Material.wood));

        // Crates
        crate = crates
                .setTextures("crate.png")
                .build(new Block("crate", blockID("crate"), Material.wood));
        cratePainted = crates
                .setTextures("whitecrate.png").setTextures("silvercrate.png").setTextures("graycrate.png").setTextures("blackcrate.png").setTextures("redcrate.png").setTextures("orangecrate.png").setTextures("yellowcrate.png").setTextures("limecrate.png")
                .setTextures("greencrate.png").setTextures("cyancrate.png").setTextures("lightbluecrate.png").setTextures("bluecrate.png").setTextures("purplecrate.png").setTextures("magentacrate.png").setTextures("pinkcrate.png").setTextures("browncrate.png")
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockPaintedCrate("crate.painted", blockID("cratePainted")));


        // Bookshelf
        bookshelfEmptyPlanksOak = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 0.8f))
                .setHardness(1.5f)
                .setResistance(1.0f)
                .setTopBottomTexture(4, 0)
                .setSideTextures("emptybookshelf.png")
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
                .build(new Block("bookshelf.empty.planks.oak", blockID("bookshelfEmptyPlanksOak"), Material.wood));

        // Leaves and Branch
        branch = leaves
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 0.5f))
                .setTextures("branch.png")
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
                .build(new BlockBranch("branch", blockID("branch"), Material.leaves));

        leavesOakMossy = leaves
                .setBlockColor(new BlockColorLeavesOak())
                .setSideTextures("mossyleaves.png")
                .setBottomTexture("mossyleavesfast.png")
                .setTopBottomTexture("mossyleaves.png")
                .build(new BlockLeavesBase("leaves.oak.mossy", blockID("leavesOakMossy"), Material.leaves, true) {
                    @Override
                    protected Block getSapling() {
                        return BonusBlocks.saplingOakMossy;
                    }
                });
        leavesMaple = leaves
                .setSideTextures("mapleleaves.png")
                .setBottomTexture("mapleleavesfast.png")
                .setTopBottomTexture("mapleleaves.png")
                .build(new BlockLeavesBase("leaves.maple", blockID("leavesMaple"), Material.leaves, true) {
                    @Override
                    protected Block getSapling() {
                        return BonusBlocks.saplingMaple;
                    }
                });
        leavesJacaranda = leaves
                .setSideTextures("jacaleaves.png")
                .setBottomTexture("jacaleavesfast.png")
                .setTopBottomTexture("jacaleaves.png")
                .build(new BlockLeavesBase("leaves.jacaranda", blockID("leavesJacaranda"), Material.leaves, true) {
                    @Override
                    protected Block getSapling() {
                        return BonusBlocks.saplingJacaranda;
                    }
                });


        // Saplings
        saplingMaple = sapling
                .setTextures("maplesapling.png")
                .build(new BlockSaplingMaple("sapling.maple", blockID("saplingMaple")));
        saplingJacaranda = sapling
                .setTextures("jacasapling.png")
                .build(new BlockSaplingJacaranda("sapling.jacaranda", blockID("saplingJacaranda")));
        saplingOakMossy = sapling
                .setTextures("mossyoaksapling.png")
                .build(new BlockSaplingMossyOak("sapling.oak.mossy", blockID("saplingOakMossy")));


        // Logs
        logShrub = log
                .setTopBottomTexture("shrublogtop.png")
                .setSideTextures("shrublogside.png")
                .build(new BlockLog("log.shrub", blockID("logShrub")));
        logCacao = log
                .setTopBottomTexture("cacaologtop.png")
                .setSideTextures("cacaologside.png")
                .build(new BlockLog("log.cacao", blockID("logCacao")));
        logMaple = log
                .setTopBottomTexture("maplelogtop.png")
                .setSideTextures("maplelogside.png")
                .build(new BlockLog("log.maple", blockID("logMaple")));
        logJacaranda = log
                .setTopBottomTexture("jacalogtop.png")
                .setSideTextures("jacalogside.png")
                .build(new BlockLog("log.jacaranda", blockID("logJacaranda")));
        logScorched = log
                .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.2f))
                .setHardness(1.8f)
                .setTopBottomTexture("charredlogtop.png")
                .setSideTextures("charredlogside.png")
                .build(new BlockLog("log.scorched", blockID("logScorched")));


        // Moss
        moss = grass
                .setFlammability(100, 30)
                .setTextures("moss.png")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
                .build(new BlockMossy("moss", blockID("moss"), Material.grass));


        // Overgrown Grass
        overgrownGrass = grass
                .setTextures(0, 0)
                .setBlockColor(new BlockColorGrass())
                .build(new Block("grass.overgrown", blockID("overgrownGrass"), Material.grass));
        overgrownGrassRetro = grass
                .setTextures(8, 1)
                .build(new Block("grass.retro.overgrown", blockID("overgrownGrassRetro"), Material.grass));
        overgrownGrassScorched = grass
                .setTextures(16, 11)
                .build(new Block("grass.scorched.overgrown", blockID("overgrownGrassScorched"), Material.grass));
        overgrownPath = grass
                .setTextures(4, 6)
                .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                .setBlockDrop(BonusBlocks.overgrownPath)
                .build(new BlockDirtPath("path.overgrown", blockID("overgrownPath")));

        // Flowers
        flowerCyan = flower
                .setTextures("bluebell.png")
                .build(new BlockFlower("flower.cyan", blockID("flowerCyan")));
        flowerPurple = flower
                .setTextures("heather.png")
                .build(new BlockFlower("flower.purple", blockID("flowerPurple")));
        flowerPink = flower
                .setTextures("orchid.png")
                .build(new BlockFlower("flower.pink", blockID("flowerPink")));
        flowerSilver = flower
                .setTextures("whitedandelion.png")
                .build(new BlockFlower("flower.silver", blockID("flowerSilver")));
        flowerOrange = flower
                .setTextures("gladiola.png")
                .build(new BlockFlower("flower.orange", blockID("flowerOrange")));
        flowerLightBlue = flower
                .setTextures("pansy.png")
                .build(new BlockFlower("flower.lightblue", blockID("flowerLightBlue")));
        flowerMagenta = flower
                .setTextures("hyacinth.png")
                .build(new BlockFlower("flower.magenta", blockID("flowerMagenta")));
        flowerLime = flower
                .setTextures("clovers.png")
                .build(new BlockFlower("flower.lime", blockID("flowerLime")));

        // Petals
        petalYellow = petal
                .setTextures("yellowpetal.png")
                .build(new BlockPetal("petal.yellow", blockID("petalYellow"), Material.grass));
        petalRed = petal
                .setTextures("redpetal.png")
                .build(new BlockPetal("petal.red", blockID("petalRed"), Material.grass));
        petalCyan = petal
                .setTextures("cyanpetal.png")
                .build(new BlockPetal("petal.cyan", blockID("petalCyan"), Material.grass));
        petalPurple = petal
                .setTextures("purplepetal.png")
                .build(new BlockPetal("petal.purple", blockID("petalPurple"), Material.grass));
        petalPink = petal
                .setTextures("pinkpetal.png")
                .build(new BlockPetal("petal.pink", blockID("petalPink"), Material.grass));
        petalSilver = petal
                .setTextures("silverpetal.png")
                .build(new BlockPetal("petal.silver", blockID("petalSilver"), Material.grass));
        petalOrange = petal
                .setTextures("orangepetal.png")
                .build(new BlockPetal("petal.orange", blockID("petalOrange"), Material.grass));
        petalLightBlue = petal
                .setTextures("lightbluepetal.png")
                .build(new BlockPetal("petal.lightblue", blockID("petalLightBlue"), Material.grass));
        petalMagenta = petal
                .setTextures("magentapetal.png")
                .build(new BlockPetal("petal.magenta", blockID("petalMagenta"), Material.grass));
        petalLime = petal
                .setTextures("limepetal.png")
                .build(new BlockPetal("petal.lime", blockID("petalLime"), Material.grass));

        // Petal Layers
        petalLayerYellow = petalLayer
                .setTextures("yellowpetallayer.png")
                .build(new BlockLayerPetal("layer.petal.yellow", blockID("petalLayerYellow"), Material.grass));
        petalLayerRed = petalLayer
                .setTextures("redpetallayer.png")
                .build(new BlockLayerPetal("layer.petal.red", blockID("petalLayerRed"), Material.grass));
        petalLayerCyan = petalLayer
                .setTextures("cyanpetallayer.png")
                .build(new BlockLayerPetal("layer.petal.cyan", blockID("petalLayerCyan"), Material.grass));
        petalLayerPurple = petalLayer
                .setTextures("purplepetallayer.png")
                .build(new BlockLayerPetal("layer.petal.purple", blockID("petalLayerPurple"), Material.grass));
        petalLayerPink = petalLayer
                .setTextures("pinkpetallayer.png")
                .build(new BlockLayerPetal("layer.petal.pink", blockID("petalLayerPink"), Material.grass));
        petalLayerSilver = petalLayer
                .setTextures("silverpetallayer.png")
                .build(new BlockLayerPetal("layer.petal.silver", blockID("petalLayerSilver"), Material.grass));
        petalLayerOrange = petalLayer
                .setTextures("orangepetallayer.png")
                .build(new BlockLayerPetal("layer.petal.orange", blockID("petalLayerOrange"), Material.grass));
        petalLayerLightBlue = petalLayer
                .setTextures("lightbluepetallayer.png")
                .build(new BlockLayerPetal("layer.petal.lightblue", blockID("petalLayerLightBlue"), Material.grass));
        petalLayerMagenta = petalLayer
                .setTextures("magentapetallayer.png")
                .build(new BlockLayerPetal("layer.petal.magenta", blockID("petalLayerMagenta"), Material.grass));
        petalLayerLime = petalLayer
                .setTextures("limepetallayer.png")
                .build(new BlockLayerPetal("layer.petal.lime", blockID("petalLayerLime"), Material.grass));

        // Mushroom
        mushroomGray = flower
                .setTextures("shroom.png")
                .build(new BlockMushroom("mushroom.gray", blockID("mushroomGray")));

        // Mushroom Blocks
        fungiBrown = grass
                .setLuminance(2)
                .setTextures("brownmushroom.png")
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build(new Block("block.mushroom.brown", blockID("fungiBrown"), Material.dirt));
        fungiRed = grass
                .setTextures("redmushroom.png")
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build(new Block("block.mushroom.red", blockID("fungiRed"), Material.dirt));
        fungiGray = grass
                .setTextures("graymushroom.png")
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                .build(new Block("block.mushroom.gray", blockID("fungiGray"), Material.dirt));

        // Bone Block
        blockBone = stone
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setSideTextures("boneside.png")
                .setTopBottomTexture("bonetop.png")
                .setBlockModel(new BlockModelRenderBlocks(27))
                .build(new BlockAxisAligned("block.bone", blockID("blockBone"), Material.stone));

        // Thatch
        thatch = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 0.6f, 1.2f))
                .setHardness(0.6f)
                .setResistance(0.6f)
                .setSideTextures("thatchside.png")
                .setTopBottomTexture("thatchtop.png")
                .setFlammability(60, 120)
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
                .build(new BlockThatch("thatch", blockID("thatch"), Material.grass));

        // Cloth Block
        blockCloth = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.8f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setTextures("clothblock.png")
                .setFlammability(30, 60)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.MINEABLE_BY_AXE)
                .build(new BlockCloth("block.cloth", blockID("blockCloth"), Material.cloth));

        // Slime Block
        blockSlime = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.5f))
                .setHardness(0.2f)
                .setResistance(0.2f)
                .setLightOpacity(6)
                .setTextures("slimeblock.png")
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build(new BlockSlime("block.slime", blockID("blockSlime"), false));

        // Sulphur Block
        blockSulphur = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                .setHardness(0.5f)
                .setResistance(0.5f)
                .setTextures("sulphurblock.png")
                .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                .build(new BlockSulphur("block.sulphur", blockID("blockSulphur"), Material.explosive));

        // Sugar Block
        blockSugar = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                .setHardness(0.3f)
                .setResistance(0.3f)
                .setTextures("sugarblock.png")
                .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.BROKEN_BY_FLUIDS)
                .build(new BlockSand("block.sugar", blockID("blockSugar")));

        // Leather Block
        blockLeather = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.6f))
                .setHardness(0.8f)
                .setResistance(0.8f)
                .setTextures("leatherblock.png")
                .setFlammability(5, 10)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build(new Block("block.leather", blockID("blockLeather"), Material.cloth));

        // Wicker Block
        blockWicker = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.5f)
                .setResistance(0.5f)
                .setTextures(4, 9)
                .setFlammability(60, 120)
                .setTags(BlockTags.MINEABLE_BY_AXE)
                .build(new Block("block.wicker", blockID("blockWicker"), Material.cloth));

        // Flint Block
        blockFlint = raw
                .setTextures("flintblock.png")
                .setInfiniburn()
                .build(new Block("block.flint", blockID("blockFlint"), Material.stone));

        // Crude Steel Block
        blockCrudeSteel = raw
                .setHardness(4.0f)
                .setResistance(1000.0f)
                .setTextures("crudesteel.png")
                .build(new Block("block.steel.crude", blockID("blockCrudeSteel"), Material.metal));

        // Raw Blocks
        blockRawIron = raw
                .setTextures("rawiron.png")
                .build(new Block("block.raw.iron", blockID("blockRawIron"), Material.metal));
        blockRawGold = raw
                .setTextures("rawgold.png")
                .build(new Block("block.raw.gold", blockID("blockRawGold"), Material.metal));
        blockRawCopper = raw
                .setTextures("rawcopper.png")
                .setTicking(true)
                .build(new Block("block.raw.copper", blockID("blockRawCopper"), Material.metal) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (world.getBlockMetadata(x, y, z) == 0) {
                            if (rand.nextInt(200) == 0) {
                                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.blockRawCopperTarnished.id, world.getBlockMetadata(x, y, z));
                                }
                            }
                        }
                    }
                });
        blockRawCopperTarnished = raw
                .setTextures("rawtarnishedcopper.png")
                .setTicking(true)
                .build(new Block("block.raw.copper.tarnished", blockID("blockRawCopperTarnished"), Material.metal) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (world.getBlockMetadata(x, y, z) == 0) {
                            if (rand.nextInt(200) == 0) {
                                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.blockRawCopperCorroded.id, world.getBlockMetadata(x, y, z));
                                }
                            }
                        }
                    }
                });
        blockRawCopperCorroded = raw
                .setTextures("rawcorrodedcopper.png")
                .build(new Block("block.raw.copper.corroded", blockID("blockRawCopperCorroded"), Material.metal));
        blockRawSilver = silver
                .setTextures("rawsilver.png")
                .build(new Block("block.raw.silver", blockID("blockRawSilver"), Material.metal));

        // Nuggets
        overlayRawIron = pebble
                .setTextures("ironpebble1.png")
                .setTextures("ironpebble2.png")
                .setTextures("ironpebble3.png")
                .build(new BlockOverlayRawIron("overlay.iron", blockID("overlayRawIron"), Material.metal));
        overlayRawGold = pebble
                .setTextures("goldpebble1.png")
                .setTextures("goldpebble2.png")
                .setTextures("goldpebble3.png")
                .build(new BlockOverlayRawGold("overlay.gold", blockID("overlayRawGold"), Material.metal));
        overlayRawCopper = pebble
                .setTextures("copperpebble1.png")
                .setTextures("copperpebble2.png")
                .setTextures("copperpebble3.png")
                .build(new BlockOverlayRawCopper("overlay.copper", blockID("overlayRawCopper"), Material.metal));
        overlayRawSilver = pebble
                .setTextures("silverpebble1.png")
                .setTextures("silverpebble2.png")
                .setTextures("silverpebble3.png")
                .build(new BlockOverlayRawSilver("overlay.silver", blockID("overlayRawSilver"), Material.metal));

        // Copper Ores
        oreCopperStone = ore
                .setTextures("copperstone.png")
                .build(new BlockOreCopper("ore.copper.stone", blockID("oreCopperStone")));
        oreCopperBasalt = ore
                .setTextures("copperbasalt.png")
                .build(new BlockOreCopper("ore.copper.basalt", blockID("oreCopperBasalt")));
        oreCopperLimestone = ore
                .setTextures("copperlimestone.png")
                .build(new BlockOreCopper("ore.copper.limestone", blockID("oreCopperLimestone")));
        oreCopperGranite = ore
                .setTextures("coppergranite.png")
                .build(new BlockOreCopper("ore.copper.granite", blockID("oreCopperGranite")));

        oreSilverStone = ore
                .setTextures("silverstone.png")
                .build(new BlockOreSilver("ore.silver.stone", blockID("oreSilverStone")));
        oreSilverBasalt = ore
                .setTextures("silverbasalt.png")
                .build(new BlockOreSilver("ore.silver.basalt", blockID("oreSilverBasalt")));
        oreSilverLimestone = ore
                .setTextures("silverlimestone.png")
                .build(new BlockOreSilver("ore.silver.limestone", blockID("oreSilverLimestone")));
        oreSilverGranite = ore
                .setTextures("silvergranite.png")
                .build(new BlockOreSilver("ore.silver.granite", blockID("oreSilverGranite")));


        // Copper Blocks
        blockCopper = raw
                .setTextures("copperblock.png")
                .setTicking(true)
                .build(new Block("block.copper", blockID("blockCopper"), Material.metal) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (world.getBlockMetadata(x, y, z) == 0) {
                            if (rand.nextInt(200) == 0) {
                                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.blockCopperTarnished.id, world.getBlockMetadata(x, y, z));
                                }
                            }
                        }
                    }
                });
        blockCopperTarnished = raw
                .setTextures("tarnishedcopperblock.png")
                .setTicking(true)
                .build(new Block("block.copper.tarnished", blockID("blockCopperTarnished"), Material.metal) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (world.getBlockMetadata(x, y, z) == 0) {
                            if (rand.nextInt(200) == 0) {
                                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.blockCopperCorroded.id, world.getBlockMetadata(x, y, z));
                                }
                            }
                        }
                    }
                });
        blockCopperCorroded = raw
                .setTextures("corrodedcopperblock.png")
                .build(new Block("block.copper.corroded", blockID("blockCopperCorroded"), Material.metal));


        // Copper Mesh
        meshCopper = raw
                .setTextures("coppergrate.png")
                .setTicking(true)
                .build(new BlockTransparent("mesh.copper", blockID("meshCopper"), Material.metal, true) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (world.getBlockMetadata(x, y, z) == 0) {
                            if (rand.nextInt(200) == 0) {
                                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.meshCopperTarnished.id, world.getBlockMetadata(x, y, z));
                                }
                            }
                        }
                    }
                });
        meshCopperTarnished = raw
                .setTextures("tarnishedcoppergrate.png")
                .setTicking(true)
                .build(new BlockTransparent("mesh.copper.tarnished", blockID("meshCopperTarnished"), Material.metal, true) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (world.getBlockMetadata(x, y, z) == 0) {
                            if (rand.nextInt(200) == 0) {
                                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.meshCopperCorroded.id, world.getBlockMetadata(x, y, z));
                                }
                            }
                        }
                    }
                });
        meshCopperCorroded = raw
                .setTextures("corrodedcoppergrate.png")
                .build(new BlockTransparent("mesh.copper.corroded", blockID("meshCopperCorroded"), Material.metal, true) {
                });


        // Copper Pipe
        pipeCopper = raw
                .setTextures("copperpipe.png")
                .setVisualUpdateOnMetadata()
                .setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "pipe.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "pipe_states.json"), new PipeMetaStateInterpreter(), false, 0.25f))
                .build(new BlockCopperPipe("pipe.copper", blockID("pipeCopper"), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "pipe.json"), false));

        pipeCopperTarnished = raw
                .setTextures("tarnishedcopperpipe.png")
                .setVisualUpdateOnMetadata()
                .setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "tarnishedpipe.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "tarnished_pipe_states.json"), new PipeMetaStateInterpreter(), false, 0.25f))
                .build(new BlockCopperPipe("pipe.copper.tarnished", blockID("pipeCopperTarnished"), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "tarnishedpipe.json"), false) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (world.getBlockMetadata(x, y, z) == 0) {
                            if (rand.nextInt(200) == 0) {
                                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.pipeCopperCorroded.id, world.getBlockMetadata(x, y, z));
                                }
                            }
                        }
                    }
                });

        pipeCopperCorroded = raw
                .setTextures("corrodedcopperpipe.png")
                .setVisualUpdateOnMetadata()
                .setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "corrodedpipe.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "corroded_pipe_states.json"), new PipeMetaStateInterpreter(), false, 0.25f))
                .build(new BlockCopperPipe("pipe.copper.corroded", blockID("pipeCopperCorroded"), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "corrodedpipe.json"), false) {
                    @Override
                    public void updateTick(World world, int x, int y, int z, Random rand) {
                    }
                });


        // Copper Trapdoor
        trapdoorCopper = raw
                .setBlockModel(new BlockModelRenderBlocks(30))
                .setTopBottomTexture("coppertrapdoortop.png")
                .setSideTextures("coppertrapdoorside.png")
                .setVisualUpdateOnMetadata()
                .setTicking(true)
                .build(new BlockTrapDoor("trapdoor.copper", blockID("trapdoorCopper"), Material.stone, false) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (world.getBlockMetadata(x, y, z) == 0) {
                            if (rand.nextInt(200) == 0) {
                                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.trapdoorCopperTarnished.id, world.getBlockMetadata(x, y, z));
                                }
                            }
                        }
                    }
                });
        trapdoorCopperTarnished = raw
                .setBlockModel(new BlockModelRenderBlocks(30))
                .setTopBottomTexture("tarnishedcoppertrapdoortop.png")
                .setSideTextures("tarnishedcoppertrapdoorside.png")
                .setVisualUpdateOnMetadata()
                .setTicking(true)
                .build(new BlockTrapDoor("trapdoor.copper.tarnished", blockID("trapdoorCopperTarnished"), Material.stone, false) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (world.getBlockMetadata(x, y, z) == 0) {
                            if (rand.nextInt(200) == 0) {
                                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.trapdoorCopperCorroded.id, world.getBlockMetadata(x, y, z));
                                }
                            }
                        }
                    }
                });
        trapdoorCopperCorroded = raw
                .setBlockModel(new BlockModelRenderBlocks(30))
                .setTopBottomTexture("corrodedcoppertrapdoortop.png")
                .setSideTextures("corrodedcoppertrapdoorside.png")
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoor("trapdoor.copper.corroded", blockID("trapdoorCopperCorroded"), Material.stone, false));


        // Copper Doors
        doorCopperBottom = raw
                .setBlockModel(new BlockModelRenderBlocks(7))
                .setTextures("copperdoorbottom.png")
                .setTopBottomTexture("coppertrapdoortop.png")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockCopperDoor("door.copper.bottom", blockID("doorCopperBottom"), Material.stone, false));
        doorCopperTop = raw
                .setBlockModel(new BlockModelRenderBlocks(7))
                .setTextures("copperdoortop.png")
                .setTopBottomTexture("coppertrapdoortop.png")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockCopperDoor("door.copper.top", blockID("doorCopperTop"), Material.stone, true));

        doorCopperTarnishedBottom = raw
                .setBlockModel(new BlockModelRenderBlocks(7))
                .setTextures("tarnishedcopperdoorbottom.png")
                .setTopBottomTexture("tarnishedcoppertrapdoortop.png")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockCopperTarnishedDoor("door.copper.tarnished.bottom", blockID("doorCopperTarnishedBottom"), Material.stone, false));
        doorCopperTarnishedTop = raw
                .setBlockModel(new BlockModelRenderBlocks(7))
                .setTextures("tarnishedcopperdoortop.png")
                .setTopBottomTexture("tarnishedcoppertrapdoortop.png")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .setVisualUpdateOnMetadata()
                .build(new BlockCopperTarnishedDoor("door.copper.tarnished.top", blockID("doorCopperTarnishedTop"), Material.stone, true));

        doorCopperCorrodedBottom = raw
                .setBlockModel(new BlockModelRenderBlocks(7))
                .setTextures("corrodedcopperdoorbottom.png")
                .setTopBottomTexture("corrodedcoppertrapdoortop.png")
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
                .setBlockModel(new BlockModelRenderBlocks(7))
                .setTextures("corrodedcopperdoortop.png")
                .setTopBottomTexture("corrodedcoppertrapdoortop.png")
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
                .setBlockModel(new BlockModelRenderBlocks(31))
                .setTextures("copperfence.png")
                .setTextures("copperframe.png")
                .setTextures("copperrod.png")
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceCopper("fence.copper", blockID("fenceCopper"), Material.metal));
        fenceCopperTarnished = raw
                .setBlockModel(new BlockModelRenderBlocks(31))
                .setTextures("tarnishedcopperfence.png")
                .setTextures("tarnishedcopperframe.png")
                .setTextures("tarnishedcopperrod.png")
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceCopperTarnished("fence.copper.tarnished", blockID("fenceCopperTarnished"), Material.metal));
        fenceCopperCorroded = raw
                .setBlockModel(new BlockModelRenderBlocks(31))
                .setTextures("corrodedcopperfence.png")
                .setTextures("corrodedcopperframe.png")
                .setTextures("corrodedcopperrod.png")
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceCopperCorroded("fence.copper.corroded", blockID("fenceCopperCorroded"), Material.metal) {
                    @Override
                    public void updateTick(World world, int x, int y, int z, Random rand) {
                    }
                });


        //Copper Pressure Plate
        pressureplateCopper = raw
                .setTextures("copper.png")
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS)
                .build(new BlockCopperPressurePlate("pressureplate.copper", blockID("pressureplateCopper"), Material.metal));
        pressureplateCopperTarnished = raw
                .setTextures("tarnishedcopper.png")
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS)
                .build(new BlockCopperTarnishedPressurePlate("pressureplate.copper.tarnished", blockID("pressureplateCopperTarnished"), Material.metal));
        pressureplateCopperCorroded = raw
                .setTextures("corrodedcopper.png")
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS)
                .build(new BlockCopperCorrodedPressurePlate("pressureplate.copper.corroded", blockID("pressureplateCopperCorroded"), Material.metal));


        // Steel Trapdoor
        trapdoorSteel = raw
                .setBlockModel(new BlockModelRenderBlocks(30))
                .setResistance(2000.0f)
                .setTopBottomTexture("steeltrapdoortop.png")
                .setSideTextures("steeltrapdoorside.png")
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoor("trapdoor.steel", blockID("trapdoorSteel"), Material.metal, true));


        // Steel Doors
        doorSteelBottom = raw
                .setBlockModel(new BlockModelRenderBlocks(7))
                .setResistance(2000.0f)
                .setTextures("steeldoorbottom.png")
                .setTopBottomTexture("steeltrapdoortop.png")
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
                .setBlockModel(new BlockModelRenderBlocks(7))
                .setResistance(2000.0f)
                .setTextures("steeldoortop.png")
                .setTopBottomTexture("steeltrapdoortop.png")
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
                .setTextures("silverblock.png")
                .build(new Block("block.silver", blockID("blockSilver"), Material.metal));

        brickSilver = silver
                .setTextures("silverbrick.png")
                .build(new Block("brick.silver", blockID("brickSilver"), Material.metal));

        // Silver Trapdoor
        trapdoorSilver = silver
                .setBlockModel(new BlockModelRenderBlocks(30))
                .setTopBottomTexture("silvertrapdoortop.png")
                .setSideTextures("silvertrapdoorside.png")
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoor("trapdoor.silver", blockID("trapdoorSilver"), Material.stone, false));

        // Silver Doors
        doorSilverBottom = silver
                .setBlockModel(new BlockModelRenderBlocks(7))
                .setTextures("silverdoorbottom.png")
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
                .setBlockModel(new BlockModelRenderBlocks(7))
                .setTextures("silverdoortop.png")
                .setTopBottomTexture("silvertrapdoortop.png")
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
                .setBlockModel(new BlockModelRenderBlocks(31))
                .setTextures("silverfence.png")
                .setTextures("silverrod.png")
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.CAN_HANG_OFF)
                .build(new BlockFenceSilver("fence.silver", blockID("fenceSilver"), Material.metal));

        // Silver Chandelier
        chandelierSilver = silver
                .setBlockModel(new BlockModelRenderBlocks(1))
                .setTextures("silverchandelier.png")
                .setVisualUpdateOnMetadata()
                .setLuminance(15)
                .setUseInternalLight()
                .build(new BlockChandolier("chandelier.silver", blockID("chandelierSilver")));

        // Silver Candelabra
        candelabraSilver = silver
                .setBlockModel(new BlockModelRenderBlocks(1))
                .setTextures("silvercandelabra.png")
                .setVisualUpdateOnMetadata()
                .setLuminance(15)
                .setUseInternalLight()
                .build(new BlockVase("candelabra.silver", blockID("candelabraSilver")));

        // Silver Lantern
        lanternSilver = silver
                .setBlockModel(new BlockModelRenderBlocks(1))
                .setTextures("silverlantern.png")
                .setVisualUpdateOnMetadata()
                .setLuminance(15)
                .setUseInternalLight()
                .build(new BlockLantern("lantern.silver", blockID("lanternSilver")));

        // Silver Vase
        vaseSilver = silver
                .setBlockModel(new BlockModelRenderBlocks(1))
                .setTextures("silvervase.png")
                .setVisualUpdateOnMetadata()
                .build(new BlockVase("vase.silver", blockID("vaseSilver")));

        // Silver Vane
        vaneSilver = silver
                .setBlockModel(new BlockModelRenderBlocks(1))
                .setTextures("silvervane.png")
                .setVisualUpdateOnMetadata()
                .build(new BlockVace("vane.silver", blockID("vaneSilver")));

        // Silver Chimes
        chimesSilver = silver
                .setBlockModel(new BlockModelRenderBlocks(1))
                .setTextures("silverchimes.png")
                .setVisualUpdateOnMetadata()
                .build(new BlockChimes("chimes.silver", blockID("chimesSilver")));

        // Silver Bed
        bedSilver = silver
                .setBlockModel(new BlockModelRenderBlocks(14))
                .setTextures("silverbedfront.png")
                .setTextures("silverbedback.png")
                .setTextures("silverbedtop1.png")
                .setTextures("silverbedtop2.png")
                .setTextures("silverbedside1.png")
                .setTextures("silverbedside2.png")
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockSilverBed("bed.silver", blockID("bedSilver")));

        // Silver Seat
        seatSilver = silver
                .setBlockModel(new BlockModelRenderBlocks(35))
                .setTopTexture("silverseat.png")
                .setBottomTexture("silverblock.png")
                .setSideTextures("silverbedback.png")
                .setVisualUpdateOnMetadata()
                .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockSilverSeat("seat.silver", blockID("seatSilver"), Material.metal));


        // Scorched Stone
        scorchedstone = stone
                .setHardness(0.8f)
                .setSideTextures("redsandstoneside.png")
                .setBottomTexture("redsandstonebottom.png")
                .setTopTexture("redsandstonetop.png")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.GROWS_TREES, BlockTags.GROWS_SPINIFEX, BlockTags.GROWS_FLOWERS, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
                .build(new Block("scorchedstone", blockID("scorchedstone"), Material.stone));


        // Slate Pillar
        pillarSlate = stone
                .setSideTextures("slatepillarside.png")
                .setTopBottomTexture("slatepillartop.png")
                .setBlockModel(new BlockModelRenderBlocks(27))
                .build(new BlockAxisAligned("pillar.slate", blockID("pillarSlate"), Material.stone));


        // Polished Stones
        marblePolished = stone
                .setSideTextures("polishedmarbleside.png")
                .setTopBottomTexture("polishedmarbletop.png")
                .build(new Block("marble.polished", blockID("marblePolished"), Material.stone));
        permafrostPolished = stone
                .setSideTextures("polishedpermafrostside.png")
                .setTopBottomTexture("polishedpermafrostop.png")
                .build(new Block("permafrost.polished", blockID("permafrostPolished"), Material.stone));


        // Carved Stones
        slateCarved = stone
                .setSideTextures(6, 14)
                .setTopBottomTexture(8, 14)
                .build(new Block("slate.carved", blockID("slateCarved"), Material.stone));
        marbleCarved = stone
                .setSideTextures(6, 14)
                .setTopBottomTexture(8, 14)
                .build(new Block("marble.carved", blockID("marbleCarved"), Material.stone));

        permafrostCarved = stone
                .setSideTextures("carvedpermafrost.png")
                .setTopBottomTexture("polishedpermafrostop.png")
                .build(new Block("permafrost.carved", blockID("permafrostCarved"), Material.stone));


        // Baked Clay
        clayBaked = stone
                .setHardness(3.0f)
                .setTextures("bakedclay.png")
                .build(new Block("clay.baked", blockID("clayBaked"), Material.stone));


        // Obsidian Glass
        glassObsidian = obsidian
                .build(new BlockGlassObsidian("glass.obsidian", blockID("glassObsidian"), Material.glass, true));
        trapdoorGlassObsidian = obsidian
                .setBlockModel(new BlockModelRenderBlocks(30))
                .setVisualUpdateOnMetadata()
                .build(new BlockTrapDoorObsidian("trapdoor.glass.obsidian", blockID("trapdoorGlassObsidian")));

        // Quartz Glass
        glassQuartz = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
                .setHardness(0.3F)
                .setResistance(0.3F)
                .setLightOpacity(-1)
                .setVisualUpdateOnMetadata()
                .setUseInternalLight()
                .setTextures("quartzglass.png")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build(new BlockGlassQuartz("glass.quartz", blockID("glassQuartz"), Material.glass, false));


        // Netherrack
        cobbleNetherrack = brick
                .setHardness(0.4F)
                .setResistance(0.4F)
                .setTextures("cobblednetherrack.png")
                .setInfiniburn()
                .build(new Block("cobble.netherrack", blockID("cobbleNetherrack"), Material.stone));

        netherrack = brick
                .setHardness(0.9F)
                .setResistance(0.9F)
                .setTextures("netherrack.png")
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
                .setTextures("netherbrick.png")
                .setInfiniburn()
                .build(new Block("brick.netherrack", blockID("brickNetherrack"), Material.stone));
        brickScorchedstone = brick
                .setHardness(0.8f)
                .setTextures("redsandstonebrick.png")
                .build(new Block("brick.scorchedstone", blockID("brickScorchedstone"), Material.stone));
        brickMud = brick
                .setHardness(1.5f)
                .setTextures("mudbrick.png")
                .build(new Block("brick.mud", blockID("brickMud"), Material.stone));
        brickSteel = brick
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0F)
                .setResistance(4000.0f)
                .setTextures("steelbrick.png")
                .build(new Block("brick.steel", blockID("brickSteel"), Material.metal));
        brickQuartz = brick
                .setHardness(3.0f)
                .setTextures("quartzbrick.png")
                .build(new Block("brick.quartz", blockID("brickQuartz"), Material.stone));
        brickOlivine = brick
                .setHardness(3.0f)
                .setTextures("olivinebrick.png")
                .build(new Block("brick.olivine", blockID("brickOlivine"), Material.stone));


        // Soulslate
        soulslate = stone
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.6f))
                .setHardness(2.0f)
                .setResistance(20.0f)
                .setTextures("soulslate.png")
                .build(new Block("soulslate", blockID("soulslate"), Material.stone));


        // Brimstone
        brimstone = stone
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.4f))
                .setHardness(200.0f)
                .setResistance(20000.0f)
                .setTextures("brimstone.png")
                .setInfiniburn()
                .build(new BlockBrimstone("brimstone", blockID("brimstone"), Material.piston));


        // Pumice
        pumiceDry = stone
                .setTextures("pumicedry.png")
                .build(new BlockPumice("pumice.dry", blockID("pumiceDry"), false));
        pumiceWet = stone
                .setLuminance(13)
                .setUseInternalLight()
                .setTextures("pumiceoverlay.png")
                .setTextures("pumicewet.png")
                .build(new BlockPumice("pumice.wet", blockID("pumiceWet"), true));


        // Pumpkin Pie
        pie = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.5f)
                .setResistance(0.5f)
                .setTopTexture("pietop.png")
                .setBottomTexture("piebottom.png")
                .setSideTextures("pieside.png")
                .setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockPie("pie", blockID("pie")));


        // Soul Candle
        candleSoulwax = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 1.2f))
                .setHardness(0.0f)
                .setResistance(0.0f)
                .setLuminance(10)
                .setTextures(5, 7)
                .setVisualUpdateOnMetadata()
                .setBlockModel(new BlockModelRenderBlocks(25))
                .setTags(BlockTags.MINEABLE_BY_SWORD, BlockTags.BROKEN_BY_FLUIDS, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockSoulCandle("candle.soulwax", blockID("candleSoulwax")));


/*
    bedroll = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
            .setBlockModel(new BlockModelRenderBlocks(14))
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

        //Slabs
        slabWool = slab
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.8F)
                .setResistance(0.8F)
                .setFlammability(30, 60)
                .setItemBlock(ItemBlockSlabPainted::new)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockWoolSlab(Block.wool, blockID("slabWool")));
        slabCobbleStoneMossy = slab
                .setHardness(2.0F)
                .setTextures(4, 2)
                .build(new BlockSlab(Block.cobbleStoneMossy, blockID("slabCobbleStoneMossy")));
        slabSlatePolished = slab
                .setSideTextures(6, 14)
                .setTopBottomTexture(8, 14)
                .build(new BlockSlab(slateCarved, blockID("slabSlatePolished")));
        slabMarblePolished = slab
                .setSideTextures("carvedmarble.png")
                .setTopBottomTexture("polishedmarbletop.png")
                .build(new BlockSlab(marbleCarved, blockID("slabMarblePolished")));
        slabPermafrostPolished = slab
                .setSideTextures("carvedpermafrost.png")
                .setTopBottomTexture("polishedpermafrostop.png")
                .build(new BlockSlab(permafrostCarved, blockID("slabPermafrostPolished")));
        slabBrickStonePolishedMossy = slab
                .setHardness(2.0F)
                .setTextures(11, 8)
                .build(new BlockSlab(Block.brickStonePolishedMossy, blockID("slabBrickStonePolishedMossy")));
        slabBrickSandstone = slab
                .setHardness(0.8F)
                .setTextures(0, 14)
                .build(new BlockSlab(Block.brickSandstone, blockID("slabBrickSandstone")));
        slabBrickGold = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(3.0F)
                .setTextures(9, 9)
                .build(new BlockSlab(Block.brickGold, blockID("slabBrickGold")));
        slabBrickLapis = slab
                .setHardness(3.0F)
                .setTextures(9, 8)
                .build(new BlockSlab(Block.brickLapis, blockID("slabBrickLapis")));
        slabBrickPermafrost = slab
                .setTextures(13, 15)
                .build(new BlockSlab(Block.brickPermafrost, blockID("slabBrickPermafrost")));
        slabBrickIron = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0F)
                .setTextures(8, 8)
                .build(new BlockSlab(Block.brickIron, blockID("slabBrickIron")));
        slabCobbleNetherrack = slab
                .setTextures("cobblednetherrack.png")
                .build(new BlockSlab(cobbleNetherrack, blockID("slabCobbleNetherrack")));
        slabCobbleNetherrackMossy = slab
                .setTextures(7, 6)
                .build(new BlockSlab(Block.netherrack, blockID("slabCobbleNetherrackMossy")));
        slabBrickNetherrack = slab
                .setTextures("netherbrick.png")
                .build(new BlockSlab(brickNetherrack, blockID("slabBrickNetherrack")));
        slabBrickScorchedstone = slab
                .setHardness(0.8f)
                .setTextures("redsandstonebrick.png")
                .build(new BlockSlab(brickScorchedstone, blockID("slabBrickScorchedstone")));
        slabBrickMud = slab
                .setTextures("mudbrick.png")
                .build(new BlockSlab(brickMud, blockID("slabBrickMud")));
        slabCobblePermafrost = slab
                .setTextures(12, 15)
                .build(new BlockSlab(Block.cobblePermafrost, blockID("slabCobblePermafrost")));
        slabScorchedstone = slab
                .setHardness(0.8F)
                .setSideTextures("redsandstoneside.png")
                .setBottomTexture("redsandstonebottom.png")
                .setTopTexture("redsandstonetop.png")
                .build(new BlockSlab(scorchedstone, blockID("slabScorchedstone")));
        slabBrickSteel = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(4000.0f)
                .setTextures("steelbrick.png")
                .build(new BlockSlab(brickSteel, blockID("slabBrickSteel")));
        slabBrickQuartz = slab
                .setHardness(3.0f)
                .setTextures("quartzbrick.png")
                .build(new BlockSlab(brickQuartz, blockID("slabBrickQuartz")));
        slabBrickOlivine = slab
                .setHardness(3.0f)
                .setTextures("olivinebrick.png")
                .build(new BlockSlab(brickOlivine, blockID("slabBrickOlivine")));
        slabBrickSilver = slab
                .setHardness(0.8f)
                .setResistance(2.0f)
                .setTextures("silverbrick.png")
                .build(new BlockSlab(brickSilver, blockID("slabBrickSilver")));
        slabCopper = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setTextures("copperblock.png")
                .setTicking(true)
                .build(new BlockSlab(blockCopper, blockID("slabCopper")) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (world.getBlockMetadata(x, y, z) == 0) {
                            if (rand.nextInt(200) == 0) {
                                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.slabCopperTarnished.id, world.getBlockMetadata(x, y, z));
                                }
                            }
                        }
                    }
                });
        slabCopperTarnished = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setTicking(true)
                .setTextures("tarnishedcopperblock.png")
                .build(new BlockSlab(blockCopperTarnished, blockID("slabCopperTarnished")) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (world.getBlockMetadata(x, y, z) == 0) {
                            if (rand.nextInt(200) == 0) {
                                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.slabCopperCorroded.id, world.getBlockMetadata(x, y, z));
                                }
                            }
                        }
                    }
                });
        slabCopperCorroded = slab
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setTextures("corrodedcopperblock.png")
                .build(new BlockSlab(blockCopperCorroded, blockID("slabCopperCorroded")));


        // Stairs
        stairsWool = stairs
                .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                .setHardness(0.8F)
                .setResistance(0.8F)
                .setFlammability(30, 60)
                .setItemBlock(ItemBlockStairsPainted::new)
                .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.NOT_IN_CREATIVE_MENU)
                .build(new BlockWoolStairs(Block.wool, blockID("stairsWool")));
        stairsCobbleStoneMossy = stairs
                .setHardness(2.0F)
                .setTextures(4, 2)
                .build(new BlockStairs(Block.cobbleStoneMossy, blockID("stairsCobbleStoneMossy")));
        stairsBrickStonePolishedMossy = stairs
                .setHardness(2.0F)
                .setTextures(11, 8)
                .build(new BlockStairs(Block.brickStonePolishedMossy, blockID("stairsBrickStonePolishedMossy")));
        stairsBrickSandstone = stairs
                .setHardness(0.8F)
                .setTextures(0, 14)
                .build(new BlockStairs(Block.brickSandstone, blockID("stairsBrickSandstone")));
        stairsBrickGold = stairs
                .setHardness(3.0F)
                .setTextures(9, 9)
                .build(new BlockStairs(Block.brickGold, blockID("stairsBrickGold")));
        stairsBrickLapis = stairs
                .setHardness(3.0F)
                .setTextures(9, 8)
                .build(new BlockStairs(Block.brickLapis, blockID("stairsBrickLapis")));
        stairsBrickPermafrost = stairs
                .setTextures(13, 15)
                .build(new BlockStairs(Block.brickPermafrost, blockID("stairsBrickPermafrost")));
        stairsBrickIron = stairs
                .setHardness(5.0F)
                .setTextures(8, 8)
                .build(new BlockStairs(Block.brickIron, blockID("stairsBrickIron")));
        stairsCobbleNetherrack = stairs
                .setTextures("cobblednetherrack.png")
                .build(new BlockStairs(cobbleNetherrack, blockID("stairsCobbleNetherrack")));
        stairsCobbleNetherrackMossy = stairs
                .setTextures(7, 6)
                .build(new BlockStairs(Block.netherrack, blockID("stairsCobbleNetherrackMossy")));
        stairsBrickNetherrack = stairs
                .setTextures("netherbrick.png")
                .build(new BlockStairs(brickNetherrack, blockID("stairsBrickNetherrack")));
        stairsBrickScorchedstone = stairs
                .setHardness(0.8f)
                .setTextures("redsandstonebrick.png")
                .build(new BlockStairs(brickScorchedstone, blockID("stairsBrickScorchedstone")));
        stairsBrickMud = stairs
                .setHardness(1.5f)
                .setTextures("mudbrick.png")
                .build(new BlockStairs(brickMud, blockID("stairsBrickMud")));
        stairsCobblePermafrost = stairs
                .setHardness(0.8F)
                .setTextures(12, 15)
                .build(new BlockStairs(Block.cobblePermafrost, blockID("stairsCobblePermafrost")));
        stairsBrickSteel = stairs
                .setHardness(5.0f)
                .setResistance(4000.0f)
                .setTextures("steelbrick.png")
                .build(new BlockStairs(brickSteel, blockID("stairsBrickSteel")));
        stairsBrickQuartz = stairs
                .setHardness(3.0f)
                .setTextures("quartzbrick.png")
                .build(new BlockStairs(brickQuartz, blockID("stairsBrickQuartz")));
        stairsBrickOlivine = stairs
                .setHardness(3.0f)
                .setTextures("olivinebrick.png")
                .build(new BlockStairs(brickOlivine, blockID("stairsBrickOlivine")));
        stairsBrickSilver = stairs
                .setHardness(0.8f)
                .setResistance(2.0f)
                .setTextures("silverbrick.png")
                .build(new BlockStairs(brickSilver, blockID("stairsBrickSilver")));
        stairsCopper = stairs
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setTextures("copperblock.png")
                .setTicking(true)
                .build(new BlockStairs(blockCopper, blockID("stairsCopper")) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (world.getBlockMetadata(x, y, z) == 0) {
                            if (rand.nextInt(200) == 0) {
                                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.stairsCopperTarnished.id, world.getBlockMetadata(x, y, z));
                                }
                            }
                        }
                    }
                });
        stairsCopperTarnished = stairs
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setTextures("tarnishedcopperblock.png")
                .setTicking(true)
                .build(new BlockStairs(blockCopperTarnished, blockID("stairsCopperTarnished")) {

                    public void updateTick(World world, int x, int y, int z, Random rand) {
                        if (world.getBlockMetadata(x, y, z) == 0) {
                            if (rand.nextInt(200) == 0) {
                                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.stairsCopperCorroded.id, world.getBlockMetadata(x, y, z));
                                }
                            }
                        }
                    }
                });
        stairsCopperCorroded = stairs
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                .setHardness(5.0f)
                .setResistance(10.0f)
                .setTextures("corrodedcopperblock.png")
                .build(new BlockStairs(blockCopperCorroded, blockID("stairsCopperCorroded")));



        //2.2 New Stuff

        brickClayBaked = stone
                .setTextures("bakedclaybrick.png")
                .build(new Block("brick.clay.baked", blockID("brickClayBaked"), Material.stone));

        slabBrickClayBaked = slab
                .build(new BlockSlab(brickClayBaked, blockID("slabBrickClayBaked")));

        stairsBrickClayBaked = stairs
                .setTextures("bakedclaybrick.png")
                .build(new BlockStairs(brickClayBaked, blockID("stairsBrickClayBaked")));

        dirtRough = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.gravel", "step.gravel", 1.0f, 0.8f))
                .setHardness(0.6f)
                .setResistance(0.6f)
                .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.CAVES_CUT_THROUGH)
                .setTextures("roughdirt.png")
                .build(new Block("dirt.rough", blockID("dirtRough"), Material.dirt));

        skull = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setTopBottomTexture("skulltop.png")
                .setSideTextures("skullside.png")
                .setNorthTexture("skullfront.png")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build(new BlockRotatableHorizontal("skull", blockID("skull"), Material.stone) {
                });

        skullActive = new BlockBuilder(MOD_ID)
                .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                .setHardness(0.8f)
                .setResistance(5.0f)
                .setLuminance(15)
                .setTopBottomTexture("skulltop.png")
                .setSideTextures("skullside.png")
                .setNorthTexture("skullfrontlit.png")
                .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                .build(new BlockRotatableHorizontal("skull.active", blockID("skullActive"), Material.stone) {
                });

        initializeBlockDetails();
    }
}
