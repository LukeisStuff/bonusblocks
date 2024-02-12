package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.inventory.ContainerPlayerCreative;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(value= ContainerPlayerCreative.class, remap=false)
public abstract class ContainerPlayerCreativeMixin {
    @Shadow
    public static List<ItemStack> creativeItems;
    @Shadow
    public static int creativeItemsCount;

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void inject(CallbackInfo ci) {

        creativeItems.add(new ItemStack(Block.blocksList[Block.capstoneMarble.id]));
        creativeItemsCount++;
        creativeItems.add(new ItemStack(Block.blocksList[Block.stoneCarved.id]));
        creativeItemsCount++;
        creativeItems.add(new ItemStack(Block.blocksList[Block.graniteCarved.id]));
        creativeItemsCount++;
        creativeItems.add(new ItemStack(Block.blocksList[Block.limestoneCarved.id]));
        creativeItemsCount++;
        creativeItems.add(new ItemStack(Block.blocksList[Block.basaltCarved.id]));
        creativeItemsCount++;

        for (int metadata = 0b0000; metadata < 0b10000; metadata += 0b0001) {
            creativeItems.add(new ItemStack(Block.blocksList[BonusBlocks.boxPainted.id], 1, metadata));
            creativeItemsCount++;
        }

        for (int metadata2 = 0b0000; metadata2 < 0b100000000; metadata2 += 0b00010000) {
            creativeItems.add(new ItemStack(Block.blocksList[BonusBlocks.slabWool.id], 1, metadata2));
            creativeItemsCount++;
        }

        for (int metadata3 = 0b0000; metadata3 < 0b100000000; metadata3 += 0b00010000) {
            creativeItems.add(new ItemStack(Block.blocksList[BonusBlocks.stairsWool.id], 1, metadata3));
            creativeItemsCount++;
        }
    }
}
