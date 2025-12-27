package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.client.entity.particle.Particle;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;
import turniplabs.halplibe.helper.EnvironmentHelper;

public class BlockCloth extends BlockLogic {
    public BlockCloth(Block<?> block) {
        super(block, Material.cloth);
    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        if (!EnvironmentHelper.isServerEnvironment() && !entity.isSneaking() && !(entity instanceof Particle) && entity.yd < 0.0D) {
            world.playBlockSoundEffect(null, x, y, z, BonusBlocks.BLOCK_CLOTH, EnumBlockSoundEffectType.ENTITY_LAND);
            entity.yd = -entity.yd;
            entity.fallDistance = 0;
        }
    }

    @Override
    public AABB getCollisionBoundingBoxFromPool(WorldSource world, int x, int y, int z) {
        return AABB.getPermanentBB(x, y, z, (x + 1), y + 0.9F, (z + 1));
    }
}
