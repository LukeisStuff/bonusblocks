package luke.bonusblocks.block;

import net.minecraft.core.block.GlassBlock;
import net.minecraft.core.block.entity.BlockEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockGLASS_OBSIDIAN
        extends GlassBlock {
    public BlockGLASS_OBSIDIAN(String key, int id) {
        super(key, id, Material.glass);
    }

    public int getRenderLayer() {
        return 1;
    }

    @Override
    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, BlockEntity BlockEntity) {
        switch (dropCause) {
            case SILK_TOUCH:
            case PICK_BLOCK: {
                return new ItemStack[]{new ItemStack(this)};
            }
        }
        return null;
    }
}
