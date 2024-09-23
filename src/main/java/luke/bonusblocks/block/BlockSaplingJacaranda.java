package luke.bonusblocks.block;

import net.minecraft.core.block.SaplingBaseBlock;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeFancy;

import java.util.Random;

public class BlockSaplingJacaranda extends SaplingBaseBlock {
    public BlockSaplingJacaranda(String key, String namespaceId, int id) {
        super(key, namespaceId, id);
    }

    public void growTree(World world, int i, int j, int k, Random random) {
        WorldFeature obj;
        world.setBlock(i, j, k, 0);
        obj = new WorldFeatureTreeFancy(BonusBlocks.LEAVES_JACARANDA.id, BonusBlocks.LOG_JACARANDA.id, 100);;
        if (!obj.place(world, random, i, j, k)) {
            world.setBlock(i, j, k, this.id);
        }

    }
}
