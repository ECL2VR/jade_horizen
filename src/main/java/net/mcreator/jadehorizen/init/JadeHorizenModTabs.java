/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jadehorizen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.jadehorizen.JadeHorizenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JadeHorizenModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JadeHorizenMod.MODID);
	public static final RegistryObject<CreativeModeTab> JADEHORIZON = REGISTRY.register("jadehorizon",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.jade_horizen.jadehorizon")).icon(() -> new ItemStack(JadeHorizenModItems.CORE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(JadeHorizenModItems.JADESTONE.get());
				tabData.accept(JadeHorizenModItems.CORE.get());
				tabData.accept(JadeHorizenModBlocks.SOLIDJADE.get().asItem());
				tabData.accept(JadeHorizenModBlocks.JADEROCK.get().asItem());
				tabData.accept(JadeHorizenModBlocks.JADEGLASS.get().asItem());
				tabData.accept(JadeHorizenModBlocks.PUREJADE.get().asItem());
				tabData.accept(JadeHorizenModBlocks.INFUSEDOBSIDIAN.get().asItem());
				tabData.accept(JadeHorizenModBlocks.GOLDVEIN.get().asItem());
				tabData.accept(JadeHorizenModBlocks.ANCIENTGOLD.get().asItem());
				tabData.accept(JadeHorizenModItems.GOLDSCRAP.get());
				tabData.accept(JadeHorizenModItems.JADEINFUSION.get());
				tabData.accept(JadeHorizenModItems.GLOND.get());
				tabData.accept(JadeHorizenModItems.CIRCUITBOARD.get());
				tabData.accept(JadeHorizenModItems.CIRCUIT.get());
				tabData.accept(JadeHorizenModBlocks.JADEPLATTING.get().asItem());
				tabData.accept(JadeHorizenModItems.JADETRIM.get());
				tabData.accept(JadeHorizenModItems.JADECRAWLER_SPAWN_EGG.get());
				tabData.accept(JadeHorizenModItems.CYBERGZOMBIE_SPAWN_EGG.get());
				tabData.accept(JadeHorizenModItems.JADECORE_SPAWN_EGG.get());
				tabData.accept(JadeHorizenModItems.JADETECHRAFT_SPAWN_EGG.get());
				tabData.accept(JadeHorizenModItems.THEJADESEA.get());
				tabData.accept(JadeHorizenModBlocks.JADEITE.get().asItem());
				tabData.accept(JadeHorizenModItems.STEEL.get());
				tabData.accept(JadeHorizenModItems.QUANTUMCRYSTAL.get());
				tabData.accept(JadeHorizenModBlocks.QUANTUMORE.get().asItem());
				tabData.accept(JadeHorizenModItems.QUANTUMINGOT.get());
				tabData.accept(JadeHorizenModItems.QUANTUMINFUSION.get());
				tabData.accept(JadeHorizenModItems.JADECYCLE_SPAWN_EGG.get());
				tabData.accept(JadeHorizenModItems.ALIENCRAFT_SPAWN_EGG.get());
				tabData.accept(JadeHorizenModItems.FRIENDCRAFT_SPAWN_EGG.get());
				tabData.accept(JadeHorizenModItems.BLUEPRINTPAPER.get());
				tabData.accept(JadeHorizenModItems.FRIENDCRAFTBLUEPRINT.get());
				tabData.accept(JadeHorizenModItems.QUANTUMCRAWLER_SPAWN_EGG.get());
				tabData.accept(JadeHorizenModBlocks.INFUSEDIRONBLOCKTURN.get().asItem());
				tabData.accept(JadeHorizenModBlocks.INFUSEDIRONBLOCKALLSIDE.get().asItem());
				tabData.accept(JadeHorizenModBlocks.INFUSEDIRONBLOCK.get().asItem());
				tabData.accept(JadeHorizenModBlocks.INFUSEDIRONBLOCKCROSSPATH.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(JadeHorizenModItems.JADETECHARMOR_HELMET.get());
			tabData.accept(JadeHorizenModItems.JADETECHARMOR_CHESTPLATE.get());
			tabData.accept(JadeHorizenModItems.JADETECHARMOR_LEGGINGS.get());
			tabData.accept(JadeHorizenModItems.JADETECHARMOR_BOOTS.get());
		}
	}
}