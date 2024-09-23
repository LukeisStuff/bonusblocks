package luke.bonusblocks.block;

import net.minecraft.client.render.stitcher.TextureRegistry;
import net.minecraft.core.block.BlockOverlayPebbles;
import net.minecraft.core.block.entity.BlockEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;
import static net.minecraft.core.item.Item.oreRawIron;

public class BlockOverlayRawIron extends BlockOverlayPebbles {

    public BlockOverlayRawIron(String key, int id, Material material) {
        super(key, id, material);
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, BlockEntity BlockEntity) {
        return dropCause == EnumDropCause.PICK_BLOCK ? new ItemStack[]{new ItemStack(oreRawIron, 1)} : new ItemStack[]{new ItemStack(oreRawIron, meta + 1)};
    }
}
