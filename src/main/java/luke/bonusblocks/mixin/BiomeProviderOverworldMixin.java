package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBiomes;
import net.minecraft.core.world.biome.data.BiomeRange;
import net.minecraft.core.world.biome.data.BiomeRangeMap;
import net.minecraft.core.world.biome.provider.BiomeProviderOverworld;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = BiomeProviderOverworld.class, remap = false)
public abstract class BiomeProviderOverworldMixin {
	@Shadow
	@Final
	private static BiomeRangeMap brm;

	@Inject(method = "init", at = @At(value = "INVOKE", ordinal = 0, target = "Lnet/minecraft/core/world/biome/data/BiomeRangeMap;lock()V"))
	private static void injectAfterRainforest(CallbackInfo ci) {
		brm.addRange(BonusBiomes.OVERWORLD_OVERGROWN_MEADOW, new BiomeRange(0.29, 0.5, 0.0, 0.051, 0.0, 1.0, 0.0, 1.0));
	}
}
