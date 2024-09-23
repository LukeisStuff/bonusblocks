package luke.bonusblocks.block;

import net.minecraft.core.Global;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockSlab;
import net.minecraft.core.block.BlockSlabPainted;
import net.minecraft.core.block.SlabBlock;
import net.minecraft.core.block.entity.BlockEntity;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

public class BlockWoolSlab extends SlabBlock {
    public static final int[] texCoords = new int[16];

    public BlockWoolSlab(Block block, int id) {
        super(block, id);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, BlockEntity BlockEntity) {
        return new ItemStack[]{new ItemStack(this, 1, meta)};
    }

    public static int func_21034_c(int i) {
        return ~i & 15;
    }

    public static int getMetadataForColour(int i) {
        return ~i & 15;
    }

    public void onBlockPlaced(World world, int x, int y, int z, Side side, EntityLiving entity, double sideHeight) {
        int meta = entity.getVerticalPlacementDirection(side, sideHeight) == Direction.UP ? 2 : 0;
        world.setBlockMetadataWithNotify(x, y, z, meta | world.getBlockMetadata(x, y, z) & 240);
    }

}
