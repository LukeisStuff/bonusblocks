package luke.bonusblocks.mixin;

import luke.bonusblocks.IPaintingExtras;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityPainting;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value = EntityPainting.class, remap = false)
public abstract class EntityPaintingMixin extends Entity implements IPaintingExtras {
    @Unique
    private ItemStack borderItem;

    public EntityPaintingMixin(World world) {
        super(world);
    }
    @Override
    public boolean interact(EntityPlayer entityplayer) {
        if (entityplayer.getHeldItem() != null){
            borderItem = new ItemStack(entityplayer.getHeldItem());
            entityplayer.getHeldItem().consumeItem(entityplayer);
            return true;
        }
        return false;
    }

    @Override
    public ItemStack bonusblocks$getStack() {
        return borderItem;
    }
}
