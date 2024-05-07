package luke.bonusblocks.block;

import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.BlockMoss;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockMossy extends BlockMoss {

    public BlockMossy(String key, int id, Material moss) {
        super(key, id);
        this.setTicking(true);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        switch (dropCause) {
            case SILK_TOUCH:
            case PICK_BLOCK:
                return new ItemStack[]{new ItemStack(this)};
            default:
                return new ItemStack[]{new ItemStack(BonusItems.mossball, 4)};
        }
    }

}
