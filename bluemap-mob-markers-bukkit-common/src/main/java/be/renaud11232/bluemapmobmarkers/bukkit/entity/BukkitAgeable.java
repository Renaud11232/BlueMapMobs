package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Ageable;

public abstract class BukkitAgeable<T extends org.bukkit.entity.Ageable> extends BukkitMob<T> implements Ageable {
    public BukkitAgeable(T wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isAdult() {
        return wrapped.isAdult();
    }
}
