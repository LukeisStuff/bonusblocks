package luke.bonusblocks.biomes;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.BiomeNether;

public class BiomeSoulDesert extends BiomeNether {

    public BiomeSoulDesert() {
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.topBlock = (short) Block.soulsand.id;
        this.fillerBlock = (short) Block.soulsand.id;
    }
}
