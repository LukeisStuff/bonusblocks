package luke.bonusblocks.block;

import net.minecraft.core.block.BlockFenceThin;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.WorldSource;

public class BlockFenceGold extends BlockFenceThin {
    public BlockFenceGold(String key, int id, Material material) {
        super(key, id, material);
    }

    public boolean canPlaceOnSurface() {
        return true;
    }

    public AABB getCollisionBoundingBoxFromPool(WorldSource world, int x, int y, int z) {
        boolean connectXPos = this.canConnectTo(world, x + 1, y, z);
        boolean connectXNeg = this.canConnectTo(world, x - 1, y, z);
        boolean connectZPos = this.canConnectTo(world, x, y, z + 1);
        boolean connectZNeg = this.canConnectTo(world, x, y, z - 1);
        return AABB.getBoundingBoxFromPool((float)x + (connectXNeg ? 0.0F : 0.375F), y, (float)z + (connectZNeg ? 0.0F : 0.375F), (float)(x + 1) - (connectXPos ? 0.0F : 0.375F), (float)y + 1.0F, (float)(z + 1) - (connectZPos ? 0.0F : 0.375F));
    }

    public AABB getSelectedBoundingBoxFromPool(WorldSource world, int x, int y, int z) {
        return this.getCollisionBoundingBoxFromPool(world, x, y, z);
    }

    public void setBlockBoundsBasedOnState(WorldSource world, int x, int y, int z) {
        AABB aabb = this.getCollisionBoundingBoxFromPool(world, x, y, z);
        this.minX = aabb.minX - (double)x;
        this.minY = aabb.minY - (double)y;
        this.minZ = aabb.minZ - (double)z;
        this.maxX = aabb.maxX - (double)x;
        this.maxY = aabb.maxY - (double)y;
        this.maxZ = aabb.maxZ - (double)z;
    }

    public boolean isSolidRender() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean canConnectTo(WorldSource worldSource, int i, int j, int k) {
        return false;
    }

    public boolean shouldDrawColumn(WorldSource worldSource, int i, int j, int k) {
        return false;
    }
}
