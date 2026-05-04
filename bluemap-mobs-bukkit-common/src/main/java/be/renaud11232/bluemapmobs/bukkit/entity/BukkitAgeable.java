package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Ageable;

public abstract class BukkitAgeable<T extends org.bukkit.entity.Ageable> extends BukkitMob<T> implements Ageable {
    public BukkitAgeable(T wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isAdult() {
        return wrapped.isAdult();
    }
}
