package luke.bonusblocks.mixin;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.DeadBushBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value= DeadBushBlock.class,remap=false)
public class BlockDeadBushMixin {

    @Inject(method = "canThisPlantGrowOnThisBlockID", at = @At(value = "TAIL", target = "Lnet/minecraft/core/block/BlockDeadBush;canThisPlantGrowOnThisBlockID(I)Z"), cancellable = true)

    public void generate(int i, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(i == Blocks.SAND.id || i == Blocks.DIRT_SCORCHED.id || i == Blocks.DIRT.id || i == Blocks.GRASS.id || i == Blocks.GRASS_RETRO.id || i == Blocks.SANDSTONE.id || i == Blocks.DIRT_SCORCHED_RICH.id ||
                i == Blocks.GRASS_SCORCHED.id || i == BonusBlocks.SCORCHEDSTONE.id || i == BonusBlocks.GRASS_SCORCHED_OVERGROWN.id || i == BonusBlocks.GRASS_OVERGROWN.id || i == BonusBlocks.GRASS_RETRO_OVERGROWN.id);
    }
}