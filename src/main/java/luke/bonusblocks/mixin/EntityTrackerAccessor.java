package luke.bonusblocks.mixin;

import net.minecraft.core.world.pathfinder.IdHashMap;
import net.minecraft.server.entity.EntityTracker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = EntityTracker.class, remap = false)
public interface EntityTrackerAccessor {
    @Accessor
    IdHashMap getTrackedEntityHashTable();
}
