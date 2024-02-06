package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.BiomeShrubland;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(value= BiomeShrubland.class,remap=false)
public class BiomeShrublandMixin {
    @Inject(method = "getRandomWorldGenForTrees", at = @At(value = "TAIL", target = "Lnet/minecraft/core/world/biome/BiomeShrubland;getRandomWorldGenForTrees(Ljava/util/Random;)Lnet/minecraft/core/world/generate/feature/WorldFeature;"), cancellable = true)
    public void getRandomWorldGenForTrees(Random random, CallbackInfoReturnable<WorldFeature> cir) {
        {
            cir.setReturnValue(new WorldFeatureTreeShrub(Block.leavesShrub.id, BonusBlocks.logShrub.id));
        }
        cir.cancel();
    }
}
