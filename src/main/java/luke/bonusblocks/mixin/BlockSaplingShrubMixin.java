package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockSaplingShrub;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTreeShrub;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(value=BlockSaplingShrub.class,remap=false)
public class BlockSaplingShrubMixin {

    @Inject(method = "growTree", at = @At(value = "TAIL", target = "growTree(Lnet/minecraft/core/world/World;IIILjava/util/Random;)V"), cancellable = true)

    public void growTree(World world, int i, int j, int k, Random random, CallbackInfo ci) {
        WorldFeature obj;
        world.setBlock(i, j, k, 0);
        obj = new WorldFeatureTreeShrub(Block.leavesShrub.id, BonusBlocks.logShrub.id);
        if (!obj.generate(world, random, i, j, k)) {
            world.setBlock(i, j, k, Block.saplingShrub.id);
        }
    }
}