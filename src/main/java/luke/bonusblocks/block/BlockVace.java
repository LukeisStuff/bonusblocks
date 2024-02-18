package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.world.World;

public class BlockVace extends Block {
    public BlockVace(String key, int id) {
        super(key, id, Material.metal);
        this.setTicking(true);
        this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 1.0f, 0.75F);
    }

    public boolean isSolidRender() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        return world.canPlaceOnSurfaceOfBlock(x, y - 1, z);
    }

    public boolean canBlockStay(World world, int x, int y, int z) {
        return this.canPlaceBlockAt(world, x, y, z);
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
        boolean flag = !world.canPlaceOnSurfaceOfBlock(x, y - 1, z);
        if (flag) {
            this.dropBlockWithCause(world, EnumDropCause.WORLD, x, y, z, world.getBlockMetadata(x, y, z), (TileEntity)null);
            world.setBlockWithNotify(x, y, z, 0);
        }

    }
}
