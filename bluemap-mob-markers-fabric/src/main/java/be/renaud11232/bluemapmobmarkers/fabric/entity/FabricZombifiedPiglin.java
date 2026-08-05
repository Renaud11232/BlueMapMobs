package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.ZombifiedPiglin;

public class FabricZombifiedPiglin extends AbstractFabricZombie<net.minecraft.world.entity.monster.zombie.ZombifiedPiglin> implements ZombifiedPiglin {
    public FabricZombifiedPiglin(net.minecraft.world.entity.monster.zombie.ZombifiedPiglin wrapped) {
        super(wrapped);
    }
}
