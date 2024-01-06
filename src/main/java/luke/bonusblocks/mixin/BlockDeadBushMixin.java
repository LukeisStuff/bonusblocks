package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockDeadBush;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value= BlockDeadBush.class,remap=false)
public class BlockDeadBushMixin {

    @Inject(method = "canThisPlantGrowOnThisBlockID", at = @At(value = "TAIL", target = "Lnet/minecraft/core/block/BlockDeadBush;canThisPlantGrowOnThisBlockID(I)Z"), cancellable = true)

    public void generate(int i, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(i == Block.sand.id || i == Block.dirtScorched.id || i == Block.dirtScorchedRich.id || i == Block.dirt.id || i == Block.grass.id || i == Block.grassRetro.id || i == Block.sandstone.id || i == Block.dirtScorchedRich.id || i == Block.grassScorched.id || i == BonusBlocks.scorchedstone.id || i == BonusBlocks.grassScorchedOvergrown.id || i == BonusBlocks.grassOvergrown.id || i == BonusBlocks.grassRetroOvergrown.id);
    }
}