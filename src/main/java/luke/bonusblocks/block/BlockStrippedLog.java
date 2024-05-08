package luke.bonusblocks.block;

import net.minecraft.core.block.BlockLog;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.WorldSource;

public class BlockStrippedLog extends BlockLog {

    public BlockStrippedLog(String key, int id, Material material) {
        super(key, id);
        float pixel = 0.125f;
        this.setBlockBounds(pixel, 0.0, pixel, 1.0 - pixel, 1.0, 1.0 - pixel);
    }

    public boolean isSolidRender() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public void setBlockBoundsBasedOnState(WorldSource world, int x, int y, int z) {
        this.setBlockBounds(world.getBlockMetadata(x, y, z));
    }

    public AABB getCollisionBoundingBoxFromPool(WorldSource world, int x, int y, int z) {
        this.setBlockBounds(world.getBlockMetadata(x, y, z));
        return super.getCollisionBoundingBoxFromPool(world, x, y, z);
    }

    public AABB getSelectedBoundingBoxFromPool(WorldSource world, int x, int y, int z) {
        this.setBlockBounds(world.getBlockMetadata(x, y, z));
        return super.getSelectedBoundingBoxFromPool(world, x, y, z);
    }

    private void setBlockBounds(int meta) {
        float pixel = 0.125f;
        Side side = this.getSideFromMeta(meta);
        if (side == Side.TOP) {
            this.setBlockBounds(pixel, 0.0, pixel, 1.0 - pixel, 1.0, 1.0 - pixel);
        } else if (side == Side.NORTH) {
            this.setBlockBounds(pixel, pixel, 0.0, 1.0 - pixel, 1.0 - pixel, 1.0);
        } else if (side == Side.EAST) {
            this.setBlockBounds(0.0, pixel, pixel, 1.0, 1.0 - pixel, 1.0 - pixel);
        } else {
            this.setBlockBounds(pixel, 0.0, pixel, 1.0 - pixel, 1.0, 1.0 - pixel);
        }
    }

    public Side getSideFromMeta(int meta) {
        if (meta == 0) {
            return Side.TOP;
        } else if (meta == 1) {
            return Side.NORTH;
        } else if (meta == 2) {
            return Side.EAST;
        } else {
            return Side.NONE;
        }
    }

}
