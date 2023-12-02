package luke.bonusblocks;

import net.minecraft.core.block.BlockTrapDoor;
import net.minecraft.core.block.material.Material;

public class BlockTrapDoorTinted extends BlockTrapDoor {
    public BlockTrapDoorTinted(String key, int id, Material material, boolean renderInside) {
        super(key, id, Material.glass, false);
    }

    @Override
    public boolean blocksLight() {
        return true;
    }

    @Override
    public int getRenderBlockPass() {
        return 1;
    }
}
