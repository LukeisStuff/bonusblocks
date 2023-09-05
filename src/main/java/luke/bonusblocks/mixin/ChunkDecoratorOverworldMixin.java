package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import luke.bonusblocks.WorldFeatureBluebell;
import luke.bonusblocks.WorldFeatureCoral;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockSand;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.perlin.overworld.ChunkDecoratorOverworld;
import net.minecraft.core.world.generate.feature.WorldFeatureFlowers;
import net.minecraft.core.world.generate.feature.WorldFeatureSponge;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import java.util.Random;

@Mixin(value= ChunkDecoratorOverworld.class, remap = false)
public abstract class ChunkDecoratorOverworldMixin {
    @Final
    private World world;

    @Inject(method="decorate",at=@At("TAIL"))
    public void decorate(Chunk chunk, CallbackInfo info) {
        int chunkX = chunk.xPosition;
        int chunkZ = chunk.zPosition;
        int minY = world.getWorldType().getMinY();
        int maxY = world.getWorldType().getMaxY();
        int rangeY = maxY + 1 - minY;
        BlockSand.fallInstantly = true;
        int x = chunkX << 4;
        int z = chunkZ << 4;
        int y = world.getHeightValue(x + 16, z + 16);
        Biome biome = world.getBlockBiome(x + 16, y, z + 16);
        Random rand = new Random(this.world.getRandomSeed());
        long l1 = rand.nextLong() / 2L * 2L + 1L;
        long l2 = rand.nextLong() / 2L * 2L + 1L;
        rand.setSeed((long)chunkX * l1 + (long)chunkZ * l2 ^ this.world.getRandomSeed());
        int blockX, blockY, blockZ;


        if ((biome == Biomes.OVERWORLD_SWAMPLAND ||
                biome == Biomes.OVERWORLD_SWAMPLAND_MUDDY ||
                biome == Biomes.PARADISE_PARADISE ||
                biome == Biomes.OVERWORLD_RETRO ||
                biome == Biomes.OVERWORLD_MEADOW) &&
                rand.nextInt(4) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureFlowers(BonusBlocks.bluebell.id).generate(this.world, rand, blockX, blockY, blockZ);
        }
        if ((biome == Biomes.OVERWORLD_OUTBACK ||
                biome == Biomes.OVERWORLD_OUTBACK_GRASSY ||
                biome == Biomes.OVERWORLD_DESERT ||
                biome == Biomes.PARADISE_PARADISE ||
                biome == Biomes.OVERWORLD_RETRO ||
                biome == Biomes.OVERWORLD_MEADOW) &&
                rand.nextInt(4) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureFlowers(BonusBlocks.orchid.id).generate(this.world, rand, blockX, blockY, blockZ);
        }
        if ((biome == Biomes.OVERWORLD_GRASSLANDS ||
                biome == Biomes.OVERWORLD_PLAINS ||
                biome == Biomes.OVERWORLD_SHRUBLAND ||
                biome == Biomes.PARADISE_PARADISE ||
                biome == Biomes.OVERWORLD_RETRO ||
                biome == Biomes.OVERWORLD_MEADOW) &&
                rand.nextInt(4) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureFlowers(BonusBlocks.heather.id).generate(world, rand, blockX, blockY, blockZ);
        }
        if ((biome == Biomes.OVERWORLD_TAIGA ||
                biome == Biomes.OVERWORLD_TUNDRA ||
                biome == Biomes.OVERWORLD_GLACIER ||
                biome == Biomes.OVERWORLD_BOREAL_FOREST ||
                biome == Biomes.PARADISE_PARADISE ||
                biome == Biomes.OVERWORLD_RETRO ||
                biome == Biomes.OVERWORLD_MEADOW) &&
                rand.nextInt(4) == 0) {
                blockX = x + rand.nextInt(16) + 8;
                blockZ = z + rand.nextInt(16) + 8;
                blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureFlowers(BonusBlocks.whitedandelion.id).generate(world, rand, blockX, blockY, blockZ);
        }
        if ((biome == Biomes.OVERWORLD_FOREST ||
                biome == Biomes.OVERWORLD_RAINFOREST ||
                biome == Biomes.OVERWORLD_SEASONAL_FOREST ||
                biome == Biomes.OVERWORLD_BIRCH_FOREST ||
                biome == Biomes.OVERWORLD_BOREAL_FOREST ||
                biome == Biomes.PARADISE_PARADISE ||
                biome == Biomes.OVERWORLD_RETRO ||
                biome == Biomes.OVERWORLD_MEADOW) &&
                rand.nextInt(4) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureFlowers(BonusBlocks.gladiola.id).generate(world, rand, blockX, blockY, blockZ);
        }
        if ((biome == Biomes.OVERWORLD_FOREST ||
                biome == Biomes.OVERWORLD_RAINFOREST ||
                biome == Biomes.OVERWORLD_TUNDRA ||
                biome == Biomes.OVERWORLD_SEASONAL_FOREST ||
                biome == Biomes.OVERWORLD_GRASSLANDS ||
                biome == Biomes.OVERWORLD_BIRCH_FOREST ||
                biome == Biomes.OVERWORLD_PLAINS ||
                biome == Biomes.OVERWORLD_SHRUBLAND ||
                biome == Biomes.OVERWORLD_BOREAL_FOREST ||
                biome == Biomes.PARADISE_PARADISE ||
                biome == Biomes.OVERWORLD_RETRO ||
                biome == Biomes.OVERWORLD_MEADOW) &&
                rand.nextInt(4) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureFlowers(BonusBlocks.clovers.id).generate(world, rand, blockX, blockY, blockZ);
        }
        if (rand.nextInt(12) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureFlowers(BonusBlocks.mushroomGray.id).generate(world, rand, blockX, blockY, blockZ);
        }
        if (rand.nextInt(32) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureCoral(BonusBlocks.coralred.id).generate(world, rand, blockX, blockY, blockZ);
        }
        if (rand.nextInt(32) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureCoral(BonusBlocks.coralyellow.id).generate(world, rand, blockX, blockY, blockZ);
        }
        if (rand.nextInt(32) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureCoral(BonusBlocks.coralgreen.id).generate(world, rand, blockX, blockY, blockZ);
        }
        if (rand.nextInt(32) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureCoral(BonusBlocks.coralcyan.id).generate(world, rand, blockX, blockY, blockZ);
        }
        if (rand.nextInt(32) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureCoral(BonusBlocks.coralblue.id).generate(world, rand, blockX, blockY, blockZ);
        }
        if (rand.nextInt(32) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureCoral(BonusBlocks.coralpurple.id).generate(world, rand, blockX, blockY, blockZ);
        }
        if (rand.nextInt(32) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureCoral(BonusBlocks.coralpink.id).generate(world, rand, blockX, blockY, blockZ);
        }
    }
}
