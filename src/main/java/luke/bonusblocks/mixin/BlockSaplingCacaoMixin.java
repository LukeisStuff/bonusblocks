package luke.bonusblocks.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.BlockLogicSaplingCacao;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTree;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = BlockLogicSaplingCacao.class, remap = false)
public class BlockSaplingCacaoMixin {

    @WrapOperation(method = "growTree", at = @At(value = "NEW", target = "net/minecraft/core/world/generate/feature/tree/WorldFeatureTree"), remap = false)
    private WorldFeatureTree redirectCacao(int leafId, int logId, int height, Operation<WorldFeatureTree> original) {
        return new WorldFeatureTree(leafId, BonusBlocks.LOG_CACAO.id(), height);
    }
}
