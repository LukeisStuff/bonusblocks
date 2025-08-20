package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicSand;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.EntityFallingBlock;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemFireStriker;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class BlockLogicSulphur extends BlockLogicSand {
    public BlockLogicSulphur(Block<?> block) {
        super(block);
    }

    public void onBlockPlacedByMob(World world, int x, int y, int z, @NotNull Side side, Mob mob, double xPlaced, double yPlaced) {
        this.onBlockPlacedOnSide(world, x, y, z, side, xPlaced, yPlaced);
        world.scheduleBlockUpdate(x, y, z, this.id(), this.tickRate());
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity BlockEntity) {
        return dropCause == EnumDropCause.EXPLOSION ? null : new ItemStack[]{new ItemStack(this)};
    }

    public void onBlockDestroyedByExplosion(World world, int x, int y, int z) {
        this.ignite(world, x, y, z, null);
    }

    public void ignite(World world, int x, int y, int z, Player player) {
            world.setBlockWithNotify(x, y, z, 0);
            world.createExplosion(null, x, y, z, 3.0f, true, false);
            world.playSoundEffect(null, SoundCategory.WORLD_SOUNDS, x, y, z, "random.fuse", 1.0F, 1.0F);

        if (player != null && player.inventory.getCurrentItem() != null && player.inventory.getCurrentItem().getItem() instanceof ItemFireStriker) {
            player.inventory.getCurrentItem().damageItem(1, player);
        }
    }

    @Override
    public void onBlockLeftClicked(World world, int x, int y, int z, Player player, Side side, double xHit, double yHit) {
        if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemFireStriker) {
            this.ignite(world, x, y, z, null);
        }

        super.onBlockLeftClicked(world, x, y, z, player, side, xHit, yHit);
    }

    @Override
    public boolean onBlockRightClicked(World world, int x, int y, int z, Player player, Side side, double xHit, double yHit) {
        if (player.inventory.getCurrentItem() != null && player.inventory.getCurrentItem().getItem() instanceof ItemFireStriker) {
            this.ignite(world, x, y, z, player);
            return true;
        } else {
            return super.onBlockRightClicked(world, x, y, z, player, side, xHit, yHit);
        }
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random rand) {
        this.tryToFall(world, x, y, z);
    }

    private void tryToFall(World world, int x, int y, int z) {
        if (canFallBelow(world, x, y - 1, z) && y >= 0) {
            byte byte0 = 32;
            if (!fallInstantly && world.areBlocksLoaded(x - byte0, y - byte0, z - byte0, x + byte0, y + byte0, z + byte0)) {
                EntityFallingBlock fallingBlockEntity = new EntityFallingBlock(world, (double) x + 0.5, (double) y + 0.5, (double) z + 0.5, this.id(), 0, null);
                world.entityJoinedWorld(fallingBlockEntity);
            } else {
                world.setBlockWithNotify(x, y, z, 0);

                while (canFallBelow(world, x, y - 1, z) && y > 0) {
                    --y;
                }

                if (y > 0) {
                    world.setBlockWithNotify(x, y, z, this.id());
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
        } else if (blockId == Blocks.FIRE.id()) {
            return true;
        } else {
            return Blocks.hasTag(blockId, BlockTags.IS_WATER) || Blocks.hasTag(blockId, BlockTags.IS_LAVA);
        }
    }
}
