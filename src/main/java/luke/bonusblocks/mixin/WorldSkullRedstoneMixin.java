package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = World.class, remap = false)
public class WorldSkullRedstoneMixin {

    @Redirect(method = "getSignal(IIILnet/minecraft/core/util/helper/Side;)Z", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/world/World;isBlockNormalCube(III)Z"))
    public boolean redirectGetSignal(World world, int x, int y, int z) {
        Block<?> block = world.getBlock(x, y, z);
        return world.isBlockNormalCube(x, y, z) && block != Blocks.BLOCK_REDSTONE && block != Blocks.PUMPKIN_REDSTONE && block != BonusBlocks.SKULL_REDSTONE;
    }
}
