package luke.bonusblocks.block.blockmodel;

import net.minecraft.client.render.block.model.StandardBlockModel;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;

import java.util.Iterator;

public class PaintedCrateBlockModel<T extends Block> extends StandardBlockModel<T> {
    public static final IconCoordinate[] texCoords = new IconCoordinate[16];

    public PaintedCrateBlockModel(Block block) {
        super(block);
    }

    public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
        return texCoords[data & 15];
    }

    static {
        DyeColor c;
        for(Iterator var0 = DyeColor.blockOrderedColors().iterator(); var0.hasNext(); texCoords[c.blockMeta] = TextureRegistry.getTexture("bonusblocks:block/crate_" + c.colorID)) {
            c = (DyeColor)var0.next();
        }

    }
}
