package luke.bonusblocks.block.blockmodel;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockWool;
import net.minecraft.core.item.ItemDye;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.ItemBlock;

public class ItemBlockStairsWool extends ItemBlock {
    public ItemBlockStairsWool(Block block) {
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    public int getPlacedBlockMetadata(int i) {
        return i;
    }

    public String getLanguageKey(ItemStack itemstack) {
        return super.getKey() + "." + ItemDye.dyeColors[BlockWool.func_21034_c((itemstack.getMetadata() & 240) >> 4)];
    }
}
