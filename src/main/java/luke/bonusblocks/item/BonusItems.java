package luke.bonusblocks.item;

import luke.bonusblocks.BonusBlocksConfig;
import luke.bonusblocks.BonusBlocksMod;
import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemPlaceable;
import turniplabs.halplibe.helper.ItemHelper;

public class BonusItems {

    private int itemID(String blockName) {
        return BonusBlocksConfig.cfg.getInt("Item IDs." + blockName);
    }

    public static Item candleSoulwax;
    public static Item soulwax;
    public static Item oreRawCopper;
    public static Item ingotCopper;
    public static Item oreRawSilver;
    public static Item ingotSilver;
    public static Item doorCopper;
    public static Item doorCopperTarnished;
    public static Item doorCopperCorroded;
    public static Item doorSteel;
    public static Item doorSilver;
    public static Item bedSilver;
    public static Item seatSilver;
    public static Item foodPie;

    public void initilizeItems() {
        // Items
        candleSoulwax = ItemHelper.createItem(BonusBlocksMod.MOD_ID,
                new ItemPlaceable("candle.soulwax", itemID("candleSoulwax"), BonusBlocks.candleSoulwax), "soulwaxcandle.png");

        soulwax = ItemHelper.createItem(BonusBlocksMod.MOD_ID,
                new Item("soulwax", itemID("soulwax")), "soulwax.png");

        oreRawCopper = ItemHelper.createItem(BonusBlocksMod.MOD_ID,
                new ItemRawCopper("ore.raw.copper", itemID("oreRawCopper")), "rawcopper.png");

        ingotCopper = ItemHelper.createItem(BonusBlocksMod.MOD_ID,
                new Item("ingot.copper", itemID("ingotCopper")), "copperingot.png");

        oreRawSilver = ItemHelper.createItem(BonusBlocksMod.MOD_ID,
                new ItemRawSilver("ore.raw.silver", itemID("oreRawSilver")), "rawsilver.png");

        ingotSilver = ItemHelper.createItem(BonusBlocksMod.MOD_ID,
                new Item("ingot.silver", itemID("ingotSilver")), "silveringot.png");

        doorCopper = ItemHelper.createItem(BonusBlocksMod.MOD_ID,
                new ItemCopperDoor("door.copper", itemID("doorCopper")), "copperdoor.png");

        doorCopperTarnished = ItemHelper.createItem(BonusBlocksMod.MOD_ID,
                new ItemCopperTarnishedDoor("door.copper.tarnished", itemID("doorCopperTarnished")), "tarnishedcopperdoor.png");

        doorCopperCorroded = ItemHelper.createItem(BonusBlocksMod.MOD_ID,
                new ItemCopperCorrodedDoor("door.copper.corroded", itemID("doorCopperCorroded")), "corrodedcopperdoor.png");

        doorSteel = ItemHelper.createItem(BonusBlocksMod.MOD_ID,
                new ItemSteelDoor("door.steel", itemID("doorSteel"), Material.metal), "steeldoor.png");

        doorSilver = ItemHelper.createItem(BonusBlocksMod.MOD_ID,
                new ItemSilverDoor("door.silver", itemID("doorSilver"), Material.metal), "silverdoor.png");

        bedSilver = ItemHelper.createItem(BonusBlocksMod.MOD_ID,
                new ItemSilverBed("bed.silver", itemID("bedSilver")), "silverbed.png");

        seatSilver = ItemHelper.createItem(BonusBlocksMod.MOD_ID,
                new ItemPlaceable("seat.silver", itemID("seatSilver"), BonusBlocks.seatSilver), "silverseat.png");

//         bedroll = ItemHelper.createItem(BonusBlocks.MOD_ID,
//            new ItemBedroll("bedroll", itemID("bedroll")), "bedroll.png").setMaxStackSize(1);

        foodPie = ItemHelper.createItem(BonusBlocksMod.MOD_ID,
                new ItemPlaceable("food.pie", itemID("foodPie"), BonusBlocks.pie), "pie.png").setMaxStackSize(1);

    }
}
