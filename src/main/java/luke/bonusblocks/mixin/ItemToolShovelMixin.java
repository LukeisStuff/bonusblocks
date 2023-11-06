package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.tool.ItemToolShovel;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = ItemToolShovel.class, remap = false)
public class ItemToolShovelMixin {
    @Inject(
            method = "onItemUse(Lnet/minecraft/core/item/ItemStack;Lnet/minecraft/core/entity/player/EntityPlayer;Lnet/minecraft/core/world/World;IIILnet/minecraft/core/util/helper/Side;DD)Z",
            at = @At(value = "HEAD"),
            cancellable = true
    )
    public void addNewPathBlock(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced, CallbackInfoReturnable<Boolean> cir){
        int i1 = world.getBlockId(blockX,blockY,blockZ);
        int j1 = world.getBlockId(blockX,blockY + 1,blockZ);
        if (side != Side.BOTTOM && j1 == 0 && (i1 == BonusBlocks.grassOvergrown.id || i1 == BonusBlocks.grassRetroOvergrown.id)) {
            Block pathBlock = BonusBlocks.pathOvergrown;
            world.playBlockSoundEffect((float)blockX + 0.5f, (float)blockY + 0.5f, (float)blockZ + 0.5f, pathBlock, EnumBlockSoundEffectType.PLACE);
            if (!world.isClientSide) {
                world.setBlockWithNotify(blockX, blockY, blockZ, pathBlock.id);
                itemstack.damageItem(1, entityplayer);
            }
            cir.setReturnValue(true);
        }
    }
}
