package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.SlabBlock;
import net.minecraft.core.block.entity.BlockEntity;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class BlockWoolSlab extends SlabBlock {
    public static final int[] texCoords = new int[16];

    public BlockWoolSlab(Block modelBlock, String namespaceId, int id) {
        super(modelBlock, namespaceId, id);
    }

    public BlockWoolSlab(Block modelBlock, String namespaceId, int id, int modelBlockMetadata) {
        super(modelBlock, namespaceId, id, modelBlockMetadata);
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

    public void onBlockPlacedByMob(World world, int x, int y, int z, Side side, Mob mob, double sideHeight) {
        Direction dir = mob.getVerticalPlacementDirection(side, sideHeight);
        if (dir == Direction.DOWN) {
            world.setBlockMetadataWithNotify(x, y, z,  world.getBlockMetadata(x, y, z) & 240);
        }

        if (dir == Direction.UP) {
            world.setBlockMetadataWithNotify(x, y, z,  world.getBlockMetadata(x, y, z) & 240);
        }

    }

    public void onBlockPlacedByWorld(World world, int x, int y, int z) {
        this.onNeighborBlockChange(world, x, y, z, 0);
        this.modelBlock.onBlockPlacedByWorld(world, x, y, z);
    }

}
