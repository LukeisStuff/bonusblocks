package luke.bonusblocks.mixin;

import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemTool;
import net.minecraft.core.item.tool.ItemToolAxe;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = ItemToolAxe.class, remap = false)
public class ItemToolAxeMixin extends ItemTool {

    public ItemToolAxeMixin() {
        super("name", 1, 3, ToolMaterial.diamond, BlockTags.MINEABLE_BY_AXE);
    }

    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
        int i1 = world.getBlockId(blockX, blockY, blockZ);
        if (i1 == BonusBlocks.blockCopperCorroded.id) {
            Block copperBlock = BonusBlocks.blockCopperTarnished;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockWithNotify(blockX, blockY, blockZ, copperBlock.id);
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.blockCopperTarnished.id) {
            Block copperBlock = BonusBlocks.blockCopper;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockWithNotify(blockX, blockY, blockZ, copperBlock.id);
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.meshCopperCorroded.id) {
            Block copperBlock2 = BonusBlocks.meshCopperTarnished;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.meshCopperTarnished.id) {
            Block copperBlock2 = BonusBlocks.meshCopper;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.blockRawCopperCorroded.id) {
            Block copperBlock2 = BonusBlocks.blockRawCopperTarnished;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.blockRawCopperTarnished.id) {
            Block copperBlock2 = BonusBlocks.blockRawCopper;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.slabCopperCorroded.id) {
            Block copperBlock2 = BonusBlocks.slabCopperTarnished;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.slabCopperTarnished.id) {
            Block copperBlock2 = BonusBlocks.slabCopper;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.pressureplateCopperCorroded.id) {
            Block copperBlock2 = BonusBlocks.pressureplateCopperTarnished;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.pressureplateCopperTarnished.id) {
            Block copperBlock2 = BonusBlocks.pressureplateCopper;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.stairsCopperCorroded.id) {
            Block copperBlock2 = BonusBlocks.stairsCopperTarnished;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.stairsCopperTarnished.id) {
            Block copperBlock2 = BonusBlocks.stairsCopper;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.pipeCopperCorroded.id) {
            Block copperBlock = BonusBlocks.pipeCopperTarnished;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.pipeCopperTarnished.id) {
            Block copperBlock = BonusBlocks.pipeCopper;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.trapdoorCopperCorroded.id) {
            Block copperBlock = BonusBlocks.trapdoorCopperTarnished;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.trapdoorCopperTarnished.id) {
            Block copperBlock = BonusBlocks.trapdoorCopper;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.fenceCopperCorroded.id) {
            Block copperBlock = BonusBlocks.fenceCopperTarnished;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.fenceCopperTarnished.id) {
            Block copperBlock = BonusBlocks.fenceCopper;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.doorCopperCorrodedTop.id) {
            Block copperBlock = BonusBlocks.doorCopperTarnishedTop;
            Block copperBlock2 = BonusBlocks.doorCopperTarnishedBottom;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                world.setBlockAndMetadataWithNotify(blockX, blockY-1, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY-1, blockZ));
                itemstack.damageItem(2, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.doorCopperCorrodedBottom.id) {
            Block copperBlock = BonusBlocks.doorCopperTarnishedBottom;
            Block copperBlock2 = BonusBlocks.doorCopperTarnishedTop;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                world.setBlockAndMetadataWithNotify(blockX, blockY+1, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY+1, blockZ));
                itemstack.damageItem(2, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.doorCopperTarnishedTop.id) {
            Block copperBlock = BonusBlocks.doorCopperTop;
            Block copperBlock2 = BonusBlocks.doorCopperBottom;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                world.setBlockAndMetadataWithNotify(blockX, blockY-1, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY-1, blockZ));
                itemstack.damageItem(2, entityplayer);
                entityplayer.swingItem();
            }
        }
        if (i1 == BonusBlocks.doorCopperTarnishedBottom.id) {
            Block copperBlock = BonusBlocks.doorCopperBottom;
            Block copperBlock2 = BonusBlocks.doorCopperTop;
            world.playBlockSoundEffect((float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                world.setBlockAndMetadataWithNotify(blockX, blockY+1, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY+1, blockZ));
                itemstack.damageItem(2, entityplayer);
                entityplayer.swingItem();
            }
        }
        return false;
    }
}
