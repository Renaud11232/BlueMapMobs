package be.renaud11232.bluemapothermarkers.fabric.entity;

import be.renaud11232.bluemapothermarkers.entity.ArmorStand;

public class FabricArmorStand extends FabricLivingEntity<net.minecraft.world.entity.decoration.ArmorStand> implements ArmorStand {
    public FabricArmorStand(net.minecraft.world.entity.decoration.ArmorStand wrapped) {
        super(wrapped);
    }
}
