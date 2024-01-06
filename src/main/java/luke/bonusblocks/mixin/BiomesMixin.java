package luke.bonusblocks.mixin;

import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.world.biome.BiomeBorealForest;
import net.minecraft.core.world.biome.Biomes;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value= Biomes.class,remap=false)
public class BiomesMixin {
}
