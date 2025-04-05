package luke.bonusblocks.biomes;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeEucalyptus;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;
import net.minecraft.core.world.weather.Weathers;

import java.util.Random;

public class BiomeDryland extends Biome {
    public BiomeDryland(String key) {
        super(key);
        this.setBlockedWeathers(Weathers.OVERWORLD_SNOW, Weathers.OVERWORLD_STORM);
        this.topBlock = (short) BonusBlocks.DIRT_BAKED.id();
        this.fillerBlock = (short) BonusBlocks.DIRT_BAKED.id();
    }

    public WorldFeature getRandomWorldGenForTrees(Random random) {
        if (random.nextInt(10) == 0) {
            return new WorldFeatureTreeEucalyptus(0, BonusBlocks.LOG_SCORCHED.id());
        } else {
            return new WorldFeatureTreeShrub(Blocks.COBBLE_GRANITE.id(), Blocks.COBBLE_GRANITE.id());
        }
    }

}
