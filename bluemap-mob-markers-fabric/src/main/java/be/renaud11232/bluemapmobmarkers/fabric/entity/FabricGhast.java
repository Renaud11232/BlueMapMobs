package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Ghast;

public class FabricGhast extends FabricMob<net.minecraft.world.entity.monster.Ghast> implements Ghast {
    public FabricGhast(net.minecraft.world.entity.monster.Ghast wrapped) {
        super(wrapped);
    }
}
