package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicOverlayPebbles;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.world.World;

public class BlockLogicOverlayNuggetsFlint extends BlockLogicOverlayPebbles {

	public BlockLogicOverlayNuggetsFlint(Block<?> block) {
		super(block, Material.stone);
		this.setBlockBounds(0.0, 0.0, 0.0, 1.0, 0.0625, 1.0);
	}

	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
		return dropCause == EnumDropCause.PICK_BLOCK ? new ItemStack[]{new ItemStack(Items.FLINT, 1)} : new ItemStack[]{new ItemStack(Items.FLINT, meta + 1)};
	}
}
