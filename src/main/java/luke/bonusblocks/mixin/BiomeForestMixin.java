package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.BiomeForest;
import net.minecraft.core.world.biome.BiomeRainforest;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(value= BiomeForest.class,remap=false)
public class BiomeForestMixin {
    @Inject(method = "getRandomWorldGenForTrees", at = @At(value = "HEAD", target = "Lnet/minecraft/core/world/biome/BiomeRainforest;getRandomWorldGenForTrees(Ljava/util/Random;)Lnet/minecraft/core/world/generate/feature/WorldFeature;"), cancellable = true)
    public void getRandomWorldGenForTrees(Random random, CallbackInfoReturnable<WorldFeature> cir) {
        if (random.nextInt(5) == 0) {
            cir.setReturnValue(new WorldFeatureTree(Block.leavesBirch.id, Block.logBirch.id, 5));
        } else if (random.nextInt(20) == 0) {
            cir.setReturnValue(new WorldFeatureTreeCherry(Block.leavesCherry.id, Block.logCherry.id, 4));
        } else if (random.nextInt(3) == 0) {
            cir.setReturnValue(new WorldFeatureTreeFancy(Block.leavesOak.id, Block.logOak.id));
        } else {
            if (random.nextInt(25) == 0) {
                cir.setReturnValue(new WorldFeatureTree(BonusBlocks.leavesOakMossy.id, Block.logOakMossy.id, 4));
            } else {
                cir.setReturnValue(new WorldFeatureTree(Block.leavesOak.id, Block.logOak.id, 4));
            }
            cir.cancel();
        }
    }
}