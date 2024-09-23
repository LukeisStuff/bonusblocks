package luke.bonusblocks.block.blockmodel;

import net.minecraft.core.block.Block;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.BlockItem;
import net.minecraft.core.util.helper.DyeColor;

public class ItemBlockStairsWool extends BlockItem {
    public ItemBlockStairsWool(Block block) {
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    public int getPlacedBlockMetadata(int i) {
        return i;
    }

    public String getLanguageKey(ItemStack itemstack) {
        return this.upperMetadata ? super.getKey() + "." + DyeColor.colorFromBlockMeta((itemstack.getMetadata() & 240) >> 4).colorID : super.getKey() + "." + DyeColor.colorFromBlockMeta(itemstack.getMetadata() & 15).colorID;
    }
}
