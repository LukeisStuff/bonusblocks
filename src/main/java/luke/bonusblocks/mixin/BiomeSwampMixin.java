package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.BiomeSwamp;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShapeSwamp;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(value= BiomeSwamp.class,remap=false)
public class BiomeSwampMixin {
    @Inject(method = "getRandomWorldGenForTrees", at = @At(value = "HEAD", target = "Lnet/minecraft/core/world/biome/BiomeRainforest;getRandomWorldGenForTrees(Ljava/util/Random;)Lnet/minecraft/core/world/generate/feature/WorldFeature;"), cancellable = true)
    public void getRandomWorldGenForTrees(Random random, CallbackInfoReturnable<WorldFeature> cir) {
        {
            cir.setReturnValue(new WorldFeatureTreeShapeSwamp(BonusBlocks.leavesOakMossy.id, Block.logOakMossy.id, 6));
        }
        cir.cancel();
    }
}
