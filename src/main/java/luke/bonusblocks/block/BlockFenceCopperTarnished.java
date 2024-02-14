package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockFenceThin;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;
import turniplabs.halplibe.helper.TextureHelper;

import java.util.Random;

import static luke.bonusblocks.BonusBlocks.MOD_ID;

public class BlockFenceCopperTarnished extends BlockFenceThin {
    protected int ticks;
    public BlockFenceCopperTarnished(String key, int id, Material material) {
        super(key, id, material);
        this.setTicking(true);
    }

    public int getTextureIndex() {
        return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "tarnishedcopperframe.png");
    }

    public int getTextureIndexAtBottom() {
        return -1;
    }
    public int getTextureIndexAtTop() {
        return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "tarnishedcopperfence.png");
    }

    public int getColumnTextureIndex() {
        return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "tarnishedcopperrod.png");
    }

    public boolean canConnectTo(WorldSource iblockaccess, int x, int y, int z) {
        int l = iblockaccess.getBlockId(x, y, z);
        return Block.hasTag(l, BlockTags.CHAINLINK_FENCES_CONNECT) || Block.blocksList[l] != null && (Block.blocksList[l].blockMaterial == Material.stone || Block.blocksList[l].blockMaterial == Material.metal);
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
        if (world.getBlockMetadata(x, y, z) >= 0) {
            ++this.ticks;
            if (this.ticks == 200) {
                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.fenceCopperCorroded.id, world.getBlockMetadata(x, y, z));
                this.ticks = 0;
            }
        }
    }

    public boolean isClimbable(World world, int x, int y, int z) {
        return true;
    }

    public boolean shouldDrawColumn(World world, int x, int y, int z) {
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

    private boolean shouldDrawColumn_do(World world, int x, int y, int z) {
        boolean connectNorth = this.canConnectTo(world, x + Direction.NORTH.getOffsetX(), y + Direction.NORTH.getOffsetY(), z + Direction.NORTH.getOffsetZ());
        boolean connectSouth = this.canConnectTo(world, x + Direction.SOUTH.getOffsetX(), y + Direction.SOUTH.getOffsetY(), z + Direction.SOUTH.getOffsetZ());
        boolean connectEast = this.canConnectTo(world, x + Direction.EAST.getOffsetX(), y + Direction.EAST.getOffsetY(), z + Direction.EAST.getOffsetZ());
        boolean connectWest = this.canConnectTo(world, x + Direction.WEST.getOffsetX(), y + Direction.WEST.getOffsetY(), z + Direction.WEST.getOffsetZ());
        boolean lineNorthSouth = connectNorth && connectSouth;
        boolean lineEastWest = connectEast && connectWest;
        return !lineNorthSouth && !lineEastWest || lineNorthSouth && lineEastWest || lineNorthSouth && (connectEast || connectWest) || lineEastWest && (connectNorth || connectSouth);
    }
}
