package luke.bonusblocks.block;

import net.minecraft.core.block.AxisAlignedBlock;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.WorldSource;
import org.useless.dragonfly.model.blockstates.processed.MetaStateInterpreter;

import java.util.HashMap;

public class PipeMetaStateInterpreter extends MetaStateInterpreter {

    @Override
    public HashMap<String, String> getStateMap(WorldSource worldSource, int x, int y, int z, Block block, int meta) {
        HashMap<String, String> result = new HashMap<>();
        result.put("axis", String.valueOf(AxisAlignedBlock.metaToAxis(meta)).toLowerCase());
        return result;
    }
}
