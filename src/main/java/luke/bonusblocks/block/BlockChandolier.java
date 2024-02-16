package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.world.World;

public class BlockChandolier extends Block {
    public BlockChandolier(String key, int id) {
        super(key, id, Material.metal);
        this.setTicking(true);
    }

    public boolean isSolidRender() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        Block block = world.getBlock(x, y + 1, z);
        return block != null && block.blockMaterial.isSolid();
    }

    public boolean canBlockStay(World world, int x, int y, int z) {
        return this.canPlaceBlockAt(world, x, y, z);
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
        if (!world.isBlockOpaqueCube(x, y + 1, z)) {
            this.dropBlockWithCause(world, EnumDropCause.WORLD, x, y, z, world.getBlockMetadata(x, y, z), null);
            world.setBlock(x, y, z, 0);
        }
    }
}
