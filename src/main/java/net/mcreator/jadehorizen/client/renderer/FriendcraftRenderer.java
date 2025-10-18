package net.mcreator.jadehorizen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.jadehorizen.entity.FriendcraftEntity;
import net.mcreator.jadehorizen.client.model.animations.alien_craftAnimation;
import net.mcreator.jadehorizen.client.model.Modelalien_craft;

import com.mojang.blaze3d.vertex.PoseStack;

public class FriendcraftRenderer extends MobRenderer<FriendcraftEntity, Modelalien_craft<FriendcraftEntity>> {
	public FriendcraftRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelalien_craft.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(FriendcraftEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(entity.getScale(), entity.getScale(), entity.getScale());
	}

	@Override
	public ResourceLocation getTextureLocation(FriendcraftEntity entity) {
		return ResourceLocation.parse("jade_horizen:textures/entities/alien_craft.png");
	}

	private static final class AnimatedModel extends Modelalien_craft<FriendcraftEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<FriendcraftEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(FriendcraftEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(alien_craftAnimation.walk, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(FriendcraftEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}