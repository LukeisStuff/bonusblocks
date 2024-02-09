package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLeavesBase;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;
import net.minecraft.core.world.wind.WindManager;

import java.util.Random;

public class BlockLeavesMaple extends BlockLeavesBase {
    public BlockLeavesMaple(String key, int id) {
        super(key, id, Material.leaves, false);
    }

    protected Block getSapling() {
        return BonusBlocks.saplingMaple;
    }
}
