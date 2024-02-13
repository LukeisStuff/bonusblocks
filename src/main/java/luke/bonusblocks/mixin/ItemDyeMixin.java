package luke.bonusblocks.mixin;

import luke.bonusblocks.biomes.WorldFeatureBonemealFlower;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockFlower;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemDye;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = ItemDye.class, remap = false, priority = 999)
public abstract class ItemDyeMixin extends Item {
    public ItemDyeMixin(String name, int id) {
        super(name, id);
    }

    @Inject(method = "onItemUse(Lnet/minecraft/core/item/ItemStack;Lnet/minecraft/core/entity/player/EntityPlayer;Lnet/minecraft/core/world/World;IIILnet/minecraft/core/util/helper/Side;DD)Z",
            at = @At(value = "TAIL", shift = At.Shift.BEFORE), cancellable = true)
    private void growMoreFlowers(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced, CallbackInfoReturnable<Boolean> cir){
        if (itemstack.getMetadata() == 15) {
            int id = world.getBlockId(blockX, blockY, blockZ);
            if (Block.blocksList[id] instanceof BlockFlower) {
                if (!world.isClientSide) {
                    new WorldFeatureBonemealFlower(id, 7).generate(world, itemRand, blockX, blockY, blockZ);
                    itemstack.consumeItem(entityplayer);
                }
                cir.setReturnValue(true);
            }
        }
    }
}
