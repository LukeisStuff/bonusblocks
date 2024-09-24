package luke.bonusblocks.block;

import net.minecraft.core.block.TrapDoorBlock;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

public class TrapDoorBlockStone extends TrapDoorBlock {

    public TrapDoorBlockStone(String key, String namespaceId, int id, Material material) {
        super(key, namespaceId, id, material);
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
    }

}
