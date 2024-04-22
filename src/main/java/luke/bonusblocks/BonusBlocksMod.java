package luke.bonusblocks;

import luke.bonusblocks.biomes.BonusBiomes;
import luke.bonusblocks.block.BonusBlocks;
import luke.bonusblocks.block.EntitySulphur;
import luke.bonusblocks.item.BonusItems;
import luke.bonusblocks.item.ItemRawGold;
import luke.bonusblocks.item.ItemRawIron;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.entity.FallingSandRenderer;
import net.minecraft.core.block.Block;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.EntityHelper;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.SoundHelper;
import turniplabs.halplibe.util.ClientStartEntrypoint;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

import java.util.HashMap;


public class BonusBlocksMod implements ModInitializer, ClientStartEntrypoint, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "bonusblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    private static final HashMap<String, String> borderMaterialMap = new HashMap<>();
    public static void addBorder(ItemStack stack, String imagePath){
        borderMaterialMap.put(stack.getItemName(), imagePath);
    }
    public static String getBorder(ItemStack stack){
        return borderMaterialMap.get(stack.getItemName());
    }

    @Override
    public void onInitialize() {
        LOGGER.info("BonusBlocks initialized.");
    }

    @Override
    public void beforeClientStart() {
        EntityHelper.Client.assignEntityRenderer(EntitySulphur.class, new FallingSandRenderer());
        SoundHelper.Client.addSound("bonusblocks", "chimes.ogg");
        Item.oreRawGold = new ItemRawGold("ore.raw.gold", 16510).setIconCoord(10, 8);
        Item.oreRawIron = new ItemRawIron("ore.raw.iron", 16511).setIconCoord(9, 8);
    }

    @Override
    public void afterClientStart() {
    }

    @Override
    public void beforeGameStart() {

        new BonusBlocks().initializeBlocks();
        new BonusItems().initilizeItems();
        new BonusBiomes().initializeBiomes();

        addBorder(Item.ingotIron.getDefaultStack(), "/assets/bonusblocks/art/border_iron.png");
        addBorder(Item.ingotGold.getDefaultStack(), "/assets/bonusblocks/art/border_gold.png");
        addBorder(Item.ingotSteel.getDefaultStack(), "/assets/bonusblocks/art/border_steel.png");
        addBorder(new ItemStack(Item.dye, 1, 4), "/assets/bonusblocks/art/border_lapis.png");
        addBorder(Item.diamond.getDefaultStack(), "/assets/bonusblocks/art/border_diamond.png");
        addBorder(Item.dustRedstone.getDefaultStack(), "/assets/bonusblocks/art/border_redstone.png");
        addBorder(Item.olivine.getDefaultStack(), "/assets/bonusblocks/art/border_olivine.png");
        addBorder(Item.quartz.getDefaultStack(), "/assets/bonusblocks/art/border_quartz.png");
        addBorder(BonusItems.ingotCopper.getDefaultStack(), "/assets/bonusblocks/art/border_copper.png");
        addBorder(BonusItems.ingotSilver.getDefaultStack(), "/assets/bonusblocks/art/border_silver.png");

    }

    @Override
    public void afterGameStart() {
        new BonusRecipes().initializeRecipes();
    }

    @Override
    public void onRecipesReady() {
        new BonusRecipes().initializeRecipes();
    }

    @Override
    public void initNamespaces() {
        RecipeBuilder.initNameSpace(MOD_ID);

        Registries.ITEM_GROUPS.register("bonusblocks:copper_ores", Registries.stackListOf(BonusBlocks.oreCopperStone, BonusBlocks.oreCopperBasalt, BonusBlocks.oreCopperGranite, BonusBlocks.oreCopperLimestone));

        Registries.ITEM_GROUPS.register("bonusblocks:silver_ores", Registries.stackListOf(BonusBlocks.oreSilverStone, BonusBlocks.oreSilverBasalt, BonusBlocks.oreSilverGranite, BonusBlocks.oreSilverLimestone));

        Registries.ITEM_GROUPS.register("bonusblocks:crates", Registries.stackListOf(BonusBlocks.box, new ItemStack(BonusBlocks.cratePainted, 1, 0),
                new ItemStack(BonusBlocks.cratePainted, 1, 1),
                new ItemStack(BonusBlocks.cratePainted, 1, 2),
                new ItemStack(BonusBlocks.cratePainted, 1, 3),
                new ItemStack(BonusBlocks.cratePainted, 1, 4),
                new ItemStack(BonusBlocks.cratePainted, 1, 5),
                new ItemStack(BonusBlocks.cratePainted, 1, 6),
                new ItemStack(BonusBlocks.cratePainted, 1, 7),
                new ItemStack(BonusBlocks.cratePainted, 1, 8),
                new ItemStack(BonusBlocks.cratePainted, 1, 9),
                new ItemStack(BonusBlocks.cratePainted, 1, 10),
                new ItemStack(BonusBlocks.cratePainted, 1, 11),
                new ItemStack(BonusBlocks.cratePainted, 1, 12),
                new ItemStack(BonusBlocks.cratePainted, 1, 13),
                new ItemStack(BonusBlocks.cratePainted, 1, 14),
                new ItemStack(BonusBlocks.cratePainted, 1, 15)));

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
    }



}