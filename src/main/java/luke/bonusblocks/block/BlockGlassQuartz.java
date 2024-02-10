package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockGlass;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockGlassQuartz extends BlockGlass {
    public BlockGlassQuartz(String key, int id, Material material, boolean renderInside) {
        super(key, id, material, renderInside);
    }
    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        switch (dropCause) {
            case SILK_TOUCH:
            case PICK_BLOCK:
                return new ItemStack[]{new ItemStack(this)};
            default:
                return null;
        }
    }

}
