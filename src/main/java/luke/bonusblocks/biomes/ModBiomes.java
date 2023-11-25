package luke.bonusblocks.biomes;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;

public abstract class ModBiomes {
    public static final Biome OVERWORLD_OVERGROWN =
            Biomes.register(BonusBlocks.MOD_ID+":overworld.overgrown",
                    new BiomeOvergrown());

    public static final Biome OVERWORLD_OUTBACK_MESA =
            Biomes.register(BonusBlocks.MOD_ID+":overworld.outback.mesa",
                    new BiomeMesa());

    public static final Biome OVERWORLD_MAPLE =
            Biomes.register(BonusBlocks.MOD_ID+":overworld.maple",
                    new BiomeMaple());

    public static final Biome OVERWORLD_PEAK_ICE =
            Biomes.register(BonusBlocks.MOD_ID+":overworld.peak.ice",
                    new BiomePeakIce());

    public static final Biome OVERWORLD_PEAK_SNOW =
            Biomes.register(BonusBlocks.MOD_ID+":overworld.peak.snow",
                    new BiomePeakSnow());

    public static final Biome OVERWORLD_PEAK_STONE =
            Biomes.register(BonusBlocks.MOD_ID+":overworld.peak.stone",
                    new BiomePeakStone());
}