package luke.bonusblocks.item;

import luke.bonusblocks.block.BonusBlocks;
import luke.bonusblocks.block.silver.BlockSilverBed;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class ItemSilverBed extends Item {
    public ItemSilverBed(String name, int id) {
        super(name, id);
    }

    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
        if (!world.canPlaceInsideBlock(blockX, blockY, blockZ)) {
            blockX += side.getOffsetX();
            blockY += side.getOffsetY();
            blockZ += side.getOffsetZ();
        }

        BlockSilverBed blockbed = (BlockSilverBed) BonusBlocks.bedSilver;
        int i1 = entityplayer.getHorizontalPlacementDirection(null).getOpposite().getHorizontalIndex();
        byte byte0 = 0;
        byte byte1 = 0;
        if (i1 == 0) {
            byte1 = 1;
        }

        if (i1 == 1) {
            byte0 = -1;
        }

        if (i1 == 2) {
            byte1 = -1;
        }

        if (i1 == 3) {
            byte0 = 1;
        }

        if (world.isAirBlock(blockX, blockY, blockZ) && world.isAirBlock(blockX + byte0, blockY, blockZ + byte1) && world.canPlaceOnSurfaceOfBlock(blockX, blockY - 1, blockZ) && world.canPlaceOnSurfaceOfBlock(blockX + byte0, blockY - 1, blockZ + byte1) && itemstack.consumeItem(entityplayer)) {
            world.playBlockSoundEffect((Entity)null, (float)blockX + 0.5F, (float)blockY + 0.5F, (float)blockZ + 0.5F, blockbed, EnumBlockSoundEffectType.PLACE);
            world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, blockbed.id, i1);
            world.setBlockAndMetadataWithNotify(blockX + byte0, blockY, blockZ + byte1, blockbed.id, i1 + 8);
            return true;
        } else {
            return false;
        }
    }

}