package luke.bonusblocks.block;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicVeryRotatable;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.material.MaterialColor;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class BlockLogicSkull extends BlockLogicVeryRotatable {
    private final boolean isCarvable;

    public BlockLogicSkull(Block<?> block, boolean isCarvable) {
        super(block, Material.stone);
        block.setTicking(true);
        this.isCarvable = isCarvable;
        block.withOverrideColor(MaterialColor.paintedSilver);
    }

    public boolean onBlockRightClicked(World world, int x, int y, int z, Player player, Side side, double xPlaced, double yPlaced) {
        if (!this.isCarvable) {
            return false;
        } else {
            ItemStack heldItem = player.getHeldItem();
            if (heldItem != null && heldItem.getItem() instanceof ItemToolPickaxe) {
                heldItem.damageItem(1, player);
                world.setBlockAndMetadataWithNotify(x, y, z, BonusBlocks.SKULL_CARVED_IDLE.id(), player.getHorizontalPlacementDirection(Direction.getHorizontalDirection(player).getSide()).getOpposite().getId());
                return true;
            } else {
                return false;
            }
        }
    }
}
