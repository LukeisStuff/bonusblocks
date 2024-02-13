package luke.bonusblocks.biomes;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockFlower;
import net.minecraft.core.block.BlockOverlayPebbles;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;

import java.util.Random;

public class WorldFeaturePebbles extends WorldFeature {

    private final int plantBlockId;

    public WorldFeaturePebbles(int i) {
        this.plantBlockId = i;
    }

    public boolean generate(World world, Random random, int x, int y, int z) {
        for(int l = 0; l < 64; ++l) {
            int i1 = x + random.nextInt(8) - random.nextInt(8);
            int j1 = y + random.nextInt(4) - random.nextInt(4);
            int k1 = z + random.nextInt(8) - random.nextInt(8);
            if (world.isAirBlock(i1, j1, k1) && Block.blocksList[this.plantBlockId].canBlockStay(world, i1, j1, k1)) {
                world.setBlock(i1, j1, k1, this.plantBlockId);
            }
        }

        return true;
    }
}
