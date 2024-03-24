//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;
import turniplabs.halplibe.helper.TextureHelper;

import static luke.bonusblocks.BonusBlocksMod.MOD_ID;

public class BlockPumice extends Block {
    boolean isMagma;

    public BlockPumice(String key, int id, boolean isWet) {
        super(key, id, Material.stone);
        this.isMagma = isWet;
        withOverbright();
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, int blockId) {
        if (this.isMagma) {
            this.onBlockAdded(world, x, y, z);
        }
    }

    public int getBlockOverbrightTexture(WorldSource blockAccess, int x, int y, int z, int side) {
        if (this.isMagma) {
            return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID,"pumiceoverlay.png");
        }
        return -1;
    }

    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        if (this.isMagma) {
            if (entity instanceof EntityLiving) {
                entity.hurt(null, 2, DamageType.FIRE);
            }
        }
    }

    public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
        if (this.isMagma) {
            if (entity instanceof EntityLiving) {
                entity.hurt(null, 2, DamageType.FIRE);
            }
        }
    }

    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x, y, z);
        byte byte0 = 2;
        int l;
        if (world.getBlockMaterial(x, y, z - 1) == Material.water || world.getBlockMaterial(x, y, z + 1) == Material.water || world.getBlockMaterial(x - 1, y, z) == Material.water || world.getBlockMaterial(x + 1, y, z) == Material.water || world.getBlockMaterial(x, y + 1, z) == Material.water && this.isMagma) {
            world.setBlockWithNotify(x, y, z, BonusBlocks.pumiceDry.id);
            world.playSoundEffect((Entity)null, SoundCategory.WORLD_SOUNDS, (double)x + 0.5, (double)y + 0.5, (double)z + 0.5, "random.fizz", 0.5F, 2.6F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);

            for(l = 0; l < 8; ++l) {
                world.spawnParticle("largesmoke", (double)x + Math.random(), (double)y + Math.random(), (double)z + Math.random(), 0.0, 0.0, 0.0);
            }
        }

        if (!this.isMagma && this.inLava(world, x, y, z)) {
            for(l = x - byte0; l <= x + byte0; ++l) {
                for(int i1 = y - byte0; i1 <= y + byte0; ++i1) {
                    for(int j1 = z - byte0; j1 <= z + byte0; ++j1) {
                        if (Block.hasTag(world.getBlockId(l, i1, j1), BlockTags.IS_LAVA)) {
                            world.setBlockWithNotify(l, i1, j1, 0);
                        }
                    }
                }
            }
        }

    }

    public boolean inLava(World world, int x, int y, int z) {
        if (Block.hasTag(world.getBlockId(x + 1, y, z), BlockTags.IS_LAVA)) {
            return true;
        } else if (Block.hasTag(world.getBlockId(x - 1, y, z), BlockTags.IS_LAVA)) {
            return true;
        } else if (Block.hasTag(world.getBlockId(x, y + 1, z), BlockTags.IS_LAVA)) {
            return true;
        } else if (Block.hasTag(world.getBlockId(x, y - 1, z), BlockTags.IS_LAVA)) {
            return true;
        } else if (Block.hasTag(world.getBlockId(x, y, z + 1), BlockTags.IS_LAVA)) {
            return true;
        } else {
            return Block.hasTag(world.getBlockId(x, y, z - 1), BlockTags.IS_LAVA);
        }
    }

    public void onBlockRemoved(World world, int x, int y, int z, int data) {
        if (!this.isMagma) {
            byte byte0 = 2;

            for(int l = x - byte0; l <= x + byte0; ++l) {
                for(int i1 = y - byte0; i1 <= y + byte0; ++i1) {
                    for(int j1 = z - byte0; j1 <= z + byte0; ++j1) {
                        world.notifyBlocksOfNeighborChange(l, i1, j1, world.getBlockId(l, i1, j1));
                    }
                }
            }
        }

    }
}
