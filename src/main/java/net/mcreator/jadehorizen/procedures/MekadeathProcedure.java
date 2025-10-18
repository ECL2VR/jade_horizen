package net.mcreator.jadehorizen.procedures;

import net.minecraft.world.entity.Entity;

public class MekadeathProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !entity.isAlive();
	}
}