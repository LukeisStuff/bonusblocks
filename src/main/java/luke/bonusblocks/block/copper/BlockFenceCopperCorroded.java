package luke.bonusblocks.block.copper;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockFenceThin;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.WorldSource;

public class BlockFenceCopperCorroded extends BlockFenceThin {
    public BlockFenceCopperCorroded(String key, int id, Material material) {
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
        return AABB.getBoundingBoxFromPool((double)((float)x + (connectXNeg ? 0.0F : 0.375F)), (double)y, (double)((float)z + (connectZNeg ? 0.0F : 0.375F)), (double)((float)(x + 1) - (connectXPos ? 0.0F : 0.375F)), (double)((float)y + 1.0F), (double)((float)(z + 1) - (connectZPos ? 0.0F : 0.375F)));
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

    public boolean canConnectTo(WorldSource iblockaccess, int x, int y, int z) {
        int l = iblockaccess.getBlockId(x, y, z);
        return Block.hasTag(l, BlockTags.CHAINLINK_FENCES_CONNECT) || Block.blocksList[l] != null && (Block.blocksList[l].blockMaterial == Material.stone || Block.blocksList[l].blockMaterial == Material.metal);
    }

    public boolean shouldDrawColumn(WorldSource worldSource, int x, int y, int z) {
        boolean connectNorth = this.canConnectTo(worldSource, x + Direction.NORTH.getOffsetX(), y + Direction.NORTH.getOffsetY(), z + Direction.NORTH.getOffsetZ());
        boolean connectSouth = this.canConnectTo(worldSource, x + Direction.SOUTH.getOffsetX(), y + Direction.SOUTH.getOffsetY(), z + Direction.SOUTH.getOffsetZ());
        boolean connectEast = this.canConnectTo(worldSource, x + Direction.EAST.getOffsetX(), y + Direction.EAST.getOffsetY(), z + Direction.EAST.getOffsetZ());
        boolean connectWest = this.canConnectTo(worldSource, x + Direction.WEST.getOffsetX(), y + Direction.WEST.getOffsetY(), z + Direction.WEST.getOffsetZ());
        boolean lineNorthSouth = connectNorth && connectSouth;
        boolean lineEastWest = connectEast && connectWest;
        return !lineNorthSouth && !lineEastWest || lineNorthSouth && lineEastWest || lineNorthSouth && (connectEast || connectWest) || lineEastWest && (connectNorth || connectSouth);
    }
}
