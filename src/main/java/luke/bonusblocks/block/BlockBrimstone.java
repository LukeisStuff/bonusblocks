package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;

public class BlockBrimstone extends Block {
    public BlockBrimstone(String key, int id, Material material) {
        super(key, id, material);
    }

    public int getPistonPushReaction() {
        return this.blockMaterial.getPushReaction();
    }

}
