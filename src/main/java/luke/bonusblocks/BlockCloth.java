package luke.bonusblocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityItem;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

public class BlockCloth extends Block {
    public BlockCloth(String key, int id, Material material) {
        super(key, id, material);
    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        if (entity.yd < 0.0D) {
            entity.yd = -entity.yd;
        }
    }

        public AABB getCollisionBoundingBoxFromPool (World world,int x, int y, int z){
            float f = 0.5f;
            return AABB.getBoundingBoxFromPool((double) x, (double) y, (double) z, (double) (x + 1), (double) ((float) (y + 1) - f), (double) (z + 1));
        }
}
