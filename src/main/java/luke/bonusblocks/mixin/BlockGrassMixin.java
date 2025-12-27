package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBiomes;
import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.BlockLogicGrass;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Mixin(value = BlockLogicGrass.class, remap = false)
public class BlockGrassMixin {

    @Unique
    private static final Set<Biome> SILVER_BIOMES = new HashSet<>();
    @Unique
    private static final Set<Biome> CYAN_BIOMES = new HashSet<>();
    @Unique
    private static final Set<Biome> MAGENTA_BIOMES = new HashSet<>();


    static {
        SILVER_BIOMES.add(Biomes.OVERWORLD_TUNDRA);
        SILVER_BIOMES.add(Biomes.OVERWORLD_TAIGA);
        SILVER_BIOMES.add(Biomes.OVERWORLD_GLACIER);
        SILVER_BIOMES.add(Biomes.OVERWORLD_BOREAL_FOREST);
        SILVER_BIOMES.add(Biomes.OVERWORLD_MEADOW);
        SILVER_BIOMES.add(BonusBiomes.OVERWORLD_OVERGROWN_MEADOW);

        CYAN_BIOMES.add(Biomes.OVERWORLD_FOREST);
        CYAN_BIOMES.add(Biomes.OVERWORLD_BIRCH_FOREST);
        CYAN_BIOMES.add(Biomes.OVERWORLD_SEASONAL_FOREST);
        CYAN_BIOMES.add(Biomes.OVERWORLD_PLAINS);
        CYAN_BIOMES.add(Biomes.OVERWORLD_SHRUBLAND);
        CYAN_BIOMES.add(Biomes.OVERWORLD_GRASSLANDS);
        CYAN_BIOMES.add(Biomes.OVERWORLD_MEADOW);
        CYAN_BIOMES.add(BonusBiomes.OVERWORLD_OVERGROWN_MEADOW);

        MAGENTA_BIOMES.add(Biomes.OVERWORLD_OUTBACK);
        MAGENTA_BIOMES.add(Biomes.OVERWORLD_OUTBACK_GRASSY);
        MAGENTA_BIOMES.add(Biomes.OVERWORLD_SWAMPLAND_MUDDY);
        MAGENTA_BIOMES.add(Biomes.OVERWORLD_SWAMPLAND);
        MAGENTA_BIOMES.add(Biomes.OVERWORLD_RAINFOREST);
        MAGENTA_BIOMES.add(Biomes.OVERWORLD_CAATINGA);
        MAGENTA_BIOMES.add(Biomes.OVERWORLD_CAATINGA_PLAINS);
        MAGENTA_BIOMES.add(Biomes.OVERWORLD_MEADOW);
        MAGENTA_BIOMES.add(BonusBiomes.OVERWORLD_OVERGROWN_MEADOW);
    }

    @Inject(method = "updateTick", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/world/World;setBlockWithNotify(IIII)Z"))
    private void addExtraFlowers(World world, int x, int y, int z, Random rand, CallbackInfo ci) {
        int fy = y + 1;
        if (world.getBlockId(x, fy, z) != 0) return;
        Biome biome = world.getBlockBiome(x, fy, z);

        if (SILVER_BIOMES.contains(biome) && rand.nextInt(6) == 0) {
            world.setBlockWithNotify(x, fy, z, BonusBlocks.FLOWER_SILVER.id());
        }
        if (CYAN_BIOMES.contains(biome) && rand.nextInt(6) == 0) {
            world.setBlockWithNotify(x, fy, z, BonusBlocks.FLOWER_SILVER.id());
        }
        if (MAGENTA_BIOMES.contains(biome) && rand.nextInt(6) == 0) {
            world.setBlockWithNotify(x, fy, z, BonusBlocks.FLOWER_SILVER.id());
        }
        if (rand.nextInt(8) == 0) {
            world.setBlockWithNotify(x, fy, z, BonusBlocks.FLOWER_LIME.id());
        }
    }
}
