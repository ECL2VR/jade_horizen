package net.mcreator.jadehorizen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.jadehorizen.procedures.MekawalkProcedure;
import net.mcreator.jadehorizen.procedures.MekasprintProcedure;
import net.mcreator.jadehorizen.entity.JadecrawlerEntity;
import net.mcreator.jadehorizen.client.model.animations.cyberAnimation;
import net.mcreator.jadehorizen.client.model.Modelcyber;

public class JadecrawlerRenderer extends MobRenderer<JadecrawlerEntity, Modelcyber<JadecrawlerEntity>> {
	public JadecrawlerRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelcyber.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JadecrawlerEntity entity) {
		return ResourceLocation.parse("jade_horizen:textures/entities/cyber_meka_png.png");
	}

	private static final class AnimatedModel extends Modelcyber<JadecrawlerEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<JadecrawlerEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(JadecrawlerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				if (MekawalkProcedure.execute(entity))
					this.animateWalk(cyberAnimation.walk, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState1, cyberAnimation.idle, ageInTicks, 1f);
				if (MekasprintProcedure.execute(entity))
					this.animateWalk(cyberAnimation.sprint, limbSwing, limbSwingAmount, 1.1f, 1.1f);
				this.animate(entity.animationState3, cyberAnimation.baseattack, ageInTicks, 1f);
				this.animate(entity.animationState4, cyberAnimation.death, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(JadecrawlerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}