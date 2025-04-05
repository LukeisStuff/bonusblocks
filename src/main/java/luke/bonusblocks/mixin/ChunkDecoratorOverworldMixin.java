package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBiomes;
import luke.bonusblocks.BonusBlocks;
import luke.bonusblocks.biomes.WorldFeaturePebbles;
import net.minecraft.core.block.BlockLogicSand;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.perlin.overworld.ChunkDecoratorOverworld;
import net.minecraft.core.world.generate.feature.WorldFeatureFlowers;
import net.minecraft.core.world.generate.feature.WorldFeatureTallGrass;
import net.minecraft.core.world.noise.PerlinNoise;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(value = ChunkDecoratorOverworld.class, remap = false)
public class ChunkDecoratorOverworldMixin {

    @Shadow
    @Final
    private PerlinNoise treeDensityNoise;
    @Final
    private World world;

    @Unique
    private boolean isHot;

    @Unique
    private boolean isSwamp;

    @Unique
    private boolean isCold;

    @Inject(method = "decorate", at = @At("TAIL"))
    public void decorate(Chunk chunk, CallbackInfo info) {
        int chunkX = chunk.xPosition;
        int chunkZ = chunk.zPosition;
        int minY = world.getWorldType().getMinY();
        int maxY = world.getWorldType().getMaxY();
        int rangeY = maxY + 1 - minY;
        BlockLogicSand.fallInstantly = true;
        int x = chunkX << 4;
        int z = chunkZ << 4;
        int y = world.getHeightValue(x + 16, z + 16);
        Random rand = new Random(this.world.getRandomSeed());
        long l1 = rand.nextLong() / 2L * 2L + 1L;
        long l2 = rand.nextLong() / 2L * 2L + 1L;
        rand.setSeed((long) chunkX * l1 + (long) chunkZ * l2 ^ this.world.getRandomSeed());
        int blockX, blockY, blockZ;
        int j4;
        int k7;
        int k4;
        float oreHeightModifier = (float) rangeY / 128.0F;
        int treeDensity;
        Biome biome = world.getBlockBiome(x + 16, y, z + 16);

        if (biome == Biomes.OVERWORLD_FOREST || biome == Biomes.OVERWORLD_BIRCH_FOREST || biome == Biomes.OVERWORLD_SEASONAL_FOREST || biome == Biomes.OVERWORLD_PLAINS ||
                biome == BonusBiomes.OVERWORLD_OVERGROWN_MEADOW || biome == Biomes.OVERWORLD_MEADOW || biome == Biomes.OVERWORLD_SHRUBLAND || biome == Biomes.OVERWORLD_GRASSLANDS) {
            if ((rand.nextInt(8) != 0)) {
                blockX = x + rand.nextInt(16) + 8;
                blockY = minY + rand.nextInt(rangeY);
                blockZ = z + rand.nextInt(16) + 8;
                new WorldFeatureFlowers(BonusBlocks.FLOWER_CYAN.id(), 64, true).place(world, rand, blockX, blockY, blockZ);
            }
        }
        if (biome == Biomes.OVERWORLD_OUTBACK || biome == Biomes.OVERWORLD_OUTBACK_GRASSY || biome == Biomes.OVERWORLD_SWAMPLAND_MUDDY || biome == Biomes.OVERWORLD_SWAMPLAND ||
                biome == Biomes.OVERWORLD_RAINFOREST || biome == Biomes.OVERWORLD_CAATINGA || biome == Biomes.OVERWORLD_CAATINGA_PLAINS || biome == BonusBiomes.OVERWORLD_DRYLAND || biome == BonusBiomes.OVERWORLD_OVERGROWN_MEADOW) {
            if ((rand.nextInt(8) != 0)) {
                blockX = x + rand.nextInt(16) + 8;
                blockY = minY + rand.nextInt(rangeY);
                blockZ = z + rand.nextInt(16) + 8;
                new WorldFeatureFlowers(BonusBlocks.FLOWER_MAGENTA.id(), 64, true).place(world, rand, blockX, blockY, blockZ);
            }
        }
        if (biome == Biomes.OVERWORLD_TUNDRA || biome == Biomes.OVERWORLD_TAIGA || biome == Biomes.OVERWORLD_GLACIER || biome == Biomes.OVERWORLD_BOREAL_FOREST || biome == BonusBiomes.OVERWORLD_OVERGROWN_MEADOW) {
            if ((rand.nextInt(8) != 0)) {
                blockX = x + rand.nextInt(16) + 8;
                blockY = minY + rand.nextInt(rangeY);
                blockZ = z + rand.nextInt(16) + 8;
                new WorldFeatureFlowers(BonusBlocks.FLOWER_SILVER.id(), 64, true).place(world, rand, blockX, blockY, blockZ);
            }
        }


        if (biome == BonusBiomes.OVERWORLD_DRYLAND || biome == BonusBiomes.OVERWORLD_OVERGROWN_MEADOW) {
            if ((rand.nextInt(8) != 0)) {
                blockX = x + rand.nextInt(16) + 8;
                blockY = minY + rand.nextInt(rangeY);
                blockZ = z + rand.nextInt(16) + 8;
                new WorldFeatureTallGrass(Blocks.TALLGRASS.id()).place(world, rand, blockX, blockY, blockZ);
            }
        }
        if (biome == BonusBiomes.OVERWORLD_DRYLAND || biome == BonusBiomes.OVERWORLD_OVERGROWN_MEADOW) {
            if ((rand.nextInt(8) != 0)) {
                blockX = x + rand.nextInt(16) + 8;
                blockY = minY + rand.nextInt(rangeY);
                blockZ = z + rand.nextInt(16) + 8;
                new WorldFeatureTallGrass(Blocks.TALLGRASS_FERN.id()).place(world, rand, blockX, blockY, blockZ);
            }
        }


        if (biome == BonusBiomes.OVERWORLD_OVERGROWN_MEADOW) {
            if ((rand.nextInt(8) != 0)) {
                blockX = x + rand.nextInt(16) + 8;
                blockY = minY + rand.nextInt(rangeY);
                blockZ = z + rand.nextInt(16) + 8;
                new WorldFeatureFlowers(Blocks.FLOWER_RED.id(), 64, true).place(world, rand, blockX, blockY, blockZ);
            }
        }
        if (biome == BonusBiomes.OVERWORLD_OVERGROWN_MEADOW) {
            if ((rand.nextInt(8) != 0)) {
                blockX = x + rand.nextInt(16) + 8;
                blockY = minY + rand.nextInt(rangeY);
                blockZ = z + rand.nextInt(16) + 8;
                new WorldFeatureFlowers(Blocks.FLOWER_YELLOW.id(), 64, true).place(world, rand, blockX, blockY, blockZ);
            }
        }
        if (biome == BonusBiomes.OVERWORLD_OVERGROWN_MEADOW) {
            if ((rand.nextInt(8) != 0)) {
                blockX = x + rand.nextInt(16) + 8;
                blockY = minY + rand.nextInt(rangeY);
                blockZ = z + rand.nextInt(16) + 8;
                new WorldFeatureFlowers(Blocks.FLOWER_ORANGE.id(), 64, true).place(world, rand, blockX, blockY, blockZ);
            }
        }
        if (biome == BonusBiomes.OVERWORLD_OVERGROWN_MEADOW) {
            if ((rand.nextInt(8) != 0)) {
                blockX = x + rand.nextInt(16) + 8;
                blockY = minY + rand.nextInt(rangeY);
                blockZ = z + rand.nextInt(16) + 8;
                new WorldFeatureFlowers(Blocks.FLOWER_PINK.id(), 64, true).place(world, rand, blockX, blockY, blockZ);
            }
        }
        if (biome == BonusBiomes.OVERWORLD_OVERGROWN_MEADOW) {
            if ((rand.nextInt(8) != 0)) {
                blockX = x + rand.nextInt(16) + 8;
                blockY = minY + rand.nextInt(rangeY);
                blockZ = z + rand.nextInt(16) + 8;
                new WorldFeatureFlowers(Blocks.FLOWER_PURPLE.id(), 64, true).place(world, rand, blockX, blockY, blockZ);
            }
        }
        if (biome == BonusBiomes.OVERWORLD_OVERGROWN_MEADOW) {
            if ((rand.nextInt(8) != 0)) {
                blockX = x + rand.nextInt(16) + 8;
                blockY = minY + rand.nextInt(rangeY);
                blockZ = z + rand.nextInt(16) + 8;
                new WorldFeatureFlowers(Blocks.FLOWER_LIGHT_BLUE.id(), 64, true).place(world, rand, blockX, blockY, blockZ);
            }
        }



        if ((rand.nextInt(8) != 0)) {
            blockX = x + rand.nextInt(16) + 8;
            blockY = minY + rand.nextInt(rangeY);
            blockZ = z + rand.nextInt(16) + 8;
            new WorldFeatureFlowers(BonusBlocks.FLOWER_LIME.id(), 128, true).place(world, rand, blockX, blockY, blockZ);
        }
        if ((rand.nextInt(8) != 0)) {
            blockX = x + rand.nextInt(16) + 8;
            blockY = minY + rand.nextInt(rangeY);
            blockZ = z + rand.nextInt(16) + 8;
            new WorldFeatureTallGrass(BonusBlocks.FLOWER_LIME.id()).place(world, rand, blockX, blockY, blockZ);
        }
        if ((rand.nextInt(8) != 0)) {
            blockX = x + rand.nextInt(16) + 8;
            blockY = minY + rand.nextInt(rangeY);
            blockZ = z + rand.nextInt(16) + 8;
            new WorldFeaturePebbles(Blocks.OVERLAY_PEBBLES.id()).place(world, rand, blockX, blockY, blockZ);
        }
    }
}
