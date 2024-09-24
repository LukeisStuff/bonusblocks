package luke.bonusblocks.block.blockmodel;

import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.BlockItem;
import net.minecraft.core.util.helper.DyeColor;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class BlockItemStairsWool extends BlockItem {
    public BlockItemStairsWool(Block block) {
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    public int getPlacedBlockMetadata(Player player, ItemStack stack, World world, int x, int y, int z, Side side, double xPlaced, double yPlaced) {
        return stack.getMetadata();
    }

    public String getLanguageKey(ItemStack itemstack) {
        return super.getKey() + "." + DyeColor.colorFromBlockMeta((itemstack.getMetadata() & 240) >> 4).colorID;
    }
}
