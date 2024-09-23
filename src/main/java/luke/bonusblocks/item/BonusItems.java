package luke.bonusblocks.item;

import luke.bonusblocks.BonusBlocksConfig;
import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.item.DoorItem;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemDoor;
import net.minecraft.core.item.ItemPlaceable;
import turniplabs.halplibe.helper.ItemBuilder;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;

public class BonusItems {

    private int itemID(String blockName) {
        return BonusBlocksConfig.cfg.getInt("Item IDs." + blockName);
    }

    public static Item SOULWAX;
    public static Item ORE_RAW_COPPER;
    public static Item INGOT_COPPER;
    public static Item ORE_RAW_SILVER;
    public static Item INGOT_SILVER;
    public static Item DOOR_COPPER;
    public static Item DOOR_COPPER_TARNISHED;
    public static Item DOOR_COPPER_CORRODED;
    public static Item DOOR_SILVER;
    public static Item BED_SILVER;
    public static Item SEAT_SILVER;
    public static Item MOSSBALL;
    public static Item DOOR_GLASS_OBSIDIAN;

    public static Item DOOR_STONE;
    public static Item DOOR_BASALT;
    public static Item DOOR_LIMESTONE;
    public static Item DOOR_GRANITE;
    public static Item DOOR_MARBLE;
    public static Item DOOR_SLATE;
    public static Item DOOR_PERMAFROST;
    public static Item DOOR_NETHERRACK;
    public static Item DOOR_LAZURITE;
    public static Item DOOR_PERIDOT;

    public static Item BEDROLL;

    public void initilizeItems() {
        // Items

        soulwax = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/soulwax")
                .build(new Item("soulwax", "bonusblocks:item/soulwax", itemID("soulwax")));

        oreRawCopper = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/ore_raw_copper")
                .build(new ItemRawCopper("ore.raw.copper", itemID("oreRawCopper")));

        ingotCopper = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/ingot_copper")
                .build(new Item("ingot.copper", "bonusblocks:item/ingot_copper", itemID("ingotCopper")));

        oreRawSilver = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/ore_raw_silver")
                .build(new ItemRawSilver("ore.raw.silver", "bonusblocks:item/"ore_raw_silver, itemID("oreRawSilver")));

        ingotSilver = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/ingot_silver")
                .build(new Item("ingot.silver", "bonusblocks:item/ingot_silver", itemID("ingotSilver")));

        doorCopper = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_copper")
                .build(new DoorItem("door.copper", "bonusblocks:item/door_copper", itemID("doorCopper"), BonusBlocks.doorCopperBottom, BonusBlocks.doorCopperTop));

        doorCopperTarnished = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_copper_tarnished")
                .build(new ItemDoor("door.copper.tarnished", "bonusblocks:item/door_copper_tarnished", itemID("doorCopperTarnished"), BonusBlocks.doorCopperTarnishedBottom, BonusBlocks.doorCopperTarnishedTop));

        doorCopperCorroded = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_copper_corroded")
                .build(new ItemDoor("door.copper.corroded", itemID("doorCopperCorroded"), BonusBlocks.doorCopperCorrodedBottom, BonusBlocks.doorCopperCorrodedTop));

        doorSilver = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_silver")
                .build(new ItemDoor("door.silver", itemID("doorSilver"), BonusBlocks.doorSilverBottom, BonusBlocks.doorSilverTop));

        bedSilver = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/bed_silver")
                .build(new ItemSilverBed("bed.silver", itemID("bedSilver")));

        seatSilver = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/seat_silver")
                .build( new ItemPlaceable("seat.silver", itemID("seatSilver"), BonusBlocks.seatSilver));

        mossball = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/moss")
                .build(new Item("mossball", itemID("mossball")));

        doorGlassObsidian = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_glass_obsidian")
                .build(new ItemDoor("door.glass.obsidian", itemID("doorGlassObsidian"), BonusBlocks.doorGlassObsidianBottom, BonusBlocks.doorGlassObsidianTop));

        doorStone = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_stone")
                .build(new ItemDoor("door.stone", itemID("doorStone"), BonusBlocks.doorStoneBottom, BonusBlocks.doorStoneTop));

        doorBasalt = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_basalt")
                .build(new ItemDoor("door.basalt", itemID("doorBasalt"), BonusBlocks.doorBasaltBottom, BonusBlocks.doorBasaltTop));

        doorLimestone = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_limestone")
                .build(new ItemDoor("door.limestone", itemID("doorLimestone"), BonusBlocks.doorLimestoneBottom, BonusBlocks.doorLimestoneTop));

        doorGranite = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_granite")
                .build(new ItemDoor("door.granite", itemID("doorGranite"), BonusBlocks.doorGraniteBottom, BonusBlocks.doorGraniteTop));

        doorMarble = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_marble")
                .build(new ItemDoor("door.marble", itemID("doorMarble"), BonusBlocks.doorMarbleBottom, BonusBlocks.doorMarbleTop));

        doorSlate = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_slate")
                .build(new ItemDoor("door.slate", itemID("doorSlate"), BonusBlocks.doorSlateBottom, BonusBlocks.doorSlateTop));

        doorPermafrost = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_permafrost")
                .build(new ItemDoor("door.permafrost", itemID("doorPermafrost"), BonusBlocks.doorPermafrostBottom, BonusBlocks.doorPermafrostTop));

        doorNetherrack = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_netherrack")
                .build(new ItemDoor("door.netherrack", itemID("doorNetherrack"), BonusBlocks.doorNetherrackBottom, BonusBlocks.doorNetherrackTop));

        doorLazurite = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_lazurite")
                .build(new ItemDoor("door.lazurite", itemID("doorLazurite"), BonusBlocks.doorLazuriteBottom, BonusBlocks.doorLazuriteTop));

        doorPERIDOT = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_PERIDOT")
                .build(new ItemDoor("door.PERIDOT", itemID("doorPERIDOT"), BonusBlocks.doorPERIDOTBottom, BonusBlocks.doorPERIDOTTop));


        bedroll = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/bedroll")
                .build(new ItemBedroll("bedroll", itemID("bedroll"))).setMaxStackSize(1);





//        CreativeHelper.setParent(BonusItems.candleSoulwax, Block.torchCoal);
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
