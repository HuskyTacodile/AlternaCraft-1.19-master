package com.huskytacodile.alternacraft.client.render.entity;

import com.google.common.collect.Maps;
import com.huskytacodile.alternacraft.client.model.entity.GigaModel;
import com.huskytacodile.alternacraft.entities.dinos.carnivore.large.GigaEntity;
import com.huskytacodile.alternacraft.entities.variant.QuadVariant;
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

public class GigaRenderer extends GeoEntityRenderer<GigaEntity>
{
    public GigaRenderer(EntityRendererProvider.Context entityRendererProvider) {
        super(entityRendererProvider, new GigaModel());
        this.shadowRadius = 4.0F;
    }
    public static final Map<QuadVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(QuadVariant.class), (p_114874_) -> {
                p_114874_.put(QuadVariant.MALE, new ResourceLocation("alternacraft:textures/entity/giga_male.png"));
                p_114874_.put(QuadVariant.FEMALE, new ResourceLocation("alternacraft:textures/entity/giga_female.png"));
                p_114874_.put(QuadVariant.FEMALE2, new ResourceLocation("alternacraft:textures/entity/giga_female2.png"));
                p_114874_.put(QuadVariant.MALE2, new ResourceLocation("alternacraft:textures/entity/giga_male2.png"));
            });
    @Override
    public ResourceLocation getTextureLocation(GigaEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public RenderType getRenderType(GigaEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource multiBufferSource, VertexConsumer vertexConsumer, int packedLightIn,
                                    ResourceLocation textureLocation)
    {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
    @Override
    protected float getDeathMaxRotation(GigaEntity entityLivingBaseIn){
        return 0.0F;
    }
}
