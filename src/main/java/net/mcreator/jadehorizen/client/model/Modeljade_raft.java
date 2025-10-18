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

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeljade_raft<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jade_horizen", "modeljade_raft"), "main");
	public final ModelPart jaderaft;
	public final ModelPart base;
	public final ModelPart jadecore;
	public final ModelPart frame;
	public final ModelPart core2;
	public final ModelPart frame2;
	public final ModelPart frame3;
	public final ModelPart engine;
	public final ModelPart fuel;
	public final ModelPart booster;
	public final ModelPart booster2;
	public final ModelPart booster3;
	public final ModelPart booster4;
	public final ModelPart chair;
	public final ModelPart bone2;
	public final ModelPart leaver;
	public final ModelPart bone;
	public final ModelPart size;

	public Modeljade_raft(ModelPart root) {
		this.jaderaft = root.getChild("jaderaft");
		this.base = this.jaderaft.getChild("base");
		this.jadecore = this.base.getChild("jadecore");
		this.frame = this.jadecore.getChild("frame");
		this.core2 = this.jadecore.getChild("core2");
		this.frame2 = this.jadecore.getChild("frame2");
		this.frame3 = this.jadecore.getChild("frame3");
		this.engine = this.base.getChild("engine");
		this.fuel = this.engine.getChild("fuel");
		this.booster = this.base.getChild("booster");
		this.booster2 = this.base.getChild("booster2");
		this.booster3 = this.base.getChild("booster3");
		this.booster4 = this.base.getChild("booster4");
		this.chair = this.base.getChild("chair");
		this.bone2 = this.chair.getChild("bone2");
		this.leaver = this.base.getChild("leaver");
		this.bone = this.leaver.getChild("bone");
		this.size = root.getChild("size");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition jaderaft = partdefinition.addOrReplaceChild("jaderaft", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition base = jaderaft.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 0).addBox(-15.0F, -2.0F, -15.0F, 30.0F, 2.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition jadecore = base.addOrReplaceChild("jadecore", CubeListBuilder.create(), PartPose.offset(-10.0F, -11.0F, 10.0F));
		PartDefinition frame = jadecore.addOrReplaceChild("frame",
				CubeListBuilder.create().texOffs(116, 119).addBox(-4.0F, 1.0F, -4.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 119).addBox(3.0F, 1.0F, -4.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 119)
						.addBox(3.0F, 1.0F, 3.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 121).addBox(-4.0F, 1.0F, 3.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 125)
						.addBox(-4.0F, 7.0F, 3.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 126).addBox(-4.0F, 7.0F, -4.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 121)
						.addBox(-4.0F, 7.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(114, 121).addBox(3.0F, 7.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(110, 118)
						.addBox(-4.0F, 0.0F, 3.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 119).addBox(-4.0F, 0.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(113, 120)
						.addBox(3.0F, 0.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(110, 120).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition core2 = jadecore.addOrReplaceChild("core2", CubeListBuilder.create().texOffs(0, 124).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = core2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 124).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r2 = core2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 124).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r3 = core2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 123).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition frame2 = jadecore.addOrReplaceChild("frame2",
				CubeListBuilder.create().texOffs(125, 122).addBox(-2.88F, 1.82F, -2.88F, 0.72F, 4.32F, 0.72F, new CubeDeformation(0.0F)).texOffs(121, 122).addBox(2.16F, 1.82F, -2.88F, 0.72F, 4.32F, 0.72F, new CubeDeformation(0.0F)).texOffs(118, 122)
						.addBox(2.16F, 1.82F, 2.16F, 0.72F, 4.32F, 0.72F, new CubeDeformation(0.0F)).texOffs(125, 122).addBox(-2.88F, 1.82F, 2.16F, 0.72F, 4.32F, 0.72F, new CubeDeformation(0.0F)).texOffs(115, 122)
						.addBox(-2.88F, 6.14F, 2.16F, 5.76F, 0.72F, 0.72F, new CubeDeformation(0.0F)).texOffs(115, 126).addBox(-2.88F, 6.14F, -2.88F, 5.76F, 0.72F, 0.72F, new CubeDeformation(0.0F)).texOffs(112, 122)
						.addBox(-2.88F, 6.14F, -2.16F, 0.72F, 0.72F, 4.32F, new CubeDeformation(0.0F)).texOffs(117, 122).addBox(2.16F, 6.14F, -2.16F, 0.72F, 0.72F, 4.32F, new CubeDeformation(0.0F)).texOffs(115, 124)
						.addBox(-2.88F, 1.1F, 2.16F, 5.76F, 0.72F, 0.72F, new CubeDeformation(0.0F)).texOffs(116, 120).addBox(-2.88F, 1.1F, -2.16F, 0.72F, 0.72F, 4.32F, new CubeDeformation(0.0F)).texOffs(117, 122)
						.addBox(2.16F, 1.1F, -2.16F, 0.72F, 0.72F, 4.32F, new CubeDeformation(0.0F)).texOffs(114, 120).addBox(-2.88F, 1.1F, -2.88F, 5.76F, 0.72F, 0.72F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition frame3 = jadecore.addOrReplaceChild("frame3",
				CubeListBuilder.create().texOffs(125, 122).addBox(-2.016F, 2.474F, -2.016F, 0.504F, 3.024F, 0.504F, new CubeDeformation(0.0F)).texOffs(119, 124).addBox(1.512F, 2.474F, -2.016F, 0.504F, 3.024F, 0.504F, new CubeDeformation(0.0F))
						.texOffs(114, 123).addBox(1.512F, 2.474F, 1.512F, 0.504F, 3.024F, 0.504F, new CubeDeformation(0.0F)).texOffs(115, 124).addBox(-2.016F, 2.474F, 1.512F, 0.504F, 3.024F, 0.504F, new CubeDeformation(0.0F)).texOffs(118, 122)
						.addBox(-2.016F, 5.498F, 1.512F, 4.032F, 0.504F, 0.504F, new CubeDeformation(0.0F)).texOffs(114, 120).addBox(-2.016F, 5.498F, -2.016F, 4.032F, 0.504F, 0.504F, new CubeDeformation(0.0F)).texOffs(120, 124)
						.addBox(-2.016F, 5.498F, -1.512F, 0.504F, 0.504F, 3.024F, new CubeDeformation(0.0F)).texOffs(114, 122).addBox(1.512F, 5.498F, -1.512F, 0.504F, 0.504F, 3.024F, new CubeDeformation(0.0F)).texOffs(118, 121)
						.addBox(-2.016F, 1.97F, 1.512F, 4.032F, 0.504F, 0.504F, new CubeDeformation(0.0F)).texOffs(114, 119).addBox(-2.016F, 1.97F, -1.512F, 0.504F, 0.504F, 3.024F, new CubeDeformation(0.0F)).texOffs(112, 124)
						.addBox(1.512F, 1.97F, -1.512F, 0.504F, 0.504F, 3.024F, new CubeDeformation(0.0F)).texOffs(114, 122).addBox(-2.016F, 1.97F, -2.016F, 4.032F, 0.504F, 0.504F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition engine = base.addOrReplaceChild("engine",
				CubeListBuilder.create().texOffs(48, 32).addBox(-5.0F, -5.0F, -3.5F, 10.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 59).addBox(-4.0F, -4.0F, 1.5F, 8.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 18.5F));
		PartDefinition fuel = engine.addOrReplaceChild("fuel", CubeListBuilder.create().texOffs(108, -10).addBox(-1.0F, -3.0F, 0.0F, 0.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 1.0F, -1.5F));
		PartDefinition cube_r4 = fuel.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(108, -10).addBox(0.0F, -3.0F, -5.0F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 5.0F, 0.0F, 0.0F, 2.3562F));
		PartDefinition cube_r5 = fuel.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(108, -10).addBox(0.0F, -3.0F, -5.0F, 0.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 5.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r6 = fuel.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(108, -10).addBox(0.0F, -2.0F, -5.0F, 0.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 5.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition booster = base.addOrReplaceChild("booster",
				CubeListBuilder.create().texOffs(72, 32).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 76).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, 2.5F, 12.5F, -1.5708F, 0.0F, 0.0F));
		PartDefinition booster2 = base.addOrReplaceChild("booster2",
				CubeListBuilder.create().texOffs(72, 38).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 76).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 2.5F, 12.5F, -1.5708F, 0.0F, 0.0F));
		PartDefinition booster3 = base.addOrReplaceChild("booster3",
				CubeListBuilder.create().texOffs(42, 72).addBox(-2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 76).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, 2.5F, -12.5F, 1.5708F, 0.0F, 0.0F));
		PartDefinition booster4 = base.addOrReplaceChild("booster4",
				CubeListBuilder.create().texOffs(54, 72).addBox(-2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 76).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, 2.5F, -12.5F, 1.5708F, 0.0F, 0.0F));
		PartDefinition chair = base.addOrReplaceChild("chair", CubeListBuilder.create().texOffs(0, 32).addBox(-7.0F, -6.0F, -4.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(48, 44)
				.addBox(-7.0F, -15.0F, 7.0F, 12.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 59).addBox(-4.0F, -4.0F, -1.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, -3.0F));
		PartDefinition bone2 = chair.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 46).addBox(-7.0F, -3.0F, -4.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leaver = base.addOrReplaceChild("leaver", CubeListBuilder.create().texOffs(44, 65).addBox(-1.0F, 1.0267F, -1.1487F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -7.1138F, -2.1598F));
		PartDefinition bone = leaver.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.9733F, 1.6487F));
		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(48, 54).addBox(-1.0F, -1.0F, -7.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -1.1465F, -2.0975F, -0.8727F, 0.0F, 0.0F));
		PartDefinition size = partdefinition.addOrReplaceChild("size", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		jaderaft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		size.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}