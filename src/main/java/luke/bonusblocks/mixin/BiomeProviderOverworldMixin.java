package luke.bonusblocks.mixin;

import luke.bonusblocks.ModBiomes;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.biome.data.BiomeRange;
import net.minecraft.core.world.biome.data.BiomeRangeMap;
import net.minecraft.core.world.biome.provider.BiomeProviderOverworld;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value= BiomeProviderOverworld.class,remap=false)
public abstract class BiomeProviderOverworldMixin {
    @Shadow @Final private static BiomeRangeMap brm;
    @Inject(method="init",at=@At(value = "INVOKE",ordinal=14,target = "Lnet/minecraft/core/world/biome/data/BiomeRangeMap;addRange(Lnet/minecraft/core/world/biome/Biome;[Lnet/minecraft/core/world/biome/data/BiomeRange;)V"))
    private static void injectAfterForest(CallbackInfo ci) {
        brm.addRange(ModBiomes.OVERWORLD_OVERGROWN, new BiomeRange(0.26,0.32,0.09,1.00,0.0,1.0,0.0,1.0));
        brm.addRange(ModBiomes.OVERWORLD_MESA, new BiomeRange(0.93,0.96,0.00,0.12,0.0,1.0,0.15,1.0));
        brm.addRange(Biomes.OVERWORLD_FOREST, new BiomeRange(0.6, 0.98, 0.5, 0.85, 0.0, 1.0, 0.30, 1.0));
        brm.addRange(ModBiomes.OVERWORLD_MAPLE, new BiomeRange(0.6,0.98,0.5,0.85,0.0,1.0,0.0,0.30));

    }
}
