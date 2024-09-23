package luke.bonusblocks.item;

import luke.bonusblocks.BonusBlocksConfig;
import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.item.DoorItem;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemDoor;
import net.minecraft.core.item.ItemPlaceable;
import net.minecraft.core.item.PlaceableItem;
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

        SOULWAX = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/soulwax")
                .build(new Item("soulwax", "bonusblocks:item/soulwax", itemID("soulwax")));

        ORE_RAW_COPPER = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/ore_raw_copper")
                .build(new ItemRawCopper("ore.raw.copper","bonusblocks:item/ore_raw_copper", itemID("oreRawCopper")));

        INGOT_COPPER = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/ingot_copper")
                .build(new Item("ingot.copper", "bonusblocks:item/ingot_copper", itemID("INGOT_COPPER")));

        ORE_RAW_SILVER = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/ore_raw_silver")
                .build(new ItemRawSilver("ore.raw.silver", "bonusblocks:item/ore_raw_silver", itemID("oreRawSilver")));

        INGOT_SILVER = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/ingot_silver")
                .build(new Item("ingot.silver", "bonusblocks:item/ingot_silver", itemID("INGOT_SILVER")));

        DOOR_COPPER = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_copper")
                .build(new DoorItem("door.copper", "bonusblocks:item/door_copper", itemID("doorCopper"), BonusBlocks.doorCopperBottom, BonusBlocks.doorCopperTop));

        DOOR_COPPER_TARNISHED = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_copper_tarnished")
                .build(new DoorItem("door.copper.tarnished", "bonusblocks:item/door_copper_tarnished", itemID("doorCopperTarnished"), BonusBlocks.doorCopperTarnishedBottom, BonusBlocks.doorCopperTarnishedTop));

        DOOR_COPPER_CORRODED = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_copper_corroded")
                .build(new DoorItem("door.copper.corroded", itemID("doorCopperCorroded"), BonusBlocks.doorCopperCorrodedBottom, BonusBlocks.doorCopperCorrodedTop));

        DOOR_SILVER = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_silver")
                .build(new DoorItem("door.silver", itemID("doorSilver"), BonusBlocks.doorSilverBottom, BonusBlocks.doorSilverTop));

        BED_SILVER = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/bed_silver")
                .build(new ItemSilverBed("bed.silver", itemID("bedSilver")));

        SEAT_SILVER = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/seat_silver")
                .build( new PlaceableItem("seat.silver", itemID("seatSilver"), BonusBlocks.SEAT_SILVER));

        MOSSBALL = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/moss")
                .build(new Item("mossball", "bonusblocks:item/mossball", itemID("mossball")));

        DOOR_GLASS_OBSIDIAN = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_glass_obsidian")
                .build(new DoorItem("door.glass.obsidian", itemID("DOOR_GLASS_OBSIDIAN"), BonusBlocks.DOOR_GLASS_OBSIDIANBottom, BonusBlocks.DOOR_GLASS_OBSIDIANTop));

        DOOR_STONE = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_stone")
                .build(new DoorItem("door.stone", itemID("DOOR_STONE"), BonusBlocks.DOOR_STONEBottom, BonusBlocks.DOOR_STONETop));

        DOOR_BASALT = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_basalt")
                .build(new DoorItem("door.basalt", itemID("DOOR_BASALT"), BonusBlocks.DOOR_BASALTBottom, BonusBlocks.DOOR_BASALTTop));

        DOOR_LIMESTONE = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_limestone")
                .build(new DoorItem("door.limestone", itemID("DOOR_LIMESTONE"), BonusBlocks.DOOR_LIMESTONEBottom, BonusBlocks.DOOR_LIMESTONETop));

        DOOR_GRANITE = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_granite")
                .build(new DoorItem("door.granite", itemID("DOOR_GRANITE"), BonusBlocks.DOOR_GRANITEBottom, BonusBlocks.DOOR_GRANITETop));

        DOOR_MARBLE = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_marble")
                .build(new DoorItem("door.marble", itemID("DOOR_MARBLE"), BonusBlocks.DOOR_MARBLEBottom, BonusBlocks.DOOR_MARBLETop));

        DOOR_SLATE = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_slate")
                .build(new DoorItem("door.slate", itemID("DOOR_SLATE"), BonusBlocks.DOOR_SLATEBottom, BonusBlocks.DOOR_SLATETop));

        DOOR_PERMAFROST = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_permafrost")
                .build(new DoorItem("door.permafrost", itemID("DOOR_PERMAFROST"), BonusBlocks.DOOR_PERMAFROSTBottom, BonusBlocks.DOOR_PERMAFROSTTop));

        DOOR_NETHERRACK = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_netherrack")
                .build(new DoorItem("door.netherrack", itemID("DOOR_NETHERRACK"), BonusBlocks.DOOR_NETHERRACKBottom, BonusBlocks.DOOR_NETHERRACKTop));

        DOOR_LAZURITE = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_lazurite")
                .build(new DoorItem("door.lazurite", itemID("DOOR_LAZURITE"), BonusBlocks.DOOR_LAZURITEBottom, BonusBlocks.DOOR_LAZURITETop));

        DOOR_PERIDOT = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_PERIDOT")
                .build(new DoorItem("door.PERIDOT", itemID("DOOR_PERIDOT"), BonusBlocks.DOOR_PERIDOTBottom, BonusBlocks.DOOR_PERIDOTTop));


        BEDROLL = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/bedroll")
                .build(new ItemBedroll("bedroll", itemID("bedroll"))).setMaxStackSize(1);





//        CreativeHelper.setParent(BonusItems.candleSoulwax, Block.torchCoal);
//
//        CreativeHelper.setParent(BonusItems.INGOT_COPPER, Item.ingotGold);
//        CreativeHelper.setParent(BonusItems.INGOT_SILVER, Item.ingotGold);
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
