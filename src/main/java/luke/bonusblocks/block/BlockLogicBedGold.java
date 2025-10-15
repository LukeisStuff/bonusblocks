package luke.bonusblocks.block;

import luke.bonusblocks.BonusItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicBed;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockLogicBedGold extends BlockLogicBed {

    public BlockLogicBedGold(Block<?> block, Material material) {
        super(block);
        this.setBlockBounds(0.0, 0.0, 0.0, 1.0, 0.5625, 1.0);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int meta, TileEntity tileEntity) {
        return new ItemStack[]{new ItemStack(BonusItems.BED_GOLD)};
    }

}
