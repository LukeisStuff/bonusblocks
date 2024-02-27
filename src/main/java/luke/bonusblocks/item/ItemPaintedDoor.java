package luke.bonusblocks.item;

import luke.bonusblocks.block.BonusBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.TextureHelper;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;


public class ItemPaintedDoor extends Item {
    public static final String[] dyeColors = new String[]{"white", "orange", "magenta", "lightblue", "yellow", "lime", "pink", "gray", "silver", "cyan", "purple", "blue", "brown", "green", "red", "black"};

    public ItemPaintedDoor(String name, int id) {
        super(name, id);
        this.maxStackSize = 64;
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    public int getIconFromDamage(int id) {
        if (id == 0) {
            return TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "whitedoor.png");
        }
        if (id == 1) {
            return TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "orangedoor.png");
        }
        if (id == 2) {
            return TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "magentadoor.png");
        }
        if (id == 3) {
            return TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "lightbluedoor.png");
        }
        if (id == 4) {
            return TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "yellowdoor.png");
        }
        if (id == 5) {
            return TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "limedoor.png");
        }
        if (id == 6) {
            return TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "pinkdoor.png");
        }
        if (id == 7) {
            return TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "graydoor.png");
        }
        if (id == 8) {
            return TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "lightgraydoor.png");
        }
        if (id == 9) {
            return TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "cyandoor.png");
        }
        if (id == 10) {
            return TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "purpledoor.png");
        }
        if (id == 11) {
            return TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "bluedoor.png");
        }
        if (id == 12) {
            return TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "browndoor.png");
        }
        if (id == 13) {
            return TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "greendoor.png");
        }
        if (id == 14) {
            return TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "reddoor.png");
        }
        if (id == 15) {
            return TextureHelper.getOrCreateItemTextureIndex(MOD_ID, "blackdoor.png");
        }
        return id;
    }

    public String getLanguageKey(ItemStack itemstack) {
        return super.getKey() + "." + dyeColors[itemstack.getMetadata()];
    }

    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
        if (!world.canPlaceInsideBlock(blockX, blockY, blockZ)) {
            if (itemstack.getMetadata() == 0) {
                blockX += side.getOffsetX();
                blockY += side.getOffsetY();
                blockZ += side.getOffsetZ();
                Block doorBlockBottom;
                Block doorBlockTop;
                doorBlockBottom = BonusBlocks.doorPlanksOakWhiteBottom;
                doorBlockTop = BonusBlocks.doorPlanksOakWhiteTop;
                if (!doorBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
                    return false;
                } else {
                    Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
                    int meta = dir.getHorizontalIndex();
                    int xOffset = -dir.getOffsetX();
                    int zOffset = -dir.getOffsetZ();
                    int isSolidBlockLeft = (world.isBlockNormalCube(blockX - xOffset, blockY, blockZ - zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX - xOffset, blockY + 1, blockZ - zOffset) ? 1 : 0);
                    int isSolidBlockRight = (world.isBlockNormalCube(blockX + xOffset, blockY, blockZ + zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX + xOffset, blockY + 1, blockZ + zOffset) ? 1 : 0);
                    boolean isDoorLeft = world.getBlockId(blockX - xOffset, blockY, blockZ - zOffset) == doorBlockBottom.id || world.getBlockId(blockX - xOffset, blockY + 1, blockZ - zOffset) == doorBlockTop.id;
                    boolean isDoorRight = world.getBlockId(blockX + xOffset, blockY, blockZ + zOffset) == doorBlockBottom.id || world.getBlockId(blockX + xOffset, blockY + 1, blockZ + zOffset) == doorBlockTop.id;
                    boolean isMirrored = false;
                    if (isDoorLeft && !isDoorRight) {
                        isMirrored = true;
                    } else if (isSolidBlockRight > isSolidBlockLeft) {
                        isMirrored = true;
                    }
                    if (isMirrored) {
                        meta = meta - 1 & 3;
                        meta += 4;
                        meta |= 8;
                    }
                    world.editingBlocks = true;
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, doorBlockBottom.id, meta);
                    world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, doorBlockTop.id, meta);
                    world.editingBlocks = false;
                    world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, doorBlockBottom.id);
                    world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, doorBlockTop.id);
                    world.playBlockSoundEffect((float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, doorBlockBottom, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
                    return true;
                }
            }
            if (itemstack.getMetadata() == 1) {
                blockX += side.getOffsetX();
                blockY += side.getOffsetY();
                blockZ += side.getOffsetZ();
                Block doorBlockBottom;
                Block doorBlockTop;
                doorBlockBottom = BonusBlocks.doorPlanksOakOrangeBottom;
                doorBlockTop = BonusBlocks.doorPlanksOakOrangeTop;
                if (!doorBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
                    return false;
                } else {
                    Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
                    int meta = dir.getHorizontalIndex();
                    int xOffset = -dir.getOffsetX();
                    int zOffset = -dir.getOffsetZ();
                    int isSolidBlockLeft = (world.isBlockNormalCube(blockX - xOffset, blockY, blockZ - zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX - xOffset, blockY + 1, blockZ - zOffset) ? 1 : 0);
                    int isSolidBlockRight = (world.isBlockNormalCube(blockX + xOffset, blockY, blockZ + zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX + xOffset, blockY + 1, blockZ + zOffset) ? 1 : 0);
                    boolean isDoorLeft = world.getBlockId(blockX - xOffset, blockY, blockZ - zOffset) == doorBlockBottom.id || world.getBlockId(blockX - xOffset, blockY + 1, blockZ - zOffset) == doorBlockTop.id;
                    boolean isDoorRight = world.getBlockId(blockX + xOffset, blockY, blockZ + zOffset) == doorBlockBottom.id || world.getBlockId(blockX + xOffset, blockY + 1, blockZ + zOffset) == doorBlockTop.id;
                    boolean isMirrored = false;
                    if (isDoorLeft && !isDoorRight) {
                        isMirrored = true;
                    } else if (isSolidBlockRight > isSolidBlockLeft) {
                        isMirrored = true;
                    }

                    if (isMirrored) {
                        meta = meta - 1 & 3;
                        meta += 4;
                        meta |= 8;
                    }
                    world.editingBlocks = true;
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, doorBlockBottom.id, meta);
                    world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, doorBlockTop.id, meta);
                    world.editingBlocks = false;
                    world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, doorBlockBottom.id);
                    world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, doorBlockTop.id);
                    world.playBlockSoundEffect((float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, doorBlockBottom, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
                    return true;
                }
            }
            if (itemstack.getMetadata() == 2) {
                blockX += side.getOffsetX();
                blockY += side.getOffsetY();
                blockZ += side.getOffsetZ();
                Block doorBlockBottom;
                Block doorBlockTop;
                doorBlockBottom = BonusBlocks.doorPlanksOakMagentaBottom;
                doorBlockTop = BonusBlocks.doorPlanksOakMagentaTop;
                if (!doorBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
                    return false;
                } else {
                    Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
                    int meta = dir.getHorizontalIndex();
                    int xOffset = -dir.getOffsetX();
                    int zOffset = -dir.getOffsetZ();
                    int isSolidBlockLeft = (world.isBlockNormalCube(blockX - xOffset, blockY, blockZ - zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX - xOffset, blockY + 1, blockZ - zOffset) ? 1 : 0);
                    int isSolidBlockRight = (world.isBlockNormalCube(blockX + xOffset, blockY, blockZ + zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX + xOffset, blockY + 1, blockZ + zOffset) ? 1 : 0);
                    boolean isDoorLeft = world.getBlockId(blockX - xOffset, blockY, blockZ - zOffset) == doorBlockBottom.id || world.getBlockId(blockX - xOffset, blockY + 1, blockZ - zOffset) == doorBlockTop.id;
                    boolean isDoorRight = world.getBlockId(blockX + xOffset, blockY, blockZ + zOffset) == doorBlockBottom.id || world.getBlockId(blockX + xOffset, blockY + 1, blockZ + zOffset) == doorBlockTop.id;
                    boolean isMirrored = false;
                    if (isDoorLeft && !isDoorRight) {
                        isMirrored = true;
                    } else if (isSolidBlockRight > isSolidBlockLeft) {
                        isMirrored = true;
                    }

                    if (isMirrored) {
                        meta = meta - 1 & 3;
                        meta += 4;
                        meta |= 8;
                    }
                    world.editingBlocks = true;
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, doorBlockBottom.id, meta);
                    world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, doorBlockTop.id, meta);
                    world.editingBlocks = false;
                    world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, doorBlockBottom.id);
                    world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, doorBlockTop.id);
                    world.playBlockSoundEffect((float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, doorBlockBottom, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
                    return true;
                }
            }
            if (itemstack.getMetadata() == 3) {
                blockX += side.getOffsetX();
                blockY += side.getOffsetY();
                blockZ += side.getOffsetZ();
                Block doorBlockBottom;
                Block doorBlockTop;
                doorBlockBottom = BonusBlocks.doorPlanksOakLightBlueBottom;
                doorBlockTop = BonusBlocks.doorPlanksOakLightBlueTop;
                if (!doorBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
                    return false;
                } else {
                    Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
                    int meta = dir.getHorizontalIndex();
                    int xOffset = -dir.getOffsetX();
                    int zOffset = -dir.getOffsetZ();
                    int isSolidBlockLeft = (world.isBlockNormalCube(blockX - xOffset, blockY, blockZ - zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX - xOffset, blockY + 1, blockZ - zOffset) ? 1 : 0);
                    int isSolidBlockRight = (world.isBlockNormalCube(blockX + xOffset, blockY, blockZ + zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX + xOffset, blockY + 1, blockZ + zOffset) ? 1 : 0);
                    boolean isDoorLeft = world.getBlockId(blockX - xOffset, blockY, blockZ - zOffset) == doorBlockBottom.id || world.getBlockId(blockX - xOffset, blockY + 1, blockZ - zOffset) == doorBlockTop.id;
                    boolean isDoorRight = world.getBlockId(blockX + xOffset, blockY, blockZ + zOffset) == doorBlockBottom.id || world.getBlockId(blockX + xOffset, blockY + 1, blockZ + zOffset) == doorBlockTop.id;
                    boolean isMirrored = false;
                    if (isDoorLeft && !isDoorRight) {
                        isMirrored = true;
                    } else if (isSolidBlockRight > isSolidBlockLeft) {
                        isMirrored = true;
                    }

                    if (isMirrored) {
                        meta = meta - 1 & 3;
                        meta += 4;
                        meta |= 8;
                    }
                    world.editingBlocks = true;
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, doorBlockBottom.id, meta);
                    world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, doorBlockTop.id, meta);
                    world.editingBlocks = false;
                    world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, doorBlockBottom.id);
                    world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, doorBlockTop.id);
                    world.playBlockSoundEffect((float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, doorBlockBottom, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
                    return true;
                }
            }
            if (itemstack.getMetadata() == 4) {
                blockX += side.getOffsetX();
                blockY += side.getOffsetY();
                blockZ += side.getOffsetZ();
                Block doorBlockBottom;
                Block doorBlockTop;
                doorBlockBottom = BonusBlocks.doorPlanksOakYellowBottom;
                doorBlockTop = BonusBlocks.doorPlanksOakYellowTop;
                if (!doorBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
                    return false;
                } else {
                    Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
                    int meta = dir.getHorizontalIndex();
                    int xOffset = -dir.getOffsetX();
                    int zOffset = -dir.getOffsetZ();
                    int isSolidBlockLeft = (world.isBlockNormalCube(blockX - xOffset, blockY, blockZ - zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX - xOffset, blockY + 1, blockZ - zOffset) ? 1 : 0);
                    int isSolidBlockRight = (world.isBlockNormalCube(blockX + xOffset, blockY, blockZ + zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX + xOffset, blockY + 1, blockZ + zOffset) ? 1 : 0);
                    boolean isDoorLeft = world.getBlockId(blockX - xOffset, blockY, blockZ - zOffset) == doorBlockBottom.id || world.getBlockId(blockX - xOffset, blockY + 1, blockZ - zOffset) == doorBlockTop.id;
                    boolean isDoorRight = world.getBlockId(blockX + xOffset, blockY, blockZ + zOffset) == doorBlockBottom.id || world.getBlockId(blockX + xOffset, blockY + 1, blockZ + zOffset) == doorBlockTop.id;
                    boolean isMirrored = false;
                    if (isDoorLeft && !isDoorRight) {
                        isMirrored = true;
                    } else if (isSolidBlockRight > isSolidBlockLeft) {
                        isMirrored = true;
                    }

                    if (isMirrored) {
                        meta = meta - 1 & 3;
                        meta += 4;
                        meta |= 8;
                    }
                    world.editingBlocks = true;
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, doorBlockBottom.id, meta);
                    world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, doorBlockTop.id, meta);
                    world.editingBlocks = false;
                    world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, doorBlockBottom.id);
                    world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, doorBlockTop.id);
                    world.playBlockSoundEffect((float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, doorBlockBottom, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
                    return true;
                }
            }
            if (itemstack.getMetadata() == 5) {
                blockX += side.getOffsetX();
                blockY += side.getOffsetY();
                blockZ += side.getOffsetZ();
                Block doorBlockBottom;
                Block doorBlockTop;
                doorBlockBottom = BonusBlocks.doorPlanksOakLimeBottom;
                doorBlockTop = BonusBlocks.doorPlanksOakLimeTop;
                if (!doorBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
                    return false;
                } else {
                    Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
                    int meta = dir.getHorizontalIndex();
                    int xOffset = -dir.getOffsetX();
                    int zOffset = -dir.getOffsetZ();
                    int isSolidBlockLeft = (world.isBlockNormalCube(blockX - xOffset, blockY, blockZ - zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX - xOffset, blockY + 1, blockZ - zOffset) ? 1 : 0);
                    int isSolidBlockRight = (world.isBlockNormalCube(blockX + xOffset, blockY, blockZ + zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX + xOffset, blockY + 1, blockZ + zOffset) ? 1 : 0);
                    boolean isDoorLeft = world.getBlockId(blockX - xOffset, blockY, blockZ - zOffset) == doorBlockBottom.id || world.getBlockId(blockX - xOffset, blockY + 1, blockZ - zOffset) == doorBlockTop.id;
                    boolean isDoorRight = world.getBlockId(blockX + xOffset, blockY, blockZ + zOffset) == doorBlockBottom.id || world.getBlockId(blockX + xOffset, blockY + 1, blockZ + zOffset) == doorBlockTop.id;
                    boolean isMirrored = false;
                    if (isDoorLeft && !isDoorRight) {
                        isMirrored = true;
                    } else if (isSolidBlockRight > isSolidBlockLeft) {
                        isMirrored = true;
                    }

                    if (isMirrored) {
                        meta = meta - 1 & 3;
                        meta += 4;
                        meta |= 8;
                    }
                    world.editingBlocks = true;
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, doorBlockBottom.id, meta);
                    world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, doorBlockTop.id, meta);
                    world.editingBlocks = false;
                    world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, doorBlockBottom.id);
                    world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, doorBlockTop.id);
                    world.playBlockSoundEffect((float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, doorBlockBottom, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
                    return true;
                }
            }
            if (itemstack.getMetadata() == 6) {
                blockX += side.getOffsetX();
                blockY += side.getOffsetY();
                blockZ += side.getOffsetZ();
                Block doorBlockBottom;
                Block doorBlockTop;
                doorBlockBottom = BonusBlocks.doorPlanksOakPinkBottom;
                doorBlockTop = BonusBlocks.doorPlanksOakPinkTop;
                if (!doorBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
                    return false;
                } else {
                    Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
                    int meta = dir.getHorizontalIndex();
                    int xOffset = -dir.getOffsetX();
                    int zOffset = -dir.getOffsetZ();
                    int isSolidBlockLeft = (world.isBlockNormalCube(blockX - xOffset, blockY, blockZ - zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX - xOffset, blockY + 1, blockZ - zOffset) ? 1 : 0);
                    int isSolidBlockRight = (world.isBlockNormalCube(blockX + xOffset, blockY, blockZ + zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX + xOffset, blockY + 1, blockZ + zOffset) ? 1 : 0);
                    boolean isDoorLeft = world.getBlockId(blockX - xOffset, blockY, blockZ - zOffset) == doorBlockBottom.id || world.getBlockId(blockX - xOffset, blockY + 1, blockZ - zOffset) == doorBlockTop.id;
                    boolean isDoorRight = world.getBlockId(blockX + xOffset, blockY, blockZ + zOffset) == doorBlockBottom.id || world.getBlockId(blockX + xOffset, blockY + 1, blockZ + zOffset) == doorBlockTop.id;
                    boolean isMirrored = false;
                    if (isDoorLeft && !isDoorRight) {
                        isMirrored = true;
                    } else if (isSolidBlockRight > isSolidBlockLeft) {
                        isMirrored = true;
                    }

                    if (isMirrored) {
                        meta = meta - 1 & 3;
                        meta += 4;
                        meta |= 8;
                    }
                    world.editingBlocks = true;
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, doorBlockBottom.id, meta);
                    world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, doorBlockTop.id, meta);
                    world.editingBlocks = false;
                    world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, doorBlockBottom.id);
                    world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, doorBlockTop.id);
                    world.playBlockSoundEffect((float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, doorBlockBottom, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
                    return true;
                }
            }
            if (itemstack.getMetadata() == 7) {
                blockX += side.getOffsetX();
                blockY += side.getOffsetY();
                blockZ += side.getOffsetZ();
                Block doorBlockBottom;
                Block doorBlockTop;
                doorBlockBottom = BonusBlocks.doorPlanksOakGrayBottom;
                doorBlockTop = BonusBlocks.doorPlanksOakGrayTop;
                if (!doorBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
                    return false;
                } else {
                    Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
                    int meta = dir.getHorizontalIndex();
                    int xOffset = -dir.getOffsetX();
                    int zOffset = -dir.getOffsetZ();
                    int isSolidBlockLeft = (world.isBlockNormalCube(blockX - xOffset, blockY, blockZ - zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX - xOffset, blockY + 1, blockZ - zOffset) ? 1 : 0);
                    int isSolidBlockRight = (world.isBlockNormalCube(blockX + xOffset, blockY, blockZ + zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX + xOffset, blockY + 1, blockZ + zOffset) ? 1 : 0);
                    boolean isDoorLeft = world.getBlockId(blockX - xOffset, blockY, blockZ - zOffset) == doorBlockBottom.id || world.getBlockId(blockX - xOffset, blockY + 1, blockZ - zOffset) == doorBlockTop.id;
                    boolean isDoorRight = world.getBlockId(blockX + xOffset, blockY, blockZ + zOffset) == doorBlockBottom.id || world.getBlockId(blockX + xOffset, blockY + 1, blockZ + zOffset) == doorBlockTop.id;
                    boolean isMirrored = false;
                    if (isDoorLeft && !isDoorRight) {
                        isMirrored = true;
                    } else if (isSolidBlockRight > isSolidBlockLeft) {
                        isMirrored = true;
                    }

                    if (isMirrored) {
                        meta = meta - 1 & 3;
                        meta += 4;
                        meta |= 8;
                    }
                    world.editingBlocks = true;
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, doorBlockBottom.id, meta);
                    world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, doorBlockTop.id, meta);
                    world.editingBlocks = false;
                    world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, doorBlockBottom.id);
                    world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, doorBlockTop.id);
                    world.playBlockSoundEffect((float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, doorBlockBottom, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
                    return true;
                }
            }
            if (itemstack.getMetadata() == 8) {
                blockX += side.getOffsetX();
                blockY += side.getOffsetY();
                blockZ += side.getOffsetZ();
                Block doorBlockBottom;
                Block doorBlockTop;
                doorBlockBottom = BonusBlocks.doorPlanksOakSilverBottom;
                doorBlockTop = BonusBlocks.doorPlanksOakSilverTop;
                if (!doorBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
                    return false;
                } else {
                    Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
                    int meta = dir.getHorizontalIndex();
                    int xOffset = -dir.getOffsetX();
                    int zOffset = -dir.getOffsetZ();
                    int isSolidBlockLeft = (world.isBlockNormalCube(blockX - xOffset, blockY, blockZ - zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX - xOffset, blockY + 1, blockZ - zOffset) ? 1 : 0);
                    int isSolidBlockRight = (world.isBlockNormalCube(blockX + xOffset, blockY, blockZ + zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX + xOffset, blockY + 1, blockZ + zOffset) ? 1 : 0);
                    boolean isDoorLeft = world.getBlockId(blockX - xOffset, blockY, blockZ - zOffset) == doorBlockBottom.id || world.getBlockId(blockX - xOffset, blockY + 1, blockZ - zOffset) == doorBlockTop.id;
                    boolean isDoorRight = world.getBlockId(blockX + xOffset, blockY, blockZ + zOffset) == doorBlockBottom.id || world.getBlockId(blockX + xOffset, blockY + 1, blockZ + zOffset) == doorBlockTop.id;
                    boolean isMirrored = false;
                    if (isDoorLeft && !isDoorRight) {
                        isMirrored = true;
                    } else if (isSolidBlockRight > isSolidBlockLeft) {
                        isMirrored = true;
                    }

                    if (isMirrored) {
                        meta = meta - 1 & 3;
                        meta += 4;
                        meta |= 8;
                    }
                    world.editingBlocks = true;
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, doorBlockBottom.id, meta);
                    world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, doorBlockTop.id, meta);
                    world.editingBlocks = false;
                    world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, doorBlockBottom.id);
                    world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, doorBlockTop.id);
                    world.playBlockSoundEffect((float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, doorBlockBottom, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
                    return true;
                }
            }
            if (itemstack.getMetadata() == 9) {
                blockX += side.getOffsetX();
                blockY += side.getOffsetY();
                blockZ += side.getOffsetZ();
                Block doorBlockBottom;
                Block doorBlockTop;
                doorBlockBottom = BonusBlocks.doorPlanksOakCyanBottom;
                doorBlockTop = BonusBlocks.doorPlanksOakCyanTop;
                if (!doorBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
                    return false;
                } else {
                    Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
                    int meta = dir.getHorizontalIndex();
                    int xOffset = -dir.getOffsetX();
                    int zOffset = -dir.getOffsetZ();
                    int isSolidBlockLeft = (world.isBlockNormalCube(blockX - xOffset, blockY, blockZ - zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX - xOffset, blockY + 1, blockZ - zOffset) ? 1 : 0);
                    int isSolidBlockRight = (world.isBlockNormalCube(blockX + xOffset, blockY, blockZ + zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX + xOffset, blockY + 1, blockZ + zOffset) ? 1 : 0);
                    boolean isDoorLeft = world.getBlockId(blockX - xOffset, blockY, blockZ - zOffset) == doorBlockBottom.id || world.getBlockId(blockX - xOffset, blockY + 1, blockZ - zOffset) == doorBlockTop.id;
                    boolean isDoorRight = world.getBlockId(blockX + xOffset, blockY, blockZ + zOffset) == doorBlockBottom.id || world.getBlockId(blockX + xOffset, blockY + 1, blockZ + zOffset) == doorBlockTop.id;
                    boolean isMirrored = false;
                    if (isDoorLeft && !isDoorRight) {
                        isMirrored = true;
                    } else if (isSolidBlockRight > isSolidBlockLeft) {
                        isMirrored = true;
                    }

                    if (isMirrored) {
                        meta = meta - 1 & 3;
                        meta += 4;
                        meta |= 8;
                    }
                    world.editingBlocks = true;
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, doorBlockBottom.id, meta);
                    world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, doorBlockTop.id, meta);
                    world.editingBlocks = false;
                    world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, doorBlockBottom.id);
                    world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, doorBlockTop.id);
                    world.playBlockSoundEffect((float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, doorBlockBottom, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
                    return true;
                }
            }
            if (itemstack.getMetadata() == 10) {
                blockX += side.getOffsetX();
                blockY += side.getOffsetY();
                blockZ += side.getOffsetZ();
                Block doorBlockBottom;
                Block doorBlockTop;
                doorBlockBottom = BonusBlocks.doorPlanksOakPurpleBottom;
                doorBlockTop = BonusBlocks.doorPlanksOakPurpleTop;
                if (!doorBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
                    return false;
                } else {
                    Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
                    int meta = dir.getHorizontalIndex();
                    int xOffset = -dir.getOffsetX();
                    int zOffset = -dir.getOffsetZ();
                    int isSolidBlockLeft = (world.isBlockNormalCube(blockX - xOffset, blockY, blockZ - zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX - xOffset, blockY + 1, blockZ - zOffset) ? 1 : 0);
                    int isSolidBlockRight = (world.isBlockNormalCube(blockX + xOffset, blockY, blockZ + zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX + xOffset, blockY + 1, blockZ + zOffset) ? 1 : 0);
                    boolean isDoorLeft = world.getBlockId(blockX - xOffset, blockY, blockZ - zOffset) == doorBlockBottom.id || world.getBlockId(blockX - xOffset, blockY + 1, blockZ - zOffset) == doorBlockTop.id;
                    boolean isDoorRight = world.getBlockId(blockX + xOffset, blockY, blockZ + zOffset) == doorBlockBottom.id || world.getBlockId(blockX + xOffset, blockY + 1, blockZ + zOffset) == doorBlockTop.id;
                    boolean isMirrored = false;
                    if (isDoorLeft && !isDoorRight) {
                        isMirrored = true;
                    } else if (isSolidBlockRight > isSolidBlockLeft) {
                        isMirrored = true;
                    }

                    if (isMirrored) {
                        meta = meta - 1 & 3;
                        meta += 4;
                        meta |= 8;
                    }
                    world.editingBlocks = true;
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, doorBlockBottom.id, meta);
                    world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, doorBlockTop.id, meta);
                    world.editingBlocks = false;
                    world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, doorBlockBottom.id);
                    world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, doorBlockTop.id);
                    world.playBlockSoundEffect((float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, doorBlockBottom, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
                    return true;
                }
            }
            if (itemstack.getMetadata() == 11) {
                blockX += side.getOffsetX();
                blockY += side.getOffsetY();
                blockZ += side.getOffsetZ();
                Block doorBlockBottom;
                Block doorBlockTop;
                doorBlockBottom = BonusBlocks.doorPlanksOakBlueBottom;
                doorBlockTop = BonusBlocks.doorPlanksOakBlueTop;
                if (!doorBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
                    return false;
                } else {
                    Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
                    int meta = dir.getHorizontalIndex();
                    int xOffset = -dir.getOffsetX();
                    int zOffset = -dir.getOffsetZ();
                    int isSolidBlockLeft = (world.isBlockNormalCube(blockX - xOffset, blockY, blockZ - zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX - xOffset, blockY + 1, blockZ - zOffset) ? 1 : 0);
                    int isSolidBlockRight = (world.isBlockNormalCube(blockX + xOffset, blockY, blockZ + zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX + xOffset, blockY + 1, blockZ + zOffset) ? 1 : 0);
                    boolean isDoorLeft = world.getBlockId(blockX - xOffset, blockY, blockZ - zOffset) == doorBlockBottom.id || world.getBlockId(blockX - xOffset, blockY + 1, blockZ - zOffset) == doorBlockTop.id;
                    boolean isDoorRight = world.getBlockId(blockX + xOffset, blockY, blockZ + zOffset) == doorBlockBottom.id || world.getBlockId(blockX + xOffset, blockY + 1, blockZ + zOffset) == doorBlockTop.id;
                    boolean isMirrored = false;
                    if (isDoorLeft && !isDoorRight) {
                        isMirrored = true;
                    } else if (isSolidBlockRight > isSolidBlockLeft) {
                        isMirrored = true;
                    }

                    if (isMirrored) {
                        meta = meta - 1 & 3;
                        meta += 4;
                        meta |= 8;
                    }
                    world.editingBlocks = true;
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, doorBlockBottom.id, meta);
                    world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, doorBlockTop.id, meta);
                    world.editingBlocks = false;
                    world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, doorBlockBottom.id);
                    world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, doorBlockTop.id);
                    world.playBlockSoundEffect((float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, doorBlockBottom, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
                    return true;
                }
            }
            if (itemstack.getMetadata() == 12) {
                blockX += side.getOffsetX();
                blockY += side.getOffsetY();
                blockZ += side.getOffsetZ();
                Block doorBlockBottom;
                Block doorBlockTop;
                doorBlockBottom = BonusBlocks.doorPlanksOakBrownBottom;
                doorBlockTop = BonusBlocks.doorPlanksOakBrownTop;
                if (!doorBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
                    return false;
                } else {
                    Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
                    int meta = dir.getHorizontalIndex();
                    int xOffset = -dir.getOffsetX();
                    int zOffset = -dir.getOffsetZ();
                    int isSolidBlockLeft = (world.isBlockNormalCube(blockX - xOffset, blockY, blockZ - zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX - xOffset, blockY + 1, blockZ - zOffset) ? 1 : 0);
                    int isSolidBlockRight = (world.isBlockNormalCube(blockX + xOffset, blockY, blockZ + zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX + xOffset, blockY + 1, blockZ + zOffset) ? 1 : 0);
                    boolean isDoorLeft = world.getBlockId(blockX - xOffset, blockY, blockZ - zOffset) == doorBlockBottom.id || world.getBlockId(blockX - xOffset, blockY + 1, blockZ - zOffset) == doorBlockTop.id;
                    boolean isDoorRight = world.getBlockId(blockX + xOffset, blockY, blockZ + zOffset) == doorBlockBottom.id || world.getBlockId(blockX + xOffset, blockY + 1, blockZ + zOffset) == doorBlockTop.id;
                    boolean isMirrored = false;
                    if (isDoorLeft && !isDoorRight) {
                        isMirrored = true;
                    } else if (isSolidBlockRight > isSolidBlockLeft) {
                        isMirrored = true;
                    }

                    if (isMirrored) {
                        meta = meta - 1 & 3;
                        meta += 4;
                        meta |= 8;
                    }
                    world.editingBlocks = true;
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, doorBlockBottom.id, meta);
                    world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, doorBlockTop.id, meta);
                    world.editingBlocks = false;
                    world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, doorBlockBottom.id);
                    world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, doorBlockTop.id);
                    world.playBlockSoundEffect((float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, doorBlockBottom, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
                    return true;
                }
            }
            if (itemstack.getMetadata() == 13) {
                blockX += side.getOffsetX();
                blockY += side.getOffsetY();
                blockZ += side.getOffsetZ();
                Block doorBlockBottom;
                Block doorBlockTop;
                doorBlockBottom = BonusBlocks.doorPlanksOakGreenBottom;
                doorBlockTop = BonusBlocks.doorPlanksOakGreenTop;
                if (!doorBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
                    return false;
                } else {
                    Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
                    int meta = dir.getHorizontalIndex();
                    int xOffset = -dir.getOffsetX();
                    int zOffset = -dir.getOffsetZ();
                    int isSolidBlockLeft = (world.isBlockNormalCube(blockX - xOffset, blockY, blockZ - zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX - xOffset, blockY + 1, blockZ - zOffset) ? 1 : 0);
                    int isSolidBlockRight = (world.isBlockNormalCube(blockX + xOffset, blockY, blockZ + zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX + xOffset, blockY + 1, blockZ + zOffset) ? 1 : 0);
                    boolean isDoorLeft = world.getBlockId(blockX - xOffset, blockY, blockZ - zOffset) == doorBlockBottom.id || world.getBlockId(blockX - xOffset, blockY + 1, blockZ - zOffset) == doorBlockTop.id;
                    boolean isDoorRight = world.getBlockId(blockX + xOffset, blockY, blockZ + zOffset) == doorBlockBottom.id || world.getBlockId(blockX + xOffset, blockY + 1, blockZ + zOffset) == doorBlockTop.id;
                    boolean isMirrored = false;
                    if (isDoorLeft && !isDoorRight) {
                        isMirrored = true;
                    } else if (isSolidBlockRight > isSolidBlockLeft) {
                        isMirrored = true;
                    }

                    if (isMirrored) {
                        meta = meta - 1 & 3;
                        meta += 4;
                        meta |= 8;
                    }
                    world.editingBlocks = true;
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, doorBlockBottom.id, meta);
                    world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, doorBlockTop.id, meta);
                    world.editingBlocks = false;
                    world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, doorBlockBottom.id);
                    world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, doorBlockTop.id);
                    world.playBlockSoundEffect((float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, doorBlockBottom, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
                    return true;
                }
            }
            if (itemstack.getMetadata() == 14) {
                blockX += side.getOffsetX();
                blockY += side.getOffsetY();
                blockZ += side.getOffsetZ();
                Block doorBlockBottom;
                Block doorBlockTop;
                doorBlockBottom = BonusBlocks.doorPlanksOakRedBottom;
                doorBlockTop = BonusBlocks.doorPlanksOakRedTop;
                if (!doorBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
                    return false;
                } else {
                    Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
                    int meta = dir.getHorizontalIndex();
                    int xOffset = -dir.getOffsetX();
                    int zOffset = -dir.getOffsetZ();
                    int isSolidBlockLeft = (world.isBlockNormalCube(blockX - xOffset, blockY, blockZ - zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX - xOffset, blockY + 1, blockZ - zOffset) ? 1 : 0);
                    int isSolidBlockRight = (world.isBlockNormalCube(blockX + xOffset, blockY, blockZ + zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX + xOffset, blockY + 1, blockZ + zOffset) ? 1 : 0);
                    boolean isDoorLeft = world.getBlockId(blockX - xOffset, blockY, blockZ - zOffset) == doorBlockBottom.id || world.getBlockId(blockX - xOffset, blockY + 1, blockZ - zOffset) == doorBlockTop.id;
                    boolean isDoorRight = world.getBlockId(blockX + xOffset, blockY, blockZ + zOffset) == doorBlockBottom.id || world.getBlockId(blockX + xOffset, blockY + 1, blockZ + zOffset) == doorBlockTop.id;
                    boolean isMirrored = false;
                    if (isDoorLeft && !isDoorRight) {
                        isMirrored = true;
                    } else if (isSolidBlockRight > isSolidBlockLeft) {
                        isMirrored = true;
                    }

                    if (isMirrored) {
                        meta = meta - 1 & 3;
                        meta += 4;
                        meta |= 8;
                    }
                    world.editingBlocks = true;
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, doorBlockBottom.id, meta);
                    world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, doorBlockTop.id, meta);
                    world.editingBlocks = false;
                    world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, doorBlockBottom.id);
                    world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, doorBlockTop.id);
                    world.playBlockSoundEffect((float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, doorBlockBottom, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
                    return true;
                }
            }
            if (itemstack.getMetadata() == 15) {
                blockX += side.getOffsetX();
                blockY += side.getOffsetY();
                blockZ += side.getOffsetZ();
                Block doorBlockBottom;
                Block doorBlockTop;
                doorBlockBottom = BonusBlocks.doorPlanksOakBlackBottom;
                doorBlockTop = BonusBlocks.doorPlanksOakBlackTop;
                if (!doorBlockBottom.canPlaceBlockAt(world, blockX, blockY, blockZ)) {
                    return false;
                } else {
                    Direction dir = entityplayer.getHorizontalPlacementDirection(side).rotate(3);
                    int meta = dir.getHorizontalIndex();
                    int xOffset = -dir.getOffsetX();
                    int zOffset = -dir.getOffsetZ();
                    int isSolidBlockLeft = (world.isBlockNormalCube(blockX - xOffset, blockY, blockZ - zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX - xOffset, blockY + 1, blockZ - zOffset) ? 1 : 0);
                    int isSolidBlockRight = (world.isBlockNormalCube(blockX + xOffset, blockY, blockZ + zOffset) ? 1 : 0) + (world.isBlockNormalCube(blockX + xOffset, blockY + 1, blockZ + zOffset) ? 1 : 0);
                    boolean isDoorLeft = world.getBlockId(blockX - xOffset, blockY, blockZ - zOffset) == doorBlockBottom.id || world.getBlockId(blockX - xOffset, blockY + 1, blockZ - zOffset) == doorBlockTop.id;
                    boolean isDoorRight = world.getBlockId(blockX + xOffset, blockY, blockZ + zOffset) == doorBlockBottom.id || world.getBlockId(blockX + xOffset, blockY + 1, blockZ + zOffset) == doorBlockTop.id;
                    boolean isMirrored = false;
                    if (isDoorLeft && !isDoorRight) {
                        isMirrored = true;
                    } else if (isSolidBlockRight > isSolidBlockLeft) {
                        isMirrored = true;
                    }

                    if (isMirrored) {
                        meta = meta - 1 & 3;
                        meta += 4;
                        meta |= 8;
                    }
                    world.editingBlocks = true;
                    world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, doorBlockBottom.id, meta);
                    world.setBlockAndMetadataWithNotify(blockX, blockY + 1, blockZ, doorBlockTop.id, meta);
                    world.editingBlocks = false;
                    world.notifyBlocksOfNeighborChange(blockX, blockY, blockZ, doorBlockBottom.id);
                    world.notifyBlocksOfNeighborChange(blockX, blockY + 1, blockZ, doorBlockTop.id);
                    world.playBlockSoundEffect((float) blockX + 0.5F, (float) blockY + 0.5F, (float) blockZ + 0.5F, doorBlockBottom, EnumBlockSoundEffectType.PLACE);
                    itemstack.consumeItem(entityplayer);
                    return true;
                }
            }
        }
        return false;
    }
}
