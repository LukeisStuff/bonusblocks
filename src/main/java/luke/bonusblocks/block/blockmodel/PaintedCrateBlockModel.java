package luke.bonusblocks.block.blockmodel;

import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;

import java.util.Iterator;

public class PaintedCrateBlockModel<T extends BlockLogic> extends BlockModelStandard<T> {
    public static final IconCoordinate[] texCoords = new IconCoordinate[16];

    public PaintedCrateBlockModel(Block<T> block) {
        super(block);
    }

    public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
        return texCoords[data & 15];
    }

    static {
        DyeColor c;
        for(Iterator<DyeColor> var0 = DyeColor.blockOrderedColors().iterator(); var0.hasNext(); texCoords[c.blockMeta] = TextureRegistry.getTexture("bonusblocks:block/crate/crate_" + c.colorID)) {
            c = var0.next();
        }

    }
}
