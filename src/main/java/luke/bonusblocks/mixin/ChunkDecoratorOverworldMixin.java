package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocksMod;
import luke.bonusblocks.biomes.ModBiomes;
import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockSand;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.perlin.overworld.ChunkDecoratorOverworld;
import net.minecraft.core.world.generate.feature.WorldFeatureFlowers;
import net.minecraft.core.world.generate.feature.WorldFeatureTallGrass;
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

    @Inject(method = "decorate", at = @At("TAIL"))
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
        rand.setSeed((long) chunkX * l1 + (long) chunkZ * l2 ^ this.world.getRandomSeed());
        int blockX, blockY, blockZ;
        int k4;
        int treeDensity;
        int i11;
        int l14;
        int i14;
        int k16;
        int oceanY;
        Random swampRand = new Random((long)chunkX * l1 + (long)chunkZ * l2 ^ this.world.getRandomSeed());
        if (biome == ModBiomes.OVERWORLD_WETLAND) {
            for (int dx = 0; dx < 16; ++dx) {
                for (k4 = 0; k4 < 16; ++k4) {
                    treeDensity = this.world.getHeightValue(x + dx, z + k4);
                    i11 = this.world.getBlockId(x + dx, treeDensity - 1, z + k4);
                    if (i11 == Block.blockClay.id) {
                        boolean shouldPlaceWater = swampRand.nextFloat() < 0.5F;
                        if (shouldPlaceWater) {
                            l14 = this.world.getBlockId(x + dx + 1, treeDensity - 1, z + k4);
                            i14 = this.world.getBlockId(x + dx - 1, treeDensity - 1, z + k4);
                            k16 = this.world.getBlockId(x + dx, treeDensity - 1, z + k4 + 1);
                            oceanY = this.world.getBlockId(x + dx, treeDensity - 1, z + k4 - 1);
                            dx = this.world.getBlockId(x + dx, treeDensity - 2, z + k4);
                            if (l14 != 0 && (Block.blocksList[l14].blockMaterial.isSolid() || Block.blocksList[l14].blockMaterial == Material.water) && i14 != 0 && (Block.blocksList[i14].blockMaterial.isSolid() || Block.blocksList[i14].blockMaterial == Material.water) && k16 != 0 && (Block.blocksList[k16].blockMaterial.isSolid() || Block.blocksList[k16].blockMaterial == Material.water) && oceanY != 0 && (Block.blocksList[oceanY].blockMaterial.isSolid() || Block.blocksList[oceanY].blockMaterial == Material.water) && dx != 0 && Block.blocksList[dx].blockMaterial.isSolid()) {
                                this.world.setBlock(x + dx, treeDensity - 1, z + k4, Block.fluidWaterStill.id);
                                this.world.setBlock(x + dx, treeDensity, z + k4, 0);
                            }
                        }
                    }
                }
            }
        }

        if ((biome == ModBiomes.OVERWORLD_OVERGROWN_MEADOW) &&
                rand.nextInt(4) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureTallGrass(Block.tallgrass.id).generate(this.world, rand, blockX, blockY, blockZ);
        }
        if ((biome == ModBiomes.OVERWORLD_OVERGROWN_MEADOW) &&
                rand.nextInt(4) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureTallGrass(Block.tallgrassFern.id).generate(this.world, rand, blockX, blockY, blockZ);
        }
        if ((biome == ModBiomes.OVERWORLD_OUTBACK_MESA) &&
                rand.nextInt(4) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureFlowers(Block.deadbush.id).generate(this.world, rand, blockX, blockY, blockZ);
        }
        if ((biome == ModBiomes.OVERWORLD_OUTBACK_MESA) &&
                rand.nextInt(4) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureFlowers(Block.spinifex.id).generate(this.world, rand, blockX, blockY, blockZ);
        }
        if ((biome == Biomes.OVERWORLD_SWAMPLAND ||
                biome == Biomes.OVERWORLD_SWAMPLAND_MUDDY ||
                biome == Biomes.PARADISE_PARADISE ||
                biome == Biomes.OVERWORLD_RETRO ||
                biome == ModBiomes.OVERWORLD_OVERGROWN_MEADOW ||
                biome == Biomes.OVERWORLD_MEADOW) &&
                rand.nextInt(4) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureFlowers(BonusBlocks.flowerCyan.id).generate(this.world, rand, blockX, blockY, blockZ);
        }
        if ((biome == Biomes.OVERWORLD_OUTBACK ||
                biome == Biomes.OVERWORLD_OUTBACK_GRASSY ||
                biome == ModBiomes.OVERWORLD_OUTBACK_MESA ||
                biome == Biomes.OVERWORLD_DESERT ||
                biome == Biomes.PARADISE_PARADISE ||
                biome == Biomes.OVERWORLD_RETRO ||
                biome == ModBiomes.OVERWORLD_OVERGROWN_MEADOW ||
                biome == Biomes.OVERWORLD_MEADOW) &&
                rand.nextInt(4) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureFlowers(BonusBlocks.flowerPink.id).generate(this.world, rand, blockX, blockY, blockZ);
        }
        if ((biome == Biomes.OVERWORLD_GRASSLANDS ||
                biome == Biomes.OVERWORLD_PLAINS ||
                biome == Biomes.OVERWORLD_SHRUBLAND ||
                biome == Biomes.PARADISE_PARADISE ||
                biome == Biomes.OVERWORLD_RETRO ||
                biome == ModBiomes.OVERWORLD_OVERGROWN_MEADOW ||
                biome == Biomes.OVERWORLD_MEADOW) &&
                rand.nextInt(4) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureFlowers(BonusBlocks.flowerPurple.id).generate(world, rand, blockX, blockY, blockZ);
        }
        if ((biome == Biomes.OVERWORLD_TAIGA ||
                biome == Biomes.OVERWORLD_TUNDRA ||
                biome == Biomes.OVERWORLD_GLACIER ||
                biome == Biomes.OVERWORLD_BOREAL_FOREST ||
                biome == ModBiomes.OVERWORLD_OVERGROWN_MEADOW ||
                biome == Biomes.PARADISE_PARADISE ||
                biome == Biomes.OVERWORLD_RETRO ||
                biome == Biomes.OVERWORLD_MEADOW) &&
                rand.nextInt(4) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureFlowers(BonusBlocks.flowerSilver.id).generate(world, rand, blockX, blockY, blockZ);
        }
        if ((biome == Biomes.OVERWORLD_FOREST ||
                biome == Biomes.OVERWORLD_RAINFOREST ||
                biome == Biomes.OVERWORLD_SEASONAL_FOREST ||
                biome == Biomes.OVERWORLD_BIRCH_FOREST ||
                biome == Biomes.OVERWORLD_BOREAL_FOREST ||
                biome == Biomes.PARADISE_PARADISE ||
                biome == ModBiomes.OVERWORLD_OVERGROWN_MEADOW ||
                biome == Biomes.OVERWORLD_RETRO ||
                biome == Biomes.OVERWORLD_MEADOW) &&
                rand.nextInt(4) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureFlowers(BonusBlocks.flowerOrange.id).generate(world, rand, blockX, blockY, blockZ);
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
                biome == ModBiomes.OVERWORLD_OVERGROWN_MEADOW ||
                biome == Biomes.PARADISE_PARADISE ||
                biome == Biomes.OVERWORLD_RETRO ||
                biome == Biomes.OVERWORLD_MEADOW) &&
                rand.nextInt(4) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = world.getHeightValue(blockX, blockZ);
            new WorldFeatureFlowers(BonusBlocks.flowerLime.id).generate(world, rand, blockX, blockY, blockZ);
        }
        if (rand.nextInt(2) == 0) {
            blockX = x + rand.nextInt(16) + 8;
            blockZ = z + rand.nextInt(16) + 8;
            blockY = minY + rand.nextInt(rangeY);
            new WorldFeatureFlowers(BonusBlocks.mushroomGray.id).generate(world, rand, blockX, blockY, blockZ);
        }
    }
}