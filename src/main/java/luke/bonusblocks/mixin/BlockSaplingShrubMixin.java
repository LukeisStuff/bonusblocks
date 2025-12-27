package luke.bonusblocks.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.BlockLogicSaplingShrub;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = BlockLogicSaplingShrub.class, remap = false)
public class BlockSaplingShrubMixin {

    @WrapOperation(method = "growTree", at = @At(value = "NEW", target = "net/minecraft/core/world/generate/feature/tree/WorldFeatureTreeShrub"), remap = false)
    private WorldFeatureTreeShrub redirectShrub(int leafId, int logId, Operation<WorldFeatureTreeShrub> original) {
        return new WorldFeatureTreeShrub(leafId, BonusBlocks.LOG_SHRUB.id());
    }
}
