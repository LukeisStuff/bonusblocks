package luke.bonusblocks.block.silver;

import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.BlockEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

import java.util.HashMap;
import java.util.Map;

public class SilverOreBlock extends Block {
    public static Map<Integer, Integer> variantMap = new HashMap<>();

    public SilverOreBlock(String key, String namespaceId, int id, int parentId, Material material) {
        super(key, namespaceId, id, material);
        variantMap.put(parentId, id);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, BlockEntity blockEntity) {
        switch (dropCause) {
            case SILK_TOUCH:
            case PICK_BLOCK:
                return new ItemStack[]{new ItemStack(this)};
            case EXPLOSION:
            case PROPER_TOOL:
                return new ItemStack[]{new ItemStack(BonusItems.ORE_RAW_SILVER, 1 + world.rand.nextInt(2))};
            default:
                return null;
        }
    }
}
