package luke.bonusblocks.mixin;

import luke.bonusblocks.IPaintingSynced;
import net.minecraft.client.net.handler.NetClientHandler;
import net.minecraft.core.entity.EntityPainting;
import net.minecraft.core.net.packet.Packet25EntityPainting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.List;

@Mixin(value = NetClientHandler.class, remap = false)
public class NetClientHandlerMixin {
    @Inject(method = "handleEntityPainting(Lnet/minecraft/core/net/packet/Packet25EntityPainting;)V", at = @At("TAIL"), locals = LocalCapture.CAPTURE_FAILHARD)
    private void syncData(Packet25EntityPainting packet25entitypainting, CallbackInfo ci, EntityPainting painting){
        List list = ((IPaintingSynced)packet25entitypainting).getData();
        if (list != null) {
            painting.getEntityData().assignValues(list);
        }
    }
}
