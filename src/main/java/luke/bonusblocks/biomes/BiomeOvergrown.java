package luke.bonusblocks.biomes;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.BiomeBorealForest;
import net.minecraft.core.world.biome.BiomeTaiga;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeFancy;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;

import java.util.Random;

public class BiomeOvergrown extends Biome {
    public BiomeOvergrown() {
        this.topBlock = (short) BonusBlocks.grassOvergrown.id;
        this.fillerBlock = (short) Block.stone.id;
    }

    public WorldFeature getRandomWorldGenForTrees(Random random) {
        if (random.nextInt(5) == 0) {
            return new WorldFeatureTreeShrub(Block.leavesShrub.id, BonusBlocks.logShrub.id);
        } else if (random.nextInt(20) == 0) {
            return new WorldFeatureTreeFancy(BonusBlocks.leavesJacaranda.id, BonusBlocks.logJacaranda.id);
        }
        return new WorldFeatureTreeFancy(BonusBlocks.leavesJacaranda.id, BonusBlocks.logJacaranda.id);
    }
}