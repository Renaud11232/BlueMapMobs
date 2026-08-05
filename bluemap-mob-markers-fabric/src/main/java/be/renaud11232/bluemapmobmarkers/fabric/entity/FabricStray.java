package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Stray;

public class FabricStray extends FabricMob<net.minecraft.world.entity.monster.skeleton.Stray> implements Stray {
    public FabricStray(net.minecraft.world.entity.monster.skeleton.Stray wrapped) {
        super(wrapped);
    }
}
