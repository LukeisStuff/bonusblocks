package luke.bonusblocks.block.copper;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicDoor;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Random;
import java.util.function.Supplier;

public class BlockLogicDoorCopper extends BlockLogicDoor {
    public final boolean isTop;
    public final boolean requireTool;
    public final @Nullable Supplier<Item> droppedItem;
    public BlockLogicDoorCopper(Block<?> block, Material material, boolean isTop, boolean requireTool, @Nullable Supplier<Item> droppedItem) {
        super(block, material, isTop, requireTool, droppedItem);
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

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
        if (this.droppedItem == null) {
            return null;
        } else if (this.requireTool && dropCause != EnumDropCause.IMPROPER_TOOL) {
            return new ItemStack[]{new ItemStack(this.droppedItem.get())};
        } else {
            return !this.requireTool ? new ItemStack[]{new ItemStack(this.droppedItem.get())} : null;
        }
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
            if (rand.nextInt(200) == 0) {
                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                    if (isTop) {
                        world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.DOOR_COPPER_TOP.id(), world.getBlockMetadata(x, y, z));
                        world.setBlockAndMetadataWithNotify(x, y - 1, z, BonusBlocks.DOOR_COPPER_BOTTOM.id(), world.getBlockMetadata(x, y - 1, z));
                    }
                }
            }
        }

}
