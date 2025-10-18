// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeljadecore<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "jadecore"), "main");
	private final ModelPart jadecore;
	private final ModelPart frame;
	private final ModelPart core;
	private final ModelPart frame2;
	private final ModelPart frame3;

	public Modeljadecore(ModelPart root) {
		this.jadecore = root.getChild("jadecore");
		this.frame = this.jadecore.getChild("frame");
		this.core = this.jadecore.getChild("core");
		this.frame2 = this.jadecore.getChild("frame2");
		this.frame3 = this.jadecore.getChild("frame3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition jadecore = partdefinition.addOrReplaceChild("jadecore", CubeListBuilder.create(),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition frame = jadecore.addOrReplaceChild("frame",
				CubeListBuilder.create().texOffs(28, 0)
						.addBox(-4.0F, 1.0F, -4.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(3.0F, 1.0F, -4.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 30)
						.addBox(3.0F, 1.0F, 3.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 30)
						.addBox(-4.0F, 1.0F, 3.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 7)
						.addBox(-4.0F, 7.0F, 3.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 9)
						.addBox(-4.0F, 7.0F, -4.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 7.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(3.0F, 7.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 11)
						.addBox(-4.0F, 0.0F, 3.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-4.0F, 0.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 0)
						.addBox(3.0F, 0.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 13)
						.addBox(-4.0F, 0.0F, -4.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition core = jadecore.addOrReplaceChild("core", CubeListBuilder.create().texOffs(56, 60).addBox(-1.0F,
				3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = core
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(56, 60).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r2 = core
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(56, 60).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r3 = core
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(56, 60).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition frame2 = jadecore.addOrReplaceChild("frame2",
				CubeListBuilder.create().texOffs(32, 34)
						.addBox(-2.88F, 1.82F, -2.88F, 0.72F, 4.32F, 0.72F, new CubeDeformation(0.0F)).texOffs(8, 35)
						.addBox(2.16F, 1.82F, -2.88F, 0.72F, 4.32F, 0.72F, new CubeDeformation(0.0F)).texOffs(28, 34)
						.addBox(2.16F, 1.82F, 2.16F, 0.72F, 4.32F, 0.72F, new CubeDeformation(0.0F)).texOffs(34, 12)
						.addBox(-2.88F, 1.82F, 2.16F, 0.72F, 4.32F, 0.72F, new CubeDeformation(0.0F)).texOffs(24, 20)
						.addBox(-2.88F, 6.14F, 2.16F, 5.76F, 0.72F, 0.72F, new CubeDeformation(0.0F)).texOffs(10, 25)
						.addBox(-2.88F, 6.14F, -2.88F, 5.76F, 0.72F, 0.72F, new CubeDeformation(0.0F)).texOffs(14, 15)
						.addBox(-2.88F, 6.14F, -2.16F, 0.72F, 0.72F, 4.32F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(2.16F, 6.14F, -2.16F, 0.72F, 0.72F, 4.32F, new CubeDeformation(0.0F)).texOffs(24, 22)
						.addBox(-2.88F, 1.1F, 2.16F, 5.76F, 0.72F, 0.72F, new CubeDeformation(0.0F)).texOffs(14, 20)
						.addBox(-2.88F, 1.1F, -2.16F, 0.72F, 0.72F, 4.32F, new CubeDeformation(0.0F)).texOffs(24, 15)
						.addBox(2.16F, 1.1F, -2.16F, 0.72F, 0.72F, 4.32F, new CubeDeformation(0.0F)).texOffs(24, 24)
						.addBox(-2.88F, 1.1F, -2.88F, 5.76F, 0.72F, 0.72F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition frame3 = jadecore.addOrReplaceChild("frame3", CubeListBuilder.create().texOffs(32, 26)
				.addBox(-2.016F, 2.474F, -2.016F, 0.504F, 3.024F, 0.504F, new CubeDeformation(0.0F)).texOffs(10, 21)
				.addBox(1.512F, 2.474F, -2.016F, 0.504F, 3.024F, 0.504F, new CubeDeformation(0.0F)).texOffs(12, 35)
				.addBox(1.512F, 2.474F, 1.512F, 0.504F, 3.024F, 0.504F, new CubeDeformation(0.0F)).texOffs(16, 35)
				.addBox(-2.016F, 2.474F, 1.512F, 0.504F, 3.024F, 0.504F, new CubeDeformation(0.0F)).texOffs(32, 8)
				.addBox(-2.016F, 5.498F, 1.512F, 4.032F, 0.504F, 0.504F, new CubeDeformation(0.0F)).texOffs(32, 4)
				.addBox(-2.016F, 5.498F, -2.016F, 4.032F, 0.504F, 0.504F, new CubeDeformation(0.0F)).texOffs(8, 31)
				.addBox(-2.016F, 5.498F, -1.512F, 0.504F, 0.504F, 3.024F, new CubeDeformation(0.0F)).texOffs(16, 31)
				.addBox(1.512F, 5.498F, -1.512F, 0.504F, 0.504F, 3.024F, new CubeDeformation(0.0F)).texOffs(32, 10)
				.addBox(-2.016F, 1.97F, 1.512F, 4.032F, 0.504F, 0.504F, new CubeDeformation(0.0F)).texOffs(32, 0)
				.addBox(-2.016F, 1.97F, -1.512F, 0.504F, 0.504F, 3.024F, new CubeDeformation(0.0F)).texOffs(28, 30)
				.addBox(1.512F, 1.97F, -1.512F, 0.504F, 0.504F, 3.024F, new CubeDeformation(0.0F)).texOffs(32, 6)
				.addBox(-2.016F, 1.97F, -2.016F, 4.032F, 0.504F, 0.504F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		jadecore.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}