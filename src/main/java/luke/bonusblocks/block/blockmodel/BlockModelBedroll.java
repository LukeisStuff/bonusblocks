package luke.bonusblocks.block.blockmodel;

import net.minecraft.client.render.block.model.StandardBlockModel;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.BedBlock;
import net.minecraft.core.block.Block;
import net.minecraft.core.util.helper.Side;

public class BlockModelBedroll<T extends Block> extends StandardBlockModel<T> {
    public IconCoordinate underTexture = TextureRegistry.getTexture("bonusblocks:block/bedroll_foot_top");

    public BlockModelBedroll(Block block) {
        super(block);
        this.atlasIndices[0] = TextureRegistry.getTexture("bonusblocks:block/bedroll_foot_front");
        this.atlasIndices[1] = TextureRegistry.getTexture("bonusblocks:block/bedroll_foot_side");
        this.atlasIndices[2] = TextureRegistry.getTexture("bonusblocks:block/bedroll_foot_top");
        this.atlasIndices[3] = TextureRegistry.getTexture("bonusblocks:block/bedroll_head_front");
        this.atlasIndices[4] = TextureRegistry.getTexture("bonusblocks:block/bedroll_head_side");
        this.atlasIndices[5] = TextureRegistry.getTexture("bonusblocks:block/bedroll_head_top");
    }

    public boolean render(Tessellator tessellator, int x, int y, int z) {
        this.block.setBlockBoundsBasedOnState(renderBlocks.blockAccess, x, y, z);
        renderBlocks.enableAO = true;
        renderBlocks.cache.setupCache(this.block, renderBlocks.blockAccess, x, y, z);
        int meta = renderBlocks.blockAccess.getBlockMetadata(x, y, z);
        int direction = BedBlock.getDirection(meta);
        boolean isFootOfBed = BedBlock.isBlockFootOfBed(meta);
        double minY = this.block.minY;
        this.renderSide(tessellator, this.block, x, y, z, 1.0F, 1.0F, 1.0F, Side.BOTTOM, meta);
        this.block.minY = minY;
        if (direction == 0) {
            renderBlocks.uvRotateTop = 1;
        } else if (direction == 2) {
            renderBlocks.uvRotateTop = 2;
        } else if (direction == 1) {
            renderBlocks.uvRotateTop = 3;
        }

        this.renderSide(tessellator, this.block, x, y, z, Side.TOP, meta);
        renderBlocks.uvRotateTop = 0;
        int f17 = isFootOfBed ? BedBlock.headOfBedMap[BedBlock.footToHeadMap[direction]] : BedBlock.headOfBedMap[direction];
        if (f17 != 2 && (renderBlocks.renderAllFaces || this.shouldSideBeRendered(renderBlocks.blockAccess, x, y, z - 1, 2))) {
            renderBlocks.flipTexture = direction == 3;
            this.renderSide(tessellator, this.block, x, y, z, Side.NORTH, meta);
        }

        if (f17 != 3 && (renderBlocks.renderAllFaces || this.shouldSideBeRendered(renderBlocks.blockAccess, x, y, z + 1, 3))) {
            renderBlocks.flipTexture = direction == 1;
            this.renderSide(tessellator, this.block, x, y, z, Side.SOUTH, meta);
        }

        if (f17 != 4 && (renderBlocks.renderAllFaces || this.shouldSideBeRendered(renderBlocks.blockAccess, x - 1, y, z, 4))) {
            renderBlocks.flipTexture = direction == 2;
            this.renderSide(tessellator, this.block, x, y, z, Side.WEST, meta);
        }

        if (f17 != 5 && (renderBlocks.renderAllFaces || this.shouldSideBeRendered(renderBlocks.blockAccess, x + 1, y, z, 5))) {
            renderBlocks.flipTexture = direction == 0;
            this.renderSide(tessellator, this.block, x, y, z, Side.EAST, meta);
        }

        this.resetRenderBlocks();
        return true;
    }

    public boolean shouldItemRender3d() {
        return false;
    }

    public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
        if (side == Side.BOTTOM) {
            return this.underTexture;
        } else {
            int k = BedBlock.getDirection(data);
            int l = BedBlock.bedDirection[k][side.getId()];
            if (BedBlock.isBlockFootOfBed(data)) {
                if (l == 2) {
                    return this.atlasIndices[3];
                } else {
                    return l != 5 && l != 4 ? this.atlasIndices[5] : this.atlasIndices[4];
                }
            } else if (l == 3) {
                return this.atlasIndices[0];
            } else {
                return l != 5 && l != 4 ? this.atlasIndices[2] : this.atlasIndices[1];
            }
        }
    }
}
