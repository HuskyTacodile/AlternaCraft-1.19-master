package com.huskytacodile.alternacraft.client.render.entity;

import com.google.common.collect.Maps;
import com.huskytacodile.alternacraft.Alternacraft;
import com.huskytacodile.alternacraft.client.model.entity.MalusaurusModel;
import com.huskytacodile.alternacraft.entities.MalusaurusEntity;
import com.huskytacodile.alternacraft.entities.variant.GenderVariant;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import javax.annotation.Nullable;
import java.util.Map;

public class MalusaurusRenderer extends GeoEntityRenderer<MalusaurusEntity>
{
    public MalusaurusRenderer(EntityRendererProvider.Context entityRendererProvider) {
        super(entityRendererProvider, new MalusaurusModel());
        this.shadowRadius = 4.0F;
    }
    public static final Map<GenderVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(GenderVariant.class), (p_114874_) -> {
                p_114874_.put(GenderVariant.MALE, new ResourceLocation("alternacraft:textures/entity/malusaurus_male.png"));
                p_114874_.put(GenderVariant.FEMALE, new ResourceLocation("alternacraft:textures/entity/malusaurus_female.png"));
            });
    @Override
    public ResourceLocation getTextureLocation(MalusaurusEntity entity) {
        return new ResourceLocation(Alternacraft.MOD_ID, "textures/entity/malusaurus.png");
    }

    @Override
    public RenderType getRenderType(MalusaurusEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource multiBufferSource, VertexConsumer vertexConsumer, int packedLightIn,
                                    ResourceLocation textureLocation)
    {
        if(animatable.isBaby()) {
            stack.scale(0.4F, 0.4F, 0.4F);
        } else {
            stack.scale(0.8F, 0.8F, 0.8F);
        }
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
    @Override
    protected float getDeathMaxRotation(MalusaurusEntity entityLivingBaseIn){
        return 0.0F;
    }
}
