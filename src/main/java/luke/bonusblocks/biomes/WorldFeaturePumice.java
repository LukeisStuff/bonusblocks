package luke.bonusblocks.biomes;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;

import java.util.Random;

public class WorldFeaturePumice extends WorldFeature {
    public WorldFeaturePumice() {
    }

    public boolean generate(World world, Random random, int x, int y, int z) {
        if (world.getBlockId(x, y - 1, z) != Block.fluidLavaStill.id) {
            return false;
        } else {
            for(int l = 0; l < 16; ++l) {
                int i1 = x + random.nextInt(8) - random.nextInt(8);

                int k1;
                for(k1 = z + random.nextInt(8) - random.nextInt(8); world.getBlockId(i1, y - 1, k1) == Block.fluidLavaStill.id; --y) {
                }

                if ((world.getBlockId(i1, y - 1, k1) == Block.netherrack.id
                        || world.getBlockId(i1, y - 1, k1) == Block.soulsand.id
                        || world.getBlockId(i1, y - 1, k1) == BonusBlocks.netherrack.id
                        || world.getBlockId(i1, y - 1, k1) == BonusBlocks.cobblednetherrack.id
                        || world.getBlockId(i1, y - 1, k1) == BonusBlocks.soulslate.id) && world.getBlockId(i1, y + 1, k1) != 0) {
                    world.setBlockRaw(i1, y, k1, BonusBlocks.pumiceWet.id);
                }
            }

            return true;
        }
    }
}
