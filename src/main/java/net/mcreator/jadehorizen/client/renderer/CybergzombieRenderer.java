package net.mcreator.jadehorizen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.jadehorizen.entity.CybergzombieEntity;
import net.mcreator.jadehorizen.client.model.animations.cyberg_zombieAnimation;
import net.mcreator.jadehorizen.client.model.Modelcyberg_zombie;

public class CybergzombieRenderer extends MobRenderer<CybergzombieEntity, Modelcyberg_zombie<CybergzombieEntity>> {
	public CybergzombieRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelcyberg_zombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CybergzombieEntity entity) {
		return ResourceLocation.parse("jade_horizen:textures/entities/zombie.png");
	}

	private static final class AnimatedModel extends Modelcyberg_zombie<CybergzombieEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<CybergzombieEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(CybergzombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(cyberg_zombieAnimation.walk, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(CybergzombieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}