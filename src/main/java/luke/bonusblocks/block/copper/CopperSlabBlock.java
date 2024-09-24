package luke.bonusblocks.block.copper;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.SlabBlock;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import java.util.Random;

public class CopperSlabBlock extends SlabBlock {
    public Block modelBlock;
    public int modelBlockMetadata;

    public CopperSlabBlock(Block modelBlock, String namespaceId, int id) {
        super(modelBlock, namespaceId, id);
    }

    public CopperSlabBlock(Block modelBlock, String namespaceId, int id, int modelBlockMetadata) {
        super(modelBlock, namespaceId, id, modelBlockMetadata);
    }

    public void onBlockPlaced(World world, int x, int y, int z, Side side, Mob entity, double sideHeight) {
        int meta = entity.getVerticalPlacementDirection(side, sideHeight) == Direction.UP ? 2 : 0;
        world.setBlockMetadataWithNotify(x, y, z, meta | world.getBlockMetadata(x, y, z) & 60);
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
        int meta = world.getBlockMetadata(x, y, z);
        if (world.getBlockMetadata(x, y, z) == 0) {
            if (rand.nextInt(200) == 0) {
                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                    world.setBlockAndMetadataWithNotify(x, y, z, this.id, meta + 16);
                }
            }
        }
        if (world.getBlockMetadata(x, y, z) == 16) {
            if (rand.nextInt(200) == 0) {
                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                    world.setBlockAndMetadataWithNotify(x, y, z, this.id, meta + 16);
                }
            }
        }
        if (world.getBlockMetadata(x, y, z) == 32) {
            if (rand.nextInt(200) == 0) {
                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                    world.setBlockAndMetadataWithNotify(x, y, z, this.id, meta + 16);
                }
            }
        }


        if (world.getBlockMetadata(x, y, z) == 1) {
            if (rand.nextInt(200) == 0) {
                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                    world.setBlockAndMetadataWithNotify(x, y, z, this.id, meta + 16);
                }
            }
        }
        if (world.getBlockMetadata(x, y, z) == 17) {
            if (rand.nextInt(200) == 0) {
                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                    world.setBlockAndMetadataWithNotify(x, y, z, this.id, meta + 16);
                }
            }
        }
        if (world.getBlockMetadata(x, y, z) == 33) {
            if (rand.nextInt(200) == 0) {
                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                    world.setBlockAndMetadataWithNotify(x, y, z, this.id, meta + 16);
                }
            }
        }


        if (world.getBlockMetadata(x, y, z) == 2) {
            if (rand.nextInt(200) == 0) {
                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                    world.setBlockAndMetadataWithNotify(x, y, z, this.id, meta + 16);
                }
            }
        }
        if (world.getBlockMetadata(x, y, z) == 18) {
            if (rand.nextInt(200) == 0) {
                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                    world.setBlockAndMetadataWithNotify(x, y, z, this.id, meta + 16);
                }
            }
        }
        if (world.getBlockMetadata(x, y, z) == 34) {
            if (rand.nextInt(200) == 0) {
                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                    world.setBlockAndMetadataWithNotify(x, y, z, this.id, meta + 16);
                }
            }
        }

    }
}
