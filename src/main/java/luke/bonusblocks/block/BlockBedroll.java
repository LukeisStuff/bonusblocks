package luke.bonusblocks.block;

import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.BlockBed;
import net.minecraft.core.block.entity.BlockEntity;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.enums.EnumSleepStatus;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

public class BlockBedroll extends BlockBed {
    public static final int[][] headBlockToFootBlockMap = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};

    public BlockBedroll(String key, int id) {
        super(key, id);
        this.setBounds();
    }

    @Override
    public boolean onBlockRightClicked(World world, int x, int y, int z, EntityPlayer player, Side side, double xPlaced, double yPlaced) {
        if (world.isClientSide) {
            return true;
        }
        int meta = world.getBlockMetadata(x, y, z);
        if (!BlockBedroll.isBlockFootOfBed(meta)) {
            int dir = BlockBedroll.getDirectionFromMetadata(meta);
            if (world.getBlockId(x += headBlockToFootBlockMap[dir][0], y, z += headBlockToFootBlockMap[dir][1]) != this.id) {
                return true;
            }
            meta = world.getBlockMetadata(x, y, z);
        }
        if (!world.worldType.mayRespawn()) {
            double d = (double)x + 0.5;
            double d1 = (double)y + 0.5;
            double d2 = (double)z + 0.5;
            world.setBlockWithNotify(x, y, z, 0);
            int dir = BlockBedroll.getDirectionFromMetadata(meta);
            if (world.getBlockId(x += headBlockToFootBlockMap[dir][0], y, z += headBlockToFootBlockMap[dir][1]) == this.id) {
                world.setBlockWithNotify(x, y, z, 0);
                d = (d + (double)x + 0.5) / 2.0;
                d1 = (d1 + (double)y + 0.5) / 2.0;
                d2 = (d2 + (double)z + 0.5) / 2.0;
            }
            world.newExplosion(null, (float)x + 0.5f, (float)y + 0.5f, (float)z + 0.5f, 5.0f, true, false);
            return true;
        }
        if (BlockBedroll.isBedOccupied(meta)) {
            EntityPlayer player1 = null;
            for (EntityPlayer p : world.players) {
                if (!p.isPlayerSleeping()) continue;
                player1 = p;
            }
            if (player1 == null) {
                BlockBedroll.setBedOccupied(world, x, y, z, false);
            } else {
                player.sendTranslatedChatMessage("bed.occupied");
                return false;
            }
        }
        if (world.worldType.mayRespawn()) {
            if (player.sleepInBedAt(x, y, z) == EnumSleepStatus.NOT_POSSIBLE_HERE) {
                BlockBedroll.setBedOccupied(world, x, y, z, true);
                double b = (double)x + 0.5;
                double b1 = (double)y + 0.5;
                double b2 = (double)z + 0.5;
                world.setBlockWithNotify(x, y, z, 0);
                int dir = BlockBedroll.getDirectionFromMetadata(meta);
                if (world.getBlockId(x += headBlockToFootBlockMap[dir][0], y, z += headBlockToFootBlockMap[dir][1]) == this.id) {
                    world.setBlockWithNotify(x, y, z, 0);
                    b = (b + (double) x + 0.5) / 2.0;
                    b1 = (b1 + (double) y + 0.5) / 2.0;
                    b2 = (b2 + (double) z + 0.5) / 2.0;
                }
                return false;
            }
        }
        return false;
    }

    @Override
    public void setBlockBoundsBasedOnState(WorldSource world, int x, int y, int z) {
        this.setBounds();
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
        int i1 = world.getBlockMetadata(x, y, z);
        int j1 = BlockBedroll.getDirectionFromMetadata(i1);
        if (BlockBedroll.isBlockFootOfBed(i1)) {
            if (world.getBlockId(x - headBlockToFootBlockMap[j1][0], y, z - headBlockToFootBlockMap[j1][1]) != this.id) {
                world.setBlockWithNotify(x, y, z, 0);
            }
        } else if (world.getBlockId(x + headBlockToFootBlockMap[j1][0], y, z + headBlockToFootBlockMap[j1][1]) != this.id) {
            world.setBlockWithNotify(x, y, z, 0);
        }
    }

    public void setBounds() {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.25f, 1.0F);
    }

    public static int getDirectionFromMetadata(int i) {
        return i & 3;
    }

    public static boolean isBlockFootOfBed(int i) {
        return (i & 8) != 0;
    }

    public static boolean isBedOccupied(int i) {
        return (i & 4) != 0;
    }

    public static void setBedOccupied(World world, int i, int j, int k, boolean flag) {
        int l = world.getBlockMetadata(i, j, k);
        if (flag) {
            l |= 4;
        } else {
            l &= 0xFFFFFFFB;
        }
        world.setBlockMetadataWithNotify(i, j, k, l);
    }

    @Override
    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, BlockEntity BlockEntity) {
        return new ItemStack[]{new ItemStack(BonusItems.bedroll)};
    }

}

