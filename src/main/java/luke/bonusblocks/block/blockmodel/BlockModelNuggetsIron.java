package luke.bonusblocks.block.blockmodel;

import net.minecraft.client.render.LightmapHelper;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.util.helper.Side;

public class BlockModelNuggetsIron<T extends BlockLogic> extends BlockModelStandard<T> {
    public IconCoordinate[] pebbles = new IconCoordinate[]{TextureRegistry.getTexture("bonusblocks:block/pebbles/pebbles_iron1"), TextureRegistry.getTexture("bonusblocks:block/pebbles/pebbles_iron2"), TextureRegistry.getTexture("bonusblocks:block/pebbles/pebbles_iron3")};

    public BlockModelNuggetsIron(Block<T> block) {
        super(block);
    }

    public boolean render(Tessellator tessellator, int x, int y, int z) {
        float brightness = 1.0F;
        if (LightmapHelper.isLightmapEnabled()) {
            tessellator.setLightmapCoord(LightmapHelper.max(this.block.getLightmapCoord(renderBlocks.blockAccess, x, y, z), this.block.getLightmapCoord(renderBlocks.blockAccess, x, y - 1, z)));
        } else {
            brightness = Math.max(this.getBlockBrightness(renderBlocks.blockAccess, x, y, z), this.getBlockBrightness(renderBlocks.blockAccess, x, y - 1, z));
        }

        tessellator.setColorOpaque_F(brightness, brightness, brightness);
        this.renderTopFace(tessellator, this.block.getBlockBoundsFromState(renderBlocks.blockAccess, x, y, z), x, y, z, this.getBlockTextureFromSideAndMetadata(Side.TOP, renderBlocks.blockAccess.getBlockMetadata(x, y, z)));
        return true;
    }

    public boolean shouldItemRender3d() {
        return false;
    }

    public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
        return this.pebbles[MathHelper.clamp(data, 0, 2)];
    }
}