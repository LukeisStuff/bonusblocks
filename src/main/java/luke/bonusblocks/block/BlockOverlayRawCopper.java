package luke.bonusblocks.block;

import net.minecraft.core.block.BlockOverlayPebbles;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.TextureHelper;

import static luke.bonusblocks.BonusBlocks.MOD_ID;
import static luke.bonusblocks.BonusBlocks.oreRawCopper;

public class BlockOverlayRawCopper extends BlockOverlayPebbles {

    static int[] textures = {};

    public BlockOverlayRawCopper(String key, int id, Material material) {
        super(key, id, material);
        textures = new int[]{
                TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "copperpebble1.png"),
                TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "copperpebble2.png"),
                TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "copperpebble3.png")
        };
    }

    @Override
    public int getBlockTextureFromSideAndMetadata(Side side, int data) {
        return textures[data];
    }

    @Override
    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        if (dropCause == EnumDropCause.PICK_BLOCK) {
            return new ItemStack[]{new ItemStack(oreRawCopper, 1)};
        }
        return new ItemStack[]{new ItemStack(oreRawCopper, meta + 1)};
    }
}
