package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLayerBase;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

public class BlockLayerPetal extends Block {
    public BlockLayerPetal(String key, int id, Material material) {
        super(key, id, material);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
        this.setTicking(true);
    }

    public AABB getCollisionBoundingBoxFromPool(WorldSource world, int x, int y, int z) {
        return null;
    }

    public void setBlockBoundsForItemRender() {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    }

    public boolean isSolidRender() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        int l = world.getBlockId(x, y - 1, z);
        if (l != 0 && (Block.blocksList[l].isSolidRender() || Block.blocksList[l] instanceof BlockPetal)) {
            Material material = world.getBlockMaterial(x, y - 1, z);
            return material.blocksMotion();
        } else {
            return false;
        }
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
        this.func_314_h(world, x, y, z);
    }

    private void func_314_h(World world, int i, int j, int k) {
        if (!this.canPlaceBlockAt(world, i, j, k)) {
            this.dropBlockWithCause(world, EnumDropCause.WORLD, i, j, k, world.getBlockMetadata(i, j, k), null);
            world.setBlockWithNotify(i, j, k, 0);
        }
    }
}
