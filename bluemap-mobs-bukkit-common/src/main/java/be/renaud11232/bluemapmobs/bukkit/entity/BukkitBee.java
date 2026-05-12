package be.renaud11232.bluemapmobs.bukkit.entity;

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
    public boolean isAngry() {
        return wrapped.getAnger() > 0;
    }
}
