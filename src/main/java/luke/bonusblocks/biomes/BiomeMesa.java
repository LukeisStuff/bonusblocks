package luke.bonusblocks.biomes;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.entity.SpawnListEntry;
import net.minecraft.core.entity.monster.SpiderMob;
import net.minecraft.core.world.biome.BiomeOutback;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeEucalyptus;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;
import net.minecraft.core.world.weather.Weathers;

import java.util.Random;

public class BiomeMesa extends BiomeOutback {
    public BiomeMesa(String key) {
        super(key);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableMonsterList.add(new SpawnListEntry(SpiderMob.class, 20));
        this.setBlockedWeathers(Weathers.OVERWORLD_SNOW, Weathers.OVERWORLD_RAIN, Weathers.OVERWORLD_STORM);
        this.topBlock = (short) BonusBlocks.SCORCHEDSTONE.id;
        this.fillerBlock = (short) BonusBlocks.SCORCHEDSTONE.id;
    }

    public WorldFeature getRandomWorldGenForTrees(Random random) {
        if (random.nextInt(10) == 0) {
            return new WorldFeatureTreeEucalyptus(0, BonusBlocks.LOG_SCORCHED.id);
        } else {
            return new WorldFeatureTreeShrub(Blocks.COBBLE_GRANITE.id, Blocks.COBBLE_GRANITE.id);
        }
    }
}