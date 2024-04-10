package luke.bonusblocks.biomes;

import luke.bonusblocks.BonusBlocksMod;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;

public class ModBiomes {
    public static final Biome OVERWORLD_OVERGROWN_MEADOW = new BiomeOvergrown("bonusblocks.overgrown.meadow");
    public static final Biome OVERWORLD_OUTBACK_MESA = new BiomeMesa("bonusblocks.outback.mesa");
    public static final Biome OVERWORLD_DRYLAND = new BiomeDryland("bonusblocks.dryland");
    public static final Biome OVERWORLD_WETLAND = new BiomeWetland("bonusblocks.wetland");
    public static final Biome OVERWORLD_MAPLE = new BiomeMaple("bonusblocks.maple");

    public static final Biome NETHER_SOUL_DESERT = new BiomeSoulDesert("bonusblocks.soul.desert");
    public static final Biome NETHER_SOUL_WASTELAND = new BiomeSoulWasteland("bonusblocks.soul.wasteland");

    public void initializeBiomes() {
        Biomes.register(BonusBlocksMod.MOD_ID+":overworld.overgrown.meadow", Biomes.OVERWORLD_MEADOW);
        Biomes.register(BonusBlocksMod.MOD_ID+":overworld.outback.mesa", OVERWORLD_OUTBACK_MESA);
        Biomes.register(BonusBlocksMod.MOD_ID+":overworld.dryland", OVERWORLD_DRYLAND);
        Biomes.register(BonusBlocksMod.MOD_ID+":overworld.wetland", OVERWORLD_WETLAND);
        Biomes.register(BonusBlocksMod.MOD_ID+":overworld.maple", OVERWORLD_MAPLE);

        Biomes.register(BonusBlocksMod.MOD_ID+":nether.soul.wasteland", NETHER_SOUL_WASTELAND);
        Biomes.register(BonusBlocksMod.MOD_ID+":nether.soul.desert", NETHER_SOUL_DESERT);
    }
}