package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Bee;

public class FabricBee extends FabricAgeable<net.minecraft.world.entity.animal.bee.Bee> implements Bee {
    public FabricBee(net.minecraft.world.entity.animal.bee.Bee wrapped) {
        super(wrapped);
    }

    @Override
    public boolean hasNectar() {
        return wrapped.hasNectar();
    }

    @Override
    public boolean isAngry() {
        return wrapped.isAngry();
    }
}
