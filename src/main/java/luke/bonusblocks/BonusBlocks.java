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
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.RecipeHelper;
import turniplabs.halplibe.mixin.accessors.CraftingManagerAccessor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class    BonusBlocks implements ModInitializer {
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
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .setBlockColor(new BlockColorPlanksPainted(false))
            .build(new BlockPaintedBox("box.painted.png", 685, Material.wood));

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
            .build(new BlockLeavesBase("branch", 299, Material.leaves, false) {
                @Override
                protected Block getSapling() {
                    return null;
                }
            });



    public static final Block barkOak = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.5f)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 20)
            .setSideTextures(0, 20)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.oak", 300));

    public static final Block barkOakMossy = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.5f)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 21)
            .setSideTextures(0, 21)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.oak.mossy", 301));

    public static final Block barkPine = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.5f)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 23)
            .setSideTextures(0, 23)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.pine", 302));

    public static final Block barkBirch = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.5f)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 24)
            .setSideTextures(0, 24)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.birch", 303));

    public static final Block barkCherry = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.5f)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 25)
            .setSideTextures(0, 25)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.cherry", 304));

    public static final Block barkEucalyptus = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.5f)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 26)
            .setSideTextures(0, 26)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.eucalyptus", 305));



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



    public static final Block cobbleStoneCompressed = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures(14, 3)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.stone.compressed", 22, Material.stone));

    public static final Block cobbleStoneMossyCompressed = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures(10, 12)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.stone.mossy.compressed", 23, Material.stone));

    public static final Block cobbleBasaltCompressed = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures("compressedbasalt.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.basalt.compressed", 24, Material.stone));

    public static final Block cobbleGraniteCompressed = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures("compressedgranite.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.granite.compressed", 25, Material.stone));

    public static final Block cobbleLimestoneCompressed = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures("compressedlimestone.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.limestone.compressed", 26, Material.stone));

    public static final Block cobblePermafrostCompressed = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures("compressedpermafrost.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.permafrost.compressed", 27, Material.stone));



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

    public static final Block marbleCarved = new BlockBuilder(MOD_ID)
            .setBlockSound(BlockSounds.STONE)
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures(10, 14)
            .setTopBottomTexture(9, 14)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("marble.carved", 44, Material.stone));

    public static final Block slateCarved = new BlockBuilder(MOD_ID)
            .setBlockSound(BlockSounds.STONE)
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures(6, 14)
            .setTopBottomTexture(8, 14)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("slate.carved", 45, Material.stone));



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

    public static final Block blockSugarcane = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(0.6f)
            .setSideTextures("sugarcaneside.png")
            .setTopBottomTexture("sugarcanetop.png")
            .setFlammability(3, 3)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE)
            .build(new BlockAxisAligned("block.sugarcane", 448, Material.grass));

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

    public static final Block soulslate = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.6f))
            .setHardness(2.0f)
            .setResistance(20.0f)
            .setTextures("soulslate.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("soulslate", 811, Material.stone));



    public static final Block clayBaked = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0f)
            .setResistance(10.0f)
            .setTextures("bakedclay.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("clay.baked", 761, Material.stone));



    public static final Block grassOvergrown = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTopBottomTexture(0, 0)
            .setSideTextures(0, 0)
            .setBlockColor(new BlockColorGrass())
            .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.PASSIVE_MOBS_SPAWN, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
            .build(new BlockOvergrownGrass("grass.overgrown", 203, Material.grass));

    public static final Block grassRetroOvergrown = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures(8, 1)
            .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.PASSIVE_MOBS_SPAWN, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
            .build(new BlockOvergrownGrass("grass.retro.overgrown", 204, Material.grass));

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

//    public static final Block moss = new BlockBuilder(MOD_ID)
//            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 0.9f))
//            .setHardness(0.6f)
//            .setResistance(1.0f)
//            .setTextures("mossblock.png")
//            .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.PASSIVE_MOBS_SPAWN, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
//            .build(new BlockMoss("moss", 244));



    public static final Block blockMushroomRed = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures("redmushroom.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
            .build(new Block("block.mushroom.red", 343, Material.dirt));

    public static final Block blockMushroomBrown = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setLuminance(2)
            .setTextures("brownmushroom.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
            .build(new Block("block.mushroom.brown", 344, Material.dirt));

    public static final Block blockMushroomGray = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures("graymushroom.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
            .build(new Block("block.mushroom.gray", 345, Material.dirt));



/*    public static final Block coralRed = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 0.8f, 0.8f))
            .setHardness(1.2f)
            .setResistance(0.6f)
            .setLuminance(11)
           .setLightOpacity(0)
           .setTextures("coralred.png")
         .setFlammability(4, 4)
        .setTags(BlockTags.MINEABLE_BY_PICKAXE)
       .build(new Block("coral.red", 232, Material.grass));
    public static final Block coralYellow = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 0.8f, 0.8f))
            .setHardness(1.2f)
            .setResistance(0.6f)
            .setLuminance(11)
            .setLightOpacity(0)
            .setTextures("coralyellow.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("coral.yellow", 233, Material.grass));
    public static final Block coralGreen = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 0.8f, 0.8f))
            .setHardness(1.2f)
            .setResistance(0.6f)
            .setLuminance(11)
            .setLightOpacity(0)
            .setTextures("coralgreen.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("coral.green", 234, Material.grass));
    public static final Block coralCyan = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 0.8f, 0.8f))
            .setHardness(1.2f)
            .setResistance(0.6f)
            .setLuminance(11)
            .setLightOpacity(0)
            .setTextures("coralcyan.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("coral.cyan", 235, Material.grass));
    public static final Block coralBlue = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 0.8f, 0.8f))
            .setHardness(1.2f)
            .setResistance(0.6f)
            .setLuminance(11)
            .setLightOpacity(0)
            .setTextures("coralblue.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("coral.blue", 236, Material.grass));
    public static final Block coralPurple = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 0.8f, 0.8f))
            .setHardness(1.2f)
            .setResistance(0.6f)
            .setLuminance(11)
            .setLightOpacity(0)
            .setTextures("coralpurple.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("coral.purple", 237, Material.grass));
    public static final Block coralPink = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 0.8f, 0.8f))
            .setHardness(1.2f)
            .setResistance(0.6f)
            .setLuminance(11)
            .setLightOpacity(0)
            .setTextures("coralpink.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("coral.pink", 238, Material.grass)); */



    public static final Block jar = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
            .setHardness(0.1f)
            .setResistance(0.1f)
            .setTextures("jar.png")
            .setVisualUpdateOnMetadata()
            .setBlockModel(new BlockModelRenderBlocks(26))
            .setTags(BlockTags.MINEABLE_BY_SWORD, BlockTags.BROKEN_BY_FLUIDS, BlockTags.NOT_IN_CREATIVE_MENU)
            .build(new BlockLanternJar("jar", 874, Material.glass));



    static {
    }

    @Override
    public void onInitialize() {
        LOGGER.info("BonusBlocks initialized.");

        ItemToolPickaxe.miningLevels.put(BonusBlocks.blockRawIron, 1);
        ItemToolPickaxe.miningLevels.put(BonusBlocks.blockRawGold, 2);

        Item.itemsList[boxPainted.id] = new ItemBlockPainted(boxPainted, false);

        Item.jar = new ItemJarPlacable("jar", 16519, BonusBlocks.jar).setIconCoord(3, 9);


        RecipeHelper.Crafting.createRecipe(BonusBlocks.crate,4, new Object[]{"PP","PP", 'P' , Block.pistonBase});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.crateSticky,4, new Object[]{"PP","PP", 'P' , Block.pistonBaseSticky});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.box,4, new Object[]{"PP","PP", 'P' , Block.chestPlanksOak});

            for (int color=0;color<16;color++) {
                RecipeHelper.Crafting.createShapelessRecipe(new ItemStack(boxPainted, 1, color), new Object[]{box, new ItemStack(Item.dye, 1, 15 - color)});
            }

        for (int color=0;color<16;color++) {
            RecipeHelper.Crafting.createRecipe(new ItemStack(boxPainted, 4, color), new Object[]{"PP", "PP", 'P', new ItemStack(Block.chestPlanksOakPainted, 1, color << 4)});
        }


        RecipeHelper.craftingManager.addRecipe(new ItemStack(bookshelfEmptyPlanksOak, 1, 0), true, false, new Object[]{"PPP","   ", "PPP", 'P' , Block.planksOak});

        RecipeHelper.Crafting.createRecipe(BonusBlocks.branch,2, new Object[]{"PP","PP", 'P' , Item.stick});

        List<Block> logBlockGroup = new ArrayList<>(Arrays.asList(CraftingManager.blockAlternatives[6]));
        logBlockGroup.add(BonusBlocks.barkOak);
        logBlockGroup.add(BonusBlocks.barkOakMossy);
        logBlockGroup.add(BonusBlocks.barkBirch);
        logBlockGroup.add(BonusBlocks.barkPine);
        logBlockGroup.add(BonusBlocks.barkCherry);
        logBlockGroup.add(BonusBlocks.barkEucalyptus);
        Block[] logBlocks = new Block[logBlockGroup.size()];
        int i = 0;
        for (Block block: logBlockGroup) {
            logBlocks[i] = block;
            i++;
        }
        CraftingManager.blockAlternatives[6] = logBlocks;

        RecipeHelper.Crafting.createRecipe(BonusBlocks.barkOak,4, new Object[]{"PP","PP", 'P' , Block.logOak});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.barkOakMossy,4, new Object[]{"PP","PP", 'P' , Block.logOakMossy});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.barkBirch,4, new Object[]{"PP","PP", 'P' , Block.logBirch});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.barkPine,4, new Object[]{"PP","PP", 'P' , Block.logPine});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.barkCherry,4, new Object[]{"PP","PP", 'P' , Block.logCherry});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.barkEucalyptus,4, new Object[]{"PP","PP", 'P' , Block.logEucalyptus});

        RecipeHelper.Crafting.createRecipe(Block.planksOak,4,new Object[]{"P", 'P' , BonusBlocks.barkOak});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Block.planksOakPainted, 4, 13), new Object[]{"P", 'P' , BonusBlocks.barkOakMossy});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Block.planksOakPainted, 4, 0), new Object[]{"P", 'P' , BonusBlocks.barkBirch});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Block.planksOakPainted, 4, 12), new Object[]{"P", 'P' , BonusBlocks.barkPine});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Block.planksOakPainted, 4, 6), new Object[]{"P", 'P' , BonusBlocks.barkCherry});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Block.planksOakPainted, 4, 1), new Object[]{"P", 'P' , BonusBlocks.barkEucalyptus});


        RecipeHelper.Crafting.createRecipe(BonusBlocks.cobbleStoneCompressed,1,new Object[]{"PPP","PPP","PPP", 'P' , Block.cobbleStone});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.cobbleStoneMossyCompressed,1,new Object[]{"PPP","PPP","PPP", 'P' , Block.cobbleStoneMossy});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.cobbleBasaltCompressed,1,new Object[]{"PPP","PPP","PPP", 'P' , Block.cobbleBasalt});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.cobbleGraniteCompressed,1,new Object[]{"PPP","PPP","PPP", 'P' , Block.cobbleGranite});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.cobbleLimestoneCompressed,1,new Object[]{"PPP","PPP","PPP", 'P' , Block.cobbleLimestone});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.cobblePermafrostCompressed,1,new Object[]{"PPP","PPP","PPP", 'P' , Block.cobblePermafrost});

        RecipeHelper.Crafting.createRecipe(Block.cobbleStone,9,new Object[]{"P", 'P' , BonusBlocks.cobbleStoneCompressed});
        RecipeHelper.Crafting.createRecipe(Block.cobbleStoneMossy,9,new Object[]{"P", 'P' , BonusBlocks.cobbleStoneMossyCompressed});
        RecipeHelper.Crafting.createRecipe(Block.cobbleBasalt,9,new Object[]{"P", 'P' , BonusBlocks.cobbleBasaltCompressed});
        RecipeHelper.Crafting.createRecipe(Block.cobbleGranite,9,new Object[]{"P", 'P' , BonusBlocks.cobbleGraniteCompressed});
        RecipeHelper.Crafting.createRecipe(Block.cobbleLimestone,9,new Object[]{"P", 'P' , BonusBlocks.cobbleLimestoneCompressed});
        RecipeHelper.Crafting.createRecipe(Block.cobblePermafrost,9,new Object[]{"P", 'P' , BonusBlocks.cobblePermafrostCompressed});


        RecipeHelper.Crafting.createRecipe(BonusBlocks.blockRawIron,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.oreRawIron});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.blockRawGold,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.oreRawGold});

        RecipeHelper.Crafting.createRecipe(Item.oreRawIron,9,new Object[]{"P", 'P' , BonusBlocks.blockRawIron});
        RecipeHelper.Crafting.createRecipe(Item.oreRawGold,9,new Object[]{"P", 'P' , BonusBlocks.blockRawGold});

        //         RecipeHelper.Crafting.createRecipe(Block.oreCoalStone,2,new Object[]{"SO", "OS", 'S' , Block.stone, 'O', Item.coal});
        //         RecipeHelper.Crafting.createRecipe(Block.oreIronStone,2,new Object[]{"SO", "OS", 'S' , Block.stone, 'O', Item.oreRawIron});
        //         RecipeHelper.Crafting.createRecipe(Block.oreGoldStone,2,new Object[]{"SO", "OS", 'S' , Block.stone, 'O', Item.oreRawGold});
        //         RecipeHelper.Crafting.createRecipe(Block.oreLapisStone,1,new Object[]{"OOO", "OSO", "OOO", 'S' , Block.stone, 'O', new ItemStack(Item.dye, 1, 4)});
        //         RecipeHelper.Crafting.createRecipe(Block.oreRedstoneStone,1,new Object[]{"OOO", "OSO", "OOO", 'S' , Block.stone, 'O', Item.dustRedstone});
        //         RecipeHelper.Crafting.createRecipe(Block.oreDiamondStone,2,new Object[]{"SO", "OS", 'S' , Block.stone, 'O', Item.diamond});

        //         RecipeHelper.Crafting.createRecipe(Block.oreCoalBasalt,2,new Object[]{"SO", "OS", 'S' , Block.basalt, 'O', Item.coal});
        //         RecipeHelper.Crafting.createRecipe(Block.oreIronBasalt,2,new Object[]{"SO", "OS", 'S' , Block.basalt, 'O', Item.oreRawIron});
        //         RecipeHelper.Crafting.createRecipe(Block.oreGoldBasalt,2,new Object[]{"SO", "OS", 'S' , Block.basalt, 'O', Item.oreRawGold});
        //         RecipeHelper.Crafting.createRecipe(Block.oreLapisBasalt,1,new Object[]{"OOO", "OSO", "OOO", 'S' , Block.basalt, 'O', new ItemStack(Item.dye, 1, 4)});
        //         RecipeHelper.Crafting.createRecipe(Block.oreRedstoneBasalt,1,new Object[]{"OOO", "OSO", "OOO", 'S' , Block.basalt, 'O', Item.dustRedstone});
        //         RecipeHelper.Crafting.createRecipe(Block.oreDiamondBasalt,2,new Object[]{"SO", "OS", 'S' , Block.basalt, 'O', Item.diamond});

        //         RecipeHelper.Crafting.createRecipe(Block.oreCoalGranite,2,new Object[]{"SO", "OS", 'S' , Block.granite, 'O', Item.coal});
        //         RecipeHelper.Crafting.createRecipe(Block.oreIronGranite,2,new Object[]{"SO", "OS", 'S' , Block.granite, 'O', Item.oreRawIron});
        //         RecipeHelper.Crafting.createRecipe(Block.oreGoldGranite,2,new Object[]{"SO", "OS", 'S' , Block.granite, 'O', Item.oreRawGold});
        //         RecipeHelper.Crafting.createRecipe(Block.oreLapisGranite,1,new Object[]{"OOO", "OSO", "OOO", 'S' , Block.granite, 'O', new ItemStack(Item.dye, 1, 4)});
        //         RecipeHelper.Crafting.createRecipe(Block.oreRedstoneGranite,1,new Object[]{"OOO", "OSO", "OOO", 'S' , Block.granite, 'O', Item.dustRedstone});
        //         RecipeHelper.Crafting.createRecipe(Block.oreDiamondGranite,2,new Object[]{"SO", "OS", 'S' , Block.granite, 'O', Item.diamond});

        //         RecipeHelper.Crafting.createRecipe(Block.oreCoalLimestone,2,new Object[]{"SO", "OS", 'S' , Block.limestone, 'O', Item.coal});
        //         RecipeHelper.Crafting.createRecipe(Block.oreIronLimestone,2,new Object[]{"SO", "OS", 'S' , Block.limestone, 'O', Item.oreRawIron});
        //         RecipeHelper.Crafting.createRecipe(Block.oreGoldLimestone,2,new Object[]{"SO", "OS", 'S' , Block.limestone, 'O', Item.oreRawGold});
        //         RecipeHelper.Crafting.createRecipe(Block.oreLapisLimestone,1,new Object[]{"OOO", "OSO", "OOO", 'S' , Block.limestone, 'O', new ItemStack(Item.dye, 1, 4)});
        //        RecipeHelper.Crafting.createRecipe(Block.oreRedstoneLimestone,1,new Object[]{"OOO", "OSO", "OOO", 'S' , Block.limestone, 'O', Item.dustRedstone});
        //         RecipeHelper.Crafting.createRecipe(Block.oreDiamondLimestone,2,new Object[]{"SO", "OS", 'S' , Block.limestone, 'O', Item.diamond});

        //        RecipeHelper.Crafting.createRecipe(Block.oreNethercoalNetherrack,2,new Object[]{"SO", "OS", 'S' , Block.netherrack, 'O', Item.nethercoal});


        RecipeHelper.Crafting.createRecipe(BonusBlocks.marblePolished,2,new Object[]{"P","P", 'P' , Block.marble});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.permafrostPolished,2,new Object[]{"P","P", 'P' , Block.permafrost});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.sandstonePolished,2,new Object[]{"P","P", 'P' , Block.sandstone});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.scorchedstonePolished,2,new Object[]{"P","P", 'P' , BonusBlocks.scorchedstone});


        RecipeHelper.Crafting.createRecipe(BonusBlocks.blockBone,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.bone});
        RecipeHelper.Crafting.createRecipe(Item.bone,9,new Object[]{"P", 'P' , BonusBlocks.blockBone});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.thatch,1,new Object[]{"PSP","SPS","PSP", 'P' , Item.wheat, 'S' , Item.stick});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.blockSlime,1,new Object[]{"PP","PP", 'P' , Item.slimeball});
        RecipeHelper.Crafting.createRecipe(Item.slimeball,4,new Object[]{"P", 'P' , BonusBlocks.blockSlime});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.blockSulphur,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.sulphur});
        RecipeHelper.Crafting.createRecipe(Item.sulphur,9,new Object[]{"P", 'P' , BonusBlocks.blockSulphur});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.blockCloth,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.cloth});
        RecipeHelper.Crafting.createRecipe(Item.cloth,9,new Object[]{"P", 'P' , BonusBlocks.blockCloth});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.blockSugarcane,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.sugarcane});
        RecipeHelper.Crafting.createRecipe(Item.sugarcane,9,new Object[]{"P", 'P' , BonusBlocks.blockSugarcane});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.blockFlint,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.flint});
        RecipeHelper.Crafting.createRecipe(Item.flint,9,new Object[]{"P", 'P' , BonusBlocks.blockFlint});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.blockLeather,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.leather});
        RecipeHelper.Crafting.createRecipe(Item.leather,9,new Object[]{"P", 'P' , BonusBlocks.blockLeather});


        RecipeHelper.Crafting.createRecipe(BonusBlocks.grassOvergrown,2,new Object[]{"P","P", 'P' , Block.grass});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.grassRetroOvergrown,2,new Object[]{"P","P", 'P' , Block.grassRetro});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.grassScorchedOvergrown,2,new Object[]{"P","P", 'P' , Block.grassScorched});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.pathOvergrown,2,new Object[]{"P","P", 'P' , Block.pathDirt});


        RecipeHelper.Crafting.createRecipe(BonusBlocks.brickNetherrack,4,new Object[]{"PP","PP", 'P' , Block.netherrack});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.scorchedstone,4,new Object[]{"PP","PP", 'P' , Block.dirtScorched});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.brickScorchedstone,4,new Object[]{"PP","PP", 'P' , BonusBlocks.scorchedstone});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.brickMud,4,new Object[]{"PP","PP", 'P' , Block.mudBaked});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.soulslate,4,new Object[]{"PP","PP", 'P' , Block.soulsand});


        RecipeHelper.Crafting.createRecipe(Block.capstoneMarble,1,new Object[]{"P","P", 'P' , Block.slabCapstoneMarble});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.marbleCarved,1,new Object[]{"P", 'P' , Block.capstoneMarble});
        RecipeHelper.Crafting.createRecipe(Block.basaltCarved,1,new Object[]{"P","P", 'P' , Block.slabBasaltPolished});
        RecipeHelper.Crafting.createRecipe(Block.stoneCarved,1,new Object[]{"P","P", 'P' , Block.slabStonePolished});
        RecipeHelper.Crafting.createRecipe(Block.limestoneCarved,1,new Object[]{"P","P", 'P' , Block.slabLimestonePolished});
        RecipeHelper.Crafting.createRecipe(Block.graniteCarved,1,new Object[]{"P","P", 'P' , Block.slabGranitePolished});


        RecipeHelper.Crafting.createRecipe(BonusBlocks.blockMushroomRed,2,new Object[]{"PP","PP", 'P' , Block.mushroomRed});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.blockMushroomBrown,2,new Object[]{"PP","PP", 'P' , Block.mushroomBrown});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.blockMushroomGray,2,new Object[]{"PP","PP", 'P' , mushroomGray});



        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 6),new Object[]{"P", 'P' , BonusBlocks.flowerCyan});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 5),new Object[]{"P", 'P' , BonusBlocks.flowerPurple});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 9),new Object[]{"P", 'P' , BonusBlocks.flowerPink});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 7),new Object[]{"P", 'P' , BonusBlocks.flowerSilver});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 14),new Object[]{"P", 'P' , BonusBlocks.flowerOrange});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 10),new Object[]{"P", 'P' , BonusBlocks.flowerLime});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 8),new Object[]{"P", 'P' , BonusBlocks.mushroomGray});


        RecipeHelper.smeltingManager.addSmelting(BonusBlocks.barkOak.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(BonusBlocks.barkOakMossy.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(BonusBlocks.barkPine.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(BonusBlocks.barkBirch.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(BonusBlocks.barkCherry.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(BonusBlocks.barkEucalyptus.id, new ItemStack(Item.coal, 1, 1));

        RecipeHelper.smeltingManager.addSmelting(Block.blockClay.id, new ItemStack(BonusBlocks.clayBaked, 1));

        RecipeHelper.smeltingManager.addSmelting(Block.netherrack.id, new ItemStack(Block.netherrackIgneous, 1));


        RecipeHelper.blastingManager.addSmelting(BonusBlocks.barkOak.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(BonusBlocks.barkOakMossy.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(BonusBlocks.barkPine.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(BonusBlocks.barkBirch.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(BonusBlocks.barkCherry.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(BonusBlocks.barkEucalyptus.id, new ItemStack(Item.coal, 1, 1));

        RecipeHelper.blastingManager.addSmelting(Block.blockClay.id, new ItemStack(BonusBlocks.clayBaked, 1));

        RecipeHelper.blastingManager.addSmelting(Block.netherrack.id, new ItemStack(Block.netherrackIgneous, 1));


        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.barkOak.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.barkOakMossy.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.barkPine.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.barkBirch.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.barkCherry.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.barkEucalyptus.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.box.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.boxPainted.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.crate.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.crateSticky.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.bookshelfEmptyPlanksOak.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.thatch.id, 400);


    }
}
