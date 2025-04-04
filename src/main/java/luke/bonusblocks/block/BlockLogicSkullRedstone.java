package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicRotatable;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.material.MaterialColor;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

public class BlockLogicSkullRedstone extends BlockLogicRotatable {

    public BlockLogicSkullRedstone(Block<?> block) {
        super(block, Material.stone);
        block.setTicking(true);
        block.withOverrideColor(MaterialColor.paintedSilver);
    }

    public void onBlockPlacedByWorld(World world, int x, int y, int z) {
        Side[] var5 = Side.sides;

        for (Side s : var5) {
            world.notifyBlocksOfNeighborChange(x + s.getOffsetX(), y + s.getOffsetY(), z + s.getOffsetZ(), this.id());
        }

    }

    public void onBlockRemoved(World world, int x, int y, int z, int data) {
        Side[] var6 = Side.sides;

        for (Side s : var6) {
            world.notifyBlocksOfNeighborChange(x + s.getOffsetX(), y + s.getOffsetY(), z + s.getOffsetZ(), this.id());
        }

    }

    public boolean getDirectSignal(World world, int x, int y, int z, Side side) {
        return this.getSignal(world, x, y, z, side);
    }

    public boolean getSignal(WorldSource worldSource, int x, int y, int z, Side side) {
        if (!side.isHorizontal()) {
            return false;
        } else {
            Side mySide = Side.getSideById(worldSource.getBlockMetadata(x, y, z));
            return mySide == side.getOpposite();
        }
    }

    public boolean isSignalSource() {
        return true;
    }

    public int getPistonPushReaction(World world, int x, int y, int z) {
        return 0;
    }
}
