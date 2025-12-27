package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicLog;
import net.minecraft.core.block.material.Material;

public class BlockBranch extends BlockLogicLog {
    public BlockBranch(Block<?> block, Material material) {
        super(block);
    }

    @Override
    public boolean isSolidRender() {
        return false;
    }

}
