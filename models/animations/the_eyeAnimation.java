// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 5.0.2 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class the_eyeAnimation {
	public static final AnimationDefinition living = AnimationDefinition.Builder.withLength(1.0F).looping()
			.addAnimation("frame",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0622F, 0.249F, -0.0131F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(57.5949F, -57.2485F, 717.4069F),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("frame2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(-27.4291F, 31.772F, 424.2991F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.9583F, KeyframeAnimations.degreeVec(-208.2491F, -16.7796F, 841.7509F),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 720.0F),
									AnimationChannel.Interpolations.LINEAR)))
			.build();
}