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

// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeljade_crawler<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jade_horizen", "modeljade_crawler"), "main");
	public final ModelPart jadecrawler;
	public final ModelPart body;
	public final ModelPart main;
	public final ModelPart left_side;
	public final ModelPart leg;
	public final ModelPart top;
	public final ModelPart mid;
	public final ModelPart bottom;
	public final ModelPart leg2;
	public final ModelPart top2;
	public final ModelPart mid2;
	public final ModelPart bottom2;
	public final ModelPart leg3;
	public final ModelPart top3;
	public final ModelPart mid3;
	public final ModelPart bottom3;
	public final ModelPart right_side;
	public final ModelPart leg4;
	public final ModelPart top4;
	public final ModelPart mid4;
	public final ModelPart bottom4;
	public final ModelPart leg5;
	public final ModelPart top5;
	public final ModelPart mid5;
	public final ModelPart bottom5;
	public final ModelPart leg6;
	public final ModelPart top6;
	public final ModelPart mid6;
	public final ModelPart bottom6;

	public Modeljade_crawler(ModelPart root) {
		this.jadecrawler = root.getChild("jadecrawler");
		this.body = this.jadecrawler.getChild("body");
		this.main = this.body.getChild("main");
		this.left_side = this.main.getChild("left_side");
		this.leg = this.left_side.getChild("leg");
		this.top = this.leg.getChild("top");
		this.mid = this.top.getChild("mid");
		this.bottom = this.mid.getChild("bottom");
		this.leg2 = this.left_side.getChild("leg2");
		this.top2 = this.leg2.getChild("top2");
		this.mid2 = this.top2.getChild("mid2");
		this.bottom2 = this.mid2.getChild("bottom2");
		this.leg3 = this.left_side.getChild("leg3");
		this.top3 = this.leg3.getChild("top3");
		this.mid3 = this.top3.getChild("mid3");
		this.bottom3 = this.mid3.getChild("bottom3");
		this.right_side = this.main.getChild("right_side");
		this.leg4 = this.right_side.getChild("leg4");
		this.top4 = this.leg4.getChild("top4");
		this.mid4 = this.top4.getChild("mid4");
		this.bottom4 = this.mid4.getChild("bottom4");
		this.leg5 = this.right_side.getChild("leg5");
		this.top5 = this.leg5.getChild("top5");
		this.mid5 = this.top5.getChild("mid5");
		this.bottom5 = this.mid5.getChild("bottom5");
		this.leg6 = this.right_side.getChild("leg6");
		this.top6 = this.leg6.getChild("top6");
		this.mid6 = this.top6.getChild("mid6");
		this.bottom6 = this.mid6.getChild("bottom6");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition jadecrawler = partdefinition.addOrReplaceChild("jadecrawler", CubeListBuilder.create(), PartPose.offset(0.0F, 21.0F, 0.0F));
		PartDefinition body = jadecrawler.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition main = body.addOrReplaceChild("main", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -22.0F, -5.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
				.addBox(-4.5F, -19.0F, -4.5F, 9.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(-5.0F, -12.0F, -5.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition left_side = main.addOrReplaceChild("left_side", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leg = left_side.addOrReplaceChild("leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition top = leg.addOrReplaceChild("top", CubeListBuilder.create(), PartPose.offset(4.9486F, -10.9574F, -4.0F));
		PartDefinition cube_r1 = top.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 16).addBox(-2.1075F, -0.1551F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4514F, -0.8574F, 0.0F, 0.0F, 0.0F, -1.8762F));
		PartDefinition mid = top.addOrReplaceChild("mid", CubeListBuilder.create(), PartPose.offset(-4.9486F, 10.9574F, 4.0F));
		PartDefinition cube_r2 = mid.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 26).addBox(-1.9468F, 0.0005F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.9972F, -14.0149F, -4.0F, 0.0F, 0.0F, -0.829F));
		PartDefinition bottom = mid.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(48, 36).addBox(21.3306F, -4.5606F, -5.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leg2 = left_side.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(5.0F, -10.8F, 4.0F));
		PartDefinition top2 = leg2.addOrReplaceChild("top2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2F, -4.0F));
		PartDefinition cube_r3 = top2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 42).addBox(-2.1075F, -0.1551F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5028F, -0.8149F, 0.0F, 0.0F, 0.0F, -1.8762F));
		PartDefinition mid2 = top2.addOrReplaceChild("mid2", CubeListBuilder.create(), PartPose.offset(-5.0F, 11.0F, 4.0F));
		PartDefinition cube_r4 = mid2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(40, 0).addBox(-1.9468F, 0.0005F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.9972F, -14.0149F, -4.0F, 0.0F, 0.0F, -0.829F));
		PartDefinition bottom2 = mid2.addOrReplaceChild("bottom2", CubeListBuilder.create().texOffs(48, 46).addBox(21.3306F, -4.5606F, -5.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leg3 = left_side.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offset(1.9F, -11.0F, 8.0F));
		PartDefinition top3 = leg3.addOrReplaceChild("top3", CubeListBuilder.create(), PartPose.offset(3.1F, 0.0F, -3.0F));
		PartDefinition cube_r5 = top3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(40, 42).addBox(-2.1075F, -0.1551F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0566F, -0.8149F, 0.2063F, 0.0F, 0.0F, -1.8762F));
		PartDefinition mid3 = top3.addOrReplaceChild("mid3", CubeListBuilder.create(), PartPose.offset(6.4056F, -2.9937F, 2.2063F));
		PartDefinition cube_r6 = mid3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 42).addBox(-1.9468F, 0.0005F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0378F, -0.0212F, -2.0F, 0.0F, 0.0F, -0.829F));
		PartDefinition bottom3 = mid3.addOrReplaceChild("bottom3", CubeListBuilder.create().texOffs(52, 20).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(9.8712F, 13.4331F, -2.0F));
		PartDefinition right_side = main.addOrReplaceChild("right_side", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leg4 = right_side.addOrReplaceChild("leg4", CubeListBuilder.create(), PartPose.offset(-5.0F, -11.0F, 0.0F));
		PartDefinition top4 = leg4.addOrReplaceChild("top4", CubeListBuilder.create(), PartPose.offset(-0.2486F, 0.0426F, -4.0F));
		PartDefinition cube_r7 = top4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(44, 26).addBox(0.1075F, -0.1551F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7514F, -0.8574F, 0.0F, 0.0F, 0.0F, 1.8762F));
		PartDefinition mid4 = top4.addOrReplaceChild("mid4", CubeListBuilder.create(), PartPose.offset(5.2486F, 10.9574F, 4.0F));
		PartDefinition cube_r8 = mid4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(8, 42).addBox(-0.0532F, 0.0005F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.9972F, -14.0149F, -4.0F, 0.0F, 0.0F, 0.829F));
		PartDefinition bottom4 = mid4.addOrReplaceChild("bottom4", CubeListBuilder.create().texOffs(32, 52).addBox(-22.3306F, -4.5606F, -5.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leg5 = right_side.addOrReplaceChild("leg5", CubeListBuilder.create(), PartPose.offset(-5.0F, -11.0F, 4.0F));
		PartDefinition top5 = leg5.addOrReplaceChild("top5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0F));
		PartDefinition cube_r9 = top5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(48, 0).addBox(0.1075F, -0.1551F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5028F, -0.8149F, 0.0F, 0.0F, 0.0F, 1.8762F));
		PartDefinition mid5 = top5.addOrReplaceChild("mid5", CubeListBuilder.create(), PartPose.offset(5.0F, 11.0F, 4.0F));
		PartDefinition cube_r10 = mid5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(16, 42).addBox(-0.0532F, 0.0005F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.9972F, -14.0149F, -4.0F, 0.0F, 0.0F, 0.829F));
		PartDefinition bottom5 = mid5.addOrReplaceChild("bottom5", CubeListBuilder.create().texOffs(38, 52).addBox(-22.3306F, -4.5606F, -5.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leg6 = right_side.addOrReplaceChild("leg6", CubeListBuilder.create(), PartPose.offset(-2.0F, -11.0F, 8.0F));
		PartDefinition top6 = leg6.addOrReplaceChild("top6", CubeListBuilder.create(), PartPose.offset(-3.0F, 0.0F, -3.0F));
		PartDefinition cube_r11 = top6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(48, 10).addBox(0.1075F, -0.1551F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0566F, -0.8149F, 0.2063F, 0.0F, 0.0F, 1.8762F));
		PartDefinition mid6 = top6.addOrReplaceChild("mid6", CubeListBuilder.create(), PartPose.offset(-6.4056F, -2.9937F, 2.2063F));
		PartDefinition cube_r12 = mid6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(24, 42).addBox(-0.0532F, 0.0005F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0378F, -0.0212F, -2.0F, 0.0F, 0.0F, 0.829F));
		PartDefinition bottom6 = mid6.addOrReplaceChild("bottom6", CubeListBuilder.create().texOffs(54, 30).addBox(-0.5F, -4.0F, -1.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.8712F, 13.4331F, -2.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		jadecrawler.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}