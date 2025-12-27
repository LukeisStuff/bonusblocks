package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

import java.util.Random;

public class BlockChimes extends BlockLogic {
    public BlockChimes(Block<?> block) {
        super(block, Material.metal);
        block.setTicking(true);
        this.setBlockBounds(0.1875f, 0.0F, 0.1875f, 0.8125f, 1.0f, 0.8125f);
    }

    @Override
    public void animationTick(World world, int x, int y, int z, Random rand) {
        if (rand.nextInt(150) == 0) {
            world.playSoundEffect(null, SoundCategory.WORLD_SOUNDS, x, y, z, "bonusblocks.chimes", 0.3F, rand.nextFloat() * 0.4F + 0.8F);
        }
    }

    @Override
    public AABB getCollisionBoundingBoxFromPool(WorldSource world, int x, int y, int z) {
        return null;
    }

    @Override
    public boolean isSolidRender() {
        return false;
    }

    @Override
    public boolean isCubeShaped() {
        return false;
    }

    @Override
    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        return world.isBlockNormalCube(x, y + 1, z) || Blocks.hasTag(world.getBlockId(x, y + 1, z), BlockTags.CAN_HANG_OFF) || world.canPlaceOnSurfaceOfBlock(x, y + 1, z);
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
        if (!this.canBlockStay(world, x, y, z)) {
            this.dropBlockWithCause(world, EnumDropCause.WORLD, x, y, z, world.getBlockMetadata(x, y, z), null, null);
            world.setBlockWithNotify(x, y, z, 0);
        }

    }

    @Override
    public boolean canBlockStay(World world, int x, int y, int z) {
        return world.isBlockNormalCube(x, y + 1, z) || Blocks.hasTag(world.getBlockId(x, y + 1, z), BlockTags.CAN_HANG_OFF);
    }
}
