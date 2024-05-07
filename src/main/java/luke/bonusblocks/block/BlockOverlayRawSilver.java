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

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;

public class BlockOverlayRawSilver extends BlockOverlayPebbles {

    public BlockOverlayRawSilver(String key, int id, Material material) {
        super(key, id, material);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return dropCause == EnumDropCause.PICK_BLOCK ? new ItemStack[]{new ItemStack(BonusItems.oreRawSilver, 1)} : new ItemStack[]{new ItemStack(BonusItems.oreRawSilver, meta + 1)};
    }
}
