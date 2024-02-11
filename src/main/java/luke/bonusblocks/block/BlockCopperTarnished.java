package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockCopperTarnished extends Block {
    int ticks;
    public BlockCopperTarnished(String key, int id, Material material) {
        super(key, id, material);
        this.setTicking(true);
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
        super.updateTick(world, x, y, z, rand);
        if (world.getBlockMetadata(x, y, z) == 0) {
            ++this.ticks;
            if (this.ticks == 200) {
                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.blockCopperCorroded.id, 0);
                this.ticks = 0;
            }
        }
    }
}
