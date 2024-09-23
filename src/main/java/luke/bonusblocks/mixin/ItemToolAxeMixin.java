package luke.bonusblocks.mixin;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.AxeToolItem;
import net.minecraft.core.item.tool.ToolItem;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = AxeToolItem.class, remap = false)
public class ItemToolAxeMixin extends ToolItem {

    public ItemToolAxeMixin(String name, String namespaceId, int id, ToolMaterial enumtoolmaterial) {
        super(name, namespaceId, id, 3, enumtoolmaterial, BlockTags.MINEABLE_BY_AXE);
    }

    @Override
    public boolean onUseItemOnBlock(ItemStack itemstack, Player entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
        int i1 = world.getBlockId(blockX, blockY, blockZ);
        if (i1 == BonusBlocks.BLOCK_COPPERCorroded.id) {
            Block copperBlock = BonusBlocks.BLOCK_COPPERTarnished;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockWithNotify(blockX, blockY, blockZ, copperBlock.id);
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.BLOCK_COPPERTarnished.id) {
            Block copperBlock = BonusBlocks.BLOCK_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockWithNotify(blockX, blockY, blockZ, copperBlock.id);
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.meshCopperCorroded.id) {
            Block copperBlock2 = BonusBlocks.meshCopperTarnished;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.meshCopperTarnished.id) {
            Block copperBlock2 = BonusBlocks.meshCopper;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.BLOCK_RAW_COPPERCorroded.id) {
            Block copperBlock2 = BonusBlocks.BLOCK_RAW_COPPERTarnished;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.BLOCK_RAW_COPPERTarnished.id) {
            Block copperBlock2 = BonusBlocks.BLOCK_RAW_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.slabCopperCorroded.id) {
            Block copperBlock2 = BonusBlocks.slabCopperTarnished;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.slabCopperTarnished.id) {
            Block copperBlock2 = BonusBlocks.slabCopper;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.pressureplateCopperCorroded.id) {
            Block copperBlock2 = BonusBlocks.pressureplateCopperTarnished;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.pressureplateCopperTarnished.id) {
            Block copperBlock2 = BonusBlocks.pressureplateCopper;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.STAIRS_COPPERCorroded.id) {
            Block copperBlock2 = BonusBlocks.STAIRS_COPPERTarnished;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.STAIRS_COPPERTarnished.id) {
            Block copperBlock2 = BonusBlocks.STAIRS_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.PIPE_COPPER_CORRODED.id) {
            Block copperBlock = BonusBlocks.PIPE_COPPER_TARNISHED;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.PIPE_COPPER_TARNISHED.id) {
            Block copperBlock = BonusBlocks.PIPE_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.TRAPDOOR_COPPERCorroded.id) {
            Block copperBlock = BonusBlocks.TRAPDOOR_COPPERTarnished;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.TRAPDOOR_COPPERTarnished.id) {
            Block copperBlock = BonusBlocks.TRAPDOOR_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.fenceCopperCorroded.id) {
            Block copperBlock = BonusBlocks.fenceCopperTarnished;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.fenceCopperTarnished.id) {
            Block copperBlock = BonusBlocks.fenceCopper;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.doorCopperCorrodedTop.id) {
            Block copperBlock = BonusBlocks.doorCopperTarnishedTop;
            Block copperBlock2 = BonusBlocks.doorCopperTarnishedBottom;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                world.setBlockAndMetadataWithNotify(blockX, blockY-1, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY-1, blockZ));
                itemstack.damageItem(2, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.doorCopperCorrodedBottom.id) {
            Block copperBlock = BonusBlocks.doorCopperTarnishedBottom;
            Block copperBlock2 = BonusBlocks.doorCopperTarnishedTop;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                world.setBlockAndMetadataWithNotify(blockX, blockY+1, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY+1, blockZ));
                itemstack.damageItem(2, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.doorCopperTarnishedTop.id) {
            Block copperBlock = BonusBlocks.doorCopperTop;
            Block copperBlock2 = BonusBlocks.doorCopperBottom;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                world.setBlockAndMetadataWithNotify(blockX, blockY-1, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY-1, blockZ));
                itemstack.damageItem(2, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.doorCopperTarnishedBottom.id) {
            Block copperBlock = BonusBlocks.doorCopperBottom;
            Block copperBlock2 = BonusBlocks.doorCopperTop;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                world.setBlockAndMetadataWithNotify(blockX, blockY+1, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY+1, blockZ));
                itemstack.damageItem(2, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        return false;
    }
}
