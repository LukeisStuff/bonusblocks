package luke.bonusblocks.biomes;

import luke.bonusblocks.BonusBlocksMod;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;

public abstract class ModBiomes {
    public static final Biome OVERWORLD_OVERGROWN_MEADOW =
            Biomes.register(BonusBlocksMod.MOD_ID+":overworld.overgrown.meadow",
                    new BiomeOvergrown("bonusblocks:overworld.overgrown.meadow"));

    public static final Biome OVERWORLD_OUTBACK_MESA =
            Biomes.register(BonusBlocksMod.MOD_ID+":overworld.outback.mesa",
                    new BiomeMesa("bonusblocks:overworld.outback.mesa"));

    public static final Biome OVERWORLD_DRYLAND =
            Biomes.register(BonusBlocksMod.MOD_ID+":overworld.dryland",
                    new BiomeDryland("bonusblocks:overworld.dryland"));

    public static final Biome OVERWORLD_WETLAND =
            Biomes.register(BonusBlocksMod.MOD_ID+":overworld.wetland",
                    new BiomeWetland("bonusblocks:overworld.wetland"));

    public static final Biome OVERWORLD_MAPLE =
            Biomes.register(BonusBlocksMod.MOD_ID+":overworld.maple",
                    new BiomeMaple("bonusblocks:overworld.maple"));



    public static final Biome NETHER_SOUL_DESERT =
            Biomes.register(BonusBlocksMod.MOD_ID+":nether.soul.desert",
                    new BiomeSoulDesert("bonusblocks:nether.soul.desert"));

    public static final Biome NETHER_SOUL_WASTELAND =
            Biomes.register(BonusBlocksMod.MOD_ID+":nether.soul.wasteland",
                    new BiomeSoulWasteland("bonusblocks:nether.soul.wasteland"));
}