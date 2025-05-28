package luke.bonusblocks.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import luke.bonusblocks.biomes.WorldFeatureSkull;
import net.minecraft.core.world.World;
import net.minecraft.core.world.chunk.Chunk;
import net.minecraft.core.world.generate.chunk.perlin.nether.ChunkDecoratorNether;
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

        if ((rand.nextInt(2) == 0)) {
            int xf = x + rand.nextInt(16 + 8);
            int zf = z + rand.nextInt(16 + 8);
            int yf = minY + rand.nextInt(rangeY - 8) + 4;
            new WorldFeatureSkull().place(world, rand, xf, yf, zf);
        }
        if ((rand.nextInt(3) == 0)) {
            int xf = x + rand.nextInt(16 + 8);
            int zf = z + rand.nextInt(16 + 8);
            int yf = minY + rand.nextInt(rangeY - 8) + 4;
            new WorldFeatureSkull().place(world, rand, xf, yf, zf);
        }
        if ((rand.nextInt(4) == 0)) {
            int xf = x + rand.nextInt(16 + 8);
            int zf = z + rand.nextInt(16 + 8);
            int yf = minY + rand.nextInt(rangeY - 8) + 4;
            new WorldFeatureSkull().place(world, rand, xf, yf, zf);
        }

    }
}
