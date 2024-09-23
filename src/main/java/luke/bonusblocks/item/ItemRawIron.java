package luke.bonusblocks.item;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

public class ItemRawIron extends Item {

    public ItemRawIron(String name, String namespaceId, int id) {
        super(name, namespaceId, id);
        this.maxStackSize = 64;
    }

    @Override
    public boolean onUseItemOnBlock(ItemStack itemstack, Player entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
        int id = world.getBlockId(blockX, blockY, blockZ);
        int meta = world.getBlockMetadata(blockX, blockY, blockZ);
        if (id != BonusBlocks.BLOCK_RAW_IRON.id && Block.blocksList[id] != null && Block.blocksList[id].hasTag(BlockTags.PLACE_OVERWRITES)) {
            id = 0;
            meta = 0;
        }

        if (itemstack.stackSize <= 0) {
            return false;
        } else if (blockY == world.getHeightBlocks() - 1 && BonusBlocks.BLOCK_RAW_IRON.blockMaterial.isSolid()) {
            return false;
        } else {
            int newMeta;
            if (id == BonusBlocks.BLOCK_RAW_IRON.id && side == Side.TOP) {
                newMeta = meta + 1;
                if (!world.isBlockOpaqueCube(blockX, blockY - 1, blockZ)) {
                    return false;
                }

                if (newMeta < 3) {
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.BLOCK_RAW_IRON.id, newMeta);
                    world.playBlockSoundEffect(entityplayer, (float)blockX + 0.5F, (float)blockY + 0.5F, (float)blockZ + 0.5F, BonusBlocks.BLOCK_RAW_IRON, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
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

            if (id == BonusBlocks.BLOCK_RAW_IRON.id) {
                newMeta = meta + 1;
                AABB bbBox = AABB.getTemporaryBB(blockX, blockY, blockZ, (float)blockX + 1.0F, (float)blockY + (float)(2 * (newMeta + 1)) / 16.0F, (float)blockZ + 1.0F);
                if (!world.checkIfAABBIsClear(bbBox) || !world.isBlockOpaqueCube(blockX, blockY - 1, blockZ)) {
                    return false;
                }

                if (newMeta < 3) {
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.BLOCK_RAW_IRON.id, newMeta);
                    world.playBlockSoundEffect(entityplayer, (float)blockX + 0.5F, (float)blockY + 0.5F, (float)blockZ + 0.5F, BonusBlocks.BLOCK_RAW_IRON, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
                    return true;
                }
            }

            if (world.canBlockBePlacedAt(BonusBlocks.BLOCK_RAW_IRON.id, blockX, blockY, blockZ, false, side) && world.isBlockOpaqueCube(blockX, blockY - 1, blockZ) && world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.BLOCK_RAW_IRON.id, 0)) {
                BonusBlocks.BLOCK_RAW_IRON.onBlockPlacedByMob(world, blockX, blockY, blockZ, side, entityplayer, yPlaced);
                world.playBlockSoundEffect(entityplayer, (float)blockX + 0.5F, (float)blockY + 0.5F, (float)blockZ + 0.5F, BonusBlocks.BLOCK_RAW_IRON, EnumBlockSoundEffectType.PLACE);
                itemstack.consumeItem(entityplayer);
                return true;
            } else {
                return false;
            }
        }
    }
}
