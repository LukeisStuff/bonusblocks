package luke.bonusblocks.block.copper;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.PressurePlateBlock;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityItem;
import net.minecraft.core.entity.ItemEntity;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

import java.util.List;
import java.util.Random;

public class CopperPressurePlateBlock extends PressurePlateBlock {
    public CopperPressurePlateBlock(String key, int id, Material material) {
        super(key, id, null, material);
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random rand) {
            if (rand.nextInt(200) == 0) {
                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.pressureplateCopperTarnished.id, world.getBlockMetadata(x, y, z));
                }
            }
        if (world.isClientSide) {
            return;
        }
        if (world.getBlockMetadata(x, y, z) != 0) {
            this.updateState(world, x, y, z);
        }
    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        if (world.isClientSide) {
            return;
        }
        if (world.getBlockMetadata(x, y, z) != 1) {
            this.updateState(world, x, y, z);
        }
    }

    private void updateState(World world, int x, int y, int z) {
        boolean isPressed = world.getBlockMetadata(x, y, z) == 1;
        boolean isSteppedOn = false;
        float f = 0.125f;
        List<Entity> list = world.getEntitiesWithinAABB(ItemEntity.class, AABB.getPermanentBB((float)x + f, y, (float)z + f, (float)(x + 1) - f, (double)y + 0.25, (float)(z + 1) - f));
        if (list != null && !list.isEmpty()) {
            isSteppedOn = true;
        }
        if (isSteppedOn && !isPressed) {
            world.setBlockMetadataWithNotify(x, y, z, 1);
            world.notifyBlocksOfNeighborChange(x, y, z, this.id);
            world.notifyBlocksOfNeighborChange(x, y - 1, z, this.id);
            world.markBlocksDirty(x, y, z, x, y, z);
            world.playSoundEffect(null, SoundCategory.WORLD_SOUNDS, (double)x + 0.5, (double)y + 0.1, (double)z + 0.5, "random.click", 0.3f, 0.6f);
        }
        if (!isSteppedOn && isPressed) {
            world.setBlockMetadataWithNotify(x, y, z, 0);
            world.notifyBlocksOfNeighborChange(x, y, z, this.id);
            world.notifyBlocksOfNeighborChange(x, y - 1, z, this.id);
            world.markBlocksDirty(x, y, z, x, y, z);
            world.playSoundEffect(null, SoundCategory.WORLD_SOUNDS, (double)x + 0.5, (double)y + 0.1, (double)z + 0.5, "random.click", 0.3f, 0.5f);
        }
        if (isSteppedOn) {
            world.scheduleBlockUpdate(x, y, z, this.id, this.tickDelay());
        }
    }
}
