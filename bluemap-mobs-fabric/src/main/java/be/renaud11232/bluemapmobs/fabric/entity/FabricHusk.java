package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Husk;

public class FabricHusk extends AbstractFabricZombie<net.minecraft.world.entity.monster.zombie.Husk> implements Husk {
    public FabricHusk(net.minecraft.world.entity.monster.zombie.Husk wrapped) {
        super(wrapped);
    }
}
