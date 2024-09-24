package luke.bonusblocks.item;

import luke.bonusblocks.BonusBlocksConfig;
import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.item.DoorItem;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.PlaceableItem;
import turniplabs.halplibe.helper.ItemBuilder;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;

public class BonusItems {

    private int itemID(String itemName) {
        return BonusBlocksConfig.cfg.getInt("Item IDs." + itemName);
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
                .build(new DoorItem("door.copper", "bonusblocks:item/door_copper", itemID("doorCopper"), BonusBlocks.DOOR_COPPER_BOTTOM, BonusBlocks.DOOR_COPPER_TOP));

//        DOOR_COPPER_TARNISHED = new ItemBuilder(MOD_ID)
//                .setIcon("bonusblocks:item/door_copper_tarnished")
//                .build(new DoorItem("door.copper.tarnished", "bonusblocks:item/door_copper_tarnished", itemID("doorCopperTarnished"), BonusBlocks.doorCopperTarnishedBottom, BonusBlocks.doorCopperTarnishedTop));
//
//        DOOR_COPPER_CORRODED = new ItemBuilder(MOD_ID)
//                .setIcon("bonusblocks:item/door_copper_corroded")
//                .build(new DoorItem("door.copper.corroded", itemID("doorCopperCorroded"), BonusBlocks.doorCopperCorrodedBottom, BonusBlocks.doorCopperCorrodedTop));

        DOOR_SILVER = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_silver")
                .build(new DoorItem("door.silver", "bonusblocks:item/door_silver", itemID("doorSilver"), BonusBlocks.DOOR_SILVER_BOTTOM, BonusBlocks.DOOR_SILVER_TOP));

        BED_SILVER = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/bed_silver")
                .build(new SilverBedItem("bed.silver", "bonusblocks:item/bed_silver", itemID("bedSilver")));

        SEAT_SILVER = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/seat_silver")
                .build( new PlaceableItem("seat.silver", "bonusblocks:item/seat_silver", itemID("seatSilver"), BonusBlocks.SEAT_SILVER));

        MOSSBALL = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/moss")
                .build(new Item("mossball", "bonusblocks:item/mossball", itemID("mossball")));

        DOOR_GLASS_OBSIDIAN = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_glass_obsidian")
                .build(new DoorItem("door.glass.obsidian", "bonusblocks:item/door_glass_obsidian", itemID("DOOR_GLASS_OBSIDIAN"), BonusBlocks.DOOR_GLASS_OBSIDIAN_BOTTOM, BonusBlocks.DOOR_GLASS_OBSIDIAN_TOP));

        DOOR_STONE = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_stone")
                .build(new DoorItem("door.stone", "bonusblocks:item/door_stone", itemID("DOOR_STONE"), BonusBlocks.DOOR_STONE_BOTTOM, BonusBlocks.DOOR_STONE_TOP));

        DOOR_BASALT = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_basalt")
                .build(new DoorItem("door.basalt", "bonusblocks:item/door_basalt", itemID("DOOR_BASALT"), BonusBlocks.DOOR_BASALT_BOTTOM, BonusBlocks.DOOR_BASALT_TOP));

        DOOR_LIMESTONE = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_limestone")
                .build(new DoorItem("door.limestone", "bonusblocks:item/door_limestone", itemID("DOOR_LIMESTONE"), BonusBlocks.DOOR_LIMESTONE_BOTTOM, BonusBlocks.DOOR_LIMESTONE_TOP));

        DOOR_GRANITE = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_granite")
                .build(new DoorItem("door.granite", "bonusblocks:item/door_granite", itemID("DOOR_GRANITE"), BonusBlocks.DOOR_GRANITE_BOTTOM, BonusBlocks.DOOR_GRANITE_TOP));

        DOOR_MARBLE = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_marble")
                .build(new DoorItem("door.marble", "bonusblocks:item/door_marble", itemID("DOOR_MARBLE"), BonusBlocks.DOOR_MARBLE_BOTTOM, BonusBlocks.DOOR_MARBLE_TOP));

        DOOR_SLATE = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_slate")
                .build(new DoorItem("door.slate", "bonusblocks:item/door_slate", itemID("DOOR_SLATE"), BonusBlocks.DOOR_SLATE_BOTTOM, BonusBlocks.DOOR_SLATE_TOP));

        DOOR_PERMAFROST = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_permafrost")
                .build(new DoorItem("door.permafrost", "bonusblocks:item/door_permafrost", itemID("DOOR_PERMAFROST"), BonusBlocks.DOOR_PERMAFROST_BOTTOM, BonusBlocks.DOOR_PERMAFROST_TOP));

        DOOR_NETHERRACK = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_netherrack")
                .build(new DoorItem("door.netherrack", "bonusblocks:item/door_netherrack", itemID("DOOR_NETHERRACK"), BonusBlocks.DOOR_NETHERRACK_BOTTOM, BonusBlocks.DOOR_NETHERRACK_TOP));

        DOOR_LAZURITE = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_lazurite")
                .build(new DoorItem("door.lazurite", "bonusblocks:item/door_lazurite", itemID("DOOR_LAZURITE"), BonusBlocks.DOOR_LAZURITE_BOTTOM, BonusBlocks.DOOR_LAZURITE_TOP));

        DOOR_PERIDOT = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_peridot")
                .build(new DoorItem("door.peridot", "bonusblocks:item/door_peridot", itemID("DOOR_PERIDOT"), BonusBlocks.DOOR_PERIDOT_BOTTOM, BonusBlocks.DOOR_PERIDOT_TOP));


        BEDROLL = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/bedroll")
                .build(new ItemBedroll("bedroll", "bonusblocks:item/bedroll", itemID("bedroll"))).setMaxStackSize(1);





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
