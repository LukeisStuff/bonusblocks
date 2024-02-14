package luke.bonusblocks.block;

import net.minecraft.core.block.BlockDoor;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

import java.util.Random;

import static luke.bonusblocks.BonusBlocks.*;
import static luke.bonusblocks.BonusBlocks.doorCopperTarnishedBottom;

public class BlockCopperTarnishedDoor extends BlockDoor {
    protected int ticks;
    public BlockCopperTarnishedDoor(String key, int id, Material material, boolean isTop) {
        super(key, id, material, isTop);
        this.setTicking(true);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
            return new ItemStack[]{new ItemStack(doorCopperTarnished)};
        }
        return null;
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
        if (world.getBlockMetadata(x, y, z) >= 0) {
            ++this.ticks;
            if (this.ticks == 200) {
                if (isTop) {
                    world.setBlockAndMetadataWithNotify(x, y, z, doorCopperCorrodedTop.id, world.getBlockMetadata(x, y, z));
                    world.setBlockAndMetadataWithNotify(x, y-1, z, doorCopperCorrodedBottom.id, world.getBlockMetadata(x, y-1, z));
                }
                this.ticks = 0;
            }
        }
    }
}
