package luke.bonusblocks.block;

import net.minecraft.core.block.BlockBed;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.enums.EnumSleepStatus;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;
import net.minecraft.core.world.chunk.ChunkCoordinates;

public class BlockBedroll extends BlockBed {
    public static final int[][] headBlockToFootBlockMap = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};

    public BlockBedroll(String key, int id) {
        super(key, id);
        this.setBounds();
    }

    public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player) {
        if (world.isClientSide) {
            return true;
        } else {
            int meta = world.getBlockMetadata(x, y, z);
            if (!isBlockFootOfBed(meta)) {
                int dir = getDirectionFromMetadata(meta);
                x += headBlockToFootBlockMap[dir][0];
                z += headBlockToFootBlockMap[dir][1];
                if (world.getBlockId(x, y, z) != this.id) {
                    return true;
                }

                meta = world.getBlockMetadata(x, y, z);
            }

            if (!world.worldType.mayRespawn()) {
                world.setBlockWithNotify(x, y, z, 0);
                int dir = getDirectionFromMetadata(meta);
                x += headBlockToFootBlockMap[dir][0];
                z += headBlockToFootBlockMap[dir][1];
                if (world.getBlockId(x, y, z) == this.id) {
                    world.setBlockWithNotify(x, y, z, 0);
                }

                world.newExplosion(null, (float)x + 0.5F, (float)y + 0.5F, (float)z + 0.5F, 5.0F, true, false);
                return true;
            } else {
                if (isBedOccupied(meta)) {
                    EntityPlayer player1 = null;

                    for (EntityPlayer p : world.players) {
                        if (p.isPlayerSleeping()) {
                            ChunkCoordinates pos = p.bedChunkCoordinates;
                            if (pos.x == x && pos.y == y && pos.z == z) {
                                player1 = p;
                            }
                        }
                    }

                    if (player1 != null) {
                        player.sendTranslatedChatMessage("bed.occupied");
                        return true;
                    }

                    setBedOccupied(world, x, y, z, false);
                }

                if (player.sleepInBedAt(x, y, z) == EnumSleepStatus.OK) {
                    setBedOccupied(world, x, y, z, true);
                }
                return true;
            }
        }
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean isSolidRender() {
        return false;
    }

    public void setBlockBoundsBasedOnState(WorldSource world, int x, int y, int z) {
        this.setBounds();
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
        int i1 = world.getBlockMetadata(x, y, z);
        int j1 = getDirectionFromMetadata(i1);
        if (isBlockFootOfBed(i1)) {
            if (world.getBlockId(x - headBlockToFootBlockMap[j1][0], y, z - headBlockToFootBlockMap[j1][1]) != this.id) {
                world.setBlockWithNotify(x, y, z, 0);
            }
        } else if (world.getBlockId(x + headBlockToFootBlockMap[j1][0], y, z + headBlockToFootBlockMap[j1][1]) != this.id) {
            world.setBlockWithNotify(x, y, z, 0);
        }

    }

    private void setBounds() {
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
            l &= -5;
        }

        world.setBlockMetadataWithNotify(i, j, k, l);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return new ItemStack[]{new ItemStack(Item.bed)};
    }

    public int getPistonPushReaction() {
        return 1;
    }
}