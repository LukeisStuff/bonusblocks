package luke.bonusblocks.biomes;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeFancy;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;

import java.util.Random;

public class BiomeDryland extends Biome {
    public BiomeDryland() {
        this.topBlock = (short) Block.dirt.id;
        this.fillerBlock = (short) Block.dirt.id;
    }

    public WorldFeature getRandomWorldGenForTrees(Random random) {
        if (random.nextInt(8) == 0) {
            return new WorldFeatureTreeShrub(Block.leavesShrub.id, BonusBlocks.logShrub.id);
        } else if (random.nextInt(8) == 0) {
            return new WorldFeatureTreeFancy(Block.leavesShrub.id, BonusBlocks.logShrub.id);
        }
        return new WorldFeatureTreeShrub(Block.leavesShrub.id, BonusBlocks.logShrub.id);
    }

}
