/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jadehorizen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.jadehorizen.block.ThejadeseaPortalBlock;
import net.mcreator.jadehorizen.block.SolidjadeBlock;
import net.mcreator.jadehorizen.block.QuantumoreBlock;
import net.mcreator.jadehorizen.block.PurejadeBlock;
import net.mcreator.jadehorizen.block.JaderockBlock;
import net.mcreator.jadehorizen.block.JadeplattingBlock;
import net.mcreator.jadehorizen.block.JadeiteBlock;
import net.mcreator.jadehorizen.block.JadeglassBlock;
import net.mcreator.jadehorizen.block.InfusedobsidianBlock;
import net.mcreator.jadehorizen.block.InfusedironblockturnBlock;
import net.mcreator.jadehorizen.block.InfusedironblockcrosspathBlock;
import net.mcreator.jadehorizen.block.InfusedironblockallsideBlock;
import net.mcreator.jadehorizen.block.InfusedironblockBlock;
import net.mcreator.jadehorizen.block.GoldveinBlock;
import net.mcreator.jadehorizen.block.AncientgoldBlock;
import net.mcreator.jadehorizen.JadeHorizenMod;

public class JadeHorizenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JadeHorizenMod.MODID);
	public static final RegistryObject<Block> SOLIDJADE = REGISTRY.register("solidjade", () -> new SolidjadeBlock());
	public static final RegistryObject<Block> JADEROCK = REGISTRY.register("jaderock", () -> new JaderockBlock());
	public static final RegistryObject<Block> JADEGLASS = REGISTRY.register("jadeglass", () -> new JadeglassBlock());
	public static final RegistryObject<Block> PUREJADE = REGISTRY.register("purejade", () -> new PurejadeBlock());
	public static final RegistryObject<Block> INFUSEDOBSIDIAN = REGISTRY.register("infusedobsidian", () -> new InfusedobsidianBlock());
	public static final RegistryObject<Block> GOLDVEIN = REGISTRY.register("goldvein", () -> new GoldveinBlock());
	public static final RegistryObject<Block> ANCIENTGOLD = REGISTRY.register("ancientgold", () -> new AncientgoldBlock());
	public static final RegistryObject<Block> JADEPLATTING = REGISTRY.register("jadeplatting", () -> new JadeplattingBlock());
	public static final RegistryObject<Block> THEJADESEA_PORTAL = REGISTRY.register("thejadesea_portal", () -> new ThejadeseaPortalBlock());
	public static final RegistryObject<Block> JADEITE = REGISTRY.register("jadeite", () -> new JadeiteBlock());
	public static final RegistryObject<Block> QUANTUMORE = REGISTRY.register("quantumore", () -> new QuantumoreBlock());
	public static final RegistryObject<Block> INFUSEDIRONBLOCKTURN = REGISTRY.register("infusedironblockturn", () -> new InfusedironblockturnBlock());
	public static final RegistryObject<Block> INFUSEDIRONBLOCKALLSIDE = REGISTRY.register("infusedironblockallside", () -> new InfusedironblockallsideBlock());
	public static final RegistryObject<Block> INFUSEDIRONBLOCK = REGISTRY.register("infusedironblock", () -> new InfusedironblockBlock());
	public static final RegistryObject<Block> INFUSEDIRONBLOCKCROSSPATH = REGISTRY.register("infusedironblockcrosspath", () -> new InfusedironblockcrosspathBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}