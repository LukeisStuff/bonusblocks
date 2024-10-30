package luke.bonusblocks.block;

import net.minecraft.core.block.TrapDoorBlock;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.WorldSource;

public class BlockTrapDoorObsidian extends TrapDoorBlock {
    public BlockTrapDoorObsidian(String key, String namespaceId, int id) {
        super(key, namespaceId, id, Material.glass);
    }


    public void setBlockBoundsBasedOnState(WorldSource world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        float thickness = 0.1875F;
        if (isTrapdoorOpen(meta)) {
            if ((meta & 3) == 0) {
                this.setBlockBounds(0.0, 0.0, 1.0F - thickness, 1.0, 1.0, 1.0);
            }

            if ((meta & 3) == 1) {
                this.setBlockBounds(0.0, 0.0, 0.0, 1.0, 1.0, thickness);
            }

            if ((meta & 3) == 2) {
                this.setBlockBounds(1.0F - thickness, 0.0, 0.0, 1.0, 1.0, 1.0);
            }

            if ((meta & 3) == 3) {
                this.setBlockBounds(0.0, 0.0, 0.0, thickness, 1.0, 1.0);
            }
        } else if (isUpperHalf(meta)) {
            this.setBlockBounds(0.0, 1.0F - thickness, 0.0, 1.0, 1.0, 1.0);
        } else {
            this.setBlockBounds(0.0, 0.0, 0.0, 1.0, thickness, 1.0);
        }

    }

    @Override
    public int getRenderLayer() {
        return 1;
    }

}
