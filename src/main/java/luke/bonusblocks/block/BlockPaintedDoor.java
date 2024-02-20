package luke.bonusblocks.block;

import net.minecraft.core.Global;
import net.minecraft.core.block.BlockDoor;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

public class BlockPaintedDoor extends BlockDoor {
    public static final int colorBits = 240;
    public static final int colorOffset = 4;

    public BlockPaintedDoor(String key, int id, Material material, boolean isTop) {
        super(key, id, material, isTop);
    }


    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return new ItemStack[]{new ItemStack(this, 1, meta & 240)};
    }

    public int getBlockTexture(WorldSource blockAccess, int x, int y, int z, Side side) {
        int color = blockAccess.getBlockMetadata(x, y, z) >> 4;
        int texOffset = texCoordToIndex(20, 28) - (color % 4 * Global.TEXTURE_ATLAS_WIDTH_TILES * 3 + color / 4 * 3);
        return super.getBlockTexture(blockAccess, x, y, z, side) + texOffset;
    }

    public int getBlockTextureFromSideAndMetadata(Side side, int data) {
        int color = data >> 4;
        int texOffset = texCoordToIndex(20, 28) - (color % 4 * Global.TEXTURE_ATLAS_WIDTH_TILES * 3 + color / 4 * 3);
        return super.getBlockTextureFromSideAndMetadata(side, data & 15) + texOffset;
    }

    public static int getMetaForDyeColor(int i) {
        return ~i << 4 & 240;
    }
}
