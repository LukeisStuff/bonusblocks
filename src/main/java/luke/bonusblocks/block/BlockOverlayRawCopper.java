package luke.bonusblocks.block;

import luke.bonusblocks.item.BonusItems;
import net.minecraft.client.render.stitcher.TextureRegistry;
import net.minecraft.core.block.BlockOverlayPebbles;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class BlockOverlayRawCopper extends BlockOverlayPebbles {

    public BlockOverlayRawCopper(String key, int id, Material material) {
        super(key, id, material);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return dropCause == EnumDropCause.PICK_BLOCK ? new ItemStack[]{new ItemStack(BonusItems.oreRawCopper, 1)} : new ItemStack[]{new ItemStack(BonusItems.oreRawCopper, meta + 1)};
    }
}
