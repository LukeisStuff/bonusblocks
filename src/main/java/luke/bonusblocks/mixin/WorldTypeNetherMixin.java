package luke.bonusblocks.mixin;

import luke.bonusblocks.biomes.BiomeProviderNether;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.provider.BiomeProvider;
import net.minecraft.core.world.config.season.SeasonConfig;
import net.minecraft.core.world.type.WorldType;
import net.minecraft.core.world.type.WorldTypeNether;
import net.minecraft.core.world.weather.Weather;
import net.minecraft.core.world.wind.WindManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = WorldTypeNether.class, remap = false)
public abstract class WorldTypeNetherMixin extends WorldType {

    public WorldTypeNetherMixin(String languageKey, Weather defaultWeather, WindManager windManager, boolean hasCeiling, float[] brightnessRamp, SeasonConfig defaultSeasonConfig) {
        super(languageKey, defaultWeather, windManager, hasCeiling, brightnessRamp, defaultSeasonConfig);
    }

    @Inject(method = "createBiomeProvider", at = @At("HEAD"), cancellable = true)
    public void createBiomeProvider(World world, CallbackInfoReturnable<BiomeProvider> cir) {
        cir.setReturnValue(new BiomeProviderNether(world.getRandomSeed(), this));
    }
}
