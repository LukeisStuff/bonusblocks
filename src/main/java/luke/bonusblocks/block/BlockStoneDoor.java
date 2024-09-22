package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.DoorBlock;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.function.Supplier;

public class BlockStoneDoor extends DoorBlock {
    public final boolean isTop;
    public final boolean requireTool;
    public final @Nullable Supplier<Item> droppedItem;

    public BlockStoneDoor(String key, String namespaceId, int id, Material material, boolean isTop, boolean requireTool, @Nullable Supplier<Item> droppedItem) {
        super(key, namespaceId, id, material);
        this.isTop = isTop;
        this.requireTool = requireTool;
        this.droppedItem = droppedItem;
        float f = 0.5F;
        if (isTop) {
            this.setBlockBounds(0.5F - f, -1.0, 0.5F - f, 0.5F + f, 1.0, 0.5F + f);
        } else {
            this.setBlockBounds(0.5F - f, 0.0, 0.5F - f, 0.5F + f, 2.0, 0.5F + f);
        }

    }
    public void onPoweredBlockChange(World world, int x, int y, int z, boolean isPowered) {
        int l = world.getBlockMetadata(x, y, z);
        if ((l & 8) > 0) {
            isPowered = !isPowered;
        }

        if (this.isTop) {
            if (Block.blocksList[world.getBlockId(x, y - 1, z)] instanceof DoorBlock) {
                ((DoorBlock) Objects.requireNonNull(Block.blocksList[world.getBlockId(x, y - 1, z)])).onPoweredBlockChange(world, x, y - 1, z, isPowered);
            }

        } else {
            boolean isOpen = (world.getBlockMetadata(x, y, z) & 4) > 0;
            if (isOpen != isPowered) {
                if (Block.blocksList[world.getBlockId(x, y + 1, z)] instanceof DoorBlock) {
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
            if (!(otherBlock instanceof DoorBlock)) {
                world.setBlockWithNotify(x, y, z, 0);
            }
        } else {
            boolean flag = false;
            Block otherBlock = Block.blocksList[world.getBlockId(x, y + 1, z)];
            if (!(otherBlock instanceof DoorBlock)) {
                world.setBlockWithNotify(x, y, z, 0);
                flag = true;
            }

            if (!world.canPlaceOnSurfaceOfBlock(x, y - 1, z)) {
                this.dropBlockWithCause(world, EnumDropCause.WORLD, x, y, z, world.getBlockMetadata(x, y, z), null, null);
                world.setBlockWithNotify(x, y, z, 0);
                flag = true;
                if (otherBlock instanceof DoorBlock) {
                    world.setBlockWithNotify(x, y + 1, z, 0);
                }
            }

            if (flag) {
                if (!world.isClientSide) {
                }
            } else if (blockId > 0 && Block.blocksList[blockId].isSignalSource()) {
                boolean flag1 = world.hasNeighborSignal(x, y, z) || world.hasNeighborSignal(x, y + 1, z);
                this.onPoweredBlockChange(world, x, y, z, flag1);
            }
        }

    }

}
