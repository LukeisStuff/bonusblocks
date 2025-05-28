package luke.bonusblocks.block;

import luke.bonusblocks.BonusItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicMoss;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockMossy extends BlockLogicMoss {

    public BlockMossy(Block<?> block, Material material) {
        super(block, block);
        block.setTicking(true);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        switch (dropCause) {
            case SILK_TOUCH:
            case PICK_BLOCK:
            case PISTON_CRUSH:
                return new ItemStack[]{new ItemStack(this)};
            default:
                return new ItemStack[]{new ItemStack(BonusItems.MOSS, 4)};
        }
    }

}
