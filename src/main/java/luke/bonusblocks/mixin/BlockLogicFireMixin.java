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
    public void injectVerdigrisBurnResult(World world, int x, int y, int z, CallbackInfoReturnable<Integer> cir) {
        int blockId = world.getBlockId(x, y, z);
        int meta = world.getBlockMetadata(x, y, z);
        Block<?> burntBlock = null;

        if (blockId == BonusBlocks.BLOCK_VERDIGRIS.id() || blockId == BonusBlocks.BRICK_VERDIGRIS.id()) {
            burntBlock = BlockLogicVerdigris.getBurntBlock(Blocks.blocksList[blockId]);

        } else if (blockId == BonusBlocks.STAIRS_BRICK_VERDIGRIS.id()) {
            burntBlock = BonusBlocks.STAIRS_BRICK_VERDIGRIS_SHINE;

        } else if (blockId == BonusBlocks.SLAB_BRICK_VERDIGRIS.id()) {
            burntBlock = BonusBlocks.SLAB_BRICK_VERDIGRIS_SHINE;

        } else if (blockId == BonusBlocks.FENCE_VERDIGRIS.id()) {
            burntBlock = BonusBlocks.FENCE_VERDIGRIS_SHINE;

        } else if (blockId == BonusBlocks.TRAPDOOR_VERDIGRIS.id()) {
            burntBlock = BonusBlocks.TRAPDOOR_VERDIGRIS_SHINE;
        }

        if (burntBlock != null) {
            cir.setReturnValue(burntBlock.id());
            world.setBlockAndMetadataWithNotify(x, y, z, burntBlock.id(), meta);
        }
    }
}
