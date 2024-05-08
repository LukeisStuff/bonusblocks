package luke.bonusblocks.block.convert;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockStairs;
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

}