package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

public class BlockPot extends Block {

    public BlockPot(String key, int id, Material material) {
        super(key, id, material);
        float f = 0.0625f;
        this.setBlockBounds(0.0625f + f, 0.0F, 0.0625f + f, 0.9375f - f, 1.0f, 0.9375f - f);
    }

    public boolean isSolidRender() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        return world.isBlockNormalCube(x, y - 1, z) || world.canPlaceOnSurfaceOfBlock(x, y - 1, z);
    }

}
