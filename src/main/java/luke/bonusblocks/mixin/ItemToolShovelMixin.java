package luke.bonusblocks.mixin;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.tool.ShovelToolItem;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = ShovelToolItem.class, remap = false)
public class ItemToolShovelMixin {
    @Inject(method = "onUseItemOnBlock", at = @At(value = "HEAD"), cancellable = true)
    public void addNewPathBlock(ItemStack itemstack, Player entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced, CallbackInfoReturnable<Boolean> cir){
        int i1 = world.getBlockId(blockX,blockY,blockZ);
        int j1 = world.getBlockId(blockX,blockY + 1,blockZ);
        if (side != Side.BOTTOM && j1 == 0 && (i1 == BonusBlocks.overgrownGrass.id || i1 == BonusBlocks.overgrownGrassRetro.id)) {
            Block pathBlock = BonusBlocks.overgrownPath;
            world.playBlockSoundEffect(null, (float)blockX + 0.5f, (float)blockY + 0.5f, (float)blockZ + 0.5f, pathBlock, EnumBlockSoundEffectType.PLACE);
            if (!world.isClientSide) {
                world.setBlockWithNotify(blockX, blockY, blockZ, pathBlock.id);
                itemstack.damageItem(1, entityplayer);
            }
            cir.setReturnValue(true);
        }
    }
}
