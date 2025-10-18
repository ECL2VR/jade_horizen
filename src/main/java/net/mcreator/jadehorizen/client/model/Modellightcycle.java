package net.mcreator.jadehorizen.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.0.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modellightcycle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jade_horizen", "modellightcycle"), "main");
	public final ModelPart lightcycle;
	public final ModelPart base;
	public final ModelPart jadecore;
	public final ModelPart core2;
	public final ModelPart core3;
	public final ModelPart body;
	public final ModelPart parts;
	public final ModelPart parts2;
	public final ModelPart cycles;
	public final ModelPart cycle_cycle;
	public final ModelPart cycle_cycle2;
	public final ModelPart cycles2;
	public final ModelPart cycle_cycle3;
	public final ModelPart cycle_cycle4;
	public final ModelPart consol;
	public final ModelPart button;
	public final ModelPart motor;
	public final ModelPart cycles3;
	public final ModelPart cycle_cycle5;
	public final ModelPart cycle_cycle6;
	public final ModelPart fire;

	public Modellightcycle(ModelPart root) {
		this.lightcycle = root.getChild("lightcycle");
		this.base = this.lightcycle.getChild("base");
		this.jadecore = this.base.getChild("jadecore");
		this.core2 = this.jadecore.getChild("core2");
		this.core3 = this.jadecore.getChild("core3");
		this.body = this.base.getChild("body");
		this.parts = this.base.getChild("parts");
		this.parts2 = this.base.getChild("parts2");
		this.cycles = this.base.getChild("cycles");
		this.cycle_cycle = this.cycles.getChild("cycle_cycle");
		this.cycle_cycle2 = this.cycles.getChild("cycle_cycle2");
		this.cycles2 = this.base.getChild("cycles2");
		this.cycle_cycle3 = this.cycles2.getChild("cycle_cycle3");
		this.cycle_cycle4 = this.cycles2.getChild("cycle_cycle4");
		this.consol = this.base.getChild("consol");
		this.button = this.consol.getChild("button");
		this.motor = this.base.getChild("motor");
		this.cycles3 = this.motor.getChild("cycles3");
		this.cycle_cycle5 = this.cycles3.getChild("cycle_cycle5");
		this.cycle_cycle6 = this.cycles3.getChild("cycle_cycle6");
		this.fire = this.motor.getChild("fire");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition lightcycle = partdefinition.addOrReplaceChild("lightcycle", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1549F, 19.0005F, 0.0588F, -1.5616F, 1.559F, -1.5706F));
		PartDefinition base = lightcycle.addOrReplaceChild("base",
				CubeListBuilder.create().texOffs(56, 13).addBox(-10.0F, -29.0F, -8.0F, 20.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 18).addBox(-10.0F, -29.0F, 4.0F, 20.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body_r1 = base.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(0, 60).addBox(0.039F, -0.0013F, -8.0F, 4.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.6F, -24.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition body_r2 = base.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(40, 60).addBox(0.0012F, 0.0301F, -8.0F, 4.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.7F, -26.7F, 0.0F, 0.0F, 0.0F, 0.7418F));
		PartDefinition body_r3 = base.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(0, 43).addBox(0.0F, 0.0F, -8.0F, 9.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, -29.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition body_r4 = base.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(50, 43).addBox(-4.039F, -0.0013F, -8.0F, 4.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.6F, -24.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition body_r5 = base.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(50, 26).addBox(-4.0012F, 0.0301F, -8.0F, 4.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.7F, -26.7F, 0.0F, 0.0F, 0.0F, -0.7418F));
		PartDefinition body_r6 = base.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(0, 26).addBox(-9.0F, 0.0F, -8.0F, 9.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -29.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition jadecore = base.addOrReplaceChild("jadecore", CubeListBuilder.create(), PartPose.offset(-15.0F, -26.0F, 0.0F));
		PartDefinition core2 = jadecore.addOrReplaceChild("core2", CubeListBuilder.create().texOffs(248, 0).addBox(-1.614F, -1.7031F, -1.2078F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1059F, 3.8275F, -0.0535F));
		PartDefinition cube_r1 = core2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(248, 0).addBox(-28.1094F, -10.7103F, -1.2835F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.177F, 25.1302F, 0.0757F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r2 = core2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(248, 0).addBox(-10.3491F, -26.8333F, -10.05F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.177F, 25.1302F, 0.0757F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r3 = core2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(248, 0).addBox(-13.791F, -19.5714F, -19.2723F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.177F, 25.1302F, 0.0757F, -0.7854F, 0.0F, 0.0F));
		PartDefinition core3 = jadecore.addOrReplaceChild("core3", CubeListBuilder.create().texOffs(248, 0).addBox(-1.614F, -1.7031F, -1.2078F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(29.1059F, 3.8275F, -0.0535F));
		PartDefinition cube_r4 = core3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(248, 0).addBox(-28.1094F, -10.7103F, -1.2835F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.177F, 25.1302F, 0.0757F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r5 = core3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(248, 0).addBox(-10.3491F, -26.8333F, -10.05F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.177F, 25.1302F, 0.0757F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r6 = core3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(248, 0).addBox(-13.791F, -19.5714F, -19.2723F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.177F, 25.1302F, 0.0757F, -0.7854F, 0.0F, 0.0F));
		PartDefinition body = base.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 2.0F, -6.0F, 20.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.2F, -23.0F, 0.0F));
		PartDefinition body_r7 = body.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(70, 77).addBox(-2.0F, -8.0F, -6.0F, 2.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition body_r8 = body.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(42, 77).addBox(0.0F, -8.0F, -6.0F, 2.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition parts = base.addOrReplaceChild("parts",
				CubeListBuilder.create().texOffs(80, 60).addBox(-11.4339F, -25.4308F, -5.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(-9.4339F, -23.4308F, -5.0F, 11.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
						.texOffs(84, 101).addBox(-11.3339F, -25.4308F, -8.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(98, 91).addBox(-10.1339F, -29.4308F, -7.9F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 101)
						.addBox(-8.4339F, -24.4308F, -8.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(118, 64).addBox(-0.4339F, -24.4308F, -8.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(106, 112)
						.addBox(-0.4339F, -33.4308F, -7.9F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(118, 69).addBox(-1.4339F, -33.1308F, -7.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 115)
						.addBox(-3.4339F, -32.9308F, -7.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(96, 97).addBox(0.5661F, -33.4308F, -8.0F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(114, 116)
						.addBox(-3.4339F, -32.9308F, 4.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(118, 101).addBox(-1.4339F, -33.1308F, 4.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 113)
						.addBox(-0.4339F, -33.4308F, 4.9F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(78, 108).addBox(-10.1339F, -29.4308F, 6.9F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(118, 96)
						.addBox(-8.4339F, -24.4308F, 5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(84, 107).addBox(-11.3339F, -25.4308F, 5.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(90, 56)
						.addBox(-7.4339F, -23.4308F, 5.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(118, 91).addBox(-0.4339F, -24.4308F, 5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(98, 77)
						.addBox(0.5661F, -33.4308F, 5.0F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(80, 73).addBox(-7.4339F, -23.4308F, -8.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(90, 23)
						.addBox(5.8661F, -33.4308F, -6.1F, 9.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(1.2661F, -25.6308F, -5.0F, 18.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(90, 35)
						.addBox(5.8661F, -33.4308F, 5.1F, 9.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-10.5661F, 5.4308F, 0.0F));
		PartDefinition body_r9 = parts.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(83, 36).addBox(0.0F, -3.0F, -3.0F, 5.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5661F, -25.4308F, 8.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition body_r10 = parts.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(82, 36).addBox(-5.0F, -3.0F, -3.0F, 5.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.1661F, -25.4308F, 8.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition body_r11 = parts.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(86, 40).addBox(0.0F, -3.0F, -3.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6661F, -30.4308F, 8.6F, 0.0F, 0.3927F, 0.0F));
		PartDefinition body_r12 = parts.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(90, 37).addBox(0.0F, -3.0F, 1.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6661F, -30.4308F, -8.6F, 0.0F, -0.3927F, 0.0F));
		PartDefinition body_r13 = parts.addOrReplaceChild("body_r13", CubeListBuilder.create().texOffs(85, 38).addBox(-5.0F, -3.0F, -3.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.0661F, -30.4308F, 8.6F, 0.0F, -0.3927F, 0.0F));
		PartDefinition body_r14 = parts.addOrReplaceChild("body_r14", CubeListBuilder.create().texOffs(88, 38).addBox(-5.0F, -3.0F, 1.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.0661F, -30.4308F, -8.6F, 0.0F, 0.3927F, 0.0F));
		PartDefinition body_r15 = parts.addOrReplaceChild("body_r15", CubeListBuilder.create().texOffs(87, 37).addBox(-5.0F, -3.0F, 0.0F, 5.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.1661F, -25.4308F, -8.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition body_r16 = parts.addOrReplaceChild("body_r16", CubeListBuilder.create().texOffs(91, 34).addBox(0.0F, -3.0F, 0.0F, 5.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5661F, -25.4308F, -8.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition body_r17 = parts.addOrReplaceChild("body_r17",
				CubeListBuilder.create().texOffs(24, 113).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 113).addBox(-0.5F, -1.0F, -14.3F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5661F, -25.2308F, 6.4F, 0.0F, 0.0F, 0.6109F));
		PartDefinition body_r18 = parts.addOrReplaceChild("body_r18",
				CubeListBuilder.create().texOffs(48, 116).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 116).addBox(-0.5F, -1.5F, -14.3F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.9339F, -23.9308F, 6.4F, 0.0F, 0.0F, -0.829F));
		PartDefinition body_r19 = parts.addOrReplaceChild("body_r19",
				CubeListBuilder.create().texOffs(108, 133).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 82).addBox(-0.5F, -1.0F, -15.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.8339F, -29.9308F, 7.4F, 0.0F, 0.0F, 0.4363F));
		PartDefinition parts2 = base.addOrReplaceChild("parts2",
				CubeListBuilder.create().texOffs(0, 88).addBox(5.0059F, -17.7246F, -5.0F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 77).addBox(-5.9941F, -15.7246F, -5.0F, 11.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(106, 81)
						.addBox(4.0059F, -17.7246F, -8.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(118, 106).addBox(3.7059F, -21.7246F, -7.9F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 119)
						.addBox(3.0059F, -16.7246F, -8.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 119).addBox(-4.9941F, -16.7246F, -8.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(66, 113)
						.addBox(-4.9941F, -25.7246F, -7.9F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(106, 119).addBox(-3.9941F, -25.4246F, -7.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(118, 11)
						.addBox(-2.9941F, -25.2246F, -7.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 101).addBox(-5.9941F, -25.7246F, -8.0F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(118, 60)
						.addBox(-2.9941F, -25.2246F, 4.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(120, 0).addBox(-3.9941F, -25.4246F, 4.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(74, 113)
						.addBox(-4.9941F, -25.7246F, 4.9F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 120).addBox(3.7059F, -21.7246F, 6.9F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 22)
						.addBox(3.0059F, -16.7246F, 5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 108).addBox(4.0059F, -17.7246F, 5.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 97)
						.addBox(-3.9941F, -15.7246F, 5.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 120).addBox(-4.9941F, -16.7246F, 5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 101)
						.addBox(-5.9941F, -25.7246F, 5.0F, 1.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(76, 97).addBox(-3.9941F, -15.7246F, -8.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(14.5941F, -2.2754F, 0.0F));
		PartDefinition body_r20 = parts2.addOrReplaceChild("body_r20",
				CubeListBuilder.create().texOffs(82, 113).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 113).addBox(-0.5F, -1.0F, -14.3F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9941F, -17.5246F, 6.4F, 0.0F, 0.0F, -0.6109F));
		PartDefinition body_r21 = parts2.addOrReplaceChild("body_r21",
				CubeListBuilder.create().texOffs(98, 117).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(90, 117).addBox(-0.5F, -1.5F, -14.3F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5059F, -16.2246F, 6.4F, 0.0F, 0.0F, 0.829F));
		PartDefinition body_r22 = parts2.addOrReplaceChild("body_r22",
				CubeListBuilder.create().texOffs(128, 33).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 128).addBox(-0.5F, -2.0F, -15.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9059F, -22.6246F, 7.4F, 0.0F, 0.0F, -0.8727F));
		PartDefinition cycles = base.addOrReplaceChild("cycles", CubeListBuilder.create(), PartPose.offsetAndRotation(-14.5F, -22.2F, 1.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cycle_cycle = cycles
				.addOrReplaceChild("cycle_cycle",
						CubeListBuilder.create().texOffs(0, 253).addBox(5.1F, 4.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(88, 129).addBox(5.1F, -0.9946F, 4.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F))
								.texOffs(70, 129).addBox(5.1F, -0.9946F, -5.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 8).addBox(5.1F, -5.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r1 = cycle_cycle.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(32, 124).addBox(12.1F, -5.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(76, 129).addBox(12.1F, -0.9946F, -5.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 129)
						.addBox(12.1F, -0.9946F, 4.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(122, 120).addBox(12.1F, 4.0F, -0.9946F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r2 = cycle_cycle.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(8, 124).addBox(12.1F, -5.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(64, 129).addBox(12.1F, -0.9946F, -5.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 129)
						.addBox(12.1F, -0.9946F, 4.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(118, 15).addBox(12.1F, 4.0F, -1.0054F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r3 = cycle_cycle.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(90, 113).addBox(12.1F, -0.9946F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 127).addBox(12.1F, -0.9946F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r4 = cycle_cycle.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(10, 115).addBox(12.1F, -0.9946F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 74).addBox(12.1F, -0.9946F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cycle_cycle2 = cycles.addOrReplaceChild(
				"cycle_cycle2", CubeListBuilder.create().texOffs(124, 77).addBox(-9.1F, 4.0F, 1.0054F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(130, 125).addBox(-9.1F, -0.9946F, 6.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(6, 131).addBox(-9.1F, -0.9946F, -3.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 83).addBox(-9.1F, -5.0F, 1.0054F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition hexadecagon_r5 = cycle_cycle2.addOrReplaceChild("hexadecagon_r5",
				CubeListBuilder.create().texOffs(104, 124).addBox(-14.1F, -5.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(12, 131).addBox(-14.1F, -0.9946F, -5.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(130, 122).addBox(-14.1F, -0.9946F, 4.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 123).addBox(-14.1F, 4.0F, -0.9946F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r6 = cycle_cycle2.addOrReplaceChild("hexadecagon_r6",
				CubeListBuilder.create().texOffs(124, 80).addBox(-14.1F, -5.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(0, 131).addBox(-14.1F, -0.9946F, -5.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(128, 130).addBox(-14.1F, -0.9946F, 4.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 88).addBox(-14.1F, 4.0F, -1.0054F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r7 = cycle_cycle2.addOrReplaceChild("hexadecagon_r7",
				CubeListBuilder.create().texOffs(128, 30).addBox(-14.1F, -0.9946F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 24).addBox(-14.1F, -0.9946F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r8 = cycle_cycle2.addOrReplaceChild("hexadecagon_r8",
				CubeListBuilder.create().texOffs(128, 27).addBox(-14.1F, -0.9946F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 128).addBox(-14.1F, -0.9946F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cycles2 = base.addOrReplaceChild("cycles2", CubeListBuilder.create(), PartPose.offsetAndRotation(14.2F, -22.2F, 1.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cycle_cycle3 = cycles2.addOrReplaceChild(
				"cycle_cycle3", CubeListBuilder.create().texOffs(56, 124).addBox(-7.1F, 4.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(94, 130).addBox(-7.1F, -0.9946F, 4.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(130, 119).addBox(-7.1F, -0.9946F, -5.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 124).addBox(-7.1F, -5.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r9 = cycle_cycle3.addOrReplaceChild("hexadecagon_r9",
				CubeListBuilder.create().texOffs(124, 74).addBox(-14.1F, -5.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(122, 130).addBox(-14.1F, -0.9946F, -5.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(130, 18).addBox(-14.1F, -0.9946F, 4.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 123).addBox(-14.1F, 4.0F, -0.9946F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r10 = cycle_cycle3.addOrReplaceChild("hexadecagon_r10",
				CubeListBuilder.create().texOffs(124, 57).addBox(-14.1F, -5.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(116, 130).addBox(-14.1F, -0.9946F, -5.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(110, 130).addBox(-14.1F, -0.9946F, 4.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 51).addBox(-14.1F, 4.0F, -1.0054F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r11 = cycle_cycle3.addOrReplaceChild("hexadecagon_r11",
				CubeListBuilder.create().texOffs(128, 21).addBox(-14.1F, -0.9946F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 11).addBox(-14.1F, -0.9946F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r12 = cycle_cycle3.addOrReplaceChild("hexadecagon_r12",
				CubeListBuilder.create().texOffs(16, 128).addBox(-14.1F, -0.9946F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 2).addBox(-14.1F, -0.9946F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cycle_cycle4 = cycles2
				.addOrReplaceChild(
						"cycle_cycle4", CubeListBuilder.create().texOffs(0, 253).addBox(7.1F, 4.0F, 1.0054F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(32, 131).addBox(7.1F, -0.9946F, 6.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F))
								.texOffs(132, 5).addBox(7.1F, -0.9946F, -3.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 125).addBox(7.1F, -5.0F, 1.0054F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 0.0F, -2.0F));
		PartDefinition hexadecagon_r13 = cycle_cycle4.addOrReplaceChild("hexadecagon_r13",
				CubeListBuilder.create().texOffs(40, 125).addBox(12.1F, -5.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(132, 8).addBox(12.1F, -0.9946F, -5.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 251)
						.addBox(12.1F, -0.9946F, 4.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(122, 123).addBox(12.1F, 4.0F, -0.9946F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r14 = cycle_cycle4.addOrReplaceChild("hexadecagon_r14",
				CubeListBuilder.create().texOffs(16, 125).addBox(12.1F, -5.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(44, 131).addBox(12.1F, -0.9946F, -5.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 131)
						.addBox(12.1F, -0.9946F, 4.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(122, 18).addBox(12.1F, 4.0F, -1.0054F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r15 = cycle_cycle4.addOrReplaceChild("hexadecagon_r15",
				CubeListBuilder.create().texOffs(128, 44).addBox(12.1F, -0.9946F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 237).addBox(12.1F, -0.9946F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r16 = cycle_cycle4.addOrReplaceChild("hexadecagon_r16",
				CubeListBuilder.create().texOffs(128, 41).addBox(12.1F, -0.9946F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 38).addBox(12.1F, -0.9946F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.0F, 2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition consol = base.addOrReplaceChild("consol", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8F, -29.8138F, -4.1598F, -1.5708F, -0.6109F, 1.5708F));
		PartDefinition button = consol.addOrReplaceChild("button", CubeListBuilder.create().texOffs(106, 74).addBox(-1.0F, 1.0267F, -5.1487F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r7 = button.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(120, 39).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2F, -0.1733F, -4.4487F, -0.8727F, 0.0F, 0.0F));
		PartDefinition motor = base.addOrReplaceChild("motor", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cycles3 = motor.addOrReplaceChild("cycles3", CubeListBuilder.create(), PartPose.offset(-28.5F, -20.2F, 0.0F));
		PartDefinition cycle_cycle5 = cycles3.addOrReplaceChild(
				"cycle_cycle5", CubeListBuilder.create().texOffs(48, 125).addBox(5.1F, 4.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(50, 132).addBox(5.1F, -0.9946F, 4.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(132, 56).addBox(5.1F, -0.9946F, -5.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(126, 64).addBox(5.1F, -5.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r17 = cycle_cycle5.addOrReplaceChild("hexadecagon_r17",
				CubeListBuilder.create().texOffs(126, 67).addBox(12.1F, -5.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(62, 132).addBox(12.1F, -0.9946F, -5.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 33)
						.addBox(12.1F, -0.9946F, 4.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 124).addBox(12.1F, 4.0F, -0.9946F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r18 = cycle_cycle5.addOrReplaceChild("hexadecagon_r18",
				CubeListBuilder.create().texOffs(126, 15).addBox(12.1F, -5.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(56, 132).addBox(12.1F, -0.9946F, -5.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(132, 53)
						.addBox(12.1F, -0.9946F, 4.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 122).addBox(12.1F, 4.0F, -1.0054F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r19 = cycle_cycle5.addOrReplaceChild("hexadecagon_r19",
				CubeListBuilder.create().texOffs(128, 60).addBox(12.1F, -0.9946F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 47).addBox(12.1F, -0.9946F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r20 = cycle_cycle5.addOrReplaceChild("hexadecagon_r20",
				CubeListBuilder.create().texOffs(128, 50).addBox(12.1F, -0.9946F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 128).addBox(12.1F, -0.9946F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cycle_cycle6 = cycles3.addOrReplaceChild(
				"cycle_cycle6", CubeListBuilder.create().texOffs(126, 70).addBox(-9.1F, 4.0F, 1.0054F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(132, 73).addBox(-9.1F, -0.9946F, 6.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(132, 79).addBox(-9.1F, -0.9946F, -3.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(126, 91).addBox(-9.1F, -5.0F, 1.0054F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, 0.0F, -2.0F));
		PartDefinition hexadecagon_r21 = cycle_cycle6.addOrReplaceChild("hexadecagon_r21",
				CubeListBuilder.create().texOffs(126, 94).addBox(-14.1F, -5.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(80, 132).addBox(-14.1F, -0.9946F, -5.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(68, 132).addBox(-14.1F, -0.9946F, 4.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 5).addBox(-14.1F, 4.0F, -0.9946F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 2.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r22 = cycle_cycle6.addOrReplaceChild("hexadecagon_r22",
				CubeListBuilder.create().texOffs(88, 126).addBox(-14.1F, -5.0F, -0.9946F, 2.0F, 1.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(132, 76).addBox(-14.1F, -0.9946F, -5.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(74, 132).addBox(-14.1F, -0.9946F, 4.0F, 2.0F, 1.9891F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 122).addBox(-14.1F, 4.0F, -1.0054F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 2.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r23 = cycle_cycle6.addOrReplaceChild("hexadecagon_r23",
				CubeListBuilder.create().texOffs(58, 129).addBox(-14.1F, -0.9946F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 111).addBox(-14.1F, -0.9946F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 2.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r24 = cycle_cycle6.addOrReplaceChild("hexadecagon_r24",
				CubeListBuilder.create().texOffs(52, 129).addBox(-14.1F, -0.9946F, 4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 88).addBox(-14.1F, -0.9946F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 0.0F, 2.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition fire = motor.addOrReplaceChild("fire", CubeListBuilder.create().texOffs(238, 55).addBox(-7.5F, -3.5F, 0.0F, 9.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-22.7F, -20.5F, 0.0F));
		PartDefinition cube_r8 = fire.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(238, 56).addBox(-4.5F, -3.5F, 0.0F, 9.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r9 = fire.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(238, 55).addBox(-4.5F, -3.5F, 0.0F, 9.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r10 = fire.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(238, 55).addBox(-4.5F, -3.5F, 0.0F, 9.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		lightcycle.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}