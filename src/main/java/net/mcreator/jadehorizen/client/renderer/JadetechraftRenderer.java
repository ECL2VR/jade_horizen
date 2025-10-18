package net.mcreator.jadehorizen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.jadehorizen.entity.JadetechraftEntity;
import net.mcreator.jadehorizen.client.model.animations.jade_raftAnimation;
import net.mcreator.jadehorizen.client.model.Modeljade_raft;

public class JadetechraftRenderer extends MobRenderer<JadetechraftEntity, Modeljade_raft<JadetechraftEntity>> {
	public JadetechraftRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modeljade_raft.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JadetechraftEntity entity) {
		return ResourceLocation.parse("jade_horizen:textures/entities/jada_raft_.png");
	}

	private static final class AnimatedModel extends Modeljade_raft<JadetechraftEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<JadetechraftEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(JadetechraftEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animateWalk(jade_raftAnimation.walk, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(JadetechraftEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}