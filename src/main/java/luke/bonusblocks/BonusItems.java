package luke.bonusblocks;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemDoor;
import turniplabs.halplibe.helper.ItemBuilder;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;

public class BonusItems {

    int itemID = 16650;

    public static Item SOULWAX;
    public static Item MOSSBALL;

    public static Item DOOR_STONE;
    public static Item DOOR_BASALT;
    public static Item DOOR_LIMESTONE;
    public static Item DOOR_GRANITE;
    public static Item DOOR_MARBLE;
    public static Item DOOR_SLATE;
    public static Item DOOR_PERMAFROST;
    public static Item DOOR_NETHERRACK;
    public static Item DOOR_GLASS_OBSIDIAN;
    public static Item DOOR_GLASS_QUARTZ;
    public static Item DOOR_GLASS_STEEL;

    public void initilizeItems() {
        // Items

        SOULWAX = new ItemBuilder(MOD_ID)
                .build(new Item("soulwax", "bonusblocks:item/soulwax", itemID++));

        MOSSBALL = new ItemBuilder(MOD_ID)
                .build(new Item("mossball", "bonusblocks:item/mossball", itemID++));

        DOOR_STONE = new ItemBuilder(MOD_ID)
                .build(new ItemDoor("door.stone", "bonusblocks:item/door_stone", itemID++, BonusBlocks.DOOR_STONE_BOTTOM, BonusBlocks.DOOR_STONE_TOP));

        DOOR_BASALT = new ItemBuilder(MOD_ID)
                .build(new ItemDoor("door.basalt", "bonusblocks:item/door_basalt", itemID++, BonusBlocks.DOOR_BASALT_BOTTOM, BonusBlocks.DOOR_BASALT_TOP));

        DOOR_LIMESTONE = new ItemBuilder(MOD_ID)
                .build(new ItemDoor("door.limestone", "bonusblocks:item/door_limestone", itemID++, BonusBlocks.DOOR_LIMESTONE_BOTTOM, BonusBlocks.DOOR_LIMESTONE_TOP));

        DOOR_GRANITE = new ItemBuilder(MOD_ID)
                .build(new ItemDoor("door.granite", "bonusblocks:item/door_granite", itemID++, BonusBlocks.DOOR_GRANITE_BOTTOM, BonusBlocks.DOOR_GRANITE_TOP));

        DOOR_MARBLE = new ItemBuilder(MOD_ID)
                .build(new ItemDoor("door.marble", "bonusblocks:item/door_marble", itemID++, BonusBlocks.DOOR_MARBLE_BOTTOM, BonusBlocks.DOOR_MARBLE_TOP));

        DOOR_SLATE = new ItemBuilder(MOD_ID)
                .build(new ItemDoor("door.slate", "bonusblocks:item/door_slate", itemID++, BonusBlocks.DOOR_SLATE_BOTTOM, BonusBlocks.DOOR_SLATE_TOP));

        DOOR_PERMAFROST = new ItemBuilder(MOD_ID)
                .build(new ItemDoor("door.permafrost", "bonusblocks:item/door_permafrost", itemID++, BonusBlocks.DOOR_PERMAFROST_BOTTOM, BonusBlocks.DOOR_PERMAFROST_TOP));

        DOOR_NETHERRACK = new ItemBuilder(MOD_ID)
                .build(new ItemDoor("door.netherrack", "bonusblocks:item/door_netherrack", itemID++, BonusBlocks.DOOR_NETHERRACK_BOTTOM, BonusBlocks.DOOR_NETHERRACK_TOP));

        DOOR_GLASS_OBSIDIAN = new ItemBuilder(MOD_ID)
                .build(new ItemDoor("door.glass.obsidian", "bonusblocks:item/door_glass_obsidian", itemID++, BonusBlocks.DOOR_GLASS_OBSIDIAN_BOTTOM, BonusBlocks.DOOR_GLASS_OBSIDIAN_TOP));
        DOOR_GLASS_QUARTZ = new ItemBuilder(MOD_ID)
                .build(new ItemDoor("door.glass.quartz", "bonusblocks:item/door_glass_quartz", itemID++, BonusBlocks.DOOR_GLASS_QUARTZ_BOTTOM, BonusBlocks.DOOR_GLASS_QUARTZ_TOP));
        DOOR_GLASS_STEEL = new ItemBuilder(MOD_ID)
                .build(new ItemDoor("door.glass.steel", "bonusblocks:item/door_glass_steel", itemID++, BonusBlocks.DOOR_GLASS_STEEL_BOTTOM, BonusBlocks.DOOR_GLASS_STEEL_TOP));
    }
}
