package luke.bonusblocks;

import net.minecraft.core.block.BlockPlanksPainted;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockPaintedBox extends BlockPlanksPainted {
    public BlockPaintedBox(String key, int id) {
        super(key, id);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return new ItemStack[]{new ItemStack(this, 1, meta)};
    }

}
