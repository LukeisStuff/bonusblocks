package luke.bonusblocks.block;

import net.minecraft.core.block.BlockDoor;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockDoorGlassObsidian extends BlockDoor {
    public BlockDoorGlassObsidian(String key, int id, Material material, boolean isTop) {
        super(key, id, material, isTop);
    }

    public boolean isSolidRender() {
        return false;
    }


    public int getRenderBlockPass() {
        return 1;
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return new ItemStack[]{new ItemStack(Item.doorGlass)};
    }
}
