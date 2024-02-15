package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import luke.bonusblocks.IPaintingExtras;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.PaintingRenderer;
import net.minecraft.core.entity.EntityPainting;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
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
        loadTexture("/assets/bonusblocks/art/border.png");
        int color = getColor(entity);
        if (color != -1){
            float red = (float)(color >> 16 & 0xFF) / 255.0f;
            float green = (float)(color >> 8 & 0xFF) / 255.0f;
            float blue = (float)(color & 0xFF) / 255.0f;
            renderBorder(entity, entity.art.sizeX, entity.art.sizeY, red, green, blue);
        }
    }
    @Unique
    private void renderBorder(EntityPainting entity, int sizeX, int sizeY, float r, float g, float b) {
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
                this.setupPaintingBrightness(entity, (maxX + minX) / 2.0f, (maxY + minY) / 2.0f);

                int index = getIndex(x, y, width, height);

                float u = (index%4)/4f;
                float v = (index/4)/4f;

                float frontMinU = u; // (float)(offsetX + sizeX - x * 16) / 512.0f;
                float frontMaxU = u + 0.25f; // (float)(offsetX + sizeX - (x + 1) * 16) / 512.0f;
                float frontMinV = v; // (float)(offsetY + sizeY - y * 16) / 512.0f;
                float frontMaxV = v + 0.25f; // (float)(offsetY + sizeY - (y + 1) * 16) / 512.0f;
//                float backMinU = 0.875f;
//                float backMaxU = 0.90625f;
//                float backMinV = 0.0f;
//                float backMaxV = 0.03125f;
//                float topBottomMinU = 0.875f;
//                float topBottomMaxU = 0.90625f;
//                float topBottomMinV = 9.765625E-4f;
//                float topBottomMaxV = 9.765625E-4f;
//                float sidesMinU = 0.875f;
//                float sidesMaxU = 0.8769531f;
//                float sidesMinV = 0.0f;
//                float sidesMaxV = 0.03125f;
                Tessellator tessellator = Tessellator.instance;
                tessellator.startDrawingQuads();
                tessellator.setNormal(0.0f, 0.0f, -1.0f);
                tessellator.setColorOpaque_F(r, g, b);
                tessellator.addVertexWithUV(maxX, minY, minZ, frontMaxU, frontMinV);
                tessellator.addVertexWithUV(minX, minY, minZ, frontMinU, frontMinV);
                tessellator.addVertexWithUV(minX, maxY, minZ, frontMinU, frontMaxV);
                tessellator.addVertexWithUV(maxX, maxY, minZ, frontMaxU, frontMaxV);
//                tessellator.setNormal(0.0f, 1.0f, 0.0f);
//                tessellator.addVertexWithUV(maxX, maxY, minZ, topBottomMinU, topBottomMinV);
//                tessellator.addVertexWithUV(minX, maxY, minZ, topBottomMaxU, topBottomMinV);
//                tessellator.addVertexWithUV(minX, maxY, maxZ, topBottomMaxU, topBottomMaxV);
//                tessellator.addVertexWithUV(maxX, maxY, maxZ, topBottomMinU, topBottomMaxV);
//                tessellator.setNormal(0.0f, -1.0f, 0.0f);
//                tessellator.addVertexWithUV(maxX, minY, maxZ, topBottomMinU, topBottomMinV);
//                tessellator.addVertexWithUV(minX, minY, maxZ, topBottomMaxU, topBottomMinV);
//                tessellator.addVertexWithUV(minX, minY, minZ, topBottomMaxU, topBottomMaxV);
//                tessellator.addVertexWithUV(maxX, minY, minZ, topBottomMinU, topBottomMaxV);
//                tessellator.setNormal(-1.0f, 0.0f, 0.0f);
//                tessellator.addVertexWithUV(maxX, maxY, maxZ, sidesMaxU, sidesMinV);
//                tessellator.addVertexWithUV(maxX, minY, maxZ, sidesMaxU, sidesMaxV);
//                tessellator.addVertexWithUV(maxX, minY, minZ, sidesMinU, sidesMaxV);
//                tessellator.addVertexWithUV(maxX, maxY, minZ, sidesMinU, sidesMinV);
//                tessellator.setNormal(1.0f, 0.0f, 0.0f);
//                tessellator.addVertexWithUV(minX, maxY, minZ, sidesMaxU, sidesMinV);
//                tessellator.addVertexWithUV(minX, minY, minZ, sidesMaxU, sidesMaxV);
//                tessellator.addVertexWithUV(minX, minY, maxZ, sidesMinU, sidesMaxV);
//                tessellator.addVertexWithUV(minX, maxY, maxZ, sidesMinU, sidesMinV);
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

    @Unique
    private int getColor(EntityPainting painting){
        ItemStack paintingItem = ((IPaintingExtras)painting).bonusblocks$getStack();
        if (paintingItem != null){
            Item item = paintingItem.getItem();
            if (item == Item.ingotGold){
                return 0xFFFF00;
            }
            if (item == BonusBlocks.ingotCopper){
                return 0xd0641c;
            }
            if (item == Item.ingotIron){
                return 0xFFFFFF;
            }
        }
        return -1;
    }
}
