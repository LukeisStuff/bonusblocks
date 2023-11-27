package luke.bonusblocks;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.block.color.BlockColorGrass;
import net.minecraft.client.render.block.color.BlockColorPlanksPainted;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.client.sound.block.BlockSound;
import net.minecraft.client.sound.block.BlockSounds;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.crafting.CraftingManager;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemPlaceable;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.item.block.ItemBlockSlab;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.ItemHelper;
import turniplabs.halplibe.helper.RecipeHelper;
import turniplabs.halplibe.mixin.accessors.CraftingManagerAccessor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static net.minecraft.core.block.BlockMoss.stoneToMossMap;


public class BonusBlocks implements ModInitializer {
    public static final String MOD_ID = "bonusblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // Blocks
    public static final Block crate = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(1.0f)
            .setTextures("crate.png")
            .setFlammability(2, 2)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new Block("crate", 524, Material.wood));

    public static final Block crateSticky = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(1.0f)
            .setTextures("stickycrate.png")
            .setFlammability(2, 2)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new Block("crate.sticky", 525, Material.wood));

    public static final Block box = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.5f)
            .setResistance(5.0f)
            .setTextures(9, 1)
            .setFlammability(2, 2)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new Block("box", 684, Material.wood));

    public static final Block boxPainted = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.5f)
            .setResistance(5.0f)
            .setBlockModel(new BlockModelRenderBlocks(22))
            .setTextures("paintedbox.png")
            .setFlammability(2, 2)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT, BlockTags.NOT_IN_CREATIVE_MENU)
            .setBlockColor(new BlockColorPlanksPainted(false))
            .build(new BlockPaintedBox("box.painted", 685, Material.wood));

    public static final Block bookshelfEmptyPlanksOak = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 0.8f))
            .setHardness(1.5f)
            .setResistance(1.0f)
            .setTopBottomTexture(4, 0)
            .setFlammability(2, 2)
            .setSideTextures("emptybookshelf.png")
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new Block("bookshelf.empty.planks.oak", 101, Material.wood));



    public static final Block branch = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 0.5f))
            .setHardness(0.2f)
            .setResistance(0.2f)
            .setFlammability(4, 2)
            .setTextures("branch.png")
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLeavesBase("branch", 325, Material.leaves, false) {
                @Override
                protected Block getSapling() {
                    return null;
                }
            });



    public static final Block leavesMaple = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.2F)
            .setResistance(0.2F)
            .setFlammability(4, 2)
            .setSideTextures("mapleleaves.png")
            .setBottomTexture("mapleleavesfast.png")
            .setTopBottomTexture("mapleleaves.png")
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_HOE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
            .build(new BlockLeavesMaple("leaves.maple", 298));
    public static final Block leavesJacaranda = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.2F)
            .setResistance(0.2F)
            .setFlammability(4, 2)
            .setSideTextures("jacaleaves.png")
            .setBottomTexture("jacaleavesfast.png")
            .setTopBottomTexture("jacaleaves.png")
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_HOE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
            .build(new BlockLeavesJacaranda("leaves.jacaranda", 299));



    public static final Block saplingMaple = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setFlammability(2, 1)
            .setTextures("maplesapling.png")
            .setBlockModel(new BlockModelRenderBlocks(1))
            .setTags(BlockTags.BROKEN_BY_FLUIDS)
            .build(new BlockSaplingMaple("sapling.maple", 317));
    public static final Block saplingJacaranda = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setFlammability(2, 1)
            .setTextures("jacasapling.png")
            .setBlockModel(new BlockModelRenderBlocks(1))
            .setTags(BlockTags.BROKEN_BY_FLUIDS)
            .build(new BlockSaplingJacaranda("sapling.jacaranda", 318));

    public static final Block saplingOakMossy = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setFlammability(2, 1)
            .setTextures("mossyoaksapling.png")
            .setBlockModel(new BlockModelRenderBlocks(1))
            .setTags(BlockTags.BROKEN_BY_FLUIDS)
            .build(new BlockSaplingMossyOak("sapling.oak.mossy", 319));

    public static final Block logShrub = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("shrublogtop.png")
            .setSideTextures("shrublogside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("log.shrub", 286));
    public static final Block logMaple = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("maplelogtop.png")
            .setSideTextures("maplelogside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("log.maple", 287));
    public static final Block logJacaranda = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.2F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("jacalogtop.png")
            .setSideTextures("jacalogside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("log.jacaranda", 288));
    public static final Block logScorched = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.2f))
            .setHardness(1.8f)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("charredlogtop.png")
            .setSideTextures("charredlogside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("log.scorched", 289));



    public static final Block barkOak = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 20)
            .setSideTextures(0, 20)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.oak", 300));

    public static final Block barkOakMossy = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 21)
            .setSideTextures(0, 21)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.oak.mossy", 301));

    public static final Block barkPine = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 23)
            .setSideTextures(0, 23)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.pine", 302));

    public static final Block barkBirch = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 24)
            .setSideTextures(0, 24)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.birch", 303));

    public static final Block barkCherry = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 25)
            .setSideTextures(0, 25)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.cherry", 304));

    public static final Block barkEucalyptus = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 26)
            .setSideTextures(0, 26)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.eucalyptus", 305));

    public static final Block barkShrub = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("shrublogside.png")
            .setSideTextures("shrublogside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.shrub", 306));

    public static final Block barkMaple = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("maplelogside.png")
            .setSideTextures("maplelogside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.maple", 307));
    public static final Block barkJacaranda = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.2F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("jacalogside.png")
            .setSideTextures("jacalogside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.jacaranda", 308));
    public static final Block barkScorched = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.2f))
            .setHardness(1.8f)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("charredlogside.png")
            .setSideTextures("charredlogside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.scorched", 309));



    public static final BlockBuilder flowerBuilder = new BlockBuilder(MOD_ID)
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setBlockSound(BlockSounds.GRASS)
            .setBlockModel(new BlockModelRenderBlocks(1))
            .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.BROKEN_BY_FLUIDS);

    public static final Block flowerCyan = flowerBuilder
            .setTextures("bluebell.png")
            .build(new BlockFlower("flower.cyan", 332));

    public static final Block flowerPurple = flowerBuilder
            .setTextures("heather.png")
            .build(new BlockFlower("flower.purple", 333));

    public static final Block flowerPink = flowerBuilder
            .setTextures("orchid.png")
            .build(new BlockFlower("flower.pink", 334));

    public static final Block flowerSilver = flowerBuilder
            .setTextures("whitedandelion.png")
            .build(new BlockFlower("flower.silver", 335));

    public static final Block flowerOrange = flowerBuilder
            .setTextures("gladiola.png")
            .build(new BlockFlower("flower.orange", 336));

    public static final Block flowerLime = flowerBuilder
            .setTextures("clovers.png")
            .build(new BlockFlower("flower.lime", 337));



    public static final Block mushroomGray = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setTextures("shroom.png")
            .setBlockModel(new BlockModelRenderBlocks(1))
            .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.BROKEN_BY_FLUIDS)
            .build(new BlockMushroom("mushroom.gray", 342));



    public static final Block cobbleStoneReinforced = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures(14, 3)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.stone.reinforced", 23, Material.stone));

    public static final Block cobbleStoneMossyReinforced = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures(10, 12)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.stone.mossy.reinforced", 24, Material.stone));

    public static final Block cobbleBasaltReinforced = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures("compressedbasalt.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.basalt.reinforced", 25, Material.stone));

    public static final Block cobbleGraniteReinforced = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures("compressedgranite.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.granite.reinforced", 26, Material.stone));

    public static final Block cobbleLimestoneReinforced = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures("compressedlimestone.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.limestone.reinforced", 27, Material.stone));

    public static final Block cobblePermafrostReinforced = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures("compressedpermafrost.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.permafrost.reinforced", 28, Material.stone));


    public static final Block pillarSlate = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("slatepillarside.png")
            .setTopBottomTexture("slatepillartop.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockAxisAligned("pillar.slate", 22, Material.stone));
    public static final Block marblePolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("polishedmarbleside.png")
            .setTopBottomTexture("polishedmarbletop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("marble.polished", 865, Material.stone));

    public static final Block sandstonePolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("polishedsandstoneside.png")
            .setTopBottomTexture("polishedsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("sandstone.polished", 866, Material.stone));

    public static final Block permafrostPolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("polishedpermafrostside.png")
            .setTopBottomTexture("polishedpermafrostop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("permafrost.polished", 867, Material.stone));

    public static final Block scorchedstonePolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("polishedredsandstoneside.png")
            .setTopBottomTexture("polishedredsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("scorchedstone.polished", 868, Material.stone));

    public static final Block capstoneMarbleCarved = new BlockBuilder(MOD_ID)
            .setBlockSound(BlockSounds.STONE)
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures(10, 14)
            .setTopBottomTexture(9, 14)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("capstone.marble.carved", 44, Material.stone));

    public static final Block slateCarved = new BlockBuilder(MOD_ID)
            .setBlockSound(BlockSounds.STONE)
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures(6, 14)
            .setTopBottomTexture(8, 14)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("slate.carved", 45, Material.stone));

    public static final Block marbleCarved = new BlockBuilder(MOD_ID)
            .setBlockSound(BlockSounds.STONE)
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures(6, 14)
            .setTopBottomTexture(8, 14)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("marble.carved", 46, Material.stone));

    public static final Block sandstoneCarved = new BlockBuilder(MOD_ID)
            .setBlockSound(BlockSounds.STONE)
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("carvedsandstone.png")
            .setTopBottomTexture("polishedsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("sandstone.carved", 47, Material.stone));

    public static final Block permafrostCarved = new BlockBuilder(MOD_ID)
            .setBlockSound(BlockSounds.STONE)
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("carvedpermafrost.png")
            .setTopBottomTexture("polishedpermafrostop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("permafrost.carved", 48, Material.stone));

    public static final Block scorchedstoneCarved = new BlockBuilder(MOD_ID)
            .setBlockSound(BlockSounds.STONE)
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("carvedscorchedstone.png")
            .setTopBottomTexture("polishedredsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("scorchedstone.carved", 49, Material.stone));



    public static final Block blockBone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
            .setHardness(0.8f)
            .setResistance(5.0f)
            .setSideTextures("boneside.png")
            .setTopBottomTexture("bonetop.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockAxisAligned("block.bone", 444, Material.stone));

    public static final Block thatch = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 0.6f, 1.2f))
            .setHardness(0.6f)
            .setResistance(0.6f)
            .setSideTextures("thatchside.png")
            .setTopBottomTexture("thatchtop.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
            .build(new BlockThatch("thatch", 445, Material.grass));

    public static final Block blockCloth = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.8f))
            .setHardness(0.8f)
            .setResistance(0.8f)
            .setTextures("clothblock.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_SHEARS)
            .build(new BlockCloth("block.cloth", 446, Material.cloth));

    public static final Block blockSlime = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.5f))
            .setHardness(0.2f)
            .setResistance(0.2f)
            .setLightOpacity(6)
            .setTextures("slimeblock.png")
            .setTags(BlockTags.MINEABLE_BY_AXE)
            .build(new BlockSlime("block.slime", 447, false));

    public static final Block blockSulphur = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
            .setHardness(0.5f)
            .setResistance(0.5f)
            .setTextures("sulphurblock.png")
            .setTags(BlockTags.MINEABLE_BY_SHOVEL)
            .build(new BlockSulphur("block.sulphur", 252, Material.explosive));

    public static final Block blockCrudeSteel = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(4.0f)
            .setResistance(1000.0f)
            .setTextures(15, 8)
            .setTags(BlockTags.MINEABLE_BY_AXE)
            .build(new Block("block.steel.crude", 448, Material.metal));

    public static final Block blockLeather = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.6f))
            .setHardness(0.8f)
            .setResistance(0.8f)
            .setTextures("leatherblock.png")
            .setFlammability(3, 3)
            .setTags(BlockTags.MINEABLE_BY_AXE)
            .build(new Block("block.leather", 449, Material.cloth));


    public static final Block blockRawIron = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0f)
            .setResistance(10.0f)
            .setTextures("rawiron.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("block.raw.iron", 441, Material.metal));

    public static final Block blockRawGold = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0f)
            .setResistance(10.0f)
            .setTextures("rawgold.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("block.raw.gold", 442, Material.metal));

    public static final Block blockFlint = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0f)
            .setResistance(5.0f)
            .setTextures("flintblock.png")
            .setInfiniburn()
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("block.flint", 443, Material.stone));


    public static final Block brickNetherrack = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setTextures("netherbrick.png")
            .setInfiniburn()
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("brick.netherrack", 134, Material.stone));

    public static final Block scorchedstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8f)
            .setResistance(10.0f)
            .setSideTextures("redsandstoneside.png")
            .setBottomTexture("redsandstonebottom.png")
            .setTopTexture("redsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.GROWS_TREES, BlockTags.GROWS_SPINIFEX, BlockTags.GROWS_FLOWERS, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
            .build(new Block("scorchedstone", 31, Material.stone));

    public static final Block brickScorchedstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8f)
            .setResistance(10.0f)
            .setTextures("redsandstonebrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("brick.scorchedstone", 135, Material.stone));

    public static final Block brickMud = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.5f)
            .setResistance(10.0f)
            .setTextures("mudbrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("brick.mud", 136, Material.stone));

    public static final Block brickSteel = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0F)
            .setResistance(4000.0f)
            .setTextures("steelbrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("brick.steel", 137, Material.metal));

    public static final Block brickQuartz = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0f)
            .setResistance(10.0f)
            .setTextures("quartzbrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("brick.quartz", 138, Material.stone));

    public static final Block brickOlivine = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0f)
            .setResistance(10.0f)
            .setTextures("olivinebrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("brick.olivine", 139, Material.stone));

    public static final Block soulslate = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.6f))
            .setHardness(2.0f)
            .setResistance(20.0f)
            .setTextures("soulslate.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("soulslate", 811, Material.stone));



    public static final Block blockSugarcane = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(0.6f)
            .setSideTextures("sugarcaneside.png")
            .setTopBottomTexture("sugarcanetop.png")
            .setFlammability(3, 3)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE)
            .build(new BlockAxisAligned("block.sugarcane", 771, Material.grass));

    public static final Block blockSugarcaneBaked = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(0.6f)
            .setSideTextures("bakedsugarcaneside.png")
            .setTopBottomTexture("bakedsugarcanetop.png")
            .setFlammability(1, 1)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE)
            .build(new BlockAxisAligned("block.sugarcane.baked", 772, Material.grass));

    public static final Block blockPaper = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(0.6f)
            .setTextures("paperblock.png")
            .setFlammability(3, 3)
            .setTags(BlockTags.MINEABLE_BY_AXE)
            .build(new Block("block.paper", 773, Material.grass));


    public static final Block clayBaked = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0f)
            .setResistance(10.0f)
            .setTextures("bakedclay.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("clay.baked", 761, Material.stone));



    public static final Block blockWicker = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
            .setHardness(0.5f)
            .setResistance(0.5f)
            .setTextures(4, 9)
            .setFlammability(3, 3)
            .setTags(BlockTags.MINEABLE_BY_AXE)
            .build(new Block("block.wicker", 901, Material.cloth));


    public static final Block grassOvergrown = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTopBottomTexture(0, 0)
            .setSideTextures(0, 0)
            .setBlockColor(new BlockColorGrass())
            .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.PASSIVE_MOBS_SPAWN, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
            .build(new Block("grass.overgrown", 203, Material.grass));

    public static final Block grassRetroOvergrown = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures(8, 1)
            .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.PASSIVE_MOBS_SPAWN, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
            .build(new Block("grass.retro.overgrown", 204, Material.grass));

    public static final Block pathOvergrown = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures(4, 6)
            .setTags(BlockTags.MINEABLE_BY_SHOVEL)
            .setBlockDrop(BonusBlocks.pathOvergrown)
            .build(new BlockDirtPath("path.overgrown", 206));

    public static final Block grassScorchedOvergrown = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures(16, 11)
            .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.PASSIVE_MOBS_SPAWN, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
            .build(new Block("grass.scorched.overgrown", 205, Material.grass));



    public static final Block blockMushroomRed = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures("redmushroom.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
            .build(new Block("block.mushroom.red", 345, Material.dirt));

    public static final Block blockMushroomBrown = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setLuminance(2)
            .setTextures("brownmushroom.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
            .build(new Block("block.mushroom.brown", 346, Material.dirt));

    public static final Block blockMushroomGray = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures("graymushroom.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
            .build(new Block("block.mushroom.gray", 347, Material.dirt));



    public static final Block jar = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
            .setHardness(0.1f)
            .setResistance(0.1f)
            .setTextures("jar.png")
            .setVisualUpdateOnMetadata()
            .setBlockModel(new BlockModelRenderBlocks(26))
            .setTags(BlockTags.MINEABLE_BY_SWORD, BlockTags.BROKEN_BY_FLUIDS, BlockTags.NOT_IN_CREATIVE_MENU)
            .build(new BlockLanternJar("jar", 874, Material.glass));



    public static final Block candleSoulwax = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 1.2f))
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setLuminance(10)
            .setTextures(5, 7)
            .setVisualUpdateOnMetadata()
            .setBlockModel(new BlockModelRenderBlocks(25))
            .setTags(BlockTags.MINEABLE_BY_SWORD, BlockTags.BROKEN_BY_FLUIDS, BlockTags.NOT_IN_CREATIVE_MENU)
            .build(new BlockCandle("candle.soulwax", 61, Material.decoration));


    public static Item candleSoulwaxItem = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new ItemPlaceable("candle.soulwax", 16524, candleSoulwax),
            "candle.soulwax",
            "soulwaxcandle.png");

    public static Item soulwax = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new Item("soulwax", 16530),
            "soulwax",
            "soulwax.png");
    public static final Block slabSlatePolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setSideTextures(6, 14)
            .setTopBottomTexture(8, 14)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(slateCarved, 910));
    public static final Block slabMarblePolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setSideTextures("carvedmarble.png")
            .setTopBottomTexture("polishedmarbletop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(marbleCarved, 911));
    public static final Block slabSandstonePolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setSideTextures("carvedsandstone.png")
            .setTopBottomTexture("polishedsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(sandstoneCarved, 912));
    public static final Block slabPermafrostPolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setSideTextures("carvedpermafrost.png")
            .setTopBottomTexture("polishedpermafrostop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(permafrostCarved, 913));
    public static final Block slabScorchedstonePolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setSideTextures("carvedscorchedstone.png")
            .setTopBottomTexture("polishedredsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(scorchedstoneCarved, 914));
    public static final Block slabBrickStonePolishedMossy = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(11, 8)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(Block.brickStonePolishedMossy, 915));
    public static final Block slabBrickSandstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(0, 14)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(Block.brickSandstone, 916));
    public static final Block slabBrickGold = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(3.0F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(9, 9)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(Block.brickGold, 917));
    public static final Block slabBrickLapis = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(9, 8)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(Block.brickLapis, 918));
    public static final Block slabBrickPermafrost = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(13, 15)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(Block.brickPermafrost, 919));
    public static final Block slabBrickIron = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(8, 8)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(Block.brickIron, 920));
    public static final Block slabBrickNetherrack = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("netherbrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(brickNetherrack, 921));
    public static final Block slabBrickScorchedstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("redsandstonebrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(brickScorchedstone, 922));
    public static final Block slabBrickMud = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("mudbrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(brickMud, 923));

    public static final Block slabCobblePermafrost = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(12, 15)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(Block.cobblePermafrost, 924));
    public static final Block slabScorchedstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setSideTextures("redsandstoneside.png")
            .setBottomTexture("redsandstonebottom.png")
            .setTopTexture("redsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(scorchedstone, 925));

    public static final Block slabBrickSteel = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0f)
            .setResistance(4000.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("steelbrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(brickSteel, 926));
    public static final Block slabBrickQuartz = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("quartzbrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(brickQuartz, 927));
    public static final Block slabBrickOlivine = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("olivinebrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(brickOlivine, 928));


    public static final Block stairsBrickStonePolishedMossy = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(11, 8)
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(Block.brickStonePolishedMossy, 930));
    public static final Block stairsBrickSandstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(0, 14)
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(Block.brickSandstone, 931));
    public static final Block stairsBrickGold = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(3.0F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(9, 9)
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(Block.brickGold, 932));
    public static final Block stairsBrickLapis = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(9, 8)
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(Block.brickLapis, 933));
    public static final Block stairsBrickPermafrost = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(13, 15)
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(Block.brickPermafrost, 934));
    public static final Block stairsBrickIron = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(8, 8)
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(Block.brickIron, 935));
    public static final Block stairsBrickNetherrack = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("netherbrick.png")
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(brickNetherrack, 936));
    public static final Block stairsBrickScorchedstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("redsandstonebrick.png")
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(brickScorchedstone, 937));
    public static final Block stairsBrickMud = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("mudbrick.png")
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(brickMud, 938));

    public static final Block stairsCobblePermafrost = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(12, 15)
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(Block.cobblePermafrost, 939));

    public static final Block stairsBrickSteel = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0f)
            .setResistance(4000.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("steelbrick.png")
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(brickSteel, 940));

    public static final Block stairsBrickQuartz = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("quartzbrick.png")
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(brickQuartz, 941));

    public static final Block stairsBrickOlivine = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("olivinebrick.png")
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(brickOlivine, 942));

    static {
        Item.itemsList[slabSlatePolished.id] = new ItemBlockSlab(slabSlatePolished);
        Item.itemsList[slabPermafrostPolished.id] = new ItemBlockSlab(slabPermafrostPolished);
        Item.itemsList[slabSandstonePolished.id] = new ItemBlockSlab(slabSandstonePolished);
        Item.itemsList[slabScorchedstonePolished.id] = new ItemBlockSlab(slabScorchedstonePolished);
        Item.itemsList[slabMarblePolished.id] = new ItemBlockSlab(slabMarblePolished);

        Item.itemsList[slabBrickMud.id] = new ItemBlockSlab(slabBrickMud);
        Item.itemsList[slabBrickGold.id] = new ItemBlockSlab(slabBrickGold);
        Item.itemsList[slabBrickIron.id] = new ItemBlockSlab(slabBrickIron);
        Item.itemsList[slabBrickLapis.id] = new ItemBlockSlab(slabBrickLapis);
        Item.itemsList[slabBrickNetherrack.id] = new ItemBlockSlab(slabBrickNetherrack);
        Item.itemsList[slabBrickPermafrost.id] = new ItemBlockSlab(slabBrickPermafrost);
        Item.itemsList[slabBrickSandstone.id] = new ItemBlockSlab(slabBrickSandstone);
        Item.itemsList[slabBrickScorchedstone.id] = new ItemBlockSlab(slabBrickScorchedstone);
        Item.itemsList[slabBrickStonePolishedMossy.id] = new ItemBlockSlab(slabBrickStonePolishedMossy);
        Item.itemsList[slabBrickSteel.id] = new ItemBlockSlab(slabBrickSteel);
        Item.itemsList[slabBrickQuartz.id] = new ItemBlockSlab(slabBrickQuartz);
        Item.itemsList[slabBrickOlivine.id] = new ItemBlockSlab(slabBrickOlivine);

        Item.itemsList[slabScorchedstone.id] = new ItemBlockSlab(slabScorchedstone);
        Item.itemsList[slabCobblePermafrost.id] = new ItemBlockSlab(slabCobblePermafrost);
    }

    @Override
    public void onInitialize() {
        LOGGER.info("BonusBlocks initialized.");

        stoneToMossMap.put(Block.saplingOak, BonusBlocks.saplingOakMossy);

        ItemToolPickaxe.miningLevels.put(blockRawIron, 1);
        ItemToolPickaxe.miningLevels.put(slabBrickLapis, 1);
        ItemToolPickaxe.miningLevels.put(stairsBrickLapis, 1);


        ItemToolPickaxe.miningLevels.put(blockRawGold, 2);
        ItemToolPickaxe.miningLevels.put(slabBrickGold, 2);
        ItemToolPickaxe.miningLevels.put(stairsBrickGold, 2);
        ItemToolPickaxe.miningLevels.put(brickSteel, 2);
        ItemToolPickaxe.miningLevels.put(slabBrickSteel, 2);
        ItemToolPickaxe.miningLevels.put(stairsBrickSteel, 2);
        ItemToolPickaxe.miningLevels.put(blockCrudeSteel, 2);


        Item.itemsList[boxPainted.id] = new ItemBlockPainted(boxPainted, false);

        Item.jar = new ItemJarPlacable("jar", 16519, jar).setIconCoord(3, 9);

        RecipeHelper.removeRecipe(Block.pillarMarble, 0);
        RecipeHelper.Crafting.createRecipe(Block.pillarMarble, 3, new Object[]{"P", "P", "P", 'P', Block.marble});
        RecipeHelper.Crafting.createRecipe(pillarSlate, 3, new Object[]{"P", "P", "P", 'P', Block.slate});

        RecipeHelper.Crafting.createRecipe(Block.cobblePermafrost, 2, new Object[]{"PI", "IP", 'P', Item.ammoPebble, 'I', Block.ice});

        RecipeHelper.Crafting.createRecipe(crate,9, new Object[]{"PPP","PPP", "PPP", 'P' , Block.planksOak});
        RecipeHelper.Crafting.createRecipe(crateSticky,4, new Object[]{"S","P", 'P' , crate, 'S', Item.slimeball});
        RecipeHelper.Crafting.createRecipe(box,8, new Object[]{"PP","PP", 'P' , Block.chestPlanksOak});

        for (int color=0;color<16;color++) {
            RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(boxPainted, 1, color), new Object[]{box, new ItemStack(Item.dye, 1, 15 - color)});
        }

        for (int color=0;color<16;color++) {
            RecipeHelper.Crafting.createRecipe(new ItemStack(boxPainted, 8, color), new Object[]{"PP", "PP", 'P', new ItemStack(Block.chestPlanksOakPainted, 1, color << 4)});
        }


        RecipeHelper.craftingManager.addRecipe(new ItemStack(bookshelfEmptyPlanksOak, 1, 0), true, false, new Object[]{"PPP","   ", "PPP", 'P' , Block.planksOak});

        RecipeHelper.Crafting.createRecipe(branch,2, new Object[]{"PP","PP", 'P' , Item.stick});

        List<Block> logBlockGroup = new ArrayList<>(Arrays.asList(CraftingManager.blockAlternatives[6]));
        logBlockGroup.add(logMaple);
        logBlockGroup.add(logJacaranda);
        logBlockGroup.add(logScorched);
        logBlockGroup.add(logShrub);
        logBlockGroup.add(barkOak);
        logBlockGroup.add(barkOakMossy);
        logBlockGroup.add(barkBirch);
        logBlockGroup.add(barkPine);
        logBlockGroup.add(barkCherry);
        logBlockGroup.add(barkEucalyptus);
        logBlockGroup.add(barkMaple);
        logBlockGroup.add(barkJacaranda);
        logBlockGroup.add(barkScorched);
        logBlockGroup.add(barkShrub);

        Block[] logBlocks = new Block[logBlockGroup.size()];
        int i = 0;
        for (Block block: logBlockGroup) {
            logBlocks[i] = block;
            i++;
        }
        CraftingManager.blockAlternatives[6] = logBlocks;

        RecipeHelper.Crafting.createRecipe(barkOak,4, new Object[]{"PP","PP", 'P' , Block.logOak});
        RecipeHelper.Crafting.createRecipe(barkOakMossy,4, new Object[]{"PP","PP", 'P' , Block.logOakMossy});
        RecipeHelper.Crafting.createRecipe(barkBirch,4, new Object[]{"PP","PP", 'P' , Block.logBirch});
        RecipeHelper.Crafting.createRecipe(barkPine,4, new Object[]{"PP","PP", 'P' , Block.logPine});
        RecipeHelper.Crafting.createRecipe(barkCherry,4, new Object[]{"PP","PP", 'P' , Block.logCherry});
        RecipeHelper.Crafting.createRecipe(barkEucalyptus,4, new Object[]{"PP","PP", 'P' , Block.logEucalyptus});
        RecipeHelper.Crafting.createRecipe(barkMaple,4, new Object[]{"PP","PP", 'P' , logMaple});
        RecipeHelper.Crafting.createRecipe(barkShrub,4, new Object[]{"PP","PP", 'P' , logShrub});
        RecipeHelper.Crafting.createRecipe(barkScorched,4, new Object[]{"PP","PP", 'P' , logScorched});

        RecipeHelper.Crafting.createRecipe(new ItemStack(Block.planksOakPainted, 4, 14), new Object[]{"P", 'P' , logMaple});
        RecipeHelper.Crafting.createRecipe(new ItemStack(Block.planksOakPainted, 4, 10), new Object[]{"P", 'P' , logJacaranda});
        RecipeHelper.Crafting.createRecipe(new ItemStack(Block.planksOakPainted, 4, 15), new Object[]{"P", 'P' , logScorched});
        RecipeHelper.Crafting.createRecipe(new ItemStack(Block.planksOakPainted, 4, 5), new Object[]{"P", 'P' , logShrub});
        RecipeHelper.Crafting.createRecipe(Block.planksOak,4,new Object[]{"P", 'P' , barkOak});
        RecipeHelper.Crafting.createRecipe(new ItemStack(Block.planksOakPainted, 4, 13), new Object[]{"P", 'P' , barkOakMossy});
        RecipeHelper.Crafting.createRecipe(new ItemStack(Block.planksOakPainted, 4, 0), new Object[]{"P", 'P' , barkBirch});
        RecipeHelper.Crafting.createRecipe(new ItemStack(Block.planksOakPainted, 4, 12), new Object[]{"P", 'P' , barkPine});
        RecipeHelper.Crafting.createRecipe(new ItemStack(Block.planksOakPainted, 4, 6), new Object[]{"P", 'P' , barkCherry});
        RecipeHelper.Crafting.createRecipe(new ItemStack(Block.planksOakPainted, 4, 1), new Object[]{"P", 'P' , barkEucalyptus});
        RecipeHelper.Crafting.createRecipe(new ItemStack(Block.planksOakPainted, 4, 14), new Object[]{"P", 'P' , barkMaple});
        RecipeHelper.Crafting.createRecipe(new ItemStack(Block.planksOakPainted, 4, 10), new Object[]{"P", 'P' , barkJacaranda});
        RecipeHelper.Crafting.createRecipe(new ItemStack(Block.planksOakPainted, 4, 15), new Object[]{"P", 'P' , barkScorched});
        RecipeHelper.Crafting.createRecipe(new ItemStack(Block.planksOakPainted, 4, 5), new Object[]{"P", 'P' , barkShrub});


        RecipeHelper.Crafting.createRecipe(cobbleStoneReinforced,8,new Object[]{"PPP","POP","PPP", 'P' , Block.cobbleStone, 'O', Block.obsidian});
        RecipeHelper.Crafting.createRecipe(cobbleStoneMossyReinforced,8,new Object[]{"PPP","POP","PPP", 'P' , Block.cobbleStoneMossy, 'O', Block.obsidian});
        RecipeHelper.Crafting.createRecipe(cobbleBasaltReinforced,8,new Object[]{"PPP","POP","PPP", 'P' , Block.cobbleBasalt, 'O', Block.obsidian});
        RecipeHelper.Crafting.createRecipe(cobbleGraniteReinforced,8,new Object[]{"PPP","POP","PPP", 'P' , Block.cobbleGranite, 'O', Block.obsidian});
        RecipeHelper.Crafting.createRecipe(cobbleLimestoneReinforced,8,new Object[]{"PPP","POP","PPP", 'P' , Block.cobbleLimestone, 'O', Block.obsidian});
        RecipeHelper.Crafting.createRecipe(cobblePermafrostReinforced,8,new Object[]{"PPP","POP","PPP", 'P' , Block.cobblePermafrost, 'O', Block.obsidian});


        RecipeHelper.Crafting.createRecipe(blockRawIron,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.oreRawIron});
        RecipeHelper.Crafting.createRecipe(blockRawGold,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.oreRawGold});

        RecipeHelper.Crafting.createRecipe(Item.oreRawIron,9,new Object[]{"P", 'P' , blockRawIron});
        RecipeHelper.Crafting.createRecipe(Item.oreRawGold,9,new Object[]{"P", 'P' , blockRawGold});


        RecipeHelper.Crafting.createRecipe(marblePolished,2,new Object[]{"P","P", 'P' , Block.marble});
        RecipeHelper.Crafting.createRecipe(permafrostPolished,2,new Object[]{"P","P", 'P' , Block.permafrost});
        RecipeHelper.Crafting.createRecipe(sandstonePolished,2,new Object[]{"P","P", 'P' , Block.sandstone});
        RecipeHelper.Crafting.createRecipe(scorchedstonePolished,2,new Object[]{"P","P", 'P' , scorchedstone});


        RecipeHelper.Crafting.createRecipe(blockBone,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.bone});
        RecipeHelper.Crafting.createRecipe(Item.bone,9,new Object[]{"P", 'P' , blockBone});
        RecipeHelper.Crafting.createRecipe(thatch,4,new Object[]{"PS","SP", 'P' , Item.wheat, 'S' , Item.stick});
        RecipeHelper.Crafting.createRecipe(blockSlime,1,new Object[]{"PP","PP", 'P' , Item.slimeball});
        RecipeHelper.Crafting.createRecipe(Item.slimeball,4,new Object[]{"P", 'P' , blockSlime});
        RecipeHelper.Crafting.createRecipe(blockSulphur,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.sulphur});
        RecipeHelper.Crafting.createRecipe(Item.sulphur,9,new Object[]{"P", 'P' , blockSulphur});
        RecipeHelper.Crafting.createRecipe(blockCloth,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.cloth});
        RecipeHelper.Crafting.createRecipe(Item.cloth,9,new Object[]{"P", 'P' , blockCloth});
        RecipeHelper.Crafting.createRecipe(blockCrudeSteel,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.ingotSteelCrude});
        RecipeHelper.Crafting.createRecipe(Item.ingotSteelCrude,9,new Object[]{"P", 'P' , blockCrudeSteel});
        RecipeHelper.Crafting.createRecipe(blockFlint,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.flint});
        RecipeHelper.Crafting.createRecipe(Item.flint,9,new Object[]{"P", 'P' , blockFlint});
        RecipeHelper.Crafting.createRecipe(blockLeather,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.leather});
        RecipeHelper.Crafting.createRecipe(Item.leather,9,new Object[]{"P", 'P' , blockLeather});


        RecipeHelper.Crafting.createRecipe(blockSugarcane,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.sugarcane});
        RecipeHelper.Crafting.createRecipe(Item.sugarcane,9,new Object[]{"P", 'P' , blockSugarcane});
        RecipeHelper.Crafting.createRecipe(blockPaper,4,new Object[]{"SP","PS", 'P' , Item.paper, 'S', Item.stick});

        RecipeHelper.Crafting.createRecipe(blockWicker,4,new Object[]{"SP","PS", 'P' , Item.wheat, 'S', Item.leather});

        RecipeHelper.Crafting.createRecipe(grassOvergrown,2,new Object[]{"P","P", 'P' , Block.grass});
        RecipeHelper.Crafting.createRecipe(grassRetroOvergrown,2,new Object[]{"P","P", 'P' , Block.grassRetro});
        RecipeHelper.Crafting.createRecipe(grassScorchedOvergrown,2,new Object[]{"P","P", 'P' , Block.grassScorched});
        RecipeHelper.Crafting.createRecipe(pathOvergrown,2,new Object[]{"P","P", 'P' , Block.pathDirt});


        RecipeHelper.Crafting.createRecipe(brickNetherrack,4,new Object[]{"PP","PP", 'P' , Block.netherrack});
        RecipeHelper.Crafting.createRecipe(Block.brickClay,16,new Object[]{"PP","PP", 'P' , clayBaked});
        RecipeHelper.Crafting.createRecipe(scorchedstone,4,new Object[]{"PP","PP", 'P' , Block.dirtScorched});
        RecipeHelper.Crafting.createRecipe(brickScorchedstone,4,new Object[]{"PP","PP", 'P' , scorchedstone});
        RecipeHelper.Crafting.createRecipe(brickMud,4,new Object[]{"PP","PP", 'P' , Block.mudBaked});
        RecipeHelper.Crafting.createRecipe(brickSteel,4,new Object[]{"PP","PP", 'P' , Item.ingotSteel});
        RecipeHelper.Crafting.createRecipe(brickQuartz,4,new Object[]{"PP","PP", 'P' , Item.quartz});
        RecipeHelper.Crafting.createRecipe(brickOlivine,4,new Object[]{"PP","PP", 'P' , Item.olivine});
        RecipeHelper.Crafting.createRecipe(soulslate,4,new Object[]{"PP","PP", 'P' , Block.soulsand});


        RecipeHelper.Crafting.createRecipe(capstoneMarbleCarved,1,new Object[]{"P","P", 'P' , Block.slabCapstoneMarble});
        RecipeHelper.Crafting.createRecipe(Block.capstoneMarble,1,new Object[]{"P", 'P' , capstoneMarbleCarved});
        RecipeHelper.Crafting.createRecipe(Block.basaltCarved,1,new Object[]{"P","P", 'P' , Block.slabBasaltPolished});
        RecipeHelper.Crafting.createRecipe(Block.stoneCarved,1,new Object[]{"P","P", 'P' , Block.slabStonePolished});
        RecipeHelper.Crafting.createRecipe(Block.limestoneCarved,1,new Object[]{"P","P", 'P' , Block.slabLimestonePolished});
        RecipeHelper.Crafting.createRecipe(Block.graniteCarved,1,new Object[]{"P","P", 'P' , Block.slabGranitePolished});
        RecipeHelper.Crafting.createRecipe(marbleCarved,1,new Object[]{"P","P", 'P' , slabMarblePolished});
        RecipeHelper.Crafting.createRecipe(slateCarved,1,new Object[]{"P","P", 'P' , slabSlatePolished});
        RecipeHelper.Crafting.createRecipe(sandstoneCarved,1,new Object[]{"P","P", 'P' , slabSandstonePolished});
        RecipeHelper.Crafting.createRecipe(scorchedstoneCarved,1,new Object[]{"P","P", 'P' , slabScorchedstonePolished});
        RecipeHelper.Crafting.createRecipe(permafrostCarved,1,new Object[]{"P","P", 'P' , slabPermafrostPolished});

        RecipeHelper.Crafting.createRecipe(slabSlatePolished,6,new Object[]{"PPP", 'P' , Block.slatePolished});
        RecipeHelper.Crafting.createRecipe(slabMarblePolished,6,new Object[]{"PPP", 'P' , marblePolished});
        RecipeHelper.Crafting.createRecipe(slabPermafrostPolished,6,new Object[]{"PPP", 'P' , permafrostPolished});
        RecipeHelper.Crafting.createRecipe(slabSandstonePolished,6,new Object[]{"PPP", 'P' , sandstonePolished});
        RecipeHelper.Crafting.createRecipe(slabScorchedstonePolished,6,new Object[]{"PPP", 'P' , scorchedstonePolished});

        RecipeHelper.Crafting.createRecipe(slabBrickGold,6,new Object[]{"PPP", 'P' , Block.brickGold});
        RecipeHelper.Crafting.createRecipe(slabBrickIron,6,new Object[]{"PPP", 'P' , Block.brickIron});
        RecipeHelper.Crafting.createRecipe(slabBrickLapis,6,new Object[]{"PPP", 'P' , Block.brickLapis});
        RecipeHelper.Crafting.createRecipe(slabBrickMud,6,new Object[]{"PPP", 'P' , brickMud});
        RecipeHelper.Crafting.createRecipe(slabBrickNetherrack,6,new Object[]{"PPP", 'P' , brickNetherrack});
        RecipeHelper.Crafting.createRecipe(slabBrickPermafrost,6,new Object[]{"PPP", 'P' , Block.brickPermafrost});
        RecipeHelper.Crafting.createRecipe(slabBrickSandstone,6,new Object[]{"PPP", 'P' , Block.brickSandstone});
        RecipeHelper.Crafting.createRecipe(slabBrickStonePolishedMossy,6,new Object[]{"PPP", 'P' , Block.brickStonePolishedMossy});
        RecipeHelper.Crafting.createRecipe(slabBrickScorchedstone,6,new Object[]{"PPP", 'P' , brickScorchedstone});
        RecipeHelper.Crafting.createRecipe(slabBrickSteel,6,new Object[]{"PPP", 'P' , brickSteel});
        RecipeHelper.Crafting.createRecipe(slabBrickQuartz,6,new Object[]{"PPP", 'P' , brickQuartz});
        RecipeHelper.Crafting.createRecipe(slabBrickOlivine,6,new Object[]{"PPP", 'P' , brickOlivine});

        RecipeHelper.Crafting.createRecipe(slabCobblePermafrost,6,new Object[]{"PPP", 'P' , Block.cobblePermafrost});
        RecipeHelper.Crafting.createRecipe(slabScorchedstone,6,new Object[]{"PPP", 'P' , scorchedstone});

        RecipeHelper.Crafting.createRecipe(stairsBrickGold,6,new Object[]{"P  ", "PP ", "PPP", 'P' , Block.brickGold});
        RecipeHelper.Crafting.createRecipe(stairsBrickIron,6,new Object[]{"P  ", "PP ", "PPP", 'P' , Block.brickIron});
        RecipeHelper.Crafting.createRecipe(stairsBrickLapis,6,new Object[]{"P  ", "PP ", "PPP", 'P' , Block.brickLapis});
        RecipeHelper.Crafting.createRecipe(stairsBrickMud,6,new Object[]{"P  ", "PP ", "PPP", 'P' , brickMud});
        RecipeHelper.Crafting.createRecipe(stairsBrickNetherrack,6,new Object[]{"P  ", "PP ", "PPP", 'P' , brickNetherrack});
        RecipeHelper.Crafting.createRecipe(stairsBrickPermafrost,6,new Object[]{"P  ", "PP ", "PPP", 'P' , Block.brickPermafrost});
        RecipeHelper.Crafting.createRecipe(stairsBrickSandstone,6,new Object[]{"P  ", "PP ", "PPP", 'P' , Block.brickSandstone});
        RecipeHelper.Crafting.createRecipe(stairsBrickScorchedstone,6,new Object[]{"P  ", "PP ", "PPP", 'P' , brickScorchedstone});
        RecipeHelper.Crafting.createRecipe(stairsBrickStonePolishedMossy,6,new Object[]{"P  ", "PP ", "PPP", 'P' , Block.brickStonePolishedMossy});
        RecipeHelper.Crafting.createRecipe(stairsBrickSteel,6,new Object[]{"P  ", "PP ", "PPP", 'P' , brickSteel});
        RecipeHelper.Crafting.createRecipe(stairsBrickQuartz,6,new Object[]{"P  ", "PP ", "PPP", 'P' , brickQuartz});
        RecipeHelper.Crafting.createRecipe(stairsBrickOlivine,6,new Object[]{"P  ", "PP ", "PPP", 'P' , brickOlivine});

        RecipeHelper.Crafting.createRecipe(stairsCobblePermafrost,6,new Object[]{"P  ", "PP ", "PPP", 'P' , Block.cobblePermafrost});

        RecipeHelper.Crafting.createRecipe(blockMushroomRed,4,new Object[]{"PP","PP", 'P' , Block.mushroomRed});
        RecipeHelper.Crafting.createRecipe(blockMushroomBrown,4,new Object[]{"PP","PP", 'P' , Block.mushroomBrown});
        RecipeHelper.Crafting.createRecipe(blockMushroomGray,4,new Object[]{"PP","PP", 'P' , mushroomGray});

        RecipeHelper.Crafting.createRecipe(candleSoulwaxItem,2,new Object[]{"S", "W", 'S', Item.string, 'W', soulwax});


        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 6),new Object[]{"P", 'P' , flowerCyan});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 5),new Object[]{"P", 'P' , flowerPurple});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 9),new Object[]{"P", 'P' , flowerPink});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 7),new Object[]{"P", 'P' , flowerSilver});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 14),new Object[]{"P", 'P' , flowerOrange});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 10),new Object[]{"P", 'P' , flowerLime});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 8),new Object[]{"P", 'P' , mushroomGray});

        RecipeHelper.smeltingManager.addSmelting(logMaple.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(logScorched.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(logShrub.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(barkOak.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(barkOakMossy.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(barkPine.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(barkBirch.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(barkCherry.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(barkEucalyptus.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(barkMaple.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(barkScorched.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(barkShrub.id, new ItemStack(Item.coal, 1, 1));

        RecipeHelper.smeltingManager.addSmelting(Block.blockClay.id, new ItemStack(clayBaked, 1));
        RecipeHelper.smeltingManager.addSmelting(blockSugarcane.id, new ItemStack(blockSugarcaneBaked, 1));

        RecipeHelper.smeltingManager.addSmelting(Block.netherrack.id, new ItemStack(Block.netherrackIgneous, 1));

        RecipeHelper.smeltingManager.addSmelting(Block.soulsand.id, new ItemStack(soulwax, 1));

        RecipeHelper.blastingManager.addSmelting(logMaple.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(logJacaranda.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(logScorched.id, new ItemStack(Item.coal, 2, 1));
        RecipeHelper.blastingManager.addSmelting(logShrub.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(barkOak.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(barkOakMossy.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(barkPine.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(barkBirch.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(barkCherry.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(barkEucalyptus.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(barkMaple.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(barkScorched.id, new ItemStack(Item.coal, 2, 1));
        RecipeHelper.blastingManager.addSmelting(barkShrub.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(barkJacaranda.id, new ItemStack(Item.coal, 1, 1));

        RecipeHelper.blastingManager.addSmelting(Block.blockClay.id, new ItemStack(clayBaked, 1));
        RecipeHelper.blastingManager.addSmelting(blockSugarcane.id, new ItemStack(blockSugarcaneBaked, 1));

        RecipeHelper.blastingManager.addSmelting(Block.netherrack.id, new ItemStack(Block.netherrackIgneous, 1));

        RecipeHelper.blastingManager.addSmelting(Block.soulsand.id, new ItemStack(soulwax, 1));


        LookupFuelFurnace.instance.addFuelEntry(logMaple.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(logJacaranda.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(logScorched.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(logShrub.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(barkOak.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(barkOakMossy.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(barkPine.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(barkBirch.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(barkCherry.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(barkEucalyptus.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(barkMaple.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(barkJacaranda.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(barkScorched.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(barkShrub.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(box.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(boxPainted.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(crate.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(crateSticky.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(bookshelfEmptyPlanksOak.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(thatch.id, 400);
        LookupFuelFurnace.instance.addFuelEntry(blockPaper.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(branch.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(saplingJacaranda.id, 10);
        LookupFuelFurnace.instance.addFuelEntry(saplingMaple.id, 10);
    }
}
