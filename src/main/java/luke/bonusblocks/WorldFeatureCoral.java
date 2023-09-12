package luke.bonusblocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;

import java.util.Random;

public class WorldFeatureCoral extends WorldFeature {
    private int coralBlockId;

    public WorldFeatureCoral(int i) {
        this.coralBlockId = i;
    }

    public boolean generate(World world, Random random, int x, int y, int z) {
        if (world.getBlockId(x, y - 1, z) != Block.fluidWaterStill.id) {
            return false;
        } else {
            for(int l = 0; l < 128; ++l) {
                int i1 = x + random.nextInt(8) - random.nextInt(8);
                int j1 = y + random.nextInt(4) - random.nextInt(4);
                int k1;
                for(k1 = z + random.nextInt(8) - random.nextInt(8); world.getBlockId(i1, y - 1, k1) == Block.fluidWaterStill.id; --y) {
                }
                if ((world.getBlockId(i1, y - 1, k1) == Block.sand.id || world.getBlockId(i1, y - 1, k1) == Block.dirt.id || world.getBlockId(i1, y - 1, k1) == Block.dirtScorched.id || world.getBlockId(i1, y - 1, k1) == Block.gravel.id && world.getBlockId(i1, y + 1, k1) != 0)) {
                    if (random.nextInt(50) == 0) {
                        world.setBlockRaw(i1, j1, k1, this.coralBlockId);
                    }
                }
            }
            return true;
        }
    }
}
