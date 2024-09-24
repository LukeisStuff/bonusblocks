package luke.bonusblocks.block;

import net.minecraft.core.block.DoorBlock;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.item.Item;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class ObsidianGlassDoorBlock extends DoorBlock {
    public ObsidianGlassDoorBlock(String key, String namespaceId, int id, boolean isTop, @Nullable Supplier<Item> droppedItem) {
        super(key, namespaceId, id, Material.glass, isTop, true, droppedItem);
    }


    public int getRenderLayer() {
        return 1;
    }
}
