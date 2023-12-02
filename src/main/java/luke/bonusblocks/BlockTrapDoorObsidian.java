package luke.bonusblocks;

import net.minecraft.core.block.BlockTrapDoor;
import net.minecraft.core.block.material.Material;

public class BlockTrapDoorObsidian extends BlockTrapDoor {
    public BlockTrapDoorObsidian(String key, int id, Material material, boolean renderInside) {
        super(key, id, Material.glass, false);
    }
    @Override
    public int getRenderBlockPass() {
        return 1;
    }
}
