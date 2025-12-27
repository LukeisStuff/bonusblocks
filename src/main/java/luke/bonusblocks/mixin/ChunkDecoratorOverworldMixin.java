package luke.bonusblocks.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import luke.bonusblocks.BonusBiomes;
import luke.bonusblocks.BonusBlocks;
import luke.bonusblocks.world.WorldFeaturePebbles;
import luke.bonusblocks.world.WorldFeatureRichDirt;
import luke.bonusblocks.world.WorldFeatureRichGravel;
import luke.bonusblocks.world.WorldFeatureRichSand;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.*;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.perlin.overworld.ChunkDecoratorOverworld;
import net.minecraft.core.world.generate.feature.WorldFeatureFlowers;
import net.minecraft.core.world.generate.feature.WorldFeatureOre;
import net.minecraft.core.world.generate.feature.WorldFeatureTallGrass;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(value = ChunkDecoratorOverworld.class, remap = false)
public class ChunkDecoratorOverworldMixin {

    @Shadow
    @Final
    private World world;

    @Inject(method = "decorate", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 104))
    public void decorate(Chunk chunk, CallbackInfo ci, @Local(name = "rand") Random rand, @Local(name = "x") int x, @Local(name = "z") int z, @Local(name = "y") int y) {

        Biome biome = world.getBlockBiome(x + 16, y, z + 16);
        int minY = this.world.getWorldType().getMinY();
        int maxY = this.world.getWorldType().getMaxY();
        int rangeY = maxY + 1 - minY;
        float oreHeightModifier = rangeY / 128.0F;

        if ((biome == Biomes.OVERWORLD_FOREST || biome == Biomes.OVERWORLD_BIRCH_FOREST || biome == Biomes.OVERWORLD_SEASONAL_FOREST || biome == Biomes.OVERWORLD_PLAINS ||
            biome == BonusBiomes.OVERWORLD_OVERGROWN_MEADOW || biome == Biomes.OVERWORLD_MEADOW || biome == Biomes.OVERWORLD_SHRUBLAND || biome == Biomes.OVERWORLD_GRASSLANDS) && (rand.nextInt(8) == 0)) {
            int xf = x + rand.nextInt(16) + 8;
            int zf = z + rand.nextInt(16) + 8;
            int yf = this.world.getHeightValue(x, z);
            new WorldFeatureFlowers(BonusBlocks.FLOWER_CYAN.id(), 64, true).place(world, rand, xf, yf, zf);
        }

        if ((biome == Biomes.OVERWORLD_OUTBACK || biome == Biomes.OVERWORLD_OUTBACK_GRASSY || biome == Biomes.OVERWORLD_SWAMPLAND_MUDDY || biome == Biomes.OVERWORLD_SWAMPLAND ||
            biome == Biomes.OVERWORLD_RAINFOREST || biome == Biomes.OVERWORLD_CAATINGA || biome == Biomes.OVERWORLD_CAATINGA_PLAINS || biome == BonusBiomes.OVERWORLD_OVERGROWN_MEADOW) && (rand.nextInt(8) == 0)) {
            int xf = x + rand.nextInt(16) + 8;
            int zf = z + rand.nextInt(16) + 8;
            int yf = this.world.getHeightValue(x, z);
            new WorldFeatureFlowers(BonusBlocks.FLOWER_MAGENTA.id(), 64, true).place(world, rand, xf, yf, zf);
        }

        if ((biome == Biomes.OVERWORLD_TUNDRA || biome == Biomes.OVERWORLD_TAIGA || biome == Biomes.OVERWORLD_GLACIER || biome == Biomes.OVERWORLD_BOREAL_FOREST || biome == BonusBiomes.OVERWORLD_OVERGROWN_MEADOW) && (rand.nextInt(8) == 0)) {
            int xf = x + rand.nextInt(16) + 8;
            int zf = z + rand.nextInt(16) + 8;
            int yf = this.world.getHeightValue(x, z);
            new WorldFeatureFlowers(BonusBlocks.FLOWER_SILVER.id(), 64, true).place(world, rand, xf, yf, zf);
        }


        for (int j4 = 0; j4 < oreHeightModifier; ++j4) {
            int k7 = x + rand.nextInt(16);
            int k4 = minY + rand.nextInt(rangeY / 2);
            int treeDensity = z + rand.nextInt(16);
            (new WorldFeatureOre(BonusBlocks.MOSS.id(), 32)).place(this.world, rand, k7, k4, treeDensity);
        }

        if (rand.nextInt(6) == 0) {
            int k16 = x + rand.nextInt(16) + 8;
            int oceanY = minY + rand.nextInt(rangeY);
            int dx = z + rand.nextInt(16) + 8;
            (new WorldFeatureFlowers(BonusBlocks.MUSHROOM_GRAY.id(), 64, false)).place(this.world, rand, k16, oceanY, dx);
        }

        if (biome instanceof BiomeForest || biome == Biomes.OVERWORLD_FOREST) {
            int j4 = x + rand.nextInt(16);
            int k7 = z + rand.nextInt(16);
            int k4 = this.world.getHeightValue(j4, k7);
            (new WorldFeatureRichDirt(10)).place(this.world, rand, j4, k4, k7);
        }

        if (biome instanceof BiomeDesert || biome == Biomes.OVERWORLD_DESERT) {
            int j4 = x + rand.nextInt(16);
            int k7 = z + rand.nextInt(16);
            int k4 = this.world.getHeightValue(j4, k7);
            (new WorldFeatureRichSand(10)).place(this.world, rand, j4, k4, k7);
        }

        if (biome instanceof BiomeShrubland || biome == Biomes.OVERWORLD_SHRUBLAND) {
            int j4 = x + rand.nextInt(16);
            int k7 = z + rand.nextInt(16);
            int k4 = this.world.getHeightValue(j4, k7);
            (new WorldFeatureRichGravel(10)).place(this.world, rand, j4, k4, k7);
        }


        if (biome == BonusBiomes.OVERWORLD_OVERGROWN_MEADOW && (rand.nextInt(8) == 0)) {
            int xf = x + rand.nextInt(16) + 8;
            int zf = z + rand.nextInt(16) + 8;
            int yf = this.world.getHeightValue(x, z);
            new WorldFeatureTallGrass(Blocks.TALLGRASS.id()).place(world, rand, xf, yf, zf);
            new WorldFeatureTallGrass(Blocks.TALLGRASS_FERN.id()).place(world, rand, xf, yf, zf);
            new WorldFeatureFlowers(Blocks.FLOWER_RED.id(), 64, true).place(world, rand, xf, yf, zf);
            new WorldFeatureFlowers(Blocks.FLOWER_YELLOW.id(), 64, true).place(world, rand, xf, yf, zf);
            new WorldFeatureFlowers(Blocks.FLOWER_ORANGE.id(), 64, true).place(world, rand, xf, yf, zf);
            new WorldFeatureFlowers(Blocks.FLOWER_PINK.id(), 64, true).place(world, rand, xf, yf, zf);
            new WorldFeatureFlowers(Blocks.FLOWER_PURPLE.id(), 64, true).place(world, rand, xf, yf, zf);
            new WorldFeatureFlowers(Blocks.FLOWER_LIGHT_BLUE.id(), 64, true).place(world, rand, xf, yf, zf);
        }


        if ((rand.nextInt(8) == 0)) {
            int xf = x + rand.nextInt(16) + 8;
            int zf = z + rand.nextInt(16) + 8;
            int yf = this.world.getHeightValue(x, z);
            new WorldFeatureFlowers(BonusBlocks.FLOWER_LIME.id(), 128, true).place(world, rand, xf, yf, zf);
        }

        if ((rand.nextInt(8) == 0)) {
            int xf = x + rand.nextInt(16) + 8;
            int zf = z + rand.nextInt(16) + 8;
            int yf = this.world.getHeightValue(x, z);
            new WorldFeaturePebbles(Blocks.OVERLAY_PEBBLES.id()).place(world, rand, xf, yf, zf);
        }
    }
}
