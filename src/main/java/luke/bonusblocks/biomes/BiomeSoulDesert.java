package luke.bonusblocks.biomes;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.biome.BiomeNether;

public class BiomeSoulDesert extends BiomeNether {

    public BiomeSoulDesert(String key) {
        super(key);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.topBlock = (short) Blocks.SOULSAND.id;
        this.fillerBlock = (short) Blocks.SOULSAND.id;
    }
}
