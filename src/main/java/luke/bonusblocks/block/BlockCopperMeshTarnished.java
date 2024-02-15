package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.BlockTransparent;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockCopperMeshTarnished extends BlockTransparent {
    protected int ticks;
    public BlockCopperMeshTarnished(String key, int id, Material material, boolean renderInside) {
        super(key, id, material, renderInside);
        this.setTicking(true);
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
        if (world.getBlockMetadata(x, y, z) == 0) {
            ++this.ticks;
            if (this.ticks == 200) {
                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.meshCopperCorroded.id, 0);
                this.ticks = 0;
            }
        }
    }

}
