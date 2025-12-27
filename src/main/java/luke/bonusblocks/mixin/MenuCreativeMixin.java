package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.inventory.container.ContainerInventory;
import net.minecraft.core.player.inventory.menu.MenuInventory;
import net.minecraft.core.player.inventory.menu.MenuInventoryCreative;
import net.minecraft.core.util.helper.DyeColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;

import static net.minecraft.core.player.inventory.menu.MenuInventoryCreative.creativeItems;
import static net.minecraft.core.player.inventory.menu.MenuInventoryCreative.creativeItemsCount;

@Mixin(value = MenuInventoryCreative.class, remap = false)
public class MenuCreativeMixin extends MenuInventory {

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void injected(CallbackInfo ci) {
        List<ItemStack> newCreativeItems = new ArrayList<>();

        for (ItemStack item : creativeItems) {

            if (item.getMetadata() == 0
                && (item.itemID == BonusBlocks.SLAB_WOOL.id()
                || item.itemID == BonusBlocks.STAIRS_WOOL.id()
            )
            ) {
                for (DyeColor dyeColor : DyeColor.blockOrderedColors()) {
                    newCreativeItems.add(new ItemStack(item.itemID, 1, dyeColor.blockMeta << 4));
                }
            } else {
                newCreativeItems.add(item);
                if (item.itemID == BonusBlocks.MARBLE_CARVED.id()) {
                    newCreativeItems.add(new ItemStack(Blocks.STONE_CARVED));
                    newCreativeItems.add(new ItemStack(Blocks.BASALT_CARVED));
                    newCreativeItems.add(new ItemStack(Blocks.GRANITE_CARVED));
                    newCreativeItems.add(new ItemStack(Blocks.LIMESTONE_CARVED));
                    newCreativeItems.add(new ItemStack(Blocks.PERMAFROST_CARVED));
                    newCreativeItems.add(new ItemStack(Blocks.NETHERRACK_CARVED));
                }
            }
        }

        creativeItems = newCreativeItems;
        creativeItemsCount = creativeItems.size();
    }

    public MenuCreativeMixin(ContainerInventory inventory) {
        super(inventory);
    }
}
