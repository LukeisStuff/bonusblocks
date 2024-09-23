package luke.bonusblocks.block;

import net.minecraft.core.block.TrapDoorBlock;
import net.minecraft.core.block.material.Material;

public class BlockTrapDoorObsidian extends TrapDoorBlock {
    public BlockTrapDoorObsidian(String key, int id) {
        super(key, id, Material.glass, false);
    }
@Override
    public void setBlockBoundsForItemRender() {
        float offset = 0.1875F;
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, offset, 1.0F);
    }
@Override
    public void setBlockBoundsForBlockRender(int i) {
        float f = 0.1875F;
        if (isTrapdoorOpen(i)) {
            if ((i & 3) == 0) {
                this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
            }

            if ((i & 3) == 1) {
                this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
            }

            if ((i & 3) == 2) {
                this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            }

            if ((i & 3) == 3) {
                this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
            }
        } else if (isUpperHalf(i)) {
            this.setBlockBounds(0.0F, 1.0F - f, 0.0F, 1.0F, 1.0F, 1.0F);
        } else {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
        }
    }

    @Override
    public int getRenderLayer() {
        return 1;
    }

}
