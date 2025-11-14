package luke.bonusblocks;

import luke.bonusblocks.item.ItemBedGold;
import luke.bonusblocks.item.ItemNugget;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemDoor;
import net.minecraft.core.item.ItemPlaceable;
import turniplabs.halplibe.helper.ItemBuilder;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;
import static luke.bonusblocks.BonusConfig.itemID;

public class BonusItems {

	public static Item SOULWAX;
	public static Item MOSS;

	public static Item ORE_RAW_VERDIGRIS;
	public static Item INGOT_VERDIGRIS;

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
	public static Item DOOR_STEEL;
	public static Item DOOR_GOLD;
	public static Item DOOR_VERDIGRIS;
	public static Item DOOR_VERDIGRIS_SHINE;

	public static Item BED_GOLD;
	public static Item SEAT_GOLD;

	public void initializeItems() {

		SOULWAX = new ItemBuilder(MOD_ID)
			.build(new Item("soulwax", "bonusblocks:item/soulwax", itemID("SOULWAX")));

		MOSS = new ItemBuilder(MOD_ID)
			.build(new Item("moss", "bonusblocks:item/moss", itemID("MOSS")));

		ORE_RAW_VERDIGRIS = new ItemBuilder(MOD_ID)
			.build(new ItemNugget("ore.raw.verdigris", "bonusblocks:item/ore_raw_verdigris", itemID("ORE_RAW_VERDIGRIS")));
		INGOT_VERDIGRIS = new ItemBuilder(MOD_ID)
			.build(new Item("ingot.verdigris", "bonusblocks:item/ingot_verdigris", itemID("INGOT_VERDIGRIS")));

		DOOR_STONE = new ItemBuilder(MOD_ID)
			.build(new ItemDoor("door.stone", "bonusblocks:item/door_stone", itemID("DOOR_STONE"), BonusBlocks.DOOR_STONE_BOTTOM, BonusBlocks.DOOR_STONE_TOP));
		DOOR_BASALT = new ItemBuilder(MOD_ID)
			.build(new ItemDoor("door.basalt", "bonusblocks:item/door_basalt", itemID("DOOR_BASALT"), BonusBlocks.DOOR_BASALT_BOTTOM, BonusBlocks.DOOR_BASALT_TOP));
		DOOR_LIMESTONE = new ItemBuilder(MOD_ID)
			.build(new ItemDoor("door.limestone", "bonusblocks:item/door_limestone", itemID("DOOR_LIMESTONE"), BonusBlocks.DOOR_LIMESTONE_BOTTOM, BonusBlocks.DOOR_LIMESTONE_TOP));
		DOOR_GRANITE = new ItemBuilder(MOD_ID)
			.build(new ItemDoor("door.granite", "bonusblocks:item/door_granite", itemID("DOOR_GRANITE"), BonusBlocks.DOOR_GRANITE_BOTTOM, BonusBlocks.DOOR_GRANITE_TOP));
		DOOR_MARBLE = new ItemBuilder(MOD_ID)
			.build(new ItemDoor("door.marble", "bonusblocks:item/door_marble", itemID("DOOR_MARBLE"), BonusBlocks.DOOR_MARBLE_BOTTOM, BonusBlocks.DOOR_MARBLE_TOP));
		DOOR_SLATE = new ItemBuilder(MOD_ID)
			.build(new ItemDoor("door.slate", "bonusblocks:item/door_slate", itemID("DOOR_SLATE"), BonusBlocks.DOOR_SLATE_BOTTOM, BonusBlocks.DOOR_SLATE_TOP));
		DOOR_PERMAFROST = new ItemBuilder(MOD_ID)
			.build(new ItemDoor("door.permafrost", "bonusblocks:item/door_permafrost", itemID("DOOR_PERMAFROST"), BonusBlocks.DOOR_PERMAFROST_BOTTOM, BonusBlocks.DOOR_PERMAFROST_TOP));
		DOOR_NETHERRACK = new ItemBuilder(MOD_ID)
			.build(new ItemDoor("door.netherrack", "bonusblocks:item/door_netherrack", itemID("DOOR_NETHERRACK"), BonusBlocks.DOOR_NETHERRACK_BOTTOM, BonusBlocks.DOOR_NETHERRACK_TOP));
		DOOR_GLASS_OBSIDIAN = new ItemBuilder(MOD_ID)
			.build(new ItemDoor("door.glass.obsidian", "bonusblocks:item/door_glass_obsidian", itemID("DOOR_GLASS_OBSIDIAN"), BonusBlocks.DOOR_GLASS_OBSIDIAN_BOTTOM, BonusBlocks.DOOR_GLASS_OBSIDIAN_TOP));
		DOOR_GLASS_QUARTZ = new ItemBuilder(MOD_ID)
			.build(new ItemDoor("door.glass.quartz", "bonusblocks:item/door_glass_quartz", itemID("DOOR_GLASS_QUARTZ"), BonusBlocks.DOOR_GLASS_QUARTZ_BOTTOM, BonusBlocks.DOOR_GLASS_QUARTZ_TOP));
		DOOR_GLASS_STEEL = new ItemBuilder(MOD_ID)
			.build(new ItemDoor("door.glass.steel", "bonusblocks:item/door_glass_steel", itemID("DOOR_GLASS_STEEL"), BonusBlocks.DOOR_GLASS_STEEL_BOTTOM, BonusBlocks.DOOR_GLASS_STEEL_TOP));
		DOOR_STEEL = new ItemBuilder(MOD_ID)
			.build(new ItemDoor("door.steel", "bonusblocks:item/door_steel", itemID("DOOR_STEEL"), BonusBlocks.DOOR_STEEL_BOTTOM, BonusBlocks.DOOR_STEEL_TOP));
		DOOR_GOLD = new ItemBuilder(MOD_ID)
			.build(new ItemDoor("door.gold", "bonusblocks:item/door_gold", itemID("DOOR_GOLD"), BonusBlocks.DOOR_GOLD_BOTTOM, BonusBlocks.DOOR_GOLD_TOP));

		DOOR_VERDIGRIS = new ItemBuilder(MOD_ID)
			.build(new ItemDoor("door.verdigris", "bonusblocks:item/door_verdigris", itemID("DOOR_VERDIGRIS"), BonusBlocks.DOOR_VERDIGRIS_BOTTOM, BonusBlocks.DOOR_VERDIGRIS_TOP));
		DOOR_VERDIGRIS_SHINE = new ItemBuilder(MOD_ID)
			.build(new ItemDoor("door.verdigris_shine", "bonusblocks:item/door_verdigris_shine", itemID("DOOR_VERDIGRIS_SHINE"), BonusBlocks.DOOR_VERDIGRIS_SHINE_BOTTOM, BonusBlocks.DOOR_VERDIGRIS_SHINE_TOP));

		BED_GOLD = new ItemBuilder(MOD_ID)
			.build(new ItemBedGold("bed.gold", "bonusblocks:item/bed_gold", itemID("BED_GOLD")));
		SEAT_GOLD = new ItemBuilder(MOD_ID)
			.build(new ItemPlaceable("seat.gold", "bonusblocks:item/seat_gold", itemID("SEAT_GOLD"), BonusBlocks.SEAT_GOLD));
	}
}
