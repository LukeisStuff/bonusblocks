package luke.bonusblocks.block.blockmodel;

import net.minecraft.client.render.block.model.BlockModelBed;
import net.minecraft.client.render.stitcher.IconCoordinate;
import net.minecraft.client.render.stitcher.TextureRegistry;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockBed;
import net.minecraft.core.block.logic.BedDirections;
import net.minecraft.core.util.helper.Side;

public class BlockModelSilverBed<T extends Block> extends BlockModelBed<T> {
    public BlockModelSilverBed(Block block) {
        super(block);
        this.atlasIndices[0] = TextureRegistry.getTexture("bonusblocks:block/bed_silver_foot_front");
        this.atlasIndices[1] = TextureRegistry.getTexture("bonusblocks:block/bed_silver_foot_side");
        this.atlasIndices[2] = TextureRegistry.getTexture("bonusblocks:block/bed_silver_foot_top");
        this.atlasIndices[3] = TextureRegistry.getTexture("bonusblocks:block/bed_silver_head_front");
        this.atlasIndices[4] = TextureRegistry.getTexture("bonusblocks:block/bed_silver_head_side");
        this.atlasIndices[5] = TextureRegistry.getTexture("bonusblocks:block/bed_silver_head_top");
    }
}
