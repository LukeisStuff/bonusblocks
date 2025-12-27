package luke.bonusblocks.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = World.class, remap = false)
public class WorldSkullRedstoneMixin {

    @WrapOperation(
        method = "getSignal(IIILnet/minecraft/core/util/helper/Side;)Z",
        at = @At(value = "INVOKE", target = "Lnet/minecraft/core/world/World;isBlockNormalCube(III)Z"))
    private boolean wrapIsBlockNormalCubeForRedstone(World world, int x, int y, int z, Operation<Boolean> original) {
        if (Boolean.FALSE.equals(original.call(world, x, y, z))) return false;

        Block<?> block = world.getBlock(x, y, z);
        return block != BonusBlocks.SKULL_REDSTONE;
    }
}
