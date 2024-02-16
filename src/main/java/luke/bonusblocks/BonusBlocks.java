package luke.bonusblocks;

import luke.bonusblocks.block.*;
import luke.bonusblocks.item.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.block.color.BlockColorGrass;
import net.minecraft.client.render.block.color.BlockColorLeavesOak;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.client.render.entity.FallingSandRenderer;
import net.minecraft.client.sound.block.BlockSound;
import net.minecraft.core.block.*;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemPlaceable;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.*;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import net.minecraft.core.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.*;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.ClientStartEntrypoint;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.RecipeEntrypoint;
import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;
import useless.dragonfly.helper.ModelHelper;
import useless.dragonfly.model.block.BlockModelDragonFly;

import java.util.HashMap;
import java.util.Properties;
import java.util.Random;

import static net.minecraft.core.block.BlockMoss.stoneToMossMap;


public class BonusBlocks implements ModInitializer, RecipeEntrypoint, ClientStartEntrypoint {
    public static final String MOD_ID = "bonusblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static ConfigHandler config;
    private static int itemID;

    public static Block crate;
    public static Block box;
    public static Block boxPainted;
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
    public static Block fungusRed;
    public static Block fungusBrown;
    public static Block fungusGray;
    public static Block blockBone;
    public static Block thatch;
    public static Block blockCloth;
    public static Block blockSlime;
    public static Block blockSulphur;
    public static Block blockSugar;
    public static Block blockLeather;
    public static Block blockWicker;
    public static Block blockRawGold;
    public static Block blockRawIron;
    public static Block blockRawCopper;
    public static Block blockRawCopperTarnished;
    public static Block blockRawCopperCorroded;
    public static Block blockRawSilver;
    public static Block blockFlint;
    public static Block blockCrudeSteel;
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
    public static Block blockCopper;
    public static Block blockCopperTarnished;
    public static Block blockCopperCorroded;
    public static Block meshCopper;
    public static Block meshCopperTarnished;
    public static Block meshCopperCorroded;
    public static Block pipeCopper;
    public static Block pipeCopperTarnished;
    public static Block pipeCopperCorroded;
    public static Block trapdoorCopper;
    public static Block trapdoorCopperTarnished;
    public static Block trapdoorCopperCorroded;
    public static Block doorCopperTop;
    public static Block doorCopperBottom;
    public static Block doorCopperTarnishedTop;
    public static Block doorCopperTarnishedBottom;
    public static Block doorCopperCorrodedTop;
    public static Block doorCopperCorrodedBottom;
    public static Block fenceCopper;
    public static Block fenceCopperTarnished;
    public static Block fenceCopperCorroded;
    public static Block pressureplateCopper;
    public static Block pressureplateCopperTarnished;
    public static Block pressureplateCopperCorroded;
    public static Block trapdoorSteel;
    public static Block doorSteelTop;
    public static Block doorSteelBottom;
    public static Block blockSilver;
    public static Block trapdoorSilver;
    public static Block doorSilverTop;
    public static Block doorSilverBottom;
    public static Block fenceSilver;
    public static Block chandolierSilver;
    public static Block lanternSilver;
    public static Block vaseSilver;
    public static Block vaneSilver;
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
    public static Block stairsCopper;
    public static Block stairsCopperTarnished;
    public static Block stairsCopperCorroded;

    protected static final Toml cfg = new Toml();
    protected static Toml registry;

    protected static final TomlConfigHandler hndlr;
    protected static void write() {
        hndlr.writeConfig();
    }

    static BlockBuilder crates = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(1.0f)
            .setFlammability(5, 20)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT);

    public static BlockBuilder boxes = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.5f)
            .setResistance(5.0f)
            .setFlammability(5, 20)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT);

    public static final BlockBuilder leaves = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.2F)
            .setResistance(0.2F)
            .setFlammability(30, 60)
            .setTickOnLoad()
            .setVisualUpdateOnMetadata()
            .setItemBlock(ItemBlockLeaves::new)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_HOE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS, BlockTags.SHEARS_DO_SILK_TOUCH);

    public static final BlockBuilder sapling = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setBlockModel(new BlockModelRenderBlocks(1))
            .setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR);

    public static final BlockBuilder log = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(5, 5)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT);

    public static final BlockBuilder grass = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.PASSIVE_MOBS_SPAWN, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH);

    public static final BlockBuilder flower = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setBlockModel(new BlockModelRenderBlocks(1))
            .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR);

    public static final BlockBuilder petal = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(0.6f)
            .setFlammability(30, 60)
            .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.GROWS_FLOWERS, BlockTags.MINEABLE_BY_AXE);

    public static final BlockBuilder petalLayer = petal
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setUseInternalLight()
            .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.BROKEN_BY_FLUIDS, BlockTags.MINEABLE_BY_AXE);

    public static final BlockBuilder raw = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0f)
            .setResistance(10.0f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE);

    public static final BlockBuilder pebble = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setBlockModel(new BlockModelRenderBlocks(29))
            .setVisualUpdateOnMetadata()
            .setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.NOT_IN_CREATIVE_MENU);

    private static final BlockBuilder ore = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0f)
            .setResistance(5.0f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE);

    private static final BlockBuilder silver = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 2.0f))
            .setHardness(0.8f)
            .setResistance(2.0f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE);

    public static final BlockBuilder stone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE);

    public static final BlockBuilder obsidian = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
            .setHardness(5.0f)
            .setResistance(1000.0f)
            .setTextures("obsidianglass.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE);

    public static final BlockBuilder brick = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setResistance(10.0f)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE);

    public static final BlockBuilder slab = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setItemBlock(ItemBlockSlab::new)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE);

    public static final BlockBuilder stairs = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE);

    static {

        Properties properties = new Properties();
        properties.put("itemID", "16750");
        config = new ConfigHandler(MOD_ID, properties);
        itemID = config.getInt("itemID");
        Toml registry = cfg.addCategory("registry");
        registry.addCategory("block");
        registry.addCategory("item");
        hndlr = new TomlConfigHandler("bonusblocks", cfg);
        registry = hndlr.getRawParsed().get(".registry", Toml.class);
        Toml block = registry.get(".block", Toml.class);
        BlockHelper.reserveRuns("bonusblocks", block, 182, ids -> {

            /// Blocks

            // Crates
            crate = crates
                    .setTextures("crate.png")
                    .build(new Block("crate", ids.next(), Material.wood));

            // Boxes
            box = boxes
                    .setTextures(9, 1)
                    .build(new Block("box", ids.next(), Material.wood));
            boxPainted = boxes
                    .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT, BlockTags.NOT_IN_CREATIVE_MENU)
                    .build(new BlockPaintedBox("box.painted", ids.next()));


            // Bookshelf
            bookshelfEmptyPlanksOak = new BlockBuilder(MOD_ID)
                    .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 0.8f))
                    .setHardness(1.5f)
                    .setResistance(1.0f)
                    .setTopBottomTexture(4, 0)
                    .setSideTextures("emptybookshelf.png")
                    .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
                    .build(new Block("bookshelf.empty.planks.oak", ids.next(), Material.wood));

            // Leaves and Branch
            branch = leaves
                    .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 0.5f))
                    .setTextures("branch.png")
                    .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
                    .build(new BlockBranch("branch", ids.next(), Material.leaves));

            leavesOakMossy = leaves
                    .setBlockColor(new BlockColorLeavesOak())
                    .setSideTextures("mossyleaves.png")
                    .setBottomTexture("mossyleavesfast.png")
                    .setTopBottomTexture("mossyleaves.png")
                    .build(new BlockLeavesBase("leaves.oak.mossy", ids.next(), Material.leaves, true) {
                        @Override
                        protected Block getSapling() {
                            return BonusBlocks.saplingOakMossy;
                        }
                    });
            leavesMaple = leaves
                    .setSideTextures("mapleleaves.png")
                    .setBottomTexture("mapleleavesfast.png")
                    .setTopBottomTexture("mapleleaves.png")
                    .build(new BlockLeavesBase("leaves.maple", ids.next(), Material.leaves, true) {
                        @Override
                        protected Block getSapling() {
                            return BonusBlocks.saplingMaple;
                        }
                    });
            leavesJacaranda = leaves
                    .setSideTextures("jacaleaves.png")
                    .setBottomTexture("jacaleavesfast.png")
                    .setTopBottomTexture("jacaleaves.png")
                    .build(new BlockLeavesBase("leaves.jacaranda", ids.next(), Material.leaves, true) {
                        @Override
                        protected Block getSapling() {
                            return BonusBlocks.saplingJacaranda;
                        }
                    });


            // Saplings
            saplingMaple = sapling
                    .setTextures("maplesapling.png")
                    .build(new BlockSaplingMaple("sapling.maple", ids.next()));
            saplingJacaranda = sapling
                    .setTextures("jacasapling.png")
                    .build(new BlockSaplingJacaranda("sapling.jacaranda", ids.next()));
            saplingOakMossy = sapling
                    .setTextures("mossyoaksapling.png")
                    .build(new BlockSaplingMossyOak("sapling.oak.mossy", ids.next()));


            // Logs
            logShrub = log
                    .setTopBottomTexture("shrublogtop.png")
                    .setSideTextures("shrublogside.png")
                    .build(new BlockLog("log.shrub", ids.next()));
            logCacao = log
                    .setTopBottomTexture("cacaologtop.png")
                    .setSideTextures("cacaologside.png")
                    .build(new BlockLog("log.cacao", ids.next()));
            logMaple = log
                    .setTopBottomTexture("maplelogtop.png")
                    .setSideTextures("maplelogside.png")
                    .build(new BlockLog("log.maple", ids.next()));
            logJacaranda = log
                    .setTopBottomTexture("jacalogtop.png")
                    .setSideTextures("jacalogside.png")
                    .build(new BlockLog("log.jacaranda", ids.next()));
            logScorched = log
                    .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.2f))
                    .setHardness(1.8f)
                    .setTopBottomTexture("charredlogtop.png")
                    .setSideTextures("charredlogside.png")
                    .build(new BlockLog("log.scorched", ids.next()));


            // Overgrown Grass
            overgrownGrass = grass
                    .setTextures(0, 0)
                    .setBlockColor(new BlockColorGrass())
                    .build(new Block("grass.overgrown", ids.next(), Material.grass));
            overgrownGrassRetro = grass
                    .setTextures(8, 1)
                    .build(new Block("grass.retro.overgrown", ids.next(), Material.grass));
            overgrownGrassScorched = grass
                    .setTextures(16, 11)
                    .build(new Block("grass.scorched.overgrown", ids.next(), Material.grass));
            overgrownPath = grass
                    .setTextures(4, 6)
                    .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                    .setBlockDrop(BonusBlocks.overgrownPath)
                    .build(new BlockDirtPath("path.overgrown", ids.next()));

            // Flowers
            flowerCyan = flower
                    .setTextures("bluebell.png")
                    .build(new BlockFlower("flower.cyan", ids.next()));
            flowerPurple = flower
                    .setTextures("heather.png")
                    .build(new BlockFlower("flower.purple", ids.next()));
            flowerPink = flower
                    .setTextures("orchid.png")
                    .build(new BlockFlower("flower.pink", ids.next()));
            flowerSilver = flower
                    .setTextures("whitedandelion.png")
                    .build(new BlockFlower("flower.silver", ids.next()));
            flowerOrange = flower
                    .setTextures("gladiola.png")
                    .build(new BlockFlower("flower.orange", ids.next()));
            flowerLightBlue = flower
                    .setTextures("pansy.png")
                    .build(new BlockFlower("flower.lightblue", ids.next()));
            flowerMagenta = flower
                    .setTextures("hyacinth.png")
                    .build(new BlockFlower("flower.magenta", ids.next()));
            flowerLime = flower
                    .setTextures("clovers.png")
                    .build(new BlockFlower("flower.lime", ids.next()));

            // Petals
            petalYellow = petal
                    .setTextures("yellowpetal.png")
                    .build(new BlockPetal("petal.yellow", ids.next(), Material.grass));
            petalRed = petal
                    .setTextures("redpetal.png")
                    .build(new BlockPetal("petal.red", ids.next(), Material.grass));
            petalCyan = petal
                    .setTextures("cyanpetal.png")
                    .build(new BlockPetal("petal.cyan", ids.next(), Material.grass));
            petalPurple = petal
                    .setTextures("purplepetal.png")
                    .build(new BlockPetal("petal.purple", ids.next(), Material.grass));
            petalPink = petal
                    .setTextures("pinkpetal.png")
                    .build(new BlockPetal("petal.pink", ids.next(), Material.grass));
            petalSilver = petal
                    .setTextures("silverpetal.png")
                    .build(new BlockPetal("petal.silver", ids.next(), Material.grass));
            petalOrange = petal
                    .setTextures("orangepetal.png")
                    .build(new BlockPetal("petal.orange", ids.next(), Material.grass));
            petalLightBlue = petal
                    .setTextures("lightbluepetal.png")
                    .build(new BlockPetal("petal.lightblue", ids.next(), Material.grass));
            petalMagenta = petal
                    .setTextures("magentapetal.png")
                    .build(new BlockPetal("petal.magenta", ids.next(), Material.grass));
            petalLime = petal
                    .setTextures("limepetal.png")
                    .build(new BlockPetal("petal.lime", ids.next(), Material.grass));

            // Petal Layers
            petalLayerYellow = petalLayer
                    .setTextures("yellowpetallayer.png")
                    .build(new BlockLayerPetal("layer.petal.yellow", ids.next(), Material.grass));
            petalLayerRed = petalLayer
                    .setTextures("redpetallayer.png")
                    .build(new BlockLayerPetal("layer.petal.red", ids.next(), Material.grass));
            petalLayerCyan = petalLayer
                    .setTextures("cyanpetallayer.png")
                    .build(new BlockLayerPetal("layer.petal.cyan", ids.next(), Material.grass));
            petalLayerPurple = petalLayer
                    .setTextures("purplepetallayer.png")
                    .build(new BlockLayerPetal("layer.petal.purple", ids.next(), Material.grass));
            petalLayerPink = petalLayer
                    .setTextures("pinkpetallayer.png")
                    .build(new BlockLayerPetal("layer.petal.pink", ids.next(), Material.grass));
            petalLayerSilver = petalLayer
                    .setTextures("silverpetallayer.png")
                    .build(new BlockLayerPetal("layer.petal.silver", ids.next(), Material.grass));
            petalLayerOrange = petalLayer
                    .setTextures("orangepetallayer.png")
                    .build(new BlockLayerPetal("layer.petal.orange", ids.next(), Material.grass));
            petalLayerLightBlue = petalLayer
                    .setTextures("lightbluepetallayer.png")
                    .build(new BlockLayerPetal("layer.petal.lightblue", ids.next(), Material.grass));
            petalLayerMagenta = petalLayer
                    .setTextures("magentapetallayer.png")
                    .build(new BlockLayerPetal("layer.petal.magenta", ids.next(), Material.grass));
            petalLayerLime = petalLayer
                    .setTextures("limepetallayer.png")
                    .build(new BlockLayerPetal("layer.petal.lime", ids.next(), Material.grass));

            // Mushroom
            mushroomGray = flower
                    .setTextures("shroom.png")
                    .build(new BlockMushroom("mushroom.gray", ids.next()));

            // Mushroom Blocks
            fungusBrown = grass
                    .setLuminance(2)
                    .setTextures("brownmushroom.png")
                    .setFlammability(30, 60)
                    .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                    .build(new Block("block.mushroom.brown", ids.next(), Material.dirt));
            fungusRed = grass
                    .setTextures("redmushroom.png")
                    .setFlammability(30, 60)
                    .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                    .build(new Block("block.mushroom.red", ids.next(), Material.dirt));
            fungusGray = grass
                    .setTextures("graymushroom.png")
                    .setFlammability(30, 60)
                    .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
                    .build(new Block("block.mushroom.gray", ids.next(), Material.dirt));

            // Bone Block
            blockBone = new BlockBuilder(MOD_ID)
                    .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
                    .setHardness(0.8f)
                    .setResistance(5.0f)
                    .setSideTextures("boneside.png")
                    .setTopBottomTexture("bonetop.png")
                    .setBlockModel(new BlockModelRenderBlocks(27))
                    .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                    .build(new BlockAxisAligned("block.bone", ids.next(), Material.stone));

            // Thatch
            thatch = new BlockBuilder(MOD_ID)
                    .setBlockSound(new BlockSound("step.grass", "step.grass", 0.6f, 1.2f))
                    .setHardness(0.6f)
                    .setResistance(0.6f)
                    .setSideTextures("thatchside.png")
                    .setTopBottomTexture("thatchtop.png")
                    .setFlammability(60, 120)
                    .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
                    .build(new BlockThatch("thatch", ids.next(), Material.grass));

            // Cloth Block
            blockCloth = new BlockBuilder(MOD_ID)
                    .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.8f))
                    .setHardness(0.8f)
                    .setResistance(0.8f)
                    .setTextures("clothblock.png")
                    .setFlammability(30, 60)
                    .setTags(BlockTags.MINEABLE_BY_SHEARS)
                    .build(new BlockCloth("block.cloth", ids.next(), Material.cloth));

            // Slime Block
            blockSlime = new BlockBuilder(MOD_ID)
                    .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.5f))
                    .setHardness(0.2f)
                    .setResistance(0.2f)
                    .setLightOpacity(6)
                    .setTextures("slimeblock.png")
                    .setTags(BlockTags.MINEABLE_BY_AXE)
                    .build(new BlockSlime("block.slime", ids.next(), false));

            // Sulphur Block
            blockSulphur = new BlockBuilder(MOD_ID)
                    .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                    .setHardness(0.5f)
                    .setResistance(0.5f)
                    .setTextures("sulphurblock.png")
                    .setTags(BlockTags.MINEABLE_BY_SHOVEL)
                    .build(new BlockSulphur("block.sulphur", ids.next(), Material.explosive));

            // Sugar Block
            blockSugar = new BlockBuilder(MOD_ID)
                    .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 0.8f))
                    .setHardness(0.3f)
                    .setResistance(0.3f)
                    .setTextures("sugarblock.png")
                    .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.BROKEN_BY_FLUIDS)
                    .build(new BlockSand("block.sugar", ids.next()));

            // Leather Block
            blockLeather = new BlockBuilder(MOD_ID)
                    .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 0.6f))
                    .setHardness(0.8f)
                    .setResistance(0.8f)
                    .setTextures("leatherblock.png")
                    .setFlammability(5, 10)
                    .setTags(BlockTags.MINEABLE_BY_AXE)
                    .build(new Block("block.leather", ids.next(), Material.cloth));

            // Wicker Block
            blockWicker = new BlockBuilder(MOD_ID)
                    .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                    .setHardness(0.5f)
                    .setResistance(0.5f)
                    .setTextures(4, 9)
                    .setFlammability(60, 120)
                    .setTags(BlockTags.MINEABLE_BY_AXE)
                    .build(new Block("block.wicker", ids.next(), Material.cloth));
            blockFlint = raw
                    .setTextures("flintblock.png")
                    .setInfiniburn()
                    .build(new Block("block.flint", ids.next(), Material.stone));
            blockCrudeSteel = new BlockBuilder(MOD_ID)
                    .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                    .setHardness(4.0f)
                    .setResistance(1000.0f)
                    .setTextures("crudesteel.png")
                    .setTags(BlockTags.MINEABLE_BY_AXE)
                    .build(new Block("block.steel.crude", ids.next(), Material.metal));

            // Raw Blocks
            blockRawIron = raw
                    .setTextures("rawiron.png")
                    .build(new Block("block.raw.iron", ids.next(), Material.metal));
            blockRawGold = raw
                    .setTextures("rawgold.png")
                    .build(new Block("block.raw.gold", ids.next(), Material.metal));
            blockRawCopper = raw
                    .setTextures("rawcopper.png")
                    .setTicking(true)
                    .build(new Block("block.raw.copper", ids.next(), Material.metal) {
                        private int ticks;
                        @Override
                        public void updateTick(World world, int x, int y, int z, Random rand) {
                            if (world.getBlockMetadata(x, y, z) == 0) {
                                ++this.ticks;
                                if (this.ticks == 200) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.blockRawCopperTarnished.id, world.getBlockMetadata(x, y, z));
                                    this.ticks = 0;
                                }
                            }
                        }
                    });
            blockRawCopperTarnished = raw
                    .setTextures("rawtarnishedcopper.png")
                    .setTicking(true)
                    .build(new Block("block.raw.copper.tarnished", ids.next(), Material.metal) {
                        private int ticks;
                        @Override
                        public void updateTick(World world, int x, int y, int z, Random rand) {
                            if (world.getBlockMetadata(x, y, z) == 0) {
                                ++this.ticks;
                                if (this.ticks == 200) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.blockRawCopperCorroded.id, world.getBlockMetadata(x, y, z));
                                    this.ticks = 0;
                                }
                            }
                        }
                    });
            blockRawCopperCorroded = raw
                    .setTextures("rawcorrodedcopper.png")
                    .build(new Block("block.raw.copper.corroded", ids.next(), Material.metal));
            blockRawSilver = silver
                    .setTextures("rawsilver.png")
                    .build(new Block("block.raw.silver", ids.next(), Material.metal));

            // Nuggets
            overlayRawIron = pebble
                    .setTextures("ironpebble1.png")
                    .setTextures("ironpebble2.png")
                    .setTextures("ironpebble3.png")
                    .build(new BlockOverlayRawIron("overlay.iron", ids.next(), Material.metal));
            overlayRawGold = pebble
                    .setTextures("goldpebble1.png")
                    .setTextures("goldpebble2.png")
                    .setTextures("goldpebble3.png")
                    .build(new BlockOverlayRawGold("overlay.gold", ids.next(), Material.metal));
            overlayRawCopper = pebble
                    .setTextures("copperpebble1.png")
                    .setTextures("copperpebble2.png")
                    .setTextures("copperpebble3.png")
                    .build(new BlockOverlayRawCopper("overlay.copper", ids.next(), Material.metal));
            overlayRawSilver = pebble
                    .setTextures("silverpebble1.png")
                    .setTextures("silverpebble2.png")
                    .setTextures("silverpebble3.png")
                    .build(new BlockOverlayRawSilver("overlay.silver", ids.next(), Material.metal));

            // Copper Ores
            oreCopperStone = ore
                    .setTextures("copperstone.png")
                    .build(new BlockOreCopper("ore.copper.stone", ids.next()));
            oreCopperBasalt = ore
                    .setTextures("copperbasalt.png")
                    .build(new BlockOreCopper("ore.copper.basalt", ids.next()));
            oreCopperLimestone = ore
                    .setTextures("copperlimestone.png")
                    .build(new BlockOreCopper("ore.copper.limestone", ids.next()));
            oreCopperGranite = ore
                    .setTextures("coppergranite.png")
                    .build(new BlockOreCopper("ore.copper.granite", ids.next()));

            oreSilverStone = ore
                    .setTextures("silverstone.png")
                    .build(new BlockOreSilver("ore.silver.stone", ids.next()));
            oreSilverBasalt = ore
                    .setTextures("silverbasalt.png")
                    .build(new BlockOreSilver("ore.silver.basalt", ids.next()));
            oreSilverLimestone = ore
                    .setTextures("silverlimestone.png")
                    .build(new BlockOreSilver("ore.silver.limestone", ids.next()));
            oreSilverGranite = ore
                    .setTextures("silvergranite.png")
                    .build(new BlockOreSilver("ore.silver.granite", ids.next()));


            // Copper Blocks
            blockCopper = raw
                    .setTextures("copperblock.png")
                    .setTicking(true)
                    .build(new Block("block.copper", ids.next(), Material.metal) {
                        private int ticks;

                        @Override
                        public void updateTick(World world, int x, int y, int z, Random rand) {
                            if (world.getBlockMetadata(x, y, z) == 0) {
                                ++this.ticks;
                                if (this.ticks == 200) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.blockCopperTarnished.id, world.getBlockMetadata(x, y, z));
                                    this.ticks = 0;
                                }
                            }
                        }
                    });
            blockCopperTarnished = raw
                    .setTextures("tarnishedcopperblock.png")
                    .setTicking(true)
                    .build(new Block("block.copper.tarnished", ids.next(), Material.metal) {
                        private int ticks;

                        @Override
                        public void updateTick(World world, int x, int y, int z, Random rand) {
                            if (world.getBlockMetadata(x, y, z) == 0) {
                                ++this.ticks;
                                if (this.ticks == 200) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.blockCopperCorroded.id, world.getBlockMetadata(x, y, z));
                                    this.ticks = 0;
                                }
                            }
                        }
                    });
            blockCopperCorroded = raw
                    .setTextures("corrodedcopperblock.png")
                    .build(new Block("block.copper.corroded", ids.next(), Material.metal));


            // Copper Mesh
            meshCopper = raw
                    .setTextures("coppergrate.png")
                    .setTicking(true)
                    .build(new BlockTransparent("mesh.copper", ids.next(), Material.metal, true) {
                        private int ticks;

                        @Override
                        public void updateTick(World world, int x, int y, int z, Random rand) {
                            if (world.getBlockMetadata(x, y, z) == 0) {
                                ++this.ticks;
                                if (this.ticks == 200) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.meshCopperTarnished.id, world.getBlockMetadata(x, y, z));
                                    this.ticks = 0;
                                }
                            }
                        }
                    });
            meshCopperTarnished = raw
                    .setTextures("tarnishedcoppergrate.png")
                    .setTicking(true)
                    .build(new BlockTransparent("mesh.copper.tarnished", ids.next(), Material.metal, true) {
                        private int ticks;

                        @Override
                        public void updateTick(World world, int x, int y, int z, Random rand) {
                            if (world.getBlockMetadata(x, y, z) == 0) {
                                ++this.ticks;
                                if (this.ticks == 200) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.meshCopperCorroded.id, world.getBlockMetadata(x, y, z));
                                    this.ticks = 0;
                                }
                            }
                        }
                    });
            meshCopperCorroded = raw
                    .setTextures("corrodedcoppergrate.png")
                    .build(new BlockTransparent("mesh.copper.corroded", ids.next(), Material.metal, true) {
                    });


            // Copper Pipe
            pipeCopper = raw
                    .setTextures("copperpipe.png")
                    .setVisualUpdateOnMetadata()
                    .setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "pipe.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "pipe_states.json"), new PipeMetaStateInterpreter(), false, 0.25f))
                    .build(new BlockCopperPipe("pipe.copper", ids.next(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "pipe.json"), false));

            pipeCopperTarnished = raw
                    .setTextures("tarnishedcopperpipe.png")
                    .setVisualUpdateOnMetadata()
                    .setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "tarnishedpipe.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "tarnished_pipe_states.json"), new PipeMetaStateInterpreter(), false, 0.25f))
                    .build(new BlockCopperPipe("pipe.copper.tarnished", ids.next(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "tarnishedpipe.json"), false) {
                        private int ticks;

                        @Override
                        public void updateTick(World world, int x, int y, int z, Random rand) {
                            if (world.getBlockMetadata(x, y, z) == 0) {
                                ++this.ticks;
                                if (this.ticks == 200) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.pipeCopperCorroded.id, world.getBlockMetadata(x, y, z));
                                    this.ticks = 0;
                                }
                            }
                        }
                    });

            pipeCopperCorroded = raw
                    .setTextures("corrodedcopperpipe.png")
                    .setVisualUpdateOnMetadata()
                    .setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "corrodedpipe.json"), ModelHelper.getOrCreateBlockState(MOD_ID, "corroded_pipe_states.json"), new PipeMetaStateInterpreter(), false, 0.25f))
                    .build(new BlockCopperPipe("pipe.copper.corroded", ids.next(), Material.metal, ModelHelper.getOrCreateBlockModel(MOD_ID, "corrodedpipe.json"), false) {
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
                    .build(new BlockTrapDoor("trapdoor.copper", ids.next(), Material.stone, false) {
                        private int ticks;

                        @Override
                        public void updateTick(World world, int x, int y, int z, Random rand) {
                            if (world.getBlockMetadata(x, y, z) == 0) {
                                ++this.ticks;
                                if (this.ticks == 200) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.trapdoorCopperTarnished.id, world.getBlockMetadata(x, y, z));
                                    this.ticks = 0;
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
                    .build(new BlockTrapDoor("trapdoor.copper.tarnished", ids.next(), Material.stone, false) {
                        private int ticks;

                        @Override
                        public void updateTick(World world, int x, int y, int z, Random rand) {
                            if (world.getBlockMetadata(x, y, z) == 0) {
                                ++this.ticks;
                                if (this.ticks == 200) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.trapdoorCopperCorroded.id, world.getBlockMetadata(x, y, z));
                                    this.ticks = 0;
                                }
                            }
                        }
                    });
            trapdoorCopperCorroded = raw
                    .setBlockModel(new BlockModelRenderBlocks(30))
                    .setTopBottomTexture("corrodedcoppertrapdoortop.png")
                    .setSideTextures("corrodedcoppertrapdoorside.png")
                    .setVisualUpdateOnMetadata()
                    .build(new BlockTrapDoor("trapdoor.copper.corroded", ids.next(), Material.stone, false));


            // Copper Doors
            doorCopperBottom = raw
                    .setBlockModel(new BlockModelRenderBlocks(7))
                    .setTextures("copperdoorbottom.png")
                    .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                    .setVisualUpdateOnMetadata()
                    .build(new BlockCopperDoor("door.copper.bottom", ids.next(), Material.stone, false));
            doorCopperTop = raw
                    .setBlockModel(new BlockModelRenderBlocks(7))
                    .setTextures("copperdoortop.png")
                    .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                    .setVisualUpdateOnMetadata()
                    .build(new BlockCopperDoor("door.copper.top", ids.next(), Material.stone, true));

            doorCopperTarnishedBottom = raw
                    .setBlockModel(new BlockModelRenderBlocks(7))
                    .setTextures("tarnishedcopperdoorbottom.png")
                    .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                    .setVisualUpdateOnMetadata()
                    .build(new BlockCopperTarnishedDoor("door.copper.tarnished.bottom", ids.next(), Material.stone, false));
            doorCopperTarnishedTop = raw
                    .setBlockModel(new BlockModelRenderBlocks(7))
                    .setTextures("tarnishedcopperdoortop.png")
                    .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                    .setVisualUpdateOnMetadata()
                    .build(new BlockCopperTarnishedDoor("door.copper.tarnished.top", ids.next(), Material.stone, true));

            doorCopperCorrodedBottom = raw
                    .setBlockModel(new BlockModelRenderBlocks(7))
                    .setTextures("corrodedcopperdoorbottom.png")
                    .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                    .setVisualUpdateOnMetadata()
                    .build(new BlockCopperDoor("door.copper.corroded.bottom", ids.next(), Material.stone, false) {
                        public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                            if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                                return new ItemStack[]{new ItemStack(doorCopperCorroded)};
                            }
                            return null;
                        }
                    });
            doorCopperCorrodedTop = raw
                    .setBlockModel(new BlockModelRenderBlocks(7))
                    .setTextures("corrodedcopperdoortop.png")
                    .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                    .setVisualUpdateOnMetadata()
                    .build(new BlockCopperDoor("door.copper.corroded.top", ids.next(), Material.stone, true) {
                        public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                            if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
                                return new ItemStack[]{new ItemStack(doorCopperCorroded)};
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
                    .build(new BlockFenceCopper("fence.copper", ids.next(), Material.metal));
            fenceCopperTarnished = raw
                    .setBlockModel(new BlockModelRenderBlocks(31))
                    .setTextures("tarnishedcopperfence.png")
                    .setTextures("tarnishedcopperframe.png")
                    .setTextures("tarnishedcopperrod.png")
                    .setVisualUpdateOnMetadata()
                    .build(new BlockFenceCopperTarnished("fence.copper.tarnished", ids.next(), Material.metal));
            fenceCopperCorroded = raw
                    .setBlockModel(new BlockModelRenderBlocks(31))
                    .setTextures("corrodedcopperfence.png")
                    .setTextures("corrodedcopperframe.png")
                    .setTextures("corrodedcopperrod.png")
                    .setVisualUpdateOnMetadata()
                    .build(new BlockFenceCopperCorroded("fence.copper.corroded", ids.next(), Material.metal) {
                        @Override
                        public void updateTick(World world, int x, int y, int z, Random rand) {
                        }
                    });


            //Copper Pressure Plate
            pressureplateCopper = raw
                    .setTextures("copper.png")
                    .setVisualUpdateOnMetadata()
                    .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS)
                    .build(new BlockCopperPressurePlate("pressureplate.copper", ids.next(), Material.metal));
            pressureplateCopperTarnished = raw
                    .setTextures("tarnishedcopper.png")
                    .setVisualUpdateOnMetadata()
                    .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS)
                    .build(new BlockCopperTarnishedPressurePlate("pressureplate.copper.tarnished", ids.next(), Material.metal));
            pressureplateCopperCorroded = raw
                    .setTextures("corrodedcopper.png")
                    .setVisualUpdateOnMetadata()
                    .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.PREVENT_MOB_SPAWNS)
                    .build(new BlockCopperCorrodedPressurePlate("pressureplate.copper.corroded", ids.next(), Material.metal));


            // Steel Trapdoor
            trapdoorSteel = raw
                    .setBlockModel(new BlockModelRenderBlocks(30))
                    .setResistance(2000.0f)
                    .setTopBottomTexture("steeltrapdoortop.png")
                    .setSideTextures("steeltrapdoorside.png")
                    .setVisualUpdateOnMetadata()
                    .build(new BlockTrapDoor("trapdoor.steel", ids.next(), Material.metal, true));


            // Steel Doors
            doorSteelBottom = raw
                    .setBlockModel(new BlockModelRenderBlocks(7))
                    .setResistance(2000.0f)
                    .setTextures("steeldoorbottom.png")
                    .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                    .setVisualUpdateOnMetadata()
                    .build(new BlockDoor("door.steel.bottom", ids.next(), Material.metal, false) {
                        public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                            if (this.blockMaterial == Material.metal && dropCause != EnumDropCause.IMPROPER_TOOL) {
                                return new ItemStack[]{new ItemStack(doorSteel)};
                            }
                            return null;
                        }
                    });
            doorSteelTop = raw
                    .setBlockModel(new BlockModelRenderBlocks(7))
                    .setResistance(2000.0f)
                    .setTextures("steeldoortop.png")
                    .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                    .setVisualUpdateOnMetadata()
                    .build(new BlockDoor("door.steel.top", ids.next(), Material.metal, true) {
                        public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                            if (this.blockMaterial == Material.metal && dropCause != EnumDropCause.IMPROPER_TOOL) {
                                return new ItemStack[]{new ItemStack(doorSteel)};
                            }
                            return null;
                        }
                    });


            //SILVER
            blockSilver = silver
                    .setTextures("silverblock.png")
                    .build(new Block("block.silver", ids.next(), Material.metal));

            // Silver Trapdoor
            trapdoorSilver = silver
                    .setBlockModel(new BlockModelRenderBlocks(30))
                    .setTopBottomTexture("silvertrapdoortop.png")
                    .setSideTextures("silvertrapdoorside.png")
                    .setVisualUpdateOnMetadata()
                    .build(new BlockTrapDoor("trapdoor.silver", ids.next(), Material.metal, true));

            // Silver Doors
            doorSilverBottom = silver
                    .setBlockModel(new BlockModelRenderBlocks(7))
                    .setTextures("silverdoorBottom.png")
                    .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                    .setVisualUpdateOnMetadata()
                    .build(new BlockDoor("door.silver.bottom", ids.next(), Material.metal, false) {
                        public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                            if (this.blockMaterial == Material.metal && dropCause != EnumDropCause.IMPROPER_TOOL) {
                                return new ItemStack[]{new ItemStack(doorSilver)};
                            }
                            return null;
                        }
                    });
            doorSilverTop = silver
                    .setBlockModel(new BlockModelRenderBlocks(7))
                    .setTextures("silverdoorTop.png")
                    .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.NOT_IN_CREATIVE_MENU)
                    .setVisualUpdateOnMetadata()
                    .build(new BlockDoor("door.silver.top", ids.next(), Material.metal, true) {
                        public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
                            if (this.blockMaterial == Material.metal && dropCause != EnumDropCause.IMPROPER_TOOL) {
                                return new ItemStack[]{new ItemStack(doorSilver)};
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
                    .build(new BlockFenceSilver("fence.silver", ids.next(), Material.metal));

            // Silver Chandolier
            chandolierSilver = silver
                    .setBlockModel(new BlockModelRenderBlocks(1))
                    .setTextures("silverchandolier.png")
                    .setVisualUpdateOnMetadata()
                    .setLuminance(15)
                    .build(new BlockChandolier("fence.silver", ids.next()));


            // Silver Vase
            vaseSilver = silver
                    .setBlockModel(new BlockModelRenderBlocks(1))
                    .setTextures("silvervase.png")
                    .setVisualUpdateOnMetadata()
                    .build(new BlockVase("fence.silver", ids.next()));


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
                    .build(new BlockSilverBed("bed.silver", ids.next()));


            // Silver Seat
            seatSilver = silver
                    .setBlockModel(new BlockModelRenderBlocks(35))
                    .setTopTexture("silverseat.png")
                    .setBottomTexture("silverblock.png")
                    .setSideTextures("silverbedback.png")
                    .setVisualUpdateOnMetadata()
                    .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.NOT_IN_CREATIVE_MENU)
                    .build(new BlockSilverSeat("seat.silver", ids.next(), Material.metal));


            // Scorched Stone
            scorchedstone = new BlockBuilder(MOD_ID)
                    .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
                    .setHardness(0.8f)
                    .setSideTextures("redsandstoneside.png")
                    .setBottomTexture("redsandstonebottom.png")
                    .setTopTexture("redsandstonetop.png")
                    .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.GROWS_TREES, BlockTags.GROWS_SPINIFEX, BlockTags.GROWS_FLOWERS, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
                    .build(new Block("scorchedstone", ids.next(), Material.stone));


            // Slate Pillar
            pillarSlate = stone
                    .setSideTextures("slatepillarside.png")
                    .setTopBottomTexture("slatepillartop.png")
                    .setBlockModel(new BlockModelRenderBlocks(27))
                    .build(new BlockAxisAligned("pillar.slate", ids.next(), Material.stone));


            // Polished Stones
            marblePolished = stone
                    .setSideTextures("polishedmarbleside.png")
                    .setTopBottomTexture("polishedmarbletop.png")
                    .build(new Block("marble.polished", ids.next(), Material.stone));
            permafrostPolished = stone
                    .setSideTextures("polishedpermafrostside.png")
                    .setTopBottomTexture("polishedpermafrostop.png")
                    .build(new Block("permafrost.polished", ids.next(), Material.stone));


            // Carved Stones
            slateCarved = stone
                    .setSideTextures(6, 14)
                    .setTopBottomTexture(8, 14)
                    .build(new Block("slate.carved", ids.next(), Material.stone));
            marbleCarved = stone
                    .setSideTextures(6, 14)
                    .setTopBottomTexture(8, 14)
                    .build(new Block("marble.carved", ids.next(), Material.stone));

            permafrostCarved = stone
                    .setSideTextures("carvedpermafrost.png")
                    .setTopBottomTexture("polishedpermafrostop.png")
                    .build(new Block("permafrost.carved", ids.next(), Material.stone));


            // Baked Clay
            clayBaked = stone
                    .setHardness(3.0f)
                    .setTextures("bakedclay.png")
                    .build(new Block("clay.baked", ids.next(), Material.stone));


            // Obsidian Glass
            glassObsidian = obsidian
                    .build(new BlockGlassObsidian("glass.obsidian", ids.next(), Material.glass, true));
            trapdoorGlassObsidian = obsidian
                    .setBlockModel(new BlockModelRenderBlocks(30))
                    .setVisualUpdateOnMetadata()
                    .build(new BlockTrapDoorObsidian("trapdoor.glass.obsidian", ids.next()));

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
                    .build(new BlockGlassQuartz("glass.quartz", ids.next(), Material.glass, false));


            // Netherrack
            cobbleNetherrack = brick
                    .setHardness(0.4F)
                    .setResistance(0.4F)
                    .setTextures("cobblednetherrack.png")
                    .setInfiniburn()
                    .build(new Block("cobble.netherrack", ids.next(), Material.stone));

            netherrack = brick
                    .setHardness(0.9F)
                    .setResistance(0.9F)
                    .setTextures("netherrack.png")
                    .setInfiniburn()
                    .build(new Block("netherrack", ids.next(), Material.stone) {
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
                    .build(new Block("brick.netherrack", ids.next(), Material.stone));
            brickScorchedstone = brick
                    .setHardness(0.8f)
                    .setTextures("redsandstonebrick.png")
                    .build(new Block("brick.scorchedstone", ids.next(), Material.stone));
            brickMud = brick
                    .setHardness(1.5f)
                    .setTextures("mudbrick.png")
                    .build(new Block("brick.mud", ids.next(), Material.stone));
            brickSteel = brick
                    .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                    .setHardness(5.0F)
                    .setResistance(4000.0f)
                    .setTextures("steelbrick.png")
                    .build(new Block("brick.steel", ids.next(), Material.metal));
            brickQuartz = brick
                    .setHardness(3.0f)
                    .setTextures("quartzbrick.png")
                    .build(new Block("brick.quartz", ids.next(), Material.stone));
            brickOlivine = brick
                    .setHardness(3.0f)
                    .setTextures("olivinebrick.png")
                    .build(new Block("brick.olivine", ids.next(), Material.stone));


            // Soulslate
            soulslate = stone
                    .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.6f))
                    .setHardness(2.0f)
                    .setResistance(20.0f)
                    .setTextures("soulslate.png")
                    .build(new Block("soulslate", ids.next(), Material.stone));


            // Brimstone
            brimstone = stone
                    .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.4f))
                    .setHardness(200.0f)
                    .setResistance(20000.0f)
                    .setTextures("brimstone.png")
                    .setInfiniburn()
                    .build(new BlockBrimstone("brimstone", ids.next(), Material.piston));


            // Pumice
            pumiceDry = new BlockBuilder(MOD_ID)
                    .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
                    .setHardness(1.0f)
                    .setResistance(1.0f)
                    .setTextures("pumicedry.png")
                    .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                    .build(new BlockPumice("pumice.dry", ids.next(), false));
            pumiceWet = new BlockBuilder(MOD_ID)
                    .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
                    .setHardness(1.0f)
                    .setResistance(1.0f)
                    .setLuminance(13)
                    .setTextures("pumicewet.png")
                    .setTags(BlockTags.MINEABLE_BY_PICKAXE)
                    .build(new BlockPumice("pumice.wet", ids.next(), true));


            // Pumpkin Pie
            pie = new BlockBuilder(MOD_ID)
                    .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                    .setHardness(0.5f)
                    .setResistance(0.5f)
                    .setTopTexture("pietop.png")
                    .setBottomTexture("piebottom.png")
                    .setSideTextures("pieside.png")
                    .setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.NOT_IN_CREATIVE_MENU)
                    .build(new BlockPie("pie", ids.next()));


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
                    .build(new BlockSoulCandle("candle.soulwax", ids.next()));


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
            .build(new BlockBedroll("bedroll", ids.next()));
*/

            //Slabs
            slabWool = slab
                    .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                    .setHardness(0.8F)
                    .setResistance(0.8F)
                    .setItemBlock(ItemBlockSlabPainted::new)
                    .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.NOT_IN_CREATIVE_MENU)
                    .build(new BlockWoolSlab(Block.wool, ids.next()));
            slabCobbleStoneMossy = slab
                    .setHardness(2.0F)
                    .setTextures(4, 2)
                    .build(new BlockSlab(Block.cobbleStoneMossy, ids.next()));
            slabSlatePolished = slab
                    .setSideTextures(6, 14)
                    .setTopBottomTexture(8, 14)
                    .build(new BlockSlab(slateCarved, ids.next()));
            slabMarblePolished = slab
                    .setSideTextures("carvedmarble.png")
                    .setTopBottomTexture("polishedmarbletop.png")
                    .build(new BlockSlab(marbleCarved, ids.next()));
            slabPermafrostPolished = slab
                    .setSideTextures("carvedpermafrost.png")
                    .setTopBottomTexture("polishedpermafrostop.png")
                    .build(new BlockSlab(permafrostCarved, ids.next()));
            slabBrickStonePolishedMossy = slab
                    .setHardness(2.0F)
                    .setTextures(11, 8)
                    .build(new BlockSlab(Block.brickStonePolishedMossy, ids.next()));
            slabBrickSandstone = slab
                    .setHardness(0.8F)
                    .setTextures(0, 14)
                    .build(new BlockSlab(Block.brickSandstone, ids.next()));
            slabBrickGold = slab
                    .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                    .setHardness(3.0F)
                    .setTextures(9, 9)
                    .build(new BlockSlab(Block.brickGold, ids.next()));
            slabBrickLapis = slab
                    .setHardness(3.0F)
                    .setTextures(9, 8)
                    .build(new BlockSlab(Block.brickLapis, ids.next()));
            slabBrickPermafrost = slab
                    .setTextures(13, 15)
                    .build(new BlockSlab(Block.brickPermafrost, ids.next()));
            slabBrickIron = slab
                    .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                    .setHardness(5.0F)
                    .setTextures(8, 8)
                    .build(new BlockSlab(Block.brickIron, ids.next()));
            slabCobbleNetherrack = slab
                    .setTextures("cobblednetherrack.png")
                    .build(new BlockSlab(cobbleNetherrack, ids.next()));
            slabCobbleNetherrackMossy = slab
                    .setTextures(7, 6)
                    .build(new BlockSlab(Block.netherrack, ids.next()));
            slabBrickNetherrack = slab
                    .setTextures("netherbrick.png")
                    .build(new BlockSlab(brickNetherrack, ids.next()));
            slabBrickScorchedstone = slab
                    .setHardness(0.8f)
                    .setTextures("redsandstonebrick.png")
                    .build(new BlockSlab(brickScorchedstone, ids.next()));
            slabBrickMud = slab
                    .setHardness(1.0f)
                    .setTextures("mudbrick.png")
                    .build(new BlockSlab(brickMud, ids.next()));
            slabCobblePermafrost = slab
                    .setHardness(1.0f)
                    .setTextures(12, 15)
                    .build(new BlockSlab(Block.cobblePermafrost, ids.next()));
            slabScorchedstone = slab
                    .setHardness(0.8F)
                    .setSideTextures("redsandstoneside.png")
                    .setBottomTexture("redsandstonebottom.png")
                    .setTopTexture("redsandstonetop.png")
                    .build(new BlockSlab(scorchedstone, ids.next()));
            slabBrickSteel = slab
                    .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                    .setHardness(5.0f)
                    .setResistance(4000.0f)
                    .setTextures("steelbrick.png")
                    .build(new BlockSlab(brickSteel, ids.next()));
            slabBrickQuartz = slab
                    .setHardness(3.0f)
                    .setTextures("quartzbrick.png")
                    .build(new BlockSlab(brickQuartz, ids.next()));
            slabBrickOlivine = slab
                    .setHardness(3.0f)
                    .setTextures("olivinebrick.png")
                    .build(new BlockSlab(brickOlivine, ids.next()));
            slabCopper = slab
                    .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                    .setHardness(5.0f)
                    .setResistance(10.0f)
                    .setTextures("copperblock.png")
                    .setTicking(true)
                    .build(new BlockSlab(blockCopper, ids.next()) {
                        private int ticks;

                        public void updateTick(World world, int x, int y, int z, Random rand) {
                            if (world.getBlockMetadata(x, y, z) >= 0) {
                                ++this.ticks;
                                if (this.ticks == 200) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.slabCopperTarnished.id, world.getBlockMetadata(x, y, z));
                                    this.ticks = 0;
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
                    .build(new BlockSlab(blockCopperTarnished, ids.next()) {
                        private int ticks;

                        public void updateTick(World world, int x, int y, int z, Random rand) {
                            if (world.getBlockMetadata(x, y, z) >= 0) {
                                ++this.ticks;
                                if (this.ticks == 200) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.slabCopperCorroded.id, world.getBlockMetadata(x, y, z));
                                    this.ticks = 0;
                                }
                            }
                        }
                    });
            slabCopperCorroded = slab
                    .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                    .setHardness(5.0f)
                    .setResistance(10.0f)
                    .setTextures("corrodedcopperblock.png")
                    .build(new BlockSlab(blockCopperCorroded, ids.next()));


            // Stairs
            stairsWool = stairs
                    .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
                    .setHardness(0.8F)
                    .setResistance(0.8F)
                    .setItemBlock(ItemBlockStairsPainted::new)
                    .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.NOT_IN_CREATIVE_MENU)
                    .build(new BlockWoolStairs(Block.wool, ids.next()));
            stairsCobbleStoneMossy = stairs
                    .setHardness(2.0F)
                    .setTextures(4, 2)
                    .build(new BlockStairs(Block.cobbleStoneMossy, ids.next()));
            stairsBrickStonePolishedMossy = stairs
                    .setHardness(2.0F)
                    .setTextures(11, 8)
                    .build(new BlockStairs(Block.brickStonePolishedMossy, ids.next()));
            stairsBrickSandstone = stairs
                    .setHardness(0.8F)
                    .setTextures(0, 14)
                    .build(new BlockStairs(Block.brickSandstone, ids.next()));
            stairsBrickGold = stairs
                    .setHardness(3.0F)
                    .setTextures(9, 9)
                    .build(new BlockStairs(Block.brickGold, ids.next()));
            stairsBrickLapis = stairs
                    .setHardness(3.0F)
                    .setTextures(9, 8)
                    .build(new BlockStairs(Block.brickLapis, ids.next()));
            stairsBrickPermafrost = stairs
                    .setTextures(13, 15)
                    .build(new BlockStairs(Block.brickPermafrost, ids.next()));
            stairsBrickIron = stairs
                    .setHardness(5.0F)
                    .setTextures(8, 8)
                    .build(new BlockStairs(Block.brickIron, ids.next()));
            stairsCobbleNetherrack = stairs
                    .setTextures("cobblednetherrack.png")
                    .build(new BlockStairs(cobbleNetherrack, ids.next()));
            stairsCobbleNetherrackMossy = stairs
                    .setTextures(7, 6)
                    .build(new BlockStairs(Block.netherrack, ids.next()));
            stairsBrickNetherrack = stairs
                    .setTextures("netherbrick.png")
                    .build(new BlockStairs(brickNetherrack, ids.next()));
            stairsBrickScorchedstone = stairs
                    .setHardness(0.8f)
                    .setTextures("redsandstonebrick.png")
                    .build(new BlockStairs(brickScorchedstone, ids.next()));
            stairsBrickMud = stairs
                    .setHardness(1.5f)
                    .setTextures("mudbrick.png")
                    .build(new BlockStairs(brickMud, ids.next()));
            stairsCobblePermafrost = stairs
                    .setHardness(0.8F)
                    .setTextures(12, 15)
                    .build(new BlockStairs(Block.cobblePermafrost, ids.next()));
            stairsBrickSteel = stairs
                    .setHardness(5.0f)
                    .setResistance(4000.0f)
                    .setTextures("steelbrick.png")
                    .build(new BlockStairs(brickSteel, ids.next()));
            stairsBrickQuartz = stairs
                    .setHardness(3.0f)
                    .setTextures("quartzbrick.png")
                    .build(new BlockStairs(brickQuartz, ids.next()));
            stairsBrickOlivine = stairs
                    .setHardness(3.0f)
                    .setTextures("olivinebrick.png")
                    .build(new BlockStairs(brickOlivine, ids.next()));
            stairsCopper = stairs
                    .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                    .setHardness(5.0f)
                    .setResistance(10.0f)
                    .setTextures("copperblock.png")
                    .setTicking(true)
                    .build(new BlockStairs(blockCopper, ids.next()) {
                        private int ticks;

                        public void updateTick(World world, int x, int y, int z, Random rand) {
                            if (world.getBlockMetadata(x, y, z) >= 0) {
                                ++this.ticks;
                                if (this.ticks == 200) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.stairsCopperTarnished.id, world.getBlockMetadata(x, y, z));
                                    this.ticks = 0;
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
                    .build(new BlockStairs(blockCopperTarnished, ids.next()) {
                        private int ticks;

                        public void updateTick(World world, int x, int y, int z, Random rand) {
                            if (world.getBlockMetadata(x, y, z) >= 0) {
                                ++this.ticks;
                                if (this.ticks == 200) {
                                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.stairsCopperCorroded.id, world.getBlockMetadata(x, y, z));
                                    this.ticks = 0;
                                }
                            }
                        }
                    });
            stairsCopperCorroded = stairs
                    .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
                    .setHardness(5.0f)
                    .setResistance(10.0f)
                    .setTextures("corrodedcopperblock.png")
                    .build(new BlockStairs(blockCopperCorroded, ids.next()));


            addBorder(Item.ingotIron.getDefaultStack(), "/assets/bonusblocks/art/border_iron.png");
            addBorder(Item.ingotGold.getDefaultStack(), "/assets/bonusblocks/art/border_gold.png");
            addBorder(Item.ingotSteel.getDefaultStack(), "/assets/bonusblocks/art/border_steel.png");
            addBorder(new ItemStack(Item.dye, 1, 4), "/assets/bonusblocks/art/border_lapis.png");
            addBorder(Item.diamond.getDefaultStack(), "/assets/bonusblocks/art/border_diamond.png");
            addBorder(Item.dustRedstone.getDefaultStack(), "/assets/bonusblocks/art/border_redstone.png");
            addBorder(Item.olivine.getDefaultStack(), "/assets/bonusblocks/art/border_olivine.png");
            addBorder(Item.quartz.getDefaultStack(), "/assets/bonusblocks/art/border_quartz.png");
            addBorder(BonusBlocks.ingotCopper.getDefaultStack(), "/assets/bonusblocks/art/border_copper.png");


            write();
        });
    }


    // Items
    public static Item candleSoulwaxItem = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new ItemPlaceable("candle.soulwax", itemID++, candleSoulwax), "soulwaxcandle.png");

    public static Item soulwax = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new Item("soulwax", itemID++), "soulwax.png");

    public static Item oreRawCopper = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new ItemRawCopper("ore.raw.copper", itemID++), "rawcopper.png");

    public static Item ingotCopper = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new Item("ingot.copper", itemID++), "copperingot.png");

    public static Item oreRawSilver = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new ItemRawSilver("ore.raw.silver", itemID++), "rawsilver.png");

    public static Item ingotSilver = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new Item("ingot.silver", itemID++), "silveringot.png");

    public static Item doorCopper = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new ItemCopperDoor("door.copper", itemID++), "copperdoor.png");

    public static Item doorCopperTarnished = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new ItemCopperTarnishedDoor("door.copper.tarnished", itemID++), "tarnishedcopperdoor.png");

    public static Item doorCopperCorroded = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new ItemCopperCorrodedDoor("door.copper.corroded", itemID++), "corrodedcopperdoor.png");

    public static Item doorSteel = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new ItemSteelDoor("door.steel", itemID++, Material.metal), "steeldoor.png");

    public static Item doorSilver = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new ItemSilverDoor("door.silver", itemID++, Material.metal), "silverdoor.png");

    public static Item silverBed = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new ItemSilverBed("bed.silver", itemID++), "silverbed.png");

    public static Item silverSeat = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new ItemPlaceable("seat.silver", itemID++, seatSilver), "silverseat.png");

//    public static Item bedrollItem = ItemHelper.createItem(BonusBlocks.MOD_ID,
//            new ItemBedroll("bedroll", itemID++), "bedroll.png").setMaxStackSize(1);

    public static Item foodPie = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new ItemPlaceable("food.pie", itemID++, pie), "pie.png").setMaxStackSize(1);


    @Override
    public void onInitialize() {
        LOGGER.info("BonusBlocks initialized.");

        Item.oreRawGold = new ItemRawGold("ore.raw.gold", 16510).setIconCoord(10, 8);
        Item.oreRawIron = new ItemRawIron("ore.raw.iron", 16511).setIconCoord(9, 8);


        stoneToMossMap.put(Block.saplingOak, BonusBlocks.saplingOakMossy);
        stoneToMossMap.put(BonusBlocks.cobbleNetherrack, Block.netherrack);

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


        Item.itemsList[boxPainted.id] = new ItemBlockPainted(boxPainted, false);


        LookupFuelFurnace.instance.addFuelEntry(logMaple.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(logJacaranda.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(logScorched.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(logShrub.id, 300);
/*
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
*/
        LookupFuelFurnace.instance.addFuelEntry(box.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(boxPainted.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(crate.id, 300);
//        LookupFuelFurnace.instance.addFuelEntry(crateSticky.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(bookshelfEmptyPlanksOak.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(thatch.id, 400);
        LookupFuelFurnace.instance.addFuelEntry(branch.id, 300);
        LookupFuelFurnace.instance.addFuelEntry(saplingJacaranda.id, 10);
        LookupFuelFurnace.instance.addFuelEntry(saplingMaple.id, 10);
        LookupFuelFurnace.instance.addFuelEntry(saplingOakMossy.id, 10);
    }

    public void onRecipesReady() {
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
        templateItemtoBlock.addInput('X', BonusBlocks.oreRawCopper).create("block_of_raw_copper", new ItemStack(BonusBlocks.blockRawCopper, 1));
        templateItemtoBlock.addInput('X', Item.leather).create("block_of_leather", new ItemStack(BonusBlocks.blockLeather, 1));

        RecipeBuilderShaped templateBlocktoItem = new RecipeBuilderShaped(MOD_ID, "X");
        templateBlocktoItem.addInput('X', BonusBlocks.blockBone).create("block_of_bone_to_bone", new ItemStack(Item.bone, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockSlime).create("block_of_slime_to_slime", new ItemStack(Item.slimeball, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockSulphur).create("block_of_sulphur_to_sulphur", new ItemStack(Item.sulphur, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockSugar).create("block_of_sugar_to_sugar", new ItemStack(Item.dustSugar, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockCloth).create("block_of_cloth_to_cloth", new ItemStack(Item.cloth, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockCrudeSteel).create("block_of_crude_steel_to_crude_steel", new ItemStack(Item.ingotSteelCrude, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockFlint).create("block_of_flint_to_flint", new ItemStack(Item.flint, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockRawGold).create("block_of_raw_gold_to_raw_gold", new ItemStack(Item.oreRawGold, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockRawIron).create("block_of_raw_iron_to_raw_iron", new ItemStack(Item.oreRawIron, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockRawCopper).create("block_of_raw_copper_to_raw_copper", new ItemStack(BonusBlocks.oreRawCopper, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockLeather).create("block_of_leather_to_leather", new ItemStack(Item.leather, 9));
        templateBlocktoItem.addInput('X', BonusBlocks.blockCopper).create("block_of_copper_to_copper", new ItemStack(BonusBlocks.ingotCopper, 4));

        RecipeBuilder.Shaped(MOD_ID, "WS", "SW")
                .addInput('W', Item.wheat)
                .addInput('S', Item.stick)
                .create("block_of_thatch", new ItemStack(BonusBlocks.thatch, 4));

        RecipeBuilder.Shaped(MOD_ID, "CCC", "C C", "CCC")
                .addInput('C', BonusBlocks.ingotCopper)
                .create("copper_mesh", new ItemStack(BonusBlocks.meshCopper, 8));

        RecipeBuilder.Shaped(MOD_ID, "WS", "SW")
                .addInput('W', Item.wheat)
                .addInput('S', Item.leather)
                .create("block_of_wicker", new ItemStack(BonusBlocks.blockWicker, 4));

        RecipeBuilder.Shaped(MOD_ID, "GGG", "GGG")
                .addInput('G', BonusBlocks.glassObsidian)
                .create("glass_obsidian_trapdoor", new ItemStack(BonusBlocks.trapdoorGlassObsidian, 8));

        RecipeBuilder.Shaped(MOD_ID, "GQ", "QG")
                .addInput('G', Block.glass)
                .addInput('Q', Item.quartz)
                .create("glass_quartz", new ItemStack(BonusBlocks.glassQuartz, 4));

        RecipeBuilder.Shaped(MOD_ID, "CIC")
                .addInput('C', BonusBlocks.blockCopper)
                .addInput('I', BonusBlocks.ingotCopper)
                .create("copper_pipe", new ItemStack(BonusBlocks.pipeCopper, 8));
        RecipeBuilder.Shaped(MOD_ID, "C", "I", "C")
                .addInput('C', BonusBlocks.blockCopper)
                .addInput('I', BonusBlocks.ingotCopper)
                .create("copper_pipe", new ItemStack(BonusBlocks.pipeCopper, 8));

        RecipeBuilderShaped templateFlowertoDye = new RecipeBuilderShaped(MOD_ID, "X");
        templateFlowertoDye.addInput('X', BonusBlocks.flowerCyan).create("flower_cyan_to_dye", new ItemStack(Item.dye, 2, 6));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerPurple).create("flower_purple_to_dye", new ItemStack(Item.dye, 2, 5));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerPink).create("flower_pink_to_dye", new ItemStack(Item.dye, 2, 9));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerSilver).create("flower_silver_to_dye", new ItemStack(Item.dye, 2, 7));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerOrange).create("flower_orange_to_dye", new ItemStack(Item.dye, 2, 14));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerLightBlue).create("flower_lightblue_to_dye", new ItemStack(Item.dye, 2, 12));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerMagenta).create("flower_magenta_to_dye", new ItemStack(Item.dye, 2, 13));
        templateFlowertoDye.addInput('X', BonusBlocks.flowerLime).create("flower_lime_to_dye", new ItemStack(Item.dye, 2, 10));
        templateFlowertoDye.addInput('X', BonusBlocks.mushroomGray).create("mushroom_gray_to_dye", new ItemStack(Item.dye, 2, 8));

        RecipeBuilderShaped templateMushroomToBlock = new RecipeBuilderShaped(MOD_ID, "XX", "XX");
        templateMushroomToBlock.addInput('X', Block.mushroomRed).create("red_mushroom_block", new ItemStack(BonusBlocks.fungusRed, 4));
        templateMushroomToBlock.addInput('X', Block.mushroomBrown).create("brown_mushroom_block", new ItemStack(BonusBlocks.fungusBrown, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.mushroomGray).create("gray_mushroom_block", new ItemStack(BonusBlocks.fungusGray, 4));

        templateMushroomToBlock.addInput('X', BonusBlocks.ingotCopper).create("block_of_copper", new ItemStack(BonusBlocks.blockCopper, 1));

        templateMushroomToBlock.addInput('X', Block.flowerRed).create("petal_red", new ItemStack(BonusBlocks.petalRed, 4));
        templateMushroomToBlock.addInput('X', Block.flowerYellow).create("petal_yellow", new ItemStack(BonusBlocks.petalYellow, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.flowerCyan).create("petal_cyan", new ItemStack(BonusBlocks.petalCyan, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.flowerPurple).create("petal_purple", new ItemStack(BonusBlocks.petalPurple, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.flowerPink).create("petal_pink", new ItemStack(BonusBlocks.petalPink, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.flowerSilver).create("petal_silver", new ItemStack(BonusBlocks.petalSilver, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.flowerOrange).create("petal_orange", new ItemStack(BonusBlocks.petalOrange, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.flowerLightBlue).create("petal_lightblue", new ItemStack(BonusBlocks.petalLightBlue, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.flowerMagenta).create("petal_magenta", new ItemStack(BonusBlocks.petalMagenta, 4));
        templateMushroomToBlock.addInput('X', BonusBlocks.flowerLime).create("petal_lime", new ItemStack(BonusBlocks.petalLime, 4));

        RecipeBuilderShaped templateFlowerBed = new RecipeBuilderShaped(MOD_ID, "XX");
        templateFlowerBed.addInput('X', BonusBlocks.petalRed).create("petal_red_to_layer", new ItemStack(BonusBlocks.petalLayerRed, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalYellow).create("petal_yellow_to_layer", new ItemStack(BonusBlocks.petalLayerYellow, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalCyan).create("petal_cyan_to_layer", new ItemStack(BonusBlocks.petalLayerCyan, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalPurple).create("petal_purple_to_layer", new ItemStack(BonusBlocks.petalLayerPurple, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalPink).create("petal_pink_to_layer", new ItemStack(BonusBlocks.petalLayerPink, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalSilver).create("petal_silver_to_layer", new ItemStack(BonusBlocks.petalLayerSilver, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalOrange).create("petal_orange_to_layer", new ItemStack(BonusBlocks.petalLayerOrange, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalLightBlue).create("petal_lightblue_to_layer", new ItemStack(BonusBlocks.petalLayerLightBlue, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalMagenta).create("petal_magenta_to_layer", new ItemStack(BonusBlocks.petalLayerMagenta, 8));
        templateFlowerBed.addInput('X', BonusBlocks.petalLime).create("petal_lime_to_layer", new ItemStack(BonusBlocks.petalLayerLime, 8));

        RecipeBuilderShaped templateBricks = new RecipeBuilderShaped(MOD_ID, "XX", "XX");
        templateBricks.addInput('X', BonusBlocks.netherrack).create("netherrack_bricks", new ItemStack(BonusBlocks.brickNetherrack, 4));
        templateBricks.addInput('X', BonusBlocks.clayBaked).create("clay_bricks", new ItemStack(Block.brickClay, 16));
        templateBricks.addInput('X', BonusBlocks.scorchedstone).create("scorched_bricks", new ItemStack(BonusBlocks.brickScorchedstone, 4));
        templateBricks.addInput('X', Block.mudBaked).create("mud_bricks", new ItemStack(BonusBlocks.brickMud, 4));
        templateBricks.addInput('X', Item.ingotSteel).create("steel_bricks", new ItemStack(BonusBlocks.brickSteel, 4));
        templateBricks.addInput('X', Item.quartz).create("quartz_bricks", new ItemStack(BonusBlocks.brickQuartz, 4));
        templateBricks.addInput('X', Item.olivine).create("olivine_bricks", new ItemStack(BonusBlocks.brickOlivine, 4));
        templateBricks.addInput('X', Block.soulsand).create("soulslate", new ItemStack(BonusBlocks.soulslate, 4));

        templateBricks.addInput('X', Block.dirtScorched).create("scorchedstone", new ItemStack(BonusBlocks.scorchedstone, 4));

        RecipeBuilderShaped templateOvergrown = new RecipeBuilderShaped(MOD_ID, "X", "X");
        templateOvergrown.addInput('X', Block.grass).create("overgrown_grass", new ItemStack(BonusBlocks.overgrownGrass, 2));
        templateOvergrown.addInput('X', Block.grassRetro).create("overgrown_grass_retro", new ItemStack(BonusBlocks.overgrownGrassRetro, 2));
        templateOvergrown.addInput('X', Block.grassScorched).create("overgrown_grass_scorched", new ItemStack(BonusBlocks.overgrownGrassScorched, 2));
        templateOvergrown.addInput('X', Block.pathDirt).create("overgrown_path", new ItemStack(BonusBlocks.overgrownPath, 2));

        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("marble_pillar");
        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("green_dye_white_dye_to_lime_dye");
        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("pebbles_to_granite");
        RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("bed");

        RecipeBuilder.ModifyBlastFurnace("minecraft").removeRecipe("cobble_basalt_to_olivine");
        RecipeBuilder.ModifyBlastFurnace("minecraft").removeRecipe("cobble_stone_to_slate");
        RecipeBuilder.ModifyBlastFurnace("minecraft").removeRecipe("cobble_granite_to_quartz");

        RecipeBuilder.Shapeless(MOD_ID)
                .addInput(new ItemStack(Item.dye, 1, 2))
                .addInput(new ItemStack(Item.dye, 1, 11))
                .create("green_dye_white_dye_to_lime_dye", new ItemStack(Item.dye, 2, 10));

        RecipeBuilder.Shapeless(MOD_ID)
                .addInput(BonusBlocks.pumiceDry)
                .addInput(Item.bucketLava)
                .create("molten_pumice", new ItemStack(BonusBlocks.pumiceWet, 1));

        RecipeBuilder.Shapeless(MOD_ID)
                .addInput(BonusBlocks.pumiceWet)
                .addInput(Item.bucketWater)
                .create("pumice", new ItemStack(BonusBlocks.pumiceDry, 1));

        RecipeBuilder.Shaped(MOD_ID, "PX", "XP")
                .addInput('P', (Item.ammoPebble))
                .addInput('X', (Item.quartz))
                .create("pebbles_to_granite", new ItemStack(Block.granite, 2));

        RecipeBuilder.Shaped(MOD_ID, "WWW", "PPP")
                .addInput('P',("minecraft:planks"))
                .addInput('W', ("minecraft:wools"))
                .create("bed", new ItemStack(Item.bed, 1));

//        RecipeBuilder.Shaped(MOD_ID, "WWW")
//                .addInput('W', (Item.cloth))
//                .create("sleepingbag", new ItemStack(BonusBlocks.bedrollItem, 1));

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

        Registries.ITEM_GROUPS.getItem("minecraft:stones").add(BonusBlocks.netherrack.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:cobblestones").add(BonusBlocks.cobbleNetherrack.getDefaultStack());

        Registries.ITEM_GROUPS.getItem("minecraft:grasses").add(BonusBlocks.overgrownGrass.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:grasses").add(BonusBlocks.overgrownGrassRetro.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:grasses").add(BonusBlocks.overgrownGrassScorched.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:grasses").add(Block.grassScorched.getDefaultStack());

        Registries.ITEM_GROUPS.register("bonusblocks:copper_ores", Registries.stackListOf(oreCopperStone, oreCopperBasalt, oreCopperGranite, oreCopperLimestone));

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

        Registries.ITEM_GROUPS.register("bonusblocks:wool_slab", Registries.stackListOf(new ItemStack(BonusBlocks.slabWool, 1, 0),
                new ItemStack(BonusBlocks.slabWool, 1, 16),
                new ItemStack(BonusBlocks.slabWool, 1, 32),
                new ItemStack(BonusBlocks.slabWool, 1, 48),
                new ItemStack(BonusBlocks.slabWool, 1, 64),
                new ItemStack(BonusBlocks.slabWool, 1, 80),
                new ItemStack(BonusBlocks.slabWool, 1, 96),
                new ItemStack(BonusBlocks.slabWool, 1, 112),
                new ItemStack(BonusBlocks.slabWool, 1, 128),
                new ItemStack(BonusBlocks.slabWool, 1, 144),
                new ItemStack(BonusBlocks.slabWool, 1, 160),
                new ItemStack(BonusBlocks.slabWool, 1, 176),
                new ItemStack(BonusBlocks.slabWool, 1, 192),
                new ItemStack(BonusBlocks.slabWool, 1, 208),
                new ItemStack(BonusBlocks.slabWool, 1, 224),
                new ItemStack(BonusBlocks.slabWool, 1, 240)));

        Registries.ITEM_GROUPS.register("bonusblocks:wool_stairs", Registries.stackListOf(new ItemStack(BonusBlocks.stairsWool, 1, 0),
                new ItemStack(BonusBlocks.stairsWool, 1, 16),
                new ItemStack(BonusBlocks.stairsWool, 1, 32),
                new ItemStack(BonusBlocks.stairsWool, 1, 48),
                new ItemStack(BonusBlocks.stairsWool, 1, 64),
                new ItemStack(BonusBlocks.stairsWool, 1, 80),
                new ItemStack(BonusBlocks.stairsWool, 1, 96),
                new ItemStack(BonusBlocks.stairsWool, 1, 112),
                new ItemStack(BonusBlocks.stairsWool, 1, 128),
                new ItemStack(BonusBlocks.stairsWool, 1, 144),
                new ItemStack(BonusBlocks.stairsWool, 1, 160),
                new ItemStack(BonusBlocks.stairsWool, 1, 176),
                new ItemStack(BonusBlocks.stairsWool, 1, 192),
                new ItemStack(BonusBlocks.stairsWool, 1, 208),
                new ItemStack(BonusBlocks.stairsWool, 1, 224),
                new ItemStack(BonusBlocks.stairsWool, 1, 240)));

        for (int color = 0; color < 16; color++) {
            RecipeBuilder.Shapeless(MOD_ID)
                    .addInput("bonusblocks:box")
                    .addInput(new ItemStack(Item.dye, 1, 15 - color))
                    .create("painted_box_dye", new ItemStack(BonusBlocks.boxPainted, 1, color));

            RecipeBuilder.Shaped(MOD_ID, "CC", "CC")
                    .addInput('C', new ItemStack(Block.chestPlanksOakPainted, 1, color << 4))
                    .create("painted_box", new ItemStack(BonusBlocks.boxPainted, 8, color));
        }

        for (int color = 0; color < 16; color++) {
            RecipeBuilder.Shapeless(MOD_ID)
                    .addInput("bonusblocks:wool_slab")
                    .addInput(new ItemStack(Item.dye, 1, 15 - color))
                    .create("wool_slab_dye", new ItemStack(BonusBlocks.slabWool, 1, color << 4));

            RecipeBuilder.Shaped(MOD_ID, "CCC", "CCC")
                    .addInput('C', new ItemStack(Block.wool, 1, color))
                    .create("wool_slab", new ItemStack(BonusBlocks.slabWool, 6, color << 4));
        }
        for (int color = 0; color < 16; color++) {
            RecipeBuilder.Shapeless(MOD_ID)
                    .addInput("bonusblocks:wool_stairs")
                    .addInput(new ItemStack(Item.dye, 1, 15 - color))
                    .create("wool_stairs_dye", new ItemStack(BonusBlocks.stairsWool, 1, color << 4));

            RecipeBuilder.Shaped(MOD_ID, "C  ", "CC ", "CCC")
                    .addInput('C', new ItemStack(Block.wool, 1, color))
                    .create("wool_stairs", new ItemStack(BonusBlocks.stairsWool, 6, color << 4));
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

        RecipeBuilderShaped templateCarvedSlab = new RecipeBuilderShaped(MOD_ID, "X", "X");
        templateCarvedSlab.addInput('X', Block.slabCapstoneMarble).create("marble_capstone_carved", new ItemStack(Block.capstoneMarble, 1));

        templateCarvedSlab.addInput('X', Block.slabBasaltPolished).create("basalt_carved", new ItemStack(Block.basaltCarved, 1));
        templateCarvedSlab.addInput('X', Block.slabStonePolished).create("stone_carved", new ItemStack(Block.stoneCarved, 1));
        templateCarvedSlab.addInput('X', Block.slabLimestonePolished).create("limestone_carved", new ItemStack(Block.limestoneCarved, 1));
        templateCarvedSlab.addInput('X', Block.slabGranitePolished).create("granite_carved", new ItemStack(Block.graniteCarved, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.slabMarblePolished).create("marble_carved", new ItemStack(BonusBlocks.marbleCarved, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.slabSlatePolished).create("slate_carved", new ItemStack(BonusBlocks.slateCarved, 1));
        templateCarvedSlab.addInput('X', BonusBlocks.slabPermafrostPolished).create("permafrost_carved", new ItemStack(BonusBlocks.permafrostCarved, 1));

        RecipeBuilder.Shaped(MOD_ID, "S", "W")
                .addInput('S', (Item.string))
                .addInput('W', (BonusBlocks.soulwax))
                .create("soulwax_candle", new ItemStack(BonusBlocks.candleSoulwaxItem, 2));

        RecipeBuilderShaped templateSlab = new RecipeBuilderShaped(MOD_ID, "XXX");
        templateSlab.addInput('X', Block.slatePolished).create("slate_polished_slab", new ItemStack(BonusBlocks.slabSlatePolished, 6));
        templateSlab.addInput('X', BonusBlocks.marblePolished).create("marble_polished_slab", new ItemStack(BonusBlocks.slabMarblePolished, 6));
        templateSlab.addInput('X', BonusBlocks.permafrostPolished).create("permafrost_polished_slab", new ItemStack(BonusBlocks.slabPermafrostPolished, 6));
        templateSlab.addInput('X', Block.brickGold).create("gold_brick_slab", new ItemStack(BonusBlocks.slabBrickGold, 6));
        templateSlab.addInput('X', Block.brickIron).create("iron_brick_slab", new ItemStack(BonusBlocks.slabBrickIron, 6));
        templateSlab.addInput('X', Block.brickLapis).create("lapis_brick_slab", new ItemStack(BonusBlocks.slabBrickLapis, 6));
        templateSlab.addInput('X', BonusBlocks.brickMud).create("mud_brick_slab", new ItemStack(BonusBlocks.slabBrickMud, 6));
        templateSlab.addInput('X', BonusBlocks.brickNetherrack).create("netherrack_brick_slab", new ItemStack(BonusBlocks.slabBrickNetherrack, 6));
        templateSlab.addInput('X', Block.brickPermafrost).create("permafrost_brick_slab", new ItemStack(BonusBlocks.slabBrickPermafrost, 6));
        templateSlab.addInput('X', Block.brickSandstone).create("sandstone_brick_slab", new ItemStack(BonusBlocks.slabBrickSandstone, 6));
        templateSlab.addInput('X', Block.brickStonePolishedMossy).create("stone_polished_mossy_brick_slab", new ItemStack(BonusBlocks.slabBrickStonePolishedMossy, 6));
        templateSlab.addInput('X', BonusBlocks.brickScorchedstone).create("scorchedstone_brick_slab", new ItemStack(BonusBlocks.slabBrickScorchedstone, 6));
        templateSlab.addInput('X', BonusBlocks.brickSteel).create("steel_brick_slab", new ItemStack(BonusBlocks.slabBrickSteel, 6));
        templateSlab.addInput('X', BonusBlocks.brickQuartz).create("quartz_brick_slab", new ItemStack(BonusBlocks.slabBrickQuartz, 6));
        templateSlab.addInput('X', BonusBlocks.brickOlivine).create("olivine_brick_slab", new ItemStack(BonusBlocks.slabBrickOlivine, 6));
        templateSlab.addInput('X', Block.cobblePermafrost).create("cobbled_permafrost_slab", new ItemStack(BonusBlocks.slabCobblePermafrost, 6));
        templateSlab.addInput('X', BonusBlocks.scorchedstone).create("scorchedstone_slab", new ItemStack(BonusBlocks.slabScorchedstone, 6));
        templateSlab.addInput('X', Block.cobbleStoneMossy).create("cobblestone_mossy_slab", new ItemStack(BonusBlocks.slabCobbleStoneMossy, 6));
        templateSlab.addInput('X', Block.netherrack).create("cobblestone_netherrack_mossy_slab", new ItemStack(BonusBlocks.slabCobbleNetherrackMossy, 6));
        templateSlab.addInput('X', BonusBlocks.cobbleNetherrack).create("cobblestone_netherrack_slab", new ItemStack(BonusBlocks.slabCobbleNetherrack, 6));
        templateSlab.addInput('X', BonusBlocks.ingotCopper).create("copper_slab", new ItemStack(BonusBlocks.slabCopper, 6));

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
        templateStairs.addInput('X', Block.cobbleStoneMossy).create("cobblestone_mossy_stairs", new ItemStack(BonusBlocks.stairsCobbleStoneMossy, 6));
        templateStairs.addInput('X', Block.netherrack).create("cobblestone_netherrack_mossy_stairs", new ItemStack(BonusBlocks.stairsCobbleNetherrackMossy, 6));
        templateStairs.addInput('X', BonusBlocks.cobbleNetherrack).create("cobblestone_netherrack_stairs", new ItemStack(BonusBlocks.stairsCobbleNetherrack, 6));
        templateStairs.addInput('X', BonusBlocks.ingotCopper).create("copper_stairs", new ItemStack(BonusBlocks.stairsCopper, 6));

        RecipeBuilder.Shaped(MOD_ID, " M ", "SES", "WPW")
                .addInput('M', (Item.bucketMilk))
                .addInput('W', (Item.wheat))
                .addInput('S', (Item.dustSugar))
                .addInput('E', (Item.eggChicken))
                .addInput('P', (Block.pumpkin))
                .create("pumpkin_pie", new ItemStack(BonusBlocks.foodPie, 1));

        RecipeBuilder.Shaped(MOD_ID, "PP", "PP", "PP")
                .addInput('P', BonusBlocks.ingotCopper)
                .create("crate", new ItemStack(BonusBlocks.doorCopper, 2));

        RecipeBuilder.Shaped(MOD_ID, "CPC", "CPC")
                .addInput('P', BonusBlocks.ingotCopper)
                .addInput('C', BonusBlocks.blockCopper)
                .create("crate", new ItemStack(BonusBlocks.fenceCopper, 8));

        RecipeBuilder.Shaped(MOD_ID, "PPP", "PPP")
                .addInput('P', BonusBlocks.ingotCopper)
                .create("crate", new ItemStack(BonusBlocks.trapdoorCopper, 6));

        RecipeBuilder.Furnace(MOD_ID)
                .setInput("bonusblocks:copper_ores")
                .create("copper_ores_to_copper", BonusBlocks.ingotCopper.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(Block.blockClay)
                .create("baked_clay_furnace", BonusBlocks.clayBaked.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(BonusBlocks.oreRawCopper)
                .create("copper_ingot", BonusBlocks.ingotCopper.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(BonusBlocks.cobbleNetherrack)
                .create("cobble_netherrack_to_netherrack", BonusBlocks.netherrack.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(Block.netherrack)
                .create("mossy_netherrack_to_cobbled_netherrack", BonusBlocks.cobbleNetherrack.getDefaultStack());

        RecipeBuilder.Furnace(MOD_ID)
                .setInput(Block.soulsand)
                .create("soulwax", BonusBlocks.soulwax.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput("bonusblocks:copper_ores")
                .create("copper_ores_to_copper_blast", BonusBlocks.ingotCopper.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.blockClay)
                .create("baked_clay_blast", BonusBlocks.clayBaked.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(BonusBlocks.oreRawCopper)
                .create("copper_ingot_blast", BonusBlocks.ingotCopper.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(BonusBlocks.cobbleNetherrack)
                .create("cobble_netherrack_to_netherrack", BonusBlocks.netherrack.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.netherrack)
                .create("mossy_netherrack_to_cobbled_netherrack", BonusBlocks.cobbleNetherrack.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.obsidian)
                .create("obsidian_glass", BonusBlocks.glassObsidian.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.soulsand)
                .create("soulwax_blast", BonusBlocks.soulwax.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.cobbleStone)
                .create("cobble_stone_to_stone", Block.stone.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.cobbleBasalt)
                .create("cobble_basalt_to_basalt", Block.basalt.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.cobbleGranite)
                .create("cobble_granite_to_granite", Block.granite.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.limestone)
                .create("limestone_to_marble", Block.marble.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.stone)
                .create("stone_to_slate", Block.slate.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.basalt)
                .create("basalt_to_olivine", Item.olivine.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(Block.granite)
                .create("granite_to_quartz", Item.quartz.getDefaultStack());

        RecipeBuilder.BlastFurnace(MOD_ID)
                .setInput(BonusBlocks.netherrack)
                .create("netherrack_to_brimstone", BonusBlocks.brimstone.getDefaultStack());

    }

    @Override
    public void beforeClientStart() {
        EntityHelper.Client.assignEntityRenderer(EntitySulphur.class, new FallingSandRenderer());
    }

    @Override
    public void afterClientStart() {
    }
    private static final HashMap<String, String> borderMaterialMap = new HashMap<>();
    public static void addBorder(ItemStack stack, String imagePath){
        borderMaterialMap.put(stack.getItemName(), imagePath);
    }
    public static String getBorder(ItemStack stack){
        return borderMaterialMap.get(stack.getItemName());
    }
}