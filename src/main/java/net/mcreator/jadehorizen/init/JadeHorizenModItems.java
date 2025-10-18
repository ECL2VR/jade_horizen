/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jadehorizen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.jadehorizen.item.ThejadeseaItem;
import net.mcreator.jadehorizen.item.SteelItem;
import net.mcreator.jadehorizen.item.QuantumingotItem;
import net.mcreator.jadehorizen.item.QuantuminfusionItem;
import net.mcreator.jadehorizen.item.QuantumcrystalItem;
import net.mcreator.jadehorizen.item.JadetrimItem;
import net.mcreator.jadehorizen.item.JadetecharmorItem;
import net.mcreator.jadehorizen.item.JadestoneItem;
import net.mcreator.jadehorizen.item.JadeinfusionItem;
import net.mcreator.jadehorizen.item.GoldscrapItem;
import net.mcreator.jadehorizen.item.GlondItem;
import net.mcreator.jadehorizen.item.FriendcraftblueprintItem;
import net.mcreator.jadehorizen.item.CoreItem;
import net.mcreator.jadehorizen.item.CircuitboardItem;
import net.mcreator.jadehorizen.item.CircuitItem;
import net.mcreator.jadehorizen.item.BlueprintpaperItem;
import net.mcreator.jadehorizen.JadeHorizenMod;

public class JadeHorizenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JadeHorizenMod.MODID);
	public static final RegistryObject<Item> JADESTONE = REGISTRY.register("jadestone", () -> new JadestoneItem());
	public static final RegistryObject<Item> CORE = REGISTRY.register("core", () -> new CoreItem());
	public static final RegistryObject<Item> SOLIDJADE = block(JadeHorizenModBlocks.SOLIDJADE);
	public static final RegistryObject<Item> JADEROCK = block(JadeHorizenModBlocks.JADEROCK);
	public static final RegistryObject<Item> JADEGLASS = block(JadeHorizenModBlocks.JADEGLASS);
	public static final RegistryObject<Item> PUREJADE = block(JadeHorizenModBlocks.PUREJADE);
	public static final RegistryObject<Item> INFUSEDOBSIDIAN = block(JadeHorizenModBlocks.INFUSEDOBSIDIAN);
	public static final RegistryObject<Item> GOLDVEIN = block(JadeHorizenModBlocks.GOLDVEIN, new Item.Properties().rarity(Rarity.UNCOMMON));
	public static final RegistryObject<Item> ANCIENTGOLD = block(JadeHorizenModBlocks.ANCIENTGOLD);
	public static final RegistryObject<Item> GOLDSCRAP = REGISTRY.register("goldscrap", () -> new GoldscrapItem());
	public static final RegistryObject<Item> JADEINFUSION = REGISTRY.register("jadeinfusion", () -> new JadeinfusionItem());
	public static final RegistryObject<Item> GLOND = REGISTRY.register("glond", () -> new GlondItem());
	public static final RegistryObject<Item> CIRCUITBOARD = REGISTRY.register("circuitboard", () -> new CircuitboardItem());
	public static final RegistryObject<Item> CIRCUIT = REGISTRY.register("circuit", () -> new CircuitItem());
	public static final RegistryObject<Item> JADEPLATTING = block(JadeHorizenModBlocks.JADEPLATTING);
	public static final RegistryObject<Item> JADETRIM = REGISTRY.register("jadetrim", () -> new JadetrimItem());
	public static final RegistryObject<Item> JADETECHARMOR_HELMET = REGISTRY.register("jadetecharmor_helmet", () -> new JadetecharmorItem.Helmet());
	public static final RegistryObject<Item> JADETECHARMOR_CHESTPLATE = REGISTRY.register("jadetecharmor_chestplate", () -> new JadetecharmorItem.Chestplate());
	public static final RegistryObject<Item> JADETECHARMOR_LEGGINGS = REGISTRY.register("jadetecharmor_leggings", () -> new JadetecharmorItem.Leggings());
	public static final RegistryObject<Item> JADETECHARMOR_BOOTS = REGISTRY.register("jadetecharmor_boots", () -> new JadetecharmorItem.Boots());
	public static final RegistryObject<Item> JADECRAWLER_SPAWN_EGG = REGISTRY.register("jadecrawler_spawn_egg", () -> new ForgeSpawnEggItem(JadeHorizenModEntities.JADECRAWLER, -13382656, -3355648, new Item.Properties()));
	public static final RegistryObject<Item> CYBERGZOMBIE_SPAWN_EGG = REGISTRY.register("cybergzombie_spawn_egg", () -> new ForgeSpawnEggItem(JadeHorizenModEntities.CYBERGZOMBIE, -16751104, -3355648, new Item.Properties()));
	public static final RegistryObject<Item> JADECORE_SPAWN_EGG = REGISTRY.register("jadecore_spawn_egg", () -> new ForgeSpawnEggItem(JadeHorizenModEntities.JADECORE, -3355648, -16738048, new Item.Properties()));
	public static final RegistryObject<Item> JADETECHRAFT_SPAWN_EGG = REGISTRY.register("jadetechraft_spawn_egg", () -> new ForgeSpawnEggItem(JadeHorizenModEntities.JADETECHRAFT, -6711040, -3407872, new Item.Properties()));
	public static final RegistryObject<Item> THEJADESEA = REGISTRY.register("thejadesea", () -> new ThejadeseaItem());
	public static final RegistryObject<Item> JADEITE = block(JadeHorizenModBlocks.JADEITE);
	public static final RegistryObject<Item> STEEL = REGISTRY.register("steel", () -> new SteelItem());
	public static final RegistryObject<Item> QUANTUMCRYSTAL = REGISTRY.register("quantumcrystal", () -> new QuantumcrystalItem());
	public static final RegistryObject<Item> QUANTUMORE = block(JadeHorizenModBlocks.QUANTUMORE);
	public static final RegistryObject<Item> QUANTUMINGOT = REGISTRY.register("quantumingot", () -> new QuantumingotItem());
	public static final RegistryObject<Item> QUANTUMINFUSION = REGISTRY.register("quantuminfusion", () -> new QuantuminfusionItem());
	public static final RegistryObject<Item> JADECYCLE_SPAWN_EGG = REGISTRY.register("jadecycle_spawn_egg", () -> new ForgeSpawnEggItem(JadeHorizenModEntities.JADECYCLE, -6710887, -16711732, new Item.Properties()));
	public static final RegistryObject<Item> ALIENCRAFT_SPAWN_EGG = REGISTRY.register("aliencraft_spawn_egg", () -> new ForgeSpawnEggItem(JadeHorizenModEntities.ALIENCRAFT, -10066330, -16724788, new Item.Properties()));
	public static final RegistryObject<Item> FRIENDCRAFT_SPAWN_EGG = REGISTRY.register("friendcraft_spawn_egg", () -> new ForgeSpawnEggItem(JadeHorizenModEntities.FRIENDCRAFT, -10066330, -16737895, new Item.Properties()));
	public static final RegistryObject<Item> BLUEPRINTPAPER = REGISTRY.register("blueprintpaper", () -> new BlueprintpaperItem());
	public static final RegistryObject<Item> FRIENDCRAFTBLUEPRINT = REGISTRY.register("friendcraftblueprint", () -> new FriendcraftblueprintItem());
	public static final RegistryObject<Item> QUANTUMCRAWLER_SPAWN_EGG = REGISTRY.register("quantumcrawler_spawn_egg", () -> new ForgeSpawnEggItem(JadeHorizenModEntities.QUANTUMCRAWLER, -6710887, -16724788, new Item.Properties()));
	public static final RegistryObject<Item> INFUSEDIRONBLOCKTURN = block(JadeHorizenModBlocks.INFUSEDIRONBLOCKTURN);
	public static final RegistryObject<Item> INFUSEDIRONBLOCKALLSIDE = block(JadeHorizenModBlocks.INFUSEDIRONBLOCKALLSIDE);
	public static final RegistryObject<Item> INFUSEDIRONBLOCK = block(JadeHorizenModBlocks.INFUSEDIRONBLOCK);
	public static final RegistryObject<Item> INFUSEDIRONBLOCKCROSSPATH = block(JadeHorizenModBlocks.INFUSEDIRONBLOCKCROSSPATH);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}