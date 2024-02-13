package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockTransparent;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

public class BlockPetal extends BlockTransparent {
    public BlockPetal(String key, int id, Material material) {
        super(key, id, material, true);
    }

    public boolean isSolidRender() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        return null;
    }

}
