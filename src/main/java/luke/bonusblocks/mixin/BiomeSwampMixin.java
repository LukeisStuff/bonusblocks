package luke.bonusblocks.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.biome.BiomeSwamp;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShapeSwamp;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = BiomeSwamp.class, remap = false)
public class BiomeSwampMixin {

    @WrapOperation(
        method = "getRandomWorldGenForTrees",
        at = @At(value = "NEW", target = "(III)Lnet/minecraft/core/world/generate/feature/tree/WorldFeatureTreeShapeSwamp;"), remap = false)
    private WorldFeatureTreeShapeSwamp replaceMossyLeaves(int leafId, int logId, int height, Operation<WorldFeatureTreeShapeSwamp> original) {
        if (logId == Blocks.LOG_OAK_MOSSY.id()) {
            return new WorldFeatureTreeShapeSwamp(BonusBlocks.LEAVES_OAK_MOSSY.id(), logId, height);
        }
        return original.call(leafId, logId, height);
    }
}
