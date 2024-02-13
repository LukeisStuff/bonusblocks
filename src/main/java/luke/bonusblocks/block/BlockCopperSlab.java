package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockSlab;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockCopperSlab extends BlockSlab {
    protected int ticks;
    public BlockCopperSlab(Block block, int id) {
        super(block, id);
        this.setTicking(true);
    }

@Override
    public void updateTick(World world, int x, int y, int z, Random rand) {
        if (world.getBlockMetadata(x, y, z) >= 0) {
            ++this.ticks;
            if (this.ticks == 200) {
                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.slabCopperTarnished.id, world.getBlockMetadata(x, y, z));
                this.ticks = 0;
            }
        }
    }
}
