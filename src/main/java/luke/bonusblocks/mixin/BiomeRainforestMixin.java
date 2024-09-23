package luke.bonusblocks.mixin;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.biome.BiomeRainforest;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTree;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeFancyRainforest;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreePalm;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;
import net.minecraft.core.world.generate.feature.tree.spooner.WorldFeatureSpoonerTreeRound;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(value= BiomeRainforest.class,remap=false)
public class BiomeRainforestMixin {
    @Inject(method = "getRandomWorldGenForTrees", at = @At(value = "HEAD", target = "Lnet/minecraft/core/world/biome/BiomeRainforest;getRandomWorldGenForTrees(Ljava/util/Random;)Lnet/minecraft/core/world/generate/feature/WorldFeature;"), cancellable = true)
    public void getRandomWorldGenForTrees(Random random, CallbackInfoReturnable<WorldFeature> cir) {
        if (random.nextInt(1000) == 0) {
            int treeHeight = 30 + random.nextInt(30);
            cir.setReturnValue(new WorldFeatureSpoonerTreeRound(treeHeight, Blocks.LOG_OAK.id, 0, Blocks.LEAVES_OAK.id, 0));
        }
        if (random.nextInt(10) == 0) {
            cir.setReturnValue(new WorldFeatureTreePalm(Blocks.LOG_PALM, Blocks.LEAVES_PALM, true, false, true));
        }
        if (random.nextInt(3) == 0) {
            if (random.nextInt(10) == 0) {
                cir.setReturnValue(new WorldFeatureTreeFancyRainforest(BonusBlocks.LEAVES_OAK_MOSSY.id, Blocks.LOG_OAK_MOSSY.id, 0));
            }
            cir.setReturnValue(new WorldFeatureTreeFancyRainforest(Blocks.LEAVES_OAK.id, Blocks.LOG_OAK.id, 0));
        }
        if (random.nextInt(5) == 0) {
            cir.setReturnValue(new WorldFeatureTreeShrub(Blocks.LEAVES_SHRUB.id, BonusBlocks.LOG_SHRUB.id));
        }
        if (random.nextInt(10) == 0) {
            cir.setReturnValue(new WorldFeatureTree(Blocks.LEAVES_CACAO.id, BonusBlocks.LOG_CACAO.id, 4));
        }
        cir.setReturnValue(new WorldFeatureTree(Blocks.LEAVES_OAK.id, Blocks.LOG_OAK.id, 6));
    }
}
