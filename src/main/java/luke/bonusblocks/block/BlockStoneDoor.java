package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockDoor;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.world.World;

public class BlockStoneDoor extends BlockDoor {

    public BlockStoneDoor(String key, int id, Material material, boolean isTop) {
        super(key, id, material, isTop);
    }

    public void onPoweredBlockChange(World world, int x, int y, int z, boolean isPowered) {
        int l = world.getBlockMetadata(x, y, z);
        if ((l & 8) > 0) {
            isPowered = !isPowered;
        }

        if (this.isTop) {
            if (Block.blocksList[world.getBlockId(x, y - 1, z)] instanceof BlockDoor) {
                ((BlockDoor)Block.blocksList[world.getBlockId(x, y - 1, z)]).onPoweredBlockChange(world, x, y - 1, z, isPowered);
            }

        } else {
            boolean isOpen = (world.getBlockMetadata(x, y, z) & 4) > 0;
            if (isOpen != isPowered) {
                if (Block.blocksList[world.getBlockId(x, y + 1, z)] instanceof BlockDoor) {
                    world.setBlockMetadataWithNotify(x, y + 1, z, l ^ 4);
                }

                world.setBlockMetadataWithNotify(x, y, z, l ^ 4);
                world.markBlocksDirty(x, y - 1, z, x, y, z);
                world.playSoundEffect(null, 1003, x, y, z, 0);
            }
        }
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
        world.getBlockMetadata(x, y, z);
        if (this.isTop) {
            Block otherBlock = Block.blocksList[world.getBlockId(x, y - 1, z)];
            if (!(otherBlock instanceof BlockDoor)) {
                world.setBlockWithNotify(x, y, z, 0);
            }

        } else {
            Block otherBlock = Block.blocksList[world.getBlockId(x, y + 1, z)];
            if (!(otherBlock instanceof BlockDoor)) {
                world.setBlockWithNotify(x, y, z, 0);
            }

            if (!world.canPlaceOnSurfaceOfBlock(x, y - 1, z)) {
                this.dropBlockWithCause(world, EnumDropCause.WORLD, x, y, z, world.getBlockMetadata(x, y, z), null);
                world.setBlockWithNotify(x, y, z, 0);
                if (otherBlock instanceof BlockDoor) {
                    world.setBlockWithNotify(x, y + 1, z, 0);
                }
            }
        }

    }

}
