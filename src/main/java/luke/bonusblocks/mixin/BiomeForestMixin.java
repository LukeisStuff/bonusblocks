package luke.bonusblocks.mixin;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.biome.BiomeForest;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTree;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeFancy;
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
            cir.setReturnValue(new WorldFeatureTree(Blocks.LEAVES_BIRCH.id, Blocks.LOG_BIRCH.id, 5));
        }
        if (random.nextInt(3) == 0) {
            cir.setReturnValue(new WorldFeatureTreeFancy(Blocks.LEAVES_OAK.id, Blocks.LOG_OAK.id));
        }
        if (random.nextInt(25) == 0) {
            cir.setReturnValue(new WorldFeatureTree(Blocks.LEAVES_OAK.id, Blocks.LOG_OAK_MOSSY.id, 4));
        }
        cir.setReturnValue(new WorldFeatureTree(Blocks.LEAVES_OAK.id, Blocks.LOG_OAK.id, 4));
        cir.cancel();
    }

    }