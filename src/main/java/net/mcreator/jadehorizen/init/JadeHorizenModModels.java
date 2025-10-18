/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jadehorizen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.jadehorizen.client.model.Modelthe_eye;
import net.mcreator.jadehorizen.client.model.Modellightcycle;
import net.mcreator.jadehorizen.client.model.Modeljadecore;
import net.mcreator.jadehorizen.client.model.Modeljade_raft;
import net.mcreator.jadehorizen.client.model.Modeljade_crawler;
import net.mcreator.jadehorizen.client.model.Modelcyberg_zombie;
import net.mcreator.jadehorizen.client.model.Modelcyber;
import net.mcreator.jadehorizen.client.model.Modelalien_craft;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class JadeHorizenModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelalien_craft.LAYER_LOCATION, Modelalien_craft::createBodyLayer);
		event.registerLayerDefinition(Modeljade_raft.LAYER_LOCATION, Modeljade_raft::createBodyLayer);
		event.registerLayerDefinition(Modelcyberg_zombie.LAYER_LOCATION, Modelcyberg_zombie::createBodyLayer);
		event.registerLayerDefinition(Modellightcycle.LAYER_LOCATION, Modellightcycle::createBodyLayer);
		event.registerLayerDefinition(Modelcyber.LAYER_LOCATION, Modelcyber::createBodyLayer);
		event.registerLayerDefinition(Modeljade_crawler.LAYER_LOCATION, Modeljade_crawler::createBodyLayer);
		event.registerLayerDefinition(Modelthe_eye.LAYER_LOCATION, Modelthe_eye::createBodyLayer);
		event.registerLayerDefinition(Modeljadecore.LAYER_LOCATION, Modeljadecore::createBodyLayer);
	}
}