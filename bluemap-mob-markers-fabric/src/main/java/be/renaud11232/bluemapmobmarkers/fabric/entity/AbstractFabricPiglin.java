package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.AbstractPiglin;

public abstract class AbstractFabricPiglin<T extends net.minecraft.world.entity.monster.piglin.AbstractPiglin> extends FabricMob<T> implements AbstractPiglin {
    public AbstractFabricPiglin(T wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isAdult() {
        return wrapped.isAdult();
    }
}
