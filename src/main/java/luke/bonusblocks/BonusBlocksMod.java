package luke.bonusblocks;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.crafting.LookupFuelFurnaceBlast;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
        new BonusBlocksMod().initializeBlockDetails();
    }

    public void initializeBlockDetails() {
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.LOG_JACARANDA.id(), 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.LOG_SCORCHED.id(), 1600);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.LOG_CACAO.id(), 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.LOG_SHRUB.id(), 300);

        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.BOOKSHELF_EMPTY_PLANKS_OAK.id(), 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.BRANCH.id(), 300);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.SAPLING_JACARANDA.id(), 100);
        LookupFuelFurnace.instance.addFuelEntry(BonusBlocks.SAPLING_OAK_MOSSY.id(), 100);

        LookupFuelFurnaceBlast.instance.addFuelEntry(BonusBlocks.BRICK_OLIVINE.id(), 200);
        LookupFuelFurnaceBlast.instance.addFuelEntry(BonusBlocks.STAIRS_BRICK_OLIVINE.id(), 200);
        LookupFuelFurnaceBlast.instance.addFuelEntry(BonusBlocks.SLAB_BRICK_OLIVINE.id(), 100);

    }
}