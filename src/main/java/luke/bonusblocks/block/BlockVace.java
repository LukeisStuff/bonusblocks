package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class BlockVace extends Block {
    public BlockVace(String key, String namespaceId, int id) {
        super(key, namespaceId, id, Material.metal);
        this.setTicking(true);
        this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 1.0f, 0.75F);
    }

    public boolean isSolidRender() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public void onBlockPlacedByMob(World world, int x, int y, int z, Side side, Mob mob, double sideHeight) {
        world.isBlockNormalCube(x, y - 1, z);
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        return world.isBlockNormalCube(x, y - 1, z) || world.canPlaceOnSurfaceOfBlock(x, y - 1, z);
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
        if (!this.canBlockStay(world, x, y, z)) {
            this.dropBlockWithCause(world, EnumDropCause.WORLD, x, y, z, world.getBlockMetadata(x, y, z), null, null);
            world.setBlockWithNotify(x, y, z, 0);
        }

    }

    public boolean canBlockStay(World world, int x, int y, int z) {
            return world.canPlaceOnSurfaceOfBlock(x, y - 1, z);
        }

}
