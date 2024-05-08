package luke.bonusblocks.block.convert;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockSlab;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockSlabCobblePermafrostConvert extends BlockSlab {

    public BlockSlabCobblePermafrostConvert(Block modelBlock, int id) {
        super(modelBlock, id);
        setTicking(true);
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
        if (rand.nextInt(2) == 0) {
            world.setBlockAndMetadataWithNotify(x, y, z, Block.slabCobblePermafrost.id, world.getBlockMetadata(x, y, z));
        }
    }

    public void onBlockPlaced(World world, int x, int y, int z, Side side, EntityLiving entity, double sideHeight) {
        Direction dir = entity.getVerticalPlacementDirection(side, sideHeight);
        if (dir == Direction.DOWN) {
            world.setBlockAndMetadataWithNotify(x, y, z, Block.slabCobblePermafrost.id, 0);
        }

        if (dir == Direction.UP) {
            world.setBlockAndMetadataWithNotify(x, y, z, Block.slabCobblePermafrost.id, 2);
        }
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return new ItemStack[]{new ItemStack(Block.slabCobblePermafrost)};
    }

}
