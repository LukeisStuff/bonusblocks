package luke.bonusblocks;

import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;

public abstract class ModBiomes {
    public static final Biome OVERWORLD_OVERGROWN =
            Biomes.register(BonusBlocks.MOD_ID+":overworld.overgrown",
                    new BiomeOvergrown());

    public static final Biome OVERWORLD_MESA =
            Biomes.register(BonusBlocks.MOD_ID+":overworld.mesa",
                    new BiomeMesa());
}