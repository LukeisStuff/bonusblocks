package luke.bonusblocks.biomes;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeFancy;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;

import java.util.Random;

public class BiomeOvergrown extends Biome {
    public BiomeOvergrown(String key) {
        super(key);
        this.topBlock = (short) BonusBlocks.GRASS_OVERGROWN.id;
        this.fillerBlock = (short) Blocks.STONE.id;
    }

    public WorldFeature getRandomWorldGenForTrees(Random random) {
        if (random.nextInt(5) == 0) {
            return new WorldFeatureTreeShrub(Blocks.LEAVES_SHRUB.id, BonusBlocks.LOG_SHRUB.id);
        } else if (random.nextInt(20) == 0) {
            return new WorldFeatureTreeFancy(BonusBlocks.LEAVES_JACARANDA.id, BonusBlocks.LOG_JACARANDA.id);
        }
        return new WorldFeatureTreeFancy(BonusBlocks.LEAVES_JACARANDA.id, BonusBlocks.LOG_JACARANDA.id);
    }
}