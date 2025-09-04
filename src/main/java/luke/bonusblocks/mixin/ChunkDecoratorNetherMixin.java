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

    @Inject(method = "decorate", at = @At("TAIL")) // Inject at the end of decorate
    public void decorate(Chunk chunk, CallbackInfo ci, @Local(name = "rand") Random rand, @Local(name = "x") int x, @Local(name = "z") int z) {
        int minY = this.world.getWorldType().getMinY();
        int maxY = this.world.getWorldType().getMaxY();
        int rangeY = maxY + 1 - minY;

        for (int i = 0; i < 10; ++i) {
            int posX = x + rand.nextInt(16);
            int posY = minY + rand.nextInt(rangeY - 8) + 4;
            int posZ = z + rand.nextInt(16);
            new WorldFeatureOre(BonusBlocks.ORE_VERDIGRIS_NETHERRACK.id(), 16).place(this.world, rand, posX, posY, posZ);
        }

        if (rand.nextInt(2) == 0) {
            int posX = x + rand.nextInt(16);
            int posY = minY + rand.nextInt(rangeY - 8) + 4;
            int posZ = z + rand.nextInt(16);
            new WorldFeatureSkull().place(this.world, rand, posX, posY, posZ);
        }
        if (rand.nextInt(3) == 0) {
            int posX = x + rand.nextInt(16);
            int posY = minY + rand.nextInt(rangeY - 8) + 4;
            int posZ = z + rand.nextInt(16);
            new WorldFeatureSkull().place(this.world, rand, posX, posY, posZ);
        }
        if (rand.nextInt(4) == 0) {
            int posX = x + rand.nextInt(16);
            int posY = minY + rand.nextInt(rangeY - 8) + 4;
            int posZ = z + rand.nextInt(16);
            new WorldFeatureSkull().place(this.world, rand, posX, posY, posZ);
        }
    }
}
