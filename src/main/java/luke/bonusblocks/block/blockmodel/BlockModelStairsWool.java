package luke.bonusblocks.block.blockmodel;

import net.minecraft.client.render.block.model.StairsBlockModel;
import net.minecraft.client.render.block.model.WoolBlockModel;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.StairsBlock;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.WorldSource;

public class BlockModelStairsWool<T extends StairsBlock> extends StairsBlockModel<T> {
    public BlockModelStairsWool(Block block) {
        super(block);
    }

    public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int meta) {
        meta >>= 4;
        return WoolBlockModel.texCoords[meta & 15];
    }

    public IconCoordinate getBlockTexture(WorldSource blockAccess, int x, int y, int z, Side side) {
        return this.getBlockTextureFromSideAndMetadata(side, blockAccess.getBlockMetadata(x, y, z));
    }
}



