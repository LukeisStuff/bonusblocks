package luke.bonusblocks.block;

import net.minecraft.core.Global;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockStairs;
import net.minecraft.core.block.BlockStairsPainted;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.WorldSource;

public class BlockWoolStairs extends BlockStairsPainted {
    public static final int[] texCoords = new int[16];
    public static int TEX_COORD_OFFSET = 3;

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

    static {
        texCoords[0] = Block.texCoordToIndex(6, 24);

        for(int i = 1; i < 16; ++i) {
            texCoords[i] = texCoords[0] - i % 8 * Global.TEXTURE_ATLAS_WIDTH_TILES - i / 8;
        }

    }
}
