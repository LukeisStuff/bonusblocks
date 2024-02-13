package luke.bonusblocks.biomes;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;

import java.util.Random;

public class WorldFeatureBonemealFlower extends WorldFeature {
    private final int flowerID;
    private final int amount;
    public WorldFeatureBonemealFlower(int id, int amount) {
        this.flowerID = id;
        this.amount = amount;

    }
    @Override
    public boolean generate(World world, Random random, int x, int y, int z) {
        Block flowerBlock = Block.blocksList[this.flowerID];
        for (int l = 0; l < amount; ++l) {
            int flowerZ = z + random.nextInt(4) - random.nextInt(4);
            int flowerY = y + random.nextInt(2) - random.nextInt(2);
            int flowerX = x + random.nextInt(4) - random.nextInt(4);
            if (!world.isAirBlock(flowerX, flowerY , flowerZ) || !flowerBlock.canBlockStay(world, flowerX, flowerY, flowerZ)) continue;
            world.setBlockWithNotify(flowerX, flowerY, flowerZ, this.flowerID);
        }
        return true;
    }
}
