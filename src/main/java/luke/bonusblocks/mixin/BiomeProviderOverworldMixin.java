package luke.bonusblocks.mixin;

import luke.bonusblocks.biomes.ModBiomes;
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
    @Inject(method="init",at=@At(value = "INVOKE",ordinal=0,target = "Lnet/minecraft/core/world/biome/data/BiomeRangeMap;lock()V"))
    private static void injectAfterRainforest(CallbackInfo ci) {
        brm.addRange(ModBiomes.OVERWORLD_OVERGROWN, new BiomeRange(0.24,0.34,0.05,1.00,0.00,1.00,0.00,1.0));
        brm.addRange(ModBiomes.OVERWORLD_OUTBACK_MESA, new BiomeRange(0.93,0.96,0.00,0.12,0.00,1.00,0.15,1.0));
        brm.addRange(ModBiomes.OVERWORLD_MAPLE, new BiomeRange(0.76,0.95,0.39,0.20,0.00,1.00,0.00,1.0));
        brm.addRange(ModBiomes.OVERWORLD_MAPLE, new BiomeRange(0.76,1.01,0.76,0.85,0.00,1.00,0.00,1.0));
        brm.addRange(ModBiomes.OVERWORLD_PEAK_ICE, new BiomeRange(0.00,0.49,0.00,1.01,0.75,2.00,0.00,1.0));
        brm.addRange(ModBiomes.OVERWORLD_PEAK_SNOW, new BiomeRange(0.50,1.01,0.20,1.01,0.75,2.00,0.00,1.0));

        brm.addRange(ModBiomes.OVERWORLD_PEAK_STONE, new BiomeRange(0.00,1.01,0.86,1.01,0.75,2.00,0.00,1.0));

        brm.addRange(ModBiomes.OVERWORLD_PEAK_STONE, new BiomeRange(0.50,1.01,0.00,0.19,0.75,2.00,0.00,1.0));

//        brm.addRange(Biomes.OVERWORLD_RAINFOREST, new BiomeRange(0.00,1.01,0.00,1.01,0.00,2.00,0.00,1.0));

    }
}
