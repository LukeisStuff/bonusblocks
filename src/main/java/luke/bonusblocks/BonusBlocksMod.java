package luke.bonusblocks;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.SoundHelper;
import turniplabs.halplibe.util.ClientStartEntrypoint;
import turniplabs.halplibe.util.GameStartEntrypoint;


public class BonusBlocksMod implements ModInitializer, ClientStartEntrypoint, GameStartEntrypoint {
    public static final String MOD_ID = "bonusblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("BonusBlocks initialized.");
    }

    @Override
    public void beforeClientStart() {
        SoundHelper.addSound("bonusblocks", "chimes.ogg");
    }

    @Override
    public void afterClientStart() {
    }

    @Override
    public void beforeGameStart() {
        BonusConfig.Setup();
        new BonusBlocks().initializeBlocks();
        new BonusItems().initializeItems();
        new BonusBiomes().initializeBiomes();
    }

    @Override
    public void afterGameStart() {
        new BonusBlocks().initializeBlockDetails();
    }
}