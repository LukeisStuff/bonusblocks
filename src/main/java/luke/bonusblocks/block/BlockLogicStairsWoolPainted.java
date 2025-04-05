package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicStairs;
import net.minecraft.core.block.IPainted;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.world.World;

public class BlockLogicStairsWoolPainted extends BlockLogicStairs implements IPainted {
    public BlockLogicStairsWoolPainted(Block<?> block, Block<?> modelBlock) {
        super(block, modelBlock);
    }

    public DyeColor fromMetadata(int meta) {
        return DyeColor.colorFromBlockMeta((meta & 240) >> 4);
    }

    public int toMetadata(DyeColor color) {
        return color.blockMeta << 4;
    }

    public int stripColorFromMetadata(int meta) {
        return meta & 15;
    }

    public void removeDye(World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.STAIRS_WOOL.id(), this.stripColorFromMetadata(meta));
    }

    public void setColor(World world, int x, int y, int z, DyeColor color) {
        IPainted.super.setColor(world, x, y, z, color);
    }

    public String getLanguageKey(int meta) {
        return super.getLanguageKey(meta) + "." + this.fromMetadata(meta).colorID;
    }
}
