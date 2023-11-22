package luke.bonusblocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.util.helper.MathHelper;
import net.minecraft.core.world.World;
import net.minecraft.core.world.generate.feature.WorldFeature;
import net.minecraft.core.world.generate.feature.tree.WorldFeatureTree;

import java.util.Random;

public class WorldFeatureTreeMassive extends WorldFeature {
    protected int leavesID;
    protected int logID;
    static final byte[] dimensionLookup = new byte[]{2, 0, 0, 1, 2, 1};
    Random treeRand;
    World worldObj;
    int[] basePos;
    int height;
    int trunkHeight;
    double trunkHeightScale;
    double field_875_h;
    double field_874_i;
    double field_873_j;
    double field_872_k;
    int trunkThickness;
    int trunkHeightVariance;
    int leavesHeight;
    int[][] branchPoints;
    int heightMod;

    public WorldFeatureTreeMassive(int leavesID, int logID) {
        this(leavesID, logID, 0);
    }

    public WorldFeatureTreeMassive(int leavesID, int logID, int heightMod) {
        this.basePos = new int[]{0, 0, 0};
        this.treeRand = new Random();
        this.height = 0;
        this.trunkHeightScale = 2;
        this.field_875_h = 1.0;
        this.field_874_i = 0.4;
        this.field_873_j = 1.0;
        this.field_872_k = 1.0;
        this.trunkThickness = 1;
        this.trunkHeightVariance = 12;
        this.leavesHeight = 5;
        this.leavesID = leavesID;
        this.logID = logID;
        this.heightMod = heightMod;
    }

    void generateBranchPoints() {
        this.trunkHeight = (int)((double)this.height * this.trunkHeightScale);
        if (this.trunkHeight >= this.height) {
            this.trunkHeight = this.height - 1;
        }

        int numBranchPoints = (int)(2.8 + Math.pow(this.field_872_k * (double)this.height / 13.0, 2.0));

        int[][] branchPoints = new int[numBranchPoints * this.height][8];
        int highestBranchY = this.basePos[1] + this.height - this.leavesHeight;
        int branchIndex = 1;
        int trunkTop = this.basePos[1] + this.trunkHeight;
        int dy = highestBranchY - this.basePos[1];
        branchPoints[0][0] = this.basePos[0];
        branchPoints[0][1] = highestBranchY;
        branchPoints[0][2] = this.basePos[2];
        branchPoints[0][3] = trunkTop;
        --highestBranchY;

        while(true) {
            while(dy >= 0) {
                float f = this.func_528_a(dy);
                if (f < 0.0F) {
                    --highestBranchY;
                    --dy;
                } else {
                    double d = 0.5;

                    for(int j1 = 0; j1 < numBranchPoints; ++j1) {
                        double branchRadius = this.field_873_j * (double)f * ((double)this.treeRand.nextFloat() + 0.328);
                        double branchAngle = (double)this.treeRand.nextFloat() * 2.0 * Math.PI;
                        int branchX = MathHelper.floor_double(branchRadius * Math.sin(branchAngle) + (double)this.basePos[0] + d);
                        int branchZ = MathHelper.floor_double(branchRadius * Math.cos(branchAngle) + (double)this.basePos[2] + d);
                        int[] branchEnd = new int[]{branchX, highestBranchY, branchZ};
                        int[] branchTopOfTree = new int[]{branchX, highestBranchY + this.leavesHeight, branchZ};
                        if (this.drawLineAndStopIfInterrupted(branchEnd, branchTopOfTree) == -1) {
                            int[] branchStart = new int[]{this.basePos[0], this.basePos[1], this.basePos[2]};
                            double branchLength = Math.sqrt(Math.pow((double)Math.abs(this.basePos[0] - branchEnd[0]), 2.0) + Math.pow((double)Math.abs(this.basePos[2] - branchEnd[2]), 2.0));
                            double d4 = branchLength * this.field_874_i;
                            if ((double)branchEnd[1] - d4 > (double)trunkTop) {
                                branchStart[1] = trunkTop;
                            } else {
                                branchStart[1] = (int)((double)branchEnd[1] - d4);
                            }

                            if (this.drawLineAndStopIfInterrupted(branchStart, branchEnd) == -1) {
                                branchPoints[branchIndex][0] = branchX;
                                branchPoints[branchIndex][1] = highestBranchY;
                                branchPoints[branchIndex][2] = branchZ;
                                branchPoints[branchIndex][3] = branchStart[1];
                                ++branchIndex;
                            }
                        }
                    }

                    --highestBranchY;
                    --dy;
                }
            }

            this.branchPoints = new int[branchIndex][8];
            System.arraycopy(branchPoints, 0, this.branchPoints, 0, branchIndex);
            return;
        }
    }

    void placeLeafCircle(int x, int y, int z, float radius, int blockId) {
        int radiusBlocks = (int)((double)radius + 0.7);
        int[] centrePos = new int[]{x, y, z};
        int[] lookupPos = new int[]{0, centrePos[1], 0};

        for(int dx = -radiusBlocks; dx <= radiusBlocks; ++dx) {
            lookupPos[0] = centrePos[0] + dx;

            for(int dz = -radiusBlocks; dz <= radiusBlocks; ++dz) {
                lookupPos[2] = centrePos[2] + dz;
                double distance = Math.sqrt(Math.pow((double)Math.abs(dx) + 0.5, 2.0) + Math.pow((double)Math.abs(dz) + 0.5, 2.0));
                if (distance <= (double)radius) {
                    int idAtBlock = this.worldObj.getBlockId(lookupPos[0], lookupPos[1], lookupPos[2]);
                    if (idAtBlock == 0 || idAtBlock == this.leavesID) {
                        this.worldObj.setBlockWithNotify(lookupPos[0], lookupPos[1], lookupPos[2], blockId);
                    }
                }
            }
        }

    }

    float func_528_a(int i) {
        if ((double)i < (double)((float)this.height) * 0.3) {
            return -1.618F;
        } else {
            float f = (float)this.height / 2.0F;
            float f1 = (float)this.height / 2.0F - (float)i;
            float f2;
            if (f1 == 0.0F) {
                f2 = f;
            } else if (Math.abs(f1) >= f) {
                f2 = 0.0F;
            } else {
                f2 = (float)Math.sqrt(Math.pow((double)Math.abs(f), 2.0) - Math.pow((double)Math.abs(f1), 2.0));
            }

            f2 *= 0.5F;
            return f2;
        }
    }

    float getLeavesRadius(int y) {
        if (y >= 0 && y < this.leavesHeight) {
            return y != 0 && y != this.leavesHeight - 1 ? 3.0F : 2.0F;
        } else {
            return -1.0F;
        }
    }

    void placeLeafSphere(int x, int y, int z) {
        for(int leavesY = y; leavesY < y + this.leavesHeight; ++leavesY) {
            float leavesRadius = this.getLeavesRadius(leavesY - y);
            this.placeLeafCircle(x, leavesY, z, leavesRadius, this.leavesID);
        }

    }

    void placeLeavesAtPoints() {
        int[][] var1 = this.branchPoints;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int[] branchPoint = var1[var3];
            int x = branchPoint[0];
            int y = branchPoint[1];
            int z = branchPoint[2];
            this.placeLeafSphere(x, y, z);
        }

    }

    void placeBranch(int[] startPos, int[] endPos, int blockId) {
        int[] dimensions = new int[]{0, 0, 0};
        int dim0 = 0;

        for(int i = 0; i < 3; ++i) {
            dimensions[i] = endPos[i] - startPos[i];
            if (Math.abs(dimensions[i]) > Math.abs(dimensions[dim0])) {
                dim0 = i;
            }
        }

        if (dimensions[dim0] != 0) {
            byte dim1 = dimensionLookup[dim0];
            byte dim2 = dimensionLookup[dim0 + 3];
            byte delta;
            if (dimensions[dim0] > 0) {
                delta = 1;
            } else {
                delta = -1;
            }

            double dim1DeltaScale = (double)dimensions[dim1] / (double)dimensions[dim0];
            double dim2DeltaScale = (double)dimensions[dim2] / (double)dimensions[dim0];

            for(int i = 0; i != dimensions[dim0] + delta; i += delta) {
                int[] pos = new int[]{0, 0, 0};
                pos[dim0] = MathHelper.floor_double((double)startPos[dim0] + (double)i + 0.5);
                pos[dim1] = MathHelper.floor_double((double)startPos[dim1] + (double)i * dim1DeltaScale + 0.5);
                pos[dim2] = MathHelper.floor_double((double)startPos[dim2] + (double)i * dim2DeltaScale + 0.5);
                this.worldObj.setBlockWithNotify(pos[0], pos[1], pos[2], blockId);
            }

        }
    }

    boolean isHighEnoughToBranch(int i) {
        return (double)i >= (double)this.height * 0.2;
    }

    void generateTrunk() {
        int x = this.basePos[0];
        int minY = this.basePos[1];
        int maxY = this.basePos[1] + this.trunkHeight;
        int z = this.basePos[2];
        int[] startPos = new int[]{x, minY, z};
        int[] endPos = new int[]{x, maxY, z};
        this.placeBranch(startPos, endPos, this.logID);
        if (this.trunkThickness == 2) {
            int var10002 = startPos[0]++;
            var10002 = endPos[0]++;
            this.placeBranch(startPos, endPos, this.logID);
            var10002 = startPos[2]++;
            var10002 = endPos[2]++;
            this.placeBranch(startPos, endPos, this.logID);
            var10002 = startPos[0]--;
            var10002 = endPos[0]--;
            this.placeBranch(startPos, endPos, this.logID);
        }

    }

    void generateBranches() {
        int[] startPos = new int[]{this.basePos[0], this.basePos[1], this.basePos[2]};
        int[][] var2 = this.branchPoints;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int[] branchPoint = var2[var4];
            int[] endPos = new int[]{branchPoint[0], branchPoint[1], branchPoint[2]};
            startPos[1] = branchPoint[3];
            int dy = startPos[1] - this.basePos[1];
            if (this.isHighEnoughToBranch(dy)) {
                this.placeBranch(startPos, endPos, this.logID);
            }
        }

    }

    int drawLineAndStopIfInterrupted(int[] startPos, int[] endPos) {
        int[] dimensions = new int[]{0, 0, 0};
        int dim0 = 0;

        byte dim1;
        for(dim1 = 0; dim1 < 3; ++dim1) {
            dimensions[dim1] = endPos[dim1] - startPos[dim1];
            if (Math.abs(dimensions[dim1]) > Math.abs(dimensions[dim0])) {
                dim0 = dim1;
            }
        }

        if (dimensions[dim0] == 0) {
            return -1;
        } else {
            dim1 = dimensionLookup[dim0];
            byte dim2 = dimensionLookup[dim0 + 3];
            byte delta;
            if (dimensions[dim0] > 0) {
                delta = 1;
            } else {
                delta = -1;
            }

            double dim1DeltaScale = (double)dimensions[dim1] / (double)dimensions[dim0];
            double dim2DeltaScale = (double)dimensions[dim2] / (double)dimensions[dim0];
            int linePos = 0;

            int lineLength;
            for(lineLength = dimensions[dim0] + delta; linePos != lineLength; linePos += delta) {
                int[] pos = new int[]{0, 0, 0};
                pos[dim0] = startPos[dim0] + linePos;
                pos[dim1] = MathHelper.floor_double((double)startPos[dim1] + (double)linePos * dim1DeltaScale);
                pos[dim2] = MathHelper.floor_double((double)startPos[dim2] + (double)linePos * dim2DeltaScale);
                int idAtPos = this.worldObj.getBlockId(pos[0], pos[1], pos[2]);
                if (idAtPos != 0 && idAtPos != this.leavesID) {
                    break;
                }
            }

            return linePos == lineLength ? -1 : Math.abs(linePos);
        }
    }

    boolean canGenerateTree() {
        int[] bottomPos = new int[]{this.basePos[0], this.basePos[1], this.basePos[2]};
        int[] topPos = new int[]{this.basePos[0], this.basePos[1] + this.height - 1, this.basePos[2]};
        int blockIdUnderneath = this.worldObj.getBlockId(this.basePos[0], this.basePos[1] - 1, this.basePos[2]);
        if (!Block.hasTag(blockIdUnderneath, BlockTags.GROWS_TREES)) {
            return false;
        } else {
            WorldFeatureTree.onTreeGrown(this.worldObj, this.basePos[0], this.basePos[1], this.basePos[2]);
            int interruptedTrunkHeight = this.drawLineAndStopIfInterrupted(bottomPos, topPos);
            if (interruptedTrunkHeight == -1) {
                return true;
            } else if (interruptedTrunkHeight < 6) {
                return false;
            } else {
                this.height = interruptedTrunkHeight;
                return true;
            }
        }
    }

    public void func_517_a(double d, double d1, double d2) {
        this.trunkHeightVariance = (int)(d * (12.0 + (double)this.heightMod));
        if (d > 0.5) {
            this.leavesHeight = 5;
        }

        this.field_873_j = d1;
        this.field_872_k = d2;
    }

    public boolean generate(World world, Random random, int x, int y, int z) {
        this.worldObj = world;
        long seed = random.nextLong();
        this.treeRand.setSeed(seed);
        this.basePos[0] = x;
        this.basePos[1] = y;
        this.basePos[2] = z;
        if (this.height == 0) {
            this.height = 5 + this.treeRand.nextInt(this.trunkHeightVariance);
        }

        if (this.canGenerateTree()) {
            this.generateBranchPoints();
            this.placeLeavesAtPoints();
            this.generateTrunk();
            this.generateBranches();
            return true;
        } else {
            return false;
        }
    }
}
