package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Salmon;

public class FabricSalmon extends FabricMob<net.minecraft.world.entity.animal.fish.Salmon> implements Salmon {
    public FabricSalmon(net.minecraft.world.entity.animal.fish.Salmon wrapped) {
        super(wrapped);
    }
}
