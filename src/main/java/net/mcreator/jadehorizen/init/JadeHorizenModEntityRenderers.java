/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jadehorizen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.jadehorizen.client.renderer.QuantumcrawlerRenderer;
import net.mcreator.jadehorizen.client.renderer.JadetechraftRenderer;
import net.mcreator.jadehorizen.client.renderer.JadecycleRenderer;
import net.mcreator.jadehorizen.client.renderer.JadecrawlerRenderer;
import net.mcreator.jadehorizen.client.renderer.JadecoreRenderer;
import net.mcreator.jadehorizen.client.renderer.FriendcraftRenderer;
import net.mcreator.jadehorizen.client.renderer.CybergzombieRenderer;
import net.mcreator.jadehorizen.client.renderer.AliencraftRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JadeHorizenModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(JadeHorizenModEntities.JADECRAWLER.get(), JadecrawlerRenderer::new);
		event.registerEntityRenderer(JadeHorizenModEntities.CYBERGZOMBIE.get(), CybergzombieRenderer::new);
		event.registerEntityRenderer(JadeHorizenModEntities.JADECORE.get(), JadecoreRenderer::new);
		event.registerEntityRenderer(JadeHorizenModEntities.JADETECHRAFT.get(), JadetechraftRenderer::new);
		event.registerEntityRenderer(JadeHorizenModEntities.JADECYCLE.get(), JadecycleRenderer::new);
		event.registerEntityRenderer(JadeHorizenModEntities.ALIENCRAFT.get(), AliencraftRenderer::new);
		event.registerEntityRenderer(JadeHorizenModEntities.FRIENDCRAFT.get(), FriendcraftRenderer::new);
		event.registerEntityRenderer(JadeHorizenModEntities.QUANTUMCRAWLER.get(), QuantumcrawlerRenderer::new);
	}
}