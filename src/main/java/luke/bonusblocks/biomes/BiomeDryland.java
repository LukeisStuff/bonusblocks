package luke.bonusblocks.biomes;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeFancy;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;
import net.minecraft.core.world.weather.Weathers;

import java.util.Random;

public class BiomeDryland extends Biome {
    public BiomeDryland(String key) {
        super(key);
        this.setBlockedWeathers(Weathers.OVERWORLD_SNOW, Weathers.OVERWORLD_STORM);
        this.topBlock = (short) BonusBlocks.DIRT_ROUGH.id;
        this.fillerBlock = (short) BonusBlocks.DIRT_ROUGH.id;
    }

    public WorldFeature getRandomWorldGenForTrees(Random random) {
        if (random.nextInt(8) == 0) {
            return new WorldFeatureTreeShrub(Blocks.LEAVES_SHRUB.id, BonusBlocks.LOG_SHRUB.id);
        } else if (random.nextInt(8) == 0) {
            return new WorldFeatureTreeFancy(Blocks.LEAVES_SHRUB.id, BonusBlocks.LOG_SHRUB.id);
        }
        return new WorldFeatureTreeShrub(Blocks.LEAVES_SHRUB.id, BonusBlocks.LOG_SHRUB.id);
    }

}
