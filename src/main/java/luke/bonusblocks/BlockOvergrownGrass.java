package luke.bonusblocks;

import net.minecraft.core.block.BlockGrass;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Axis;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

public class BlockOvergrownGrass extends BlockGrass {
    public BlockOvergrownGrass(String key, int id, Material material) {
        super(key, id, material);
    }

    public int getBlockTexture(WorldSource blockAccess, int x, int y, int z, Side side) {
        Material material = blockAccess.getBlockMaterial(x, y + 1, z);
        return (material == Material.topSnow || material == Material.snow) && side.getAxis() != Axis.Y ? texCoordToIndex(2, 4) : super.getBlockTexture(blockAccess, x, y, z, side);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        switch (dropCause) {
            case SILK_TOUCH:
            case PICK_BLOCK:
                return new ItemStack[]{new ItemStack(this)};
            default:
                return new ItemStack[]{new ItemStack(BonusBlocks.grassOvergrown)};
        }
    }
}
