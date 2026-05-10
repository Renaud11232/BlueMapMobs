package be.renaud11232.bluemapothers.fabric.entity;

import be.renaud11232.bluemapothers.entity.ArmorStand;

public class FabricArmorStand extends FabricLivingEntity<net.minecraft.world.entity.decoration.ArmorStand> implements ArmorStand {
    public FabricArmorStand(net.minecraft.world.entity.decoration.ArmorStand wrapped) {
        super(wrapped);
    }
}
