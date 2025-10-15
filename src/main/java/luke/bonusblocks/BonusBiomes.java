package luke.bonusblocks;

import luke.bonusblocks.world.BiomeOvergrown;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;

public class BonusBiomes {
    public static final Biome OVERWORLD_OVERGROWN_MEADOW = new BiomeOvergrown("bonusblocks.overgrown.meadow");

    public void initializeBiomes() {
        Biomes.register(BonusBlocksMod.MOD_ID + ":overworld.overgrown.meadow", OVERWORLD_OVERGROWN_MEADOW);
    }
}