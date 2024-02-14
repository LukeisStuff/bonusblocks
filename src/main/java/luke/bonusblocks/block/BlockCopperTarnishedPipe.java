package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.HitResult;
import net.minecraft.core.block.BlockAxisAligned;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.util.phys.Vec3d;
import net.minecraft.core.world.World;
import useless.dragonfly.model.block.processed.BlockModel;

import java.util.Random;

public class BlockCopperTarnishedPipe extends BlockAxisAligned {
    protected int ticks;
    public BlockCopperTarnishedPipe(String key, int id, Material material, BlockModel orCreateBlockModel, boolean render3d) {
        super(key, id, material);
        this.setTicking(true);
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
        if (world.getBlockMetadata(x, y, z) >= 0) {
            ++this.ticks;
            if (this.ticks == 200) {
                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.pipeCopperCorroded.id, world.getBlockMetadata(x, y, z));
                this.ticks = 0;
            }
        }
    }

    public HitResult collisionRayTrace(World world, int x, int y, int z, Vec3d start, Vec3d end) {
        int l = world.getBlockMetadata(x, y, z) & 7;
        if (l == 0) { // UP/DOWN
            this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 1.0f, 0.75F);
        } else if (l == 1) { // NORTH/SOUTH
            this.setBlockBounds(0.25F, 0.25F, 0.0f, 0.75f, 0.75f, 1.0f);
        } else if (l == 2) { // EAST/WEST
            this.setBlockBounds(0.0f, 0.25F, 0.25F, 1.0f, 0.75f, 0.75f);
        } else {
            this.setBlockBounds(0.25F, 0.0F, 0.25F, 0.75F, 1.0f, 0.75F);
        }

        return super.collisionRayTrace(world, x, y, z, start, end);
    }


    public boolean isSolidRender() {
        return false;
    }

}
