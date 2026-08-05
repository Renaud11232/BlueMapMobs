package be.renaud11232.bluemapothermarkers.fabric.entity;

import be.renaud11232.bluemapothermarkers.entity.Mannequin;

public class FabricMannequin extends FabricLivingEntity<net.minecraft.world.entity.decoration.Mannequin> implements Mannequin {
    public FabricMannequin(net.minecraft.world.entity.decoration.Mannequin wrapped) {
        super(wrapped);
    }
}
