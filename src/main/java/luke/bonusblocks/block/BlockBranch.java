package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLeavesBase;
import net.minecraft.core.block.BlockLog;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

public class BlockBranch extends Block {
    protected static boolean fancyGraphics;
    public BlockBranch(String key, int id, Material material, boolean flag) {
        super(key, id, material);
        fancyGraphics = flag;
        this.setTicking(true);
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
                        if (Block.blocksList[l1] instanceof BlockLeavesBase) {
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

    public int getBlockTextureFromSideAndMetadata(Side side, int data) {
        return !fancyGraphics ? this.atlasIndices[side.getId()] + 1 : this.atlasIndices[side.getId()];
    }

    public boolean shouldSideBeRendered(WorldSource blockAccess, int x, int y, int z, int side) {
        int i1 = blockAccess.getBlockId(x, y, z);
        return (fancyGraphics || i1 != this.id) && super.shouldSideBeRendered(blockAccess, x, y, z, side);
    }

    public static void setGraphicsLevel(boolean graphicsLevel) {
        fancyGraphics = graphicsLevel;
    }

    @Override
    public boolean isSolidRender() {
        return false;
    }

}
