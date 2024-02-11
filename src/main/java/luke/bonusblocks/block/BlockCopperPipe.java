package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockAxisAligned;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

import java.util.ArrayList;

public class BlockCopperPipe extends BlockAxisAligned {
    public BlockCopperPipe(String key, int id, Material material) {
        super(key, id, material);
    //Remove When Done    this.setBlockBounds(0.3F, 0.0F, 0.3F, 0.7F, 1.0f, 0.7F);

    }

    public void setBlockBoundsBasedOnState(World world, int x, int y, int z) {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public void getCollidingBoundingBoxes(World world, int x, int y, int z, AABB aabb, ArrayList aabbList) {
        int meta = world.getBlockMetadata(x, y, z);
        int hRotation = meta & 3;
        int vRotation = meta & 8;
        float stepYOffset = vRotation > 0 ? 0.5F : 0.0F;
        if (hRotation == 0) {
            this.setBlockBounds(0.0F, 0.0F + stepYOffset, 0.0F, 0.5F, 0.5F + stepYOffset, 1.0F);
            super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
            this.setBlockBounds(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
        } else if (hRotation == 1) {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
            this.setBlockBounds(0.5F, 0.0F + stepYOffset, 0.0F, 1.0F, 0.5F + stepYOffset, 1.0F);
            super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
        } else if (hRotation == 2) {
            this.setBlockBounds(0.0F, 0.0F + stepYOffset, 0.0F, 1.0F, 0.5F + stepYOffset, 0.5F);
            super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
            this.setBlockBounds(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
        }

        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean isSolidRender() {
        return false;
    }

}
