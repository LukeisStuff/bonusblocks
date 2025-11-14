package luke.bonusblocks.block;

import luke.bonusblocks.BonusItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockLogicOreVerdigris extends BlockLogic {
	public BlockLogicOreVerdigris(Block<?> block) {
		super(block, Material.netherrack);
	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
		switch (dropCause) {
			case SILK_TOUCH:
			case PICK_BLOCK:
				return new ItemStack[]{new ItemStack(this)};
			case EXPLOSION:
			case PROPER_TOOL:
			case PISTON_CRUSH:
				return new ItemStack[]{new ItemStack(BonusItems.ORE_RAW_VERDIGRIS, 3 + world.rand.nextInt(4))};
			default:
				return null;
		}
	}
}
