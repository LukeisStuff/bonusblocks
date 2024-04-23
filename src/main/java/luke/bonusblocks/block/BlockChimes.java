package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockChimes extends Block {
    public BlockChimes(String key, int id) {
        super(key, id, Material.metal);
        this.setTicking(true);
        this.setBlockBounds(0.1875f, 0.0F, 0.1875f, 0.8125f, 1.0f, 0.8125f);
    }

    public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
        if (rand.nextInt(150) == 0) {
            world.playSoundEffect(null, SoundCategory.WORLD_SOUNDS, x, y, z, "bonusblocks.chimes", 0.3F, rand.nextFloat() * 0.4F + 0.8F);
        }
    }

    public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        return null;
    }

    public boolean isSolidRender() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public void onBlockAdded(World world, int x, int y, int z) {
        if (!world.isBlockNormalCube(x, y + 1, z)) {
            Block.hasTag(world.getBlockId(x, y + 1, z), BlockTags.CAN_HANG_OFF);
        }

    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        return world.isBlockNormalCube(x, y + 1, z) || Block.hasTag(world.getBlockId(x, y + 1, z), BlockTags.CAN_HANG_OFF) || world.canPlaceOnSurfaceOfBlock(x, y + 1, z);
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
        if (!this.canBlockStay(world, x, y, z)) {
            this.dropBlockWithCause(world, EnumDropCause.WORLD, x, y, z, world.getBlockMetadata(x, y, z), null);
            world.setBlockWithNotify(x, y, z, 0);
        }

    }

    public boolean canBlockStay(World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        if (meta != 1) {
            return world.canPlaceOnSurfaceOfBlock(x, y + 1, z);
        } else {
            return world.isBlockNormalCube(x, y + 1, z) || Block.hasTag(world.getBlockId(x, y + 1, z), BlockTags.CAN_HANG_OFF);
        }
    }
}
