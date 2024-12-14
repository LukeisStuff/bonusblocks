package luke.bonusblocks.block.blockmodel;

import net.minecraft.client.render.block.model.BlockModelBed;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.BlockLogicBed;
import net.minecraft.core.util.helper.Side;

public class BlockModelSilverBed<T extends BlockLogic> extends BlockModelBed<T> {
    protected IconCoordinate underTexture = TextureRegistry.getTexture("bonusblocks:block/block_silver");
    protected final IconCoordinate[] bedTextures = new IconCoordinate[6];
    public BlockModelSilverBed(Block<T> block) {
        super(block);
        this.bedTextures[0] = TextureRegistry.getTexture("bonusblocks:block/bed_silver_foot_front");
        this.bedTextures[1] = TextureRegistry.getTexture("bonusblocks:block/bed_silver_foot_side");
        this.bedTextures[2] = TextureRegistry.getTexture("bonusblocks:block/bed_silver_foot_top");
        this.bedTextures[3] = TextureRegistry.getTexture("bonusblocks:block/bed_silver_head_front");
        this.bedTextures[4] = TextureRegistry.getTexture("bonusblocks:block/bed_silver_head_side");
        this.bedTextures[5] = TextureRegistry.getTexture("bonusblocks:block/bed_silver_head_top");
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
