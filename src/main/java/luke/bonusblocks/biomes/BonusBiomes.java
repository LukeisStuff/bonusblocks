package luke.bonusblocks.biomes;

import luke.bonusblocks.BonusBlocksMod;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;

public class BonusBiomes {
    public static final Biome OVERWORLD_OVERGROWN_MEADOW = new BiomeOvergrown("bonusblocks.overgrown.meadow");
    public static final Biome OVERWORLD_DRYLAND = new BiomeDryland("bonusblocks.dryland");


    public void initializeBiomes() {
        Biomes.register(BonusBlocksMod.MOD_ID+":overworld.overgrown.meadow", OVERWORLD_OVERGROWN_MEADOW);
        Biomes.register(BonusBlocksMod.MOD_ID+":overworld.dryland", OVERWORLD_DRYLAND);
    }
}