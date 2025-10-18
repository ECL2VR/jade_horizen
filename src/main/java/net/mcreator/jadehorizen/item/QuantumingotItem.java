package net.mcreator.jadehorizen.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class QuantumingotItem extends Item {
	public QuantumingotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}