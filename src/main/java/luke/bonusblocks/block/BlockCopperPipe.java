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
        this.setBlockBounds(0.3F, 0.0F, 0.3F, 0.7F, 1.0f, 0.7F);
    }

    public void setBlockBoundsBasedOnState(World world, int x, int y, int z) {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean isSolidRender() {
        return false;
    }

}
