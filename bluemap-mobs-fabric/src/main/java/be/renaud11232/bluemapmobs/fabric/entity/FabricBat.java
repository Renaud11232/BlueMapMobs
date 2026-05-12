package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Bat;

public class FabricBat extends FabricMob<net.minecraft.world.entity.ambient.Bat> implements Bat {
    public FabricBat(net.minecraft.world.entity.ambient.Bat wrapped) {
        super(wrapped);
    }
}
