package luke.bonusblocks.block.blockmodel;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.LightmapHelper;
import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.util.helper.Side;

@Environment(EnvType.CLIENT)
public class BlockModelNuggets<T extends BlockLogic> extends BlockModelStandard<T> {
    protected IconCoordinate[] textures;

    public BlockModelNuggets(Block<T> block, String texturePrefix, int variantCount) {
        super(block);
        this.textures = new IconCoordinate[variantCount];
        for (int i = 0; i < variantCount; i++) {
            this.textures[i] = TextureRegistry.getTexture("bonusblocks:block/pebbles_" + texturePrefix + "/" + i);
        }
    }

    @Override
    public boolean render(Tessellator tessellator, int x, int y, int z) {
        float brightness = 1.0F;
        if (LightmapHelper.isLightmapEnabled()) {
            tessellator.setLightmapCoord(LightmapHelper.max(
                    this.block.getLightmapCoord(renderBlocks.blockAccess, x, y, z),
                    this.block.getLightmapCoord(renderBlocks.blockAccess, x, y - 1, z)
            ));
        } else {
            brightness = Math.max(
                    this.getBlockBrightness(renderBlocks.blockAccess, x, y, z),
                    this.getBlockBrightness(renderBlocks.blockAccess, x, y - 1, z)
            );
        }

        tessellator.setColorOpaque_F(brightness, brightness, brightness);
        this.renderTopFace(
                tessellator,
                this.block.getBlockBoundsFromState(renderBlocks.blockAccess, x, y, z),
                x, y, z,
                this.getBlockTextureFromSideAndMetadata(Side.TOP, renderBlocks.blockAccess.getBlockMetadata(x, y, z))
        );
        return true;
    }

    @Override
    public boolean shouldItemRender3d() {
        return false;
    }

    @Override
    public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
        return this.textures[MathHelper.clamp(data, 0, this.textures.length - 1)];
    }
}