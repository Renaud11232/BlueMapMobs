package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Strider;

public class FabricStrider extends FabricAgeable<net.minecraft.world.entity.monster.Strider> implements Strider {
    public FabricStrider(net.minecraft.world.entity.monster.Strider wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isShivering() {
        return wrapped.isSuffocating();
    }
}
