package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Bee;

public class BukkitBee extends BukkitAgeable<org.bukkit.entity.Bee> implements Bee {
    public BukkitBee(org.bukkit.entity.Bee wrapped) {
        super(wrapped);
    }

    @Override
    public boolean hasNectar() {
        return wrapped.hasNectar();
    }

    @Override
    public int getAnger() {
        return wrapped.getAnger();
    }
}
