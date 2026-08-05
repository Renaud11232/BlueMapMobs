package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Snowman;

public class BukkitSnowman extends BukkitMob<org.bukkit.entity.Snowman> implements Snowman {
    public BukkitSnowman(org.bukkit.entity.Snowman wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isDerp() {
        return wrapped.isDerp();
    }
}
