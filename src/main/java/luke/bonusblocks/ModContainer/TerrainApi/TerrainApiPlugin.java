package luke.bonusblocks.ModContainer.TerrainApi;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.generate.feature.WorldFeatureFlowers;
import useless.terrainapi.api.TerrainAPI;
import useless.terrainapi.generation.overworld.ChunkDecoratorOverworldAPI;

public class TerrainApiPlugin implements TerrainAPI {
    @Override
    public String getModID() {
        return BonusBlocks.MOD_ID;
    }
    @Override
    public void onInitialize() {
        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.bluebell.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_SWAMPLAND, Biomes.OVERWORLD_SWAMPLAND_MUDDY, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW});
        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.orchid.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_OUTBACK, Biomes.OVERWORLD_OUTBACK_GRASSY, Biomes.OVERWORLD_DESERT, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW});
        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.heather.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_GRASSLANDS, Biomes.OVERWORLD_PLAINS, Biomes.OVERWORLD_SHRUBLAND, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW});
        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.whitedandelion.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_TAIGA, Biomes.OVERWORLD_TUNDRA, Biomes.OVERWORLD_GLACIER, Biomes.OVERWORLD_BOREAL_FOREST, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW});
        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.gladiola.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_FOREST, Biomes.OVERWORLD_RAINFOREST, Biomes.OVERWORLD_SEASONAL_FOREST, Biomes.OVERWORLD_BIRCH_FOREST, Biomes.OVERWORLD_BOREAL_FOREST, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW});
        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.clovers.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_FOREST, Biomes.OVERWORLD_RAINFOREST, Biomes.OVERWORLD_TUNDRA, Biomes.OVERWORLD_SEASONAL_FOREST, Biomes.OVERWORLD_GRASSLANDS, Biomes.OVERWORLD_BIRCH_FOREST,
                        Biomes.OVERWORLD_PLAINS, Biomes.OVERWORLD_SHRUBLAND, Biomes.OVERWORLD_BOREAL_FOREST, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW});
        ChunkDecoratorOverworldAPI.randomFeatures.addFeatureSurface(new WorldFeatureFlowers(BonusBlocks.mushroomGray.id), 12);
    }
}
