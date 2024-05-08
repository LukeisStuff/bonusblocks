package luke.bonusblocks.block.convert;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockPermafrostCarvedConvert extends Block {
    public BlockPermafrostCarvedConvert(String key, int id, Material material) {
        super(key, id, material);
        setTicking(true);
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
        if (rand.nextInt(2) == 0) {
            world.setBlockAndMetadataWithNotify(x, y, z, Block.permafrostCarved.id, world.getBlockMetadata(x, y, z));
        }
    }

}
