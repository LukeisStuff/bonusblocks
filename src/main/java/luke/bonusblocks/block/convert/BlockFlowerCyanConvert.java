package luke.bonusblocks.block.convert;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockFlower;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockFlowerCyanConvert extends BlockFlower {
    public BlockFlowerCyanConvert(String key, int id) {
        super(key, id);
        setTicking(true);
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
        if (rand.nextInt(2) == 0) {
            world.setBlockAndMetadataWithNotify(x, y, z, Block.flowerLightBlue.id, world.getBlockMetadata(x, y, z));
        }
    }

}
