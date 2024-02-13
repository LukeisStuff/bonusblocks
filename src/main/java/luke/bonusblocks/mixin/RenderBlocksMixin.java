package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.client.render.RenderBlockCache;
import net.minecraft.client.render.RenderBlocks;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.TextureFX;
import net.minecraft.client.render.block.color.BlockColor;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.core.Global;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockRotatable;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value= RenderBlocks.class,remap = false)
public abstract class RenderBlocksMixin  {
    @Unique
    private World world;
    @Unique
    private RenderBlockCache cache = new RenderBlockCache();
    @Unique
    private int overrideBlockTexture = -1;
    @Shadow
    private WorldSource blockAccess;

    protected RenderBlocksMixin(World world) {
        this.world = world;
    }

    @Shadow public abstract float getBlockBrightness(WorldSource blockAccess, int x, int y, int z);

    @Inject(method = "renderBlockByRenderType",at=@At(value="INVOKE",target = "Lnet/minecraft/core/block/Block;setBlockBoundsBasedOnState(Lnet/minecraft/core/world/World;III)V"), cancellable = true)
    private void renderPipe(Block block, int renderType, int x, int y, int z, CallbackInfoReturnable<Boolean> cir) {
        if (block.id == BonusBlocks.pipeCopper.id) {
            cir.setReturnValue(renderBlockPipe(block,x,y,z));
        }
    }
    @Unique
    private Boolean renderBlockPipe(Block block, int x, int y, int z) {
        Tessellator tessellator = Tessellator.instance;
        float f = this.getBlockBrightness(this.blockAccess, x, y, z);
        int l = BlockColorDispatcher.getInstance().getDispatch(block).getWorldColor(this.world, x, y, z);
        float f1 = (float)(l >> 16 & 255) / 255.0F;
        float f2 = (float)(l >> 8 & 255) / 255.0F;
        float f3 = (float)(l & 255) / 255.0F;
        tessellator.setColorOpaque_F(f * f1, f * f2, f * f3);

        this.renderCrossedSquares(block, this.blockAccess.getBlockMetadata(x, y, z), x, y, z);
        return true;
    }

    @Unique
    public void renderCrossedSquares(Block block, int i, double d, double d1, double d2) {
        Tessellator tessellator = Tessellator.instance;
        int texIndex = block.getBlockTextureFromSideAndMetadata(Side.BOTTOM, i);
        if (this.overrideBlockTexture >= 0) {
            texIndex = this.overrideBlockTexture;
        }

        int texX = texIndex % Global.TEXTURE_ATLAS_WIDTH_TILES * TextureFX.tileWidthTerrain;
        int texY = texIndex / Global.TEXTURE_ATLAS_WIDTH_TILES * TextureFX.tileWidthTerrain;
        double minU = (float)texX / (float)(TextureFX.tileWidthTerrain * Global.TEXTURE_ATLAS_WIDTH_TILES);
        double maxU = ((float)texX + ((float)TextureFX.tileWidthTerrain - 0.01F)) / (float)(TextureFX.tileWidthTerrain * Global.TEXTURE_ATLAS_WIDTH_TILES);
        double minV = (float)texY / (float)(TextureFX.tileWidthTerrain * Global.TEXTURE_ATLAS_WIDTH_TILES);
        double maxV = ((float)texY + ((float)TextureFX.tileWidthTerrain - 0.01F)) / (float)(TextureFX.tileWidthTerrain * Global.TEXTURE_ATLAS_WIDTH_TILES);
        float yOffset = 0.0F;
        if (block == Block.tallgrass && i == 3) {
            minV = (float)(texY - TextureFX.tileWidthTerrain) / (float)(TextureFX.tileWidthTerrain * Global.TEXTURE_ATLAS_WIDTH_TILES);
            yOffset = 1.0F;
        }

        double d7 = d + 0.5 - 0.45;
        double d8 = d + 0.5 + 0.45;
        double d9 = d2 + 0.5 - 0.45;
        double d10 = d2 + 0.5 + 0.45;
        tessellator.addVertexWithUV(d7, d1 + 1.0 + (double)yOffset, d9, minU, minV);
        tessellator.addVertexWithUV(d7, d1 + 0.0, d9, minU, maxV);
        tessellator.addVertexWithUV(d8, d1 + 0.0, d10, maxU, maxV);
        tessellator.addVertexWithUV(d8, d1 + 1.0 + (double)yOffset, d10, maxU, minV);
        tessellator.addVertexWithUV(d8, d1 + 1.0 + (double)yOffset, d10, minU, minV);
        tessellator.addVertexWithUV(d8, d1 + 0.0, d10, minU, maxV);
        tessellator.addVertexWithUV(d7, d1 + 0.0, d9, maxU, maxV);
        tessellator.addVertexWithUV(d7, d1 + 1.0 + (double)yOffset, d9, maxU, minV);
        tessellator.addVertexWithUV(d7, d1 + 1.0 + (double)yOffset, d10, minU, minV);
        tessellator.addVertexWithUV(d7, d1 + 0.0, d10, minU, maxV);
        tessellator.addVertexWithUV(d8, d1 + 0.0, d9, maxU, maxV);
        tessellator.addVertexWithUV(d8, d1 + 1.0 + (double)yOffset, d9, maxU, minV);
        tessellator.addVertexWithUV(d8, d1 + 1.0 + (double)yOffset, d9, minU, minV);
        tessellator.addVertexWithUV(d8, d1 + 0.0, d9, minU, maxV);
        tessellator.addVertexWithUV(d7, d1 + 0.0, d10, maxU, maxV);
        tessellator.addVertexWithUV(d7, d1 + 1.0 + (double)yOffset, d10, maxU, minV);
    }

}
