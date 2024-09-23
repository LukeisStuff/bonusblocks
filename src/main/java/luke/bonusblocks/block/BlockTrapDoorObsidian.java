package luke.bonusblocks.block;

import net.minecraft.core.block.TrapDoorBlock;
import net.minecraft.core.block.material.Material;

public class BlockTrapDoorObsidian extends TrapDoorBlock {
    public BlockTrapDoorObsidian(String key, String namespaceId, int id) {
        super(key, namespaceId, id, Material.glass);
    }

@Override
public void setBlockBoundsForBlockRender(int i) {
    float f = 0.1875F;
    if (isTrapdoorOpen(i)) {
        if ((i & 3) == 0) {
            this.setBlockBounds(0.0, 0.0, 1.0F - f, 1.0, 1.0, 1.0);
        }

        if ((i & 3) == 1) {
            this.setBlockBounds(0.0, 0.0, 0.0, 1.0, 1.0, f);
        }

        if ((i & 3) == 2) {
            this.setBlockBounds(1.0F - f, 0.0, 0.0, 1.0, 1.0, 1.0);
        }

        if ((i & 3) == 3) {
            this.setBlockBounds(0.0, 0.0, 0.0, f, 1.0, 1.0);
        }
    } else if (isUpperHalf(i)) {
        this.setBlockBounds(0.0, 1.0F - f, 0.0, 1.0, 1.0, 1.0);
    } else {
        this.setBlockBounds(0.0, 0.0, 0.0, 1.0, f, 1.0);
    }

}

    @Override
    public int getRenderLayer() {
        return 1;
    }

}
