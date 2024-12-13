package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicTrapDoor;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

public class TrapDoorBlockStone extends BlockLogicTrapDoor {

    public TrapDoorBlockStone(Block<?> block, Material material) {
        super(block, material);
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
    }

}
