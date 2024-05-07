package luke.bonusblocks.block.copper;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.BlockAxisAligned;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import org.useless.dragonfly.model.block.processed.ModernBlockModel;

import java.util.Random;

public class BlockCopperPipe extends BlockAxisAligned {
    public BlockCopperPipe(String key, int id, Material material) {
        super(key, id, material);
        this.setTicking(true);
    }

    public boolean isSolidRender() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }


    public void updateTick(World world, int x, int y, int z, Random rand) {
                if (rand.nextInt(200) == 0) {
                    if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                        world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.pipeCopperTarnished.id, world.getBlockMetadata(x, y, z));
                    }
            }
        }

    public void setBlockBoundsBasedOnState(World world, int x, int y, int z) {
        this.setBlockBounds(world.getBlockMetadata(x, y, z));
    }

    public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        this.setBlockBounds(world.getBlockMetadata(x, y, z));
        return super.getCollisionBoundingBoxFromPool(world, x, y, z);
    }

    public AABB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {
        this.setBlockBounds(world.getBlockMetadata(x, y, z));
        return super.getSelectedBoundingBoxFromPool(world, x, y, z);
    }

    private void setBlockBounds(int meta) {
        Side side = this.getSideFromMeta(meta);
        if (side == Side.TOP) {
            this.setBlockBounds(0.1875f, 0.0F, 0.1875f, 0.8125f, 1.0f, 0.8125f);
        } else if (side == Side.NORTH) {
            this.setBlockBounds(0.1875f, 0.1875f, 0.0f, 0.8125f, 0.8125f, 1.0f);
        } else if (side == Side.EAST) {
            this.setBlockBounds(0.0f, 0.1875f, 0.1875f, 1.0f, 0.8125f, 0.8125f);
        } else {
            this.setBlockBounds(0.1875f, 0.0F, 0.1875f, 0.8125f, 1.0f, 0.8125f);
        }
    }

    public Side getSideFromMeta(int meta) {
        if (meta == 0) {
            return Side.TOP;
        } else if (meta == 1) {
            return Side.NORTH;
        } else if (meta == 2) {
            return Side.EAST;
        } else {
            return Side.NONE;
        }
    }
}
