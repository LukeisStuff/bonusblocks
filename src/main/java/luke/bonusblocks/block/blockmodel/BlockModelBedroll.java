package luke.bonusblocks.block.blockmodel;

import net.minecraft.client.render.block.model.BlockModelStandard;
import net.minecraft.client.render.stitcher.IconCoordinate;
import net.minecraft.client.render.stitcher.TextureRegistry;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockBed;
import net.minecraft.core.block.logic.BedDirections;
import net.minecraft.core.util.helper.Side;

public class BlockModelBedroll<T extends Block>
        extends BlockModelStandard<T> {
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

    @Override
    public boolean render(Tessellator tessellator, int x, int y, int z) {
        int f17;
        this.block.setBlockBoundsBasedOnState(net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.blockAccess, x, y, z);
        net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.enableAO = true;
        net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.cache.setupCache(this.block, net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.blockAccess, x, y, z);
        int meta = net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.blockAccess.getBlockMetadata(x, y, z);
        int direction = BlockBed.getDirectionFromMetadata(meta);
        boolean isFootOfBed = BlockBed.isBlockFootOfBed(meta);
        this.renderSide(tessellator, this.block, x, y, z, 1.0f, 1.0f, 1.0f, Side.BOTTOM, meta);
        if (direction == 0) {
            net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.uvRotateTop = 1;
        } else if (direction == 2) {
            net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.uvRotateTop = 2;
        } else if (direction == 1) {
            net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.uvRotateTop = 3;
        }
        this.renderSide(tessellator, this.block, x, y, z, Side.TOP, meta);
        net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.uvRotateTop = 0;
        f17 = isFootOfBed ? BedDirections.headOfBedMap[BedDirections.footToHeadMap[direction]] : BedDirections.headOfBedMap[direction];
        if (f17 != 2 && (net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.renderAllFaces || this.shouldSideBeRendered(net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.blockAccess, x, y, z - 1, 2))) {
            net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.flipTexture = direction == 3;
            this.renderSide(tessellator, this.block, x, y, z, Side.NORTH, meta);
        }
        if (f17 != 3 && (net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.renderAllFaces || this.shouldSideBeRendered(net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.blockAccess, x, y, z + 1, 3))) {
            net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.flipTexture = direction == 1;
            this.renderSide(tessellator, this.block, x, y, z, Side.SOUTH, meta);
        }
        if (f17 != 4 && (net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.renderAllFaces || this.shouldSideBeRendered(net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.blockAccess, x - 1, y, z, 4))) {
            net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.flipTexture = direction == 2;
            this.renderSide(tessellator, this.block, x, y, z, Side.WEST, meta);
        }
        if (f17 != 5 && (net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.renderAllFaces || this.shouldSideBeRendered(net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.blockAccess, x + 1, y, z, 5))) {
            net.minecraft.client.render.block.model.BlockModelBed.renderBlocks.flipTexture = direction == 0;
            this.renderSide(tessellator, this.block, x, y, z, Side.EAST, meta);
        }
        this.resetRenderBlocks();
        return true;
    }

    @Override
    public boolean shouldItemRender3d() {
        return false;
    }

    @Override
    public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int data) {
        if (side == Side.BOTTOM) {
            return this.underTexture;
        }
        int k = BlockBed.getDirectionFromMetadata(data);
        int l = BedDirections.bedDirection[k][side.getId()];
        if (BlockBed.isBlockFootOfBed(data)) {
            if (l == 2) {
                return this.atlasIndices[3];
            }
            if (l == 5 || l == 4) {
                return this.atlasIndices[4];
            }
            return this.atlasIndices[5];
        }
        if (l == 3) {
            return this.atlasIndices[0];
        }
        if (l == 5 || l == 4) {
            return this.atlasIndices[1];
        }
        return this.atlasIndices[2];
    }
}
