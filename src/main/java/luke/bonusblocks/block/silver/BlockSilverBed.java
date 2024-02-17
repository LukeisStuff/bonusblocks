package luke.bonusblocks.block.silver;

import luke.bonusblocks.BonusBlocksMod;
import luke.bonusblocks.item.BonusItems;
import net.minecraft.core.block.BlockBed;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.logic.BedDirections;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.TextureHelper;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;

public class BlockSilverBed extends BlockBed {
    public BlockSilverBed(String key, int id) {
        super(key, id);
    }

    public int getBlockTextureFromSideAndMetadata(Side side, int data) {
        if (side == Side.BOTTOM) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "silverbedtop2.png");
        } else {
            int k = getDirectionFromMetadata(data);
            int l = BedDirections.bedDirection[k][side.getId()];
            if (isBlockFootOfBed(data)) {
                if (l == 2) {
                    return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "silverbedfront.png");
                } else {
                    return l != 5 && l != 4 ? TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "silverbedtop1.png") : TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "silverbedside1.png");
                }
            } else if (l == 3) {
                return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "silverbedback.png");
            } else {
                return l != 5 && l != 4 ? TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "silverbedtop2.png") : TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "silverbedside2.png");
            }
        }
    }
    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        return new ItemStack[]{new ItemStack(BonusItems.bedSilver)};
    }

}
