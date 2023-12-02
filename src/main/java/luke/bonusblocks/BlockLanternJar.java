package luke.bonusblocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.animal.EntityFireflyCluster;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockLanternJar extends Block {
    public Item item;

    public BlockLanternJar(String key, int id, Material material) {
        super(key, id, material.glass);
        this.setBlockBounds(0.3125F, 0.0F, 0.3125F, 0.6875F, 0.5F, 0.6875F);
    }

    public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        int metadata = world.getBlockMetadata(x, y, z);
        float offset = 0.0F;
        if (metadata == 1) {
            offset = 0.3875F;
        }

        return AABB.getBoundingBoxFromPool((double)((float)x + 0.3125F), (double)((float)y + offset), (double)((float)z + 0.3125F), (double)((float)(x + 1) - 0.3125F), (double)((float)y + 0.5F + offset), (double)((float)(z + 1) - 0.3125F));
    }

    public AABB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {
        return this.getCollisionBoundingBoxFromPool(world, x, y, z);
    }

    public void setBlockBoundsBasedOnState(World world, int x, int y, int z) {
        AABB aabb = this.getCollisionBoundingBoxFromPool(world, x, y, z);
        this.minX = aabb.minX - (double)x;
        this.minY = aabb.minY - (double)y;
        this.minZ = aabb.minZ - (double)z;
        this.maxX = aabb.maxX - (double)x;
        this.maxY = aabb.maxY - (double)y;
        this.maxZ = aabb.maxZ - (double)z;
    }

    public boolean isSolidRender() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player) {
        world.setBlockRaw(x, y, z, 0);
        world.notifyBlocksOfNeighborChange(x, y, z, 0);
        world.notifyBlockChange(x, y, z, 0);
        world.playSoundAtEntity(player, "random.pop", 0.2f, 0.5f);
        if (!world.isClientSide) {
            world.dropItem(x, y, z, new ItemStack(asItem().jar, 1, 0));
        }
        return true;
    }

    public void onBlockAdded(World world, int x, int y, int z) {
        if (!world.isBlockNormalCube(x, y + 1, z) && !Block.hasTag(world.getBlockId(x, y + 1, z), BlockTags.CAN_HANG_OFF)) {
            world.setBlockMetadataWithNotify(x, y, z, 0);
        } else {
            world.setBlockMetadataWithNotify(x, y, z, 1);
        }

    }

    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        return world.isBlockNormalCube(x, y + 1, z) || Block.hasTag(world.getBlockId(x, y + 1, z), BlockTags.CAN_HANG_OFF) || world.canPlaceOnSurfaceOfBlock(x, y - 1, z);
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
        if (!this.canBlockStay(world, x, y, z)) {
            this.dropBlockWithCause(world, EnumDropCause.WORLD, x, y, z, world.getBlockMetadata(x, y, z), (TileEntity)null);
            world.setBlockWithNotify(x, y, z, 0);
        }

    }


    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        switch (dropCause) {
            case PICK_BLOCK:
            case SILK_TOUCH:
            case WORLD:
                return new ItemStack[]{new ItemStack(Item.jar)};
            default:
                return null;
        }
    }

    public boolean canBlockStay(World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        if (meta != 1) {
            return world.canPlaceOnSurfaceOfBlock(x, y - 1, z);
        } else {
            return world.isBlockNormalCube(x, y + 1, z) || Block.hasTag(world.getBlockId(x, y + 1, z), BlockTags.CAN_HANG_OFF);
        }
    }

    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta, EntityPlayer player, Item item) {
        if (item == null || !item.isSilkTouch()) {
        }
    }

    public void setItem(Item item) {
        this.item = item;
    }
}



