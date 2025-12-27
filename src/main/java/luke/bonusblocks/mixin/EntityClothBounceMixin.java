package luke.bonusblocks.mixin;

import net.minecraft.core.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = Entity.class, remap = false)
public class EntityClothBounceMixin {

    @Shadow
    public double y;
    @Unique
    public double prevYBB = y;
    @Unique
    public double deltaYBB;

    @Inject(method = "baseTick()V", at = @At(value = "HEAD"))
    public void tickBB(CallbackInfo ci) {
        deltaYBB = y - prevYBB;
        prevYBB = y;
    }

    @ModifyArg(method = "move(DDD)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/util/helper/MathHelper;floor(D)I", ordinal = 5), index = 0)
    public double extendBlockRangeBB(double originalY) {
        return originalY + deltaYBB;
    }
}
