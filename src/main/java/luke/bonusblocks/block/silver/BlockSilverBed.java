package luke.bonusblocks.block.silver;

import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.BlockBed;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockSilverBed extends BlockBed {
    public BlockSilverBed(String key, int id) {
        super(key, id);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return new ItemStack[]{new ItemStack(BonusItems.bedSilver)};
    }

}
