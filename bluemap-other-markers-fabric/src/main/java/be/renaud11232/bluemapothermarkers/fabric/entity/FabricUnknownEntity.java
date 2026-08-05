package be.renaud11232.bluemapothermarkers.fabric.entity;

import be.renaud11232.bluemapentitymarkers.entity.UnknownEntity;
import be.renaud11232.bluemapentitymarkers.fabric.entity.FabricEntity;

public class FabricUnknownEntity extends FabricEntity<net.minecraft.world.entity.Entity> implements UnknownEntity {
    public FabricUnknownEntity(net.minecraft.world.entity.Entity wrapped) {
        super(wrapped);
    }
}
