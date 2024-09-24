package luke.bonusblocks.mixin;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.GrassBlock;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.Random;

@Mixin(value= GrassBlock.class,remap=false)
public class BlockGrassMixin {
    @ModifyVariable(method="updateTick",at=@At(value="LOAD"),name="idToSpawn")
    private int updateId(int id, World world, int x, int y, int z, Random rand) {
        if (!(id == Blocks.FLOWER_RED.id && rand.nextInt(2) == 0)) return id;
        Biome biome = world.getBlockBiome(x,y,z);
        if (biome == Biomes.OVERWORLD_TAIGA ||
                biome == Biomes.OVERWORLD_TUNDRA ||
                biome == Biomes.OVERWORLD_GLACIER ||
                biome == Biomes.OVERWORLD_BOREAL_FOREST ||
                biome == Biomes.PARADISE_PARADISE ||
                biome == Biomes.OVERWORLD_RETRO ||
                biome == Biomes.OVERWORLD_MEADOW) {
            return BonusBlocks.FLOWER_SILVER.id;
        }
        if (biome == Biomes.OVERWORLD_FOREST ||
                biome == Biomes.OVERWORLD_RAINFOREST ||
                biome == Biomes.OVERWORLD_TUNDRA ||
                biome == Biomes.OVERWORLD_SEASONAL_FOREST ||
                biome == Biomes.OVERWORLD_GRASSLANDS ||
                biome == Biomes.OVERWORLD_BIRCH_FOREST ||
                biome == Biomes.OVERWORLD_PLAINS ||
                biome == Biomes.OVERWORLD_SHRUBLAND ||
                biome == Biomes.OVERWORLD_BOREAL_FOREST ||
                biome == Biomes.PARADISE_PARADISE ||
                biome == Biomes.OVERWORLD_RETRO ||
                biome == Biomes.OVERWORLD_MEADOW) {
            return BonusBlocks.FLOWER_LIME.id;
        }
        return id;
    }
}