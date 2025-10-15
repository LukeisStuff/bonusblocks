package luke.bonusblocks.world;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;

import java.util.Random;

public class WorldFeatureSkull extends WorldFeature {
    public WorldFeatureSkull() {
    }

    public boolean place(World world, Random random, int x, int y, int z) {
        for (int l = 0; l < 64; ++l) {
            int i1 = x + random.nextInt(8) - random.nextInt(8);
            int j1 = y + random.nextInt(4) - random.nextInt(4);
            int k1 = z + random.nextInt(8) - random.nextInt(8);
            if (world.isAirBlock(i1, j1, k1) && world.getBlockId(i1, j1 - 1, k1) == Blocks.COBBLE_NETHERRACK.id()) {
                if (random.nextInt(50) == 0) {
                    world.setBlockAndMetadata(i1, j1, k1, BonusBlocks.SKULL_CARVED_ACTIVE.id(), 2 + random.nextInt(4));
                } else {
                    world.setBlockAndMetadata(i1, j1, k1, BonusBlocks.SKULL_CARVED_IDLE.id(), 2 + random.nextInt(4));
                }
            }
        }

        return true;
    }
}
