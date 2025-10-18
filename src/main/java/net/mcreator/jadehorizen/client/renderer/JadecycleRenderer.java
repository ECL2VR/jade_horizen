package net.mcreator.jadehorizen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.jadehorizen.entity.JadecycleEntity;
import net.mcreator.jadehorizen.client.model.animations.lightcycleAnimation;
import net.mcreator.jadehorizen.client.model.Modellightcycle;

public class JadecycleRenderer extends MobRenderer<JadecycleEntity, Modellightcycle<JadecycleEntity>> {
	public JadecycleRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modellightcycle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JadecycleEntity entity) {
		return ResourceLocation.parse("jade_horizen:textures/entities/jade_cycle.png");
	}

	private static final class AnimatedModel extends Modellightcycle<JadecycleEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<JadecycleEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(JadecycleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(lightcycleAnimation.walk, limbSwing, limbSwingAmount, 1.8f, 1.8f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(JadecycleEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}