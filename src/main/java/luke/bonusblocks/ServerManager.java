package luke.bonusblocks;

import luke.bonusblocks.mixin.EntityTrackerAccessor;
import net.minecraft.core.Global;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.net.packet.Packet40EntityMetadata;
import net.minecraft.core.world.data.SynchedEntityData;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.entity.EntityTracker;
import net.minecraft.server.entity.EntityTrackerEntry;

public class ServerManager {
    public static void forceSyncEntity(Entity entity){
        if (!Global.isServer) return;
        if (entity == null) return;
        MinecraftServer server = MinecraftServer.getInstance();
        EntityTracker tracker = server.getEntityTracker(entity.world.dimension.id);
        Object trackerEntryObj = ((EntityTrackerAccessor)tracker).getTrackedEntityHashTable().get(entity.id);
        if (trackerEntryObj != null){
            EntityTrackerEntry trackerEntry = (EntityTrackerEntry) trackerEntryObj;
            SynchedEntityData datawatcher;
            if ((datawatcher = trackerEntry.trackedEntity.getEntityData()).isDirty()) {
                trackerEntry.sendPacketToTrackedPlayersAndTrackedEntity(new Packet40EntityMetadata(trackerEntry.trackedEntity.id, datawatcher));
            }
        }
    }
}
