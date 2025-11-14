package luke.bonusblocks.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef;
import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.tool.ItemToolShovel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = ItemToolShovel.class, remap = false)
public abstract class ItemToolShovelMixin {
	@WrapOperation(method = "shovelBlock", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/block/Block;id()I", ordinal = 0))
	private int addNewPathBlockOne(Block<?> instance, Operation<Integer> original, @Local(name = "blockId") int blockId, @Share("useAetherPath") LocalBooleanRef useAetherPath) {
		if (blockId == BonusBlocks.GRASS_OVERGROWN.id()) {
			useAetherPath.set(true);
			return blockId;
		}
		useAetherPath.set(false);
		return original.call(instance);
	}

	@WrapOperation(method = "shovelBlock", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/block/Block;id()I", ordinal = 4))
	private int addNewPathBlockTwo(Block<?> instance, Operation<Integer> original, @Local(name = "blockId") int blockId, @Share("useAetherPath") LocalBooleanRef useAetherPath) {
		if (useAetherPath.get()) return original.call(BonusBlocks.PATH_DIRT_OVERGROWN);
		return original.call(instance);
	}
}
