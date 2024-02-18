package luke.bonusblocks.block;

import net.minecraft.core.Global;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.TextureHelper;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;

public class BlockPaintedCrate extends Block {
    public static final int[] texCoords = new int[16];

    public BlockPaintedCrate(String key, int id) {
        super(key, id, Material.wood);
    }

    public int getBlockTextureFromSideAndMetadata(Side side, int meta) {
        if (meta == 0) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "whitecrate.png");
        }
        if (meta == 1) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "orangecrate.png");
        }
        if (meta == 2) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "magentacrate.png");
        }
        if (meta == 3) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "lightbluecrate.png");
        }
        if (meta == 4) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "yellowcrate.png");
        }
        if (meta == 5) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "limecrate.png");
        }
        if (meta == 6) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "pinkcrate.png");
        }
        if (meta == 7) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "graycrate.png");
        }
        if (meta == 8) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "silvercrate.png");
        }
        if (meta == 9) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "cyancrate.png");
        }
        if (meta == 10) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "purplecrate.png");
        }
        if (meta == 11) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "bluecrate.png");
        }
        if (meta == 12) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "browncrate.png");
        }
        if (meta == 13) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "greencrate.png");
        }
        if (meta == 14) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "redcrate.png");
        }
        if (meta == 15) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "blackcrate.png");
        }
        return meta;
    }

    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return new ItemStack[]{new ItemStack(this, 1, meta)};
    }

}
