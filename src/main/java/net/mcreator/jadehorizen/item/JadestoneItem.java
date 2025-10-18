package net.mcreator.jadehorizen.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class JadestoneItem extends Item {
	public JadestoneItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}