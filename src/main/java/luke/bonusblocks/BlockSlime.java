package luke.bonusblocks;

import net.minecraft.core.block.BlockTransparent;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

public class BlockSlime extends BlockTransparent {
    public BlockSlime(String key, int id, boolean renderInside){
        super(key, id, Material.leaves, false);
        setTicking(true);
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean shouldSideBeRendered(WorldSource blockAccess, int x, int y, int z, int side) {
        return super.shouldSideBeRendered(blockAccess, x, y, z, 1 - side);
    }

    public int getRenderBlockPass() {
        return 1;
    }
    public int getMobilityFlag() {
        return 0;
    }

    public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        float f = 0.125F;
        return AABB.getBoundingBoxFromPool((double)(float)(x + f), (double)(float)(y + f), (double)(float)(z + f), (double)((float)(x + 1) - f), (double)((float)(y + 1) - f), (double)((float)(z + 1) - f));
    }

    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        entity.xd *= 0.4;
        entity.yd *= 0.1;
        entity.zd *= 0.4;
        if (entity.fallDistance > 1.5F) {
            entity.fallDistance = 0.0F;
            world.playBlockSoundEffect(x, y, z, BonusBlocks.blockSlime, EnumBlockSoundEffectType.ENTITY_LAND);
        }
    }
}