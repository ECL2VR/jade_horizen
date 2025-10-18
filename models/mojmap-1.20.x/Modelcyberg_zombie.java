// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcyberg_zombie<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cyberg_zombie"), "main");
	private final ModelPart zombie;
	private final ModelPart body;
	private final ModelPart left_leg;
	private final ModelPart left_arm;
	private final ModelPart head;
	private final ModelPart right_leg;
	private final ModelPart right_arm;

	public Modelcyberg_zombie(ModelPart root) {
		this.zombie = root.getChild("zombie");
		this.body = this.zombie.getChild("body");
		this.left_leg = this.body.getChild("left_leg");
		this.left_arm = this.body.getChild("left_arm");
		this.head = this.body.getChild("head");
		this.right_leg = this.zombie.getChild("right_leg");
		this.right_arm = this.zombie.getChild("right_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition zombie = partdefinition.addOrReplaceChild("zombie", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = zombie.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(16, 16)
						.addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(-3.8F, -23.0F, -3.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 59)
						.addBox(-4.0F, -23.7F, -2.7F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 61)
						.addBox(-1.0F, -19.7F, -2.7F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1",
				CubeListBuilder.create().texOffs(23, 61).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -21.0F, -2.8F, 0.0F, 0.0F, -0.7854F));

		PartDefinition left_leg = body.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).addBox(
				-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition left_arm = body.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).addBox(
				0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -22.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
						.addBox(4.0F, -9.0F, -5.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(4.0F, -6.0F, -5.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 3)
						.addBox(4.0F, -9.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(0.0F, -9.0F, -5.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(1.0F, -8.0F, -5.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 1)
						.addBox(0.0F, -5.0F, -4.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(1.0F, -3.0F, -4.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 4)
						.addBox(0.0F, -4.0F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 1)
						.addBox(2.7F, -4.2F, -4.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 2)
						.addBox(2.0F, -5.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition right_leg = zombie.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -12.0F, 0.0F));

		PartDefinition right_arm = zombie.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16)
				.addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, -22.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		zombie.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}