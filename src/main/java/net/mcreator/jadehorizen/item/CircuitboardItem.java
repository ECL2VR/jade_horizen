package net.mcreator.jadehorizen.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CircuitboardItem extends Item {
	public CircuitboardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}