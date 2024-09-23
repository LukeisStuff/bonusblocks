package luke.bonusblocks.block.blockmodel;

import net.minecraft.client.render.block.model.StandardBlockModel;
import net.minecraft.client.render.stitcher.IconCoordinate;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.block.Block;
import net.minecraft.core.util.helper.Side;

public class BlockModelSoulwaxCandle<T extends Block> extends StandardBlockModel<T> {
    public BlockModelSoulwaxCandle(Block block) {
        super(block);
    }

    @Override
    public boolean render(Tessellator tessellator, int x, int y, int z) {
        block.setBlockBoundsBasedOnState(renderBlocks.blockAccess, x, y, z);
        boolean isLit = (renderBlocks.blockAccess.getBlockMetadata(x, y, z) & 0b00000001) == 0;
        float brightness = isLit ? 1.0f : getBlockBrightness(renderBlocks.blockAccess, x, y, z);

        float minX = x + 0.5f - (1.5f / 16f);
        float minY = y + 0f;
        float minZ = z + 0.5f - (1.5f / 16f);
        float maxX = x + 0.5f + (1.5f / 16f);
        float maxY = y + 0.5f;
        float maxZ = z + 0.5f + (1.5f / 16f);
        float wickMaxY = maxY + (6f / 16f);

        IconCoordinate texIndex = getParticleTexture(Side.TOP, 0);
        if(renderBlocks.overrideBlockTexture != null)
        {
            texIndex = renderBlocks.overrideBlockTexture;
        }
        double texV = texIndex.getIconVMin();

        double onePix = 1f / 16;

        double uOffset = isLit ? 0.0f : (onePix * 3);

        double sideMinU = texIndex.getSubIconU(uOffset);
        double sideMaxU = texIndex.getSubIconU(uOffset + (onePix * 3));
        double sideMinV = texIndex.getSubIconV((onePix * 3));
        double sideMaxV = texIndex.getSubIconV((onePix * 3) + (onePix * 8));

        double topMinU = texIndex.getSubIconU(uOffset);
        double topMaxU = texIndex.getSubIconU(uOffset + (onePix * 3));
        double topMaxV = texIndex.getSubIconV(onePix * 3);

        double bottomMinU = texIndex.getSubIconU(onePix * 3);
        double bottomMaxU = texIndex.getSubIconU((onePix * 3) + (onePix * 3));
        double bottomMaxV = texIndex.getSubIconV(onePix * 3);

        double wickMinU = texIndex.getSubIconU((onePix * 6) + uOffset);
        double wickMaxU = texIndex.getSubIconU((onePix * 6) + uOffset + (onePix * 3));
        double wickMaxV = texIndex.getSubIconV(onePix * 6);


        tessellator.setColorOpaque_F(brightness, brightness, brightness);

        // Render sides
        tessellator.addVertexWithUV(maxX, minY, minZ, sideMinU, sideMaxV);
        tessellator.addVertexWithUV(minX, minY, minZ, sideMaxU, sideMaxV);
        tessellator.addVertexWithUV(minX, maxY, minZ, sideMaxU, sideMinV);
        tessellator.addVertexWithUV(maxX, maxY, minZ, sideMinU, sideMinV);

        tessellator.addVertexWithUV(minX, minY, maxZ, sideMinU, sideMaxV);
        tessellator.addVertexWithUV(maxX, minY, maxZ, sideMaxU, sideMaxV);
        tessellator.addVertexWithUV(maxX, maxY, maxZ, sideMaxU, sideMinV);
        tessellator.addVertexWithUV(minX, maxY, maxZ, sideMinU, sideMinV);

        tessellator.addVertexWithUV(maxX, minY, maxZ, sideMinU, sideMaxV);
        tessellator.addVertexWithUV(maxX, minY, minZ, sideMaxU, sideMaxV);
        tessellator.addVertexWithUV(maxX, maxY, minZ, sideMaxU, sideMinV);
        tessellator.addVertexWithUV(maxX, maxY, maxZ, sideMinU, sideMinV);

        tessellator.addVertexWithUV(minX, minY, minZ, sideMinU, sideMaxV);
        tessellator.addVertexWithUV(minX, minY, maxZ, sideMaxU, sideMaxV);
        tessellator.addVertexWithUV(minX, maxY, maxZ, sideMaxU, sideMinV);
        tessellator.addVertexWithUV(minX, maxY, minZ, sideMinU, sideMinV);

        // Render top
        tessellator.addVertexWithUV(minX, maxY, maxZ, topMinU, topMaxV);
        tessellator.addVertexWithUV(maxX, maxY, maxZ, topMaxU, topMaxV);
        tessellator.addVertexWithUV(maxX, maxY, minZ, topMaxU, texV);
        tessellator.addVertexWithUV(minX, maxY, minZ, topMinU, texV);

        // Render bottom
        tessellator.addVertexWithUV(minX, minY, minZ, bottomMinU, texV);
        tessellator.addVertexWithUV(maxX, minY, minZ, bottomMaxU, texV);
        tessellator.addVertexWithUV(maxX, minY, maxZ, bottomMaxU, bottomMaxV);
        tessellator.addVertexWithUV(minX, minY, maxZ, bottomMinU, bottomMaxV);

        // Render wick
        tessellator.addVertexWithUV(minX, maxY, minZ, wickMinU, wickMaxV);
        tessellator.addVertexWithUV(maxX, maxY, maxZ, wickMaxU, wickMaxV);
        tessellator.addVertexWithUV(maxX, wickMaxY, maxZ, wickMaxU, texV);
        tessellator.addVertexWithUV(minX, wickMaxY, minZ, wickMinU, texV);

        tessellator.addVertexWithUV(minX, wickMaxY, minZ, wickMaxU, texV);
        tessellator.addVertexWithUV(maxX, wickMaxY, maxZ, wickMinU, texV);
        tessellator.addVertexWithUV(maxX, maxY, maxZ, wickMinU, wickMaxV);
        tessellator.addVertexWithUV(minX, maxY, minZ, wickMaxU, wickMaxV);

        tessellator.addVertexWithUV(minX, maxY, maxZ, wickMinU, wickMaxV);
        tessellator.addVertexWithUV(maxX, maxY, minZ, wickMaxU, wickMaxV);
        tessellator.addVertexWithUV(maxX, wickMaxY, minZ, wickMaxU, texV);
        tessellator.addVertexWithUV(minX, wickMaxY, maxZ, wickMinU, texV);

        tessellator.addVertexWithUV(minX, wickMaxY, maxZ, wickMaxU, texV);
        tessellator.addVertexWithUV(maxX, wickMaxY, minZ, wickMinU, texV);
        tessellator.addVertexWithUV(maxX, maxY, minZ, wickMinU, wickMaxV);
        tessellator.addVertexWithUV(minX, maxY, maxZ, wickMaxU, wickMaxV);

        return true;
    }
    @Override
    public boolean shouldItemRender3d() {
        return false;
    }
}