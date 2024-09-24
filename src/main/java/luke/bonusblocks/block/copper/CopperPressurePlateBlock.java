package luke.bonusblocks.block.copper;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.PressurePlateBlock;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

import java.util.List;
import java.util.Random;

public class CopperPressurePlateBlock extends PressurePlateBlock {
    private final Class<? extends Entity> triggerMobClass;
    public CopperPressurePlateBlock(String key, String namespaceId, int id, Class<? extends Entity> mobType) {
        super(key, namespaceId, id, mobType, Material.metal);
        this.triggerMobClass = mobType;
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random rand) {
            if (rand.nextInt(200) == 0) {
                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.PRESSURE_PLATE_COPPER.id, world.getBlockMetadata(x, y, z));
                }
            }
        if (!world.isClientSide) {
            if (this.isPressed(world.getBlockMetadata(x, y, z))) {
                this.updateState(world, x, y, z);
            }

        }
        if (world.getBlockMetadata(x, y, z) != 0) {
            this.updateState(world, x, y, z);
        }
    }

    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        if (!world.isClientSide) {
            if (!this.isPressed(world.getBlockMetadata(x, y, z))) {
                this.updateState(world, x, y, z);
            }

        }
    }

    private void updateState(World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        boolean isPressed = this.isPressed(meta);
        boolean isCeiling = (meta & 2) != 0;
        boolean isSteppedOn = false;
        float f = 0.125F;
        List<Entity> list = world.getEntitiesWithinAABB(this.triggerMobClass, AABB.getTemporaryBB((float)x + f, (float)y + (isCeiling ? 0.85F : 0.0F), (float)z + f, (float)(x + 1) - f, (double)y + (isCeiling ? 1.0 : 0.25), (float)(z + 1) - f));
        if (list != null && !list.isEmpty()) {
            isSteppedOn = true;
        }

        if (isSteppedOn && !isPressed) {
            world.setBlockMetadataWithNotify(x, y, z, meta | 1);
            world.notifyBlocksOfNeighborChange(x, y, z, this.id);
            world.notifyBlocksOfNeighborChange(x, y + (isCeiling ? 1 : -1), z, this.id);
            world.markBlocksDirty(x, y, z, x, y, z);
            world.playSoundEffect(null, SoundCategory.WORLD_SOUNDS, (double)x + 0.5, (double)y + 0.1, (double)z + 0.5, "random.click", 0.3F, 0.6F);
        }

        if (!isSteppedOn && isPressed) {
            world.setBlockMetadataWithNotify(x, y, z, meta & 2);
            world.notifyBlocksOfNeighborChange(x, y, z, this.id);
            world.notifyBlocksOfNeighborChange(x, y + (isCeiling ? 1 : -1), z, this.id);
            world.markBlocksDirty(x, y, z, x, y, z);
            world.playSoundEffect(null, SoundCategory.WORLD_SOUNDS, (double)x + 0.5, (double)y + 0.1, (double)z + 0.5, "random.click", 0.3F, 0.5F);
        }

        if (isSteppedOn) {
            world.scheduleBlockUpdate(x, y, z, this.id, this.tickDelay());
        }

    }
}
