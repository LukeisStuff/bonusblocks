package luke.bonusblocks.item;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

public class ItemNugget extends Item {
    public ItemNugget(String name, String namespaceId, int id) {
        super(name, namespaceId, id);
        this.maxStackSize = 64;
    }

    public boolean onUseItemOnBlock(ItemStack itemstack, Player player, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
        int id = world.getBlockId(blockX, blockY, blockZ);
        int meta = world.getBlockMetadata(blockX, blockY, blockZ);
        if (id != BonusBlocks.OVERLAY_RAW_VERDIGRIS.id() && Blocks.blocksList[id] != null && Blocks.blocksList[id].hasTag(BlockTags.PLACE_OVERWRITES)) {
            id = 0;
            meta = 0;
        }

        if (itemstack.stackSize <= 0) {
            return false;
        } else if (blockY == world.getHeightBlocks() - 1 && BonusBlocks.OVERLAY_RAW_VERDIGRIS.getMaterial().isSolid()) {
            return false;
        } else {
            int newMeta;
            if (id == BonusBlocks.OVERLAY_RAW_VERDIGRIS.id() && side == Side.TOP) {
                newMeta = meta + 1;
                if (!world.isBlockOpaqueCube(blockX, blockY - 1, blockZ)) {
                    return false;
                }

                if (newMeta < 3) {
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.OVERLAY_RAW_VERDIGRIS.id(), newMeta);
                    world.playBlockSoundEffect(player, (float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, BonusBlocks.OVERLAY_RAW_VERDIGRIS, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(player);
                    return true;
                }
            }

            if (id != 0) {
                blockX += side.getOffsetX();
                blockY += side.getOffsetY();
                blockZ += side.getOffsetZ();
                id = world.getBlockId(blockX, blockY, blockZ);
                meta = world.getBlockMetadata(blockX, blockY, blockZ);
            }

            if (id == BonusBlocks.OVERLAY_RAW_VERDIGRIS.id()) {
                newMeta = meta + 1;
                AABB bbBox = AABB.getTemporaryBB(blockX, blockY, blockZ, (float) blockX + 1.0F, (float) blockY + (float) (2 * (newMeta + 1)) / 16.0F, (float) blockZ + 1.0F);
                if (!world.checkIfAABBIsClear(bbBox) || !world.isBlockOpaqueCube(blockX, blockY - 1, blockZ)) {
                    return false;
                }

                if (newMeta < 3) {
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.OVERLAY_RAW_VERDIGRIS.id(), newMeta);
                    world.playBlockSoundEffect(player, (float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, BonusBlocks.OVERLAY_RAW_VERDIGRIS, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(player);
                    return true;
                }
            }

            if (world.canBlockBePlacedAt(BonusBlocks.OVERLAY_RAW_VERDIGRIS.id(), blockX, blockY, blockZ, false, side) && world.isBlockOpaqueCube(blockX, blockY - 1, blockZ) && world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.OVERLAY_RAW_VERDIGRIS.id(), 0)) {
                BonusBlocks.OVERLAY_RAW_VERDIGRIS.onBlockPlacedByMob(world, blockX, blockY, blockZ, side, player, xPlaced, yPlaced);
                world.playBlockSoundEffect(player, (float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, BonusBlocks.OVERLAY_RAW_VERDIGRIS, EnumBlockSoundEffectType.PLACE);
                itemstack.consumeItem(player);
                return true;
            } else {
                return false;
            }
        }
    }

}
