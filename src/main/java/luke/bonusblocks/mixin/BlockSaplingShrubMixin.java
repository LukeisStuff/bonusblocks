package luke.bonusblocks.mixin;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.SaplingShrubBlock;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(value= SaplingShrubBlock.class,remap=false)
public class BlockSaplingShrubMixin {

    @Inject(method = "growTree", at = @At(value = "TAIL", target = "growTree(Lnet/minecraft/core/world/World;IIILjava/util/Random;)V"), cancellable = true)

    public void growTree(World world, int i, int j, int k, Random random, CallbackInfo ci) {
        WorldFeature obj;
        world.setBlock(i, j, k, 0);
        obj = new WorldFeatureTreeShrub(Blocks.LEAVES_SHRUB.id, BonusBlocks.LOG_SHRUB.id);
        if (!obj.place(world, random, i, j, k)) {
            world.setBlock(i, j, k, Blocks.SAPLING_SHRUB.id);
        }
    }
}