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
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemPlaceable;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.player.inventory.CreativeInventoryCategories;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.RecipeHelper;
import turniplabs.halplibe.mixin.accessors.CraftingManagerAccessor;

import java.util.ArrayList;
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

    public static final Block stickycrate = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(1.0f)
            .setTextures("stickycrate.png")
            .setFlammability(2, 2)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new Block("stickycrate", 525, Material.wood));

    public static final Block box = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.5f)
            .setResistance(5.0f)
            .setTextures(9, 1)
            .setFlammability(2, 2)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new Block("box", 684, Material.wood));

    public static final Block paintedbox = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.5f)
            .setResistance(5.0f)
            .setBlockModel(new BlockModelRenderBlocks(22))
            .setTextures("paintedbox.png")
            .setFlammability(2, 2)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .setBlockColor(new BlockColorPlanksPainted(false))
            .build(new BlockPaintedBox("paintedbox", 685, Material.wood));

    public static final Block emptybookshelf = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 0.8f))
            .setHardness(1.5f)
            .setResistance(1.0f)
            .setTopBottomTexture(4, 0)
            .setFlammability(2, 2)
            .setSideTextures("emptybookshelf.png")
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new Block("emptybookshelf", 101, Material.wood));



    public static final Block oakbark = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.5f)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 20)
            .setSideTextures(0, 20)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("oakbark", 300));

    public static final Block mossyoakbark = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.5f)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 21)
            .setSideTextures(0, 21)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("mossyoakbark", 301));

    public static final Block pinebark = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.5f)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 23)
            .setSideTextures(0, 23)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("pinebark", 302));

    public static final Block birchbark = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.5f)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 24)
            .setSideTextures(0, 24)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("birchbark", 303));

    public static final Block cherrybark = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.5f)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 25)
            .setSideTextures(0, 25)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("cherrybark", 304));

    public static final Block eucabark = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.5f)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 26)
            .setSideTextures(0, 26)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("eucabark", 305));



    public static final BlockBuilder flowerBuilder = new BlockBuilder(MOD_ID)
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setBlockSound(BlockSounds.GRASS)
            .setBlockModel(new BlockModelRenderBlocks(1))
            .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.BROKEN_BY_FLUIDS);

    public static final Block bluebell = flowerBuilder
            .setTextures("bluebell.png")
            .build(new BlockFlower("bluebell", 332));

    public static final Block heather = flowerBuilder
            .setTextures("heather.png")
            .build(new BlockFlower("heather", 333));

    public static final Block orchid = flowerBuilder
            .setTextures("orchid.png")
            .build(new BlockFlower("orchid", 334));

    public static final Block whitedandelion = flowerBuilder
            .setTextures("whitedandelion.png")
            .build(new BlockFlower("whitedandelion", 335));
    public static final Block gladiola = flowerBuilder
            .setTextures("gladiola.png")
            .build(new BlockFlower("gladiola", 336));
    public static final Block clovers = flowerBuilder
            .setTextures("clovers.png")
            .build(new BlockFlower("clovers", 337));



    public static final Block mushroomGray = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setTextures("shroom.png")
            .setBlockModel(new BlockModelRenderBlocks(1))
            .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.BROKEN_BY_FLUIDS)
            .build(new BlockMushroom("mushroom.gray", 342));



    public static final Block compressedcobble = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures(14, 3)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("compressedcobble", 22, Material.stone));

    public static final Block compressedmossycobble = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures(10, 12)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("compressedmossycobble", 23, Material.stone));

    public static final Block compressedbasalt = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures("compressedbasalt.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("compressedbasalt", 24, Material.stone));

    public static final Block compressedgranite = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures("compressedgranite.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("compressedgranite", 25, Material.stone));

    public static final Block compressedlimestone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures("compressedlimestone.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("compressedlimestone", 26, Material.stone));

    public static final Block compressedpermafrost = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures("compressedpermafrost.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("compressedpermafrost", 27, Material.stone));



    public static final Block polishedmarble = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("polishedmarbleside.png")
            .setTopBottomTexture("polishedmarbletop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("polishedmarble", 865, Material.stone));

    public static final Block polishedsandstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("polishedsandstoneside.png")
            .setTopBottomTexture("polishedsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("polishedsandstone", 866, Material.stone));

    public static final Block polishedpermafrost = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("polishedpermafrostside.png")
            .setTopBottomTexture("polishedpermafrostop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("polishedpermafrost", 867, Material.stone));

    public static final Block polishedredsandstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("polishedredsandstoneside.png")
            .setTopBottomTexture("polishedredsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("polishedredsandstone", 868, Material.stone));

    public static final Block marblecarved = new BlockBuilder(MOD_ID)
            .setBlockSound(BlockSounds.STONE)
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures(10, 14)
            .setTopBottomTexture(9, 14)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("marblecarved", 44, Material.stone));

    public static final Block slatecarved = new BlockBuilder(MOD_ID)
            .setBlockSound(BlockSounds.STONE)
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures(6, 14)
            .setTopBottomTexture(8, 14)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("slatecarved", 45, Material.stone));



    public static final Block boneblock = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
            .setHardness(0.8f)
            .setResistance(5.0f)
            .setSideTextures("boneside.png")
            .setTopBottomTexture("bonetop.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockAxisAligned("boneblock", 444, Material.stone));

    public static final Block thatch = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 0.6f, 1.2f))
            .setHardness(0.6f)
            .setResistance(0.6f)
            .setSideTextures("thatchside.png")
            .setTopBottomTexture("thatchtop.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
            .build(new BlockThatch("thatch", 445, Material.grass));

    public static final Block clothblock = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.8f))
            .setHardness(0.8f)
            .setResistance(0.8f)
            .setTextures("clothblock.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_SHEARS)
            .build(new BlockCloth("clothblock", 446, Material.cloth));

    public static final Block slimeblock = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.5f))
            .setHardness(0.2f)
            .setResistance(0.2f)
            .setLightOpacity(6)
            .setTextures("slimeblock.png")
            .setTags(BlockTags.MINEABLE_BY_AXE)
            .build(new BlockSlime("slimeblock", 447, false));

    public static final Block sulphurblock = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
            .setHardness(0.5f)
            .setResistance(0.5f)
            .setTextures("sulphurblock.png")
            .setTags(BlockTags.MINEABLE_BY_SHOVEL)
            .build(new BlockSulphur("sulphurblock", 252, Material.explosive));

    public static final Block sugarcaneblock = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(0.6f)
            .setSideTextures("sugarcaneside.png")
            .setTopBottomTexture("sugarcanetop.png")
            .setFlammability(3, 3)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE)
            .build(new BlockAxisAligned("sugarcaneblock", 448, Material.grass));

    public static final Block leatherblock = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.6f))
            .setHardness(0.8f)
            .setResistance(0.8f)
            .setTextures("leatherblock.png")
            .setFlammability(3, 3)
            .setTags(BlockTags.MINEABLE_BY_AXE)
            .build(new Block("leatherblock", 449, Material.cloth));


    public static final Block rawiron = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0f)
            .setResistance(10.0f)
            .setTextures("rawiron.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("rawiron", 441, Material.metal));

    public static final Block rawgold = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0f)
            .setResistance(10.0f)
            .setTextures("rawgold.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("rawgold", 442, Material.metal));

    public static final Block flintblock = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0f)
            .setResistance(5.0f)
            .setTextures("flintblock.png")
            .setInfiniburn()
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("flintblock", 443, Material.stone));


    public static final Block netherbrick = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setTextures("netherbrick.png")
            .setInfiniburn()
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("netherbrick", 134, Material.stone));

    public static final Block redsandstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8f)
            .setResistance(10.0f)
            .setSideTextures("redsandstoneside.png")
            .setBottomTexture("redsandstonebottom.png")
            .setTopTexture("redsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("redsandstone", 31, Material.stone));

    public static final Block redsandstonebrick = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8f)
            .setResistance(10.0f)
            .setTextures("redsandstonebrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("redsandstonebrick", 135, Material.stone));

    public static final Block soulslate = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.6f))
            .setHardness(2.0f)
            .setResistance(20.0f)
            .setTextures("soulslate.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("soulslate", 811, Material.stone));



    public static final Block bakedclay = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0f)
            .setResistance(10.0f)
            .setTextures("bakedclay.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("bakedclay", 761, Material.stone));



    public static final Block overgrowngrass = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures(0, 0)
            .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.PASSIVE_MOBS_SPAWN, BlockTags.FIREFLIES_CAN_SPAWN)
            .setBlockColor(new BlockColorGrass())
            .build(new Block("overgrowngrass", 203, Material.grass));

    public static final Block overgrownretrograss = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures(8, 1)
            .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.PASSIVE_MOBS_SPAWN, BlockTags.FIREFLIES_CAN_SPAWN)
            .build(new Block("overgrownretrograss", 204, Material.grass));

    public static final Block overgrownpath = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures(4, 6)
            .setTags(BlockTags.MINEABLE_BY_SHOVEL)
            .setBlockDrop(BonusBlocks.overgrownpath)
            .build(new BlockDirtPath("overgrownpath", 206));

    public static final Block overgrownscorchedgrass = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures(16, 11)
            .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.PASSIVE_MOBS_SPAWN, BlockTags.FIREFLIES_CAN_SPAWN)
            .build(new Block("overgrownscorchedgrass", 205, Material.grass));



    public static final Block redmushroomblock = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures("redmushroom.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
            .build(new Block("redmushroomblock", 343, Material.dirt));

    public static final Block brownmushroomblock = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setLuminance(2)
            .setTextures("brownmushroom.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
            .build(new Block("brownmushroomblock", 344, Material.dirt));

    public static final Block graymushroomblock = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures("graymushroom.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
            .build(new Block("graymushroomblock", 345, Material.dirt));



    public static final Block coralred = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 0.8f, 1.2f))
            .setHardness(0.6f)
            .setResistance(0.6f)
            .setLuminance(11)
            .setLightOpacity(0)
            .setTextures("coralred.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("coralred", 232, Material.grass));
    public static final Block coralyellow = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 0.8f, 1.2f))
            .setHardness(0.6f)
            .setResistance(0.6f)
            .setLuminance(11)
            .setLightOpacity(0)
            .setTextures("coralyellow.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("coralyellow", 233, Material.grass));
    public static final Block coralgreen = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 0.8f, 1.2f))
            .setHardness(0.6f)
            .setResistance(0.6f)
            .setLuminance(11)
            .setLightOpacity(0)
            .setTextures("coralgreen.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("coralgreen", 234, Material.grass));
    public static final Block coralcyan = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 0.8f, 1.2f))
            .setHardness(0.6f)
            .setResistance(0.6f)
            .setLuminance(11)
            .setLightOpacity(0)
            .setTextures("coralcyan.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("coralcyan", 235, Material.grass));
    public static final Block coralblue = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 0.8f, 1.2f))
            .setHardness(0.6f)
            .setResistance(0.6f)
            .setLuminance(11)
            .setLightOpacity(0)
            .setTextures("coralblue.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("coralblue", 236, Material.grass));
    public static final Block coralpurple = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 0.8f, 1.2f))
            .setHardness(0.6f)
            .setResistance(0.6f)
            .setLuminance(11)
            .setLightOpacity(0)
            .setTextures("coralpurple.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("coralpurple", 237, Material.grass));
    public static final Block coralpink = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 0.8f, 1.2f))
            .setHardness(0.6f)
            .setResistance(0.6f)
            .setLuminance(11)
            .setLightOpacity(0)
            .setTextures("coralpink.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("coralpink", 238, Material.grass));



    public static final Block jar = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
            .setHardness(0.1f)
            .setResistance(0.1f)
            .setTextures("jar.png")
            .setVisualUpdateOnMetadata()
            .setBlockModel(new BlockModelRenderBlocks(26))
            .setTags(BlockTags.MINEABLE_BY_SWORD, BlockTags.BROKEN_BY_FLUIDS, BlockTags.NOT_IN_CREATIVE_MENU)
            .build(new BlockLanternJar("jar", 874, Material.glass));



    public static final Biome biomeOvergrown = Biomes.register("minecraft:overworld.overgrown", new BiomeOvergrown());
    static
    {
        biomeOvergrown.topBlock = (short) overgrowngrass.id;
        biomeOvergrown.fillerBlock = (short) Block.dirt.id;
    }


    static {
    }

    @Override
    public void onInitialize() {
        LOGGER.info("BonusBlocks initialized.");

        Item.itemsList[paintedbox.id] = new ItemBlockPainted(paintedbox, false);

        Item.jar = new ItemPlaceable("jar", 16519, BonusBlocks.jar).setIconCoord(3, 9);


        RecipeHelper.Crafting.createRecipe(BonusBlocks.crate,4,new Object[]{"PP","PP", 'P' , Block.pistonBase});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.stickycrate,4,new Object[]{"PP","PP", 'P' , Block.pistonBaseSticky});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.box,4,new Object[]{"PP","PP", 'P' , Block.chestPlanksOak});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.paintedbox,4,new Object[]{"PP","PP", 'P' , Block.chestPlanksOakPainted});
        int Color;
        for ( Color = 1; Color <= 15; Color++)
            ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddShapelessRecipe(new ItemStack(paintedbox, 1, Color), new Object[]{paintedbox, new ItemStack(Item.dye, 1, 15 - Color)});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.emptybookshelf,1,new Object[]{"PPP","   ", "PPP", 'P' , Block.planksOak});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.emptybookshelf,1,new Object[]{"PPP","   ", "PPP", 'P' , Block.planksOakPainted});

        RecipeHelper.Crafting.createRecipe(BonusBlocks.oakbark,4,new Object[]{"PP","PP", 'P' , Block.logOak});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.mossyoakbark,4,new Object[]{"PP","PP", 'P' , Block.logOakMossy});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.birchbark,4,new Object[]{"PP","PP", 'P' , Block.logBirch});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.pinebark,4,new Object[]{"PP","PP", 'P' , Block.logPine});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.cherrybark,4,new Object[]{"PP","PP", 'P' , Block.logCherry});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.eucabark,4,new Object[]{"PP","PP", 'P' , Block.logEucalyptus});

        RecipeHelper.Crafting.createRecipe(Block.planksOak,4,new Object[]{"P", 'P' , BonusBlocks.oakbark});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Block.planksOakPainted, 4, 13),new Object[]{"P", 'P' , BonusBlocks.mossyoakbark});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Block.planksOakPainted, 4, 0),new Object[]{"P", 'P' , BonusBlocks.birchbark});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Block.planksOakPainted, 4, 12),new Object[]{"P", 'P' , BonusBlocks.pinebark});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Block.planksOakPainted, 4, 6),new Object[]{"P", 'P' , BonusBlocks.cherrybark});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Block.planksOakPainted, 4, 1),new Object[]{"P", 'P' , BonusBlocks.eucabark});

        RecipeHelper.Crafting.createRecipe(BonusBlocks.compressedcobble,1,new Object[]{"PPP","PPP","PPP", 'P' , Block.cobbleStone});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.compressedmossycobble,1,new Object[]{"PPP","PPP","PPP", 'P' , Block.cobbleStoneMossy});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.compressedbasalt,1,new Object[]{"PPP","PPP","PPP", 'P' , Block.cobbleBasalt});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.compressedgranite,1,new Object[]{"PPP","PPP","PPP", 'P' , Block.cobbleGranite});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.compressedlimestone,1,new Object[]{"PPP","PPP","PPP", 'P' , Block.cobbleLimestone});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.compressedpermafrost,1,new Object[]{"PPP","PPP","PPP", 'P' , Block.cobblePermafrost});

        RecipeHelper.Crafting.createRecipe(Block.cobbleStone,9,new Object[]{"P", 'P' , BonusBlocks.compressedcobble});
        RecipeHelper.Crafting.createRecipe(Block.cobbleStoneMossy,9,new Object[]{"P", 'P' , BonusBlocks.compressedmossycobble});
        RecipeHelper.Crafting.createRecipe(Block.cobbleBasalt,9,new Object[]{"P", 'P' , BonusBlocks.compressedbasalt});
        RecipeHelper.Crafting.createRecipe(Block.cobbleGranite,9,new Object[]{"P", 'P' , BonusBlocks.compressedgranite});
        RecipeHelper.Crafting.createRecipe(Block.cobbleLimestone,9,new Object[]{"P", 'P' , BonusBlocks.compressedlimestone});
        RecipeHelper.Crafting.createRecipe(Block.cobblePermafrost,9,new Object[]{"P", 'P' , BonusBlocks.compressedpermafrost});

        RecipeHelper.Crafting.createRecipe(BonusBlocks.rawiron,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.oreRawIron});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.rawgold,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.oreRawGold});

        RecipeHelper.Crafting.createRecipe(Item.oreRawIron,9,new Object[]{"P", 'P' , BonusBlocks.rawiron});
        RecipeHelper.Crafting.createRecipe(Item.oreRawGold,9,new Object[]{"P", 'P' , BonusBlocks.rawgold});

        RecipeHelper.Crafting.createRecipe(BonusBlocks.polishedmarble,2,new Object[]{"P","P", 'P' , Block.marble});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.polishedpermafrost,2,new Object[]{"P","P", 'P' , Block.permafrost});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.polishedsandstone,2,new Object[]{"P","P", 'P' , Block.sandstone});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.polishedredsandstone,2,new Object[]{"P","P", 'P' , BonusBlocks.redsandstone});

        RecipeHelper.Crafting.createRecipe(BonusBlocks.boneblock,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.bone});
        RecipeHelper.Crafting.createRecipe(Item.bone,9,new Object[]{"P", 'P' , BonusBlocks.boneblock});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.thatch,1,new Object[]{"PSP","SPS","PSP", 'P' , Item.wheat, 'S' , Item.stick});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.slimeblock,1,new Object[]{"PP","PP", 'P' , Item.slimeball});
        RecipeHelper.Crafting.createRecipe(Item.slimeball,4,new Object[]{"P", 'P' , BonusBlocks.slimeblock});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.sulphurblock,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.sulphur});
        RecipeHelper.Crafting.createRecipe(Item.sulphur,9,new Object[]{"P", 'P' , BonusBlocks.sulphurblock});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.clothblock,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.cloth});
        RecipeHelper.Crafting.createRecipe(Item.cloth,9,new Object[]{"P", 'P' , BonusBlocks.clothblock});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.sugarcaneblock,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.sugarcane});
        RecipeHelper.Crafting.createRecipe(Item.sugarcane,9,new Object[]{"P", 'P' , BonusBlocks.sugarcaneblock});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.flintblock,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.flint});
        RecipeHelper.Crafting.createRecipe(Item.flint,9,new Object[]{"P", 'P' , BonusBlocks.flintblock});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.leatherblock,1,new Object[]{"PPP","PPP","PPP", 'P' , Item.leather});
        RecipeHelper.Crafting.createRecipe(Item.leather,9,new Object[]{"P", 'P' , BonusBlocks.leatherblock});


        RecipeHelper.Crafting.createRecipe(BonusBlocks.overgrowngrass,2,new Object[]{"P","P", 'P' , Block.grass});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.overgrownretrograss,2,new Object[]{"P","P", 'P' , Block.grassRetro});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.overgrownscorchedgrass,2,new Object[]{"P","P", 'P' , Block.grassScorched});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.overgrownpath,2,new Object[]{"P","P", 'P' , Block.pathDirt});


        RecipeHelper.Crafting.createRecipe(BonusBlocks.netherbrick,4,new Object[]{"PP","PP", 'P' , Block.netherrack});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.redsandstone,4,new Object[]{"PP","PP", 'P' , Block.dirtScorched});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.redsandstonebrick,4,new Object[]{"PP","PP", 'P' , BonusBlocks.redsandstone});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.soulslate,4,new Object[]{"PP","PP", 'P' , Block.soulsand});

        RecipeHelper.Crafting.createRecipe(Block.capstoneMarble,1,new Object[]{"P","P", 'P' , Block.slabCapstoneMarble});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.marblecarved,1,new Object[]{"P", 'P' , Block.capstoneMarble});
        RecipeHelper.Crafting.createRecipe(Block.basaltCarved,1,new Object[]{"P","P", 'P' , Block.slabBasaltPolished});
        RecipeHelper.Crafting.createRecipe(Block.stoneCarved,1,new Object[]{"P","P", 'P' , Block.slabStonePolished});
        RecipeHelper.Crafting.createRecipe(Block.limestoneCarved,1,new Object[]{"P","P", 'P' , Block.slabLimestonePolished});
        RecipeHelper.Crafting.createRecipe(Block.graniteCarved,1,new Object[]{"P","P", 'P' , Block.slabGranitePolished});

        RecipeHelper.Crafting.createRecipe(BonusBlocks.redmushroomblock,2,new Object[]{"PP","PP", 'P' , Block.mushroomRed});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.brownmushroomblock,2,new Object[]{"PP","PP", 'P' , Block.mushroomBrown});
        RecipeHelper.Crafting.createRecipe(BonusBlocks.graymushroomblock,2,new Object[]{"PP","PP", 'P' , mushroomGray});

        RecipeHelper.Crafting.createRecipe(BonusBlocks.jar,1,new Object[]{"P", 'P' , Item.jar});


        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 6),new Object[]{"P", 'P' , BonusBlocks.bluebell});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 5),new Object[]{"P", 'P' , BonusBlocks.heather});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 9),new Object[]{"P", 'P' , BonusBlocks.orchid});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 7),new Object[]{"P", 'P' , BonusBlocks.whitedandelion});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 14),new Object[]{"P", 'P' , BonusBlocks.gladiola});
        ((CraftingManagerAccessor) RecipeHelper.craftingManager).callAddRecipe(new ItemStack(Item.dye, 2, 10),new Object[]{"P", 'P' , BonusBlocks.clovers});


        RecipeHelper.smeltingManager.addSmelting(BonusBlocks.oakbark.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(BonusBlocks.mossyoakbark.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(BonusBlocks.pinebark.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(BonusBlocks.birchbark.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(BonusBlocks.cherrybark.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.smeltingManager.addSmelting(BonusBlocks.eucabark.id, new ItemStack(Item.coal, 1, 1));

        RecipeHelper.smeltingManager.addSmelting(Block.blockClay.id, new ItemStack(BonusBlocks.bakedclay, 1));


        RecipeHelper.blastingManager.addSmelting(BonusBlocks.oakbark.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(BonusBlocks.mossyoakbark.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(BonusBlocks.pinebark.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(BonusBlocks.birchbark.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(BonusBlocks.cherrybark.id, new ItemStack(Item.coal, 1, 1));
        RecipeHelper.blastingManager.addSmelting(BonusBlocks.eucabark.id, new ItemStack(Item.coal, 1, 1));

        RecipeHelper.blastingManager.addSmelting(Block.blockClay.id, new ItemStack(BonusBlocks.bakedclay, 1));


        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.oakbark.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.mossyoakbark.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.pinebark.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.birchbark.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.cherrybark.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.eucabark.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.box.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.paintedbox.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.crate.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.stickycrate.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.emptybookshelf.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.thatch.id, 400);








    }
}
