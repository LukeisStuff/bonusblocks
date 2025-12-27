package luke.bonusblocks.world;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.MethodParametersAnnotation;
import net.minecraft.core.world.generate.feature.WorldFeature;

import java.util.Random;

public class WorldFeatureRichSand extends WorldFeature {
    private final int numberOfBlocks;

    @MethodParametersAnnotation(
        names = {"numberOfBlocks"}
    )
    public WorldFeatureRichSand(int numberOfBlocks) {
        this.numberOfBlocks = numberOfBlocks;
    }

    public boolean place(World world, Random random, int x, int y, int z) {
        for (int x1 = x - this.numberOfBlocks; x1 < x + this.numberOfBlocks; ++x1) {
            for (int y1 = y - 2; y1 <= y + 2; ++y1) {
                for (int z1 = z - this.numberOfBlocks; z1 < z + this.numberOfBlocks; ++z1) {
                    if (random.nextInt(8) == 0 && world.getBlockId(x1, y1, z1) == Blocks.SAND.id()) {
                        world.setBlock(x1, y1, z1, BonusBlocks.SAND_RICH.id());
                    }
                }
            }
        }

        return true;
    }
}
