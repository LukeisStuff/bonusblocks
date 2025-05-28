package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.BlockLogicWireRedstone;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.WorldSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value= BlockLogicWireRedstone.class,remap=false)
public class BlockLogicWireRedstoneMixin {
    @Inject(method = "shouldConnectTo", at = @At(value = "TAIL", target = "Lnet/minecraft/core/block/BlockLogicWireRedstone;shouldConnectTo(Lnet/minecraft/core/world/WorldSource;IIII)Z"), cancellable = true)
    private static void shouldConnectTo(WorldSource worldSource, int x, int y, int z, int data, CallbackInfoReturnable<Boolean> cir) {
        int blockId = worldSource.getBlockId(x, y, z);
        if (blockId == BonusBlocks.SKULL_REDSTONE.id()) {
            if (data >= 0 && data <= 3) {
                Side[] lookup = new Side[]{Side.NORTH, Side.EAST, Side.SOUTH, Side.WEST};
                Side side = Side.getSideById(worldSource.getBlockMetadata(x, y, z));
                cir.setReturnValue(side == lookup[data]);
            }
        }
        cir.setReturnValue(false);
    }
}
