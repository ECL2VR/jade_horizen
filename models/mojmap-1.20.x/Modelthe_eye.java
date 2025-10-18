// Made with Blockbench 5.0.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelthe_eye<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "the_eye"), "main");
	private final ModelPart theeye;
	private final ModelPart base;
	private final ModelPart frame;
	private final ModelPart inter;
	private final ModelPart frame2;
	private final ModelPart eye;

	public Modelthe_eye(ModelPart root) {
		this.theeye = root.getChild("theeye");
		this.base = this.theeye.getChild("base");
		this.frame = this.base.getChild("frame");
		this.inter = this.base.getChild("inter");
		this.frame2 = this.inter.getChild("frame2");
		this.eye = this.inter.getChild("eye");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition theeye = partdefinition.addOrReplaceChild("theeye", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.1042F));

		PartDefinition base = theeye.addOrReplaceChild("base", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition frame = base.addOrReplaceChild("frame",
				CubeListBuilder.create().texOffs(0, 64)
						.addBox(-24.0F, 22.0F, -24.0F, 48.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
						.addBox(-24.0F, 22.0F, 22.0F, 48.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(-24.0F, -24.0F, -24.0F, 48.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-24.0F, -24.0F, 22.0F, 48.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 96)
						.addBox(22.0F, -22.0F, 22.0F, 2.0F, 44.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 96)
						.addBox(22.0F, -22.0F, -24.0F, 2.0F, 44.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 96)
						.addBox(-24.0F, -22.0F, 22.0F, 2.0F, 44.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 96)
						.addBox(-24.0F, -22.0F, -24.0F, 2.0F, 44.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -0.1042F));

		PartDefinition cube_r1 = frame.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 72)
						.addBox(-22.0F, -1.0F, 22.0F, 44.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 80)
						.addBox(-22.0F, -1.0F, -24.0F, 44.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 68)
						.addBox(-22.0F, -47.0F, 22.0F, 44.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 76)
						.addBox(-22.0F, -47.0F, -24.0F, 44.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition inter = base.addOrReplaceChild("inter", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.1042F));

		PartDefinition frame2 = inter.addOrReplaceChild("frame2",
				CubeListBuilder.create().texOffs(32, 96)
						.addBox(-19.0F, -17.0F, -18.4167F, 2.0F, 34.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 96)
						.addBox(17.0F, -17.0F, -18.4167F, 2.0F, 34.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 96)
						.addBox(-19.0F, -17.0F, 16.5833F, 2.0F, 34.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 96)
						.addBox(17.0F, -17.0F, 16.5833F, 2.0F, 34.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 84)
						.addBox(-19.0F, -19.0F, 16.5833F, 38.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(80, 84)
						.addBox(-19.0F, -19.0F, -18.4167F, 38.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(80, 88)
						.addBox(-19.0F, 17.0F, 16.5833F, 38.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 88)
						.addBox(-19.0F, 17.0F, -18.4167F, 38.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.2083F));

		PartDefinition cube_r2 = frame2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(92, 68)
						.addBox(-17.0F, -1.0F, -24.0F, 34.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 92)
						.addBox(-17.0F, -37.0F, -24.0F, 34.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 18.0F, -0.4167F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r3 = frame2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(92, 72)
						.addBox(-17.0F, -1.0F, 22.0F, 33.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 92)
						.addBox(-17.0F, -37.0F, 22.0F, 33.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 18.0F, -0.4167F, 0.0F, 1.5708F, 0.0F));

		PartDefinition eye = inter.addOrReplaceChild("eye", CubeListBuilder.create().texOffs(0, 0).addBox(-13.0F,
				-13.0F, -13.0F, 26.0F, 26.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -0.2083F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		theeye.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}