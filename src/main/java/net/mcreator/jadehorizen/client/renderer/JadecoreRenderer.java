package net.mcreator.jadehorizen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.jadehorizen.entity.JadecoreEntity;
import net.mcreator.jadehorizen.client.model.Modeljadecore;

public class JadecoreRenderer extends MobRenderer<JadecoreEntity, Modeljadecore<JadecoreEntity>> {
	public JadecoreRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljadecore<JadecoreEntity>(context.bakeLayer(Modeljadecore.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JadecoreEntity entity) {
		return ResourceLocation.parse("jade_horizen:textures/entities/jade_core_texture.png");
	}
}