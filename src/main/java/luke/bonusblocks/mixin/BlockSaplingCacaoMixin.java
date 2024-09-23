package luke.bonusblocks.mixin;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.SaplingCacaoBlock;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTree;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(value= SaplingCacaoBlock.class,remap=false)
public class BlockSaplingCacaoMixin {

    @Inject(method = "growTree", at = @At(value = "HEAD", target = "Lnet/minecraft/core/block/BlockSaplingCacao;<init>(Ljava/lang/String;I)V"), cancellable = true)

    public void growTree(World world, int i, int j, int k, Random random, CallbackInfo ci) {
        WorldFeature treeSmall = new WorldFeatureTree(Blocks.LEAVES_CACAO.id, BonusBlocks.LOG_CACAO.id, 4);
        world.setBlock(i, j, k, 0);
        if (!treeSmall.place(world, random, i, j, k)) {
            world.setBlock(i, j, k,  Blocks.SAPLING_CACAO.id);
        }
        ci.cancel();
    }
}
