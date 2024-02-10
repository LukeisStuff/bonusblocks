package luke.bonusblocks;

import luke.bonusblocks.block.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.block.color.BlockColorGrass;
import net.minecraft.client.render.block.color.BlockColorLeavesOak;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.client.render.entity.FallingSandRenderer;
import net.minecraft.client.sound.block.BlockSound;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemPlaceable;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.ItemBlockLeaves;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.item.block.ItemBlockSlab;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.EntityHelper;
import turniplabs.halplibe.helper.ItemHelper;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.ClientStartEntrypoint;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.RecipeEntrypoint;

import java.util.Properties;

import static net.minecraft.core.block.BlockMoss.stoneToMossMap;


public class BonusBlocks implements ModInitializer, RecipeEntrypoint, ClientStartEntrypoint {
    public static final String MOD_ID = "bonusblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static ConfigHandler config;
    private static int blockID;
    private static int itemID;
    static {
        Properties properties = new Properties();
        properties.put("blockID", "1500");
        properties.put("itemID", "16750");
        config = new ConfigHandler(MOD_ID, properties);
        blockID = config.getInt("blockID");
        itemID = config.getInt("itemID");
    }
    /// Blocks

    // Crates
    public static final BlockBuilder crates = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(1.0f)
            .setFlammability(2, 2)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT);

    public static final Block crate = crates
            .setTextures("crate.png")
            .build(new Block("crate", blockID++, Material.wood));
    public static final Block crateSticky = crates
            .setTextures("stickycrate.png")
            .build(new Block("crate.sticky", blockID++, Material.wood));

    // Boxes
    public static final BlockBuilder boxes = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.5f)
            .setResistance(5.0f)
            .setFlammability(2, 2)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT);

    public static final Block box = boxes
            .setTextures(9, 1)
            .build(new Block("box", blockID++, Material.wood));
    public static final Block boxPainted = boxes
            .setTextures("paintedbox.png")
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT, BlockTags.NOT_IN_CREATIVE_MENU)
            .build(new BlockPaintedBox("box.painted", blockID++, Material.wood));

    // Bookshelf
    public static final Block bookshelfEmptyPlanksOak = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 0.8f))
            .setHardness(1.5f)
            .setResistance(1.0f)
            .setTopBottomTexture(4, 0)
            .setFlammability(2, 2)
            .setSideTextures("emptybookshelf.png")
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new Block("bookshelf.empty.planks.oak", blockID++, Material.wood));

    // Obsidian Glass
    public static final BlockBuilder obsidian = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
            .setHardness(5.0f)
            .setResistance(1000.0f)
            .setTextures("obsidianglass.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE);

    public static final Block glassObsidian = obsidian
            .build(new BlockGlassObsidian("glass.obsidian", blockID++, Material.glass, true));
    public static final Block trapdoorGlassObsidian = obsidian
            .setVisualUpdateOnMetadata()
            .build(new BlockTrapDoorObsidian("trapdoor.glass.obsidian", blockID++, Material.glass, false));


    // Leaves and Branch
    public static final BlockBuilder leaves = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.2F)
            .setResistance(0.2F)
            .setFlammability(4, 2)
            .setTickOnLoad()
            .setVisualUpdateOnMetadata()
            .setItemBlock(ItemBlockLeaves::new)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_HOE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS, BlockTags.SHEARS_DO_SILK_TOUCH);

    public static final Block branch = leaves
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 0.5f))
            .setTextures("branch.png")
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockBranch("branch", blockID++, Material.leaves));

    public static final Block leavesOakMossy = leaves
            .setBlockColor(new BlockColorLeavesOak())
            .setSideTextures("mossyleaves.png")
            .setBottomTexture("mossyleavesfast.png")
            .setTopBottomTexture("mossyleaves.png")
            .build(new BlockLeavesOakMossy("leaves.oak.mossy", blockID++));
    public static final Block leavesMaple = leaves
            .setSideTextures("mapleleaves.png")
            .setBottomTexture("mapleleavesfast.png")
            .setTopBottomTexture("mapleleaves.png")
            .build(new BlockLeavesMaple("leaves.maple", blockID++));
    public static final Block leavesJacaranda = leaves
            .setSideTextures("jacaleaves.png")
            .setBottomTexture("jacaleavesfast.png")
            .setTopBottomTexture("jacaleaves.png")
            .build(new BlockLeavesJacaranda("leaves.jacaranda", blockID++));

    // Saplings
    public static final BlockBuilder sapling = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setFlammability(2, 1)
            .setBlockModel(new BlockModelRenderBlocks(1))
            .setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR);

    public static final Block saplingMaple = sapling
            .setTextures("maplesapling.png")
            .build(new BlockSaplingMaple("sapling.maple", blockID++));
    public static final Block saplingJacaranda = sapling
            .setTextures("jacasapling.png")
            .build(new BlockSaplingJacaranda("sapling.jacaranda", blockID++));
    public static final Block saplingOakMossy = sapling
            .setTextures("mossyoaksapling.png")
            .build(new BlockSaplingMossyOak("sapling.oak.mossy", blockID++));

    // Logs
    public static final BlockBuilder log = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT);

    public static final Block logShrub = log
            .setTopBottomTexture("shrublogtop.png")
            .setSideTextures("shrublogside.png")
            .build(new BlockLog("log.shrub", blockID++));
    public static final Block logCacao = log
            .setTopBottomTexture("cacaologtop.png")
            .setSideTextures("cacaologside.png")
            .build(new BlockLog("log.cacao", blockID++));
    public static final Block logMaple = log
            .setTopBottomTexture("maplelogtop.png")
            .setSideTextures("maplelogside.png")
            .build(new BlockLog("log.maple", blockID++));
    public static final Block logJacaranda = log
            .setTopBottomTexture("jacalogtop.png")
            .setSideTextures("jacalogside.png")
            .build(new BlockLog("log.jacaranda", blockID++));
    public static final Block logScorched = log
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.2f))
            .setHardness(1.8f)
            .setTopBottomTexture("charredlogtop.png")
            .setSideTextures("charredlogside.png")
            .build(new BlockLog("log.scorched", blockID++));

    // Bark
    public static final Block barkOak = log
            .setTopBottomTexture(0, 20)
            .setSideTextures(0, 20)
            .build(new BlockLog("bark.oak", blockID++));
    public static final Block barkOakMossy = log
            .setTopBottomTexture(0, 21)
            .setSideTextures(0, 21)
            .build(new BlockLog("bark.oak.mossy", blockID++));

    public static final Block barkPine = log
            .setTopBottomTexture(0, 23)
            .setSideTextures(0, 23)
            .build(new BlockLog("bark.pine", blockID++));

    public static final Block barkBirch = log
            .setTopBottomTexture(0, 24)
            .setSideTextures(0, 24)
            .build(new BlockLog("bark.birch", blockID++));

    public static final Block barkCherry = log
            .setTopBottomTexture(0, 25)
            .setSideTextures(0, 25)
            .build(new BlockLog("bark.cherry", blockID++));

    public static final Block barkEucalyptus = log
            .setTopBottomTexture(0, 26)
            .setSideTextures(0, 26)
            .build(new BlockLog("bark.eucalyptus", blockID++));

    public static final Block barkShrub = log
            .setTopBottomTexture("shrublogside.png")
            .setSideTextures("shrublogside.png")
            .build(new BlockLog("bark.shrub", blockID++));

    public static final Block barkMaple = log
            .setTopBottomTexture("maplelogside.png")
            .setSideTextures("maplelogside.png")
            .build(new BlockLog("bark.maple", blockID++));
    public static final Block barkJacaranda = log
            .setTopBottomTexture("jacalogside.png")
            .setSideTextures("jacalogside.png")
            .build(new BlockLog("bark.jacaranda", blockID++));
    public static final Block barkScorched = log
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.2f))
            .setHardness(1.8f)
            .setTopBottomTexture("charredlogside.png")
            .setSideTextures("charredlogside.png")
            .build(new BlockLog("bark.scorched", blockID++));
    public static final Block barkCacao = log
            .setTopBottomTexture("cacaologside.png")
            .setSideTextures("cacaologside.png")
            .build(new BlockLog("bark.cacao", blockID++));


    // Flowers
    public static final BlockBuilder flower = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setBlockModel(new BlockModelRenderBlocks(1))
            .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR);
    public static final Block flowerCyan = flower
            .setTextures("bluebell.png")
            .build(new BlockFlower("flower.cyan", blockID++));
    public static final Block flowerPurple = flower
            .setTextures("heather.png")
            .build(new BlockFlower("flower.purple", blockID++));
    public static final Block flowerPink = flower
            .setTextures("orchid.png")
            .build(new BlockFlower("flower.pink", blockID++));
    public static final Block flowerSilver = flower
            .setTextures("whitedandelion.png")
            .build(new BlockFlower("flower.silver", blockID++));
    public static final Block flowerOrange = flower
            .setTextures("gladiola.png")
            .build(new BlockFlower("flower.orange", blockID++));
    public static final Block flowerLime = flower
            .setTextures("clovers.png")
            .build(new BlockFlower("flower.lime", blockID++));

    // Mushroom
    public static final Block mushroomGray = flower
            .setTextures("shroom.png")
            .build(new BlockMushroom("mushroom.gray", blockID++));


    // Reinforced
    public static final BlockBuilder reinforced = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE);

    public static final Block cobbleStoneReinforced = reinforced
            .setTextures(14, 3)
            .build(new Block("cobble.stone.reinforced", blockID++, Material.stone));
    public static final Block cobbleStoneMossyReinforced = reinforced
            .setTextures(10, 12)
            .build(new Block("cobble.stone.mossy.reinforced", blockID++, Material.stone));
    public static final Block cobbleBasaltReinforced = reinforced
            .setTextures("compressedbasalt.png")
            .build(new Block("cobble.basalt.reinforced", blockID++, Material.stone));
    public static final Block cobbleGraniteReinforced = reinforced
            .setTextures("compressedgranite.png")
            .build(new Block("cobble.granite.reinforced", blockID++, Material.stone));
    public static final Block cobbleLimestoneReinforced = reinforced
            .setTextures("compressedlimestone.png")
            .build(new Block("cobble.limestone.reinforced", blockID++, Material.stone));
    public static final Block cobblePermafrostReinforced = reinforced
            .setTextures("compressedpermafrost.png")
            .build(new Block("cobble.permafrost.reinforced", blockID++, Material.stone));


    // Scorched Stone
    public static final Block scorchedstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8f)
            .setSideTextures("redsandstoneside.png")
            .setBottomTexture("redsandstonebottom.png")
            .setTopTexture("redsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.GROWS_TREES, BlockTags.GROWS_SPINIFEX, BlockTags.GROWS_FLOWERS, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
            .build(new Block("scorchedstone", blockID++, Material.stone));


    // Stones
    public static final BlockBuilder stone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE);

    // Slate Pillar
    public static final Block pillarSlate = stone
            .setSideTextures("slatepillarside.png")
            .setTopBottomTexture("slatepillartop.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .build(new BlockAxisAligned("pillar.slate", blockID++, Material.stone));

    // Polished Stones
    public static final Block marblePolished = stone
            .setSideTextures("polishedmarbleside.png")
            .setTopBottomTexture("polishedmarbletop.png")
            .build(new Block("marble.polished", blockID++, Material.stone));
    public static final Block sandstonePolished = stone
            .setSideTextures("polishedsandstoneside.png")
            .setTopBottomTexture("polishedsandstonetop.png")
            .build(new Block("sandstone.polished", blockID++, Material.stone));
    public static final Block permafrostPolished = stone
            .setSideTextures("polishedpermafrostside.png")
            .setTopBottomTexture("polishedpermafrostop.png")
            .build(new Block("permafrost.polished", blockID++, Material.stone));
    public static final Block scorchedstonePolished = stone
            .setHardness(0.8f)
            .setSideTextures("polishedredsandstoneside.png")
            .setTopBottomTexture("polishedredsandstonetop.png")
            .build(new Block("scorchedstone.polished", blockID++, Material.stone));

    // Carved Stones
    public static final Block capstoneMarbleCarved = stone
            .setSideTextures(10, 14)
            .setTopBottomTexture(9, 14)
            .build(new Block("capstone.marble.carved", blockID++, Material.stone));
    public static final Block slateCarved = stone
            .setSideTextures(6, 14)
            .setTopBottomTexture(8, 14)
            .build(new Block("slate.carved", blockID++, Material.stone));
    public static final Block marbleCarved = stone
            .setSideTextures(6, 14)
            .setTopBottomTexture(8, 14)
            .build(new Block("marble.carved", blockID++, Material.stone));
    public static final Block sandstoneCarved = stone
            .setSideTextures("carvedsandstone.png")
            .setTopBottomTexture("polishedsandstonetop.png")
            .build(new Block("sandstone.carved", blockID++, Material.stone));
    public static final Block permafrostCarved = stone
            .setSideTextures("carvedpermafrost.png")
            .setTopBottomTexture("polishedpermafrostop.png")
            .build(new Block("permafrost.carved", blockID++, Material.stone));
    public static final Block scorchedstoneCarved = stone
            .setHardness(0.8f)
            .setSideTextures("carvedscorchedstone.png")
            .setTopBottomTexture("polishedredsandstonetop.png")
            .build(new Block("scorchedstone.carved", blockID++, Material.stone));


    public static final Block blockBone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
            .setHardness(0.8f)
            .setResistance(5.0f)
            .setSideTextures("boneside.png")
            .setTopBottomTexture("bonetop.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockAxisAligned("block.bone", blockID++, Material.stone));

    public static final Block thatch = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 0.6f, 1.2f))
            .setHardness(0.6f)
            .setResistance(0.6f)
            .setSideTextures("thatchside.png")
            .setTopBottomTexture("thatchtop.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
            .build(new BlockThatch("thatch", blockID++, Material.grass));

    public static final Block blockCloth = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.8f))
            .setHardness(0.8f)
            .setResistance(0.8f)
            .setTextures("clothblock.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_SHEARS)
            .build(new BlockCloth("block.cloth", blockID++, Material.cloth));

    public static final Block blockSlime = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.5f))
            .setHardness(0.2f)
            .setResistance(0.2f)
            .setLightOpacity(6)
            .setTextures("slimeblock.png")
            .setTags(BlockTags.MINEABLE_BY_AXE)
            .build(new BlockSlime("block.slime", blockID++, false));

    public static final Block blockSulphur = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
            .setHardness(0.5f)
            .setResistance(0.5f)
            .setTextures("sulphurblock.png")
            .setTags(BlockTags.MINEABLE_BY_SHOVEL)
            .build(new BlockSulphur("block.sulphur", blockID++, Material.explosive));

    public static final Block blockSugar = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
            .setHardness(0.3f)
            .setResistance(0.3f)
            .setTextures("sugarblock.png")
            .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.BROKEN_BY_FLUIDS)
            .build(new BlockSand("block.sugar", blockID++));

    public static final Block blockCrudeSteel = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(4.0f)
            .setResistance(1000.0f)
            .setTextures(15, 8)
            .setTags(BlockTags.MINEABLE_BY_AXE)
            .build(new Block("block.steel.crude", blockID++, Material.metal));

    public static final Block blockLeather = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.6f))
            .setHardness(0.8f)
            .setResistance(0.8f)
            .setTextures("leatherblock.png")
            .setFlammability(3, 3)
            .setTags(BlockTags.MINEABLE_BY_AXE)
            .build(new Block("block.leather", blockID++, Material.cloth));

    // Raw Blocks
    public static final BlockBuilder raw = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0f)
            .setResistance(10.0f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE);

    public static final Block blockRawIron = raw
            .setTextures("rawiron.png")
            .build(new Block("block.raw.iron", blockID++, Material.metal));
    public static final Block blockRawGold = raw
            .setTextures("rawgold.png")
            .build(new Block("block.raw.gold", blockID++, Material.metal));
    public static final Block blockFlint = raw
            .setTextures("flintblock.png")
            .setInfiniburn()
            .build(new Block("block.flint", blockID++, Material.stone));

    // Bricks
    public static final BlockBuilder brick = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setResistance(10.0f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE);

    public static final Block brickNetherrack = brick
            .setHardness(1.0f)
            .setTextures("netherbrick.png")
            .setInfiniburn()
            .build(new Block("brick.netherrack", blockID++, Material.stone));
    public static final Block brickScorchedstone = brick
            .setHardness(0.8f)
            .setTextures("redsandstonebrick.png")
            .build(new Block("brick.scorchedstone", blockID++, Material.stone));
    public static final Block brickMud = brick
            .setHardness(1.5f)
            .setTextures("mudbrick.png")
            .build(new Block("brick.mud", blockID++, Material.stone));
    public static final Block brickSteel = brick
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0F)
            .setResistance(4000.0f)
            .setTextures("steelbrick.png")
            .build(new Block("brick.steel", blockID++, Material.metal));
    public static final Block brickQuartz = brick
            .setHardness(3.0f)
            .setTextures("quartzbrick.png")
            .build(new Block("brick.quartz", blockID++, Material.stone));
    public static final Block brickOlivine = brick
            .setHardness(3.0f)
            .setTextures("olivinebrick.png")
            .build(new Block("brick.olivine", blockID++, Material.stone));

    // Soulslate
    public static final Block soulslate = stone
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.6f))
            .setHardness(2.0f)
            .setResistance(20.0f)
            .setTextures("soulslate.png")
            .build(new Block("soulslate", blockID++, Material.stone));

    // Brimstone
    public static final Block brimstone = stone
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.4f))
            .setHardness(400.0f)
            .setResistance(20000.0f)
            .setTextures("brimstone.png")
            .build(new BlockBrimstone("brimstone", blockID++, Material.piston));

    // Baked Clay
    public static final Block clayBaked = stone
            .setHardness(3.0f)
            .setTextures("bakedclay.png")
            .build(new Block("clay.baked", blockID++, Material.stone));

    // Wicker
    public static final Block blockWicker = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
            .setHardness(0.5f)
            .setResistance(0.5f)
            .setTextures(4, 9)
            .setFlammability(3, 3)
            .setTags(BlockTags.MINEABLE_BY_AXE)
            .build(new Block("block.wicker", blockID++, Material.cloth));

    // Pumpkin Pie
    public static final Block pie = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
            .setHardness(0.5f)
            .setResistance(0.5f)
            .setTopTexture("pietop.png")
            .setBottomTexture("piebottom.png")
            .setSideTextures("pieside.png")
            .setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.NOT_IN_CREATIVE_MENU)
            .build(new BlockPie("pie", blockID++));

    // Overgrown Grass
    public static final BlockBuilder grass = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.PASSIVE_MOBS_SPAWN, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH);

    public static final Block grassOvergrown = grass
            .setTextures(0, 0)
            .setBlockColor(new BlockColorGrass())
            .build(new Block("grass.overgrown", blockID++, Material.grass));
    public static final Block grassRetroOvergrown = grass
            .setTextures(8, 1)
            .build(new Block("grass.retro.overgrown", blockID++, Material.grass));
    public static final Block grassScorchedOvergrown = grass
            .setTextures(16, 11)
            .build(new Block("grass.scorched.overgrown", blockID++, Material.grass));
    public static final Block pathOvergrown = grass
            .setTextures(4, 6)
            .setTags(BlockTags.MINEABLE_BY_SHOVEL)
            .setBlockDrop(BonusBlocks.pathOvergrown)
            .build(new BlockDirtPath("path.overgrown", blockID++));


    // Mushroom Blocks
    public static final Block blockMushroomBrown = grass
            .setLuminance(2)
            .setTextures("brownmushroom.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
            .build(new Block("block.mushroom.brown", blockID++, Material.dirt));
    public static final Block blockMushroomRed = grass
            .setTextures("redmushroom.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
            .build(new Block("block.mushroom.red", blockID++, Material.dirt));
    public static final Block blockMushroomGray = grass
            .setTextures("graymushroom.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
            .build(new Block("block.mushroom.gray", blockID++, Material.dirt));


    // Soul Candle
    public static final Block candleSoulwax = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 1.2f))
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setLuminance(10)
            .setTextures(5, 7)
            .setVisualUpdateOnMetadata()
            .setBlockModel(new BlockModelRenderBlocks(25))
            .setTags(BlockTags.MINEABLE_BY_SWORD, BlockTags.BROKEN_BY_FLUIDS, BlockTags.NOT_IN_CREATIVE_MENU)
            .build(new BlockSoulCandle("candle.soulwax", blockID++));


    // Items

    public static Item candleSoulwaxItem = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new ItemPlaceable("candle.soulwax", itemID++, candleSoulwax), "soulwaxcandle.png");

    public static Item soulwax = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new Item("soulwax", itemID++), "soulwax.png");

    public static Item foodPie = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new ItemPlaceable("food.pie", itemID++, pie), "pie.png").setMaxStackSize(1);

    //Slabs
    public static final BlockBuilder slab = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setItemBlock(ItemBlockSlab::new)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE);

    public static final Block slabCobblestoneMossy = slab
            .setHardness(2.0F)
            .setTextures(4, 2)
            .build(new BlockSlab(Block.cobbleStoneMossy, blockID++));
    public static final Block slabSlatePolished = slab
            .setSideTextures(6, 14)
            .setTopBottomTexture(8, 14)
            .build(new BlockSlab(slateCarved, blockID++));
    public static final Block slabMarblePolished = slab
            .setSideTextures("carvedmarble.png")
            .setTopBottomTexture("polishedmarbletop.png")
            .build(new BlockSlab(marbleCarved, blockID++));
    public static final Block slabSandstonePolished = slab
            .setHardness(0.8f)
            .setSideTextures("carvedsandstone.png")
            .setTopBottomTexture("polishedsandstonetop.png")
            .build(new BlockSlab(sandstoneCarved, blockID++));
    public static final Block slabPermafrostPolished = slab
            .setSideTextures("carvedpermafrost.png")
            .setTopBottomTexture("polishedpermafrostop.png")
            .build(new BlockSlab(permafrostCarved, blockID++));
    public static final Block slabScorchedstonePolished = slab
            .setHardness(0.8f)
            .setSideTextures("carvedscorchedstone.png")
            .setTopBottomTexture("polishedredsandstonetop.png")
            .build(new BlockSlab(scorchedstoneCarved, blockID++));
    public static final Block slabBrickStonePolishedMossy = slab
            .setHardness(2.0F)
            .setTextures(11, 8)
            .build(new BlockSlab(Block.brickStonePolishedMossy, blockID++));
    public static final Block slabBrickSandstone = slab
            .setHardness(0.8F)
            .setTextures(0, 14)
            .build(new BlockSlab(Block.brickSandstone, blockID++));
    public static final Block slabBrickGold = slab
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(3.0F)
            .setTextures(9, 9)
            .build(new BlockSlab(Block.brickGold, blockID++));
    public static final Block slabBrickLapis = slab
            .setHardness(3.0F)
            .setTextures(9, 8)
            .build(new BlockSlab(Block.brickLapis, blockID++));
    public static final Block slabBrickPermafrost = slab
            .setTextures(13, 15)
            .build(new BlockSlab(Block.brickPermafrost, blockID++));
    public static final Block slabBrickIron = slab
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0F)
            .setTextures(8, 8)
            .build(new BlockSlab(Block.brickIron, blockID++));
    public static final Block slabBrickNetherrack = slab
            .setTextures("netherbrick.png")
            .build(new BlockSlab(brickNetherrack, blockID++));
    public static final Block slabBrickScorchedstone = slab
            .setHardness(0.8f)
            .setTextures("redsandstonebrick.png")
            .build(new BlockSlab(brickScorchedstone, blockID++));
    public static final Block slabBrickMud = slab
            .setHardness(1.0f)
            .setTextures("mudbrick.png")
            .build(new BlockSlab(brickMud, blockID++));
    public static final Block slabCobblePermafrost = slab
            .setHardness(1.0f)
            .setTextures(12, 15)
            .build(new BlockSlab(Block.cobblePermafrost, blockID++));
    public static final Block slabScorchedstone = slab
            .setHardness(0.8F)
            .setSideTextures("redsandstoneside.png")
            .setBottomTexture("redsandstonebottom.png")
            .setTopTexture("redsandstonetop.png")
            .build(new BlockSlab(scorchedstone, blockID++));
    public static final Block slabBrickSteel = slab
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0f)
            .setResistance(4000.0f)
            .setTextures("steelbrick.png")
            .build(new BlockSlab(brickSteel, blockID++));
    public static final Block slabBrickQuartz = slab
            .setHardness(3.0f)
            .setTextures("quartzbrick.png")
            .build(new BlockSlab(brickQuartz, blockID++));
    public static final Block slabBrickOlivine = slab
            .setHardness(3.0f)
            .setTextures("olivinebrick.png")
            .build(new BlockSlab(brickOlivine, blockID++));


    // Stairs
    public static final BlockBuilder stairs = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE);

    public static final Block stairsCobblestoneMossy = stairs
            .setHardness(2.0F)
            .setTextures(4, 2)
            .build(new BlockStairs(Block.cobbleStoneMossy, blockID++));
    public static final Block stairsBrickStonePolishedMossy = stairs
            .setHardness(2.0F)
            .setTextures(11, 8)
            .build(new BlockStairs(Block.brickStonePolishedMossy, blockID++));
    public static final Block stairsBrickSandstone = stairs
            .setHardness(0.8F)
            .setTextures(0, 14)
            .build(new BlockStairs(Block.brickSandstone, blockID++));
    public static final Block stairsBrickGold = stairs
            .setHardness(3.0F)
            .setTextures(9, 9)
            .build(new BlockStairs(Block.brickGold, blockID++));
    public static final Block stairsBrickLapis = stairs
            .setHardness(3.0F)
            .setTextures(9, 8)
            .build(new BlockStairs(Block.brickLapis, blockID++));
    public static final Block stairsBrickPermafrost = stairs
            .setTextures(13, 15)
            .build(new BlockStairs(Block.brickPermafrost, blockID++));
    public static final Block stairsBrickIron = stairs
            .setHardness(5.0F)
            .setTextures(8, 8)
            .build(new BlockStairs(Block.brickIron, blockID++));
    public static final Block stairsBrickNetherrack = stairs
            .setTextures("netherbrick.png")
            .build(new BlockStairs(brickNetherrack, blockID++));
    public static final Block stairsBrickScorchedstone = stairs
            .setHardness(0.8f)
            .setTextures("redsandstonebrick.png")
            .build(new BlockStairs(brickScorchedstone, blockID++));
    public static final Block stairsBrickMud = stairs
            .setHardness(1.5f)
            .setTextures("mudbrick.png")
            .build(new BlockStairs(brickMud, blockID++));
    public static final Block stairsCobblePermafrost = stairs
            .setHardness(0.8F)
            .setTextures(12, 15)
            .build(new BlockStairs(Block.cobblePermafrost, blockID++));
    public static final Block stairsBrickSteel = stairs
            .setHardness(5.0f)
            .setResistance(4000.0f)
            .setTextures("steelbrick.png")
            .build(new BlockStairs(brickSteel, blockID++));
    public static final Block stairsBrickQuartz = stairs
            .setHardness(3.0f)
            .setTextures("quartzbrick.png")
            .build(new BlockStairs(brickQuartz, blockID++));
    public static final Block stairsBrickOlivine = stairs
            .setHardness(3.0f)
            .setTextures("olivinebrick.png")
            .build(new BlockStairs(brickOlivine, blockID++));

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
        LookupFuelFurnace.instance.addFuelEntry(branch.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(saplingJacaranda.id, 10);
        LookupFuelFurnace.instance.addFuelEntry(saplingMaple.id, 10);
    }

    public void onRecipesReady() {
        RecipeBuilderShaped templateReinforced = new RecipeBuilderShaped(MOD_ID, "XXX", "XOX", "XXX");
        templateReinforced.addInput('X', Block.cobbleStone).addInput('O', Block.obsidian).create("reinforcedCobbledStone", new ItemStack(BonusBlocks.cobbleStoneReinforced, 8));
        templateReinforced.addInput('X', Block.cobbleStoneMossy).addInput('O', Block.obsidian).create("reinforcedCobbledStoneMossy", new ItemStack(BonusBlocks.cobbleStoneMossyReinforced, 8));
        templateReinforced.addInput('X', Block.cobbleBasalt).addInput('O', Block.obsidian).create("reinforcedCobbledBasalt", new ItemStack(BonusBlocks.cobbleBasaltReinforced, 8));
        templateReinforced.addInput('X', Block.cobbleGranite).addInput('O', Block.obsidian).create("reinforcedCobbledGranite", new ItemStack(BonusBlocks.cobbleGraniteReinforced, 8));
        templateReinforced.addInput('X', Block.cobbleLimestone).addInput('O', Block.obsidian).create("reinforcedCobbledLimestone", new ItemStack(BonusBlocks.cobbleLimestoneReinforced, 8));
        templateReinforced.addInput('X', Block.cobblePermafrost).addInput('O', Block.obsidian).create("reinforcedCobbledPermafrost", new ItemStack(BonusBlocks.cobblePermafrostReinforced, 8));

        RecipeBuilderShaped templateLogtoBark = new RecipeBuilderShaped(MOD_ID, "XX", "XX");
        templateLogtoBark.addInput('X', Block.logOak).create("barkOak", new ItemStack(BonusBlocks.barkOak, 4));
        templateLogtoBark.addInput('X', Block.logOakMossy).create("barkOakMossy", new ItemStack(BonusBlocks.barkOakMossy, 4));
        templateLogtoBark.addInput('X', Block.logBirch).create("barkBirch", new ItemStack(BonusBlocks.barkBirch, 4));
        templateLogtoBark.addInput('X', Block.logPine).create("barkPine", new ItemStack(BonusBlocks.barkPine, 4));
        templateLogtoBark.addInput('X', Block.logCherry).create("barkCherry", new ItemStack(BonusBlocks.barkCherry, 4));
        templateLogtoBark.addInput('X', Block.logEucalyptus).create("barkEucalyptus", new ItemStack(BonusBlocks.barkEucalyptus, 4));
        templateLogtoBark.addInput('X', BonusBlocks.logMaple).create("barkMaple", new ItemStack(BonusBlocks.barkMaple, 4));
        templateLogtoBark.addInput('X', BonusBlocks.logJacaranda).create("barkJacaranda", new ItemStack(BonusBlocks.barkJacaranda, 4));
        templateLogtoBark.addInput('X', BonusBlocks.logScorched).create("barkScorched", new ItemStack(BonusBlocks.barkScorched, 4));
        templateLogtoBark.addInput('X', BonusBlocks.logShrub).create("barkShrub", new ItemStack(BonusBlocks.barkShrub, 4));
        templateLogtoBark.addInput('X', BonusBlocks.logCacao).create("logCacao", new ItemStack(BonusBlocks.barkCacao, 4));

        RecipeBuilderShaped templateBarktoPlank = new RecipeBuilderShaped(MOD_ID, "X");
        templateBarktoPlank.addInput('X', BonusBlocks.barkOak).create("barkOaktoPlanks", new ItemStack(Block.planksOak, 4));
        templateBarktoPlank.addInput('X', BonusBlocks.barkOakMossy).create("barkOakMossytoPlanks", new ItemStack(Block.planksOakPainted, 4, 13));
        templateBarktoPlank.addInput('X', BonusBlocks.barkBirch).create("barkBirchtoPlanks", new ItemStack(Block.planksOakPainted, 4, 0));
        templateBarktoPlank.addInput('X', BonusBlocks.barkPine).create("barkPinetoPlanks", new ItemStack(Block.planksOakPainted, 4, 12));
        templateBarktoPlank.addInput('X', BonusBlocks.barkCherry).create("barkCherrytoPlanks", new ItemStack(Block.planksOakPainted, 4, 6));
        templateBarktoPlank.addInput('X', BonusBlocks.barkEucalyptus).create("barkEucalyptustoPlanks", new ItemStack(Block.planksOakPainted, 4, 1));
        templateBarktoPlank.addInput('X', BonusBlocks.barkMaple).create("barkMapletoPlanks", new ItemStack(Block.planksOakPainted, 4, 14));
        templateBarktoPlank.addInput('X', BonusBlocks.barkJacaranda).create("barkJacarandatoPlanks", new ItemStack(Block.planksOakPainted, 4, 10));
        templateBarktoPlank.addInput('X', BonusBlocks.barkScorched).create("barkScorchedtoPlanks", new ItemStack(Block.planksOakPainted, 4, 15));
        templateBarktoPlank.addInput('X', BonusBlocks.barkShrub).create("barkShrubtoPlanks", new ItemStack(Block.planksOakPainted, 4, 8));
        templateBarktoPlank.addInput('X', BonusBlocks.barkCacao).create("barkCacaotoPlanks", new ItemStack(Block.planksOakPainted, 4, 5));

        RecipeBuilderShaped templateLogtoPlank = new RecipeBuilderShaped(MOD_ID, "X");
        templateLogtoPlank.addInput('X', BonusBlocks.logMaple).create("logMapletoPlanks", new ItemStack(Block.planksOakPainted, 4, 14));
        templateLogtoPlank.addInput('X', BonusBlocks.logJacaranda).create("logJacarandatoPlanks", new ItemStack(Block.planksOakPainted, 4, 10));
        templateLogtoPlank.addInput('X', BonusBlocks.logScorched).create("logScorchedtoPlanks", new ItemStack(Block.planksOakPainted, 4, 15));
        templateLogtoPlank.addInput('X', BonusBlocks.logShrub).create("logShrubtoPlanks", new ItemStack(Block.planksOakPainted, 4, 8));
        templateLogtoPlank.addInput('X', BonusBlocks.logCacao).create("logCacaotoPlanks", new ItemStack(Block.planksOakPainted, 4, 5));

        RecipeBuilderShaped templateItemtoBlock = new RecipeBuilderShaped(MOD_ID, "XXX", "XXX", "XXX");
        templateItemtoBlock.addInput('X', Item.bone).create("block_of_bone", new ItemStack(BonusBlocks.blockBone, 1));
        templateItemtoBlock.addInput('X', Item.slimeball).create("block_of_slime", new ItemStack(BonusBlocks.blockSlime, 1));
        templateItemtoBlock.addInput('X', Item.sulphur).create("block_of_sulphur", new ItemStack(BonusBlocks.blockSulphur, 1));
        templateItemtoBlock.addInput('X', Item.dustSugar).create("block_of_sugar", new ItemStack(BonusBlocks.blockSugar, 1));
        templateItemtoBlock.addInput('X', Item.cloth).create("block_of_cloth", new ItemStack(BonusBlocks.blockCloth, 1));
        templateItemtoBlock.addInput('X', Item.ingotSteelCrude).create("block_of_crude_steel", new ItemStack(BonusBlocks.blockCrudeSteel, 1));
        templateItemtoBlock.addInput('X', Item.flint).create("block_of_flint", new ItemStack(BonusBlocks.blockFlint, 1));
        templateItemtoBlock.addInput('X', Item.oreRawGold).create("block_of_raw_gold", new ItemStack(BonusBlocks.blockRawGold, 1));
        templateItemtoBlock.addInput('X', Item.oreRawIron).create("block_of_raw_iron", new ItemStack(BonusBlocks.blockRawIron, 1));
        templateItemtoBlock.addInput('X', Item.leather).create("block_of_leather", new ItemStack(BonusBlocks.blockLeather, 1));

        RecipeBuilderShaped templateBlocktoItem = new RecipeBuilderShaped(MOD_ID, "X");
        templateBlocktoItem.addInput('X', BonusBlocks.blockBone).create("block_of_bone_to_bone", new ItemStack(Item.bone, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockSlime).create("block_of_slime", new ItemStack(Item.slimeball, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockSulphur).create("block_of_sulphur", new ItemStack(Item.sulphur, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockCloth).create("block_of_cloth", new ItemStack(Item.cloth, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockCrudeSteel).create("block_of_crude_steel", new ItemStack(Item.ingotSteelCrude, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockFlint).create("block_of_flint", new ItemStack(Item.flint, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockRawGold).create("block_of_raw_gold", new ItemStack(Item.oreRawGold, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockRawIron).create("block_of_raw_iron", new ItemStack(Item.oreRawIron, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockLeather).create("block_of_leather", new ItemStack(Item.leather, 9));

        RecipeBuilder.Shaped(MOD_ID, "WS", "SW")
                .addInput('W', Item.wheat)
                .addInput('S', Item.stick)
                .create("block_of_thatch", new ItemStack(BonusBlocks.thatch, 4));

        RecipeBuilder.Shaped(MOD_ID, "WS", "SW")
                .addInput('W', Item.wheat)
                .addInput('S', Item.leather)
                .create("block_of_wicker", new ItemStack(BonusBlocks.blockWicker, 4));

        RecipeBuilder.Shaped(MOD_ID, "GGG", "GGG")
                .addInput('G', BonusBlocks.glassObsidian)
                .create("glass_obsidian_trapdoor", new ItemStack(BonusBlocks.trapdoorGlassObsidian, 8));

        RecipeBuilderShaped templateFlowertoDye = new RecipeBuilderShaped(MOD_ID, "X");
        templateFlowertoDye.addInput('X', BonusBlocks.flowerCyan).create("flower_cyan_to_dye", new ItemStack(Item.dye, 2, 6));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerPurple).create("flower_purple_to_dye", new ItemStack(Item.dye, 2, 5));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerPink).create("flower_pink_to_dye", new ItemStack(Item.dye, 2, 9));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerSilver).create("flower_silver_to_dye", new ItemStack(Item.dye, 2, 7));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerOrange).create("flower_orange_to_dye", new ItemStack(Item.dye, 2, 14));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerLime).create("flower_lime_to_dye", new ItemStack(Item.dye, 2, 10));
        templateFlowertoDye.addInput('X', BonusBlocks.mushroomGray).create("mushroom_gray_to_dye", new ItemStack(Item.dye, 2, 8));

        RecipeBuilderShaped templateMushroomToBlock = new RecipeBuilderShaped(MOD_ID, "XX", "XX");
        templateMushroomToBlock.addInput('X', Block.mushroomRed).create("red_mushroom_block", new ItemStack(BonusBlocks.blockMushroomRed, 4));
        templateMushroomToBlock.addInput('X', Block.mushroomBrown).create("brown_mushroom_block", new ItemStack(BonusBlocks.blockMushroomBrown, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.mushroomGray).create("gray_mushroom_block", new ItemStack(BonusBlocks.blockMushroomGray, 4));

        RecipeBuilderShaped templateBricks = new RecipeBuilderShaped(MOD_ID, "XX", "XX");
        templateBricks.addInput('X', Block.netherrack).create("netherrack_bricks", new ItemStack(BonusBlocks.brickNetherrack, 4));
        templateBricks.addInput('X', BonusBlocks.clayBaked).create("clay_bricks", new ItemStack(Block.brickClay, 16));
        templateBricks.addInput('X', BonusBlocks.scorchedstone).create("scorched_bricks", new ItemStack(BonusBlocks.brickScorchedstone, 4));
        templateBricks.addInput('X', Block.mudBaked).create("mud_bricks", new ItemStack(BonusBlocks.brickMud, 4));
        templateBricks.addInput('X', Item.ingotSteel).create("steel_bricks", new ItemStack(BonusBlocks.brickSteel, 4));
        templateBricks.addInput('X', Item.quartz).create("quartz_bricks", new ItemStack(BonusBlocks.brickQuartz, 4));
        templateBricks.addInput('X', Item.olivine).create("olivine_bricks", new ItemStack(BonusBlocks.brickOlivine, 4));
        templateBricks.addInput('X', Block.soulsand).create("soulslate", new ItemStack(BonusBlocks.soulslate, 4));
        templateBricks.addInput('X', BonusBlocks.soulslate).create("brimstone", new ItemStack(BonusBlocks.brimstone, 4));

        templateBricks.addInput('X', Block.dirtScorched).create("scorchedstone", new ItemStack(BonusBlocks.scorchedstone, 4));

        RecipeBuilderShaped templateOvergrown = new RecipeBuilderShaped(MOD_ID, "X", "X");
        templateOvergrown.addInput('X', Block.grass).create("overgrown_grass", new ItemStack(BonusBlocks.grassOvergrown, 2));
        templateOvergrown.addInput('X', Block.grassRetro).create("overgrown_grass_retro", new ItemStack(BonusBlocks.grassRetroOvergrown, 2));
        templateOvergrown.addInput('X', Block.grassScorched).create("overgrown_grass_scorched", new ItemStack(BonusBlocks.grassScorchedOvergrown, 2));
        templateOvergrown.addInput('X', Block.pathDirt).create("overgrown_path", new ItemStack(BonusBlocks.pathOvergrown, 2));

        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("marble_pillar");
        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("green_dye_white_dye_to_lime_dye");

        RecipeBuilder.Shapeless(MOD_ID)
                .addInput(new ItemStack(Item.dye, 1, 2))
                .addInput(new ItemStack(Item.dye, 1, 11))
                .create("green_dye_white_dye_to_lime_dye", new ItemStack(Item.dye, 2, 10));

        RecipeBuilderShaped templatePillar = new RecipeBuilderShaped(MOD_ID, "X", "X", "X");
        templatePillar.addInput('X', Block.marble).create("marble_pillar", new ItemStack(Block.pillarMarble, 3));
        templatePillar.addInput('X', Block.slate).create("slate_pillar", new ItemStack(BonusBlocks.pillarSlate, 3));

        RecipeBuilder.Shaped(MOD_ID, "PI", "IP")
                .addInput('P', Item.ammoPebble)
                .addInput('I', Block.ice)
                .create("pebbles_to_permafrost", new ItemStack(Block.cobblePermafrost, 2));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP", "PPP")
                .addInput('P', Block.planksOak)
                .create("crate", new ItemStack(BonusBlocks.crate, 9));
        RecipeBuilder.Shaped(MOD_ID, "S", "C")
                .addInput('C', BonusBlocks.crate)
                .addInput('S', Item.slimeball)
                .create("crate_sticky", new ItemStack(BonusBlocks.crateSticky, 1));
        RecipeBuilder.Shaped(MOD_ID, "CC", "CC")
                .addInput('C', Block.chestPlanksOak)
                .create("box", new ItemStack(BonusBlocks.box, 8));

        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logMaple.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logScorched.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logShrub.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logJacaranda.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logCacao.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:leaves").add(BonusBlocks.leavesOakMossy.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:leaves").add(BonusBlocks.leavesMaple.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:leaves").add(BonusBlocks.leavesJacaranda.getDefaultStack());

        Registries.ITEM_GROUPS.register("bonusblocks:bark", Registries.stackListOf(BonusBlocks.barkBirch,
                BonusBlocks.barkCacao,
                BonusBlocks.barkCherry,
                BonusBlocks.barkEucalyptus,
                BonusBlocks.barkJacaranda,
                BonusBlocks.barkMaple,
                BonusBlocks.barkOak,
                BonusBlocks.barkOakMossy,
                BonusBlocks.barkPine,
                BonusBlocks.barkScorched,
                BonusBlocks.barkShrub));


                Registries.ITEM_GROUPS.register("bonusblocks:box", Registries.stackListOf(BonusBlocks.box, new ItemStack(BonusBlocks.boxPainted, 1, 0),
                new ItemStack(BonusBlocks.boxPainted, 1, 1),
                new ItemStack(BonusBlocks.boxPainted, 1, 2),
                new ItemStack(BonusBlocks.boxPainted, 1, 3),
                new ItemStack(BonusBlocks.boxPainted, 1, 4),
                new ItemStack(BonusBlocks.boxPainted, 1, 5),
                new ItemStack(BonusBlocks.boxPainted, 1, 6),
                new ItemStack(BonusBlocks.boxPainted, 1, 7),
                new ItemStack(BonusBlocks.boxPainted, 1, 8),
                new ItemStack(BonusBlocks.boxPainted, 1, 9),
                new ItemStack(BonusBlocks.boxPainted, 1, 10),
                new ItemStack(BonusBlocks.boxPainted, 1, 11),
                new ItemStack(BonusBlocks.boxPainted, 1, 12),
                new ItemStack(BonusBlocks.boxPainted, 1, 13),
                new ItemStack(BonusBlocks.boxPainted, 1, 14),
                new ItemStack(BonusBlocks.boxPainted, 1, 15)));

        for (int color = 0; color < 16; color++) {
            RecipeBuilder.Shapeless(MOD_ID)
                    .addInput("bonusblocks:box")
                    .addInput(new ItemStack(Item.dye, 1, 15 - color))
                    .create("painted_box_dye", new ItemStack(BonusBlocks.boxPainted, 1, color));

            RecipeBuilder.Shaped(MOD_ID, "CC", "CC")
                    .addInput('C', new ItemStack(Block.chestPlanksOakPainted, 1, color << 4))
                    .create("painted_box", new ItemStack(BonusBlocks.boxPainted, 8, color));
        }

            RecipeBuilder.Shaped(MOD_ID, "PPP", "   ", "PPP")
                    .addInput('P', ("minecraft:planks"))
                    .create("empty_bookshelf", new ItemStack(BonusBlocks.bookshelfEmptyPlanksOak, 1));

            RecipeBuilder.Shaped(MOD_ID, "PP", "PP")
                    .addInput('P', (Item.stick))
                    .create("branches", new ItemStack(BonusBlocks.branch, 2));


        RecipeBuilderShaped templatePolished = new RecipeBuilderShaped(MOD_ID, "X", "X");
        templatePolished.addInput('X', Block.marble).create("marble_polished", new ItemStack(BonusBlocks.marblePolished, 2));
        templatePolished.addInput('X', Block.permafrost).create("permafrost_polished", new ItemStack(BonusBlocks.permafrostPolished, 2));
        templatePolished.addInput('X', Block.sandstone).create("sandstone_polished", new ItemStack(BonusBlocks.sandstonePolished, 2));
        templatePolished.addInput('X', BonusBlocks.scorchedstone).create("scorchedstone_polished", new ItemStack(BonusBlocks.scorchedstonePolished, 2));

        RecipeBuilderShaped templateCarvedSlab = new RecipeBuilderShaped(MOD_ID, "X", "X");
        templateCarvedSlab.addInput('X', Block.slabCapstoneMarble).create("marble_capstone_carved", new ItemStack(BonusBlocks.capstoneMarbleCarved, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.capstoneMarbleCarved).create("marble_capstone", new ItemStack(Block.capstoneMarble, 2));
        templateCarvedSlab.addInput('X', Block.slabBasaltPolished).create("basalt_carved", new ItemStack(Block.basaltCarved, 1));
        templateCarvedSlab.addInput('X', Block.slabStonePolished).create("stone_carved", new ItemStack(Block.stoneCarved, 1));
        templateCarvedSlab.addInput('X', Block.slabLimestonePolished).create("limestone_carved", new ItemStack(Block.limestoneCarved, 1));
        templateCarvedSlab.addInput('X', Block.slabGranitePolished).create("granite_carved", new ItemStack(Block.graniteCarved, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.slabMarblePolished).create("marble_carved", new ItemStack(BonusBlocks.marbleCarved, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.slabSlatePolished).create("slate_carved", new ItemStack(BonusBlocks.slateCarved, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.slabSandstonePolished).create("sandstone_carved", new ItemStack(BonusBlocks.sandstoneCarved, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.slabScorchedstonePolished).create("scorchedstone_carved", new ItemStack(BonusBlocks.scorchedstoneCarved, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.slabPermafrostPolished).create("permafrost_carved", new ItemStack(BonusBlocks.permafrostCarved, 1));

        RecipeBuilder.Shaped(MOD_ID, "S", "W")
                .addInput('S', (Item.string))
                .addInput('W', (BonusBlocks.soulwax))
                .create("soulwax_candle", new ItemStack(BonusBlocks.candleSoulwaxItem, 2));

        RecipeBuilderShaped templateSlab = new RecipeBuilderShaped(MOD_ID, "XXX");
        templateSlab.addInput('X', Block.slatePolished).create("slate_polished_slab", new ItemStack(BonusBlocks.slabSlatePolished, 3));
        templateSlab.addInput('X', BonusBlocks.marblePolished).create("marble_polished_slab", new ItemStack(BonusBlocks.slabMarblePolished, 3));
        templateSlab.addInput('X', BonusBlocks.sandstonePolished).create("sandstone_polished_slab", new ItemStack(BonusBlocks.slabSandstonePolished, 3));
        templateSlab.addInput('X', BonusBlocks.scorchedstonePolished).create("scorchedstone_polished_slab", new ItemStack(BonusBlocks.slabScorchedstonePolished, 3));
        templateSlab.addInput('X', BonusBlocks.permafrostPolished).create("permafrost_polished_slab", new ItemStack(BonusBlocks.slabPermafrostPolished, 3));
        templateSlab.addInput('X', Block.brickGold).create("gold_brick_slab", new ItemStack(BonusBlocks.slabBrickGold, 3));
        templateSlab.addInput('X', Block.brickIron).create("iron_brick_slab", new ItemStack(BonusBlocks.slabBrickIron, 3));
        templateSlab.addInput('X', Block.brickLapis).create("lapis_brick_slab", new ItemStack(BonusBlocks.slabBrickLapis, 3));
        templateSlab.addInput('X', BonusBlocks.brickMud).create("mud_brick_slab", new ItemStack(BonusBlocks.slabBrickMud, 3));
        templateSlab.addInput('X', BonusBlocks.brickNetherrack).create("netherrack_brick_slab", new ItemStack(BonusBlocks.slabBrickNetherrack, 3));
        templateSlab.addInput('X', Block.brickPermafrost).create("permafrost_brick_slab", new ItemStack(BonusBlocks.slabBrickPermafrost, 3));
        templateSlab.addInput('X', Block.brickSandstone).create("sandstone_brick_slab", new ItemStack(BonusBlocks.slabBrickSandstone, 3));
        templateSlab.addInput('X', Block.brickStonePolishedMossy).create("stone_polished_mossy_brick_slab", new ItemStack(BonusBlocks.slabBrickStonePolishedMossy, 3));
        templateSlab.addInput('X', BonusBlocks.brickScorchedstone).create("scorchedstone_brick_slab", new ItemStack(BonusBlocks.slabBrickScorchedstone, 3));
        templateSlab.addInput('X', BonusBlocks.brickSteel).create("steel_brick_slab", new ItemStack(BonusBlocks.slabBrickSteel, 3));
        templateSlab.addInput('X', BonusBlocks.brickQuartz).create("quartz_brick_slab", new ItemStack(BonusBlocks.slabBrickQuartz, 3));
        templateSlab.addInput('X', BonusBlocks.brickOlivine).create("olivine_brick_slab", new ItemStack(BonusBlocks.slabBrickOlivine, 3));
        templateSlab.addInput('X', Block.cobblePermafrost).create("cobbled_permafrost_slab", new ItemStack(BonusBlocks.slabCobblePermafrost, 3));
        templateSlab.addInput('X', BonusBlocks.scorchedstone).create("scorchedstone_slab", new ItemStack(BonusBlocks.slabScorchedstone, 3));
        templateSlab.addInput('X', Block.cobbleStoneMossy).create("cobblestone_mossy_slab", new ItemStack(BonusBlocks.slabCobblestoneMossy, 3));

        RecipeBuilderShaped templateStairs = new RecipeBuilderShaped(MOD_ID, "X ", "XX ", "XXX");
        templateStairs.addInput('X', Block.brickGold).create("gold_brick_stairs", new ItemStack(BonusBlocks.stairsBrickGold, 6));
        templateStairs.addInput('X', Block.brickIron).create("iron_brick_stairs", new ItemStack(BonusBlocks.stairsBrickIron, 6));
        templateStairs.addInput('X', Block.brickLapis).create("lapis_brick_stairs", new ItemStack(BonusBlocks.stairsBrickLapis, 6));
        templateStairs.addInput('X', BonusBlocks.brickMud).create("mud_brick_stairs", new ItemStack(BonusBlocks.stairsBrickMud, 6));
        templateStairs.addInput('X', BonusBlocks.brickNetherrack).create("netherrack_brick_stairs", new ItemStack(BonusBlocks.stairsBrickNetherrack, 6));
        templateStairs.addInput('X', Block.brickPermafrost).create("permafrost_brick_stairs", new ItemStack(BonusBlocks.stairsBrickPermafrost, 6));
        templateStairs.addInput('X', Block.brickSandstone).create("sandstone_brick_stairs", new ItemStack(BonusBlocks.stairsBrickSandstone, 6));
        templateStairs.addInput('X', Block.brickStonePolishedMossy).create("stone_polished_mossy_brick_stairs", new ItemStack(BonusBlocks.stairsBrickStonePolishedMossy, 6));
        templateStairs.addInput('X', BonusBlocks.brickScorchedstone).create("scorchedstone_brick_stairs", new ItemStack(BonusBlocks.stairsBrickScorchedstone, 6));
        templateStairs.addInput('X', BonusBlocks.brickSteel).create("steel_brick_stairs", new ItemStack(BonusBlocks.stairsBrickSteel, 6));
        templateStairs.addInput('X', BonusBlocks.brickQuartz).create("quartz_brick_stairs", new ItemStack(BonusBlocks.stairsBrickQuartz, 6));
        templateStairs.addInput('X', BonusBlocks.brickOlivine).create("olivine_brick_stairs", new ItemStack(BonusBlocks.stairsBrickOlivine, 6));
        templateStairs.addInput('X', Block.cobblePermafrost).create("cobbled_permafrost_stairs", new ItemStack(BonusBlocks.stairsCobblePermafrost, 6));
        templateSlab.addInput('X', Block.cobbleStoneMossy).create("cobblestone_mossy_stairs", new ItemStack(BonusBlocks.stairsCobblestoneMossy, 6));

        RecipeBuilder.Shaped(MOD_ID, " M ", "SES", "WPW")
                .addInput('M', (Item.bucketMilk))
                .addInput('W', (Item.wheat))
                .addInput('S', (Item.dustSugar))
                .addInput('E', (Item.eggChicken))
                .addInput('P', (Block.pumpkin))
                .create("pumpkin_pie", new ItemStack(BonusBlocks.foodPie, 1));

        RecipeBuilder.Furnace(MOD_ID)
                .setInput("bonusblocks:bark")
                .create("bark_charcoal", new ItemStack(Item.coal, 1, 1));

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(Block.blockClay)
                .create("baked_clay_furnace", BonusBlocks.clayBaked.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(Block.netherrack)
                .create("igneous_netherrack_furnace", Block.netherrackIgneous.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(Block.soulsand)
                .create("soulwax", BonusBlocks.soulwax.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.blockClay)
                .create("baked_clay_blast", BonusBlocks.clayBaked.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.netherrack)
                .create("igneous_netherrack_blast", Block.netherrackIgneous.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.obsidian)
                .create("obsidian_glass", BonusBlocks.glassObsidian.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.soulsand)
                .create("soulwax_blast", BonusBlocks.soulwax.getDefaultStack());

    }

    @Override
    public void beforeClientStart() {
        EntityHelper.Client.assignEntityRenderer(EntitySulphur.class, new FallingSandRenderer());
    }

    @Override
    public void afterClientStart() {
    }
}