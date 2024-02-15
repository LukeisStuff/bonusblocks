package luke.bonusblocks.mixin;

import luke.bonusblocks.IPaintingSynced;
import net.minecraft.core.entity.EntityPainting;
import net.minecraft.core.net.packet.Packet25EntityPainting;
import net.minecraft.core.world.data.SynchedEntityData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

@Mixin(value = Packet25EntityPainting.class, remap = false)
public class PaintingPacketMixin implements IPaintingSynced {
    @Unique
    private SynchedEntityData metaData;
    @Unique
    private List receivedMetadata;
    @Inject(method = "<init>(Lnet/minecraft/core/entity/EntityPainting;)V", at = @At("TAIL"))
    private void setMetaData(EntityPainting entitypainting, CallbackInfo ci){
        metaData = entitypainting.getEntityData();
    }
    @Inject(method = "readPacketData(Ljava/io/DataInputStream;)V", at = @At("TAIL"))
    private void read(DataInputStream dis, CallbackInfo ci) throws IOException {
        this.receivedMetadata = SynchedEntityData.unpack(dis);
    }
    @Inject(method = "writePacketData(Ljava/io/DataOutputStream;)V", at = @At("TAIL"))
    private void write(DataOutputStream dos, CallbackInfo ci) throws IOException {
        this.metaData.packAll(dos);
    }
    @Override
    public List getData() {
        return receivedMetadata;
    }
}
