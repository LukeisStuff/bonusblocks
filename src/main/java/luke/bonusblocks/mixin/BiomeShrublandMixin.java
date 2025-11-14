package luke.bonusblocks.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.biome.BiomeShrubland;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = BiomeShrubland.class, remap = false)
public class BiomeShrublandMixin {

	@WrapOperation(
		method = "getRandomWorldGenForTrees",
		at = @At(value = "NEW", target = "(II)Lnet/minecraft/core/world/generate/feature/tree/WorldFeatureTreeShrub;"), remap = false)
	private WorldFeatureTreeShrub replaceShrubLog(int leafId, int logId, Operation<WorldFeatureTreeShrub> original) {
		if (leafId == Blocks.LEAVES_SHRUB.id()) {
			return new WorldFeatureTreeShrub(leafId, BonusBlocks.LOG_SHRUB.id());
		}
		return original.call(leafId, logId);
	}
}
