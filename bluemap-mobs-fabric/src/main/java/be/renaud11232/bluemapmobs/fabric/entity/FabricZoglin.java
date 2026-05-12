package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Zoglin;

public class FabricZoglin extends FabricMob<net.minecraft.world.entity.monster.Zoglin> implements Zoglin {
    public FabricZoglin(net.minecraft.world.entity.monster.Zoglin wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isAdult() {
        return wrapped.isAdult();
    }
}
