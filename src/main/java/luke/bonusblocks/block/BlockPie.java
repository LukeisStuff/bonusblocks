package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocksMod;
import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.TextureHelper;

public class BlockPie extends Block {
    public BlockPie(String key, int id) {
        super(key, id, Material.cake);
        this.setTicking(true);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return dropCause != EnumDropCause.PICK_BLOCK && meta != 0 ? null : new ItemStack[]{new ItemStack(BonusItems.foodPie)};
    }

    public void setBlockBoundsBasedOnState(World world, int x, int y, int z) {
        int l = world.getBlockMetadata(x, y, z);
        float f = 0.0625F;
        float f1 = (float) (1 + l * 3) / 16.0F;
        float f2 = 0.3125F;
        this.setBlockBounds(f1, 0.0F, f, 1.0F - f, f2, 1.0F - f);
    }

    public void setBlockBoundsForItemRender() {
        float f = 0.0625F;
        float f1 = 0.3125F;
        this.setBlockBounds(f, 0.0F, f, 1.0F - f, f1, 1.0F - f);
    }

    public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        int l = world.getBlockMetadata(x, y, z);
        float f = 0.0625F;
        float f1 = (float) (1 + l * 3) / 16.0F;
        float f2 = 0.3125F;
        return AABB.getBoundingBoxFromPool((double) ((float) x + f1), (double) y, (double) ((float) z + f), (double) ((float) (x + 1) - f), (double) ((float) y + f2 - f), (double) ((float) (z + 1) - f));
    }

    public AABB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {
        int l = world.getBlockMetadata(x, y, z);
        float f = 0.0625F;
        float f1 = (float) (1 + l * 3) / 16.0F;
        float f2 = 0.3125F;
        return AABB.getBoundingBoxFromPool((double) ((float) x + f1), (double) y, (double) ((float) z + f), (double) ((float) (x + 1) - f), (double) ((float) y + f2), (double) ((float) (z + 1) - f));
    }

    public int getBlockTextureFromSideAndMetadata(Side side, int j) {
        int[] texture = TextureHelper.getOrCreateBlockTexture(BonusBlocksMod.MOD_ID, "pieinside.png");
        return j > 0 && side == Side.WEST ? texCoordToIndex(texture[0], texture[1]) : this.atlasIndices[side.getId()];
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean isSolidRender() {
        return false;
    }

    public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player) {
        this.eatCakeSlice(world, x, y, z, player);
        return true;
    }

    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {
        this.eatCakeSlice(world, x, y, z, player);
    }

    private void eatCakeSlice(World world, int i, int j, int k, EntityPlayer entityplayer) {
        if (entityplayer.getHealth() < 20) {
            entityplayer.heal(2);
            int l = world.getBlockMetadata(i, j, k) + 1;
            if (l >= 4) {
                world.setBlockWithNotify(i, j, k, 0);
            } else {
                world.setBlockMetadataWithNotify(i, j, k, l);
                world.markBlockDirty(i, j, k);
            }
        }

    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        return super.canPlaceBlockAt(world, x, y, z) && this.canBlockStay(world, x, y, z);
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
        if (!this.canBlockStay(world, x, y, z)) {
            world.setBlockWithNotify(x, y, z, 0);
        }

    }

    public boolean canBlockStay(World world, int x, int y, int z) {
        return world.getBlockMaterial(x, y - 1, z).isSolid();
    }
}

