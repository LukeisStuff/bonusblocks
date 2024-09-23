package luke.bonusblocks.block.silver;

import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.SeatBlock;
import net.minecraft.core.block.entity.BlockEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockSilverSeat extends SeatBlock {
    public BlockSilverSeat(String key, String namespaceId, int id, Material material) {
        super(key, namespaceId, id);
        this.setBlockBounds(0.0, 0.0, 0.0, 1.0, 0.5625, 1.0);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, BlockEntity BlockEntity) {
        return dropCause != EnumDropCause.IMPROPER_TOOL ? new ItemStack[]{new ItemStack(BonusItems.SEAT_SILVER)} : null;
    }

}
