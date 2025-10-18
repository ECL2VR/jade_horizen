package net.mcreator.jadehorizen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.jadehorizen.entity.AliencraftEntity;
import net.mcreator.jadehorizen.client.model.animations.alien_craftAnimation;
import net.mcreator.jadehorizen.client.model.Modelalien_craft;

public class AliencraftRenderer extends MobRenderer<AliencraftEntity, Modelalien_craft<AliencraftEntity>> {
	public AliencraftRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelalien_craft.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AliencraftEntity entity) {
		return ResourceLocation.parse("jade_horizen:textures/entities/alien_craft.png");
	}

	private static final class AnimatedModel extends Modelalien_craft<AliencraftEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<AliencraftEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(AliencraftEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(alien_craftAnimation.walk, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(AliencraftEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}