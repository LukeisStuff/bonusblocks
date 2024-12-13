package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicLeavesBase;
import net.minecraft.core.block.BlockLogicLog;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

public class BlockBranch extends BlockLogicLog {
    public BlockBranch(Block<?> block, Material material) {
        super(block);
    }

    public boolean isSolidRender() {
        return false;
    }

    public void onBlockRemoved(World world, int x, int y, int z, int data) {
        byte r = 4;
        int r2 = r + 1;
        if (world.areBlocksLoaded(x - r2, y - r2, z - r2, x + r2, y + r2, z + r2)) {
            for(int _x = -r; _x <= r; ++_x) {
                for(int _y = -r; _y <= r; ++_y) {
                    for(int _z = -r; _z <= r; ++_z) {
                        Block<?> block = world.getBlock(x + _x, y + _y, z + _z);
                        if (block != null && block.getLogic() instanceof BlockLogicLeavesBase) {
                            int leavesMeta = world.getBlockMetadata(x + _x, y + _y, z + _z);
                            if (!BlockLogicLeavesBase.isPermanent(leavesMeta)) {
                                world.setBlockMetadata(x + _x, y + _y, z + _z, BlockLogicLeavesBase.setDecaying(leavesMeta, true));
                            }
                        }
                    }
                }
            }
        }
    }

}
