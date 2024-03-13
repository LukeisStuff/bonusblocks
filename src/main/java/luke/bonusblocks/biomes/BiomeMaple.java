package luke.bonusblocks.biomes;

import luke.bonusblocks.BonusBlocksMod;
import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.BiomeForest;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeFancy;

import java.util.Random;

public class BiomeMaple extends BiomeForest {
    public BiomeMaple() {
        this.topBlock = (short) Block.grass.id;
        this.fillerBlock = (short)Block.dirt.id;
    }

    public WorldFeature getRandomWorldGenForTrees(Random random) {
        if (random.nextInt(10) == 0) {
            return new WorldFeatureTreeFancy(BonusBlocks.leavesMaple.id, BonusBlocks.logMaple.id, 5);
        } else if (random.nextInt(20) == 0) {
            return new WorldFeatureTreeFancy(BonusBlocks.leavesMaple.id, BonusBlocks.logMaple.id, 5);
        } else if (random.nextInt(5) == 0) {
            return new WorldFeatureTreeFancy(BonusBlocks.leavesMaple.id, BonusBlocks.logMaple.id, 5);
        } else {
            return new WorldFeatureTreeFancy(BonusBlocks.leavesMaple.id, BonusBlocks.logMaple.id, 5);
        }
    }
}
