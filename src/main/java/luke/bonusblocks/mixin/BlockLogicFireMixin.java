package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import luke.bonusblocks.block.BlockLogicVerdigris;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicFire;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = BlockLogicFire.class, remap = false)
public abstract class BlockLogicFireMixin {
    @Inject(method = "getBurnResultId(Lnet/minecraft/core/world/World;III)I", at = @At("TAIL"), cancellable = true)
    private void injectVerdigrisBurnResult(World world, int x, int y, int z, CallbackInfoReturnable<Integer> cir) {
        int blockId = world.getBlockId(x, y, z);
        if (blockId == BonusBlocks.BLOCK_VERDIGRIS.id() || blockId == BonusBlocks.BRICK_VERDIGRIS.id()) {
            Block<?> burntBlock = BlockLogicVerdigris.getBurntBlock(Blocks.blocksList[blockId]);
            if (burntBlock != null) {
                cir.setReturnValue(burntBlock.id());
            }
        }
    }
}
