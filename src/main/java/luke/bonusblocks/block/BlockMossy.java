package luke.bonusblocks.block;

import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.MossBlock;
import net.minecraft.core.block.entity.BlockEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockMossy extends MossBlock {

    public BlockMossy(String key, String namespaceId, int id, Material material) {
        super(key, namespaceId, id, BonusBlocks.MOSS.id);
        this.setTicking(true);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, BlockEntity BlockEntity) {
        switch (dropCause) {
            case SILK_TOUCH:
            case PICK_BLOCK:
                return new ItemStack[]{new ItemStack(this)};
            default:
                return new ItemStack[]{new ItemStack(BonusItems.MOSSBALL, 4)};
        }
    }

}
