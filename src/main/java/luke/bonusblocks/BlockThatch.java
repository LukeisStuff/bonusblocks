package luke.bonusblocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

public class BlockThatch extends Block {
    public BlockThatch(String key, int id, Material material) {
        super(key, id, material);
    }

    public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        return AABB.getBoundingBoxFromPool((double)x, (double)y, (double)z, (double)(x + 1), (double)y, (double)(z + 1));
    }

    public int getMobilityFlag() {
        return 1;
    }
    public boolean renderAsNormalBlock() {
        return false;
    }

    public boolean shouldSideBeRendered(WorldSource blockAccess, int x, int y, int z, int side) {
        return super.shouldSideBeRendered(blockAccess, x, y, z, 1 - side);
    }

    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        entity.xd *= 0.2;
        entity.zd *= 0.2;
        if (entity.yd < 0.0) {
            entity.yd *= 0.2;
            entity.fallDistance *= 0.0F;
        }
    }

}