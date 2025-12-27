package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicDoor;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class BlockLogicDoorStone extends BlockLogicDoor {
    public BlockLogicDoorStone(Block<?> block, boolean isTop, @Nullable Supplier<Item> droppedItem, Material material) {
        super(block, material, isTop, true, droppedItem);
        float f = 0.5F;
        if (isTop) {
            this.setBlockBounds(0.5F - f, -1.0, 0.5F - f, 0.5F + f, 1.0, 0.5F + f);
        } else {
            this.setBlockBounds(0.5F - f, 0.0, 0.5F - f, 0.5F + f, 2.0, 0.5F + f);
        }
    }

    @Override
    public void onBlockPlacedOnSide(World world, int x, int y, int z, @NotNull Side side, double xPlaced, double yPlaced) {
    }

    @Override
    public void onPoweredBlockChange(World world, int x, int y, int z, boolean isPowered) {
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
        if (this.isTop) {
            Block<?> otherBlock = Blocks.blocksList[world.getBlockId(x, y - 1, z)];
            if (otherBlock == null || !(otherBlock.getLogic() instanceof BlockLogicDoor)) {
                world.setBlockWithNotify(x, y, z, 0);
            }
        } else {
            Block<?> otherBlock = Blocks.blocksList[world.getBlockId(x, y + 1, z)];
            if (otherBlock == null || !(otherBlock.getLogic() instanceof BlockLogicDoor)) {
                world.setBlockWithNotify(x, y, z, 0);
            }

            if (!world.canPlaceOnSurfaceOfBlock(x, y - 1, z)) {
                this.dropBlockWithCause(world, EnumDropCause.WORLD, x, y, z, world.getBlockMetadata(x, y, z), null, null);
                world.setBlockWithNotify(x, y, z, 0);
                if (otherBlock != null && otherBlock.getLogic() instanceof BlockLogicDoor) {
                    world.setBlockWithNotify(x, y + 1, z, 0);
                }
            }
        }
    }
}
