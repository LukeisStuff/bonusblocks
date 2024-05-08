package luke.bonusblocks.item;

import luke.bonusblocks.BonusBlocksConfig;
import luke.bonusblocks.BonusBlocksMod;
import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemPlaceable;
import net.minecraft.core.item.tag.ItemTags;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.CreativeHelper;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.ItemHelper;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;

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
    public static Item mossball;
    public static Item bedroll;

    public void initilizeItems() {
        // Items

        //REMOVE AFTER THIS UPDATE
        candleSoulwax = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/candle_soulwax")
                .setTags(ItemTags.NOT_IN_CREATIVE_MENU)
                .build(new ItemPlaceable("candle.soulwax", itemID("candleSoulwax"), BonusBlocks.candleSoulwax));

        soulwax = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/soulwax")
                .build(new Item("soulwax", itemID("soulwax")));

        oreRawCopper = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/ore_raw_copper")
                .build(new ItemRawCopper("ore.raw.copper", itemID("oreRawCopper")));

        ingotCopper = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/ingot_copper")
                .build(new Item("ingot.copper", itemID("ingotCopper")));

        oreRawSilver = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/ore_raw_silver")
                .build(new ItemRawSilver("ore.raw.silver", itemID("oreRawSilver")));

        ingotSilver = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/ingot_silver")
                .build(new Item("ingot.silver", itemID("ingotSilver")));

        doorCopper = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_copper")
                .build(new ItemCopperDoor("door.copper", itemID("doorCopper")));

        doorCopperTarnished = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_copper_tarnished")
                .build(new ItemCopperTarnishedDoor("door.copper.tarnished", itemID("doorCopperTarnished")));

        doorCopperCorroded = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_copper_corroded")
                .build(new ItemCopperCorrodedDoor("door.copper.corroded", itemID("doorCopperCorroded")));

        doorSteel = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_steel")
                .build(new ItemSteelDoor("door.steel", itemID("doorSteel")));

        doorSilver = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_silver")
                .build(new ItemSilverDoor("door.silver", itemID("doorSilver")));

        bedSilver = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/bed_silver")
                .build(new ItemSilverBed("bed.silver", itemID("bedSilver")));

        seatSilver = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/seat_silver")
                .build( new ItemPlaceable("seat.silver", itemID("seatSilver"), BonusBlocks.seatSilver));

        foodPie = new ItemBuilder(MOD_ID)
                .build(new ItemPlaceable("food.pie", itemID("foodPie"), Block.pumpkinPie)).setMaxStackSize(1);

        mossball = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/moss")
                .build(new Item("mossball", itemID("mossball")));

//        bedroll = ItemHelper.createItem(BonusBlocksMod.MOD_ID,
//                new ItemBedroll("bedroll", itemID("bedroll")), "bedroll").setMaxStackSize(1);





//        CreativeHelper.setParent(BonusItems.candleSoulwax, Block.torchCoal);
//
//        CreativeHelper.setParent(BonusItems.foodPie, Item.foodCake);
//
//        CreativeHelper.setParent(BonusItems.ingotCopper, Item.ingotGold);
//        CreativeHelper.setParent(BonusItems.ingotSilver, Item.ingotGold);
//
//        CreativeHelper.setParent(BonusItems.oreRawCopper, Item.oreRawIron);
//        CreativeHelper.setParent(BonusItems.oreRawSilver, Item.oreRawIron);
//
//        CreativeHelper.setParent(BonusItems.seatSilver, Item.seat);
//
//        CreativeHelper.setParent(BonusItems.bedSilver, Item.bed);
//
//
//        CreativeHelper.setParent(BonusItems.doorCopper, Item.doorIron);
//        CreativeHelper.setParent(BonusItems.doorCopperTarnished, Item.doorIron);
//        CreativeHelper.setParent(BonusItems.doorCopperCorroded, Item.doorIron);
//
//        CreativeHelper.setParent(BonusItems.doorSilver, Item.doorIron);
    }
}
