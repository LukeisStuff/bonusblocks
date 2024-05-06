package luke.bonusblocks.block;

import net.minecraft.core.block.BlockTransparent;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.WorldSource;

public class BlockPetal extends BlockTransparent {
    public BlockPetal(String key, int id, Material material) {
        super(key, id, material);
    }

    public AABB getCollisionBoundingBoxFromPool(WorldSource world, int x, int y, int z) {
        return AABB.getBoundingBoxFromPool(x, y, z, x + 1, y, z + 1);
    }

    public boolean isSolidRender() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

}
