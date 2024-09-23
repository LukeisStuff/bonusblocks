package luke.bonusblocks.block;

import net.minecraft.core.block.TransparentBlock;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

public class BlockSlime extends TransparentBlock {
    public BlockSlime(String key, String namespaceId, int id, Material material) {
        super(key, namespaceId, id, material);
        setTicking(true);
    }

    public boolean isSolidRender() {
        return false;
    }

    public boolean shouldSideBeRendered(WorldSource blockAccess, int x, int y, int z, int side) {
        return super.shouldSideBeRendered(blockAccess, x, y, z, 1 - side);
    }

    public int getRenderLayer() {
        return 1;
    }

    public AABB getCollisionBoundingBoxFromPool(WorldSource world, int x, int y, int z) {
        float f = 0.125F;
        return AABB.getPermanentBB(x + f, y + f, z + f, (float)(x + 1) - f, (float)(y + 1) - f, (float)(z + 1) - f);
    }

    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        entity.xd *= 0.4;
        entity.yd *= 0.1;
        entity.zd *= 0.4;
        if (entity.fallDistance > 1.5F) {
            entity.fallDistance = 0.0F;
            world.playBlockSoundEffect((Entity)null, x, y, z, BonusBlocks.BLOCK_SLIME, EnumBlockSoundEffectType.ENTITY_LAND);
        }
    }
}