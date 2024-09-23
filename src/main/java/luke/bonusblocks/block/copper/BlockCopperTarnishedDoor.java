package luke.bonusblocks.block.copper;

import luke.bonusblocks.block.BonusBlocks;
import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.BlockDoor;
import net.minecraft.core.block.entity.BlockEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

import java.util.Random;

public class BLOCK_COPPERTarnishedDoor extends BlockDoor {
    public BLOCK_COPPERTarnishedDoor(String key, int id, Material material, boolean isTop) {
        super(key, id, material, isTop);
        this.setTicking(true);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, BlockEntity BlockEntity) {
        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
            return new ItemStack[]{new ItemStack(BonusItems.doorCopperTarnished)};
        }
        return null;
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
            if (rand.nextInt(200) == 0) {
                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                    if (isTop) {
                        world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.doorCopperCorrodedTop.id, world.getBlockMetadata(x, y, z));
                        world.setBlockAndMetadataWithNotify(x, y-1, z, BonusBlocks.doorCopperCorrodedBottom.id, world.getBlockMetadata(x, y-1, z));
                    }
                }
        }
    }
}
