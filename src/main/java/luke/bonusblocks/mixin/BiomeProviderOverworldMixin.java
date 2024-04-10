package luke.bonusblocks.mixin;

import luke.bonusblocks.biomes.BonusBiomes;
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
        brm.addRange(BonusBiomes.OVERWORLD_OVERGROWN_MEADOW, new BiomeRange(0.29, 0.51, 0.0, 0.08, 0.0, 1.0, 0.0, 1.0));
        brm.addRange(BonusBiomes.OVERWORLD_OUTBACK_MESA, new BiomeRange(0.93,0.98,0.00,0.12,0.00,1.00,0.15,1.0));
        brm.addRange(BonusBiomes.OVERWORLD_MAPLE, new BiomeRange(0.96,1.01,0.40,0.85,0.00,1.00,0.00,1.0));
        brm.addRange(BonusBiomes.OVERWORLD_DRYLAND, new BiomeRange(0.76,0.95,0.10,0.24,0.00,1.00,0.00,1.0));
//        brm.addRange(BonusBiomes.OVERWORLD_WETLAND, new BiomeRange(0.00,0.85,0.76,1.01,0.00,1.00,0.00,1.0));
    }
}
