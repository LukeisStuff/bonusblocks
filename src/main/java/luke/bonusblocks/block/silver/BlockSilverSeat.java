package luke.bonusblocks.block.silver;

import luke.bonusblocks.BonusBlocksMod;
import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.BlockSeat;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockSilverSeat extends BlockSeat {
    public BlockSilverSeat(String key, int id, Material metal) {
        super(key, id);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return dropCause != EnumDropCause.IMPROPER_TOOL ? new ItemStack[]{new ItemStack(BonusItems.seatSilver)} : null;
    }

}
