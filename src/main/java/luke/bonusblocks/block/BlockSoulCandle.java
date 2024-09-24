package luke.bonusblocks.block;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.CandleBlock;
import net.minecraft.core.block.entity.BlockEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockSoulCandle extends CandleBlock {
    public BlockSoulCandle(String key, String namespaceId, int id) {
        super(key, namespaceId, id, Material.decoration);
        this.setTicking(true);
        this.setBlockBounds(0.40625F, 0.0F, 0.40625F, 0.59375F, 0.5F, 0.59375F);
    }

    public boolean canPlaceOnTop(World world, int i, int j, int k) {
        int id = world.getBlockId(i, j, k);
        return world.isBlockNormalCube(i, j, k) || id == Blocks.FENCE_PLANKS_OAK.id || id == Blocks.FENCE_GATE_PLANKS_OAK_PAINTED.id;
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


    public void dropCandleIfCantStay(World world, int i, int j, int k) {
        if (!this.canPlaceBlockAt(world, i, j, k)) {
            this.dropBlockWithCause(world, EnumDropCause.WORLD, i, j, k, world.getBlockMetadata(i, j, k), null, null);
            world.setBlockWithNotify(i, j, k, 0);
        }
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, BlockEntity BlockEntity) {
        return new ItemStack[]{new ItemStack(BonusBlocks.CANDLE_SOULWAX)};
    }
}
