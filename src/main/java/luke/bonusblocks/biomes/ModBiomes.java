package luke.bonusblocks.biomes;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;

public abstract class ModBiomes {
    public static final Biome OVERWORLD_OVERGROWN_MEADOW =
            Biomes.register(BonusBlocks.MOD_ID+":overworld.overgrown.meadow",
                    new BiomeOvergrown());

    public static final Biome OVERWORLD_OUTBACK_MESA =
            Biomes.register(BonusBlocks.MOD_ID+":overworld.outback.mesa",
                    new BiomeMesa());

    public static final Biome OVERWORLD_DRYLAND =
            Biomes.register(BonusBlocks.MOD_ID+":overworld.dryland",
                    new BiomeDryland());

    public static final Biome OVERWORLD_MAPLE =
            Biomes.register(BonusBlocks.MOD_ID+":overworld.maple",
                    new BiomeMaple());
}