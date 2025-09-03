package luke.bonusblocks.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import luke.bonusblocks.BonusBlocks;
import luke.bonusblocks.biomes.WorldFeatureSkull;
import net.minecraft.core.world.World;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.perlin.nether.ChunkDecoratorNether;
import net.minecraft.core.world.generate.feature.WorldFeatureOre;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(value = ChunkDecoratorNether.class, remap = false)
public class ChunkDecoratorNetherMixin {

    @Shadow
    @Final
    private World world;

    @Inject(method = "decorate", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 20))
    public void decorate(Chunk chunk, CallbackInfo ci, @Local(name = "rand") Random rand, @Local(name = "x") int x, @Local(name = "z") int z) {

        int minY = this.world.getWorldType().getMinY();
        int maxY = this.world.getWorldType().getMaxY();
        int rangeY = maxY + 1 - minY;
        int max;
        int i;
        int xf;
        int yf;
        int zf;

        for(max = 0; max < 10; ++max) {
            i = x + rand.nextInt(16);
            xf = minY + rand.nextInt(rangeY - 8) + 4;
            yf = z + rand.nextInt(16);
            (new WorldFeatureOre(BonusBlocks.ORE_VERDIGRIS_NETHERRACK.id(), 12)).place(this.world, rand, i, xf, yf);
        }

        if ((rand.nextInt(2) == 0)) {
            xf = x + rand.nextInt(16 + 8);
            zf = z + rand.nextInt(16 + 8);
            yf = minY + rand.nextInt(rangeY - 8) + 4;
            new WorldFeatureSkull().place(world, rand, xf, yf, zf);
        }
        if ((rand.nextInt(3) == 0)) {
            xf = x + rand.nextInt(16 + 8);
            zf = z + rand.nextInt(16 + 8);
            yf = minY + rand.nextInt(rangeY - 8) + 4;
            new WorldFeatureSkull().place(world, rand, xf, yf, zf);
        }
        if ((rand.nextInt(4) == 0)) {
            xf = x + rand.nextInt(16 + 8);
            zf = z + rand.nextInt(16 + 8);
            yf = minY + rand.nextInt(rangeY - 8) + 4;
            new WorldFeatureSkull().place(world, rand, xf, yf, zf);
        }

    }
}
