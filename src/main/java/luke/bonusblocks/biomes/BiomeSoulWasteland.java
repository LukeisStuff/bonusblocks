package luke.bonusblocks.biomes;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.biome.BiomeNether;

public class BiomeSoulWasteland extends BiomeNether {

    public BiomeSoulWasteland(String key) {
        super(key);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.topBlock = (short) Blocks.SOULSCHIST.id;
        this.fillerBlock = (short) Blocks.SOULSCHIST.id;
    }
}
