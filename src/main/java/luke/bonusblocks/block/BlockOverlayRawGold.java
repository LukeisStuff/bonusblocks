package luke.bonusblocks.block;

import net.minecraft.client.render.stitcher.TextureRegistry;
import net.minecraft.core.block.BlockOverlayPebbles;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;
import static net.minecraft.core.item.Item.oreRawGold;

public class BlockOverlayRawGold extends BlockOverlayPebbles {

    static int[] textures = {};

    public BlockOverlayRawGold(String key, int id, Material material) {
        super(key, id, material);
        textures = new int[]{
                TextureRegistry.getTexture("bonusblocks:block/pebbles_gold1.png").getArea(),
                TextureRegistry.getTexture("bonusblocks:block/pebbles_gold2.png").getArea(),
                TextureRegistry.getTexture("bonusblocks:block/pebbles_gold3.png").getArea()
        };
    }

    @Override
    public int getBlockTextureFromSideAndMetadata(Side side, int data) {
        return textures[data];
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return dropCause == EnumDropCause.PICK_BLOCK ? new ItemStack[]{new ItemStack(oreRawGold, 1)} : new ItemStack[]{new ItemStack(oreRawGold, meta + 1)};
    }
}
