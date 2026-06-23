package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.SulfurCube;

public class BukkitSulfurCube extends BukkitMob<org.bukkit.entity.SulfurCube> implements SulfurCube {
    public BukkitSulfurCube(org.bukkit.entity.SulfurCube wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isAdult() {
        return wrapped.getSize() > 1;
    }
}
