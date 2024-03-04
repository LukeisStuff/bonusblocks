package luke.bonusblocks.block.copper;

import luke.bonusblocks.block.BonusBlocks;
import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.BlockDoor;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlockCopperDoor extends BlockDoor {

    public BlockCopperDoor(String key, int id, Material material, boolean isTop) {
        super(key, id, material, isTop);
        this.setTicking(true);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
            return new ItemStack[]{new ItemStack(BonusItems.doorCopper)};
        }
        return null;
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
        if (world.getBlockMetadata(x, y, z) == 0) {
            if (rand.nextInt(400) == 0) {
                if (isTop) {
                    world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.doorCopperTarnishedTop.id, world.getBlockMetadata(x, y, z));
                    world.setBlockAndMetadataWithNotify(x, y - 1, z, BonusBlocks.doorCopperTarnishedBottom.id, world.getBlockMetadata(x, y - 1, z));
                }
            }
        }
    }
}
