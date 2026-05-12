package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Zombie;

public abstract class AbstractFabricZombie<T extends net.minecraft.world.entity.monster.zombie.Zombie> extends FabricMob<T> implements Zombie {
    public AbstractFabricZombie(T wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isAdult() {
        return !wrapped.isBaby();
    }
}
