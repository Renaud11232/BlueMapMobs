package be.renaud11232.bluemapothers.fabric.entity;

import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.entity.UnknownEntity;
import be.renaud11232.bluemapentities.fabric.entity.FabricEntity;

public class FabricUnknownEntity extends FabricEntity<net.minecraft.world.entity.Entity> implements Entity, UnknownEntity {
    public FabricUnknownEntity(net.minecraft.world.entity.Entity wrapped) {
        super(wrapped);
    }
}
