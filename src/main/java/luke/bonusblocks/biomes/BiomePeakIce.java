package luke.bonusblocks.biomes;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.Biome;

public class BiomePeakIce extends Biome {
    public BiomePeakIce() {
        this.topBlock = (short) Block.blockSnow.id;
        this.fillerBlock = (short) Block.ice.id;
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
