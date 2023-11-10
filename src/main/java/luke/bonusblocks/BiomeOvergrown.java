package luke.bonusblocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;

import java.util.Random;

public class BiomeOvergrown extends Biome {
    public BiomeOvergrown() {
        this.spawnableMonsterList.clear();
        this.topBlock = (short)BonusBlocks.grassOvergrown.id;
        this.fillerBlock = (short)Block.stone.id;
    }

    public WorldFeature getRandomWorldGenForTrees(Random random) {
        return new WorldFeatureTreeShrub(Block.leavesShrub.id, BonusBlocks.barkOak.id);
    }
}