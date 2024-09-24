package luke.bonusblocks.block.copper;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.ThinFenceBlock;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

import java.util.Random;

public class BlockFenceCopper extends ThinFenceBlock {
    public BlockFenceCopper(String key, String namespaceId, int id, Material material) {
        super(key, namespaceId, id, material);
        this.setTicking(true);
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
        if (rand.nextInt(200) == 0) {
            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.FENCE_COPPER.id, world.getBlockMetadata(x, y, z));
            }
        }
    }

    public boolean canConnectTo(WorldSource iblockaccess, int x, int y, int z) {
        int l = iblockaccess.getBlockId(x, y, z);
        return Block.hasTag(l, BlockTags.CHAINLINK_FENCES_CONNECT) || Block.blocksList[l] != null && (Block.blocksList[l].blockMaterial == Material.stone || Block.blocksList[l].blockMaterial == Material.metal);
    }

    public boolean isClimbable(World world, int x, int y, int z) {
        return true;
    }

    public boolean shouldDrawColumn(WorldSource world, int x, int y, int z) {
        boolean drawColumn = this.shouldDrawColumn_do(world, x, y, z);
        if (drawColumn) {
            return true;
        } else {
            int oy;
            for(oy = 1; world.getBlockId(x, y + oy, z) == this.id; ++oy) {
            }

            --oy;

            boolean drawColumnFromOther;
            for(drawColumnFromOther = false; world.getBlockId(x, y + oy, z) == this.id; --oy) {
                if (this.shouldDrawColumn_do(world, x, y + oy, z)) {
                    drawColumnFromOther = true;
                    break;
                }
            }

            return drawColumnFromOther;
        }
    }

    private boolean shouldDrawColumn_do(WorldSource world, int x, int y, int z) {
        boolean connectNorth = this.canConnectTo(world, x + Direction.NORTH.getOffsetX(), y + Direction.NORTH.getOffsetY(), z + Direction.NORTH.getOffsetZ());
        boolean connectSouth = this.canConnectTo(world, x + Direction.SOUTH.getOffsetX(), y + Direction.SOUTH.getOffsetY(), z + Direction.SOUTH.getOffsetZ());
        boolean connectEast = this.canConnectTo(world, x + Direction.EAST.getOffsetX(), y + Direction.EAST.getOffsetY(), z + Direction.EAST.getOffsetZ());
        boolean connectWest = this.canConnectTo(world, x + Direction.WEST.getOffsetX(), y + Direction.WEST.getOffsetY(), z + Direction.WEST.getOffsetZ());
        boolean lineNorthSouth = connectNorth && connectSouth;
        boolean lineEastWest = connectEast && connectWest;
        return !lineNorthSouth && !lineEastWest || lineNorthSouth && lineEastWest || lineNorthSouth && (connectEast || connectWest) || lineEastWest && (connectNorth || connectSouth);
    }

}
