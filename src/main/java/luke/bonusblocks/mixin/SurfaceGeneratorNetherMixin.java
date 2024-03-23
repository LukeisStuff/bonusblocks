package luke.bonusblocks.mixin;

import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.ChunkGeneratorResult;
import net.minecraft.core.world.generate.chunk.perlin.nether.SurfaceGeneratorNether;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Random;

@Mixin(value= SurfaceGeneratorNether.class, remap=false)
public abstract class SurfaceGeneratorNetherMixin {
    @Shadow
    @Final
    private World world;
    @Unique
    int topBlock = -1;
    @Unique
    int fillerBlock = -1;

    @Inject(method = "generateSurface", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/world/generate/chunk/ChunkGeneratorResult;setBlock(IIII)V", ordinal = 0, shift = At.Shift.AFTER), locals = LocalCapture.CAPTURE_FAILHARD)
    public void generateSurface(Chunk chunk, ChunkGeneratorResult result, CallbackInfo ci, int oceanY, int minY, int maxY, int chunkX, int chunkZ, int oceanBlock, int worldFillBlock, Random rand, double beachScale, double[] sandBeachNoise, double[] gravelBeachNoise, double[] soilThicknessNoise, int z, int x, boolean generateSandBeach, boolean generateGravelBeach, int soilThickness, int currentLayerDepth, short topBlock, short fillerBlock, int y, int block) {
        Biome biome = chunk.getBlockBiome(x, y, z);
        if (biome != Biomes.NETHER_NETHER) {
            result.setBlock(x, y, z, biome.topBlock);
//            result.setBlock(x, y - 1, z, biome.fillerBlock);
//            result.setBlock(x, y - 2, z, biome.fillerBlock);
        }
    }
}
