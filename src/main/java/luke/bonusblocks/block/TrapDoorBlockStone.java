package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.TrapDoorBlock;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

public class TrapDoorBlockStone extends TrapDoorBlock {

    public TrapDoorBlockStone(String key, String namespaceId, int id, Material material) {
        super(key, namespaceId, id, material);
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
        int meta;
        boolean isOpened;
        if (world.isClientSide) {
            return;
        }
        if ((blockId > 0 && Block.getBlock(blockId).canProvidePower()) && (isOpened = TrapDoorBlock.isTrapdoorOpen(meta = world.getBlockMetadata(x, y, z)))) {
            world.setBlockMetadataWithNotify(x, y, z, meta ^ 4);
            world.playSoundEffect(null, 1003, x, y, z, 0);
        }
    }

}
