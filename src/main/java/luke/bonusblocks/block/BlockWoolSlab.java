package luke.bonusblocks.block;

import net.minecraft.core.Global;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockSlabPainted;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

public class BlockWoolSlab extends BlockSlabPainted {
    public static final int[] texCoords = new int[16];

    public BlockWoolSlab(Block modelBlock, int id) {
        super(modelBlock, id);
    }

    public int getBlockTextureFromSideAndMetadata(Side side, int meta) {
        meta >>= 4;
        return texCoords[meta & 15];
    }

    public int getBlockTexture(WorldSource blockAccess, int x, int y, int z, Side side) {
        return this.getBlockTextureFromSideAndMetadata(side, blockAccess.getBlockMetadata(x, y, z));
    }

    public void onBlockPlaced(World world, int x, int y, int z, Side side, EntityLiving entity, double sideHeight) {
        int meta = entity.getVerticalPlacementDirection(side, sideHeight) == Direction.UP ? 2 : 0;
        world.setBlockMetadataWithNotify(x, y, z, meta | world.getBlockMetadata(x, y, z) & 240);
    }

}
