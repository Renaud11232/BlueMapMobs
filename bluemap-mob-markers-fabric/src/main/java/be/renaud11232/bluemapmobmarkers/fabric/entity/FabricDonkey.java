package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Donkey;

public class FabricDonkey extends FabricAgeable<net.minecraft.world.entity.animal.equine.Donkey> implements Donkey {
    public FabricDonkey(net.minecraft.world.entity.animal.equine.Donkey wrapped) {
        super(wrapped);
    }
}
