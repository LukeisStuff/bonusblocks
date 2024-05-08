package luke.bonusblocks.mixin;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.ItemStack;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = GuiIngame.class, remap = false)
public abstract class GuiIngameMixin extends Gui {


    @Shadow
    protected Minecraft mc;

    @Inject(method = "renderGameOverlay(FZII)V",
            at = @At(value = "TAIL"))
    private void renderGameOverlay(float partialTicks, boolean flag, int mouseX, int mouseY, CallbackInfo ci) {

        ItemStack headSlotItem = this.mc.thePlayer.inventory.armorItemInSlot(3);
        if (this.mc.gameSettings.thirdPersonView.value == 0 && headSlotItem != null && headSlotItem.itemID == BonusBlocks.skullCarved.id) {
            this.renderSkullBlur(mc.resolution.scaledWidth, mc.resolution.scaledHeight);
        }
    }
    @Unique
    protected void renderSkullBlur(int xSize, int ySize) {
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3008);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBindTexture(3553, this.mc.renderEngine.getTexture("%blur%/assets/bonusblocks/skullblur.png"));
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(0.0, ySize, -90.0, 0.0, 1.0);
        tessellator.addVertexWithUV(xSize, ySize, -90.0, 1.0, 1.0);
        tessellator.addVertexWithUV(xSize, 0.0, -90.0, 1.0, 0.0);
        tessellator.addVertexWithUV(0.0, 0.0, -90.0, 0.0, 0.0);
        tessellator.draw();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }
}
