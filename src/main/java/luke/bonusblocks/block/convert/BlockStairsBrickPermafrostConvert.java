package luke.bonusblocks.block.convert;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockStairs;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockStairsBrickPermafrostConvert extends BlockStairs {

    public BlockStairsBrickPermafrostConvert(Block modelBlock, int id) {
        super(modelBlock, id);
        setTicking(true);
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
        if (rand.nextInt(2) == 0) {
            world.setBlockAndMetadataWithNotify(x, y, z, Block.stairsBrickPermafrost.id, world.getBlockMetadata(x, y, z));
        }
    }

    public void onBlockPlaced(World world, int x, int y, int z, Side side, EntityLiving entity, double sideHeight) {
        int meta = world.getBlockMetadata(x, y, z) & 240;
        Direction hRotation = entity.getHorizontalPlacementDirection(side).getOpposite();
        if (hRotation == Direction.NORTH) {
            meta |= 2;
        }

        if (hRotation == Direction.EAST) {
            meta |= 1;
        }

        if (hRotation == Direction.SOUTH) {
            meta |= 3;
        }

        if (hRotation == Direction.WEST) {
            meta |= 0;
        }

        Direction vRotation = entity.getVerticalPlacementDirection(side, sideHeight);
        if (vRotation == Direction.DOWN) {
            meta |= 0;
        }

        if (vRotation == Direction.UP) {
            meta |= 8;
        }

        world.setBlockAndMetadataWithNotify(x, y, z, Block.stairsBrickPermafrost.id, meta);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return new ItemStack[]{new ItemStack(Block.stairsBrickPermafrost)};
    }

}