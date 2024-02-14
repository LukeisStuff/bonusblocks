package luke.bonusblocks.block;

import net.minecraft.core.block.BlockDoor;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

import static luke.bonusblocks.BonusBlocks.doorCopperCorroded;

public class BlockCopperCorrodedDoor extends BlockDoor {
    protected int ticks;
    public BlockCopperCorrodedDoor(String key, int id, Material material, boolean isTop) {
        super(key, id, material, isTop);
        this.setTicking(true);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
            return new ItemStack[]{new ItemStack(doorCopperCorroded)};
        }
        return null;
    }
}
