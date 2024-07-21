package luke.bonusblocks.item;

import luke.bonusblocks.BonusBlocksConfig;
import luke.bonusblocks.BonusBlocksMod;
import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemDoor;
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
    public static Item doorGlassObsidian;
    public static Item bedroll;

    public void initilizeItems() {
        // Items

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
                .build(new ItemDoor("door.copper", itemID("doorCopper"), BonusBlocks.doorCopperBottom, BonusBlocks.doorCopperTop));

        doorCopperTarnished = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_copper_tarnished")
                .build(new ItemDoor("door.copper.tarnished", itemID("doorCopperTarnished"), BonusBlocks.doorCopperTarnishedBottom, BonusBlocks.doorCopperTarnishedTop));

        doorCopperCorroded = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_copper_corroded")
                .build(new ItemDoor("door.copper.corroded", itemID("doorCopperCorroded"), BonusBlocks.doorCopperCorrodedBottom, BonusBlocks.doorCopperCorrodedTop));

        doorSteel = new ItemBuilder(MOD_ID)
                .setIcon("bonusblocks:item/door_steel")
                .build(new ItemDoor("door.steel", itemID("doorSteel"), BonusBlocks.doorSteelBottom, BonusBlocks.doorSteelTop));

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
