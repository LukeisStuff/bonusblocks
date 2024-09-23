package luke.bonusblocks.block;

import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.BlockDoor;
import net.minecraft.core.block.entity.BlockEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockDOOR_GLASS_OBSIDIAN extends BlockDoor {
    public BlockDOOR_GLASS_OBSIDIAN(String key, int id, Material material, boolean isTop) {
        super(key, id, material, isTop);
    }


    public int getRenderBlockPass() {
        return 1;
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, BlockEntity BlockEntity) {
        return new ItemStack[]{new ItemStack(BonusItems.DOOR_GLASS_OBSIDIAN)};
    }
}
