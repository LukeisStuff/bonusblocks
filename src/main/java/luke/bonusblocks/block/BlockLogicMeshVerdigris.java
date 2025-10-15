package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicMesh;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.world.World;

public class BlockLogicMeshVerdigris extends BlockLogicMesh {
    public BlockLogicMeshVerdigris(Block<?> block) {
        super(block);
    }

    public boolean collidesWithEntity(Entity entity, World world, int x, int y, int z) {
        return !(entity instanceof Mob);
    }
}