package luke.bonusblocks;

import luke.bonusblocks.block.BonusBlocks;
import luke.bonusblocks.block.blockmodel.BlockModelSlabWool;
import luke.bonusblocks.block.blockmodel.BlockModelStairsWool;
import luke.bonusblocks.block.blockmodel.PaintedCrateBlockModel;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.color.BlockColorLeavesOak;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.colorizer.Colorizers;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

public class BonusModels implements ModelEntrypoint {
    @Override
    public void initBlockModels(BlockModelDispatcher dispatcher) {
        ModelHelper.setBlockModel(BonusBlocks.BOX, () -> new BlockModelStandard<>(BonusBlocks.BOX)
                .setAllTextures(0, "bonusblocks:block/box"));

        ModelHelper.setBlockModel(BonusBlocks.CRATE, () -> new BlockModelStandard<>(BonusBlocks.CRATE)
                .setAllTextures(0, "bonusblocks:block/crate/crate"));
        ModelHelper.setBlockModel(BonusBlocks.CRATE_PAINTED, () -> new PaintedCrateBlockModel<>(BonusBlocks.CRATE_PAINTED));

        ModelHelper.setBlockModel(BonusBlocks.BOOKSHELF_EMPTY_PLANKS_OAK, () -> new BlockModelStandard<>(BonusBlocks.BOOKSHELF_EMPTY_PLANKS_OAK)
                .setTex(0, "bonusblocks:block/bookshelf_empty_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
                .setTex(0, "minecraft:block/planks/oak", Side.TOP, Side.BOTTOM));

        ModelHelper.setBlockModel(BonusBlocks.BRANCH, () -> new BlockModelStandard<>(BonusBlocks.BRANCH)
                .setAllTextures(0, "bonusblocks:block/branch"));

        ModelHelper.setBlockModel(BonusBlocks.LEAVES_OAK_MOSSY, () -> new BlockModelLeaves<>(BonusBlocks.LEAVES_OAK_MOSSY,"bonusblocks:block/leaves_oak_mossy", false));
        ModelHelper.setBlockModel(BonusBlocks.LEAVES_JACARANDA, () -> new BlockModelLeaves<>(BonusBlocks.LEAVES_JACARANDA,"bonusblocks:block/leaves_jacaranda", false));

        ModelHelper.setBlockModel(BonusBlocks.SAPLING_OAK_MOSSY, () -> new BlockModelCrossedSquares<>(BonusBlocks.SAPLING_OAK_MOSSY)
                .setAllTextures(0, "bonusblocks:block/sapling/sapling_oak_mossy"));

        ModelHelper.setBlockModel(BonusBlocks.SAPLING_JACARANDA, () -> new BlockModelCrossedSquares<>(BonusBlocks.SAPLING_JACARANDA)
                .setAllTextures(0, "bonusblocks:block/sapling/sapling_jacaranda"));



        //STAIRS
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_WOOL, () -> new BlockModelStairsWool<>(BonusBlocks.STAIRS_WOOL));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_COBBLESTONE_MOSSY, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_COBBLESTONE_MOSSY));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_BRICK_STONE_POLISHED_MOSSY, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_STONE_POLISHED_MOSSY));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_BRICK_SCORCHEDSTONE, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_SCORCHEDSTONE));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_BRICK_MUD, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_MUD));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_SCORCHEDSTONE, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_SCORCHEDSTONE));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_BRICK_QUARTZ, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_QUARTZ));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_BRICK_OLIVINE, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_OLIVINE));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_BRICK_SILVER, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_SILVER));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_COPPER, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_COPPER));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_BRICK_CLAY_BAKED, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_CLAY_BAKED));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_COBBLE_LAZURITE, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_COBBLE_LAZURITE));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_BRICK_LAZURITE, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_LAZURITE));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_COBBLE_PERIDOT, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_COBBLE_PERIDOT));
        ModelHelper.setBlockModel(BonusBlocks.STAIRS_BRICK_PERIDOT, () -> new BlockModelStairs<>(BonusBlocks.STAIRS_BRICK_PERIDOT));

        //SLABS
        ModelHelper.setBlockModel(BonusBlocks.SLAB_WOOL, () -> new BlockModelSlabWool<>(BonusBlocks.SLAB_WOOL));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_COBBLESTONE_MOSSY, () -> new BlockModelSlab<>(BonusBlocks.SLAB_COBBLESTONE_MOSSY));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_BRICK_STONE_POLISHED_MOSSY, () -> new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_STONE_POLISHED_MOSSY));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_BRICK_SCORCHEDSTONE, () -> new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_SCORCHEDSTONE));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_BRICK_MUD, () -> new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_MUD));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_SCORCHEDSTONE, () -> new BlockModelSlab<>(BonusBlocks.SLAB_SCORCHEDSTONE));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_BRICK_QUARTZ, () -> new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_QUARTZ));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_BRICK_OLIVINE, () -> new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_OLIVINE));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_BRICK_SILVER, () -> new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_SILVER));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_COPPER, () -> new BlockModelSlab<>(BonusBlocks.SLAB_COPPER));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_BRICK_CLAY_BAKED, () -> new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_CLAY_BAKED));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_COBBLE_LAZURITE, () -> new BlockModelSlab<>(BonusBlocks.SLAB_COBBLE_LAZURITE));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_BRICK_LAZURITE, () -> new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_LAZURITE));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_COBBLE_PERIDOT, () -> new BlockModelSlab<>(BonusBlocks.SLAB_COBBLE_PERIDOT));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_BRICK_PERIDOT, () -> new BlockModelSlab<>(BonusBlocks.SLAB_BRICK_PERIDOT));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_SLATE_POLISHED, () -> new BlockModelSlab<>(BonusBlocks.SLAB_SLATE_POLISHED));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_MARBLE_POLISHED, () -> new BlockModelSlab<>(BonusBlocks.SLAB_MARBLE_POLISHED));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_PERIDOT_POLISHED, () -> new BlockModelSlab<>(BonusBlocks.SLAB_PERIDOT_POLISHED));
        ModelHelper.setBlockModel(BonusBlocks.SLAB_LAZURITE_POLISHED, () -> new BlockModelSlab<>(BonusBlocks.SLAB_LAZURITE_POLISHED));

    }

    @Override
    public void initItemModels(ItemModelDispatcher dispatcher) {

    }

    @Override
    public void initEntityModels(EntityRenderDispatcher dispatcher) {

    }

    @Override
    public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

    }

    @Override
    public void initBlockColors(BlockColorDispatcher dispatcher) {
        ModelHelper.setBlockColor(BonusBlocks.LEAVES_OAK_MOSSY, () -> new BlockColorLeavesOak(Colorizers.oak));
    }
}
