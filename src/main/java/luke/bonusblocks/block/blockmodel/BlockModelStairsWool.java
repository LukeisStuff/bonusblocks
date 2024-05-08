package luke.bonusblocks.block.blockmodel;

import net.minecraft.client.render.block.model.BlockModelStairs;
import net.minecraft.client.render.block.model.BlockModelWool;
import net.minecraft.client.render.stitcher.IconCoordinate;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockStairs;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.WorldSource;

public class BlockModelStairsWool<T extends BlockStairs> extends BlockModelStairs<T> {
    public BlockModelStairsWool(Block block) {
        super(block);
    }

    public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int meta) {
        meta >>= 4;
        return BlockModelWool.texCoords[meta & 15];
    }

    public IconCoordinate getBlockTexture(WorldSource blockAccess, int x, int y, int z, Side side) {
        return this.getBlockTextureFromSideAndMetadata(side, blockAccess.getBlockMetadata(x, y, z));
    }
}



