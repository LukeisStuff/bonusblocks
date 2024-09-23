package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.SandBlock;
import net.minecraft.core.block.entity.BlockEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.FallingBlockEntity;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.FireStrikerItem;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockSulphur extends SandBlock {
    public BlockSulphur(String key, String namespaceId, int id, Material material) {
        super(key, namespaceId, id);
    }

    public void onBlockPlacedByMob(World world, int x, int y, int z, Side side, Mob mob, double sideHeight) {
        super.onBlockPlacedByMob(world, x, y, z, side, mob, sideHeight);
        world.scheduleBlockUpdate(x, y, z, this.id, this.tickRate());
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, BlockEntity BlockEntity) {
        return dropCause == EnumDropCause.EXPLOSION ? null : new ItemStack[]{new ItemStack(this)};
    }

    public void onBlockDestroyedByExplosion(World world, int x, int y, int z) {
        EntitySulphur entity = new EntitySulphur(world, (float)x + 0.5F, (float)y + 0.5F, (float)z + 0.5F);
        entity.fuse = world.rand.nextInt(entity.fuse / 2) + entity.fuse / 4;
        world.entityJoinedWorld(entity);
    }

    public void ignite(World world, int x, int y, int z, Player player, boolean sound) {
        if (world.isClientSide) {
            world.playSoundEffect(null, SoundCategory.WORLD_SOUNDS, (float)x + 0.5F, (float)y + 0.5F, (float)z + 0.5F, "random.fuse", 1.0F, 1.0F);

        } else {
            world.setBlockWithNotify(x, y, z, 0);
            EntitySulphur e = new EntitySulphur(world, (float)x + 0.5F, (float)y + 0.5F, (float)z + 0.5F);
            world.entityJoinedWorld(e);
            world.playSoundAtEntity(e , e, "random.fuse", 1.0F, 1.0F);

        }
        if (player != null && player.inventory.getCurrentItem() != null && player.inventory.getCurrentItem().getItem() instanceof FireStrikerItem) {
            player.inventory.getCurrentItem().damageItem(1, player);
        }
    }

    @Override
    public void onBlockLeftClicked(World world, int x, int y, int z, Player player, Side side, double xHit, double yHit) {
        if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof FireStrikerItem) {
            world.setBlockMetadata(x, y, z, 1);
        }

        super.onBlockLeftClicked(world, x, y, z, player, side, xHit, yHit);
    }

    @Override
    public boolean onBlockRightClicked(World world, int x, int y, int z, Player player, Side side, double xHit, double yHit) {
        if (player.inventory.getCurrentItem() != null && player.inventory.getCurrentItem().getItem() instanceof FireStrikerItem) {
            this.ignite(world, x, y, z, player, true);
            return true;
        } else {
            return super.onBlockRightClicked(world, x, y, z, player, side, xHit, yHit);
        }
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random rand) {
        this.tryToFall(world, x, y, z);
    }

    private void tryToFall(World world, int i, int j, int k) {
        if (canFallBelow(world, i, j - 1, k) && j >= 0) {
            byte byte0 = 32;
            if (!fallInstantly && world.areBlocksLoaded(i - byte0, j - byte0, k - byte0, i + byte0, j + byte0, k + byte0)) {
                FallingBlockEntity entityfallingsand = new FallingBlockEntity(world, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, this.id);
                world.entityJoinedWorld(entityfallingsand);
            } else {
                world.setBlockWithNotify(i, j, k, 0);

                while(canFallBelow(world, i, j - 1, k) && j > 0) {
                    --j;
                }

                if (j > 0) {
                    world.setBlockWithNotify(i, j, k, this.id);
                }
            }
        }

    }

    public int tickRate() {
        return 3;
    }

    public static boolean canFallBelow(World world, int i, int j, int k) {
        int blockId = world.getBlockId(i, j, k);
        if (blockId == 0) {
            return true;
        } else if (blockId == Block.fire.id) {
            return true;
        } else {
            return Block.hasTag(blockId, BlockTags.IS_WATER) || Block.hasTag(blockId, BlockTags.IS_LAVA);
        }
    }
}
