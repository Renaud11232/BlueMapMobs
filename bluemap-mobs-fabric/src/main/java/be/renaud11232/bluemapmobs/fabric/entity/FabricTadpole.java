package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Tadpole;

public class FabricTadpole extends FabricMob<net.minecraft.world.entity.animal.frog.Tadpole> implements Tadpole {
    public FabricTadpole(net.minecraft.world.entity.animal.frog.Tadpole wrapped) {
        super(wrapped);
    }
}
