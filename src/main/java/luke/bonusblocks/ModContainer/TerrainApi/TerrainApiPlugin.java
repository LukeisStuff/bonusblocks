package luke.bonusblocks.ModContainer.TerrainApi;

import luke.bonusblocks.BonusBlocks;
import luke.bonusblocks.ModBiomes;
import luke.bonusblocks.WorldFeatureCoral;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.generate.feature.WorldFeatureFlowers;
import useless.terrainapi.api.TerrainAPI;
import useless.terrainapi.generation.VanillaFunctions;
import useless.terrainapi.generation.overworld.ChunkDecoratorOverworldAPI;
import useless.terrainapi.generation.overworld.OverworldBiomeFeatures;

public class TerrainApiPlugin implements TerrainAPI {
    @Override
    public String getModID() {
        return BonusBlocks.MOD_ID;
    }
    @Override
    public void onInitialize() {
        OverworldBiomeFeatures.grassDensityMap.put(ModBiomes.OVERWORLD_OVERGROWN, 2);
        OverworldBiomeFeatures.grassDensityMap.put(ModBiomes.OVERWORLD_MESA, 1);

        OverworldBiomeFeatures.flowerDensityMap.put(ModBiomes.OVERWORLD_OVERGROWN, 1);
        OverworldBiomeFeatures.flowerDensityMap.put(ModBiomes.OVERWORLD_MESA, 1);

        OverworldBiomeFeatures.yellowFlowerDensityMap.put(ModBiomes.OVERWORLD_OVERGROWN, 1);
        OverworldBiomeFeatures.yellowFlowerDensityMap.put(ModBiomes.OVERWORLD_MESA, 1);

        VanillaFunctions.biomeRandomGrassType.put(ModBiomes.OVERWORLD_OVERGROWN, Block.tallgrassFern.id);

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.flowerCyan.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_SWAMPLAND, Biomes.OVERWORLD_SWAMPLAND_MUDDY, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW});
        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.flowerPink.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_OUTBACK, Biomes.OVERWORLD_OUTBACK_GRASSY, Biomes.OVERWORLD_DESERT, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW, ModBiomes.OVERWORLD_MESA});
        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.flowerPurple.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_GRASSLANDS, Biomes.OVERWORLD_PLAINS, Biomes.OVERWORLD_SHRUBLAND, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW});
        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.flowerSilver.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_TAIGA, Biomes.OVERWORLD_TUNDRA, Biomes.OVERWORLD_GLACIER, Biomes.OVERWORLD_BOREAL_FOREST, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW, ModBiomes.OVERWORLD_OVERGROWN});
        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.flowerOrange.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_FOREST, Biomes.OVERWORLD_RAINFOREST, Biomes.OVERWORLD_SEASONAL_FOREST, Biomes.OVERWORLD_BIRCH_FOREST, Biomes.OVERWORLD_BOREAL_FOREST, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW});
        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.flowerLime.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_FOREST, Biomes.OVERWORLD_RAINFOREST, Biomes.OVERWORLD_TUNDRA, Biomes.OVERWORLD_SEASONAL_FOREST, Biomes.OVERWORLD_GRASSLANDS, Biomes.OVERWORLD_BIRCH_FOREST,
                        Biomes.OVERWORLD_PLAINS, Biomes.OVERWORLD_SHRUBLAND, Biomes.OVERWORLD_BOREAL_FOREST, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW, ModBiomes.OVERWORLD_OVERGROWN});
        ChunkDecoratorOverworldAPI.randomFeatures.addFeatureSurface(new WorldFeatureFlowers(BonusBlocks.mushroomGray.id), 8);
/*        ChunkDecoratorOverworldAPI.randomFeatures.addFeatureSurface(new WorldFeatureCoral(BonusBlocks.coralRed.id), 2);
        ChunkDecoratorOverworldAPI.randomFeatures.addFeatureSurface(new WorldFeatureCoral(BonusBlocks.coralYellow.id), 2);
        ChunkDecoratorOverworldAPI.randomFeatures.addFeatureSurface(new WorldFeatureCoral(BonusBlocks.coralGreen.id), 2);
        ChunkDecoratorOverworldAPI.randomFeatures.addFeatureSurface(new WorldFeatureCoral(BonusBlocks.coralCyan.id), 2);
        ChunkDecoratorOverworldAPI.randomFeatures.addFeatureSurface(new WorldFeatureCoral(BonusBlocks.coralBlue.id), 2);
        ChunkDecoratorOverworldAPI.randomFeatures.addFeatureSurface(new WorldFeatureCoral(BonusBlocks.coralPurple.id), 2);
        ChunkDecoratorOverworldAPI.randomFeatures.addFeatureSurface(new WorldFeatureCoral(BonusBlocks.coralPink.id), 2); */
    }
}
