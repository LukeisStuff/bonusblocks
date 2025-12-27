package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = Item.class, remap = false)
public class ItemMixin {

    @Inject(method = "onUseItemOnBlock", at = @At("HEAD"), cancellable = true)
    private void placeOverlay(ItemStack stack, Player player, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced, CallbackInfoReturnable<Boolean> cir) {
        Item item = stack.getItem();
        Block<?> overlay = null;

        if (item.equals(Items.ORE_RAW_IRON)) {
            overlay = BonusBlocks.OVERLAY_RAW_IRON;
        } else if (item.equals(Items.ORE_RAW_GOLD)) {
            overlay = BonusBlocks.OVERLAY_RAW_GOLD;
        } else if (item.equals(Items.FLINT)) {
            overlay = BonusBlocks.OVERLAY_FLINT;
        }
        if (overlay == null) return;

        cir.setReturnValue(tryPlaceOverlay(stack, player, world, x, y, z, side, xPlaced, yPlaced, overlay));
    }

    @Unique
    private boolean tryPlaceOverlay(ItemStack stack, Player player, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced, Block<?> overlay) {
        if (stack.stackSize <= 0) return false;
        if (y == world.getHeightBlocks() - 1 && overlay.getMaterial().isSolid()) return false;

        int id = world.getBlockId(x, y, z);
        int meta = world.getBlockMetadata(x, y, z);
        int overlayId = overlay.id();

        if (id != overlayId && Blocks.blocksList[id] != null && Blocks.blocksList[id].hasTag(BlockTags.PLACE_OVERWRITES)) {
            id = 0;
            meta = 0;
        }

        if (id == overlayId && side == Side.TOP) {
            if (!world.isBlockOpaqueCube(x, y - 1, z)) return false;
            return tryIncreaseLayer(world, x, y, z, meta, overlay, player, stack);
        }

        if (id != 0) {
            x += side.getOffsetX();
            y += side.getOffsetY();
            z += side.getOffsetZ();
            id = world.getBlockId(x, y, z);
            meta = world.getBlockMetadata(x, y, z);
        }

        if (id == overlayId) {
            return tryIncreaseLayer(world, x, y, z, meta, overlay, player, stack);
        }

        if (!world.canBlockBePlacedAt(overlayId, x, y, z, false, side)) return false;
        if (!world.isBlockOpaqueCube(x, y - 1, z)) return false;

        if (world.setBlockAndMetadataWithNotify(x, y, z, overlayId, 0)) {
            overlay.onBlockPlacedByMob(world, x, y, z, side, player, xPlaced, yPlaced);
            world.playBlockSoundEffect(player, x + 0.5F, y + 0.5F, z + 0.5F, overlay, EnumBlockSoundEffectType.PLACE);
            stack.consumeItem(player);
            player.swingItem();
            return true;
        }

        return false;
    }

    @Unique
    private boolean tryIncreaseLayer(World world, int x, int y, int z, int meta, Block<?> overlay, Player player, ItemStack stack) {
        int newMeta = meta + 1;
        if (newMeta >= 3) return false;

        AABB bb = AABB.getTemporaryBB(x, y, z, x + 1.0F, y + (2 * (newMeta + 1)) / 16.0F, z + 1.0F);

        if (!world.checkIfAABBIsClear(bb)) return false;
        if (!world.isBlockOpaqueCube(x, y - 1, z)) return false;

        world.setBlockAndMetadataWithNotify(x, y, z, overlay.id(), newMeta);
        world.playBlockSoundEffect(player, x + 0.5F, y + 0.5F, z + 0.5F, overlay, EnumBlockSoundEffectType.PLACE);
        stack.consumeItem(player);
        player.swingItem();
        return true;
    }
}
