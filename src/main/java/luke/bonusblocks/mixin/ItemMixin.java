package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
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
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = Item.class, remap = false)
public class ItemMixin {
    @Inject(
        method = "onUseItemOnBlock",
        at = @At("HEAD"),
        cancellable = true
    )
    private void dropStack(ItemStack itemstack, Player player, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced, CallbackInfoReturnable<Boolean> cir) {
        if (itemstack.getItem().equals(Items.ORE_RAW_IRON)) {

            int id = world.getBlockId(blockX, blockY, blockZ);
            int meta = world.getBlockMetadata(blockX, blockY, blockZ);
            if (id != BonusBlocks.OVERLAY_RAW_IRON.id() && Blocks.blocksList[id] != null && Blocks.blocksList[id].hasTag(BlockTags.PLACE_OVERWRITES)) {
                id = 0;
                meta = 0;
            }

            if (itemstack.stackSize <= 0) {
                cir.setReturnValue(false);
            } else if (blockY == world.getHeightBlocks() - 1 && BonusBlocks.OVERLAY_RAW_IRON.getMaterial().isSolid()) {
                cir.setReturnValue(false);
            } else {
                int newMeta;
                if (id == BonusBlocks.OVERLAY_RAW_IRON.id() && side == Side.TOP) {
                    newMeta = meta + 1;
                    if (!world.isBlockOpaqueCube(blockX, blockY - 1, blockZ)) {
                        cir.setReturnValue(false);
                    }

                    if (newMeta < 3) {
                        world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.OVERLAY_RAW_IRON.id(), newMeta);
                        world.playBlockSoundEffect(player, blockX + 0.5F, blockY + 0.5F, blockZ + 0.5F, BonusBlocks.OVERLAY_RAW_IRON, EnumBlockSoundEffectType.PLACE);
                        itemstack.consumeItem(player);
                        player.swingItem();
                        cir.setReturnValue(true);
                    }
                }

                if (id != 0) {
                    blockX += side.getOffsetX();
                    blockY += side.getOffsetY();
                    blockZ += side.getOffsetZ();
                    id = world.getBlockId(blockX, blockY, blockZ);
                    meta = world.getBlockMetadata(blockX, blockY, blockZ);
                }

                if (id == BonusBlocks.OVERLAY_RAW_IRON.id()) {
                    newMeta = meta + 1;
                    AABB bbBox = AABB.getTemporaryBB(blockX, blockY, blockZ, blockX + 1.0F, blockY + (2 * (newMeta + 1)) / 16.0F, blockZ + 1.0F);
                    if (!world.checkIfAABBIsClear(bbBox) || !world.isBlockOpaqueCube(blockX, blockY - 1, blockZ)) {
                        cir.setReturnValue(false);
                    }

                    if (newMeta < 3) {
                        world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.OVERLAY_RAW_IRON.id(), newMeta);
                        world.playBlockSoundEffect(player, blockX + 0.5F, blockY + 0.5F, blockZ + 0.5F, BonusBlocks.OVERLAY_RAW_IRON, EnumBlockSoundEffectType.PLACE);
                        itemstack.consumeItem(player);
                        player.swingItem();
                        cir.setReturnValue(true);
                    }
                }

                if (world.canBlockBePlacedAt(BonusBlocks.OVERLAY_RAW_IRON.id(), blockX, blockY, blockZ, false, side) && world.isBlockOpaqueCube(blockX, blockY - 1, blockZ) && world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.OVERLAY_RAW_IRON.id(), 0)) {
                    BonusBlocks.OVERLAY_RAW_IRON.onBlockPlacedByMob(world, blockX, blockY, blockZ, side, player, xPlaced, yPlaced);
                    world.playBlockSoundEffect(player, blockX + 0.5F, blockY + 0.5F, blockZ + 0.5F, BonusBlocks.OVERLAY_RAW_IRON, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(player);
                    player.swingItem();
                    cir.setReturnValue(true);
                } else {
                    cir.setReturnValue(false);
                }
            }
        }
        if (itemstack.getItem().equals(Items.ORE_RAW_GOLD)) {

            int id = world.getBlockId(blockX, blockY, blockZ);
            int meta = world.getBlockMetadata(blockX, blockY, blockZ);
            if (id != BonusBlocks.OVERLAY_RAW_GOLD.id() && Blocks.blocksList[id] != null && Blocks.blocksList[id].hasTag(BlockTags.PLACE_OVERWRITES)) {
                id = 0;
                meta = 0;
            }

            if (itemstack.stackSize <= 0) {
                cir.setReturnValue(false);
            } else if (blockY == world.getHeightBlocks() - 1 && BonusBlocks.OVERLAY_RAW_GOLD.getMaterial().isSolid()) {
                cir.setReturnValue(false);
            } else {
                int newMeta;
                if (id == BonusBlocks.OVERLAY_RAW_GOLD.id() && side == Side.TOP) {
                    newMeta = meta + 1;
                    if (!world.isBlockOpaqueCube(blockX, blockY - 1, blockZ)) {
                        cir.setReturnValue(false);
                    }

                    if (newMeta < 3) {
                        world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.OVERLAY_RAW_GOLD.id(), newMeta);
                        world.playBlockSoundEffect(player, blockX + 0.5F, blockY + 0.5F, blockZ + 0.5F, BonusBlocks.OVERLAY_RAW_GOLD, EnumBlockSoundEffectType.PLACE);
                        itemstack.consumeItem(player);
                        player.swingItem();
                        cir.setReturnValue(true);
                    }
                }

                if (id != 0) {
                    blockX += side.getOffsetX();
                    blockY += side.getOffsetY();
                    blockZ += side.getOffsetZ();
                    id = world.getBlockId(blockX, blockY, blockZ);
                    meta = world.getBlockMetadata(blockX, blockY, blockZ);
                }

                if (id == BonusBlocks.OVERLAY_RAW_GOLD.id()) {
                    newMeta = meta + 1;
                    AABB bbBox = AABB.getTemporaryBB(blockX, blockY, blockZ, blockX + 1.0F, blockY + (2 * (newMeta + 1)) / 16.0F, blockZ + 1.0F);
                    if (!world.checkIfAABBIsClear(bbBox) || !world.isBlockOpaqueCube(blockX, blockY - 1, blockZ)) {
                        cir.setReturnValue(false);
                    }

                    if (newMeta < 3) {
                        world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.OVERLAY_RAW_GOLD.id(), newMeta);
                        world.playBlockSoundEffect(player, blockX + 0.5F, blockY + 0.5F, blockZ + 0.5F, BonusBlocks.OVERLAY_RAW_GOLD, EnumBlockSoundEffectType.PLACE);
                        itemstack.consumeItem(player);
                        player.swingItem();
                        cir.setReturnValue(true);
                    }
                }

                if (world.canBlockBePlacedAt(BonusBlocks.OVERLAY_RAW_GOLD.id(), blockX, blockY, blockZ, false, side) && world.isBlockOpaqueCube(blockX, blockY - 1, blockZ) && world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.OVERLAY_RAW_GOLD.id(), 0)) {
                    BonusBlocks.OVERLAY_RAW_GOLD.onBlockPlacedByMob(world, blockX, blockY, blockZ, side, player, xPlaced, yPlaced);
                    world.playBlockSoundEffect(player, blockX + 0.5F, blockY + 0.5F, blockZ + 0.5F, BonusBlocks.OVERLAY_RAW_GOLD, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(player);
                    player.swingItem();
                    cir.setReturnValue(true);
                } else {
                    cir.setReturnValue(false);
                }
            }
        }
        if (itemstack.getItem().equals(Items.FLINT)) {

            int id = world.getBlockId(blockX, blockY, blockZ);
            int meta = world.getBlockMetadata(blockX, blockY, blockZ);
            if (id != BonusBlocks.OVERLAY_FLINT.id() && Blocks.blocksList[id] != null && Blocks.blocksList[id].hasTag(BlockTags.PLACE_OVERWRITES)) {
                id = 0;
                meta = 0;
            }

            if (itemstack.stackSize <= 0) {
                cir.setReturnValue(false);
            } else if (blockY == world.getHeightBlocks() - 1 && BonusBlocks.OVERLAY_FLINT.getMaterial().isSolid()) {
                cir.setReturnValue(false);
            } else {
                int newMeta;
                if (id == BonusBlocks.OVERLAY_FLINT.id() && side == Side.TOP) {
                    newMeta = meta + 1;
                    if (!world.isBlockOpaqueCube(blockX, blockY - 1, blockZ)) {
                        cir.setReturnValue(false);
                    }

                    if (newMeta < 3) {
                        world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.OVERLAY_FLINT.id(), newMeta);
                        world.playBlockSoundEffect(player, blockX + 0.5F, blockY + 0.5F, blockZ + 0.5F, BonusBlocks.OVERLAY_FLINT, EnumBlockSoundEffectType.PLACE);
                        itemstack.consumeItem(player);
                        player.swingItem();
                        cir.setReturnValue(true);
                    }
                }

                if (id != 0) {
                    blockX += side.getOffsetX();
                    blockY += side.getOffsetY();
                    blockZ += side.getOffsetZ();
                    id = world.getBlockId(blockX, blockY, blockZ);
                    meta = world.getBlockMetadata(blockX, blockY, blockZ);
                }

                if (id == BonusBlocks.OVERLAY_FLINT.id()) {
                    newMeta = meta + 1;
                    AABB bbBox = AABB.getTemporaryBB(blockX, blockY, blockZ, blockX + 1.0F, blockY + (2 * (newMeta + 1)) / 16.0F, blockZ + 1.0F);
                    if (!world.checkIfAABBIsClear(bbBox) || !world.isBlockOpaqueCube(blockX, blockY - 1, blockZ)) {
                        cir.setReturnValue(false);
                    }

                    if (newMeta < 3) {
                        world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.OVERLAY_FLINT.id(), newMeta);
                        world.playBlockSoundEffect(player, blockX + 0.5F, blockY + 0.5F, blockZ + 0.5F, BonusBlocks.OVERLAY_FLINT, EnumBlockSoundEffectType.PLACE);
                        itemstack.consumeItem(player);
                        player.swingItem();
                        cir.setReturnValue(true);
                    }
                }

                if (world.canBlockBePlacedAt(BonusBlocks.OVERLAY_FLINT.id(), blockX, blockY, blockZ, false, side) && world.isBlockOpaqueCube(blockX, blockY - 1, blockZ) && world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.OVERLAY_FLINT.id(), 0)) {
                    BonusBlocks.OVERLAY_FLINT.onBlockPlacedByMob(world, blockX, blockY, blockZ, side, player, xPlaced, yPlaced);
                    world.playBlockSoundEffect(player, blockX + 0.5F, blockY + 0.5F, blockZ + 0.5F, BonusBlocks.OVERLAY_FLINT, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(player);
                    player.swingItem();
                    cir.setReturnValue(true);
                } else {
                    cir.setReturnValue(false);
                }
            }
        }
    }
}
