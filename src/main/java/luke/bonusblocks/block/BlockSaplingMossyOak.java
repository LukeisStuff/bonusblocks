package luke.bonusblocks.block;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.SaplingBaseBlock;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShapeSwamp;

import java.util.Random;

public class BlockSaplingMossyOak extends SaplingBaseBlock {
    public BlockSaplingMossyOak(String key, String namespaceId, int id) {
        super(key, namespaceId, id);
    }

    public void growTree(World world, int i, int j, int k, Random random) {
        WorldFeature obj;
        world.setBlock(i, j, k, 0);
        obj = new WorldFeatureTreeShapeSwamp(BonusBlocks.LEAVES_OAK_MOSSY.id, Blocks.LOG_OAK_MOSSY.id, 6);
        if (!obj.place(world, random, i, j, k)) {
            world.setBlock(i, j, k, this.id);
        }

    }
}