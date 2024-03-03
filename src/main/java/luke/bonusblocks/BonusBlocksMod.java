package luke.bonusblocks;

import luke.bonusblocks.block.BonusBlocks;
import luke.bonusblocks.block.EntitySulphur;
import luke.bonusblocks.item.BonusItems;
import luke.bonusblocks.item.ItemRawGold;
import luke.bonusblocks.item.ItemRawIron;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.entity.FallingSandRenderer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.EntityHelper;
import turniplabs.halplibe.helper.SoundHelper;
import turniplabs.halplibe.helper.TextureHelper;
import turniplabs.halplibe.util.ClientStartEntrypoint;
import turniplabs.halplibe.util.GameStartEntrypoint;

import java.util.HashMap;


public class BonusBlocksMod implements ModInitializer, ClientStartEntrypoint, GameStartEntrypoint {
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
        new BonusBlocks().initializeBlocks();
        new BonusItems().initilizeItems();
    }

    @Override
    public void beforeClientStart() {
        EntityHelper.Client.assignEntityRenderer(EntitySulphur.class, new FallingSandRenderer());
        SoundHelper.Client.addSound("bonusblocks", "chimes.ogg");
        TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "whitedoor.png");
        TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "orangedoor.png");
        TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "magentadoor.png");
        TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "lightbluedoor.png");
        TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "yellowdoor.png");
        TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "limedoor.png");
        TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "pinkdoor.png");
        TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "graydoor.png");
        TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "lightgraydoor.png");
        TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "cyandoor.png");
        TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "purpledoor.png");
        TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "bluedoor.png");
        TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "browndoor.png");
        TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "greendoor.png");
        TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "reddoor.png");
        TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "blackdoor.png");
        Item.oreRawGold = new ItemRawGold("ore.raw.gold", 16510).setIconCoord(10, 8);
        Item.oreRawIron = new ItemRawIron("ore.raw.iron", 16511).setIconCoord(9, 8);
        LOGGER.info("BonusBlocks initialized.");
    }

    @Override
    public void afterClientStart() {
    }

    @Override
    public void beforeGameStart() {
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
}