package luke.bonusblocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLeavesBase;
import net.minecraft.core.block.BlockLog;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

public class BlockBranch extends BlockLog {
    public BlockBranch(String key, int id, Material leaves) {
        super(key, id);
    }

    @Override
    public void onBlockRemoval(World world, int x, int y, int z) {
        int byte0 = 4;
        int l = byte0 + 1;
        if (world.areBlocksLoaded(x - l, y - l, z - l, x + l, y + l, z + l)) {
            for (int i1 = -byte0; i1 <= byte0; ++i1) {
                for (int j1 = -byte0; j1 <= byte0; ++j1) {
                    for (int k1 = -byte0; k1 <= byte0; ++k1) {
                        int i2;
                        int l1 = world.getBlockId(x + i1, y + j1, z + k1);
                        if (!(Block.blocksList[l1] instanceof BlockLeavesBase) || ((i2 = world.getBlockMetadata(x + i1, y + j1, z + k1)) & 8) != 0) continue;
                        world.setBlockMetadata(x + i1, y + j1, z + k1, i2 | 8);
                    }
                }
            }
        }
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

}
