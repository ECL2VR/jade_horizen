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
public class Modelalien_craft<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jade_horizen", "modelalien_craft"), "main");
	public final ModelPart aliencraft;
	public final ModelPart top;
	public final ModelPart bottem;
	public final ModelPart roof;

	public Modelalien_craft(ModelPart root) {
		this.aliencraft = root.getChild("aliencraft");
		this.top = this.aliencraft.getChild("top");
		this.bottem = this.aliencraft.getChild("bottem");
		this.roof = this.aliencraft.getChild("roof");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition aliencraft = partdefinition.addOrReplaceChild("aliencraft", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition top = aliencraft.addOrReplaceChild("top",
				CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, -0.9946F, -5.0F, 1.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 56).addBox(-0.5F, -5.0F, -0.9946F, 1.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -2.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition hexadecagon_r1 = top.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(54, 56).addBox(7.0F, -5.0F, -0.9946F, 1.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(48, 32).addBox(7.0F, -0.9946F, -5.0F, 1.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r2 = top.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(42, 56).addBox(7.0F, -5.0F, -0.9946F, 1.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(26, 44).addBox(7.0F, -0.9946F, -5.0F, 1.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r3 = top.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(48, 44).addBox(7.0F, -0.9946F, -5.0F, 1.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r4 = top.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(26, 32).addBox(7.0F, -0.9946F, -5.0F, 1.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bottem = aliencraft.addOrReplaceChild("bottem",
				CubeListBuilder.create().texOffs(26, 0).addBox(-0.5625F, -2.0F, -6.0F, 1.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(22, 56).addBox(-0.5625F, -6.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -1.0625F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition hexadecagon_r5 = bottem.addOrReplaceChild("hexadecagon_r5",
				CubeListBuilder.create().texOffs(32, 56).addBox(7.0F, -6.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 16).addBox(7.0F, -2.0F, -6.0F, 1.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.4625F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r6 = bottem.addOrReplaceChild("hexadecagon_r6",
				CubeListBuilder.create().texOffs(52, 9).addBox(7.0F, -6.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(7.0F, -2.0F, -6.0F, 1.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.4625F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r7 = bottem.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(0, 32).addBox(7.0F, -2.0F, -6.0F, 1.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.3625F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r8 = bottem.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(0, 0).addBox(7.0F, -2.0F, -6.0F, 1.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6625F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition roof = aliencraft.addOrReplaceChild("roof",
				CubeListBuilder.create().texOffs(52, 0).addBox(-3.0F, -5.5F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(56, 4).addBox(-1.0F, -1.3F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		aliencraft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}