package luke.bonusblocks.block;

import com.mojang.nbt.CompoundTag;
import luke.bonusblocks.BonusBlocks;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityFallingSand;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.world.World;

public class EntitySulphur extends Entity {
    public int fuse;
    public int blockID;

    public EntitySulphur(World world) {
        super(world);
        this.fuse = 0;
        this.blockID = BonusBlocks.blockSulphur.id;
        this.blocksBuilding = true;
        this.setSize(0.98F, 0.98F);
        this.heightOffset = this.bbHeight / 2.0F;
    }

    public EntitySulphur(World world, double d, double d1, double d2) {
        this(world);
        this.setPos(d, d1, d2);
        this.blockID = BonusBlocks.blockSulphur.id;
        float f = (float)(Math.random() * 3.1415927410125732 * 2.0);
        this.xd = -MathHelper.sin(f * 3.141593F / 180.0F) * 0.02F;
        this.yd = 0.20000000298023224;
        this.zd = -MathHelper.cos(f * 3.141593F / 180.0F) * 0.02F;
        this.fuse = 0;
        this.xo = d;
        this.yo = d1;
        this.zo = d2;
    }

    protected void init() {
    }

    @Override
    public String getEntityTexture() {
        return "/assets/bonusblocks/block/sulphurblock.png";
    }

    protected boolean makeStepSound() {
        return false;
    }

    public boolean isPickable() {
        return !this.removed;
    }

    public void tick() {
        this.blockID = BonusBlocks.blockSulphur.id;
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;
        this.yd -= 0.03999999910593033;
        this.move(this.xd, this.yd, this.zd);
        this.xd *= 0.9800000190734863;
        this.yd *= 0.9800000190734863;
        this.zd *= 0.9800000190734863;
        if (this.onGround) {
            this.xd *= 0.699999988079071;
            this.zd *= 0.699999988079071;
            this.yd *= -0.5;
        }

        if (this.fuse-- <= 0) {
            if (!this.world.isClientSide) {
                this.world.newExplosion(this, this.x, this.y, this.z, 1.5F, false, true);
                this.remove();
            } else {
                this.remove();
            }
        } else {
            this.world.spawnParticle("smoke", this.x, this.y + 0.5, this.z, 0.0, 0.0, 0.0);
        }

    }

    public void addAdditionalSaveData(CompoundTag tag) {
        tag.putByte("Fuse", (byte)this.fuse);
        tag.putShort("Tile", (short)this.blockID);
    }

    public void readAdditionalSaveData(CompoundTag tag) {
        this.fuse = tag.getByte("Fuse");
        this.blockID = tag.getShort("Tile") & 16383;
    }

    public float getShadowHeightOffs() {
        return 0.0F;
    }
}