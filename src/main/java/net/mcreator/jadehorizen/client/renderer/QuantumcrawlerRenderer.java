package net.mcreator.jadehorizen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.jadehorizen.entity.QuantumcrawlerEntity;
import net.mcreator.jadehorizen.client.model.animations.jade_crawlerAnimation;
import net.mcreator.jadehorizen.client.model.Modeljade_crawler;

public class QuantumcrawlerRenderer extends MobRenderer<QuantumcrawlerEntity, Modeljade_crawler<QuantumcrawlerEntity>> {
	public QuantumcrawlerRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modeljade_crawler.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(QuantumcrawlerEntity entity) {
		return ResourceLocation.parse("jade_horizen:textures/entities/jade_crawler_texture.png");
	}

	private static final class AnimatedModel extends Modeljade_crawler<QuantumcrawlerEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<QuantumcrawlerEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(QuantumcrawlerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(jade_crawlerAnimation.walk, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState1, jade_crawlerAnimation.attack, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(QuantumcrawlerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}