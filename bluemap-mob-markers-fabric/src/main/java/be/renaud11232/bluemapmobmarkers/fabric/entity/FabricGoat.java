package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Goat;

public class FabricGoat extends FabricAgeable<net.minecraft.world.entity.animal.goat.Goat> implements Goat {
    public FabricGoat(net.minecraft.world.entity.animal.goat.Goat wrapped) {
        super(wrapped);
    }
}
