package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.ZombieHorse;

public class FabricZombieHorse extends FabricAgeable<net.minecraft.world.entity.animal.equine.ZombieHorse> implements ZombieHorse {
    public FabricZombieHorse(net.minecraft.world.entity.animal.equine.ZombieHorse wrapped) {
        super(wrapped);
    }
}
