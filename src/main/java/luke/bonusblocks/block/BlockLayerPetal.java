package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

public class BlockLayerPetal extends BlockLogic {
    public BlockLayerPetal(Block<?> block) {
        super(block, Material.grass);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    }

    public AABB getCollisionBoundingBoxFromPool(WorldSource world, int x, int y, int z) {
        return null;
    }

    public boolean isSolidRender() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        int l = world.getBlockId(x, y - 1, z);
        if (l != 0 && (Blocks.blocksList[l].isSolidRender() || Blocks.blocksList[l].getLogic() instanceof BlockPetal)) {
            Material material = world.getBlockMaterial(x, y - 1, z);
            return material.blocksMotion();
        } else {
            return false;
        }
    }

}
