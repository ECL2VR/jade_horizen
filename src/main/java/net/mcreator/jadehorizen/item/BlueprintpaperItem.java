package net.mcreator.jadehorizen.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BlueprintpaperItem extends Item {
	public BlueprintpaperItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}