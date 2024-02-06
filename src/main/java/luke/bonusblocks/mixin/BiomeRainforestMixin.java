package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.BiomeRainforest;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTree;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeFancyRainforest;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(value= BiomeRainforest.class,remap=false)
public class BiomeRainforestMixin {
    @Inject(method = "getRandomWorldGenForTrees", at = @At(value = "HEAD", target = "Lnet/minecraft/core/world/biome/BiomeRainforest;getRandomWorldGenForTrees(Ljava/util/Random;)Lnet/minecraft/core/world/generate/feature/WorldFeature;"), cancellable = true)
    public void getRandomWorldGenForTrees(Random random, CallbackInfoReturnable<WorldFeature> cir) {
        if (random.nextInt(3) == 0) {
            if (random.nextInt(10) == 0) {
                cir.setReturnValue(new WorldFeatureTreeFancyRainforest(BonusBlocks.leavesOakMossy.id, Block.logOakMossy.id, 0));
            } else {
                cir.setReturnValue(new WorldFeatureTreeFancyRainforest(Block.leavesOak.id, Block.logOak.id, 0));
            }
        } else if (random.nextInt(5) == 0) {
            cir.setReturnValue(new WorldFeatureTreeShrub(Block.leavesShrub.id, BonusBlocks.logShrub.id));
        } else {
            if (random.nextInt(10) == 0) {
                cir.setReturnValue(new WorldFeatureTree(Block.leavesCacao.id, BonusBlocks.logCacao.id, 4));
            } else {
                cir.setReturnValue(new WorldFeatureTree(Block.leavesOak.id, Block.logOak.id, 6));
            }
            cir.cancel();
        }
    }
}
