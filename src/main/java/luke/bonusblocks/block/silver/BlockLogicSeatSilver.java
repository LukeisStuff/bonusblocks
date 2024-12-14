package luke.bonusblocks.block.silver;

import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicSeat;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.entity.TileEntitySeat;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockLogicSeatSilver extends BlockLogicSeat {
    public BlockLogicSeatSilver(Block<?> block, Material material) {
        super(block);
        this.setBlockBounds(0.0, 0.0, 0.0, 1.0, 0.5625, 1.0);
        block.withEntity(() -> new TileEntitySeat(block));
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
        return dropCause != EnumDropCause.IMPROPER_TOOL ? new ItemStack[]{new ItemStack(BonusItems.SEAT_SILVER)} : null;
    }

}
