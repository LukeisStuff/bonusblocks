package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicMesh;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.projectile.Projectile;
import net.minecraft.core.util.phys.HitResult;
import net.minecraft.core.util.phys.Vec3;
import net.minecraft.core.world.World;

public class BlockLogicMeshVerdigris extends BlockLogicMesh {
    public BlockLogicMeshVerdigris(Block<?> block) {
        super(block);
    }

    @Override
    public boolean collidesWithEntity(Entity entity, World world, int x, int y, int z) {
        if (entity instanceof Projectile) return false;
        return super.collidesWithEntity(entity, world, x, y, z);
    }

    @Override
    public HitResult collisionRayTrace(World world, int x, int y, int z, Vec3 start, Vec3 end, boolean useSelectorBoxes) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        boolean isProjectile = false;

        for (int idx = 0; idx < Math.min(stackTrace.length, 20); idx++) {
            if (stackTrace[idx].getClassName().equals(Projectile.class.getName())) {
                isProjectile = true;
                break;
            }
        }

        return isProjectile ? null : super.collisionRayTrace(world, x, y, z, start, end, useSelectorBoxes);
    }
}
