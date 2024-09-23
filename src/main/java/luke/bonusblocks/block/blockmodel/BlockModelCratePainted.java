package luke.bonusblocks.block.blockmodel;

import net.minecraft.client.render.block.model.StandardBlockModel;
import net.minecraft.client.render.stitcher.IconCoordinate;
import net.minecraft.client.render.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.ItemDye;
import net.minecraft.core.util.helper.Side;

public class BlockModelCratePainted<T extends Block> extends StandardBlockModel<T> {
    public static final IconCoordinate[] texCoords = new IconCoordinate[16];

    public BlockModelCratePainted(Block block) {
        super(block);
    }

    @Override
    public IconCoordinate getBlockOverbrightTextureFromSideAndMeta(Side side, int data) {
        return getBlockTextureFromSideAndMetadata(side, data);
    }

    @Override
    public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
        return texCoords[data & 15];
    }

    static {
        for(int i = 0; i < 16; ++i) {
            texCoords[i] = TextureRegistry.getTexture("bonusblocks:block/crate_" + ItemDye.dyeColors[15 - i]);
        }

    }
}
