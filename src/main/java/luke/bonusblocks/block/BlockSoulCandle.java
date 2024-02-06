package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockCandle;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockSoulCandle extends BlockCandle {
    public BlockSoulCandle(String key, int id) {
        super(key, id, Material.decoration);
        this.setTicking(true);
        this.setBlockBounds(0.40625F, 0.0F, 0.40625F, 0.59375F, 0.5F, 0.59375F);
    }

    private boolean canPlaceOnTop(World world, int i, int j, int k) {
        int id = world.getBlockId(i, j, k);
        return world.isBlockNormalCube(i, j, k) || id == Block.fencePlanksOak.id || id == Block.fencePlanksOakPainted.id;
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

        this.dropCandleIfCantStay(world, i, j, k);
    }


    private void dropCandleIfCantStay(World world, int i, int j, int k) {
        if (!this.canPlaceBlockAt(world, i, j, k)) {
            this.dropBlockWithCause(world, EnumDropCause.WORLD, i, j, k, world.getBlockMetadata(i, j, k), (TileEntity)null);
            world.setBlockWithNotify(i, j, k, 0);
        }
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return new ItemStack[]{new ItemStack(BonusBlocks.candleSoulwaxItem)};
    }
}
