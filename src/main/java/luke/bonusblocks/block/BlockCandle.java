package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockCandle extends Block {
    public BlockCandle(String key, int id, Material material) {
        super(key, id, Material.decoration);
        this.setTicking(true);
        this.setBlockBounds(0.40625F, 0.0F, 0.40625F, 0.59375F, 0.5F, 0.59375F);
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

    private boolean canPlaceOnTop(World world, int i, int j, int k) {
        int id = world.getBlockId(i, j, k);
        return world.isBlockNormalCube(i, j, k) || id == Block.fencePlanksOak.id || id == Block.fencePlanksOakPainted.id;
    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        return world.canPlaceOnSurfaceOfBlock(x, y - 1, z);
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
        super.updateTick(world, x, y, z, rand);
        if (world.getBlockMetadata(x, y, z) == 0) {
            this.onBlockAdded(world, x, y, z);
        }

    }

    public void onBlockAdded(World world, int i, int j, int k) {
        if (world.isBlockNormalCube(i - 1, j, k)) {
            world.setBlockMetadataWithNotify(i, j, k, 0);
        } else if (world.isBlockNormalCube(i + 1, j, k)) {
            world.setBlockMetadataWithNotify(i, j, k, 0);
        } else if (world.isBlockNormalCube(i, j, k - 1)) {
            world.setBlockMetadataWithNotify(i, j, k, 0);
        } else if (world.isBlockNormalCube(i, j, k + 1)) {
            world.setBlockMetadataWithNotify(i, j, k, 0);
        } else if (this.canPlaceOnTop(world, i, j - 1, k)) {
            world.setBlockMetadataWithNotify(i, j, k, 0);
        }

        this.dropTorchIfCantStay(world, i, j, k);
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
        if (!world.isClientSide) {
            boolean flag = !world.canPlaceOnSurfaceOfBlock(x, y - 1, z);
            if (flag) {
                this.dropBlockWithCause(world, EnumDropCause.WORLD, x, y, z, world.getBlockMetadata(x, y, z), (TileEntity)null);
                world.setBlockWithNotify(x, y, z, 0);
            }

        }
    }

    private boolean dropTorchIfCantStay(World world, int i, int j, int k) {
        if (!this.canPlaceBlockAt(world, i, j, k)) {
            this.dropBlockWithCause(world, EnumDropCause.WORLD, i, j, k, world.getBlockMetadata(i, j, k), (TileEntity)null);
            world.setBlockWithNotify(i, j, k, 0);
            return false;
        } else {
            return true;
        }
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return new ItemStack[]{new ItemStack(BonusBlocks.candleSoulwaxItem)};
    }

    public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
        double d = (double)((float)x + 0.5F);
        double d1 = (double)((float)y + 0.7F);
        double d2 = (double)((float)z + 0.5F);
        world.spawnParticle("smoke", d, d1, d2, 0.0, 0.0, 0.0);
        world.spawnParticle("soulflame", d, d1, d2, 0.0, 0.0, 0.0);
    }
}
