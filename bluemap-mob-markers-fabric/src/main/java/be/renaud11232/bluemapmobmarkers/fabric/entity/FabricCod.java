package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Cod;

public class FabricCod extends FabricMob<net.minecraft.world.entity.animal.fish.Cod> implements Cod {
    public FabricCod(net.minecraft.world.entity.animal.fish.Cod wrapped) {
        super(wrapped);
    }
}
