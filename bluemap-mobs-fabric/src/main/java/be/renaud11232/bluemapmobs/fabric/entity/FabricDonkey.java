package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Donkey;

public class FabricDonkey extends FabricAgeable<net.minecraft.world.entity.animal.equine.Donkey> implements Donkey {
    public FabricDonkey(net.minecraft.world.entity.animal.equine.Donkey wrapped) {
        super(wrapped);
    }
}
