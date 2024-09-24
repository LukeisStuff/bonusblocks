package luke.bonusblocks.item;

import net.minecraft.core.block.BedBlock;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class SilverBedItem extends Item {
    public SilverBedItem(String name, String namespaceId, int id) {
        super(name, namespaceId, id);
    }

    public boolean onUseItemOnBlock(ItemStack itemstack, Player entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
        if (!world.canPlaceInsideBlock(blockX, blockY, blockZ)) {
            blockX += side.getOffsetX();
            blockY += side.getOffsetY();
            blockZ += side.getOffsetZ();
        }

        BedBlock blockbed = (BedBlock) Blocks.BED;
        int i1 = entityplayer.getHorizontalPlacementDirection((Side)null).getOpposite().getHorizontalIndex();
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

        if (world.isAirBlock(blockX, blockY, blockZ) && world.isAirBlock(blockX + byte0, blockY, blockZ + byte1) && world.canPlaceOnSurfaceOfBlock(blockX, blockY - 1, blockZ) && world.canPlaceOnSurfaceOfBlock(blockX + byte0, blockY - 1, blockZ + byte1) && world.canBlockBePlacedAt(blockbed.id, blockX, blockY, blockZ, false, side) && itemstack.consumeItem(entityplayer)) {
            world.playBlockSoundEffect(entityplayer, (double)((float)blockX + 0.5F), (double)((float)blockY + 0.5F), (double)((float)blockZ + 0.5F), blockbed, EnumBlockSoundEffectType.PLACE);
            world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, blockbed.id, i1);
            world.setBlockAndMetadataWithNotify(blockX + byte0, blockY, blockZ + byte1, blockbed.id, i1 + 8);
            return true;
        } else {
            return false;
        }
    }
}