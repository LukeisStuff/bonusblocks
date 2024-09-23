package luke.bonusblocks.block.copper;

import luke.bonusblocks.block.BonusBlocks;
import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.DoorBlock;
import net.minecraft.core.block.entity.BlockEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Random;
import java.util.function.Supplier;

public class CopperDoorBlock extends DoorBlock {

    public CopperDoorBlock(String key, String namespaceId, int id, Material material, boolean isTop, @Nullable Supplier<Item> droppedItem) {
        super(key, namespaceId, id, material, isTop, true, droppedItem);
        this.setTicking(true);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, BlockEntity BlockEntity) {
        if (this.blockMaterial == Material.stone && dropCause != EnumDropCause.IMPROPER_TOOL) {
            return new ItemStack[]{new ItemStack(BonusItems.DOOR_COPPER)};
        }
        return null;
    }

    public void updateTick(World world, int x, int y, int z, Random rand) {
            if (rand.nextInt(200) == 0) {
                if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water || (world.canBlockBeRainedOn(x, y + 1, z) && world.getCurrentWeather().isPrecipitation)) {
                    if (isTop) {
                        world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.DOOR_COPPER_TOP.id, world.getBlockMetadata(x, y, z));
                        world.setBlockAndMetadataWithNotify(x, y - 1, z, BonusBlocks.DOOR_COPPER_BOTTOM.id, world.getBlockMetadata(x, y - 1, z));
                    }
                }
            }
        }

}
