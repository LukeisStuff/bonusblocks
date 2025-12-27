package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.block.material.Material;

import java.util.HashMap;
import java.util.Map;

public class BlockLogicVerdigris extends BlockLogic {
    protected static final Map<Block<?>, Block<?>> verdigrisToNewBlockMap = new HashMap<>();

    public BlockLogicVerdigris(Block<?> block, Block<?> parentBlock) {
        super(block, Material.metal);
        block.setTicking(true);
        initVerdigrisMap(block, parentBlock);
    }

    public static void initVerdigrisMap(Block<?> verdigrisBlock, Block<?> newBlock) {
        verdigrisToNewBlockMap.put(verdigrisBlock, newBlock);
    }

    public static Block<?> getBurntBlock(Block<?> verdigrisBlock) {
        return verdigrisToNewBlockMap.get(verdigrisBlock);
    }
}
