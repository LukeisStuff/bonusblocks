package luke.bonusblocks.biomes;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.Biome;

public class BiomePeakStone extends Biome {
    public BiomePeakStone() {
        this.topBlock = (short) Block.stone.id;
        this.fillerBlock = (short) Block.stone.id;
    }

    private boolean hasSurfaceSnow = true;

    public boolean hasSurfaceSnow() {
        return this.hasSurfaceSnow;
    }

    public Biome setSurfaceSnow() {
        this.hasSurfaceSnow = true;
        return this;
    }
}
