package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.BlockEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockPaintedCrate extends Block {

    public BlockPaintedCrate(String key, String namespaceId, int id) {
        super(key, namespaceId, id, Material.wood);
    }

        public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, BlockEntity blockEntity) {
            return new ItemStack[]{new ItemStack(this, 1, meta)};
        }

}
