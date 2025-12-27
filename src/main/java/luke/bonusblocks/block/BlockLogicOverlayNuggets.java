package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicOverlayPebbles;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockLogicOverlayNuggets extends BlockLogicOverlayPebbles {
    Item breakResult;

    public BlockLogicOverlayNuggets(Block<?> block, Material material, Item breakResult) {
        super(block, material);
        this.breakResult = breakResult;
    }

    @Override
    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
        return dropCause == EnumDropCause.PICK_BLOCK ? new ItemStack[]{new ItemStack(breakResult, 1)} : new ItemStack[]{new ItemStack(breakResult, meta + 1)};
    }
}
