package luke.bonusblocks.ModContainer.TerrainApi;

import luke.bonusblocks.BonusBlocks;
import luke.bonusblocks.biomes.ModBiomes;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.generate.feature.WorldFeatureFlowers;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;
import useless.terrainapi.api.TerrainAPI;
import useless.terrainapi.generation.overworld.OverworldConfig;
import useless.terrainapi.generation.overworld.api.ChunkDecoratorOverworldAPI;

public class TerrainApiPlugin implements TerrainAPI {
    @Override
    public String getModID() {
        return BonusBlocks.MOD_ID;
    }
    public static final OverworldConfig overworldConfig = ChunkDecoratorOverworldAPI.overworldConfig;
    @Override
    public void onInitialize() {
        overworldConfig.addGrassDensity(ModBiomes.OVERWORLD_OVERGROWN, 2);
        overworldConfig.addGrassDensity(ModBiomes.OVERWORLD_DRYLAND, 2);
        overworldConfig.addGrassDensity(ModBiomes.OVERWORLD_MAPLE, 2);

        overworldConfig.addTreeDensity(ModBiomes.OVERWORLD_MAPLE, 2);
        overworldConfig.addTreeDensity(ModBiomes.OVERWORLD_DRYLAND, 1);

        overworldConfig.addLakeDensity(ModBiomes.OVERWORLD_MAPLE, 1);
        overworldConfig.addLakeDensity(ModBiomes.OVERWORLD_OVERGROWN, 1);
        overworldConfig.addLakeDensity(ModBiomes.OVERWORLD_DRYLAND, 1);

        overworldConfig.addFlowerDensity(ModBiomes.OVERWORLD_OVERGROWN, 1);
        overworldConfig.addFlowerDensity(ModBiomes.OVERWORLD_MAPLE, 2);
        overworldConfig.addFlowerDensity(ModBiomes.OVERWORLD_DRYLAND, 1);

        overworldConfig.addYellowFlowerDensity(ModBiomes.OVERWORLD_OVERGROWN, 1);
        overworldConfig.addYellowFlowerDensity(ModBiomes.OVERWORLD_MAPLE, 2);
        overworldConfig.addYellowFlowerDensity(ModBiomes.OVERWORLD_DRYLAND, 1);

        overworldConfig.addRandomGrassBlock(ModBiomes.OVERWORLD_OVERGROWN, Block.tallgrassFern);
        overworldConfig.addRandomGrassBlock(ModBiomes.OVERWORLD_DRYLAND, Block.tallgrassFern);
        overworldConfig.addRandomGrassBlock(ModBiomes.OVERWORLD_MAPLE, Block.overlayPebbles);
        overworldConfig.addRandomGrassBlock(ModBiomes.OVERWORLD_OUTBACK_MESA, Block.deadbush);

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(Block.spinifex.id), 4, -1f, 1,
                new Biome[]{ModBiomes.OVERWORLD_OUTBACK_MESA});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureTreeShrub(Block.cobbleGranite.id, Block.dirtScorchedRich.id), 4, -1f, 1,
                new Biome[]{ModBiomes.OVERWORLD_OUTBACK_MESA});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(Block.deadbush.id), 4, -1f, 1,
                new Biome[]{ModBiomes.OVERWORLD_OUTBACK_MESA});

                ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.flowerCyan.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_SWAMPLAND, Biomes.OVERWORLD_SWAMPLAND_MUDDY, Biomes.OVERWORLD_RAINFOREST, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW, ModBiomes.OVERWORLD_MAPLE});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.flowerPink.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_OUTBACK, Biomes.OVERWORLD_OUTBACK_GRASSY, Biomes.OVERWORLD_DESERT, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW, ModBiomes.OVERWORLD_OUTBACK_MESA});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.flowerPurple.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_GRASSLANDS, Biomes.OVERWORLD_PLAINS, Biomes.OVERWORLD_SHRUBLAND, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.flowerSilver.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_TAIGA, Biomes.OVERWORLD_TUNDRA, Biomes.OVERWORLD_GLACIER, Biomes.OVERWORLD_BOREAL_FOREST, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW, ModBiomes.OVERWORLD_OVERGROWN});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.flowerOrange.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_FOREST, ModBiomes.OVERWORLD_MAPLE, ModBiomes.OVERWORLD_DRYLAND, Biomes.OVERWORLD_SEASONAL_FOREST, Biomes.OVERWORLD_BIRCH_FOREST, Biomes.OVERWORLD_BOREAL_FOREST, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.flowerLime.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_FOREST, Biomes.OVERWORLD_RAINFOREST, Biomes.OVERWORLD_TUNDRA, Biomes.OVERWORLD_SEASONAL_FOREST, Biomes.OVERWORLD_GRASSLANDS, Biomes.OVERWORLD_BIRCH_FOREST,
                        Biomes.OVERWORLD_PLAINS, Biomes.OVERWORLD_SHRUBLAND, Biomes.OVERWORLD_BOREAL_FOREST, Biomes.PARADISE_PARADISE, Biomes.OVERWORLD_RETRO, Biomes.OVERWORLD_MEADOW, ModBiomes.OVERWORLD_OVERGROWN, ModBiomes.OVERWORLD_MAPLE});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeatureSurface(new WorldFeatureFlowers(BonusBlocks.mushroomGray.id), 6);
    }
}
