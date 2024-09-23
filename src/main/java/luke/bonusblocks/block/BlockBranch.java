package luke.bonusblocks.block;

import net.minecraft.core.block.BaseLeavesBlock;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.LogBlock;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

public class BlockBranch extends LogBlock {
    public BlockBranch(String key, String namespaceId, int id, Material material) {
        super(key, namespaceId, id);
        this.setTicking(true);
    }

    public boolean isSolidRender() {
        return false;
    }

    @Override
    public void onBlockRemoved(World world, int x, int y, int z, int data) {
        byte byte0 = 4;
        int l = byte0 + 1;
        if (world.areBlocksLoaded(x - l, y - l, z - l, x + l, y + l, z + l)) {
            for(int i1 = -byte0; i1 <= byte0; ++i1) {
                for(int j1 = -byte0; j1 <= byte0; ++j1) {
                    for(int k1 = -byte0; k1 <= byte0; ++k1) {
                        int l1 = world.getBlockId(x + i1, y + j1, z + k1);
                        if (Block.blocksList[l1] instanceof BaseLeavesBlock) {
                            int i2 = world.getBlockMetadata(x + i1, y + j1, z + k1);
                            if ((i2 & 8) == 0) {
                                world.setBlockMetadata(x + i1, y + j1, z + k1, i2 | 8);
                            }
                        }
                    }
                }
            }
        }
    }

}
