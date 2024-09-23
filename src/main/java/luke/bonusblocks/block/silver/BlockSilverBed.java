package luke.bonusblocks.block.silver;

import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.BedBlock;
import net.minecraft.core.block.entity.BlockEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockSilverBed extends BedBlock {
    public BlockSilverBed(String key, String namespaceId, int id, Material material) {
        super(key, namespaceId, id);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, BlockEntity BlockEntity) {
        return new ItemStack[]{new ItemStack(BonusItems.BED_SILVER)};
    }

}
