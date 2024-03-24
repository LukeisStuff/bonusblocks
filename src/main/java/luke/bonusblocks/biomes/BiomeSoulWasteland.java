package luke.bonusblocks.biomes;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.world.biome.BiomeNether;

public class BiomeSoulWasteland extends BiomeNether {

    public BiomeSoulWasteland(String key) {
        super(key);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.topBlock = (short) BonusBlocks.soulslate.id;
        this.fillerBlock = (short) BonusBlocks.soulslate.id;
    }
}
