package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLeavesBase;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;
import net.minecraft.core.world.wind.WindManager;

import java.util.Random;

public class BlockLeavesOakMossy extends BlockLeavesBase {
    public BlockLeavesOakMossy(String key, int id) {
        super(key, id, Material.leaves, false);
    }

    protected Block getSapling() {
        return BonusBlocks.saplingOakMossy;
    }

    public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
        if (world.seasonManager.getCurrentSeason() != null && world.seasonManager.getCurrentSeason().hasFallingLeaves) {
            WindManager wind = world.getWorldType().getWindManager();
            float windIntensity = wind.getWindIntensity(world, (float)x, (float)y, (float)z);
            if (rand.nextInt((int)(40.0F + 200.0F * (1.0F - windIntensity))) == 0) {
                world.spawnParticle("fallingleaf", (double)x, (double)((float)y - 0.1F), (double)z, 0.0, 0.0, 0.0);
            }
        }
    }
}
