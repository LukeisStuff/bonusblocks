package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicDoor;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class BlockLogicDoorStone extends BlockLogicDoor {
    public final boolean isTop;
    public final boolean requireTool;
    public final @Nullable Supplier<Item> droppedItem;
    public BlockLogicDoorStone(Block<?> block, boolean isTop, @Nullable Supplier<Item> droppedItem, Material material) {
        super(block, material, isTop, true, droppedItem);
        this.isTop = isTop;
        this.requireTool = true;
        this.droppedItem = droppedItem;
        float f = 0.5F;
        if (isTop) {
            this.setBlockBounds(0.5F - f, -1.0, 0.5F - f, 0.5F + f, 1.0, 0.5F + f);
        } else {
            this.setBlockBounds(0.5F - f, 0.0, 0.5F - f, 0.5F + f, 2.0, 0.5F + f);
        }
    }

    public void onPoweredBlockChange(World world, int x, int y, int z, boolean isPowered) {
        int meta = world.getBlockMetadata(x, y, z);
        if ((meta & 8) > 0) {
            isPowered = !isPowered;
        }

        if (this.isTop) {
            Block<?> b;
            if ((b = Blocks.blocksList[world.getBlockId(x, y - 1, z)]) != null && b.getLogic() instanceof BlockLogicDoor) {
                ((BlockLogicDoor)b.getLogic()).onPoweredBlockChange(world, x, y - 1, z, isPowered);
            }

        } else {
            boolean isOpen = (world.getBlockMetadata(x, y, z) & 4) > 0;
            if (isOpen != isPowered) {
                Block<?> b;
                if ((b = Blocks.blocksList[world.getBlockId(x, y + 1, z)]) != null && b.getLogic() instanceof BlockLogicDoor) {
                    world.setBlockMetadataWithNotify(x, y + 1, z, meta ^ 4);
                }

                world.setBlockMetadataWithNotify(x, y, z, meta ^ 4);
                world.markBlocksDirty(x, y - 1, z, x, y, z);
                world.playBlockEvent(null, 1003, x, y, z, 0);
            }
        }
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
        if (this.isTop) {
            Block<?> otherBlock = Blocks.blocksList[world.getBlockId(x, y - 1, z)];
            if (otherBlock == null || !(otherBlock.getLogic() instanceof BlockLogicDoor)) {
                world.setBlockWithNotify(x, y, z, 0);
            }

            if (otherBlock != null && blockId > 0 && Blocks.blocksList[blockId].isSignalSource()) {
                otherBlock.onNeighborBlockChange(world, x, y - 1, z, blockId);
            }
        } else {
            boolean flag = false;
            Block<?> otherBlock = Blocks.blocksList[world.getBlockId(x, y + 1, z)];
            if (otherBlock == null || !(otherBlock.getLogic() instanceof BlockLogicDoor)) {
                world.setBlockWithNotify(x, y, z, 0);
                flag = true;
            }

            if (!world.canPlaceOnSurfaceOfBlock(x, y - 1, z)) {
                this.dropBlockWithCause(world, EnumDropCause.WORLD, x, y, z, world.getBlockMetadata(x, y, z), (TileEntity)null, (Player)null);
                world.setBlockWithNotify(x, y, z, 0);
                flag = true;
                if (otherBlock != null && otherBlock.getLogic() instanceof BlockLogicDoor) {
                    world.setBlockWithNotify(x, y + 1, z, 0);
                }
            }

            if (flag) {
                if (!world.isClientSide) {
                }
            } else if (blockId > 0 && Blocks.blocksList[blockId].isSignalSource()) {
                boolean flag1 = world.hasNeighborSignal(x, y, z) || world.hasNeighborSignal(x, y + 1, z);
                this.onPoweredBlockChange(world, x, y, z, flag1);
            }
        }

    }

}
