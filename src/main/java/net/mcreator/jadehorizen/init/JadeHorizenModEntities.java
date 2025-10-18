/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jadehorizen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.jadehorizen.entity.QuantumcrawlerEntity;
import net.mcreator.jadehorizen.entity.JadetechraftEntity;
import net.mcreator.jadehorizen.entity.JadecycleEntity;
import net.mcreator.jadehorizen.entity.JadecrawlerEntity;
import net.mcreator.jadehorizen.entity.JadecoreEntity;
import net.mcreator.jadehorizen.entity.FriendcraftEntity;
import net.mcreator.jadehorizen.entity.CybergzombieEntity;
import net.mcreator.jadehorizen.entity.AliencraftEntity;
import net.mcreator.jadehorizen.JadeHorizenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JadeHorizenModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, JadeHorizenMod.MODID);
	public static final RegistryObject<EntityType<JadecrawlerEntity>> JADECRAWLER = register("jadecrawler", EntityType.Builder.<JadecrawlerEntity>of(JadecrawlerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JadecrawlerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CybergzombieEntity>> CYBERGZOMBIE = register("cybergzombie", EntityType.Builder.<CybergzombieEntity>of(CybergzombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(CybergzombieEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JadecoreEntity>> JADECORE = register("jadecore",
			EntityType.Builder.<JadecoreEntity>of(JadecoreEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(JadecoreEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JadetechraftEntity>> JADETECHRAFT = register("jadetechraft", EntityType.Builder.<JadetechraftEntity>of(JadetechraftEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(JadetechraftEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JadecycleEntity>> JADECYCLE = register("jadecycle",
			EntityType.Builder.<JadecycleEntity>of(JadecycleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(JadecycleEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AliencraftEntity>> ALIENCRAFT = register("aliencraft", EntityType.Builder.<AliencraftEntity>of(AliencraftEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(100)
			.setUpdateInterval(3).setCustomClientFactory(AliencraftEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FriendcraftEntity>> FRIENDCRAFT = register("friendcraft", EntityType.Builder.<FriendcraftEntity>of(FriendcraftEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FriendcraftEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<QuantumcrawlerEntity>> QUANTUMCRAWLER = register("quantumcrawler", EntityType.Builder.<QuantumcrawlerEntity>of(QuantumcrawlerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(46).setUpdateInterval(3).setCustomClientFactory(QuantumcrawlerEntity::new).fireImmune().sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			JadecrawlerEntity.init();
			CybergzombieEntity.init();
			JadecoreEntity.init();
			JadetechraftEntity.init();
			JadecycleEntity.init();
			AliencraftEntity.init();
			FriendcraftEntity.init();
			QuantumcrawlerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(JADECRAWLER.get(), JadecrawlerEntity.createAttributes().build());
		event.put(CYBERGZOMBIE.get(), CybergzombieEntity.createAttributes().build());
		event.put(JADECORE.get(), JadecoreEntity.createAttributes().build());
		event.put(JADETECHRAFT.get(), JadetechraftEntity.createAttributes().build());
		event.put(JADECYCLE.get(), JadecycleEntity.createAttributes().build());
		event.put(ALIENCRAFT.get(), AliencraftEntity.createAttributes().build());
		event.put(FRIENDCRAFT.get(), FriendcraftEntity.createAttributes().build());
		event.put(QUANTUMCRAWLER.get(), QuantumcrawlerEntity.createAttributes().build());
	}
}