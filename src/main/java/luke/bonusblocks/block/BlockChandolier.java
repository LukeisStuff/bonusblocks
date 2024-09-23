package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.BlockEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.world.World;

public class BlockChandolier extends Block {
    public BlockChandolier(String key, int id) {
        super(key, id, Material.metal);
        this.setTicking(true);
        this.setBlockBounds(0.0625f, 0.0F, 0.0625f, 0.9375f, 1.0f, 0.9375f);
    }

    public boolean isSolidRender() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public void onBlockAdded(World world, int x, int y, int z) {
        if (!world.isBlockNormalCube(x, y + 1, z) && !Block.hasTag(world.getBlockId(x, y + 1, z), BlockTags.CAN_HANG_OFF)) {
            world.setBlockMetadataWithNotify(x, y, z, 0);
        }
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        return world.isBlockNormalCube(x, y + 1, z) || Block.hasTag(world.getBlockId(x, y + 1, z), BlockTags.CAN_HANG_OFF);
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
        if (!this.canBlockStay(world, x, y, z)) {
            this.dropBlockWithCause(world, EnumDropCause.WORLD, x, y, z, world.getBlockMetadata(x, y, z), null);
            world.setBlockWithNotify(x, y, z, 0);
        }
    }

    public boolean canBlockStay(World world, int x, int y, int z) {
        return world.isBlockNormalCube(x, y + 1, z) || Block.hasTag(world.getBlockId(x, y + 1, z), BlockTags.CAN_HANG_OFF);
    }
}
