package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicTrapDoor;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.WorldSource;

public class BlockTrapDoorObsidian extends BlockLogicTrapDoor {
    public BlockTrapDoorObsidian(Block<?> block, Material material) {
        super(block, material);
        float f = 0.5F;
        float f1 = 1.0F;
        this.setBlockBounds(0.5F - f, 0.0, 0.5F - f, 0.5F + f, f1, 0.5F + f);
    }

    @Override
    public AABB getBlockBoundsFromState(WorldSource world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        float thickness = 0.1875F;
        if (isTrapdoorOpen(meta)) {
            switch (meta & 3) {
                case 0:
                    return AABB.getTemporaryBB(0.0, 0.0, 1.0F - thickness, 1.0, 1.0, 1.0);
                case 1:
                    return AABB.getTemporaryBB(0.0, 0.0, 0.0, 1.0, 1.0, thickness);
                case 2:
                    return AABB.getTemporaryBB(1.0F - thickness, 0.0, 0.0, 1.0, 1.0, 1.0);
                case 3:
                default:
                    return AABB.getTemporaryBB(0.0, 0.0, 0.0, thickness, 1.0, 1.0);
            }
        } else {
            return isUpperHalf(meta) ? AABB.getTemporaryBB(0.0, 1.0F - thickness, 0.0, 1.0, 1.0, 1.0) : AABB.getTemporaryBB(0.0, 0.0, 0.0, 1.0, thickness, 1.0);
        }
    }

}
