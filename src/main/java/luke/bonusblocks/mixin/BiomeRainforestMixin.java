package luke.bonusblocks.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.biome.BiomeRainforest;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTree;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeFancyRainforest;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(BiomeRainforest.class)
public class BiomeRainforestMixin {

	@WrapOperation(method = "getRandomWorldGenForTrees", at = @At(value = "NEW", target = "net/minecraft/core/world/generate/feature/tree/WorldFeatureTreeFancyRainforest"), remap = false)
	private WorldFeatureTreeFancyRainforest mossyFancy(int leafId, int logId, int unused, Operation<WorldFeatureTreeFancyRainforest> original) {
		if (logId == Blocks.LOG_OAK_MOSSY.id()) {
			return new WorldFeatureTreeFancyRainforest(BonusBlocks.LEAVES_OAK_MOSSY.id(), logId, 0);
		}
		return original.call(leafId, logId, unused);
	}

	@WrapOperation(method = "getRandomWorldGenForTrees", at = @At(value = "NEW", target = "net/minecraft/core/world/generate/feature/tree/WorldFeatureTreeShrub"), remap = false)
	private WorldFeatureTreeShrub shrubTree(int leafId, int logId, Operation<WorldFeatureTreeShrub> original) {
		if (leafId == Blocks.LEAVES_SHRUB.id()) {
			return new WorldFeatureTreeShrub(leafId, BonusBlocks.LOG_SHRUB.id());
		}
		return original.call(leafId, logId);
	}

	@WrapOperation(method = "getRandomWorldGenForTrees", at = @At(value = "NEW", target = "net/minecraft/core/world/generate/feature/tree/WorldFeatureTree"), remap = false)
	private WorldFeatureTree cacaoTree(int leafId, int logId, int height, Operation<WorldFeatureTree> original) {
		if (logId == Blocks.LOG_OAK_MOSSY.id()) {
			return new WorldFeatureTree(leafId, BonusBlocks.LOG_CACAO.id(), height);
		}
		return original.call(leafId, logId, height);
	}
}
