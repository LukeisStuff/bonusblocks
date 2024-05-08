package luke.bonusblocks.ModContainer.TerrainApi;

import luke.bonusblocks.biomes.BonusBiomes;
import luke.bonusblocks.biomes.WorldFeaturePebbles;
import luke.bonusblocks.biomes.WorldFeaturePumice;
import luke.bonusblocks.biomes.WorldFeatureSkull;
import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import net.minecraft.core.world.generate.feature.WorldFeatureFlowers;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;
import useless.terrainapi.api.TerrainAPI;
import useless.terrainapi.generation.nether.api.ChunkDecoratorNetherAPI;
import useless.terrainapi.generation.overworld.OverworldConfig;
import useless.terrainapi.generation.overworld.api.ChunkDecoratorOverworldAPI;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;

public class TerrainApiPlugin implements TerrainAPI {
    @Override
    public String getModID() {
        return MOD_ID;
    }
    public static final OverworldConfig overworldConfig = ChunkDecoratorOverworldAPI.overworldConfig;
    @Override
    public void onInitialize() {
//        ChunkDecoratorOverworldAPI.oreFeatures.addManagedOreFeature(getModID(), Block.limestone, 32, 15, 0.125f, false);
//        ChunkDecoratorOverworldAPI.oreFeatures.addManagedOreFeature(getModID(), Block.granite, 32, 15, 0.125f, false);

        overworldConfig.setOreValues(getModID(), Block.mossStone, 0, 0, 0);

        ChunkDecoratorOverworldAPI.oreFeatures.addManagedOreFeature(getModID(), BonusBlocks.oreCopperStone, 12, 24, 0.0f, 1.0f, true);
        ChunkDecoratorOverworldAPI.oreFeatures.addManagedOreFeature(getModID(), BonusBlocks.oreSilverStone, 6, 12, 0.0f, 0.5f, true);

        ChunkDecoratorOverworldAPI.oreFeatures.addManagedOreFeature(getModID(), BonusBlocks.moss, 32, 1, 0.5F, false);

        overworldConfig.addGrassDensity(BonusBiomes.OVERWORLD_OVERGROWN_MEADOW, 2);
        overworldConfig.addGrassDensity(BonusBiomes.OVERWORLD_DRYLAND, 2);
        overworldConfig.addGrassDensity(BonusBiomes.OVERWORLD_MAPLE, 2);

        overworldConfig.addTreeDensity(BonusBiomes.OVERWORLD_MAPLE, 2);
        overworldConfig.addTreeDensity(BonusBiomes.OVERWORLD_DRYLAND, 1);

        overworldConfig.addLakeDensity(BonusBiomes.OVERWORLD_MAPLE, 1);
        overworldConfig.addLakeDensity(BonusBiomes.OVERWORLD_OVERGROWN_MEADOW, 1);
        overworldConfig.addLakeDensity(BonusBiomes.OVERWORLD_DRYLAND, 1);
//        overworldConfig.addLakeDensity(BonusBiomes.OVERWORLD_WETLAND, 4);

        overworldConfig.addFlowerDensity(Biomes.OVERWORLD_RAINFOREST, 0);
        overworldConfig.addFlowerDensity(Biomes.OVERWORLD_SWAMPLAND, 0);
        overworldConfig.addFlowerDensity(Biomes.OVERWORLD_SEASONAL_FOREST, 0);
        overworldConfig.addFlowerDensity(Biomes.OVERWORLD_FOREST, 0);
        overworldConfig.addFlowerDensity(Biomes.OVERWORLD_GRASSLANDS, 0);
        overworldConfig.addFlowerDensity(Biomes.OVERWORLD_OUTBACK, 0);
        overworldConfig.addFlowerDensity(Biomes.OVERWORLD_SHRUBLAND, 0);
        overworldConfig.addFlowerDensity(Biomes.OVERWORLD_TAIGA, 0);
        overworldConfig.addFlowerDensity(Biomes.OVERWORLD_BOREAL_FOREST, 0);
        overworldConfig.addFlowerDensity(Biomes.OVERWORLD_DESERT, 0);
        overworldConfig.addFlowerDensity(Biomes.OVERWORLD_PLAINS, 0);
        overworldConfig.addFlowerDensity(Biomes.OVERWORLD_GLACIER, 0);
        overworldConfig.addFlowerDensity(Biomes.OVERWORLD_TUNDRA, 0);
        overworldConfig.addFlowerDensity(Biomes.OVERWORLD_MEADOW, 0);
        overworldConfig.addFlowerDensity(Biomes.OVERWORLD_BIRCH_FOREST, 0);
        overworldConfig.addFlowerDensity(Biomes.OVERWORLD_SWAMPLAND_MUDDY, 0);
        overworldConfig.addFlowerDensity(Biomes.OVERWORLD_OUTBACK_GRASSY, 0);

        overworldConfig.addYellowFlowerDensity(Biomes.OVERWORLD_RAINFOREST, 0);
        overworldConfig.addYellowFlowerDensity(Biomes.OVERWORLD_SWAMPLAND, 0);
        overworldConfig.addYellowFlowerDensity(Biomes.OVERWORLD_SEASONAL_FOREST, 0);
        overworldConfig.addYellowFlowerDensity(Biomes.OVERWORLD_FOREST, 0);
        overworldConfig.addYellowFlowerDensity(Biomes.OVERWORLD_GRASSLANDS, 0);
        overworldConfig.addYellowFlowerDensity(Biomes.OVERWORLD_OUTBACK, 0);
        overworldConfig.addYellowFlowerDensity(Biomes.OVERWORLD_SHRUBLAND, 0);
        overworldConfig.addYellowFlowerDensity(Biomes.OVERWORLD_TAIGA, 0);
        overworldConfig.addYellowFlowerDensity(Biomes.OVERWORLD_BOREAL_FOREST, 0);
        overworldConfig.addYellowFlowerDensity(Biomes.OVERWORLD_DESERT, 0);
        overworldConfig.addYellowFlowerDensity(Biomes.OVERWORLD_PLAINS, 0);
        overworldConfig.addYellowFlowerDensity(Biomes.OVERWORLD_GLACIER, 0);
        overworldConfig.addYellowFlowerDensity(Biomes.OVERWORLD_TUNDRA, 0);
        overworldConfig.addYellowFlowerDensity(Biomes.OVERWORLD_MEADOW, 0);
        overworldConfig.addYellowFlowerDensity(Biomes.OVERWORLD_BIRCH_FOREST, 0);
        overworldConfig.addYellowFlowerDensity(Biomes.OVERWORLD_SWAMPLAND_MUDDY, 0);
        overworldConfig.addYellowFlowerDensity(Biomes.OVERWORLD_OUTBACK_GRASSY, 0);


        overworldConfig.addRandomGrassBlock(BonusBiomes.OVERWORLD_OVERGROWN_MEADOW, Block.tallgrassFern);
        overworldConfig.addRandomGrassBlock(BonusBiomes.OVERWORLD_DRYLAND, Block.tallgrassFern);
//        overworldConfig.addRandomGrassBlock(BonusBiomes.OVERWORLD_WETLAND, Block.tallgrassFern);
        overworldConfig.addRandomGrassBlock(BonusBiomes.OVERWORLD_MAPLE, Block.overlayPebbles);
        overworldConfig.addRandomGrassBlock(BonusBiomes.OVERWORLD_OUTBACK_MESA, Block.deadbush);

        ChunkDecoratorNetherAPI.oreFeatures.addManagedOreFeature(getModID(), BonusBlocks.cobbleNetherrack, 24, 12, 0.0f, 1.0f, false);
        ChunkDecoratorNetherAPI.oreFeatures.addManagedOreFeature(getModID(), BonusBlocks.netherrack, 48, 6, 0.0f, 1.0f, false);
        ChunkDecoratorNetherAPI.oreFeatures.addManagedOreFeature(getModID(), Block.slate, 32, 4, 0.75f, 1.0f, false);
        ChunkDecoratorNetherAPI.oreFeatures.addManagedOreFeature(getModID(), BonusBlocks.brimstone, 32, 2, 0.0f, 0.25f, false);
        ChunkDecoratorNetherAPI.oreFeatures.addManagedOreFeature(getModID(), BonusBlocks.soulslate, 32, 4, 0.0f, 0.50f, false);
        ChunkDecoratorNetherAPI.randomFeatures.addFeature(new WorldFeaturePumice(), 2, 1f, 4,
                new Biome[]{Biomes.NETHER_NETHER});

        ChunkDecoratorNetherAPI.randomFeatures.addFeature(new WorldFeatureSkull(), 3, 1f, 1,
                new Biome[]{Biomes.NETHER_NETHER});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(Block.spinifex.id), 4, -1f, 1,
                new Biome[]{BonusBiomes.OVERWORLD_OUTBACK_MESA});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureTreeShrub(Block.cobbleGranite.id, Block.dirtScorchedRich.id), 4, -1f, 1,
                new Biome[]{BonusBiomes.OVERWORLD_OUTBACK_MESA});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(Block.deadbush.id), 4, -1f, 1,
                new Biome[]{BonusBiomes.OVERWORLD_OUTBACK_MESA});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(Block.flowerRed.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_FOREST, Biomes.OVERWORLD_TUNDRA, BonusBiomes.OVERWORLD_OVERGROWN_MEADOW});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(Block.flowerYellow.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_BIRCH_FOREST, Biomes.OVERWORLD_PLAINS, BonusBiomes.OVERWORLD_OVERGROWN_MEADOW});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.flowerSilver.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_BOREAL_FOREST, Biomes.OVERWORLD_GLACIER, BonusBiomes.OVERWORLD_OVERGROWN_MEADOW});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.flowerMagenta.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_TAIGA, BonusBiomes.OVERWORLD_OVERGROWN_MEADOW});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.flowerCyan.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_RAINFOREST, BonusBiomes.OVERWORLD_DRYLAND, BonusBiomes.OVERWORLD_OVERGROWN_MEADOW});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeaturePebbles(Block.overlayPebbles.id), 4, -1f, 1,
                new Biome[]{Biomes.OVERWORLD_RAINFOREST, BonusBiomes.OVERWORLD_DRYLAND, BonusBiomes.OVERWORLD_OVERGROWN_MEADOW, Biomes.OVERWORLD_FOREST, Biomes.OVERWORLD_BOREAL_FOREST, Biomes.OVERWORLD_BIRCH_FOREST, Biomes.OVERWORLD_SHRUBLAND,
                        Biomes.OVERWORLD_OUTBACK_GRASSY, Biomes.OVERWORLD_OUTBACK, Biomes.OVERWORLD_SEASONAL_FOREST, Biomes.OVERWORLD_GRASSLANDS, Biomes.OVERWORLD_MEADOW});

        ChunkDecoratorOverworldAPI.randomFeatures.addFeatureSurface(new WorldFeatureFlowers(BonusBlocks.flowerLime.id), 4);

        ChunkDecoratorOverworldAPI.randomFeatures.addFeature(new WorldFeatureFlowers(BonusBlocks.mushroomGray.id), 6, 1.0f);
    }
}
