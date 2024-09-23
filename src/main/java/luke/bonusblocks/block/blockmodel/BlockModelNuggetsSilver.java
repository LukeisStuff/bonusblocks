package luke.bonusblocks.block.blockmodel;

import net.minecraft.client.render.LightmapHelper;
import net.minecraft.client.render.block.model.StandardBlockModel;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.util.helper.Side;

public class BlockModelNuggetsSilver<T extends Block> extends StandardBlockModel<T> {
    public IconCoordinate[] pebbles = new IconCoordinate[]{TextureRegistry.getTexture("bonusblocks:block/pebbles_silver1"), TextureRegistry.getTexture("bonusblocks:block/pebbles_silver2"), TextureRegistry.getTexture("bonusblocks:block/pebbles_silver3")};

    public BlockModelNuggetsSilver(Block block) {
        super(block);
    }

    public boolean render(Tessellator tessellator, int x, int y, int z) {
        this.block.setBlockBoundsBasedOnState(renderBlocks.blockAccess, x, y, z);
        float f1 = 1.0F;
        float brightness = 1.0F;
        if (LightmapHelper.isLightmapEnabled()) {
            tessellator.setLightmapCoord(LightmapHelper.max(this.block.getLightmapCoord(renderBlocks.blockAccess, x, y, z), this.block.getLightmapCoord(renderBlocks.blockAccess, x, y - 1, z)));
        } else {
            brightness = Math.max(this.getBlockBrightness(renderBlocks.blockAccess, x, y, z), this.getBlockBrightness(renderBlocks.blockAccess, x, y - 1, z));
        }

        tessellator.setColorOpaque_F(f1 * brightness, f1 * brightness, f1 * brightness);
        IconCoordinate j = this.getBlockTextureFromSideAndMetadata(Side.TOP, renderBlocks.blockAccess.getBlockMetadata(x, y, z));
        this.renderTopFace(tessellator, this.block, x, y, z, j);
        return true;
    }

    public boolean shouldItemRender3d() {
        return false;
    }

    public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
        return this.pebbles[MathHelper.clamp(data, 0, 2)];
    }
}