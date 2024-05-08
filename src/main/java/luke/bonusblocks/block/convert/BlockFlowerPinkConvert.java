package luke.bonusblocks.block.convert;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockFlower;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockFlowerPinkConvert extends BlockFlower {
    public BlockFlowerPinkConvert(String key, int id) {
        super(key, id);
        setTicking(true);
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
        if (rand.nextInt(2) == 0) {
            world.setBlockAndMetadataWithNotify(x, y, z, Block.flowerPink.id, world.getBlockMetadata(x, y, z));
        }
    }

    public void onBlockPlaced(World world, int x, int y, int z, Side side, EntityLiving entity, double sideHeight) {
        world.setBlockAndMetadataWithNotify(x, y, z, Block.flowerPink.id, world.getBlockMetadata(x, y, z));
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return new ItemStack[]{new ItemStack(Block.flowerPink)};
    }

}
