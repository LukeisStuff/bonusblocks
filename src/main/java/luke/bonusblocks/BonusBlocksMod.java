package luke.bonusblocks;

import luke.bonusblocks.biomes.BonusBiomes;
import luke.bonusblocks.block.BonusBlocks;
import luke.bonusblocks.block.EntitySulphur;
import luke.bonusblocks.item.BonusItems;
import luke.bonusblocks.item.ItemRawGold;
import luke.bonusblocks.item.ItemRawIron;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.entity.FallingSandRenderer;
import net.minecraft.core.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.EntityHelper;
import turniplabs.halplibe.helper.SoundHelper;
import turniplabs.halplibe.util.ClientStartEntrypoint;
import turniplabs.halplibe.util.GameStartEntrypoint;


public class BonusBlocksMod implements ModInitializer, ClientStartEntrypoint, GameStartEntrypoint {
    public static final String MOD_ID = "bonusblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    private static int entityID = 300;

    @Override
    public void onInitialize() {
        LOGGER.info("BonusBlocks initialized.");
    }

    @Override
    public void beforeClientStart() {
        EntityHelper.Client.assignEntityRenderer(EntitySulphur.class, new FallingSandRenderer());
        SoundHelper.Client.addSound("bonusblocks", "chimes.ogg");
        Item.oreRawGold = new ItemRawGold("ore.raw.gold", 16510);
        Item.oreRawIron = new ItemRawIron("ore.raw.iron", 16511);
    }

    @Override
    public void afterClientStart() {
    }

    @Override
    public void beforeGameStart() {
        new BonusBlocks().initializeBlocks();
        new BonusItems().initilizeItems();
        new BonusBiomes().initializeBiomes();
        EntityHelper.Core.createEntity(EntitySulphur.class, entityID++, "FallingSulphur");
    }

    @Override
    public void afterGameStart() {
    }

}