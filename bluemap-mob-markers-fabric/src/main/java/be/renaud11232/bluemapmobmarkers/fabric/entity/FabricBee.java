package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Bee;

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
