package luke.bonusblocks.block.copper;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicPressurePlate;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Entity;

public class CopperPressurePlateBlock<T extends Entity> extends BlockLogicPressurePlate<T> {
    public CopperPressurePlateBlock(Block<?> block, Class<T> mobType, Material material) {
        super(block, mobType, material);
        block.setTicking(true);
        float pixel = 0.0625F;
        this.setBlockBounds(pixel, 0.0, pixel, 1.0F - pixel, pixel / 2.0F, 1.0F - pixel);
    }

}
