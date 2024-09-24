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
        if (i1 == BonusBlocks.BLOCK_COPPER.id) {
            Block copperBlock = BonusBlocks.BLOCK_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockWithNotify(blockX, blockY, blockZ, copperBlock.id);
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.BLOCK_COPPER.id) {
            Block copperBlock = BonusBlocks.BLOCK_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockWithNotify(blockX, blockY, blockZ, copperBlock.id);
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.MESH_COPPER.id) {
            Block copperBlock2 = BonusBlocks.MESH_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.MESH_COPPER.id) {
            Block copperBlock2 = BonusBlocks.MESH_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.BLOCK_RAW_COPPER.id) {
            Block copperBlock2 = BonusBlocks.BLOCK_RAW_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.BLOCK_RAW_COPPER.id) {
            Block copperBlock2 = BonusBlocks.BLOCK_RAW_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.SLAB_COPPER.id) {
            Block copperBlock2 = BonusBlocks.SLAB_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.SLAB_COPPER.id) {
            Block copperBlock2 = BonusBlocks.SLAB_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.PRESSURE_PLATE_COPPER.id) {
            Block copperBlock2 = BonusBlocks.PRESSURE_PLATE_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.PRESSURE_PLATE_COPPER.id) {
            Block copperBlock2 = BonusBlocks.PRESSURE_PLATE_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.STAIRS_COPPER.id) {
            Block copperBlock2 = BonusBlocks.STAIRS_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.STAIRS_COPPER.id) {
            Block copperBlock2 = BonusBlocks.STAIRS_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock2, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.PIPE_COPPER.id) {
            Block copperBlock = BonusBlocks.PIPE_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.PIPE_COPPER.id) {
            Block copperBlock = BonusBlocks.PIPE_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.TRAPDOOR_COPPER.id) {
            Block copperBlock = BonusBlocks.TRAPDOOR_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.TRAPDOOR_COPPER.id) {
            Block copperBlock = BonusBlocks.TRAPDOOR_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.FENCE_COPPER.id) {
            Block copperBlock = BonusBlocks.FENCE_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.FENCE_COPPER.id) {
            Block copperBlock = BonusBlocks.FENCE_COPPER;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                itemstack.damageItem(1, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.DOOR_COPPER_TOP.id) {
            Block copperBlock = BonusBlocks.DOOR_COPPER_TOP;
            Block copperBlock2 = BonusBlocks.DOOR_COPPER_BOTTOM;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                world.setBlockAndMetadataWithNotify(blockX, blockY-1, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY-1, blockZ));
                itemstack.damageItem(2, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.DOOR_COPPER_BOTTOM.id) {
            Block copperBlock = BonusBlocks.DOOR_COPPER_BOTTOM;
            Block copperBlock2 = BonusBlocks.DOOR_COPPER_TOP;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                world.setBlockAndMetadataWithNotify(blockX, blockY+1, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY+1, blockZ));
                itemstack.damageItem(2, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.DOOR_COPPER_TOP.id) {
            Block copperBlock = BonusBlocks.DOOR_COPPER_TOP;
            Block copperBlock2 = BonusBlocks.DOOR_COPPER_BOTTOM;
            world.playBlockSoundEffect(null, (float) blockX + 0.5f, (float) blockY + 0.5f, (float) blockZ + 0.5f, copperBlock, EnumBlockSoundEffectType.MINE);
            if (!world.isClientSide) {
                world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, copperBlock.id, world.getBlockMetadata(blockX, blockY, blockZ));
                world.setBlockAndMetadataWithNotify(blockX, blockY-1, blockZ, copperBlock2.id, world.getBlockMetadata(blockX, blockY-1, blockZ));
                itemstack.damageItem(2, entityplayer);
                entityplayer.swingItem();
            }
            entityplayer.swingItem();
        }
        if (i1 == BonusBlocks.DOOR_COPPER_BOTTOM.id) {
            Block copperBlock = BonusBlocks.DOOR_COPPER_BOTTOM;
            Block copperBlock2 = BonusBlocks.DOOR_COPPER_TOP;
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
