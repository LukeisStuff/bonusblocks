package luke.bonusblocks;


import net.minecraft.core.block.Block;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.animal.EntityFireflyCluster;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.enums.EnumFireflyColor;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemJar;
import net.minecraft.core.item.ItemPlaceable;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

import java.util.List;

public class ItemJarPlacable extends ItemPlaceable {
	public ItemJarPlacable(String name, int id, Block blockToPlace) {
		super(name, id, blockToPlace);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		List<Entity> list = world.getEntitiesWithinAABBExcludingEntity(entityplayer, entityplayer.bb.expand(2.0, 2.0, 2.0));
		for (Entity entity : list) {
			if (!(entity instanceof EntityFireflyCluster)) continue;
			EntityFireflyCluster fireflyCluster = (EntityFireflyCluster)entity;
			EnumFireflyColor colour = fireflyCluster.getColor();
			if (!world.isClientSide) {
				fireflyCluster.setFireflyCount(fireflyCluster.getFireflyCount() - 1);
				if (fireflyCluster.getFireflyCount() <= 0) {
					fireflyCluster.remove();
				}
			}
			if (colour == EnumFireflyColor.BLUE) {
				ItemJar.fillJar(entityplayer, new ItemStack(Item.lanternFireflyBlue, 1));
			} else if (colour == EnumFireflyColor.ORANGE) {
				ItemJar.fillJar(entityplayer, new ItemStack(Item.lanternFireflyOrange, 1));
			} else if (colour == EnumFireflyColor.RED) {
				ItemJar.fillJar(entityplayer, new ItemStack(Item.lanternFireflyRed, 1));
			} else {
				ItemJar.fillJar(entityplayer, new ItemStack(Item.lanternFireflyGreen, 1));
			}
			return itemstack;
		}
		return itemstack;
	}
}
