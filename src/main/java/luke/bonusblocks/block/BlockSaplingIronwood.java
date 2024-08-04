package luke.bonusblocks.block;

import net.minecraft.core.block.BlockSaplingBase;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeFancy;

import java.util.Random;

public class BlockSaplingIronwood extends BlockSaplingBase {
    public BlockSaplingIronwood(String key, int id) {
        super(key, id);
    }

    public void growTree(World world, int i, int j, int k, Random random) {
        WorldFeature treeBig = new WorldFeatureTreeFancy(BonusBlocks.leavesMaple.id, BonusBlocks.logMaple.id);
        world.setBlock(i, j, k, 0);
        if (!treeBig.generate(world, random, i, j, k)) {
            world.setBlock(i, j, k, this.id);
        }

    }
}
