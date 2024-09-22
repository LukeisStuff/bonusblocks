package luke.bonusblocks.mixin;

import luke.bonusblocks.biomes.BonusBiomes;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.world.World;
import net.minecraft.core.world.biome.Biome;
import net.minecraft.core.world.generate.feature.WorldFeatureLabyrinth;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(value= WorldFeatureLabyrinth.class,remap=false)
public abstract class WorldFeatureLabyrinthMixin {
    @Unique
    @Mutable
    @Final
    int wallBlockA;
    @Unique
    int wallBlockB;
    @Unique
    int brickBlockA;
    @Unique
    int brickBlockB;
    @Unique
    int slabBlock;

    @Inject(method = "generateDungeon", at = @At(value = "HEAD", target = "Lnet/minecraft/core/world/generate/feature/WorldFeatureLabyrinth;generate(Lnet/minecraft/core/world/World;Ljava/util/Random;III)Z"))
    public void generate(World world, Random random, int blockX, int blockY, int blockZ, boolean doSpawner, CallbackInfo ci) {
        Biome biome = world.getBlockBiome(blockX, blockY, blockZ);
        if (biome == BonusBiomes.OVERWORLD_OUTBACK_MESA) {
            this.wallBlockA = Blocks.SANDSTONE.id;
            this.wallBlockB = Blocks.SANDSTONE.id;
            this.brickBlockA = Blocks.BRICK_SANDSTONE.id;
            this.brickBlockB = Blocks.BRICK_SANDSTONE.id;
            this.slabBlock = Blocks.SLAB_SANDSTONE.id;
        }
    }
}