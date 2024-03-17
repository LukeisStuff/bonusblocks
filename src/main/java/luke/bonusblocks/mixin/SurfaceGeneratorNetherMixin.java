package luke.bonusblocks.mixin;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.ChunkGeneratorResult;
import net.minecraft.core.world.generate.chunk.perlin.nether.SurfaceGeneratorNether;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value= SurfaceGeneratorNether.class, remap=false)
public abstract class SurfaceGeneratorNetherMixin {
    @Unique
    boolean generateGravelBeach = false;
    @Unique
    int topBlock = -1;

    @Inject(method = "generateSurface", at = @At(value = "TAIL", target = "Lnet/minecraft/core/world/generate/chunk/perlin/overworld/SurfaceGeneratorOverworld;generateSurface(Lnet/minecraft/core/world/chunk/Chunk;[S)V"), cancellable = true)
    public void generateSurface(Chunk chunk, ChunkGeneratorResult result, CallbackInfo ci) {
        if (generateGravelBeach) {
            topBlock = (short) BonusBlocks.blockSulphur.id;
        }
        ci.cancel();
    }
}
