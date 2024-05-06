package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockStairs;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.WorldSource;

public class BlockWoolStairs extends BlockStairs {
    public static final int[] texCoords = new int[16];

    public int getBlockTextureFromSideAndMetadata(Side side, int meta) {
        meta >>= 4;
        return texCoords[meta & 15];
    }

    public int getBlockTexture(WorldSource blockAccess, int x, int y, int z, Side side) {
        return this.getBlockTextureFromSideAndMetadata(side, blockAccess.getBlockMetadata(x, y, z));
    }

    public BlockWoolStairs(Block modelBlock, int id) {
        super(modelBlock, id);
    }

}
