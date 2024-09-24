package luke.bonusblocks;

import luke.bonusblocks.biomes.BonusBiomes;
import luke.bonusblocks.block.BonusBlocks;
import luke.bonusblocks.item.BonusItems;
import luke.bonusblocks.item.ItemRawGold;
import luke.bonusblocks.item.ItemRawIron;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.SoundHelper;
import turniplabs.halplibe.util.ClientStartEntrypoint;
import turniplabs.halplibe.util.GameStartEntrypoint;


public class BonusBlocksMod implements ModInitializer, ClientStartEntrypoint, GameStartEntrypoint {
    public static final String MOD_ID = "bonusblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final int entityID = 300;

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
        new BonusBlocks().initializeBlocks();
        new BonusItems().initilizeItems();
        new BonusBiomes().initializeBiomes();
        Items.ORE_RAW_GOLD = new ItemRawGold("ore.raw.gold", "minecraft:item/ore_raw_gold", 16510);
        Items.ORE_RAW_IRON = new ItemRawIron("ore.raw.iron", "minecraft:item/ore_raw_iron", 16511);
//        EntityHelper.createEntity(EntitySulphur.class, entityID++, "FallingSulphur", FallingBlockRenderer::new);
    }

    @Override
    public void afterGameStart() {
        new BonusBlocks().initializeBlockDetails();
    }
}