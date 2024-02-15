package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import luke.bonusblocks.IPaintingExtras;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.PaintingRenderer;
import net.minecraft.core.entity.EntityPainting;
import net.minecraft.core.item.ItemStack;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = PaintingRenderer.class, remap = false)
public abstract class PaintingRendererMixin extends EntityRenderer<EntityPainting> {
    @Shadow protected abstract void setupPaintingBrightness(EntityPainting entity, float centerX, float centerY);

    @Inject(method = "renderPainting(Lnet/minecraft/core/entity/EntityPainting;DDDFF)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/entity/PaintingRenderer;renderArt(Lnet/minecraft/core/entity/EntityPainting;IIII)V", shift = At.Shift.AFTER))
    private void inject(EntityPainting entity, double x, double y, double z, float yaw, float partialTick, CallbackInfo ci){
        ItemStack borderStack = ((IPaintingExtras)entity).bonusblocks$getStack();
        if (borderStack != null){
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(770, 771);
            GL11.glColor4f(1f, 1f, 1f, 1f);
            loadTexture(BonusBlocks.getBorder(borderStack));
            renderBorder(entity, entity.art.sizeX, entity.art.sizeY);
            GL11.glDisable(GL11.GL_BLEND);
        }
    }
    @Unique
    private void renderBorder(EntityPainting entity, int sizeX, int sizeY) {
        float negCenterX = (float)(-sizeX) / 2.0f;
        float negCenterY = (float)(-sizeY) / 2.0f;
        float minZ = -0.6f;
        float maxZ = 0.5f;
        int width = sizeX / 16;
        int height = sizeY / 16;
        for (int x = 0; x < width; ++x) {
            for (int y = 0; y < height; ++y) {
                float maxX = negCenterX + (float)((x + 1) * 16);
                float minX = negCenterX + (float)(x * 16);
                float maxY = negCenterY + (float)((y + 1) * 16);
                float minY = negCenterY + (float)(y * 16);

                if (x == width-1){
                    maxX += 0.1f;
                }
                if (x == 0){
                    minX -= 0.1f;
                }
                if (y == height-1){
                    maxY += 0.1f;
                }
                if (y == 0){
                    minY -= 0.1f;
                }

                this.setupPaintingBrightness(entity, (maxX + minX) / 2.0f, (maxY + minY) / 2.0f);

                int index = getIndex(width - x - 1, height - y - 1, width, height);

                float u = (index%4)/4f;
                float v = (index/4)/4f;

                float minU = u + 0.25f;
                float maxU = u;
                float minV = v + 0.25f;
                float maxV = v;

                Tessellator tessellator = Tessellator.instance;
                tessellator.startDrawingQuads();
                tessellator.setNormal(0.0f, 0.0f, 1.0f);
                tessellator.addVertexWithUV(maxX, minY, minZ, maxU, minV);
                tessellator.addVertexWithUV(minX, minY, minZ, minU, minV);
                tessellator.addVertexWithUV(minX, maxY, minZ, minU, maxV);
                tessellator.addVertexWithUV(maxX, maxY, minZ, maxU, maxV);

                float f = 1/64f;

                if (y == 0){
                    minU = u;
                    maxU = u + 0.25f;
                    minV = v + 0.25f - f;
                    maxV = v + 0.25f;

                    tessellator.setNormal(0.0f, -1.0f, 0.0f);
                    tessellator.addVertexWithUV(maxX, minY, maxZ, minU, minV);
                    tessellator.addVertexWithUV(minX, minY, maxZ, maxU, minV);
                    tessellator.addVertexWithUV(minX, minY, minZ, maxU, maxV);
                    tessellator.addVertexWithUV(maxX, minY, minZ, minU, maxV);

                }
                if (y == height-1){
                    minU = u;
                    maxU = u + 0.25f;
                    minV = v + f;
                    maxV = v;

                    tessellator.setNormal(0.0f, 1.0f, 0.0f);
                    tessellator.addVertexWithUV(maxX, maxY, minZ, minU, minV);
                    tessellator.addVertexWithUV(minX, maxY, minZ, maxU, minV);
                    tessellator.addVertexWithUV(minX, maxY, maxZ, maxU, maxV);
                    tessellator.addVertexWithUV(maxX, maxY, maxZ, minU, maxV);
                }
                if (x == 0){
                    minU = u + 0.25f - f;
                    maxU = u + 0.25f;
                    minV = v;
                    maxV = v + 0.25f;

                    tessellator.setNormal(1.0f, 0.0f, 0.0f);
                    tessellator.addVertexWithUV(minX, maxY, minZ, maxU, minV);
                    tessellator.addVertexWithUV(minX, minY, minZ, maxU, maxV);
                    tessellator.addVertexWithUV(minX, minY, maxZ, minU, maxV);
                    tessellator.addVertexWithUV(minX, maxY, maxZ, minU, minV);
                }
                if (x == width-1){
                    minU = u + f;
                    maxU = u;
                    minV = v;
                    maxV = v + 0.25f;

                    tessellator.setNormal(-1.0f, 0.0f, 0.0f);
                    tessellator.addVertexWithUV(maxX, maxY, maxZ, maxU, minV);
                    tessellator.addVertexWithUV(maxX, minY, maxZ, maxU, maxV);
                    tessellator.addVertexWithUV(maxX, minY, minZ, minU, maxV);
                    tessellator.addVertexWithUV(maxX, maxY, minZ, minU, minV);
                }

                tessellator.draw();
            }
        }
    }

    @Unique
    private int getIndex(int x, int y, int width, int height){
        if (width == 1 && height == 1){ // 1x1
            return 15;
        }
        if (width == 1){ // Short
            if (y == 0){
                return 3;
            }
            if (y == height-1){
                return 11;
            }
            return 7;
        }
        if (height == 1){ // Skinny
            if (x == 0){
                return 12;
            }
            if (x == width-1){
                return 14;
            }
            return 13;
        }
        if (x == 0 && y == 0){
            return 0;
        }
        if (x == 0 && y == height-1){
            return 8;
        }
        if (x == width-1 && y == 0){
            return 2;
        }
        if (x == width-1 && y == height-1){
            return 10;
        }
        if (x == 0){
            return 4;
        }
        if (x == width-1){
            return 6;
        }
        if (y == 0){
            return 1;
        }
        if (y == height-1){
            return 9;
        }
        return 5;
    }
}
