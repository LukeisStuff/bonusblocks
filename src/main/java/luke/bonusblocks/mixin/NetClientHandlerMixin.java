package luke.bonusblocks.mixin;

import luke.bonusblocks.IPaintingSynced;
import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.client.net.handler.NetClientHandler;
import net.minecraft.client.world.WorldClient;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityFallingSand;
import net.minecraft.core.entity.EntityPainting;
import net.minecraft.core.net.packet.Packet23VehicleSpawn;
import net.minecraft.core.net.packet.Packet25EntityPainting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.List;

@Mixin(value = NetClientHandler.class, remap = false)
public class NetClientHandlerMixin {
    @Shadow private WorldClient worldClient;

    @Inject(method = "handleEntityPainting(Lnet/minecraft/core/net/packet/Packet25EntityPainting;)V", at = @At("TAIL"), locals = LocalCapture.CAPTURE_FAILHARD)
    private void syncData(Packet25EntityPainting packet25entitypainting, CallbackInfo ci, EntityPainting painting){
        List list = ((IPaintingSynced)packet25entitypainting).getData();
        if (list != null) {
            painting.getEntityData().assignValues(list);
        }
    }


    @Inject(method = "Lnet/minecraft/client/net/handler/NetClientHandler;handleVehicleSpawn(Lnet/minecraft/core/net/packet/Packet23VehicleSpawn;)V", at = @At("HEAD"), cancellable = true)
    private void handleVehicleSpawn(Packet23VehicleSpawn packet23vehiclespawn, CallbackInfo ci) {
        double xPosition = packet23vehiclespawn.xPosition / 32.0D;
        double yPosition = packet23vehiclespawn.yPosition / 32.0D;
        double zPosition = packet23vehiclespawn.zPosition / 32.0D;
        Entity newEntity = null;
        if (packet23vehiclespawn.type == 85) {
            newEntity = new EntityFallingSand(this.worldClient, xPosition, yPosition, zPosition, BonusBlocks.blockSulphur.id);
        } else if (packet23vehiclespawn.type == 86) {
            newEntity = new EntityFallingSand(this.worldClient, xPosition, yPosition, zPosition, BonusBlocks.blockSugar.id);
        }
        if (newEntity != null) {
            newEntity.serverPosX = packet23vehiclespawn.xPosition;
            newEntity.serverPosY = packet23vehiclespawn.yPosition;
            newEntity.serverPosZ = packet23vehiclespawn.zPosition;
            newEntity.yRot = packet23vehiclespawn.yaw;
            newEntity.xRot = packet23vehiclespawn.pitch;
            newEntity.id = packet23vehiclespawn.entityId;
            worldClient.func_712_a(packet23vehiclespawn.entityId, newEntity);
            newEntity.lerpMotion(packet23vehiclespawn.xVelocity / 8000.0D, packet23vehiclespawn.yVelocity / 8000.0D, packet23vehiclespawn.zVelocity / 8000.0D);
            ci.cancel();
        }
    }
}