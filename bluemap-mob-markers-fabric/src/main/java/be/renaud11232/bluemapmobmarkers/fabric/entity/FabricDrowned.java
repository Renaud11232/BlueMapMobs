package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Drowned;

public class FabricDrowned extends AbstractFabricZombie<net.minecraft.world.entity.monster.zombie.Drowned> implements Drowned {
    public FabricDrowned(net.minecraft.world.entity.monster.zombie.Drowned wrapped) {
        super(wrapped);
    }
}
