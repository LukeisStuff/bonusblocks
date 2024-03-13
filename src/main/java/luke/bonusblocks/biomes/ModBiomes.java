package luke.bonusblocks.biomes;

import luke.bonusblocks.BonusBlocksMod;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;

public abstract class ModBiomes {
    public static final Biome OVERWORLD_OVERGROWN_MEADOW =
            Biomes.register(BonusBlocksMod.MOD_ID+":overworld.overgrown.meadow",
                    new BiomeOvergrown());

    public static final Biome OVERWORLD_OUTBACK_MESA =
            Biomes.register(BonusBlocksMod.MOD_ID+":overworld.outback.mesa",
                    new BiomeMesa());

    public static final Biome OVERWORLD_DRYLAND =
            Biomes.register(BonusBlocksMod.MOD_ID+":overworld.dryland",
                    new BiomeDryland());

    public static final Biome OVERWORLD_WETLAND =
            Biomes.register(BonusBlocksMod.MOD_ID+":overworld.wetland",
                    new BiomeWetland());

    public static final Biome OVERWORLD_MAPLE =
            Biomes.register(BonusBlocksMod.MOD_ID+":overworld.maple",
                    new BiomeMaple());
}