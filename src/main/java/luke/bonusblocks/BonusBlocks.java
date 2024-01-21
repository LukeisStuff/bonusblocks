package luke.bonusblocks;

import luke.bonusblocks.block.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.block.color.BlockColorGrass;
import net.minecraft.client.render.block.color.BlockColorLeavesOak;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.client.sound.block.BlockSound;
import net.minecraft.client.sound.block.BlockSounds;
import net.minecraft.core.block.BlockCandle;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.data.registry.Registries;
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
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.RecipeEntrypoint;

import java.util.Properties;

import static net.minecraft.core.block.BlockMoss.stoneToMossMap;


public class BonusBlocks implements ModInitializer, RecipeEntrypoint {
    public static final String MOD_ID = "bonusblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static ConfigHandler config;
    private static int blockID;
    private static int itemID;
    static {
        Properties properties = new Properties();
        properties.put("blockID", "1500");
        properties.put("itemID", "16000");
        config = new ConfigHandler(MOD_ID, properties);
        blockID = config.getInt("blockID");
        itemID = config.getInt("itemID");
    }
    // Blocks
    public static final Block crate = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(1.0f)
            .setTextures("crate.png")
            .setFlammability(2, 2)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new Block("crate", blockID++, Material.wood));

    public static final Block crateSticky = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(1.0f)
            .setTextures("stickycrate.png")
            .setFlammability(2, 2)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new Block("crate.sticky", blockID++, Material.wood));

    public static final Block box = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.5f)
            .setResistance(5.0f)
            .setTextures(9, 1)
            .setFlammability(2, 2)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new Block("box", blockID++, Material.wood));

    public static final Block boxPainted = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.5f)
            .setResistance(5.0f)
            .setTextures("paintedbox.png")
            .setFlammability(2, 2)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT, BlockTags.NOT_IN_CREATIVE_MENU)
            .build(new BlockPaintedBox("box.painted", blockID++, Material.wood));

    public static final Block bookshelfEmptyPlanksOak = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 0.8f))
            .setHardness(1.5f)
            .setResistance(1.0f)
            .setTopBottomTexture(4, 0)
            .setFlammability(2, 2)
            .setSideTextures("emptybookshelf.png")
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new Block("bookshelf.empty.planks.oak", blockID++, Material.wood));


    public static final Block glassObsidian = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
            .setHardness(5.0f)
            .setResistance(1000.0f)
            .setTextures("obsidianglass.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockGlassObsidian("glass.obsidian", blockID++, Material.glass, true));

//    public static final Block trapdoorGlassTinted = new BlockBuilder(MOD_ID)
//            .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
//            .setHardness(0.5f)
//            .setResistance(0.5f)
//            .setTextures(6, 12)
//            .setVisualUpdateOnMetadata()
//            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
//            .build(new BlockTrapDoorTinted("trapdoor.glass.tinted", 573, Material.glass, false));
    public static final Block trapdoorGlassObsidian = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
            .setHardness(5.0f)
            .setResistance(1000.0f)
            .setTextures("obsidianglass.png")
            .setVisualUpdateOnMetadata()
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockTrapDoorObsidian("trapdoor.glass.obsidian", blockID++, Material.glass, false));


    public static final Block branch = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 0.5f))
            .setHardness(0.2f)
            .setResistance(0.2f)
            .setFlammability(4, 2)
            .setTextures("branch.png")
            .setTickOnLoad()
            .setVisualUpdateOnMetadata()
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockBranch("branch", blockID++, Material.leaves));


    public static final Block leavesOakMossy = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.2F)
            .setResistance(0.2F)
            .setFlammability(4, 2)
            .setBlockColor(new BlockColorLeavesOak())
            .setSideTextures("mossyleaves.png")
            .setBottomTexture("mossyleavesfast.png")
            .setTopBottomTexture("mossyleaves.png")
            .setTickOnLoad()
            .setVisualUpdateOnMetadata()
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_HOE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
            .build(new BlockLeavesOakMossy("leaves.oak.mossy", blockID++));
    public static final Block leavesMaple = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.2F)
            .setResistance(0.2F)
            .setFlammability(4, 2)
            .setSideTextures("mapleleaves.png")
            .setBottomTexture("mapleleavesfast.png")
            .setTopBottomTexture("mapleleaves.png")
            .setTickOnLoad()
            .setVisualUpdateOnMetadata()
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_HOE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
            .build(new BlockLeavesMaple("leaves.maple", blockID++));
    public static final Block leavesJacaranda = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.2F)
            .setResistance(0.2F)
            .setFlammability(4, 2)
            .setSideTextures("jacaleaves.png")
            .setBottomTexture("jacaleavesfast.png")
            .setTopBottomTexture("jacaleaves.png")
            .setTickOnLoad()
            .setVisualUpdateOnMetadata()
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_HOE, BlockTags.MINEABLE_BY_SWORD, BlockTags.MINEABLE_BY_SHEARS)
            .build(new BlockLeavesJacaranda("leaves.jacaranda", blockID++));


    public static final Block saplingMaple = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setFlammability(2, 1)
            .setTextures("maplesapling.png")
            .setBlockModel(new BlockModelRenderBlocks(1))
            .setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR)
            .build(new BlockSaplingMaple("sapling.maple", blockID++));
    public static final Block saplingJacaranda = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setFlammability(2, 1)
            .setTextures("jacasapling.png")
            .setBlockModel(new BlockModelRenderBlocks(1))
            .setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR)
            .build(new BlockSaplingJacaranda("sapling.jacaranda", blockID++));
    public static final Block saplingOakMossy = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setFlammability(2, 1)
            .setTextures("mossyoaksapling.png")
            .setBlockModel(new BlockModelRenderBlocks(1))
            .setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR)
            .build(new BlockSaplingMossyOak("sapling.oak.mossy", blockID++));

    public static final Block logShrub = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("shrublogtop.png")
            .setSideTextures("shrublogside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("log.shrub", blockID++));
    public static final Block logCacao = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("cacaologtop.png")
            .setSideTextures("cacaologside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("log.cacoa", blockID++));
    public static final Block logMaple = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("maplelogtop.png")
            .setSideTextures("maplelogside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("log.maple", blockID++));
    public static final Block logJacaranda = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.2F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("jacalogtop.png")
            .setSideTextures("jacalogside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("log.jacaranda", blockID++));
    public static final Block logScorched = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.2f))
            .setHardness(1.8f)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("charredlogtop.png")
            .setSideTextures("charredlogside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("log.scorched", blockID++));


    public static final Block barkOak = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 20)
            .setSideTextures(0, 20)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.oak", blockID++));

    public static final Block barkOakMossy = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 21)
            .setSideTextures(0, 21)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.oak.mossy", blockID++));

    public static final Block barkPine = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 23)
            .setSideTextures(0, 23)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.pine", blockID++));

    public static final Block barkBirch = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 24)
            .setSideTextures(0, 24)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.birch", blockID++));

    public static final Block barkCherry = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 25)
            .setSideTextures(0, 25)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.cherry", blockID++));

    public static final Block barkEucalyptus = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture(0, 26)
            .setSideTextures(0, 26)
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.eucalyptus", blockID++));

    public static final Block barkShrub = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("shrublogside.png")
            .setSideTextures("shrublogside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.shrub", blockID++));

    public static final Block barkMaple = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("maplelogside.png")
            .setSideTextures("maplelogside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.maple", blockID++));
    public static final Block barkJacaranda = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.2F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("jacalogside.png")
            .setSideTextures("jacalogside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.jacaranda", blockID++));
    public static final Block barkScorched = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.2f))
            .setHardness(1.8f)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("charredlogside.png")
            .setSideTextures("charredlogside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.scorched", blockID++));
    public static final Block barkCacao = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
            .setHardness(2.2F)
            .setResistance(1.0f)
            .setFlammability(2, 1)
            .setTopBottomTexture("cacaologside.png")
            .setSideTextures("cacaologside.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.FENCES_CONNECT)
            .build(new BlockLog("bark.cacao", blockID++));


    public static final BlockBuilder flowerBuilder = new BlockBuilder(MOD_ID)
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setBlockSound(BlockSounds.GRASS)
            .setBlockModel(new BlockModelRenderBlocks(1))
            .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR);

    public static final Block flowerCyan = flowerBuilder
            .setTextures("bluebell.png")
            .build(new BlockFlower("flower.cyan", blockID++));

    public static final Block flowerPurple = flowerBuilder
            .setTextures("heather.png")
            .build(new BlockFlower("flower.purple", blockID++));

    public static final Block flowerPink = flowerBuilder
            .setTextures("orchid.png")
            .build(new BlockFlower("flower.pink", blockID++));

    public static final Block flowerSilver = flowerBuilder
            .setTextures("whitedandelion.png")
            .build(new BlockFlower("flower.silver", blockID++));

    public static final Block flowerOrange = flowerBuilder
            .setTextures("gladiola.png")
            .build(new BlockFlower("flower.orange", blockID++));

    public static final Block flowerLime = flowerBuilder
            .setTextures("clovers.png")
            .build(new BlockFlower("flower.lime", blockID++));


    public static final Block mushroomGray = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setTextures("shroom.png")
            .setBlockModel(new BlockModelRenderBlocks(1))
            .setTags(BlockTags.MINEABLE_BY_SHEARS, BlockTags.BROKEN_BY_FLUIDS, BlockTags.PLANTABLE_IN_JAR)
            .build(new BlockMushroom("mushroom.gray", blockID++));


    public static final Block cobbleStoneReinforced = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures(14, 3)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.stone.reinforced", blockID++, Material.stone));

    public static final Block cobbleStoneMossyReinforced = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures(10, 12)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.stone.mossy.reinforced", blockID++, Material.stone));

    public static final Block cobbleBasaltReinforced = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures("compressedbasalt.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.basalt.reinforced", blockID++, Material.stone));

    public static final Block cobbleGraniteReinforced = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures("compressedgranite.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.granite.reinforced", blockID++, Material.stone));

    public static final Block cobbleLimestoneReinforced = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures("compressedlimestone.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.limestone.reinforced", blockID++, Material.stone));

    public static final Block cobblePermafrostReinforced = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.8f))
            .setHardness(2.5f)
            .setResistance(15.0f)
            .setTextures("compressedpermafrost.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("cobble.permafrost.reinforced", blockID++, Material.stone));


    public static final Block scorchedstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8f)
            .setResistance(10.0f)
            .setSideTextures("redsandstoneside.png")
            .setBottomTexture("redsandstonebottom.png")
            .setTopTexture("redsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.GROWS_TREES, BlockTags.GROWS_SPINIFEX, BlockTags.GROWS_FLOWERS, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
            .build(new Block("scorchedstone", blockID++, Material.stone));


    public static final Block pillarSlate = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("slatepillarside.png")
            .setTopBottomTexture("slatepillartop.png")
            .setBlockModel(new BlockModelRenderBlocks(27))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockAxisAligned("pillar.slate", blockID++, Material.stone));
    public static final Block marblePolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("polishedmarbleside.png")
            .setTopBottomTexture("polishedmarbletop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("marble.polished", blockID++, Material.stone));

    public static final Block sandstonePolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("polishedsandstoneside.png")
            .setTopBottomTexture("polishedsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("sandstone.polished", blockID++, Material.stone));

    public static final Block permafrostPolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("polishedpermafrostside.png")
            .setTopBottomTexture("polishedpermafrostop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("permafrost.polished", blockID++, Material.stone));

    public static final Block scorchedstonePolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("polishedredsandstoneside.png")
            .setTopBottomTexture("polishedredsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("scorchedstone.polished", blockID++, Material.stone));

    public static final Block capstoneMarbleCarved = new BlockBuilder(MOD_ID)
            .setBlockSound(BlockSounds.STONE)
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures(10, 14)
            .setTopBottomTexture(9, 14)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("capstone.marble.carved", blockID++, Material.stone));

    public static final Block slateCarved = new BlockBuilder(MOD_ID)
            .setBlockSound(BlockSounds.STONE)
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures(6, 14)
            .setTopBottomTexture(8, 14)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("slate.carved", blockID++, Material.stone));

    public static final Block marbleCarved = new BlockBuilder(MOD_ID)
            .setBlockSound(BlockSounds.STONE)
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures(6, 14)
            .setTopBottomTexture(8, 14)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("marble.carved", blockID++, Material.stone));

    public static final Block sandstoneCarved = new BlockBuilder(MOD_ID)
            .setBlockSound(BlockSounds.STONE)
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("carvedsandstone.png")
            .setTopBottomTexture("polishedsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("sandstone.carved", blockID++, Material.stone));

    public static final Block permafrostCarved = new BlockBuilder(MOD_ID)
            .setBlockSound(BlockSounds.STONE)
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("carvedpermafrost.png")
            .setTopBottomTexture("polishedpermafrostop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("permafrost.carved", blockID++, Material.stone));

    public static final Block scorchedstoneCarved = new BlockBuilder(MOD_ID)
            .setBlockSound(BlockSounds.STONE)
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setSideTextures("carvedscorchedstone.png")
            .setTopBottomTexture("polishedredsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
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


    public static final Block blockRawIron = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0f)
            .setResistance(10.0f)
            .setTextures("rawiron.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("block.raw.iron", blockID++, Material.metal));

    public static final Block blockRawGold = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0f)
            .setResistance(10.0f)
            .setTextures("rawgold.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("block.raw.gold", blockID++, Material.metal));

    public static final Block blockFlint = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0f)
            .setResistance(5.0f)
            .setTextures("flintblock.png")
            .setInfiniburn()
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("block.flint", blockID++, Material.stone));


    public static final Block brickNetherrack = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setTextures("netherbrick.png")
            .setInfiniburn()
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("brick.netherrack", blockID++, Material.stone));
    public static final Block brickScorchedstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8f)
            .setResistance(10.0f)
            .setTextures("redsandstonebrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("brick.scorchedstone", blockID++, Material.stone));
    public static final Block brickMud = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.5f)
            .setResistance(10.0f)
            .setTextures("mudbrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("brick.mud", blockID++, Material.stone));
    public static final Block brickSteel = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0F)
            .setResistance(4000.0f)
            .setTextures("steelbrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("brick.steel", blockID++, Material.metal));
    public static final Block brickQuartz = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0f)
            .setResistance(10.0f)
            .setTextures("quartzbrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("brick.quartz", blockID++, Material.stone));
    public static final Block brickOlivine = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0f)
            .setResistance(10.0f)
            .setTextures("olivinebrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("brick.olivine", blockID++, Material.stone));


    public static final Block soulslate = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.6f))
            .setHardness(2.0f)
            .setResistance(20.0f)
            .setTextures("soulslate.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("soulslate", blockID++, Material.stone));

    public static final Block brimstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 0.4f))
            .setHardness(400.0f)
            .setResistance(20000.0f)
            .setTextures("brimstone.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockBrimstone("brimstone", blockID++, Material.piston));


    public static final Block clayBaked = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0f)
            .setResistance(10.0f)
            .setTextures("bakedclay.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new Block("clay.baked", blockID++, Material.stone));


    public static final Block blockWicker = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
            .setHardness(0.5f)
            .setResistance(0.5f)
            .setTextures(4, 9)
            .setFlammability(3, 3)
            .setTags(BlockTags.MINEABLE_BY_AXE)
            .build(new Block("block.wicker", blockID++, Material.cloth));


    public static final Block pie = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.cloth", "step.cloth", 1.0f, 1.0f))
            .setHardness(0.5f)
            .setResistance(0.5f)
            .setTopTexture("pietop.png")
            .setBottomTexture("piebottom.png")
            .setSideTextures("pieside.png")
            .setTags(BlockTags.BROKEN_BY_FLUIDS, BlockTags.NOT_IN_CREATIVE_MENU)
            .build(new BlockPie("pie", blockID++));


    public static final Block grassOvergrown = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTopBottomTexture(0, 0)
            .setSideTextures(0, 0)
            .setBlockColor(new BlockColorGrass())
            .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.PASSIVE_MOBS_SPAWN, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
            .build(new Block("grass.overgrown", blockID++, Material.grass));
    public static final Block grassRetroOvergrown = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures(8, 1)
            .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.PASSIVE_MOBS_SPAWN, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
            .build(new Block("grass.retro.overgrown", blockID++, Material.grass));
    public static final Block grassScorchedOvergrown = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures(16, 11)
            .setTags(BlockTags.MINEABLE_BY_SHOVEL, BlockTags.GROWS_FLOWERS, BlockTags.GROWS_SUGAR_CANE, BlockTags.GROWS_TREES, BlockTags.PASSIVE_MOBS_SPAWN, BlockTags.FIREFLIES_CAN_SPAWN, BlockTags.CAVE_GEN_REPLACES_SURFACE, BlockTags.CAVES_CUT_THROUGH)
            .build(new Block("grass.scorched.overgrown", blockID++, Material.grass));
    public static final Block pathOvergrown = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures(4, 6)
            .setTags(BlockTags.MINEABLE_BY_SHOVEL)
            .setBlockDrop(BonusBlocks.pathOvergrown)
            .build(new BlockDirtPath("path.overgrown", blockID++));


    public static final Block blockMushroomBrown = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setLuminance(2)
            .setTextures("brownmushroom.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
            .build(new Block("block.mushroom.brown", blockID++, Material.dirt));
    public static final Block blockMushroomRed = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures("redmushroom.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
            .build(new Block("block.mushroom.red", blockID++, Material.dirt));
    public static final Block blockMushroomGray = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.grass", "step.grass", 1.0f, 1.0f))
            .setHardness(0.6f)
            .setResistance(1.0f)
            .setTextures("graymushroom.png")
            .setFlammability(4, 4)
            .setTags(BlockTags.MINEABLE_BY_AXE, BlockTags.MINEABLE_BY_SHEARS)
            .build(new Block("block.mushroom.gray", blockID++, Material.dirt));


    public static final Block candleSoulwax = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.sand", "step.sand", 1.0f, 1.2f))
            .setHardness(0.0f)
            .setResistance(0.0f)
            .setLuminance(10)
            .setTextures(5, 7)
            .setVisualUpdateOnMetadata()
            .setBlockModel(new BlockModelRenderBlocks(25))
            .setTags(BlockTags.MINEABLE_BY_SWORD, BlockTags.BROKEN_BY_FLUIDS, BlockTags.NOT_IN_CREATIVE_MENU)
            .build(new BlockCandle("candle.soulwax", blockID++, Material.decoration));


    public static Item candleSoulwaxItem = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new ItemPlaceable("candle.soulwax", itemID++, candleSoulwax),
            "candle.soulwax",
            "soulwaxcandle.png");

    public static Item soulwax = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new Item("soulwax", itemID++),
            "soulwax",
            "soulwax.png");

    public static Item foodPie = ItemHelper.createItem(BonusBlocks.MOD_ID,
            new ItemPlaceable("Pumpkin Pie", itemID++, pie).setMaxStackSize(1),
            "food.pie",
            "pie.png");
    public static final Block slabSlatePolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setSideTextures(6, 14)
            .setTopBottomTexture(8, 14)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(slateCarved, blockID++));
    public static final Block slabMarblePolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setSideTextures("carvedmarble.png")
            .setTopBottomTexture("polishedmarbletop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(marbleCarved, blockID++));
    public static final Block slabSandstonePolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setSideTextures("carvedsandstone.png")
            .setTopBottomTexture("polishedsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(sandstoneCarved, blockID++));
    public static final Block slabPermafrostPolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setSideTextures("carvedpermafrost.png")
            .setTopBottomTexture("polishedpermafrostop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(permafrostCarved, blockID++));
    public static final Block slabScorchedstonePolished = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setSideTextures("carvedscorchedstone.png")
            .setTopBottomTexture("polishedredsandstonetop.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(scorchedstoneCarved, blockID++));
    public static final Block slabBrickStonePolishedMossy = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(11, 8)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(Block.brickStonePolishedMossy, blockID++));
    public static final Block slabBrickSandstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(0, 14)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(Block.brickSandstone, blockID++));
    public static final Block slabBrickGold = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(3.0F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(9, 9)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(Block.brickGold, blockID++));
    public static final Block slabBrickLapis = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(9, 8)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(Block.brickLapis, blockID++));
    public static final Block slabBrickPermafrost = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(13, 15)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(Block.brickPermafrost, blockID++));
    public static final Block slabBrickIron = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(8, 8)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(Block.brickIron, blockID++));
    public static final Block slabBrickNetherrack = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("netherbrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(brickNetherrack, blockID++));
    public static final Block slabBrickScorchedstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("redsandstonebrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(brickScorchedstone, blockID++));
    public static final Block slabBrickMud = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("mudbrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(brickMud, blockID++));

    public static final Block slabCobblePermafrost = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(12, 15)
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(Block.cobblePermafrost, blockID++));
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
            .build(new BlockSlab(scorchedstone, blockID++));

    public static final Block slabBrickSteel = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0f)
            .setResistance(4000.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("steelbrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(brickSteel, blockID++));
    public static final Block slabBrickQuartz = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("quartzbrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(brickQuartz, blockID++));
    public static final Block slabBrickOlivine = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("olivinebrick.png")
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockSlab(brickOlivine, blockID++));


    public static final Block stairsBrickStonePolishedMossy = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(2.0F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(11, 8)
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(Block.brickStonePolishedMossy, blockID++));
    public static final Block stairsBrickSandstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(0, 14)
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(Block.brickSandstone, blockID++));
    public static final Block stairsBrickGold = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(3.0F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(9, 9)
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(Block.brickGold, blockID++));
    public static final Block stairsBrickLapis = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(9, 8)
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(Block.brickLapis, blockID++));
    public static final Block stairsBrickPermafrost = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(13, 15)
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(Block.brickPermafrost, blockID++));
    public static final Block stairsBrickIron = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(8, 8)
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(Block.brickIron, blockID++));
    public static final Block stairsBrickNetherrack = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("netherbrick.png")
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(brickNetherrack, blockID++));
    public static final Block stairsBrickScorchedstone = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("redsandstonebrick.png")
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(brickScorchedstone, blockID++));
    public static final Block stairsBrickMud = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(1.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("mudbrick.png")
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(brickMud, blockID++));

    public static final Block stairsCobblePermafrost = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(0.8F)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures(12, 15)
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(Block.cobblePermafrost, blockID++));

    public static final Block stairsBrickSteel = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.5f))
            .setHardness(5.0f)
            .setResistance(4000.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("steelbrick.png")
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(brickSteel, blockID++));

    public static final Block stairsBrickQuartz = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("quartzbrick.png")
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(brickQuartz, blockID++));

    public static final Block stairsBrickOlivine = new BlockBuilder(MOD_ID)
            .setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
            .setHardness(3.0f)
            .setResistance(10.0f)
            .setUseInternalLight()
            .setVisualUpdateOnMetadata()
            .setTextures("olivinebrick.png")
            .setBlockModel(new BlockModelRenderBlocks(10))
            .setTags(BlockTags.MINEABLE_BY_PICKAXE)
            .build(new BlockStairs(brickOlivine, blockID++));

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
        templateBarktoPlank.addInput('X', BonusBlocks.barkShrub).create("barkShrubtoPlanks", new ItemStack(Block.planksOakPainted, 4, 4));
        templateBarktoPlank.addInput('X', BonusBlocks.barkCacao).create("barkCacaotoPlanks", new ItemStack(Block.planksOakPainted, 4, 5));

        RecipeBuilderShaped templateLogtoPlank = new RecipeBuilderShaped(MOD_ID, "X");
        templateLogtoPlank.addInput('X', BonusBlocks.logMaple).create("logMapletoPlanks", new ItemStack(Block.planksOakPainted, 4, 14));
        templateLogtoPlank.addInput('X', BonusBlocks.logJacaranda).create("logJacarandatoPlanks", new ItemStack(Block.planksOakPainted, 4, 10));
        templateLogtoPlank.addInput('X', BonusBlocks.logScorched).create("logScorchedtoPlanks", new ItemStack(Block.planksOakPainted, 4, 15));
        templateLogtoPlank.addInput('X', BonusBlocks.logShrub).create("logShrubtoPlanks", new ItemStack(Block.planksOakPainted, 4, 4));
        templateLogtoPlank.addInput('X', BonusBlocks.logCacao).create("logCacaotoPlanks", new ItemStack(Block.planksOakPainted, 4, 5));

        RecipeBuilderShaped templateItemtoBlock = new RecipeBuilderShaped(MOD_ID, "XXX", "XXX", "XXX");
        templateItemtoBlock.addInput('X', Item.bone).create("block_of_bone", new ItemStack(BonusBlocks.blockBone, 1));
        templateItemtoBlock.addInput('X', Item.slimeball).create("block_of_slime", new ItemStack(BonusBlocks.blockSlime, 1));
        templateItemtoBlock.addInput('X', Item.sulphur).create("block_of_sulphur", new ItemStack(BonusBlocks.blockSulphur, 1));
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

        // Modify an existing recipe group, this adds the coal block to the coal ores group
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logMaple.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logScorched.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logShrub.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logJacaranda.getDefaultStack());
        Registries.ITEM_GROUPS.getItem("minecraft:logs").add(BonusBlocks.logCacao.getDefaultStack());

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

    }
}


//
//        RecipeHelper.smeltingManager.addSmelting(Block.blockClay.id, new ItemStack(clayBaked, 1));
//
//        RecipeHelper.smeltingManager.addSmelting(Block.netherrack.id, new ItemStack(Block.netherrackIgneous, 1));
//
//        RecipeHelper.smeltingManager.addSmelting(Block.soulsand.id, new ItemStack(soulwax, 1));
//
//        RecipeHelper.blastingManager.addSmelting(Block.blockClay.id, new ItemStack(clayBaked, 1));
//
//        RecipeHelper.blastingManager.addSmelting(Block.netherrack.id, new ItemStack(Block.netherrackIgneous, 1));
//
//        RecipeHelper.blastingManager.addSmelting(Block.soulsand.id, new ItemStack(soulwax, 1));
//
//        RecipeHelper.blastingManager.addSmelting(Block.obsidian.id, new ItemStack(glassObsidian, 1));