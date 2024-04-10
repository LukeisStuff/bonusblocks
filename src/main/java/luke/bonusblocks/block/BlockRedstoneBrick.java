package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockRedstoneWire;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

public class BlockRedstoneBrick extends BlockRedstoneWire {


    public BlockRedstoneBrick(String key, int id) {
        super(key, id);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }
@Override
    public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        this.setBlockBounds(world.getBlockMetadata(x, y, z));
        return super.getCollisionBoundingBoxFromPool(world, x, y, z);
    }

    private void setBlockBounds(int meta) {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public AABB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {
        this.setBlockBounds(world.getBlockMetadata(x, y, z));
        return super.getSelectedBoundingBoxFromPool(world, x, y, z);
    }

    public boolean isSolidRender() {
        return true;
    }

    public boolean renderAsNormalBlock() {
        return true;
    }
@Override
    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
    return true;
}

}
