package net.mcreator.jadehorizen.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcyber<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("jade_horizen", "modelcyber"), "main");
	public final ModelPart cyber_meka;
	public final ModelPart core_reactor;
	public final ModelPart middleplate;
	public final ModelPart staff;
	public final ModelPart head;
	public final ModelPart neck;
	public final ModelPart lowerneck;
	public final ModelPart upperneck;
	public final ModelPart head2;
	public final ModelPart jaw;
	public final ModelPart ruff;
	public final ModelPart leftarm;
	public final ModelPart shoulder;
	public final ModelPart shouldermain;
	public final ModelPart plate;
	public final ModelPart hing4;
	public final ModelPart left_cords_front;
	public final ModelPart left_cords_back;
	public final ModelPart uper_plate;
	public final ModelPart back_plate;
	public final ModelPart lower_plate;
	public final ModelPart inerplate;
	public final ModelPart connected;
	public final ModelPart inger;
	public final ModelPart platesr2;
	public final ModelPart cords2;
	public final ModelPart hing5;
	public final ModelPart bone2;
	public final ModelPart bicep;
	public final ModelPart bicepmain;
	public final ModelPart hing8;
	public final ModelPart platesr;
	public final ModelPart cords;
	public final ModelPart hing3;
	public final ModelPart bone;
	public final ModelPart closetobodycore;
	public final ModelPart hand;
	public final ModelPart main;
	public final ModelPart pipe;
	public final ModelPart pipe2;
	public final ModelPart pipe3;
	public final ModelPart pipe4;
	public final ModelPart pipe5;
	public final ModelPart pipe6;
	public final ModelPart pipe7;
	public final ModelPart fingercontrol;
	public final ModelPart finger;
	public final ModelPart tip2;
	public final ModelPart finger2;
	public final ModelPart tip3;
	public final ModelPart finger3;
	public final ModelPart tip4;
	public final ModelPart finger4;
	public final ModelPart tip5;
	public final ModelPart thumcontrol;
	public final ModelPart thum;
	public final ModelPart tip;
	public final ModelPart rightarm;
	public final ModelPart shoulder2;
	public final ModelPart shouldermain2;
	public final ModelPart plate2;
	public final ModelPart hing6;
	public final ModelPart right_cords_front;
	public final ModelPart right_cords_back;
	public final ModelPart uper_plate2;
	public final ModelPart back_plate2;
	public final ModelPart lower_plate2;
	public final ModelPart inerplate2;
	public final ModelPart connected2;
	public final ModelPart inger2;
	public final ModelPart platesr3;
	public final ModelPart cords3;
	public final ModelPart hing7;
	public final ModelPart bone3;
	public final ModelPart bicep2;
	public final ModelPart bicepmain2;
	public final ModelPart hing9;
	public final ModelPart platesr4;
	public final ModelPart cords4;
	public final ModelPart hing10;
	public final ModelPart bone4;
	public final ModelPart closetobodycore2;
	public final ModelPart hand2;
	public final ModelPart main2;
	public final ModelPart pipe8;
	public final ModelPart pipe9;
	public final ModelPart pipe10;
	public final ModelPart pipe11;
	public final ModelPart pipe12;
	public final ModelPart pipe13;
	public final ModelPart pipe14;
	public final ModelPart fingercontrol2;
	public final ModelPart finger5;
	public final ModelPart tip6;
	public final ModelPart finger6;
	public final ModelPart tip7;
	public final ModelPart finger7;
	public final ModelPart tip8;
	public final ModelPart finger8;
	public final ModelPart tip9;
	public final ModelPart thumcontrol2;
	public final ModelPart thum2;
	public final ModelPart tip10;

	public Modelcyber(ModelPart root) {
		this.cyber_meka = root.getChild("cyber_meka");
		this.core_reactor = this.cyber_meka.getChild("core_reactor");
		this.middleplate = this.core_reactor.getChild("middleplate");
		this.staff = this.middleplate.getChild("staff");
		this.head = this.staff.getChild("head");
		this.neck = this.head.getChild("neck");
		this.lowerneck = this.neck.getChild("lowerneck");
		this.upperneck = this.lowerneck.getChild("upperneck");
		this.head2 = this.upperneck.getChild("head2");
		this.jaw = this.head2.getChild("jaw");
		this.ruff = this.head2.getChild("ruff");
		this.leftarm = this.middleplate.getChild("leftarm");
		this.shoulder = this.leftarm.getChild("shoulder");
		this.shouldermain = this.shoulder.getChild("shouldermain");
		this.plate = this.shouldermain.getChild("plate");
		this.hing4 = this.shouldermain.getChild("hing4");
		this.left_cords_front = this.shouldermain.getChild("left_cords_front");
		this.left_cords_back = this.shouldermain.getChild("left_cords_back");
		this.uper_plate = this.shouldermain.getChild("uper_plate");
		this.back_plate = this.shouldermain.getChild("back_plate");
		this.lower_plate = this.shouldermain.getChild("lower_plate");
		this.inerplate = this.shouldermain.getChild("inerplate");
		this.connected = this.shouldermain.getChild("connected");
		this.inger = this.connected.getChild("inger");
		this.platesr2 = this.inger.getChild("platesr2");
		this.cords2 = this.platesr2.getChild("cords2");
		this.hing5 = this.platesr2.getChild("hing5");
		this.bone2 = this.hing5.getChild("bone2");
		this.bicep = this.inger.getChild("bicep");
		this.bicepmain = this.bicep.getChild("bicepmain");
		this.hing8 = this.bicepmain.getChild("hing8");
		this.platesr = this.bicepmain.getChild("platesr");
		this.cords = this.platesr.getChild("cords");
		this.hing3 = this.bicepmain.getChild("hing3");
		this.bone = this.hing3.getChild("bone");
		this.closetobodycore = this.bicepmain.getChild("closetobodycore");
		this.hand = this.bicepmain.getChild("hand");
		this.main = this.hand.getChild("main");
		this.pipe = this.main.getChild("pipe");
		this.pipe2 = this.main.getChild("pipe2");
		this.pipe3 = this.main.getChild("pipe3");
		this.pipe4 = this.main.getChild("pipe4");
		this.pipe5 = this.main.getChild("pipe5");
		this.pipe6 = this.main.getChild("pipe6");
		this.pipe7 = this.main.getChild("pipe7");
		this.fingercontrol = this.main.getChild("fingercontrol");
		this.finger = this.fingercontrol.getChild("finger");
		this.tip2 = this.finger.getChild("tip2");
		this.finger2 = this.fingercontrol.getChild("finger2");
		this.tip3 = this.finger2.getChild("tip3");
		this.finger3 = this.fingercontrol.getChild("finger3");
		this.tip4 = this.finger3.getChild("tip4");
		this.finger4 = this.fingercontrol.getChild("finger4");
		this.tip5 = this.finger4.getChild("tip5");
		this.thumcontrol = this.main.getChild("thumcontrol");
		this.thum = this.thumcontrol.getChild("thum");
		this.tip = this.thum.getChild("tip");
		this.rightarm = this.middleplate.getChild("rightarm");
		this.shoulder2 = this.rightarm.getChild("shoulder2");
		this.shouldermain2 = this.shoulder2.getChild("shouldermain2");
		this.plate2 = this.shouldermain2.getChild("plate2");
		this.hing6 = this.shouldermain2.getChild("hing6");
		this.right_cords_front = this.shouldermain2.getChild("right_cords_front");
		this.right_cords_back = this.shouldermain2.getChild("right_cords_back");
		this.uper_plate2 = this.shouldermain2.getChild("uper_plate2");
		this.back_plate2 = this.shouldermain2.getChild("back_plate2");
		this.lower_plate2 = this.shouldermain2.getChild("lower_plate2");
		this.inerplate2 = this.shouldermain2.getChild("inerplate2");
		this.connected2 = this.shouldermain2.getChild("connected2");
		this.inger2 = this.connected2.getChild("inger2");
		this.platesr3 = this.inger2.getChild("platesr3");
		this.cords3 = this.platesr3.getChild("cords3");
		this.hing7 = this.inger2.getChild("hing7");
		this.bone3 = this.hing7.getChild("bone3");
		this.bicep2 = this.inger2.getChild("bicep2");
		this.bicepmain2 = this.bicep2.getChild("bicepmain2");
		this.hing9 = this.bicepmain2.getChild("hing9");
		this.platesr4 = this.bicepmain2.getChild("platesr4");
		this.cords4 = this.platesr4.getChild("cords4");
		this.hing10 = this.bicepmain2.getChild("hing10");
		this.bone4 = this.hing10.getChild("bone4");
		this.closetobodycore2 = this.bicepmain2.getChild("closetobodycore2");
		this.hand2 = this.bicepmain2.getChild("hand2");
		this.main2 = this.hand2.getChild("main2");
		this.pipe8 = this.main2.getChild("pipe8");
		this.pipe9 = this.main2.getChild("pipe9");
		this.pipe10 = this.main2.getChild("pipe10");
		this.pipe11 = this.main2.getChild("pipe11");
		this.pipe12 = this.main2.getChild("pipe12");
		this.pipe13 = this.main2.getChild("pipe13");
		this.pipe14 = this.main2.getChild("pipe14");
		this.fingercontrol2 = this.main2.getChild("fingercontrol2");
		this.finger5 = this.fingercontrol2.getChild("finger5");
		this.tip6 = this.finger5.getChild("tip6");
		this.finger6 = this.fingercontrol2.getChild("finger6");
		this.tip7 = this.finger6.getChild("tip7");
		this.finger7 = this.fingercontrol2.getChild("finger7");
		this.tip8 = this.finger7.getChild("tip8");
		this.finger8 = this.fingercontrol2.getChild("finger8");
		this.tip9 = this.finger8.getChild("tip9");
		this.thumcontrol2 = this.main2.getChild("thumcontrol2");
		this.thum2 = this.thumcontrol2.getChild("thum2");
		this.tip10 = this.thum2.getChild("tip10");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition cyber_meka = partdefinition.addOrReplaceChild("cyber_meka", CubeListBuilder.create(), PartPose.offset(0.0F, 9.0F, 0.0F));
		PartDefinition core_reactor = cyber_meka.addOrReplaceChild("core_reactor", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition middleplate = core_reactor.addOrReplaceChild("middleplate", CubeListBuilder.create(), PartPose.offset(-9.0F, -2.0F, -0.6F));
		PartDefinition staff = middleplate.addOrReplaceChild("staff",
				CubeListBuilder.create().texOffs(212, 279).addBox(-4.0067F, -5.6214F, -7.2402F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(302, 110).addBox(-7.4067F, 2.9786F, -5.3402F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
						.texOffs(302, 148).addBox(4.3933F, 2.9786F, -5.3402F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(302, 204).addBox(4.3933F, 5.1786F, 2.9598F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(302, 234)
						.addBox(-7.4067F, 5.1786F, 2.9598F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(286, 82).addBox(-1.4067F, 5.8786F, 2.9598F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(200, 282)
						.addBox(-7.4067F, -4.8214F, 4.9598F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(290, 168).addBox(4.3933F, -4.8214F, 4.9598F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(278, 293)
						.addBox(-1.4067F, -9.6214F, -6.9402F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(286, 92).addBox(-1.4067F, -8.5214F, 2.9598F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0067F, -23.3786F, 2.2402F));
		PartDefinition cube_r1 = staff.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(38, 208).addBox(-6.0F, -4.0F, 0.0F, 14.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0067F, -5.6214F, -7.2402F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r2 = staff.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(98, 323).addBox(0.0F, 0.0F, -0.5F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0067F, -5.6214F, -6.9402F, 0.0F, 0.0F, -0.5672F));
		PartDefinition cube_r3 = staff.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(14, 269).addBox(-3.0F, 0.0F, -0.5F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.9933F, -5.6214F, -6.9402F, 0.0F, 0.0F, 0.5672F));
		PartDefinition cube_r4 = staff.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(332, 127).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2933F, 7.8786F, -4.7402F, -0.9502F, 0.8607F, -0.0268F));
		PartDefinition cube_r5 = staff.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(210, 332).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7933F, 8.4786F, -4.1402F, -0.9502F, 0.8607F, -0.0268F));
		PartDefinition cube_r6 = staff.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(332, 282).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2933F, 9.8786F, -0.7402F, -0.9502F, 0.8607F, -0.0268F));
		PartDefinition cube_r7 = staff.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(336, 28).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7933F, 10.4786F, -0.1402F, -0.9502F, 0.8607F, -0.0268F));
		PartDefinition cube_r8 = staff.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(336, 35).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7933F, 10.4786F, 3.8598F, -0.9502F, 0.8607F, -0.0268F));
		PartDefinition cube_r9 = staff.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(332, 290).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2933F, 9.8786F, 3.2598F, -0.9502F, 0.8607F, -0.0268F));
		PartDefinition cube_r10 = staff.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(336, 21).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8067F, 10.4786F, 3.8598F, -0.9502F, -0.8607F, 0.0268F));
		PartDefinition cube_r11 = staff.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(218, 332).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3067F, 9.8786F, 3.2598F, -0.9502F, -0.8607F, 0.0268F));
		PartDefinition cube_r12 = staff.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(214, 332).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3067F, 9.8786F, -0.7402F, -0.9502F, -0.8607F, 0.0268F));
		PartDefinition cube_r13 = staff.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(336, 14).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8067F, 10.4786F, -0.1402F, -0.9502F, -0.8607F, 0.0268F));
		PartDefinition cube_r14 = staff.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(332, 80).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8067F, 8.4786F, -4.1402F, -0.9502F, -0.8607F, 0.0268F));
		PartDefinition cube_r15 = staff.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(332, 88).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3067F, 7.8786F, -4.7402F, -0.9502F, -0.8607F, 0.0268F));
		PartDefinition cube_r16 = staff.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(174, 323).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5067F, -0.1214F, -4.7402F, 0.2019F, -0.6758F, 0.1888F));
		PartDefinition cube_r17 = staff.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(90, 241).addBox(-2.5F, 0.0F, -5.0F, 3.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0933F, 6.9786F, -0.3402F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r18 = staff.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(302, 227).addBox(-2.5F, 0.0F, 0.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(302, 168).addBox(9.3F, 0.0F, 0.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9067F, 2.9786F, -0.3402F, -0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r19 = staff.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(318, 109).addBox(-6.0F, 0.0F, 2.5F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4067F, -7.8214F, 3.4598F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r20 = staff.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(284, 230).addBox(-2.5F, 0.0F, -5.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0933F, -8.5214F, 2.9598F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r21 = staff.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(500, 3).addBox(-4.0F, 1.0F, 2.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4067F, -10.9214F, -5.7402F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r22 = staff.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(500, 0).addBox(0.0F, 1.0F, 2.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3933F, -10.9214F, -5.7402F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r23 = staff.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(488, 0).addBox(-4.0F, 1.0F, 2.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4067F, -11.2214F, -7.7402F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r24 = staff.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(500, 0).addBox(0.0F, 1.0F, 2.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3933F, -11.2214F, -7.7402F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r25 = staff.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(496, 2).addBox(-4.0F, 1.0F, 2.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4067F, -10.4214F, -1.7402F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r26 = staff.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(496, 0).addBox(0.0F, 1.0F, 2.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3933F, -10.4214F, -1.7402F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r27 = staff.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(498, 5).addBox(-4.0F, 1.0F, 2.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4067F, -10.7214F, -3.7402F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r28 = staff.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(500, 0).addBox(0.0F, 1.0F, 2.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3933F, -10.7214F, -3.7402F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r29 = staff.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(500, 4).addBox(-4.0F, 1.0F, 2.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4067F, -10.1214F, 0.2598F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r30 = staff.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(490, 5).addBox(0.0F, 1.0F, 2.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3933F, -10.1214F, 0.2598F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r31 = staff.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(500, 2).addBox(-4.0F, 1.0F, 2.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4067F, -9.8214F, 2.2598F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r32 = staff.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(500, 0).addBox(0.0F, 1.0F, 2.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3933F, -9.8214F, 2.2598F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r33 = staff.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(318, 113).addBox(0.0F, 0.0F, 2.5F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3933F, -7.8214F, 3.4598F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r34 = staff.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(318, 204).addBox(0.0F, -2.0F, 2.5F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3933F, 10.1786F, 3.4598F, 0.0F, 0.0F, -0.5236F));
		PartDefinition cube_r35 = staff.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(318, 168).addBox(-6.0F, -2.0F, 2.5F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4067F, 10.1786F, 3.4598F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r36 = staff.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(290, 303).addBox(-1.5F, -2.1F, -6.65F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(274, 271).addBox(-1.5F, 0.1F, 1.65F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.3067F, -3.3214F, 0.5098F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r37 = staff.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(304, 0).addBox(-1.5F, -0.9936F, -2.4789F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.3067F, -3.3214F, 0.5098F, -0.5236F, 0.0F, 1.5708F));
		PartDefinition cube_r38 = staff.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 15).addBox(-8.5F, 0.1F, -0.35F, 20.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3067F, -1.3214F, -6.4902F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r39 = staff.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(152, 34).addBox(3.5F, -3.9F, -0.35F, 0.0F, 8.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1067F, 8.6786F, -6.4902F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r40 = staff.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(130, 135).addBox(3.5F, -3.9F, -0.35F, 0.0F, 8.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1067F, 6.6786F, -6.4902F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r41 = staff.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(100, 135).addBox(3.5F, -3.9F, -0.35F, 0.0F, 8.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1067F, 2.6786F, -6.4902F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r42 = staff.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 135).addBox(3.5F, -3.9F, -0.35F, 0.0F, 8.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1067F, 4.6786F, -6.4902F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r43 = staff.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(40, 119).addBox(3.5F, 0.1F, -0.35F, 5.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1067F, -4.3214F, -6.4902F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r44 = staff.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(162, 229).addBox(-1.0F, 0.0F, -5.5F, 5.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.4067F, -4.8214F, -0.3402F, 0.0F, 0.0F, 2.2253F));
		PartDefinition cube_r45 = staff.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(194, 229).addBox(-1.0F, 0.0F, -5.5F, 5.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1067F, -3.7214F, -0.3402F, 0.0F, 0.0F, 2.2253F));
		PartDefinition cube_r46 = staff.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(188, 12).addBox(-4.0F, 0.0F, -5.5F, 5.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0933F, -3.7214F, -0.3402F, 0.0F, 0.0F, -2.2253F));
		PartDefinition cube_r47 = staff.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(124, 57).addBox(-4.0F, 0.0F, -5.5F, 5.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.3933F, -4.8214F, -0.3402F, 0.0F, 0.0F, -2.2253F));
		PartDefinition cube_r48 = staff.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(0, 0).addBox(-11.5F, 0.1F, -0.35F, 20.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2933F, -1.3214F, -6.4902F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r49 = staff.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(190, 272).addBox(-1.5F, 0.1F, 1.65F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(202, 303).addBox(-1.5F, -2.1F, -6.65F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2933F, -3.3214F, 0.5098F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r50 = staff.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(218, 303).addBox(-1.5F, -0.9936F, -2.4789F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2933F, -3.3214F, 0.5098F, -0.5236F, 0.0F, -1.5708F));
		PartDefinition cube_r51 = staff.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(324, 4).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0067F, 0.4786F, -5.0402F, 0.2019F, -0.6758F, 0.1888F));
		PartDefinition cube_r52 = staff.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(324, 208).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5067F, 0.8786F, -6.0402F, -0.1309F, -0.4363F, -0.48F));
		PartDefinition cube_r53 = staff.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(226, 316).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4933F, -0.1214F, -4.7402F, 0.2019F, 0.6758F, -0.1888F));
		PartDefinition cube_r54 = staff.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(32, 232).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9933F, 0.4786F, -5.0402F, 0.2019F, 0.6758F, -0.1888F));
		PartDefinition cube_r55 = staff.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(26, 181).addBox(-0.5F, -6.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4933F, 0.8786F, -6.0402F, -0.1309F, 0.4363F, 0.48F));
		PartDefinition cube_r56 = staff.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(290, 15).addBox(-3.0F, -0.0539F, -0.054F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0067F, 10.6786F, 0.3598F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r57 = staff.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(302, 92).addBox(-3.0F, -0.0229F, -0.0276F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0067F, 10.1786F, -3.6402F, 1.4399F, 0.0F, 0.0F));
		PartDefinition cube_r58 = staff.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(306, 164).addBox(-3.0F, -0.0497F, -0.0159F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0067F, 8.1786F, -5.8402F, 0.829F, 0.0F, 0.0F));
		PartDefinition cube_r59 = staff.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(302, 87).addBox(-3.0F, 0.0F, 0.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0067F, 4.3786F, -7.2402F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r60 = staff.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(320, 305).addBox(-6.0F, -3.945F, -0.0003F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0067F, 1.7786F, -7.2402F, 0.9001F, 0.6808F, 0.6707F));
		PartDefinition cube_r61 = staff.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(320, 300).addBox(0.0F, -3.945F, -0.0003F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9933F, 1.7786F, -7.2402F, 0.9001F, -0.6808F, -0.6707F));
		PartDefinition cube_r62 = staff.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(320, 240).addBox(-2.0F, -4.0F, -5.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0067F, -1.2214F, -3.2402F, 0.6545F, 0.0F, 0.0F));
		PartDefinition head = staff.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(-0.0067F, -7.6214F, -6.6402F));
		PartDefinition neck = head.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, 33.0F, 5.0F));
		PartDefinition lowerneck = neck.addOrReplaceChild("lowerneck",
				CubeListBuilder.create().texOffs(286, 120).addBox(-3.0F, 5.225F, -4.3016F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(192, 254).addBox(-3.5F, -2.475F, -4.3016F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(224, 327)
						.addBox(-4.4F, -4.475F, -4.3016F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(328, 4).addBox(-0.4F, -4.475F, -4.3016F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(232, 327)
						.addBox(4.4F, -4.475F, -4.3016F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(240, 327).addBox(0.4F, -4.475F, -4.3016F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -33.225F, -4.6984F, -0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r63 = lowerneck.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(28, 311).addBox(0.0378F, -1.9686F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9F, 4.525F, -1.3016F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r64 = lowerneck.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(58, 311).addBox(-4.0378F, -1.9686F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.9F, 0.525F, -1.3016F, 0.0F, 0.0F, 1.9635F));
		PartDefinition cube_r65 = lowerneck.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(214, 310).addBox(0.0378F, -1.9686F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9F, 0.525F, -1.3016F, 0.0F, 0.0F, -1.9635F));
		PartDefinition cube_r66 = lowerneck.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(310, 266).addBox(-4.0F, -2.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 7.225F, -1.3016F, 0.0F, 0.0F, 0.7418F));
		PartDefinition cube_r67 = lowerneck.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(282, 310).addBox(-4.0378F, -1.9686F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.9F, 4.525F, -1.3016F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r68 = lowerneck.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(306, 221).addBox(0.0F, -2.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 7.225F, -1.3016F, 0.0F, 0.0F, -0.7418F));
		PartDefinition cube_r69 = lowerneck.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(74, 317).addBox(-4.0F, -2.0F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2F, -0.775F, 0.5984F, -0.1719F, -0.0302F, -0.1719F));
		PartDefinition cube_r70 = lowerneck.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(314, 199).addBox(0.0F, -2.0F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, -0.775F, 0.5984F, -0.1719F, 0.0302F, 0.1719F));
		PartDefinition upperneck = lowerneck.addOrReplaceChild("upperneck",
				CubeListBuilder.create().texOffs(286, 126).addBox(-3.0F, 4.4248F, -4.0992F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(320, 172).addBox(-3.0F, 2.4248F, -5.0992F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(178, 320)
						.addBox(-3.0F, -2.5752F, -5.0992F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(298, 188).addBox(-4.0F, -2.5752F, -2.0992F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 337)
						.addBox(3.9F, -0.5752F, -4.4992F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 337).addBox(-5.9F, -0.5752F, -4.4992F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(230, 280)
						.addBox(-3.5F, -3.2752F, -4.0992F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(86, 328).addBox(-4.4F, -5.2752F, -4.0992F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(154, 328)
						.addBox(-0.4F, -5.2752F, -4.0992F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(162, 328).addBox(4.4F, -5.2752F, -4.0992F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(178, 328)
						.addBox(0.4F, -5.2752F, -4.0992F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8001F, -4.2024F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r71 = upperneck.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(314, 193).addBox(0.0378F, -1.9686F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9F, 3.7248F, -1.0992F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r72 = upperneck.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(314, 187).addBox(-4.0378F, -1.9686F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.9F, -0.2752F, -1.0992F, 0.0F, 0.0F, 1.9635F));
		PartDefinition cube_r73 = upperneck.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(178, 314).addBox(0.0378F, -1.9686F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9F, -0.2752F, -1.0992F, 0.0F, 0.0F, -1.9635F));
		PartDefinition cube_r74 = upperneck.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(162, 313).addBox(-4.0F, -2.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 6.4248F, -1.0992F, 0.0F, 0.0F, 0.7418F));
		PartDefinition cube_r75 = upperneck.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(298, 312).addBox(-4.0378F, -1.9686F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.9F, 3.7248F, -1.0992F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r76 = upperneck.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(146, 311).addBox(0.0F, -2.0F, -3.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 6.4248F, -1.0992F, 0.0F, 0.0F, -0.7418F));
		PartDefinition cube_r77 = upperneck.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(90, 318).addBox(0.0F, -2.0F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2F, -2.5752F, 0.8008F, 0.0013F, 0.0302F, 0.1283F));
		PartDefinition cube_r78 = upperneck.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(146, 317).addBox(-4.0F, -2.0F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, -2.5752F, 0.8008F, 0.0013F, -0.0302F, -0.1283F));
		PartDefinition cube_r79 = upperneck.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(50, 213).addBox(-4.2489F, -1.9339F, -1.6825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9248F, -4.3862F, 0.0F, 0.3491F, -0.6109F));
		PartDefinition cube_r80 = upperneck.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(56, 213).addBox(2.2489F, 0.9339F, -1.6825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9248F, -4.3862F, 0.0F, -0.3491F, -0.6109F));
		PartDefinition cube_r81 = upperneck.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(62, 213).addBox(2.2489F, -1.9339F, -1.6825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9248F, -4.3862F, 0.0F, -0.3491F, 0.6109F));
		PartDefinition cube_r82 = upperneck.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(114, 215).addBox(-4.2489F, 0.9339F, -1.6825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.9248F, -4.3862F, 0.0F, 0.3491F, 0.6109F));
		PartDefinition cube_r83 = upperneck.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(38, 213).addBox(2.2489F, -1.9339F, -1.6825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0752F, -4.3862F, 0.0F, -0.3491F, 0.6109F));
		PartDefinition cube_r84 = upperneck.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(44, 213).addBox(-4.2489F, 0.9339F, -1.6825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0752F, -4.3862F, 0.0F, 0.3491F, 0.6109F));
		PartDefinition cube_r85 = upperneck.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(208, 199).addBox(-4.2489F, -1.9339F, -1.6825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0752F, -4.3862F, 0.0F, 0.3491F, -0.6109F));
		PartDefinition cube_r86 = upperneck.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(202, 199).addBox(2.2489F, 0.9339F, -1.6825F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0752F, -4.3862F, 0.0F, -0.3491F, -0.6109F));
		PartDefinition head2 = upperneck.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition jaw = head2.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r87 = jaw.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(328, 208).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1F, 6.7F, -5.0F, -0.0426F, 0.0094F, 0.218F));
		PartDefinition cube_r88 = jaw.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(306, 303).addBox(-1.0F, -4.0F, -6.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8F, 7.0F, -6.0F, -0.1125F, -0.2408F, 0.2812F));
		PartDefinition cube_r89 = jaw.addOrReplaceChild("cube_r89",
				CubeListBuilder.create().texOffs(14, 308).addBox(-1.0F, -4.0F, -6.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(286, 55).addBox(-1.0F, -2.0F, -6.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4F, 6.3F, -6.0F, -0.1125F, -0.2408F, 0.2812F));
		PartDefinition cube_r90 = jaw.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(268, 306).addBox(1.0F, -4.0F, -6.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8F, 7.0F, -6.0F, -0.1125F, 0.2408F, -0.2812F));
		PartDefinition cube_r91 = jaw.addOrReplaceChild("cube_r91",
				CubeListBuilder.create().texOffs(254, 306).addBox(1.0F, -4.0F, -6.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(286, 46).addBox(-1.0F, -2.0F, -6.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4F, 6.3F, -6.0F, -0.1125F, 0.2408F, -0.2812F));
		PartDefinition cube_r92 = jaw.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(328, 212).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6F, 6.3F, -5.0F, -0.0436F, 0.0019F, 0.0436F));
		PartDefinition cube_r93 = jaw.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(328, 320).addBox(-1.0F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6F, 5.4F, -5.0F, -0.0426F, -0.0094F, -0.218F));
		PartDefinition cube_r94 = jaw.addOrReplaceChild("cube_r94",
				CubeListBuilder.create().texOffs(330, 146).addBox(-0.0218F, -2.0202F, -2.8822F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(98, 330).addBox(9.4218F, -2.0202F, -2.8822F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2F, 2.7F, -5.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r95 = jaw.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(278, 328).addBox(0.0F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6F, 5.4F, -5.0F, -0.0426F, 0.0094F, 0.218F));
		PartDefinition cube_r96 = jaw.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(212, 328).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6F, 6.3F, -5.0F, -0.0436F, -0.0019F, -0.0436F));
		PartDefinition cube_r97 = jaw.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(328, 10).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1F, 6.7F, -5.0F, -0.0426F, -0.0094F, -0.218F));
		PartDefinition cube_r98 = jaw.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(286, 24).addBox(-1.0F, -2.0F, -6.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.4F, -6.0F, -0.0436F, 0.0F, 0.0F));
		PartDefinition ruff = head2.addOrReplaceChild("ruff", CubeListBuilder.create(), PartPose.offset(0.0F, 3.2497F, 0.0F));
		PartDefinition cube_r99 = ruff.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(78, 304).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1F, -6.7F, -5.0F, 0.0426F, 0.0094F, -0.218F));
		PartDefinition cube_r100 = ruff.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(118, 308).addBox(-1.0F, 2.0F, -6.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8F, -7.0F, -6.0F, 0.1125F, -0.2408F, -0.2812F));
		PartDefinition cube_r101 = ruff.addOrReplaceChild("cube_r101",
				CubeListBuilder.create().texOffs(104, 301).addBox(0.5F, 0.0F, -3.5F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(44, 269).addBox(-2.5F, -2.0F, -3.5F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8195F, -4.1358F, -8.8136F, 0.0568F, 0.2593F, 0.0568F));
		PartDefinition cube_r102 = ruff.addOrReplaceChild("cube_r102",
				CubeListBuilder.create().texOffs(300, 257).addBox(-0.5F, 0.0F, -3.5F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(158, 23).addBox(-0.5F, -2.0F, -3.5F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8195F, -4.1358F, -8.8136F, 0.0568F, -0.2593F, -0.0568F));
		PartDefinition cube_r103 = ruff.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(44, 308).addBox(1.0F, 2.0F, -6.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8F, -7.0F, -6.0F, 0.1125F, 0.2408F, 0.2812F));
		PartDefinition cube_r104 = ruff.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(328, 271).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6F, -6.3F, -5.0F, 0.0436F, 0.0019F, -0.0436F));
		PartDefinition cube_r105 = ruff.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(28, 329).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6F, -5.4F, -5.0F, 0.0426F, -0.0094F, 0.218F));
		PartDefinition cube_r106 = ruff.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 329).addBox(0.0F, 0.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6F, -5.4F, -5.0F, 0.0426F, 0.0094F, -0.218F));
		PartDefinition cube_r107 = ruff.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(328, 216).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6F, -6.3F, -5.0F, 0.0436F, -0.0019F, 0.0436F));
		PartDefinition cube_r108 = ruff.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(214, 240).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1F, -6.7F, -5.0F, 0.0426F, -0.0094F, 0.218F));
		PartDefinition cube_r109 = ruff.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(322, 221).addBox(-1.0F, 1.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.4F, -6.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r110 = ruff.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(86, 323).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.4F, -5.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r111 = ruff.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(286, 64).addBox(-1.0F, 0.0F, -6.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.4F, -6.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition leftarm = middleplate.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(16.0F, -26.0F, 0.6F));
		PartDefinition shoulder = leftarm.addOrReplaceChild("shoulder", CubeListBuilder.create(), PartPose.offset(-7.0F, 28.0F, 0.0F));
		PartDefinition shouldermain = shoulder.addOrReplaceChild("shouldermain", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition plate = shouldermain.addOrReplaceChild("plate", CubeListBuilder.create().texOffs(70, 180).addBox(-4.0F, -5.0F, -1.122F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -24.0F, -3.878F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r112 = plate.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(302, 38).addBox(-3.0F, 0.0F, 0.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 5.0F, -1.122F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r113 = plate.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(302, 33).addBox(-3.0F, -4.0F, 0.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -5.0F, -1.122F, -0.5236F, 0.0F, 0.0F));
		PartDefinition hing4 = shouldermain.addOrReplaceChild("hing4",
				CubeListBuilder.create().texOffs(374, 309).addBox(-0.5F, -0.9946F, -5.0F, 1.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).texOffs(368, 310).addBox(-0.5F, -5.0F, -0.9946F, 1.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.5F, -23.0F, 1.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition hexadecagon_r1 = hing4.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(381, 278).addBox(7.0F, -5.0F, -0.9946F, 1.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(374, 321).addBox(7.0F, -0.9946F, -5.0F, 1.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r2 = hing4.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(375, 287).addBox(7.0F, -5.0F, -0.9946F, 1.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(374, 297).addBox(7.0F, -0.9946F, -5.0F, 1.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r3 = hing4.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(367, 308).addBox(7.0F, -0.9946F, -5.0F, 1.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r4 = hing4.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(374, 285).addBox(7.0F, -0.9946F, -5.0F, 1.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition left_cords_front = shouldermain.addOrReplaceChild("left_cords_front", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r114 = left_cords_front.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 467).addBox(-0.6035F, -2.1774F, 0.9307F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7397F, -28.0395F, -2.0454F, 2.3171F, 0.1315F, 0.3798F));
		PartDefinition cube_r115 = left_cords_front.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(10, 464).addBox(-0.3965F, -1.7263F, -1.1753F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7397F, -28.0395F, -2.0454F, 1.3571F, 0.1315F, 0.3798F));
		PartDefinition cube_r116 = left_cords_front.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(14, 470).addBox(-0.4867F, -2.1505F, -0.3792F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7397F, -28.0395F, -2.0454F, 1.8371F, 0.1315F, 0.3798F));
		PartDefinition cube_r117 = left_cords_front.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 467).addBox(-0.3965F, -5.2737F, -1.1753F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7397F, -18.9605F, -2.0454F, -1.3895F, -0.04F, 0.186F));
		PartDefinition cube_r118 = left_cords_front.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(5, 457).addBox(-0.4867F, -3.8495F, -0.3792F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7397F, -18.9605F, -2.0454F, -1.8695F, -0.04F, 0.186F));
		PartDefinition cube_r119 = left_cords_front.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(34, 467).addBox(-0.6035F, -1.8226F, 0.9307F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7397F, -18.9605F, -2.0454F, -2.3495F, -0.04F, 0.186F));
		PartDefinition cube_r120 = left_cords_front.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(4, 465).addBox(-0.6035F, -1.8226F, 0.9307F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0397F, -18.9605F, -2.0454F, 1.9735F, 0.4887F, 0.6044F));
		PartDefinition cube_r121 = left_cords_front.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(5, 463).addBox(-0.4867F, -1.8495F, -0.3792F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0397F, -18.9605F, -2.0454F, 2.4535F, 0.4887F, 0.6044F));
		PartDefinition cube_r122 = left_cords_front.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 465).addBox(-0.3965F, -4.2737F, -1.1753F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0397F, -18.9605F, -2.0454F, 2.9334F, 0.4887F, 0.6044F));
		PartDefinition cube_r123 = left_cords_front.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(8, 458).addBox(4.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.8F, -26.5F, -3.4F, -1.7965F, 0.1334F, -0.1129F));
		PartDefinition cube_r124 = left_cords_front.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(0, 465).addBox(4.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.8F, -30.5F, -1.6F, -2.7564F, 0.1334F, -0.1129F));
		PartDefinition cube_r125 = left_cords_front.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(1, 461).addBox(4.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.8F, -28.5F, -2.6F, -2.2765F, 0.1334F, -0.1129F));
		PartDefinition left_cords_back = shouldermain.addOrReplaceChild("left_cords_back", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 1.0F));
		PartDefinition cube_r126 = left_cords_back.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(15, 470).addBox(-0.6035F, -2.1774F, -1.9307F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7397F, -28.0395F, 2.0454F, -0.6292F, -0.367F, -0.165F));
		PartDefinition cube_r127 = left_cords_back.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(6, 462).addBox(-0.3965F, -1.7263F, 0.1753F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7397F, -28.0395F, 2.0454F, 0.3308F, -0.367F, -0.165F));
		PartDefinition cube_r128 = left_cords_back.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(21, 459).addBox(-0.4867F, -2.1505F, -0.6208F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7397F, -28.0395F, 2.0454F, -0.1492F, -0.367F, -0.165F));
		PartDefinition cube_r129 = left_cords_back.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(0, 451).addBox(-0.3965F, -5.2737F, 0.1753F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7397F, -29.2604F, 2.2454F, 1.3895F, 0.04F, 0.186F));
		PartDefinition cube_r130 = left_cords_back.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(7, 451).addBox(-0.4867F, -3.8495F, -0.6208F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7397F, -29.2604F, 2.2454F, 1.8695F, 0.04F, 0.186F));
		PartDefinition cube_r131 = left_cords_back.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(10, 465).addBox(-0.6035F, -1.8226F, -1.9307F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.7397F, -28.5605F, -3.5547F, -2.8865F, 0.04F, 0.186F));
		PartDefinition cube_r132 = left_cords_back.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(2, 461).addBox(4.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.8F, -26.5F, 4.1F, 2.1019F, -0.1334F, -0.1129F));
		PartDefinition cube_r133 = left_cords_back.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(34, 465).addBox(4.0F, -7.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.3F, -30.5F, 1.6F, 3.0182F, -0.1334F, -0.1129F));
		PartDefinition cube_r134 = left_cords_back.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(16, 467).addBox(4.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.8F, -28.5F, 2.6F, 2.6081F, -0.1334F, -0.1129F));
		PartDefinition uper_plate = shouldermain.addOrReplaceChild("uper_plate", CubeListBuilder.create(), PartPose.offset(13.3728F, -31.4281F, 1.0F));
		PartDefinition cube_r135 = uper_plate.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(264, 230).addBox(-4.0F, 1.1505F, 0.9164F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2728F, -1.5737F, 0.0F, 1.0036F, 0.0F, 0.3927F));
		PartDefinition cube_r136 = uper_plate.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(236, 194).addBox(-4.0F, 1.1505F, -1.9164F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2728F, -1.5737F, 0.0F, -1.0036F, 0.0F, 0.3927F));
		PartDefinition cube_r137 = uper_plate.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(8, 446).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5237F, 3.2148F, 0.0F, -1.5708F, 0.0F, 1.1345F));
		PartDefinition cube_r138 = uper_plate.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(154, 323).addBox(-0.0175F, -2.0F, 0.0165F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8272F, -0.9738F, 0.0F, -1.5708F, 0.0F, 1.4835F));
		PartDefinition cube_r139 = uper_plate.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(302, 82).addBox(-4.0F, -2.0F, -0.9981F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2728F, -1.5737F, 0.0F, -1.5708F, 0.0F, 0.3927F));
		PartDefinition back_plate = shouldermain.addOrReplaceChild("back_plate", CubeListBuilder.create(), PartPose.offsetAndRotation(10.2605F, -23.1831F, 5.5462F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r140 = back_plate.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(124, 68).addBox(-4.0F, -5.8469F, 2.337F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2395F, -1.6168F, -0.0127F, 0.5236F, 0.0F, -0.2182F));
		PartDefinition cube_r141 = back_plate.addOrReplaceChild("cube_r141",
				CubeListBuilder.create().texOffs(284, 239).addBox(-4.0F, -5.0F, -0.0335F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(326, 326).addBox(-4.0F, 2.0F, -0.0335F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2395F, -1.6168F, -0.0127F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r142 = back_plate.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(326, 263).addBox(-4.0F, 3.8469F, 2.337F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2395F, -1.6168F, -0.0127F, -0.5236F, 0.0F, -0.2182F));
		PartDefinition cube_r143 = back_plate.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(30, 135).addBox(0.0843F, -2.9835F, -1.0291F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2395F, 3.2831F, 0.9873F, -0.5672F, 0.3747F, -0.4472F));
		PartDefinition lower_plate = shouldermain.addOrReplaceChild("lower_plate", CubeListBuilder.create(), PartPose.offset(11.7898F, -16.9592F, 0.0461F));
		PartDefinition cube_r144 = lower_plate.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(72, 257).addBox(-3.0262F, -2.0F, -1.0867F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4394F, 1.2204F, 2.0209F, -1.5708F, 0.0F, 0.1745F));
		PartDefinition cube_r145 = lower_plate.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(30, 143).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6394F, 0.2204F, 2.0209F, -1.5708F, 0.0F, -0.2182F));
		PartDefinition cube_r146 = lower_plate.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(222, 41).addBox(-1.0175F, 0.0F, 0.0165F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2102F, -0.4427F, -3.0461F, -0.2182F, 0.0F, 1.5708F));
		PartDefinition cube_r147 = lower_plate.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(154, 280).addBox(1.9825F, -2.0F, 0.0165F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2102F, -3.4427F, 0.9539F, -1.5708F, 0.0F, 1.5708F));
		PartDefinition inerplate = shouldermain.addOrReplaceChild("inerplate", CubeListBuilder.create().texOffs(222, 12).addBox(7.5F, -34.8F, -4.5F, 0.0F, 19.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition connected = shouldermain.addOrReplaceChild("connected", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition inger = connected.addOrReplaceChild("inger", CubeListBuilder.create(), PartPose.offset(14.0F, -24.0F, 0.0F));
		PartDefinition platesr2 = inger.addOrReplaceChild("platesr2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.9975F, 5.3248F, 2.9184F, -2.4994F, -0.8084F, 1.4322F));
		PartDefinition hexadecagon_r5 = platesr2.addOrReplaceChild(
				"hexadecagon_r5", CubeListBuilder.create().texOffs(132, 121).addBox(-0.1547F, 0.9671F, -4.7778F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(168, 150)
						.addBox(-0.0011F, -2.6676F, -5.1408F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(130, 87).addBox(0.1195F, -3.9326F, -5.4116F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4064F, -4.1212F, 6.6336F, 0.1302F, -1.0381F, -0.9113F));
		PartDefinition hexadecagon_r6 = platesr2.addOrReplaceChild(
				"hexadecagon_r6", CubeListBuilder.create().texOffs(250, 291).addBox(-0.501F, -2.6976F, -3.0025F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(78, 309)
						.addBox(-0.5549F, 0.9371F, -2.7027F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(264, 291).addBox(-0.446F, -3.9367F, -3.2992F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1688F, -2.3489F, 6.6954F, 2.7675F, -1.3893F, 2.7111F));
		PartDefinition hexadecagon_r7 = platesr2.addOrReplaceChild("hexadecagon_r7",
				CubeListBuilder.create().texOffs(58, 243).addBox(3.5322F, -3.9354F, -5.1963F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(70, 15).addBox(-7.7631F, -2.6698F, -7.0129F, 11.0F, 0.0F, 15.0F, new CubeDeformation(0.0F))
						.texOffs(70, 0).addBox(-7.7631F, 1.3302F, -7.0129F, 11.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(214, 246).addBox(3.2369F, -2.6698F, -5.0129F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(260, 247)
						.addBox(2.8437F, 0.9654F, -4.833F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7495F, -4.756F, -0.08F, 0.0F, 0.0F, -0.7418F));
		PartDefinition hexadecagon_r8 = platesr2.addOrReplaceChild("hexadecagon_r8",
				CubeListBuilder.create().texOffs(242, 315).addBox(-0.363F, -2.6325F, -2.4435F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(254, 315).addBox(-0.6369F, -1.3675F, -2.5565F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3652F, -6.8393F, -5.6178F, -0.4794F, 1.0968F, -1.2773F));
		PartDefinition hexadecagon_r9 = platesr2.addOrReplaceChild("hexadecagon_r9", CubeListBuilder.create().texOffs(320, 95).addBox(-0.2804F, 0.9502F, -0.095F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4515F, -4.057F, -6.632F, -0.0383F, 1.111F, -0.78F));
		PartDefinition hexadecagon_r10 = platesr2.addOrReplaceChild(
				"hexadecagon_r10", CubeListBuilder.create().texOffs(174, 292).addBox(-0.4694F, -2.7006F, -3.0071F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(132, 312)
						.addBox(-0.6834F, 0.9341F, -3.1869F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(224, 292).addBox(-0.2512F, -3.9139F, -2.7362F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3509F, -2.2958F, -5.589F, -2.5978F, 1.1351F, 2.9775F));
		PartDefinition hexadecagon_r11 = platesr2.addOrReplaceChild(
				"hexadecagon_r11", CubeListBuilder.create().texOffs(120, 291).addBox(2.4523F, -3.7128F, -6.9388F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(90, 299)
						.addBox(2.2341F, -2.4996F, -7.2097F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(308, 292).addBox(2.0202F, 1.1351F, -7.3896F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.26F, 5.2586F, -4.6959F, -2.8798F, 1.309F, -3.1416F));
		PartDefinition hexadecagon_r12 = platesr2.addOrReplaceChild(
				"hexadecagon_r12", CubeListBuilder.create().texOffs(314, 246).addBox(1.9607F, -3.7646F, -2.0347F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(106, 310)
						.addBox(1.6867F, -2.4996F, -2.1477F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(320, 81).addBox(1.3828F, 1.1351F, -2.3559F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.26F, 5.2586F, -4.6959F, -0.612F, 1.4539F, -0.862F));
		PartDefinition hexadecagon_r13 = platesr2.addOrReplaceChild(
				"hexadecagon_r13", CubeListBuilder.create().texOffs(0, 243).addBox(2.9662F, -3.7915F, -1.6805F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(242, 24)
						.addBox(2.6709F, -2.526F, -1.497F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 257).addBox(2.2777F, 1.1092F, -1.3171F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.26F, 5.2586F, -4.6959F, -0.0692F, 0.2527F, -0.2706F));
		PartDefinition hexadecagon_r14 = platesr2.addOrReplaceChild("hexadecagon_r14", CubeListBuilder.create().texOffs(308, 284).addBox(-1.0389F, -1.5694F, 0.0653F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2808F, 8.2137F, 6.8181F, 0.0F, -1.5708F, -0.2618F));
		PartDefinition cords2 = platesr2.addOrReplaceChild("cords2", CubeListBuilder.create(), PartPose.offset(-21.9975F, 19.6752F, -0.9184F));
		PartDefinition hexadecagon_r15 = cords2.addOrReplaceChild("hexadecagon_r15", CubeListBuilder.create().texOffs(4, 469).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.3149F, -20.3972F, -3.8946F, 0.0F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r16 = cords2.addOrReplaceChild("hexadecagon_r16", CubeListBuilder.create().texOffs(0, 460).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.8149F, -18.4972F, 7.1946F, -0.2332F, -1.4524F, -0.1081F));
		PartDefinition hexadecagon_r17 = cords2.addOrReplaceChild("hexadecagon_r17", CubeListBuilder.create().texOffs(20, 461).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.8149F, -19.7972F, 6.5946F, 1.0227F, -1.3484F, -1.3765F));
		PartDefinition hexadecagon_r18 = cords2.addOrReplaceChild("hexadecagon_r18", CubeListBuilder.create().texOffs(0, 460).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.7149F, -20.3972F, 6.5946F, -0.8875F, -1.5167F, 0.9308F));
		PartDefinition hexadecagon_r19 = cords2.addOrReplaceChild("hexadecagon_r19", CubeListBuilder.create().texOffs(0, 464).addBox(-0.5F, -7.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.7149F, -19.4972F, 5.4946F, 1.3717F, -1.3484F, -1.3765F));
		PartDefinition hexadecagon_r20 = cords2.addOrReplaceChild("hexadecagon_r20", CubeListBuilder.create().texOffs(0, 456).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.8149F, -18.4972F, -5.1946F, 0.2332F, 1.4524F, -0.1081F));
		PartDefinition hexadecagon_r21 = cords2.addOrReplaceChild("hexadecagon_r21", CubeListBuilder.create().texOffs(16, 459).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.5149F, -18.4972F, -4.4946F, 0.2332F, 1.4524F, -0.1081F));
		PartDefinition hexadecagon_r22 = cords2.addOrReplaceChild("hexadecagon_r22", CubeListBuilder.create().texOffs(4, 466).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.7149F, -20.3972F, -4.5946F, -1.4154F, 1.3484F, -1.3765F));
		PartDefinition hexadecagon_r23 = cords2.addOrReplaceChild("hexadecagon_r23", CubeListBuilder.create().texOffs(0, 464).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.7149F, -19.4972F, -3.4946F, -1.3717F, 1.3484F, -1.3765F));
		PartDefinition hexadecagon_r24 = cords2.addOrReplaceChild("hexadecagon_r24", CubeListBuilder.create().texOffs(8, 466).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.8149F, -19.7972F, -4.5946F, -1.0227F, 1.3484F, -1.3765F));
		PartDefinition hexadecagon_r25 = cords2.addOrReplaceChild("hexadecagon_r25", CubeListBuilder.create().texOffs(0, 458).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.4149F, -20.3972F, -2.5946F, 0.3491F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r26 = cords2.addOrReplaceChild("hexadecagon_r26", CubeListBuilder.create().texOffs(4, 458).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.7149F, -20.3972F, -2.8946F, -0.2182F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r27 = cords2.addOrReplaceChild("hexadecagon_r27", CubeListBuilder.create().texOffs(8, 458).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.3149F, -20.3972F, -0.5946F, -0.0436F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r28 = cords2.addOrReplaceChild("hexadecagon_r28", CubeListBuilder.create().texOffs(12, 459).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.5149F, -20.3972F, -0.5946F, 0.3491F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r29 = cords2.addOrReplaceChild("hexadecagon_r29", CubeListBuilder.create().texOffs(0, 462).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.4149F, -20.3972F, 1.8054F, 0.5236F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r30 = cords2.addOrReplaceChild("hexadecagon_r30", CubeListBuilder.create().texOffs(0, 462).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.2149F, -20.3972F, 3.8054F, -0.0436F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r31 = cords2.addOrReplaceChild("hexadecagon_r31", CubeListBuilder.create().texOffs(2, 461).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.4149F, -20.3972F, 3.8054F, 0.3491F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r32 = cords2.addOrReplaceChild("hexadecagon_r32", CubeListBuilder.create().texOffs(0, 461).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.9149F, -20.3972F, 2.5054F, 0.3491F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r33 = cords2.addOrReplaceChild("hexadecagon_r33", CubeListBuilder.create().texOffs(4, 462).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.3149F, -20.3972F, 0.5054F, 0.0F, 0.0F, -0.2182F));
		PartDefinition hing5 = platesr2.addOrReplaceChild("hing5",
				CubeListBuilder.create().texOffs(-1, 426).addBox(-5.5F, -0.9946F, -5.0F, 13.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).texOffs(13, 444).addBox(-5.5F, -5.0F, -0.9946F, 13.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7531F, 0.7506F, 0.0816F, 0.0F, 0.0F, 1.3526F));
		PartDefinition hexadecagon_r34 = hing5.addOrReplaceChild("hexadecagon_r34",
				CubeListBuilder.create().texOffs(33, 444).addBox(-2.0F, -5.0F, -0.9946F, 13.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(-1, 440).addBox(-2.0F, -0.9946F, -5.0F, 13.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r35 = hing5.addOrReplaceChild("hexadecagon_r35",
				CubeListBuilder.create().texOffs(-1, 444).addBox(-2.0F, -5.0F, -0.9946F, 13.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(1, 446).addBox(-2.0F, -0.9946F, -5.0F, 13.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r36 = hing5.addOrReplaceChild("hexadecagon_r36", CubeListBuilder.create().texOffs(-1, 425).addBox(-2.0F, -0.9946F, -5.0F, 13.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r37 = hing5.addOrReplaceChild("hexadecagon_r37", CubeListBuilder.create().texOffs(6, 446).addBox(-2.0F, -0.9946F, -5.0F, 13.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone2 = hing5.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1172F, -3.8609F, -0.2646F, 0.0F, 0.0F, -0.8727F));
		PartDefinition bicep = inger.addOrReplaceChild("bicep", CubeListBuilder.create(), PartPose.offsetAndRotation(8.2F, 6.9F, 1.0F, 0.0F, 0.9163F, 0.0F));
		PartDefinition bicepmain = bicep.addOrReplaceChild("bicepmain", CubeListBuilder.create(), PartPose.offset(0.8F, -0.9F, 1.0F));
		PartDefinition hing8 = bicepmain.addOrReplaceChild("hing8",
				CubeListBuilder.create().texOffs(0, 434).addBox(-4.5F, -0.9946F, -5.0F, 9.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).texOffs(10, 446).addBox(-4.5F, -5.0F, -0.9946F, 9.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5149F, 9.1028F, -1.0F, 0.0F, 0.0F, 1.309F));
		PartDefinition hexadecagon_r38 = hing8.addOrReplaceChild("hexadecagon_r38",
				CubeListBuilder.create().texOffs(22, 446).addBox(7.0F, -5.0F, -0.9946F, 9.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(0, 450).addBox(7.0F, -0.9946F, -5.0F, 9.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.5F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r39 = hing8.addOrReplaceChild("hexadecagon_r39",
				CubeListBuilder.create().texOffs(0, 445).addBox(7.0F, -5.0F, -0.9946F, 9.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(2, 440).addBox(7.0F, -0.9946F, -5.0F, 9.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.5F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r40 = hing8.addOrReplaceChild("hexadecagon_r40", CubeListBuilder.create().texOffs(0, 452).addBox(7.0F, -0.9946F, -5.0F, 9.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r41 = hing8.addOrReplaceChild("hexadecagon_r41", CubeListBuilder.create().texOffs(0, 436).addBox(7.0F, -0.9946F, -5.0F, 9.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.5F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition platesr = bicepmain.addOrReplaceChild("platesr", CubeListBuilder.create(), PartPose.offset(6.1975F, 5.2248F, -1.0816F));
		PartDefinition hexadecagon_r42 = platesr.addOrReplaceChild(
				"hexadecagon_r42", CubeListBuilder.create().texOffs(132, 121).addBox(-0.1547F, 0.9671F, -4.7778F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(168, 150)
						.addBox(-0.0011F, -2.6676F, -5.1408F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(130, 87).addBox(0.1195F, -3.9326F, -5.4116F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4064F, -4.1212F, 6.6336F, 0.1302F, -1.0381F, -0.9113F));
		PartDefinition hexadecagon_r43 = platesr.addOrReplaceChild(
				"hexadecagon_r43", CubeListBuilder.create().texOffs(250, 291).addBox(-0.1004F, -2.6676F, -0.3895F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(78, 309)
						.addBox(-0.1544F, 0.9671F, -0.0897F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(264, 291).addBox(-0.0454F, -3.9068F, -0.6862F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4064F, -4.1212F, 6.6336F, 0.3539F, -1.3793F, -1.1469F));
		PartDefinition hexadecagon_r44 = platesr.addOrReplaceChild("hexadecagon_r44",
				CubeListBuilder.create().texOffs(58, 243).addBox(3.5322F, -3.9354F, -5.1963F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(70, 15).addBox(-7.7631F, -2.6698F, -7.0129F, 11.0F, 0.0F, 15.0F, new CubeDeformation(0.0F))
						.texOffs(70, 0).addBox(-7.7631F, 1.3302F, -7.0129F, 11.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(214, 246).addBox(3.2369F, -2.6698F, -5.0129F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(260, 247)
						.addBox(2.8437F, 0.9654F, -4.833F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7495F, -4.756F, -0.08F, 0.0F, 0.0F, -0.7418F));
		PartDefinition hexadecagon_r45 = platesr.addOrReplaceChild(
				"hexadecagon_r45", CubeListBuilder.create().texOffs(242, 315).addBox(0.2975F, -3.9495F, 0.2262F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(320, 95)
						.addBox(-0.2804F, 0.9502F, -0.095F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(254, 315).addBox(0.0236F, -2.6845F, 0.1132F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4515F, -4.057F, -6.632F, -0.0383F, 1.111F, -0.78F));
		PartDefinition hexadecagon_r46 = platesr.addOrReplaceChild(
				"hexadecagon_r46", CubeListBuilder.create().texOffs(174, 292).addBox(-0.102F, -2.6845F, -5.654F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(132, 312)
						.addBox(-0.316F, 0.9502F, -5.8338F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(224, 292).addBox(0.1162F, -3.8977F, -5.3831F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4515F, -4.057F, -6.632F, -0.1529F, 1.4591F, -0.8977F));
		PartDefinition hexadecagon_r47 = platesr.addOrReplaceChild("hexadecagon_r47", CubeListBuilder.create().texOffs(120, 291).addBox(-1.0404F, -3.552F, -6.3103F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2113F, 5.2659F, -7.0886F, 0.0F, 1.5708F, -0.2618F));
		PartDefinition hexadecagon_r48 = platesr.addOrReplaceChild("hexadecagon_r48", CubeListBuilder.create().texOffs(314, 246).addBox(-0.8818F, -3.0673F, -5.202F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4935F, 3.5631F, -5.1836F, 0.0F, 1.2217F, -0.2618F));
		PartDefinition hexadecagon_r49 = platesr.addOrReplaceChild("hexadecagon_r49", CubeListBuilder.create().texOffs(134, 291).addBox(-1.0404F, -3.552F, 0.0679F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1113F, 5.2659F, 6.9287F, 0.0F, -1.5708F, -0.2618F));
		PartDefinition hexadecagon_r50 = platesr.addOrReplaceChild("hexadecagon_r50", CubeListBuilder.create().texOffs(0, 243).addBox(-4.6414F, 1.202F, -5.1963F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.916F, -1.5338F, -0.08F, 0.0F, 0.0F, -0.2618F));
		PartDefinition hexadecagon_r51 = platesr.addOrReplaceChild("hexadecagon_r51", CubeListBuilder.create().texOffs(314, 255).addBox(-0.8818F, -3.0673F, 0.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4935F, 3.5631F, 5.0236F, 0.0F, -1.2217F, -0.2618F));
		PartDefinition hexadecagon_r52 = platesr.addOrReplaceChild("hexadecagon_r52", CubeListBuilder.create().texOffs(106, 291).addBox(-1.0396F, -3.5608F, 0.0666F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1464F, 6.5485F, 6.8728F, 0.0F, -1.5708F, -0.2618F));
		PartDefinition hexadecagon_r53 = platesr.addOrReplaceChild("hexadecagon_r53", CubeListBuilder.create().texOffs(238, 292).addBox(-0.8841F, -3.0856F, 0.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5407F, 4.8791F, 5.0052F, 0.0F, -1.2217F, -0.2618F));
		PartDefinition hexadecagon_r54 = platesr.addOrReplaceChild("hexadecagon_r54", CubeListBuilder.create().texOffs(242, 24).addBox(-4.57F, 1.1F, -5.0945F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.9157F, -0.1179F, 0.0016F, 0.0F, 0.0F, -0.2618F));
		PartDefinition hexadecagon_r55 = platesr.addOrReplaceChild("hexadecagon_r55", CubeListBuilder.create().texOffs(106, 310).addBox(-0.8841F, -3.0856F, -5.1F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5407F, 4.8791F, -5.0019F, 0.0F, 1.2217F, -0.2618F));
		PartDefinition hexadecagon_r56 = platesr.addOrReplaceChild("hexadecagon_r56", CubeListBuilder.create().texOffs(90, 299).addBox(-1.0396F, -3.5608F, -6.1866F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1464F, 6.5485F, -6.8696F, 0.0F, 1.5708F, -0.2618F));
		PartDefinition hexadecagon_r57 = platesr.addOrReplaceChild("hexadecagon_r57", CubeListBuilder.create().texOffs(308, 292).addBox(-1.0389F, -1.5694F, -6.0653F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2808F, 8.2137F, -6.6549F, 0.0F, 1.5708F, -0.2618F));
		PartDefinition hexadecagon_r58 = platesr.addOrReplaceChild("hexadecagon_r58", CubeListBuilder.create().texOffs(320, 81).addBox(-0.8864F, -1.1035F, -5.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.589F, 6.577F, -4.8238F, 0.0F, 1.2217F, -0.2618F));
		PartDefinition hexadecagon_r59 = platesr.addOrReplaceChild("hexadecagon_r59", CubeListBuilder.create().texOffs(308, 284).addBox(-1.0389F, -1.5694F, 0.0653F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2808F, 8.2137F, 6.8181F, 0.0F, -1.5708F, -0.2618F));
		PartDefinition hexadecagon_r60 = platesr.addOrReplaceChild("hexadecagon_r60", CubeListBuilder.create().texOffs(320, 59).addBox(-0.8864F, -1.1035F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.589F, 6.577F, 4.987F, 0.0F, -1.2217F, -0.2618F));
		PartDefinition hexadecagon_r61 = platesr.addOrReplaceChild("hexadecagon_r61", CubeListBuilder.create().texOffs(0, 257).addBox(-4.5F, 3.0F, -4.9946F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.9174F, 1.678F, 0.0816F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cords = platesr.addOrReplaceChild("cords", CubeListBuilder.create(), PartPose.offset(-21.9975F, 19.6752F, -0.9184F));
		PartDefinition hexadecagon_r62 = cords.addOrReplaceChild("hexadecagon_r62", CubeListBuilder.create().texOffs(4, 469).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.3149F, -20.3972F, -3.8946F, 0.0F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r63 = cords.addOrReplaceChild("hexadecagon_r63", CubeListBuilder.create().texOffs(16, 461).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.5149F, -18.4972F, 6.4946F, -1.2305F, -1.2192F, 0.9071F));
		PartDefinition hexadecagon_r64 = cords.addOrReplaceChild("hexadecagon_r64", CubeListBuilder.create().texOffs(0, 460).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.8149F, -18.4972F, 7.1946F, -0.2332F, -1.4524F, -0.1081F));
		PartDefinition hexadecagon_r65 = cords.addOrReplaceChild("hexadecagon_r65", CubeListBuilder.create().texOffs(20, 461).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.8149F, -19.7972F, 6.5946F, 1.0227F, -1.3484F, -1.3765F));
		PartDefinition hexadecagon_r66 = cords.addOrReplaceChild("hexadecagon_r66", CubeListBuilder.create().texOffs(0, 460).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.7149F, -20.3972F, 6.5946F, -0.8875F, -1.5167F, 0.9308F));
		PartDefinition hexadecagon_r67 = cords.addOrReplaceChild("hexadecagon_r67", CubeListBuilder.create().texOffs(0, 464).addBox(-0.5F, -7.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.7149F, -19.4972F, 5.4946F, 1.3717F, -1.3484F, -1.3765F));
		PartDefinition hexadecagon_r68 = cords.addOrReplaceChild("hexadecagon_r68", CubeListBuilder.create().texOffs(0, 456).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.8149F, -18.4972F, -5.1946F, 0.2332F, 1.4524F, -0.1081F));
		PartDefinition hexadecagon_r69 = cords.addOrReplaceChild("hexadecagon_r69", CubeListBuilder.create().texOffs(16, 459).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.5149F, -18.4972F, -4.4946F, 0.2332F, 1.4524F, -0.1081F));
		PartDefinition hexadecagon_r70 = cords.addOrReplaceChild("hexadecagon_r70", CubeListBuilder.create().texOffs(4, 466).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.7149F, -20.3972F, -4.5946F, -1.4154F, 1.3484F, -1.3765F));
		PartDefinition hexadecagon_r71 = cords.addOrReplaceChild("hexadecagon_r71", CubeListBuilder.create().texOffs(0, 464).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.7149F, -19.4972F, -3.4946F, -1.3717F, 1.3484F, -1.3765F));
		PartDefinition hexadecagon_r72 = cords.addOrReplaceChild("hexadecagon_r72", CubeListBuilder.create().texOffs(8, 466).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.8149F, -19.7972F, -4.5946F, -1.0227F, 1.3484F, -1.3765F));
		PartDefinition hexadecagon_r73 = cords.addOrReplaceChild("hexadecagon_r73", CubeListBuilder.create().texOffs(0, 458).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.4149F, -20.3972F, -2.5946F, 0.3491F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r74 = cords.addOrReplaceChild("hexadecagon_r74", CubeListBuilder.create().texOffs(4, 458).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.7149F, -20.3972F, -2.8946F, -0.2182F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r75 = cords.addOrReplaceChild("hexadecagon_r75", CubeListBuilder.create().texOffs(8, 458).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.3149F, -20.3972F, -0.5946F, -0.0436F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r76 = cords.addOrReplaceChild("hexadecagon_r76", CubeListBuilder.create().texOffs(12, 459).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.5149F, -20.3972F, -0.5946F, 0.3491F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r77 = cords.addOrReplaceChild("hexadecagon_r77", CubeListBuilder.create().texOffs(0, 462).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.4149F, -20.3972F, 1.8054F, 0.5236F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r78 = cords.addOrReplaceChild("hexadecagon_r78", CubeListBuilder.create().texOffs(0, 462).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.2149F, -20.3972F, 3.8054F, -0.0436F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r79 = cords.addOrReplaceChild("hexadecagon_r79", CubeListBuilder.create().texOffs(2, 461).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.4149F, -20.3972F, 3.8054F, 0.3491F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r80 = cords.addOrReplaceChild("hexadecagon_r80", CubeListBuilder.create().texOffs(0, 461).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.9149F, -20.3972F, 2.5054F, 0.3491F, 0.0F, -0.2182F));
		PartDefinition hexadecagon_r81 = cords.addOrReplaceChild("hexadecagon_r81", CubeListBuilder.create().texOffs(4, 462).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.3149F, -20.3972F, 0.5054F, 0.0F, 0.0F, -0.2182F));
		PartDefinition hing3 = bicepmain.addOrReplaceChild("hing3",
				CubeListBuilder.create().texOffs(0, 426).addBox(-4.5F, -0.9946F, -5.0F, 8.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).texOffs(14, 444).addBox(-4.5F, -5.0F, -0.9946F, 8.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4443F, 4.9754F, -1.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition hexadecagon_r82 = hing3.addOrReplaceChild("hexadecagon_r82",
				CubeListBuilder.create().texOffs(34, 444).addBox(-1.0F, -5.0F, -0.9946F, 8.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(0, 440).addBox(-1.0F, -0.9946F, -5.0F, 8.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r83 = hing3.addOrReplaceChild("hexadecagon_r83",
				CubeListBuilder.create().texOffs(0, 444).addBox(-1.0F, -5.0F, -0.9946F, 8.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).texOffs(2, 446).addBox(-1.0F, -0.9946F, -5.0F, 8.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r84 = hing3.addOrReplaceChild("hexadecagon_r84", CubeListBuilder.create().texOffs(0, 425).addBox(-1.0F, -0.9946F, -5.0F, 8.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r85 = hing3.addOrReplaceChild("hexadecagon_r85", CubeListBuilder.create().texOffs(7, 446).addBox(-1.0F, -0.9946F, -5.0F, 8.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone = hing3.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.1172F, -3.8609F, -0.2646F, 0.0F, 0.0F, -0.8727F));
		PartDefinition hexadecagon_r86 = bone.addOrReplaceChild("hexadecagon_r86", CubeListBuilder.create().texOffs(44, 422).addBox(-0.3604F, -2.9375F, -1.4598F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3108F, 1.4667F, 4.5671F, 0.3539F, -1.3793F, -1.1469F));
		PartDefinition hexadecagon_r87 = bone.addOrReplaceChild("hexadecagon_r87", CubeListBuilder.create().texOffs(45, 418).addBox(-0.2499F, -2.9549F, -3.6258F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3108F, 1.5667F, 4.8671F, 0.1302F, -1.0381F, -0.9113F));
		PartDefinition hexadecagon_r88 = bone.addOrReplaceChild("hexadecagon_r88", CubeListBuilder.create().texOffs(44, 413).addBox(2.0366F, -2.9567F, -3.4815F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7509F, 1.0414F, 0.069F, 0.0F, 0.0F, -0.7418F));
		PartDefinition hexadecagon_r89 = bone.addOrReplaceChild("hexadecagon_r89", CubeListBuilder.create().texOffs(46, 409).addBox(-0.1307F, -2.9662F, 0.1516F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2806F, 1.5097F, -4.3209F, -0.0383F, 1.111F, -0.78F));
		PartDefinition hexadecagon_r90 = bone.addOrReplaceChild("hexadecagon_r90", CubeListBuilder.create().texOffs(41, 421).addBox(-0.2521F, -2.9315F, -3.6067F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2806F, 1.5097F, -4.3209F, -0.1529F, 1.4591F, -0.8977F));
		PartDefinition closetobodycore = bicepmain.addOrReplaceChild("closetobodycore", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7505F, 12.7707F, -0.9989F, 0.0F, 0.0F, -3.1416F));
		PartDefinition hexadecagon_r91 = closetobodycore.addOrReplaceChild("hexadecagon_r91", CubeListBuilder.create().texOffs(264, 0).addBox(-4.5F, 3.0F, -4.9946F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.2644F, -3.8679F, 0.0989F, 0.0F, 0.0F, -0.2618F));
		PartDefinition hexadecagon_r92 = closetobodycore.addOrReplaceChild("hexadecagon_r92", CubeListBuilder.create().texOffs(36, 329).addBox(-0.8864F, -1.1035F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.936F, 1.0311F, 5.0044F, 0.0F, -0.9599F, -0.2618F));
		PartDefinition hexadecagon_r93 = closetobodycore.addOrReplaceChild("hexadecagon_r93", CubeListBuilder.create().texOffs(320, 102).addBox(0.0387F, -0.9871F, -5.8526F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6721F, 3.7688F, -0.0516F, 0.0111F, 0.7548F, -0.9496F));
		PartDefinition hexadecagon_r94 = closetobodycore.addOrReplaceChild("hexadecagon_r94", CubeListBuilder.create().texOffs(264, 24).addBox(-0.0163F, -1.0129F, -4.844F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6721F, 3.7688F, -0.0516F, 0.0081F, 0.013F, -0.9571F));
		PartDefinition hexadecagon_r95 = closetobodycore.addOrReplaceChild("hexadecagon_r95", CubeListBuilder.create().texOffs(320, 122).addBox(0.8097F, -0.9871F, 2.1081F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.6721F, 3.7688F, -0.0516F, 0.0138F, -0.9469F, -0.9684F));
		PartDefinition hexadecagon_r96 = closetobodycore.addOrReplaceChild("hexadecagon_r96", CubeListBuilder.create().texOffs(44, 329).addBox(-0.8864F, -1.1035F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.936F, 1.0311F, -4.8065F, 0.0F, 0.7418F, -0.2618F));
		PartDefinition hexadecagon_r97 = closetobodycore.addOrReplaceChild("hexadecagon_r97", CubeListBuilder.create().texOffs(256, 206).addBox(-0.8864F, -1.1035F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.836F, -0.9689F, -4.8065F, 0.0F, 0.7418F, -0.2618F));
		PartDefinition hexadecagon_r98 = closetobodycore.addOrReplaceChild("hexadecagon_r98", CubeListBuilder.create().texOffs(260, 259).addBox(-4.5F, 3.0F, -4.9946F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.1644F, -5.8679F, 0.0989F, 0.0F, 0.0F, -0.2618F));
		PartDefinition hexadecagon_r99 = closetobodycore.addOrReplaceChild("hexadecagon_r99", CubeListBuilder.create().texOffs(14, 294).addBox(-0.8864F, -1.1035F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.836F, -0.9689F, 5.0044F, 0.0F, -0.6545F, -0.2618F));
		PartDefinition hand = bicepmain.addOrReplaceChild("hand", CubeListBuilder.create(), PartPose.offset(8.2F, 12.9F, -2.0F));
		PartDefinition main = hand.addOrReplaceChild("main",
				CubeListBuilder.create().texOffs(58, 227).addBox(21.0F, -11.0F, -4.0F, 6.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(194, 314).addBox(27.5F, -9.0F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(334, 174)
						.addBox(27.5F, -9.0F, 1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(334, 241).addBox(27.5F, -9.0F, 3.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 253)
						.addBox(27.5F, -9.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(302, 211).addBox(27.0F, -8.0F, -3.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 304)
						.addBox(27.0F, -8.0F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(338, 245).addBox(27.0F, -8.0F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(338, 249)
						.addBox(27.0F, -8.0F, 4.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-24.0F, 12.0F, 0.0F));
		PartDefinition cube_r148 = main.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(120, 215).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.95F, -9.2F, -4.25F, 0.0F, 1.5708F, 0.2618F));
		PartDefinition cube_r149 = main.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(214, 199).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.35F, -10.0F, -4.25F, 0.0F, 1.5708F, 0.2618F));
		PartDefinition cube_r150 = main.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(334, 305).addBox(-0.25F, -1.75F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.75F, -7.25F, -4.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r151 = main.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(334, 298).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.25F, -11.0F, -3.85F, 0.0F, 1.5708F, -0.829F));
		PartDefinition cube_r152 = main.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(282, 334).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.25F, -9.0F, -3.85F, 0.0F, 1.5708F, -0.829F));
		PartDefinition pipe = main.addOrReplaceChild("pipe", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r153 = pipe.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(41, 420).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.55F, -9.7F, 2.75F, 2.0508F, 0.9599F, 1.1781F));
		PartDefinition pipe2 = main.addOrReplaceChild("pipe2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r154 = pipe2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(43, 425).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.25F, -9.0F, 0.15F, 0.0F, 1.5708F, -0.829F));
		PartDefinition pipe3 = main.addOrReplaceChild("pipe3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r155 = pipe3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(47, 425).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.25F, -9.0F, -1.95F, 0.0F, 1.5708F, -0.6545F));
		PartDefinition pipe4 = main.addOrReplaceChild("pipe4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r156 = pipe4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(43, 422).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.15F, -9.0F, -3.25F, 0.0F, 1.5708F, -0.3927F));
		PartDefinition pipe5 = main.addOrReplaceChild("pipe5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r157 = pipe5.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(46, 421).addBox(-0.5F, -3.0F, 1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.2F, -9.2F, 4.2F, -0.2788F, -0.1725F, 0.1411F));
		PartDefinition pipe6 = main.addOrReplaceChild("pipe6", CubeListBuilder.create(), PartPose.offset(27.2F, -8.4F, 4.2F));
		PartDefinition cube_r158 = pipe6.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(162, 294).addBox(-0.5F, -3.0F, -2.5F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.4415F, -0.2915F, -0.0987F));
		PartDefinition pipe7 = main.addOrReplaceChild("pipe7", CubeListBuilder.create().texOffs(150, 190).addBox(-0.5F, -5.0F, -2.5F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(27.5F, -9.0F, -1.5F));
		PartDefinition fingercontrol = main.addOrReplaceChild("fingercontrol", CubeListBuilder.create().texOffs(236, 246).addBox(-0.8333F, 0.0F, -5.0333F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(25.8333F, -5.0F, 1.0333F));
		PartDefinition cube_r159 = fingercontrol.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(74, 311).addBox(-0.75F, -0.75F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0833F, -2.25F, 4.5667F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r160 = fingercontrol.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(62, 298).addBox(-0.75F, -0.75F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0833F, -2.25F, -5.0333F, 0.0F, 1.5708F, 0.0F));
		PartDefinition finger = fingercontrol.addOrReplaceChild("finger", CubeListBuilder.create().texOffs(174, 288).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1667F, 3.0F, -4.2333F, 0.0F, 0.48F, 0.0F));
		PartDefinition cube_r161 = finger.addOrReplaceChild("cube_r161",
				CubeListBuilder.create().texOffs(318, 208).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(254, 38).addBox(-1.0F, -1.0F, -1.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tip2 = finger.addOrReplaceChild("tip2", CubeListBuilder.create(), PartPose.offset(-26.0F, 4.0F, 3.0F));
		PartDefinition cube_r162 = tip2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(44, 266).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(26.0F, -2.0F, -2.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r163 = tip2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(338, 7).addBox(0.0F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.8F, -1.4F, -2.9F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r164 = tip2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(264, 158).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.7F, -1.8F, -3.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r165 = tip2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(122, 336).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(26.2F, -2.2F, -3.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition finger2 = fingercontrol.addOrReplaceChild("finger2", CubeListBuilder.create().texOffs(282, 306).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1667F, 3.0F, -1.2333F));
		PartDefinition cube_r166 = finger2.addOrReplaceChild("cube_r166",
				CubeListBuilder.create().texOffs(336, 295).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(336, 163).addBox(-1.0F, -1.0F, -1.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tip3 = finger2.addOrReplaceChild("tip3", CubeListBuilder.create(), PartPose.offset(-26.0F, 4.0F, 3.0F));
		PartDefinition cube_r167 = tip3.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(298, 33).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(26.0F, -2.0F, -2.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r168 = tip3.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(8, 338).addBox(0.0F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.8F, -1.4F, -2.9F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r169 = tip3.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(286, 9).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.7F, -1.8F, -3.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r170 = tip3.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(336, 127).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(26.2F, -2.2F, -3.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition finger3 = fingercontrol.addOrReplaceChild("finger3", CubeListBuilder.create().texOffs(330, 151).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1667F, 3.0F, 1.6667F));
		PartDefinition cube_r171 = finger3.addOrReplaceChild("cube_r171",
				CubeListBuilder.create().texOffs(58, 338).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 338).addBox(-1.0F, -1.0F, -1.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tip4 = finger3.addOrReplaceChild("tip4", CubeListBuilder.create(), PartPose.offset(-26.0F, 4.0F, 3.0F));
		PartDefinition cube_r172 = tip4.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(302, 117).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(26.0F, -2.0F, -2.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r173 = tip4.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(338, 100).addBox(0.0F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.8F, -1.4F, -2.9F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r174 = tip4.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(298, 227).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.7F, -1.8F, -3.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r175 = tip4.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(336, 131).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(26.2F, -2.2F, -3.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition finger4 = fingercontrol.addOrReplaceChild("finger4", CubeListBuilder.create().texOffs(332, 67).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1667F, 3.0F, 4.4667F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r176 = finger4.addOrReplaceChild("cube_r176",
				CubeListBuilder.create().texOffs(338, 108).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(338, 105).addBox(-1.0F, -1.0F, -1.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tip5 = finger4.addOrReplaceChild("tip5", CubeListBuilder.create(), PartPose.offset(-26.0F, 4.0F, 3.0F));
		PartDefinition cube_r177 = tip5.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(58, 308).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(26.0F, -2.0F, -2.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r178 = tip5.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(338, 111).addBox(0.0F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.8F, -1.4F, -2.9F, 0.0F, 0.0F, -0.0436F));
		PartDefinition cube_r179 = tip5.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(302, 155).addBox(0.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(25.7F, -1.8F, -3.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r180 = tip5.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(336, 178).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(26.2F, -2.2F, -3.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition thumcontrol = main.addOrReplaceChild("thumcontrol", CubeListBuilder.create().texOffs(290, 318).addBox(-0.3893F, -1.7895F, -2.4F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(20.3893F, -5.2105F, -1.6F));
		PartDefinition cube_r181 = thumcontrol.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(336, 42).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1107F, 0.2895F, -0.1F, 0.8198F, -0.0072F, 0.1847F));
		PartDefinition thum = thumcontrol.addOrReplaceChild("thum", CubeListBuilder.create().texOffs(9, 449).addBox(-1.2213F, -1.421F, -1.2F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6107F, 2.3105F, -0.5F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r182 = thum.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(336, 116).addBox(-0.5F, -0.8852F, -0.7228F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2213F, 0.879F, -0.2F, 0.3927F, 0.0F, 0.0F));
		PartDefinition tip = thum.addOrReplaceChild("tip", CubeListBuilder.create().texOffs(182, 278).addBox(0.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.2213F, 1.579F, -0.2F));
		PartDefinition rightarm = middleplate.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offset(2.0F, -26.0F, 0.6F));
		PartDefinition shoulder2 = rightarm.addOrReplaceChild("shoulder2", CubeListBuilder.create(), PartPose.offset(7.0F, 28.0F, 0.0F));
		PartDefinition shouldermain2 = shoulder2.addOrReplaceChild("shouldermain2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition plate2 = shouldermain2.addOrReplaceChild("plate2", CubeListBuilder.create().texOffs(70, 180).mirror().addBox(-4.0F, -5.0F, -1.122F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-9.0F, -24.0F, -3.878F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r183 = plate2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(302, 38).mirror().addBox(-5.0F, 0.0F, 0.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 5.0F, -1.122F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r184 = plate2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(302, 33).mirror().addBox(-5.0F, -4.0F, 0.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, -5.0F, -1.122F, -0.5236F, 0.0F, 0.0F));
		PartDefinition hing6 = shouldermain2.addOrReplaceChild("hing6", CubeListBuilder.create().texOffs(374, 309).mirror().addBox(-0.5F, -0.9946F, -5.0F, 1.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(368, 310).mirror()
				.addBox(-0.5F, -5.0F, -0.9946F, 1.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-13.5F, -23.0F, 1.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition hexadecagon_r100 = hing6.addOrReplaceChild("hexadecagon_r100", CubeListBuilder.create().texOffs(381, 278).mirror().addBox(-8.0F, -5.0F, -0.9946F, 1.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).mirror(false).texOffs(374, 321)
				.mirror().addBox(-8.0F, -0.9946F, -5.0F, 1.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.5F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r101 = hing6.addOrReplaceChild("hexadecagon_r101", CubeListBuilder.create().texOffs(375, 287).mirror().addBox(-8.0F, -5.0F, -0.9946F, 1.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).mirror(false).texOffs(374, 297)
				.mirror().addBox(-8.0F, -0.9946F, -5.0F, 1.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.5F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r102 = hing6.addOrReplaceChild("hexadecagon_r102", CubeListBuilder.create().texOffs(367, 308).mirror().addBox(-8.0F, -0.9946F, -5.0F, 1.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r103 = hing6.addOrReplaceChild("hexadecagon_r103", CubeListBuilder.create().texOffs(374, 285).mirror().addBox(-8.0F, -0.9946F, -5.0F, 1.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.5F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition right_cords_front = shouldermain2.addOrReplaceChild("right_cords_front", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r185 = right_cords_front.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 467).mirror().addBox(-0.3965F, -2.1774F, 0.9307F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.7397F, -28.0395F, -2.0454F, 2.3171F, -0.1315F, -0.3798F));
		PartDefinition cube_r186 = right_cords_front.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(10, 464).mirror().addBox(-0.6035F, -1.7263F, -1.1753F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.7397F, -28.0395F, -2.0454F, 1.3571F, -0.1315F, -0.3798F));
		PartDefinition cube_r187 = right_cords_front.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(14, 470).mirror().addBox(-0.5133F, -2.1505F, -0.3792F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.7397F, -28.0395F, -2.0454F, 1.8371F, -0.1315F, -0.3798F));
		PartDefinition cube_r188 = right_cords_front.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 467).mirror().addBox(-0.6035F, -5.2737F, -1.1753F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.7397F, -18.9605F, -2.0454F, -1.3895F, 0.04F, -0.186F));
		PartDefinition cube_r189 = right_cords_front.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(5, 457).mirror().addBox(-0.5133F, -3.8495F, -0.3792F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.7397F, -18.9605F, -2.0454F, -1.8695F, 0.04F, -0.186F));
		PartDefinition cube_r190 = right_cords_front.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(34, 467).mirror().addBox(-0.3965F, -1.8226F, 0.9307F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.7397F, -18.9605F, -2.0454F, -2.3495F, 0.04F, -0.186F));
		PartDefinition cube_r191 = right_cords_front.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(4, 465).mirror().addBox(-0.3965F, -1.8226F, 0.9307F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.0397F, -18.9605F, -2.0454F, 1.9735F, -0.4887F, -0.6044F));
		PartDefinition cube_r192 = right_cords_front.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(5, 463).mirror().addBox(-0.5133F, -1.8495F, -0.3792F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.0397F, -18.9605F, -2.0454F, 2.4535F, -0.4887F, -0.6044F));
		PartDefinition cube_r193 = right_cords_front.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(0, 465).mirror().addBox(-0.6035F, -4.2737F, -1.1753F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.0397F, -18.9605F, -2.0454F, 2.9334F, -0.4887F, -0.6044F));
		PartDefinition cube_r194 = right_cords_front.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(8, 458).mirror().addBox(-5.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.8F, -26.5F, -3.4F, -1.7965F, -0.1334F, 0.1129F));
		PartDefinition cube_r195 = right_cords_front.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 465).mirror().addBox(-5.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.8F, -30.5F, -1.6F, -2.7564F, -0.1334F, 0.1129F));
		PartDefinition cube_r196 = right_cords_front.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(1, 461).mirror().addBox(-5.0F, -4.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.8F, -28.5F, -2.6F, -2.2765F, -0.1334F, 0.1129F));
		PartDefinition right_cords_back = shouldermain2.addOrReplaceChild("right_cords_back", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 1.0F));
		PartDefinition cube_r197 = right_cords_back.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(15, 470).mirror().addBox(-0.3965F, -2.1774F, -1.9307F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.7397F, -28.0395F, 2.0454F, -0.6292F, 0.367F, 0.165F));
		PartDefinition cube_r198 = right_cords_back.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(6, 462).mirror().addBox(-0.6035F, -1.7263F, 0.1753F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.7397F, -28.0395F, 2.0454F, 0.3308F, 0.367F, 0.165F));
		PartDefinition cube_r199 = right_cords_back.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(21, 459).mirror().addBox(-0.5133F, -2.1505F, -0.6208F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-10.7397F, -28.0395F, 2.0454F, -0.1492F, 0.367F, 0.165F));
		PartDefinition cube_r200 = right_cords_back.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(0, 451).mirror().addBox(-0.6035F, -5.2737F, 0.1753F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.7397F, -29.2604F, 2.2454F, 1.3895F, -0.04F, -0.186F));
		PartDefinition cube_r201 = right_cords_back.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(7, 451).mirror().addBox(-0.5133F, -3.8495F, -0.6208F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.7397F, -29.2604F, 2.2454F, 1.8695F, -0.04F, -0.186F));
		PartDefinition cube_r202 = right_cords_back.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(10, 465).mirror().addBox(-0.3965F, -1.8226F, -1.9307F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.7397F, -28.5605F, -3.5547F, -2.8865F, -0.04F, -0.186F));
		PartDefinition cube_r203 = right_cords_back.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(2, 461).mirror().addBox(-5.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.8F, -26.5F, 4.1F, 2.1019F, 0.1334F, 0.1129F));
		PartDefinition cube_r204 = right_cords_back.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(34, 465).mirror().addBox(-5.0F, -7.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-9.3F, -30.5F, 1.6F, 3.0182F, 0.1334F, 0.1129F));
		PartDefinition cube_r205 = right_cords_back.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(16, 467).mirror().addBox(-5.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.8F, -28.5F, 2.6F, 2.6081F, 0.1334F, 0.1129F));
		PartDefinition uper_plate2 = shouldermain2.addOrReplaceChild("uper_plate2", CubeListBuilder.create(), PartPose.offset(-13.3728F, -31.4281F, 1.0F));
		PartDefinition cube_r206 = uper_plate2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(264, 230).mirror().addBox(-4.0F, 1.1505F, 0.9164F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2728F, -1.5737F, 0.0F, 1.0036F, 0.0F, -0.3927F));
		PartDefinition cube_r207 = uper_plate2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(236, 194).mirror().addBox(-4.0F, 1.1505F, -1.9164F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2728F, -1.5737F, 0.0F, -1.0036F, 0.0F, -0.3927F));
		PartDefinition cube_r208 = uper_plate2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(8, 446).mirror().addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.5237F, 3.2148F, 0.0F, -1.5708F, 0.0F, -1.1345F));
		PartDefinition cube_r209 = uper_plate2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(154, 323).mirror().addBox(-3.9825F, -2.0F, 0.0165F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.8272F, -0.9738F, 0.0F, -1.5708F, 0.0F, -1.4835F));
		PartDefinition cube_r210 = uper_plate2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(302, 82).mirror().addBox(-4.0F, -2.0F, -0.9981F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2728F, -1.5737F, 0.0F, -1.5708F, 0.0F, -0.3927F));
		PartDefinition back_plate2 = shouldermain2.addOrReplaceChild("back_plate2", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.2605F, -23.1831F, 5.5462F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r211 = back_plate2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(124, 68).mirror().addBox(-3.0F, -5.8469F, 2.337F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.2395F, -1.6168F, -0.0127F, 0.5236F, 0.0F, 0.2182F));
		PartDefinition cube_r212 = back_plate2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(284, 239).mirror().addBox(-4.0F, -5.0F, -0.0335F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(326, 326).mirror()
				.addBox(0.0F, 2.0F, -0.0335F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2395F, -1.6168F, -0.0127F, 0.0F, 0.0F, 0.2182F));
		PartDefinition cube_r213 = back_plate2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(326, 263).mirror().addBox(0.0F, 3.8469F, 2.337F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.2395F, -1.6168F, -0.0127F, -0.5236F, 0.0F, 0.2182F));
		PartDefinition cube_r214 = back_plate2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(30, 135).mirror().addBox(-4.0843F, -2.9835F, -1.0291F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.2395F, 3.2831F, 0.9873F, -0.5672F, -0.3747F, 0.4472F));
		PartDefinition lower_plate2 = shouldermain2.addOrReplaceChild("lower_plate2", CubeListBuilder.create(), PartPose.offset(-11.7898F, -16.9592F, 0.0461F));
		PartDefinition cube_r215 = lower_plate2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(72, 257).mirror().addBox(0.0262F, -2.0F, -1.0867F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.4394F, 1.2204F, 2.0209F, -1.5708F, 0.0F, -0.1745F));
		PartDefinition cube_r216 = lower_plate2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(30, 143).mirror().addBox(-2.0F, -2.0F, -0.5F, 4.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.6394F, 0.2204F, 2.0209F, -1.5708F, 0.0F, 0.2182F));
		PartDefinition cube_r217 = lower_plate2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(222, 41).mirror().addBox(-0.9825F, 0.0F, 0.0165F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.2102F, -0.4427F, -3.0461F, -0.2182F, 0.0F, -1.5708F));
		PartDefinition cube_r218 = lower_plate2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(154, 280).mirror().addBox(-3.9825F, -2.0F, 0.0165F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.2102F, -3.4427F, 0.9539F, -1.5708F, 0.0F, -1.5708F));
		PartDefinition inerplate2 = shouldermain2.addOrReplaceChild("inerplate2", CubeListBuilder.create().texOffs(222, 12).mirror().addBox(-7.5F, -34.8F, -4.5F, 0.0F, 19.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition connected2 = shouldermain2.addOrReplaceChild("connected2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition inger2 = connected2.addOrReplaceChild("inger2", CubeListBuilder.create(), PartPose.offset(-13.0F, -25.0F, 4.0F));
		PartDefinition platesr3 = inger2.addOrReplaceChild("platesr3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.9975F, 6.3248F, -1.0816F, -2.4994F, 0.8084F, -1.4322F));
		PartDefinition hexadecagon_r104 = platesr3.addOrReplaceChild("hexadecagon_r104",
				CubeListBuilder.create().texOffs(132, 121).mirror().addBox(-0.8453F, 0.9671F, -4.7778F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(168, 150).mirror()
						.addBox(-0.9989F, -2.6676F, -5.1408F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(130, 87).mirror().addBox(-1.1195F, -3.9326F, -5.4116F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.4064F, -4.1212F, 6.6336F, 0.1302F, 1.0381F, 0.9113F));
		PartDefinition hexadecagon_r105 = platesr3.addOrReplaceChild("hexadecagon_r105",
				CubeListBuilder.create().texOffs(250, 291).mirror().addBox(-0.499F, -2.6976F, -3.0025F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 309).mirror()
						.addBox(-0.4451F, 0.9371F, -2.7027F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(264, 291).mirror().addBox(-0.554F, -3.9367F, -3.2992F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.1688F, -2.3489F, 6.6954F, 2.7675F, 1.3893F, -2.7111F));
		PartDefinition hexadecagon_r106 = platesr3.addOrReplaceChild("hexadecagon_r106",
				CubeListBuilder.create().texOffs(58, 243).mirror().addBox(-4.5322F, -3.9354F, -5.1963F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 15).mirror()
						.addBox(-3.2369F, -2.6698F, -7.0129F, 11.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 0).mirror().addBox(-3.2369F, 1.3302F, -7.0129F, 11.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(214, 246).mirror().addBox(-4.2369F, -2.6698F, -5.0129F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(260, 247).mirror()
						.addBox(-3.8437F, 0.9654F, -4.833F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.7495F, -4.756F, -0.08F, 0.0F, 0.0F, 0.7418F));
		PartDefinition hexadecagon_r107 = platesr3.addOrReplaceChild("hexadecagon_r107", CubeListBuilder.create().texOffs(242, 315).mirror().addBox(-0.637F, -2.6325F, -2.4435F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(254, 315).mirror().addBox(-0.3631F, -1.3675F, -2.5565F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3652F, -6.8393F, -5.6178F, -0.4794F, -1.0968F, 1.2773F));
		PartDefinition hexadecagon_r108 = platesr3.addOrReplaceChild("hexadecagon_r108", CubeListBuilder.create().texOffs(320, 95).mirror().addBox(-0.7196F, 0.9502F, -0.095F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.4515F, -4.057F, -6.632F, -0.0383F, -1.111F, 0.78F));
		PartDefinition hexadecagon_r109 = platesr3.addOrReplaceChild("hexadecagon_r109",
				CubeListBuilder.create().texOffs(174, 292).mirror().addBox(-0.5306F, -2.7006F, -3.0071F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(132, 312).mirror()
						.addBox(-0.3166F, 0.9341F, -3.1869F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(224, 292).mirror().addBox(-0.7488F, -3.9139F, -2.7362F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.3509F, -2.2958F, -5.589F, -2.5978F, -1.1351F, -2.9775F));
		PartDefinition hexadecagon_r110 = platesr3.addOrReplaceChild("hexadecagon_r110",
				CubeListBuilder.create().texOffs(120, 291).mirror().addBox(-3.4523F, -3.7128F, -6.9388F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(90, 299).mirror()
						.addBox(-3.2341F, -2.4996F, -7.2097F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(308, 292).mirror().addBox(-3.0202F, 1.1351F, -7.3896F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.26F, 5.2586F, -4.6959F, -2.8798F, -1.309F, 3.1416F));
		PartDefinition hexadecagon_r111 = platesr3.addOrReplaceChild("hexadecagon_r111",
				CubeListBuilder.create().texOffs(314, 246).mirror().addBox(-2.9607F, -3.7646F, -2.0347F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(106, 310).mirror()
						.addBox(-2.6867F, -2.4996F, -2.1477F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(320, 81).mirror().addBox(-2.3828F, 1.1351F, -2.3559F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.26F, 5.2586F, -4.6959F, -0.612F, -1.4539F, 0.862F));
		PartDefinition hexadecagon_r112 = platesr3.addOrReplaceChild("hexadecagon_r112",
				CubeListBuilder.create().texOffs(0, 243).mirror().addBox(-3.9662F, -3.7915F, -1.6805F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(242, 24).mirror()
						.addBox(-3.6709F, -2.526F, -1.497F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 257).mirror().addBox(-3.2777F, 1.1092F, -1.3171F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.26F, 5.2586F, -4.6959F, -0.0692F, -0.2527F, 0.2706F));
		PartDefinition hexadecagon_r113 = platesr3.addOrReplaceChild("hexadecagon_r113", CubeListBuilder.create().texOffs(308, 284).mirror().addBox(0.0389F, -1.5694F, 0.0653F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.2808F, 8.2137F, 6.8181F, 0.0F, 1.5708F, 0.2618F));
		PartDefinition cords3 = platesr3.addOrReplaceChild("cords3", CubeListBuilder.create(), PartPose.offset(21.9975F, 19.6752F, -0.9184F));
		PartDefinition hexadecagon_r114 = cords3.addOrReplaceChild("hexadecagon_r114", CubeListBuilder.create().texOffs(4, 469).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-25.3149F, -20.3972F, -3.8946F, 0.0F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r115 = cords3.addOrReplaceChild("hexadecagon_r115", CubeListBuilder.create().texOffs(0, 460).mirror().addBox(-0.5F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-18.8149F, -18.4972F, 7.1946F, -0.2332F, 1.4524F, 0.1081F));
		PartDefinition hexadecagon_r116 = cords3.addOrReplaceChild("hexadecagon_r116", CubeListBuilder.create().texOffs(20, 461).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-19.8149F, -19.7972F, 6.5946F, 1.0227F, 1.3484F, 1.3765F));
		PartDefinition hexadecagon_r117 = cords3.addOrReplaceChild("hexadecagon_r117", CubeListBuilder.create().texOffs(0, 460).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-21.7149F, -20.3972F, 6.5946F, -0.8875F, 1.5167F, -0.9308F));
		PartDefinition hexadecagon_r118 = cords3.addOrReplaceChild("hexadecagon_r118", CubeListBuilder.create().texOffs(0, 464).mirror().addBox(-0.5F, -7.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-22.7149F, -19.4972F, 5.4946F, 1.3717F, 1.3484F, 1.3765F));
		PartDefinition hexadecagon_r119 = cords3.addOrReplaceChild("hexadecagon_r119", CubeListBuilder.create().texOffs(0, 456).mirror().addBox(-0.5F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-18.8149F, -18.4972F, -5.1946F, 0.2332F, -1.4524F, 0.1081F));
		PartDefinition hexadecagon_r120 = cords3.addOrReplaceChild("hexadecagon_r120", CubeListBuilder.create().texOffs(16, 459).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-17.5149F, -18.4972F, -4.4946F, 0.2332F, -1.4524F, 0.1081F));
		PartDefinition hexadecagon_r121 = cords3.addOrReplaceChild("hexadecagon_r121", CubeListBuilder.create().texOffs(4, 466).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-21.7149F, -20.3972F, -4.5946F, -1.4154F, -1.3484F, 1.3765F));
		PartDefinition hexadecagon_r122 = cords3.addOrReplaceChild("hexadecagon_r122", CubeListBuilder.create().texOffs(0, 464).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-22.7149F, -19.4972F, -3.4946F, -1.3717F, -1.3484F, 1.3765F));
		PartDefinition hexadecagon_r123 = cords3.addOrReplaceChild("hexadecagon_r123", CubeListBuilder.create().texOffs(8, 466).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-19.8149F, -19.7972F, -4.5946F, -1.0227F, -1.3484F, 1.3765F));
		PartDefinition hexadecagon_r124 = cords3.addOrReplaceChild("hexadecagon_r124", CubeListBuilder.create().texOffs(0, 458).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-23.4149F, -20.3972F, -2.5946F, 0.3491F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r125 = cords3.addOrReplaceChild("hexadecagon_r125", CubeListBuilder.create().texOffs(4, 458).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-25.7149F, -20.3972F, -2.8946F, -0.2182F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r126 = cords3.addOrReplaceChild("hexadecagon_r126", CubeListBuilder.create().texOffs(8, 458).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-23.3149F, -20.3972F, -0.5946F, -0.0436F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r127 = cords3.addOrReplaceChild("hexadecagon_r127", CubeListBuilder.create().texOffs(12, 459).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-25.5149F, -20.3972F, -0.5946F, 0.3491F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r128 = cords3.addOrReplaceChild("hexadecagon_r128", CubeListBuilder.create().texOffs(0, 462).mirror().addBox(-0.5F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-25.4149F, -20.3972F, 1.8054F, 0.5236F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r129 = cords3.addOrReplaceChild("hexadecagon_r129", CubeListBuilder.create().texOffs(0, 462).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-25.2149F, -20.3972F, 3.8054F, -0.0436F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r130 = cords3.addOrReplaceChild("hexadecagon_r130", CubeListBuilder.create().texOffs(2, 461).mirror().addBox(-0.5F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-24.4149F, -20.3972F, 3.8054F, 0.3491F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r131 = cords3.addOrReplaceChild("hexadecagon_r131", CubeListBuilder.create().texOffs(0, 461).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-23.9149F, -20.3972F, 2.5054F, 0.3491F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r132 = cords3.addOrReplaceChild("hexadecagon_r132", CubeListBuilder.create().texOffs(4, 462).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-24.3149F, -20.3972F, 0.5054F, 0.0F, 0.0F, 0.2182F));
		PartDefinition hing7 = inger2.addOrReplaceChild("hing7", CubeListBuilder.create().texOffs(-1, 426).mirror().addBox(-7.5F, -0.9946F, -5.0F, 13.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(13, 444).mirror()
				.addBox(-7.5F, -5.0F, -0.9946F, 13.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2443F, 4.0754F, -3.0F, 0.0F, 0.0F, -0.6545F));
		PartDefinition hexadecagon_r133 = hing7.addOrReplaceChild("hexadecagon_r133", CubeListBuilder.create().texOffs(33, 444).mirror().addBox(-11.0F, -5.0F, -0.9946F, 13.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).mirror(false).texOffs(-1, 440)
				.mirror().addBox(-11.0F, -0.9946F, -5.0F, 13.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.5F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r134 = hing7.addOrReplaceChild("hexadecagon_r134", CubeListBuilder.create().texOffs(-1, 444).mirror().addBox(-11.0F, -5.0F, -0.9946F, 13.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 446)
				.mirror().addBox(-11.0F, -0.9946F, -5.0F, 13.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.5F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r135 = hing7.addOrReplaceChild("hexadecagon_r135", CubeListBuilder.create().texOffs(-1, 425).mirror().addBox(-11.0F, -0.9946F, -5.0F, 13.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r136 = hing7.addOrReplaceChild("hexadecagon_r136", CubeListBuilder.create().texOffs(6, 446).mirror().addBox(-11.0F, -0.9946F, -5.0F, 13.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone3 = hing7.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1172F, -3.8609F, -0.2646F, 0.0F, 0.0F, 0.8727F));
		PartDefinition bicep2 = inger2.addOrReplaceChild("bicep2", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.2F, 7.9F, -3.0F, 0.0F, -0.9163F, 0.0F));
		PartDefinition bicepmain2 = bicep2.addOrReplaceChild("bicepmain2", CubeListBuilder.create(), PartPose.offset(15.0F, 24.0F, -1.0F));
		PartDefinition hing9 = bicepmain2.addOrReplaceChild("hing9", CubeListBuilder.create().texOffs(0, 434).mirror().addBox(-4.5F, -0.9946F, -5.0F, 9.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(10, 446).mirror()
				.addBox(-4.5F, -5.0F, -0.9946F, 9.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-20.3149F, -15.7972F, 1.0F, 0.0F, 0.0F, -1.309F));
		PartDefinition hexadecagon_r137 = hing9.addOrReplaceChild("hexadecagon_r137", CubeListBuilder.create().texOffs(22, 446).mirror().addBox(-16.0F, -5.0F, -0.9946F, 9.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 450)
				.mirror().addBox(-16.0F, -0.9946F, -5.0F, 9.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(11.5F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r138 = hing9.addOrReplaceChild("hexadecagon_r138", CubeListBuilder.create().texOffs(0, 445).mirror().addBox(-16.0F, -5.0F, -0.9946F, 9.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 440)
				.mirror().addBox(-16.0F, -0.9946F, -5.0F, 9.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(11.5F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r139 = hing9.addOrReplaceChild("hexadecagon_r139", CubeListBuilder.create().texOffs(0, 452).mirror().addBox(-16.0F, -0.9946F, -5.0F, 9.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(11.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r140 = hing9.addOrReplaceChild("hexadecagon_r140", CubeListBuilder.create().texOffs(0, 436).mirror().addBox(-16.0F, -0.9946F, -5.0F, 9.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(11.5F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition platesr4 = bicepmain2.addOrReplaceChild("platesr4", CubeListBuilder.create(), PartPose.offset(-22.0166F, -19.6752F, -0.042F));
		PartDefinition hexadecagon_r141 = platesr4.addOrReplaceChild("hexadecagon_r141",
				CubeListBuilder.create().texOffs(132, 121).mirror().addBox(-0.8453F, 0.9671F, -4.7778F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(168, 150).mirror()
						.addBox(-0.9989F, -2.6676F, -5.1408F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(130, 87).mirror().addBox(-1.1195F, -3.9326F, -5.4116F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.4064F, -4.1212F, 6.6336F, 0.1302F, 1.0381F, 0.9113F));
		PartDefinition hexadecagon_r142 = platesr4.addOrReplaceChild("hexadecagon_r142",
				CubeListBuilder.create().texOffs(250, 291).mirror().addBox(-0.8996F, -2.6676F, -0.3895F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 309).mirror()
						.addBox(-0.8456F, 0.9671F, -0.0897F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(264, 291).mirror().addBox(-0.9546F, -3.9068F, -0.6862F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.4064F, -4.1212F, 6.6336F, 0.3539F, 1.3793F, 1.1469F));
		PartDefinition hexadecagon_r143 = platesr4.addOrReplaceChild("hexadecagon_r143",
				CubeListBuilder.create().texOffs(58, 243).mirror().addBox(-4.5322F, -3.9354F, -5.1963F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 15).mirror()
						.addBox(-3.2369F, -2.6698F, -7.0128F, 11.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(70, 0).mirror().addBox(-3.2369F, 1.3302F, -7.0128F, 11.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(214, 246).mirror().addBox(-4.2369F, -2.6698F, -5.0128F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(260, 247).mirror()
						.addBox(-3.8437F, 0.9654F, -4.833F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.7495F, -4.756F, -0.08F, 0.0F, 0.0F, 0.7418F));
		PartDefinition hexadecagon_r144 = platesr4.addOrReplaceChild("hexadecagon_r144",
				CubeListBuilder.create().texOffs(242, 315).mirror().addBox(-1.2975F, -3.9495F, 0.2262F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(320, 95).mirror()
						.addBox(-0.7196F, 0.9502F, -0.095F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(254, 315).mirror().addBox(-1.0236F, -2.6845F, 0.1132F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.4515F, -4.057F, -6.632F, -0.0383F, -1.111F, 0.78F));
		PartDefinition hexadecagon_r145 = platesr4.addOrReplaceChild("hexadecagon_r145",
				CubeListBuilder.create().texOffs(174, 292).mirror().addBox(-0.898F, -2.6845F, -5.654F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(132, 312).mirror()
						.addBox(-0.684F, 0.9502F, -5.8338F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(224, 292).mirror().addBox(-1.1162F, -3.8977F, -5.3831F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.4515F, -4.057F, -6.632F, -0.1529F, -1.4591F, 0.8977F));
		PartDefinition hexadecagon_r146 = platesr4.addOrReplaceChild("hexadecagon_r146", CubeListBuilder.create().texOffs(120, 291).mirror().addBox(0.0404F, -3.552F, -6.3103F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.2113F, 5.2659F, -7.0887F, 0.0F, -1.5708F, 0.2618F));
		PartDefinition hexadecagon_r147 = platesr4.addOrReplaceChild("hexadecagon_r147", CubeListBuilder.create().texOffs(314, 246).mirror().addBox(-0.1182F, -3.0673F, -5.202F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.4935F, 3.5631F, -5.1836F, 0.0F, -1.2217F, 0.2618F));
		PartDefinition hexadecagon_r148 = platesr4.addOrReplaceChild("hexadecagon_r148", CubeListBuilder.create().texOffs(134, 291).mirror().addBox(0.0404F, -3.552F, 0.0679F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.1113F, 5.2659F, 6.9287F, 0.0F, 1.5708F, 0.2618F));
		PartDefinition hexadecagon_r149 = platesr4.addOrReplaceChild("hexadecagon_r149", CubeListBuilder.create().texOffs(0, 243).mirror().addBox(3.6414F, 1.202F, -5.1963F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.916F, -1.5338F, -0.08F, 0.0F, 0.0F, 0.2618F));
		PartDefinition hexadecagon_r150 = platesr4.addOrReplaceChild("hexadecagon_r150", CubeListBuilder.create().texOffs(314, 255).mirror().addBox(-0.1182F, -3.0673F, 0.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.4935F, 3.5631F, 5.0236F, 0.0F, 1.2217F, 0.2618F));
		PartDefinition hexadecagon_r151 = platesr4.addOrReplaceChild("hexadecagon_r151", CubeListBuilder.create().texOffs(106, 291).mirror().addBox(0.0396F, -3.5608F, 0.0666F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.1464F, 6.5485F, 6.8728F, 0.0F, 1.5708F, 0.2618F));
		PartDefinition hexadecagon_r152 = platesr4.addOrReplaceChild("hexadecagon_r152", CubeListBuilder.create().texOffs(238, 292).mirror().addBox(-0.1159F, -3.0856F, 0.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.5407F, 4.8791F, 5.0052F, 0.0F, 1.2217F, 0.2618F));
		PartDefinition hexadecagon_r153 = platesr4.addOrReplaceChild("hexadecagon_r153", CubeListBuilder.create().texOffs(242, 24).mirror().addBox(3.57F, 1.1F, -5.0944F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.9157F, -0.1179F, 0.0016F, 0.0F, 0.0F, 0.2618F));
		PartDefinition hexadecagon_r154 = platesr4.addOrReplaceChild("hexadecagon_r154", CubeListBuilder.create().texOffs(106, 310).mirror().addBox(-0.1159F, -3.0856F, -5.1F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.5407F, 4.8791F, -5.0019F, 0.0F, -1.2217F, 0.2618F));
		PartDefinition hexadecagon_r155 = platesr4.addOrReplaceChild("hexadecagon_r155", CubeListBuilder.create().texOffs(90, 299).mirror().addBox(0.0396F, -3.5608F, -6.1866F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.1464F, 6.5485F, -6.8696F, 0.0F, -1.5708F, 0.2618F));
		PartDefinition hexadecagon_r156 = platesr4.addOrReplaceChild("hexadecagon_r156", CubeListBuilder.create().texOffs(308, 292).mirror().addBox(0.0389F, -1.5694F, -6.0653F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.2808F, 8.2137F, -6.6549F, 0.0F, -1.5708F, 0.2618F));
		PartDefinition hexadecagon_r157 = platesr4.addOrReplaceChild("hexadecagon_r157", CubeListBuilder.create().texOffs(320, 81).mirror().addBox(-0.1136F, -1.1035F, -5.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.589F, 6.577F, -4.8238F, 0.0F, -1.2217F, 0.2618F));
		PartDefinition hexadecagon_r158 = platesr4.addOrReplaceChild("hexadecagon_r158", CubeListBuilder.create().texOffs(308, 284).mirror().addBox(0.0389F, -1.5694F, 0.0653F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.2808F, 8.2137F, 6.8181F, 0.0F, 1.5708F, 0.2618F));
		PartDefinition hexadecagon_r159 = platesr4.addOrReplaceChild("hexadecagon_r159", CubeListBuilder.create().texOffs(320, 59).mirror().addBox(-0.1136F, -1.1035F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.589F, 6.577F, 4.987F, 0.0F, 1.2217F, 0.2618F));
		PartDefinition hexadecagon_r160 = platesr4.addOrReplaceChild("hexadecagon_r160", CubeListBuilder.create().texOffs(0, 257).mirror().addBox(3.5F, 3.0F, -4.9946F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.9174F, 1.678F, 0.0816F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cords4 = platesr4.addOrReplaceChild("cords4", CubeListBuilder.create(), PartPose.offset(21.9975F, 19.6752F, -0.9184F));
		PartDefinition hexadecagon_r161 = cords4.addOrReplaceChild("hexadecagon_r161", CubeListBuilder.create().texOffs(4, 469).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-25.3149F, -20.3972F, -3.8946F, 0.0F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r162 = cords4.addOrReplaceChild("hexadecagon_r162", CubeListBuilder.create().texOffs(16, 461).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-17.5149F, -18.4972F, 6.4946F, -1.2305F, 1.2192F, -0.9071F));
		PartDefinition hexadecagon_r163 = cords4.addOrReplaceChild("hexadecagon_r163", CubeListBuilder.create().texOffs(0, 460).mirror().addBox(-0.5F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-18.8149F, -18.4972F, 7.1946F, -0.2332F, 1.4524F, 0.1081F));
		PartDefinition hexadecagon_r164 = cords4.addOrReplaceChild("hexadecagon_r164", CubeListBuilder.create().texOffs(20, 461).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-19.8149F, -19.7972F, 6.5946F, 1.0227F, 1.3484F, 1.3765F));
		PartDefinition hexadecagon_r165 = cords4.addOrReplaceChild("hexadecagon_r165", CubeListBuilder.create().texOffs(0, 460).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-21.7149F, -20.3972F, 6.5946F, -0.8875F, 1.5167F, -0.9308F));
		PartDefinition hexadecagon_r166 = cords4.addOrReplaceChild("hexadecagon_r166", CubeListBuilder.create().texOffs(0, 464).mirror().addBox(-0.5F, -7.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-22.7149F, -19.4972F, 5.4946F, 1.3717F, 1.3484F, 1.3765F));
		PartDefinition hexadecagon_r167 = cords4.addOrReplaceChild("hexadecagon_r167", CubeListBuilder.create().texOffs(0, 456).mirror().addBox(-0.5F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-18.8149F, -18.4972F, -5.1946F, 0.2332F, -1.4524F, 0.1081F));
		PartDefinition hexadecagon_r168 = cords4.addOrReplaceChild("hexadecagon_r168", CubeListBuilder.create().texOffs(16, 459).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-17.5149F, -18.4972F, -4.4946F, 0.2332F, -1.4524F, 0.1081F));
		PartDefinition hexadecagon_r169 = cords4.addOrReplaceChild("hexadecagon_r169", CubeListBuilder.create().texOffs(4, 466).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-21.7149F, -20.3972F, -4.5946F, -1.4154F, -1.3484F, 1.3765F));
		PartDefinition hexadecagon_r170 = cords4.addOrReplaceChild("hexadecagon_r170", CubeListBuilder.create().texOffs(0, 464).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-22.7149F, -19.4972F, -3.4946F, -1.3717F, -1.3484F, 1.3765F));
		PartDefinition hexadecagon_r171 = cords4.addOrReplaceChild("hexadecagon_r171", CubeListBuilder.create().texOffs(8, 466).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-19.8149F, -19.7972F, -4.5946F, -1.0227F, -1.3484F, 1.3765F));
		PartDefinition hexadecagon_r172 = cords4.addOrReplaceChild("hexadecagon_r172", CubeListBuilder.create().texOffs(0, 458).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-23.4149F, -20.3972F, -2.5946F, 0.3491F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r173 = cords4.addOrReplaceChild("hexadecagon_r173", CubeListBuilder.create().texOffs(4, 458).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-25.7149F, -20.3972F, -2.8946F, -0.2182F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r174 = cords4.addOrReplaceChild("hexadecagon_r174", CubeListBuilder.create().texOffs(8, 458).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-23.3149F, -20.3972F, -0.5946F, -0.0436F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r175 = cords4.addOrReplaceChild("hexadecagon_r175", CubeListBuilder.create().texOffs(12, 459).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-25.5149F, -20.3972F, -0.5946F, 0.3491F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r176 = cords4.addOrReplaceChild("hexadecagon_r176", CubeListBuilder.create().texOffs(0, 462).mirror().addBox(-0.5F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-25.4149F, -20.3972F, 1.8054F, 0.5236F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r177 = cords4.addOrReplaceChild("hexadecagon_r177", CubeListBuilder.create().texOffs(0, 462).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-25.2149F, -20.3972F, 3.8054F, -0.0436F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r178 = cords4.addOrReplaceChild("hexadecagon_r178", CubeListBuilder.create().texOffs(2, 461).mirror().addBox(-0.5F, -5.0F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-24.4149F, -20.3972F, 3.8054F, 0.3491F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r179 = cords4.addOrReplaceChild("hexadecagon_r179", CubeListBuilder.create().texOffs(0, 461).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-23.9149F, -20.3972F, 2.5054F, 0.3491F, 0.0F, 0.2182F));
		PartDefinition hexadecagon_r180 = cords4.addOrReplaceChild("hexadecagon_r180", CubeListBuilder.create().texOffs(4, 462).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-24.3149F, -20.3972F, 0.5054F, 0.0F, 0.0F, 0.2182F));
		PartDefinition hing10 = bicepmain2.addOrReplaceChild("hing10", CubeListBuilder.create().texOffs(0, 426).mirror().addBox(-3.5F, -0.9946F, -5.0F, 8.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 444).mirror()
				.addBox(-3.5F, -5.0F, -0.9946F, 8.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-18.2443F, -19.9246F, 1.0F, 0.0F, 0.0F, -0.6545F));
		PartDefinition hexadecagon_r181 = hing10.addOrReplaceChild("hexadecagon_r181", CubeListBuilder.create().texOffs(34, 444).mirror().addBox(-7.0F, -5.0F, -0.9946F, 8.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 440)
				.mirror().addBox(-7.0F, -0.9946F, -5.0F, 8.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.5F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r182 = hing10.addOrReplaceChild("hexadecagon_r182", CubeListBuilder.create().texOffs(0, 444).mirror().addBox(-7.0F, -5.0F, -0.9946F, 8.0F, 10.0F, 1.9891F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 446)
				.mirror().addBox(-7.0F, -0.9946F, -5.0F, 8.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.5F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r183 = hing10.addOrReplaceChild("hexadecagon_r183", CubeListBuilder.create().texOffs(0, 425).mirror().addBox(-7.0F, -0.9946F, -5.0F, 8.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r184 = hing10.addOrReplaceChild("hexadecagon_r184", CubeListBuilder.create().texOffs(7, 446).mirror().addBox(-7.0F, -0.9946F, -5.0F, 8.0F, 1.9891F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone4 = hing10.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1172F, -3.8609F, -0.2646F, 0.0F, 0.0F, 0.8727F));
		PartDefinition hexadecagon_r185 = bone4.addOrReplaceChild("hexadecagon_r185", CubeListBuilder.create().texOffs(44, 422).mirror().addBox(-0.6396F, -2.9375F, -1.4598F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3108F, 1.4667F, 4.5671F, 0.3539F, 1.3793F, 1.1469F));
		PartDefinition hexadecagon_r186 = bone4.addOrReplaceChild("hexadecagon_r186", CubeListBuilder.create().texOffs(45, 418).mirror().addBox(-0.7501F, -2.9549F, -3.6258F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.3108F, 1.5667F, 4.8671F, 0.1302F, 1.0381F, 0.9113F));
		PartDefinition hexadecagon_r187 = bone4.addOrReplaceChild("hexadecagon_r187", CubeListBuilder.create().texOffs(44, 413).mirror().addBox(-3.0366F, -2.9567F, -3.4815F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.7509F, 1.0414F, 0.069F, 0.0F, 0.0F, 0.7418F));
		PartDefinition hexadecagon_r188 = bone4.addOrReplaceChild("hexadecagon_r188", CubeListBuilder.create().texOffs(46, 409).mirror().addBox(-0.8693F, -2.9662F, 0.1516F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.2806F, 1.5097F, -4.3209F, -0.0383F, -1.111F, 0.78F));
		PartDefinition hexadecagon_r189 = bone4.addOrReplaceChild("hexadecagon_r189", CubeListBuilder.create().texOffs(41, 421).mirror().addBox(-0.7479F, -2.9315F, -3.6067F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.2806F, 1.5097F, -4.3209F, -0.1529F, -1.4591F, 0.8977F));
		PartDefinition closetobodycore2 = bicepmain2.addOrReplaceChild("closetobodycore2", CubeListBuilder.create(), PartPose.offsetAndRotation(-20.5505F, -12.1293F, 1.0011F, 0.0F, 0.0F, 3.1416F));
		PartDefinition hexadecagon_r190 = closetobodycore2.addOrReplaceChild("hexadecagon_r190", CubeListBuilder.create().texOffs(264, 0).mirror().addBox(3.5F, 3.0F, -4.9946F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.2644F, -3.8679F, 0.0989F, 0.0F, 0.0F, 0.2618F));
		PartDefinition hexadecagon_r191 = closetobodycore2.addOrReplaceChild("hexadecagon_r191", CubeListBuilder.create().texOffs(36, 329).mirror().addBox(-0.1136F, -1.1035F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.936F, 1.0311F, 5.0044F, 0.0F, 0.9599F, 0.2618F));
		PartDefinition hexadecagon_r192 = closetobodycore2.addOrReplaceChild("hexadecagon_r192", CubeListBuilder.create().texOffs(320, 102).mirror().addBox(-4.0387F, -0.9871F, -5.8526F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.6721F, 3.7688F, -0.0516F, 0.0111F, -0.7548F, 0.9496F));
		PartDefinition hexadecagon_r193 = closetobodycore2.addOrReplaceChild("hexadecagon_r193", CubeListBuilder.create().texOffs(264, 24).mirror().addBox(-0.9837F, -1.0129F, -4.844F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.6721F, 3.7688F, -0.0516F, 0.0081F, -0.013F, 0.9571F));
		PartDefinition hexadecagon_r194 = closetobodycore2.addOrReplaceChild("hexadecagon_r194", CubeListBuilder.create().texOffs(320, 122).mirror().addBox(-4.8097F, -0.9871F, 2.1081F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.6721F, 3.7688F, -0.0516F, 0.0138F, 0.9469F, 0.9684F));
		PartDefinition hexadecagon_r195 = closetobodycore2.addOrReplaceChild("hexadecagon_r195", CubeListBuilder.create().texOffs(44, 329).mirror().addBox(-0.1136F, -1.1035F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.936F, 1.0311F, -4.8065F, 0.0F, -0.7418F, 0.2618F));
		PartDefinition hexadecagon_r196 = closetobodycore2.addOrReplaceChild("hexadecagon_r196", CubeListBuilder.create().texOffs(256, 206).mirror().addBox(-0.1136F, -1.1035F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.836F, -0.9689F, -4.8065F, 0.0F, -0.7418F, 0.2618F));
		PartDefinition hexadecagon_r197 = closetobodycore2.addOrReplaceChild("hexadecagon_r197", CubeListBuilder.create().texOffs(260, 259).mirror().addBox(3.5F, 3.0F, -4.9946F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.1644F, -5.8679F, 0.0989F, 0.0F, 0.0F, 0.2618F));
		PartDefinition hexadecagon_r198 = closetobodycore2.addOrReplaceChild("hexadecagon_r198", CubeListBuilder.create().texOffs(14, 294).mirror().addBox(-0.1136F, -1.1035F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.836F, -0.9689F, 5.0044F, 0.0F, 0.6545F, 0.2618F));
		PartDefinition hand2 = bicepmain2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offset(-24.0F, -12.0F, 0.0F));
		PartDefinition main2 = hand2.addOrReplaceChild("main2", CubeListBuilder.create().texOffs(58, 227).mirror().addBox(-27.0F, -11.0F, -4.0F, 6.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(194, 314).mirror()
				.addBox(-28.5F, -9.0F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(334, 174).mirror().addBox(-28.5F, -9.0F, 1.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(334, 241).mirror()
				.addBox(-28.5F, -9.0F, 3.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(34, 253).mirror().addBox(-28.5F, -9.0F, -0.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(302, 211).mirror()
				.addBox(-28.0F, -8.0F, -3.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(44, 304).mirror().addBox(-28.0F, -8.0F, -0.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(338, 245).mirror()
				.addBox(-28.0F, -8.0F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(338, 249).mirror().addBox(-28.0F, -8.0F, 4.9F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(24.0F, 12.0F, 0.0F));
		PartDefinition cube_r219 = main2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(120, 215).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-22.95F, -9.2F, -4.25F, 0.0F, -1.5708F, -0.2618F));
		PartDefinition cube_r220 = main2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(214, 199).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-24.35F, -10.0F, -4.25F, 0.0F, -1.5708F, -0.2618F));
		PartDefinition cube_r221 = main2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(334, 305).mirror().addBox(-0.75F, -1.75F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-25.75F, -7.25F, -4.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r222 = main2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(334, 298).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-23.25F, -11.0F, -3.85F, 0.0F, -1.5708F, 0.829F));
		PartDefinition cube_r223 = main2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(282, 334).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-23.25F, -9.0F, -3.85F, 0.0F, -1.5708F, 0.829F));
		PartDefinition pipe8 = main2.addOrReplaceChild("pipe8", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r224 = pipe8.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(41, 420).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-18.55F, -9.7F, 2.75F, 2.0508F, -0.9599F, -1.1781F));
		PartDefinition pipe9 = main2.addOrReplaceChild("pipe9", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r225 = pipe9.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(43, 425).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-18.25F, -9.0F, 0.15F, 0.0F, -1.5708F, 0.829F));
		PartDefinition pipe10 = main2.addOrReplaceChild("pipe10", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r226 = pipe10.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(47, 425).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-18.25F, -9.0F, -1.95F, 0.0F, -1.5708F, 0.6545F));
		PartDefinition pipe11 = main2.addOrReplaceChild("pipe11", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r227 = pipe11.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(43, 422).mirror().addBox(-0.5F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-19.15F, -9.0F, -3.25F, 0.0F, -1.5708F, 0.3927F));
		PartDefinition pipe12 = main2.addOrReplaceChild("pipe12", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r228 = pipe12.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(46, 421).mirror().addBox(-0.5F, -3.0F, 1.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-24.2F, -9.2F, 4.2F, -0.2788F, 0.1725F, -0.1411F));
		PartDefinition pipe13 = main2.addOrReplaceChild("pipe13", CubeListBuilder.create(), PartPose.offset(-27.2F, -8.4F, 4.2F));
		PartDefinition cube_r229 = pipe13.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(162, 294).mirror().addBox(-0.5F, -3.0F, -2.5F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.4415F, 0.2915F, 0.0987F));
		PartDefinition pipe14 = main2.addOrReplaceChild("pipe14", CubeListBuilder.create().texOffs(150, 190).mirror().addBox(-0.5F, -5.0F, -2.5F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-27.5F, -9.0F, -1.5F));
		PartDefinition fingercontrol2 = main2.addOrReplaceChild("fingercontrol2", CubeListBuilder.create().texOffs(236, 246).mirror().addBox(-1.1667F, 0.0F, -5.0333F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-25.8333F, -5.0F, 1.0333F));
		PartDefinition cube_r230 = fingercontrol2.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(74, 311).mirror().addBox(-0.25F, -0.75F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0833F, -2.25F, 4.5667F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r231 = fingercontrol2.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(62, 298).mirror().addBox(-0.25F, -0.75F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0833F, -2.25F, -5.0333F, 0.0F, -1.5708F, 0.0F));
		PartDefinition finger5 = fingercontrol2.addOrReplaceChild("finger5", CubeListBuilder.create().texOffs(174, 288).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1667F, 3.0F, -4.2333F, 0.0F, -0.48F, 0.0F));
		PartDefinition cube_r232 = finger5.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(318, 208).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(254, 38).mirror()
				.addBox(-1.0F, -1.0F, -1.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.7F, 0.0F, 0.0F, -0.7854F));
		PartDefinition tip6 = finger5.addOrReplaceChild("tip6", CubeListBuilder.create(), PartPose.offset(26.0F, 4.0F, 3.0F));
		PartDefinition cube_r233 = tip6.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(44, 266).mirror().addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-26.0F, -2.0F, -2.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r234 = tip6.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(338, 7).mirror().addBox(-1.0F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-24.8F, -1.4F, -2.9F, 0.0F, 0.0F, 0.0436F));
		PartDefinition cube_r235 = tip6.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(264, 158).mirror().addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-25.7F, -1.8F, -3.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r236 = tip6.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(122, 336).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-26.2F, -2.2F, -3.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition finger6 = fingercontrol2.addOrReplaceChild("finger6", CubeListBuilder.create().texOffs(282, 306).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-0.1667F, 3.0F, -1.2333F));
		PartDefinition cube_r237 = finger6.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(336, 295).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(336, 163).mirror()
				.addBox(-1.0F, -1.0F, -1.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.7F, 0.0F, 0.0F, -0.7854F));
		PartDefinition tip7 = finger6.addOrReplaceChild("tip7", CubeListBuilder.create(), PartPose.offset(26.0F, 4.0F, 3.0F));
		PartDefinition cube_r238 = tip7.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(298, 33).mirror().addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-26.0F, -2.0F, -2.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r239 = tip7.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(8, 338).mirror().addBox(-1.0F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-24.8F, -1.4F, -2.9F, 0.0F, 0.0F, 0.0436F));
		PartDefinition cube_r240 = tip7.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(286, 9).mirror().addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-25.7F, -1.8F, -3.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r241 = tip7.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(336, 127).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-26.2F, -2.2F, -3.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition finger7 = fingercontrol2.addOrReplaceChild("finger7", CubeListBuilder.create().texOffs(330, 151).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-0.1667F, 3.0F, 1.6667F));
		PartDefinition cube_r242 = finger7.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(58, 338).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(52, 338).mirror()
				.addBox(-1.0F, -1.0F, -1.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.7F, 0.0F, 0.0F, -0.7854F));
		PartDefinition tip8 = finger7.addOrReplaceChild("tip8", CubeListBuilder.create(), PartPose.offset(26.0F, 4.0F, 3.0F));
		PartDefinition cube_r243 = tip8.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(302, 117).mirror().addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-26.0F, -2.0F, -2.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r244 = tip8.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(338, 100).mirror().addBox(-1.0F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-24.8F, -1.4F, -2.9F, 0.0F, 0.0F, 0.0436F));
		PartDefinition cube_r245 = tip8.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(298, 227).mirror().addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-25.7F, -1.8F, -3.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r246 = tip8.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(336, 131).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-26.2F, -2.2F, -3.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition finger8 = fingercontrol2.addOrReplaceChild("finger8", CubeListBuilder.create().texOffs(332, 67).mirror().addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1667F, 3.0F, 4.4667F, 0.0F, 0.4363F, 0.0F));
		PartDefinition cube_r247 = finger8.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(338, 108).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(338, 105).mirror()
				.addBox(-1.0F, -1.0F, -1.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.7F, 0.0F, 0.0F, -0.7854F));
		PartDefinition tip9 = finger8.addOrReplaceChild("tip9", CubeListBuilder.create(), PartPose.offset(26.0F, 4.0F, 3.0F));
		PartDefinition cube_r248 = tip9.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(58, 308).mirror().addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-26.0F, -2.0F, -2.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r249 = tip9.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(338, 111).mirror().addBox(-1.0F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-24.8F, -1.4F, -2.9F, 0.0F, 0.0F, 0.0436F));
		PartDefinition cube_r250 = tip9.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(302, 155).mirror().addBox(-1.0F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-25.7F, -1.8F, -3.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r251 = tip9.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(336, 178).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-26.2F, -2.2F, -3.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition thumcontrol2 = main2.addOrReplaceChild("thumcontrol2", CubeListBuilder.create().texOffs(290, 318).mirror().addBox(-21.0F, -7.0F, -4.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r252 = thumcontrol2.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(336, 42).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-20.2787F, -4.921F, -1.7F, 0.8198F, 0.0072F, -0.1847F));
		PartDefinition thum2 = thumcontrol2.addOrReplaceChild("thum2", CubeListBuilder.create().texOffs(9, 449).mirror().addBox(-0.7787F, -1.421F, -1.2F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-21.0F, -2.9F, -2.1F, 0.0F, 0.0F, 0.2182F));
		PartDefinition cube_r253 = thum2.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(336, 116).mirror().addBox(-0.5F, -0.8852F, -0.7228F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2213F, 0.879F, -0.2F, 0.3927F, 0.0F, 0.0F));
		PartDefinition tip10 = thum2.addOrReplaceChild("tip10", CubeListBuilder.create().texOffs(182, 278).mirror().addBox(-0.7787F, 1.579F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		cyber_meka.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}