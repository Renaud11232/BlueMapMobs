package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Drowned;

public class FabricDrowned extends AbstractFabricZombie<net.minecraft.world.entity.monster.zombie.Drowned> implements Drowned {
    public FabricDrowned(net.minecraft.world.entity.monster.zombie.Drowned wrapped) {
        super(wrapped);
    }
}
