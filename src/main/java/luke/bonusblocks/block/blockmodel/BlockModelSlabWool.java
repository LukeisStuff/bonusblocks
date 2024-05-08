package luke.bonusblocks.block.blockmodel;

import net.minecraft.client.render.block.model.BlockModelPlanksPainted;
import net.minecraft.client.render.block.model.BlockModelSlab;
import net.minecraft.client.render.block.model.BlockModelSlabPainted;
import net.minecraft.client.render.block.model.BlockModelWool;
import net.minecraft.client.render.stitcher.IconCoordinate;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockSlab;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.WorldSource;

public class BlockModelSlabWool<T extends BlockSlab> extends BlockModelSlab<T> {
    public BlockModelSlabWool(Block block) {
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
