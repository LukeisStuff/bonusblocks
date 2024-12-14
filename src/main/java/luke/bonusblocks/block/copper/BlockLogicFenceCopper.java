package luke.bonusblocks.block.copper;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicFenceThin;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

import java.util.Random;

public class BlockLogicFenceCopper extends BlockLogicFenceThin {
    public BlockLogicFenceCopper(Block<?> block) {
        super(block, Material.metal);
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
        if (rand.nextInt(200) == 0) {
            if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.FENCE_COPPER.id(), world.getBlockMetadata(x, y, z));
            }
        }
    }

    public boolean canConnectTo(WorldSource world, int x, int y, int z) {
        Block<?> b = world.getBlock(x, y, z);
        return BlockTags.CHAINLINK_FENCES_CONNECT.appliesTo(b) || b != null && (b.getMaterial().isStone() || b.getMaterial().isMetal());
    }

    public boolean isClimbable(World world, int x, int y, int z) {
        return true;
    }

}
