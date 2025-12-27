package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicFenceThin;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

public class BlockFenceNoClimb extends BlockLogicFenceThin {
    public BlockFenceNoClimb(Block<?> block) {
        super(block, Material.metal);
    }

    public boolean canConnectTo(WorldSource world, int x, int y, int z) {
        Block<?> b = world.getBlock(x, y, z);
        return BlockTags.CHAINLINK_FENCES_CONNECT.appliesTo(b) || b != null && (b.getMaterial().isStone() || b.getMaterial().isMetal());
    }

    @Override
    public boolean isClimbable(World world, int x, int y, int z) {
        return false;
    }
}
