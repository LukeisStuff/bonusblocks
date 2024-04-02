package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

public class BlockPot extends Block {

    public BlockPot(String key, int id, Material material) {
        super(key, id, material);
        this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 0.5f, 0.75F);
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        return world.canPlaceOnSurfaceOfBlock(x, y - 1, z) && super.canPlaceBlockAt(world, x, y, z);
    }

    public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        return AABB.getBoundingBoxFromPool((float)x + 0.3125F, (float)y, (float)z + 0.3125F, (float)(x + 1) - 0.3125F, (float)y + 0.375F, (float)(z + 1) - 0.3125F);
    }

    public AABB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {
        return this.getCollisionBoundingBoxFromPool(world, x, y, z);
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        switch (dropCause) {
            case PICK_BLOCK:
            case SILK_TOUCH:
            case WORLD:
                return new ItemStack[]{new ItemStack(this)};
            default:
                return null;
        }
    }

    public boolean isSolidRender() {
        return false;
    }

}
