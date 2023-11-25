package luke.bonusblocks.biomes;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.entity.SpawnListEntry;
import net.minecraft.core.entity.monster.EntitySpider;
import net.minecraft.core.world.biome.BiomeOutback;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeEucalyptus;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;
import net.minecraft.core.world.weather.Weather;

import java.util.Random;

public class BiomeMesa extends BiomeOutback {
    public BiomeMesa() {
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableMonsterList.add(new SpawnListEntry(EntitySpider.class, 20));
        this.setBlockedWeathers(Weather.overworldSnow, Weather.overworldRain, Weather.overworldStorm);
        this.topBlock = (short) BonusBlocks.scorchedstone.id;
        this.fillerBlock = (short) BonusBlocks.scorchedstone.id;
    }

    public WorldFeature getRandomWorldGenForTrees(Random random) {
        if (random.nextInt(2) == 0) {
            return new WorldFeatureTreeEucalyptus(0, BonusBlocks.logScorched.id);
        } else {
            return new WorldFeatureTreeShrub(Block.cobbleGranite.id, Block.cobbleGranite.id);
        }
    }
}