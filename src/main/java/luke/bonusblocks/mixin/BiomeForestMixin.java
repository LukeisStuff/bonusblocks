package luke.bonusblocks.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.biome.BiomeForest;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTree;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = BiomeForest.class, remap = false)
public class BiomeForestMixin {

	@WrapOperation(
		method = "getRandomWorldGenForTrees",
		at = @At(value = "NEW", target = "(III)Lnet/minecraft/core/world/generate/feature/tree/WorldFeatureTree;"), remap = false)
	private WorldFeatureTree replaceMossyLeaves(int leafId, int logId, int height, Operation<WorldFeatureTree> original) {
		if (logId == Blocks.LOG_OAK_MOSSY.id()) {
			return new WorldFeatureTree(BonusBlocks.LEAVES_OAK_MOSSY.id(), logId, height);
		}
		return original.call(leafId, logId, height);
	}
}
