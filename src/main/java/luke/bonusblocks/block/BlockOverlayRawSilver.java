package luke.bonusblocks.block;

import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.BlockOverlayPebbles;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.TextureHelper;

import static luke.bonusblocks.BonusBlocksMod.*;

public class BlockOverlayRawSilver extends BlockOverlayPebbles {

    static int[] textures = {};

    public BlockOverlayRawSilver(String key, int id, Material material) {
        super(key, id, material);
        textures = new int[]{
                TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "silverpebble1.png"),
                TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "silverpebble2.png"),
                TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "silverpebble3.png")
        };
    }

    @Override
    public int getBlockTextureFromSideAndMetadata(Side side, int data) {
        return textures[data];
    }

    @Override
    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        if (dropCause == EnumDropCause.PICK_BLOCK) {
            return new ItemStack[]{new ItemStack(BonusItems.oreRawSilver, 1)};
        }
        return new ItemStack[]{new ItemStack(BonusItems.oreRawSilver, meta + 1)};
    }
}
