package luke.bonusblocks.mixin;

import com.mojang.nbt.CompoundTag;
import luke.bonusblocks.BonusBlocks;
import luke.bonusblocks.IPaintingExtras;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityPainting;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

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
            ItemStack stack = entityplayer.getHeldItem();
            if (BonusBlocks.getBorder(stack) == null) return false;
            borderItem = new ItemStack(stack.getItem(), 1, stack.getMetadata());
            stack.consumeItem(entityplayer);
            if (stack.stackSize <= 0) {
                entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, null);
            }
            return true;
        } else if (borderItem != null){
            entityplayer.inventory.insertItem(borderItem, true);
            borderItem = null;
            return true;
        }
        return super.interact(entityplayer);
    }

    @Override
    public ItemStack bonusblocks$getStack() {
        return borderItem;
    }
    @Inject(method = "addAdditionalSaveData(Lcom/mojang/nbt/CompoundTag;)V", at = @At("TAIL"))
    private void saveExtras(CompoundTag tag, CallbackInfo ci){
        if (borderItem != null){
            tag.putBoolean("itemExists", true);
            tag.putInt("itemID", this.borderItem.itemID);
            tag.putInt("itemMeta", this.borderItem.getMetadata());
        } else {
            tag.putBoolean("itemExists", false);
        }
    }
    @Inject(method = "readAdditionalSaveData(Lcom/mojang/nbt/CompoundTag;)V", at = @At("TAIL"))
    private void loadExtras(CompoundTag tag, CallbackInfo ci){
        if (tag.containsKey("itemExists") && tag.getBoolean("itemExists")){
            int id = tag.getInteger("itemID");
            int meta = tag.getInteger("itemMeta");
            borderItem = new ItemStack(id, 1, meta);
        }

    }
}
