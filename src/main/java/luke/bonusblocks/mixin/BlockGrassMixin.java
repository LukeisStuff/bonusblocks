package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockGrass;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.biome.Biomes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.Random;

@Mixin(value= BlockGrass.class,remap=false)
public class BlockGrassMixin {
    @ModifyVariable(method="updateTick",at=@At(value="LOAD"),name="idToSpawn")
    private int updateId(int id, World world, int x, int y, int z, Random rand) {
        if (!(id == Block.flowerRed.id && rand.nextInt(2) == 0)) return id;
        Biome biome = world.getBlockBiome(x,y,z);
        if (biome == Biomes.OVERWORLD_RAINFOREST ||
                biome == Biomes.OVERWORLD_SWAMPLAND_MUDDY ||
                biome == Biomes.OVERWORLD_SWAMPLAND) {
            return BonusBlocks.bluebell.id;
        }
        if (biome == Biomes.OVERWORLD_SEASONAL_FOREST ||
                biome == Biomes.OVERWORLD_BIRCH_FOREST ||
                biome == Biomes.OVERWORLD_FOREST) {
            return BonusBlocks.heather.id;
        }
        if (biome == Biomes.OVERWORLD_GRASSLANDS ||
                biome == Biomes.OVERWORLD_PLAINS ||
                biome == Biomes.OVERWORLD_MEADOW ||
                biome == Biomes.OVERWORLD_SHRUBLAND) {
            return BonusBlocks.orchid.id;
        }
        if (biome == Biomes.OVERWORLD_TAIGA ||
                biome == Biomes.OVERWORLD_TUNDRA ||
                biome == Biomes.OVERWORLD_BOREAL_FOREST) {
            return BonusBlocks.whitedandelion.id;
        }
        if (biome == Biomes.OVERWORLD_SEASONAL_FOREST ||
                biome == Biomes.OVERWORLD_MEADOW ||
                biome == Biomes.OVERWORLD_FOREST) {
            return BonusBlocks.clovers.id;
        }
        return id;
    }
}