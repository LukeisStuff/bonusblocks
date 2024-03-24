package luke.bonusblocks.mixin;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.ChunkGeneratorResult;
import net.minecraft.core.world.generate.chunk.perlin.overworld.SurfaceGeneratorOverworld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(value= SurfaceGeneratorOverworld.class, remap=false)
public abstract class SurfaceGeneratorOverworldMixin {
    @Unique
    int currentLayerDepth = -1;
    @Unique
    int fillerBlock = -1;

    @Inject(method = "generateSurface", at = @At(value = "TAIL", target = "Lnet/minecraft/core/world/generate/chunk/perlin/overworld/SurfaceGeneratorOverworld;generateSurface(Lnet/minecraft/core/world/chunk/Chunk;[S)V"), cancellable = true)
    public void generateSurface(Chunk chunk, ChunkGeneratorResult result, CallbackInfo ci) {

        int chunkX = chunk.xPosition;
        int chunkZ = chunk.zPosition;
        Random rand = new Random((long) chunkX * 341873128712L + (long) chunkZ * 132897987541L);
        Biome biome = new Biome("biome.");

        if (currentLayerDepth == 0) {
            if (biome == (Biomes.OVERWORLD_OUTBACK) && fillerBlock == Block.dirtScorched.id) {
                currentLayerDepth = rand.nextInt(8) + 2;
                fillerBlock = (short) BonusBlocks.scorchedstone.id;
            } else if (biome == (Biomes.OVERWORLD_OUTBACK_GRASSY) && fillerBlock == Block.dirtScorched.id) {
                currentLayerDepth = rand.nextInt(8) + 2;
                fillerBlock = (short) BonusBlocks.scorchedstone.id;
            }
            ci.cancel();
        }
    }
}
