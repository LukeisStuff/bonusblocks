package luke.bonusblocks.block;

import net.minecraft.core.block.BlockBed;
import net.minecraft.core.block.logic.BedDirections;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.TextureHelper;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;

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
                                player1 = p;
                    }

                    if (player1 != null) {
                        player.addChatMessage("bed.occupied");
                        return true;
                    }

                    setBedOccupied(world, x, y, z, false);
                    world.setBlockWithNotify(x, y, z, 0);
                }
                return true;
            }
        }
    }

    public int getBlockTextureFromSideAndMetadata(Side side, int data) {
        if (side == Side.BOTTOM) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "bedrolltop2.png");
        } else {
            int k = getDirectionFromMetadata(data);
            int l = BedDirections.bedDirection[k][side.getId()];
            if (isBlockFootOfBed(data)) {
                if (l == 2) {
                    return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "bedrollfront.png");
                } else {
                    return l != 5 && l != 4 ? TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "bedrolltop1.png") : TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "bedrollside1.png");
                }
            } else if (l == 3) {
                return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "bedrollback.png");
            } else {
                return l != 5 && l != 4 ? TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "bedrolltop2.png") : TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "bedrollside2.png");
            }
        }
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean isSolidRender() {
        return false;
    }

    public void setBlockBoundsBasedOnState(World world, int x, int y, int z) {
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

//    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
//        return new ItemStack[]{new ItemStack(BonusBlocks.bedrollItem)};
//    }

    public int getPistonPushReaction() {
        return 1;
    }
}