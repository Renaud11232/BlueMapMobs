package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.ZombifiedPiglin;

public class FabricZombifiedPiglin extends AbstractFabricZombie<net.minecraft.world.entity.monster.zombie.ZombifiedPiglin> implements ZombifiedPiglin {
    public FabricZombifiedPiglin(net.minecraft.world.entity.monster.zombie.ZombifiedPiglin wrapped) {
        super(wrapped);
    }
}
