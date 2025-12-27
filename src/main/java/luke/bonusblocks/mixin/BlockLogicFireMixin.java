package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import luke.bonusblocks.block.BlockLogicVerdigris;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicFire;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = BlockLogicFire.class, remap = false)
public abstract class BlockLogicFireMixin {

    @Inject(method = "setBurnResult(Lnet/minecraft/core/world/World;III)V", at = @At("HEAD"), cancellable = true)
    public void injectVerdigrisBurnResult(World world, int x, int y, int z, CallbackInfo ci) {
        int blockId = world.getBlockId(x, y, z);
        int meta = world.getBlockMetadata(x, y, z);
        Block<?> burntBlock = getBurntBlock(blockId);

        if (burntBlock != null) {
            if (blockId == BonusBlocks.DOOR_VERDIGRIS_TOP.id() || blockId == BonusBlocks.DOOR_VERDIGRIS_BOTTOM.id()) {
                int otherY = blockId == BonusBlocks.DOOR_VERDIGRIS_TOP.id() ? y - 1 : y + 1;
                int otherBlockId = world.getBlockId(x, otherY, z);
                Block<?> otherBurntBlock = null;

                if (blockId == BonusBlocks.DOOR_VERDIGRIS_TOP.id() && otherBlockId == BonusBlocks.DOOR_VERDIGRIS_BOTTOM.id()) {
                    otherBurntBlock = BonusBlocks.DOOR_VERDIGRIS_SHINE_BOTTOM;
                } else if (blockId == BonusBlocks.DOOR_VERDIGRIS_BOTTOM.id() && otherBlockId == BonusBlocks.DOOR_VERDIGRIS_TOP.id()) {
                    otherBurntBlock = BonusBlocks.DOOR_VERDIGRIS_SHINE_TOP;
                }

                if (otherBurntBlock != null) {
                    world.setBlockRaw(x, otherY, z, otherBurntBlock.id());
                    world.setBlockMetadata(x, otherY, z, meta);
                }

                world.setBlockRaw(x, y, z, burntBlock.id());
                world.setBlockMetadata(x, y, z, meta);

                if (otherBurntBlock != null) {
                    world.notifyBlockChange(x, otherY, z, otherBurntBlock.id());
                }
                world.notifyBlockChange(x, y, z, burntBlock.id());

                ci.cancel();
            } else {
                world.setBlockAndMetadataWithNotify(x, y, z, burntBlock.id(), meta);
                ci.cancel();
            }
        }
    }

    @Inject(method = "getBurnResultId(Lnet/minecraft/core/world/World;III)I", at = @At("HEAD"), cancellable = true)
    public void injectVerdigrisBurnResultId(World world, int x, int y, int z, CallbackInfoReturnable<Integer> cir) {
        int blockId = world.getBlockId(x, y, z);
        Block<?> burntBlock = getBurntBlock(blockId);

        if (burntBlock != null) {
            cir.setReturnValue(burntBlock.id());
        }
    }

    @Unique
    private Block<?> getBurntBlock(int blockId) {
        if (blockId == BonusBlocks.BLOCK_VERDIGRIS.id() || blockId == BonusBlocks.BRICK_VERDIGRIS.id()) {
            return BlockLogicVerdigris.getBurntBlock(Blocks.blocksList[blockId]);
        } else if (blockId == BonusBlocks.MESH_VERDIGRIS.id()) {
            return BonusBlocks.MESH_VERDIGRIS_SHINE;
        } else if (blockId == BonusBlocks.STAIRS_BRICK_VERDIGRIS.id()) {
            return BonusBlocks.STAIRS_BRICK_VERDIGRIS_SHINE;
        } else if (blockId == BonusBlocks.SLAB_BRICK_VERDIGRIS.id()) {
            return BonusBlocks.SLAB_BRICK_VERDIGRIS_SHINE;
        } else if (blockId == BonusBlocks.FENCE_VERDIGRIS.id()) {
            return BonusBlocks.FENCE_VERDIGRIS_SHINE;
        } else if (blockId == BonusBlocks.TRAPDOOR_VERDIGRIS.id()) {
            return BonusBlocks.TRAPDOOR_VERDIGRIS_SHINE;
        } else if (blockId == BonusBlocks.DOOR_VERDIGRIS_TOP.id()) {
            return BonusBlocks.DOOR_VERDIGRIS_SHINE_TOP;
        } else if (blockId == BonusBlocks.DOOR_VERDIGRIS_BOTTOM.id()) {
            return BonusBlocks.DOOR_VERDIGRIS_SHINE_BOTTOM;
        }
        return null;
    }
}
