package luke.bonusblocks.block;

import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.OverlayPebblesBlock;
import net.minecraft.core.block.entity.BlockEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockOverlayRawSilver extends OverlayPebblesBlock {

    public BlockOverlayRawSilver(String key, String namespaceId, int id, Material material) {
        super(key, namespaceId, id, material);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, BlockEntity BlockEntity) {
        return dropCause == EnumDropCause.PICK_BLOCK ? new ItemStack[]{new ItemStack(BonusItems.ORE_RAW_SILVER, 1)} : new ItemStack[]{new ItemStack(BonusItems.ORE_RAW_SILVER, meta + 1)};
    }
}
