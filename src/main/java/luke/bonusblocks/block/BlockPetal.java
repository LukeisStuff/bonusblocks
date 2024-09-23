package luke.bonusblocks.block;

import net.minecraft.core.block.TransparentBlock;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.WorldSource;

public class BlockPetal extends TransparentBlock {
    public BlockPetal(String key, String namespaceId, int id, Material material) {
        super(key, namespaceId, id, material);
    }

    public AABB getCollisionBoundingBoxFromPool(WorldSource world, int x, int y, int z) {
        return AABB.getPermanentBB(x, y, z, x + 1, y, z + 1);
    }

    public boolean isSolidRender() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

}
