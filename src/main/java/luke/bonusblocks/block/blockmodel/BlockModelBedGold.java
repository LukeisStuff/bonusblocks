package luke.bonusblocks.block.blockmodel;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.block.model.BlockModelBed;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicBed;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;

@Environment(EnvType.CLIENT)
public class BlockModelBedGold<T extends BlockLogic> extends BlockModelBed<T> {
    protected IconCoordinate underTexture = TextureRegistry.getTexture("bonusblocks:block/bed_gold/bottom");
    protected final IconCoordinate[] bedTextures = new IconCoordinate[6];

    public BlockModelBedGold(Block<T> block) {
        super(block);
        this.bedTextures[0] = TextureRegistry.getTexture("bonusblocks:block/bed_gold/foot_front");
        this.bedTextures[1] = TextureRegistry.getTexture("bonusblocks:block/bed_gold/foot_side");
        this.bedTextures[2] = TextureRegistry.getTexture("bonusblocks:block/bed_gold/foot_top");
        this.bedTextures[3] = TextureRegistry.getTexture("bonusblocks:block/bed_gold/head_front");
        this.bedTextures[4] = TextureRegistry.getTexture("bonusblocks:block/bed_gold/head_side");
        this.bedTextures[5] = TextureRegistry.getTexture("bonusblocks:block/bed_gold/head_top");
    }

    public boolean render(Tessellator tessellator, int x, int y, int z) {
        AABB bounds = this.block.getBlockBoundsFromState(renderBlocks.blockAccess, x, y, z);
        renderBlocks.enableAO = true;
        renderBlocks.cache.setupCache(this.block, renderBlocks.blockAccess, x, y, z);
        int meta = renderBlocks.blockAccess.getBlockMetadata(x, y, z);
        int direction = BlockLogicBed.getDirection(meta);
        boolean isFootOfBed = BlockLogicBed.isBlockFootOfBed(meta);
        double minY = bounds.minY;
        bounds.minY += 0.1875;
        this.renderSide(tessellator, bounds, x, y, z, 1.0F, 1.0F, 1.0F, Side.BOTTOM, meta);
        bounds.minY = minY;
        if (direction == 0) {
            renderBlocks.uvRotateTop = 1;
        } else if (direction == 2) {
            renderBlocks.uvRotateTop = 2;
        } else if (direction == 1) {
            renderBlocks.uvRotateTop = 3;
        }

        this.renderSide(tessellator, bounds, x, y, z, Side.TOP, meta);
        renderBlocks.uvRotateTop = 0;
        int f17 = isFootOfBed ? BlockLogicBed.headOfBedMap[BlockLogicBed.footToHeadMap[direction]] : BlockLogicBed.headOfBedMap[direction];
        if (f17 != 2 && (renderBlocks.renderAllFaces || this.shouldSideBeRendered(renderBlocks.blockAccess, bounds, x, y, z - 1, 2))) {
            renderBlocks.flipTexture = direction == 3;
            this.renderSide(tessellator, bounds, x, y, z, Side.NORTH, meta);
        }

        if (f17 != 3 && (renderBlocks.renderAllFaces || this.shouldSideBeRendered(renderBlocks.blockAccess, bounds, x, y, z + 1, 3))) {
            renderBlocks.flipTexture = direction == 1;
            this.renderSide(tessellator, bounds, x, y, z, Side.SOUTH, meta);
        }

        if (f17 != 4 && (renderBlocks.renderAllFaces || this.shouldSideBeRendered(renderBlocks.blockAccess, bounds, x - 1, y, z, 4))) {
            renderBlocks.flipTexture = direction == 2;
            this.renderSide(tessellator, bounds, x, y, z, Side.WEST, meta);
        }

        if (f17 != 5 && (renderBlocks.renderAllFaces || this.shouldSideBeRendered(renderBlocks.blockAccess, bounds, x + 1, y, z, 5))) {
            renderBlocks.flipTexture = direction == 0;
            this.renderSide(tessellator, bounds, x, y, z, Side.EAST, meta);
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
            int k = BlockLogicBed.getDirection(data);
            int l = BlockLogicBed.bedDirection[k][side.getId()];
            if (BlockLogicBed.isBlockFootOfBed(data)) {
                if (l == 2) {
                    return this.bedTextures[3];
                } else {
                    return l != 5 && l != 4 ? this.bedTextures[5] : this.bedTextures[4];
                }
            } else if (l == 3) {
                return this.bedTextures[0];
            } else {
                return l != 5 && l != 4 ? this.bedTextures[2] : this.bedTextures[1];
            }
        }
    }
}