package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockStairs;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockCopperStairs extends BlockStairs {
    protected int ticks;
    public BlockCopperStairs(Block block, int id) {
        super(block, id);
        this.setTicking(true);
    }


    public void updateTick(World world, int x, int y, int z, Random rand) {
        if (world.getBlockMetadata(x, y, z) >= 0) {
            ++this.ticks;
            if (this.ticks == 200) {
                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.stairsCopperTarnished.id, world.getBlockMetadata(x, y, z));
                this.ticks = 0;
            }
        }
    }
}
