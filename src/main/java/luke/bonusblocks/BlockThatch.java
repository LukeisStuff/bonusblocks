package luke.bonusblocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

public class BlockThatch extends Block {
    public BlockThatch(String key, int id, Material material) {
        super(key, id, material);
    }

    public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        return AABB.getBoundingBoxFromPool((double)x, (double)y, (double)z, (double)(x + 1), (double)((float)(y + 0.5)), (double)(z + 1));
    }

    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        if (entity.yd < 0.0) {
            entity.fallDistance = 0.0F;
        }
    }
}
