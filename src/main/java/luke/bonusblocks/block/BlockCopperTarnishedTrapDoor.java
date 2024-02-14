package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.BlockTrapDoor;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockCopperTarnishedTrapDoor extends BlockTrapDoor {
    protected int ticks;
    public BlockCopperTarnishedTrapDoor(String key, int id, Material material, boolean isIron) {
        super(key, id, material, isIron);
        this.setTicking(true);
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
        if (world.getBlockMetadata(x, y, z) >= 0) {
            ++this.ticks;
            if (this.ticks == 200) {
                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.trapdoorCopperCorroded.id, world.getBlockMetadata(x, y, z));
                this.ticks = 0;
            }
        }
    }

}
