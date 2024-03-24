package luke.bonusblocks.item;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

public class ItemRawGold extends Item {

    public ItemRawGold(String name, int id) {
        super(name, id);
        this.maxStackSize = 64;
    }

    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
        int newMeta;
        int id = world.getBlockId(blockX, blockY, blockZ);
        int meta = world.getBlockMetadata(blockX, blockY, blockZ);

        if (id != BonusBlocks.overlayRawGold.id && Block.blocksList[id] != null && Block.blocksList[id].hasTag(BlockTags.PLACE_OVERWRITES)) {
            id = 0;
            meta = 0;
        }
        if (itemstack.stackSize <= 0) {
            return false;
        }
        if (blockY == world.getHeightBlocks() - 1 && BonusBlocks.overlayRawGold.blockMaterial.isSolid()) {
            return false;
        }
        if (id == BonusBlocks.overlayRawGold.id && side == Side.TOP) {
            newMeta = meta + 1;
            if (!world.isBlockOpaqueCube(blockX, blockY - 1, blockZ)) {
                return false;
            }
            if (newMeta < 3) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.overlayRawGold.id, newMeta);
                world.playBlockSoundEffect((Entity)null, (float)blockX + 0.5f, (float)blockY + 0.5f, (float)blockZ + 0.5f, BonusBlocks.overlayRawGold, EnumBlockSoundEffectType.PLACE);
                itemstack.consumeItem(entityplayer);
                return true;
            }
        }
        if (id != 0) {
            id = world.getBlockId(blockX += side.getOffsetX(), blockY += side.getOffsetY(), blockZ += side.getOffsetZ());
            meta = world.getBlockMetadata(blockX, blockY, blockZ);
        }
        if (id == BonusBlocks.overlayRawGold.id) {
            newMeta = meta + 1;
            AABB bbBox = AABB.getBoundingBoxFromPool(blockX, blockY, blockZ, (float)blockX + 1.0f, (float)blockY + (float)(2 * (newMeta + 1)) / 16.0f, (float)blockZ + 1.0f);
            if (!world.checkIfAABBIsClear(bbBox) || !world.isBlockOpaqueCube(blockX, blockY - 1, blockZ)) {
                return false;
            }
            if (newMeta < 3) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.overlayRawGold.id, newMeta);
                world.playBlockSoundEffect((Entity)null, (float)blockX + 0.5f, (float)blockY + 0.5f, (float)blockZ + 0.5f, BonusBlocks.overlayRawGold, EnumBlockSoundEffectType.PLACE);
                itemstack.consumeItem(entityplayer);
                return true;
            }
        }
        if (world.canBlockBePlacedAt(BonusBlocks.overlayRawGold.id, blockX, blockY, blockZ, false, side) && world.isBlockOpaqueCube(blockX, blockY - 1, blockZ)) {
            if (world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, BonusBlocks.overlayRawGold.id, this.getPlacedBlockMetadata(itemstack.getMetadata()))) {
                BonusBlocks.overlayRawGold.onBlockPlaced(world, blockX, blockY, blockZ, side, entityplayer, yPlaced);
                world.playBlockSoundEffect((Entity)null, (float)blockX + 0.5f, (float)blockY + 0.5f, (float)blockZ + 0.5f, BonusBlocks.overlayRawGold, EnumBlockSoundEffectType.PLACE);
                itemstack.consumeItem(entityplayer);
            }
            return true;
        }
        return false;
    }
}
