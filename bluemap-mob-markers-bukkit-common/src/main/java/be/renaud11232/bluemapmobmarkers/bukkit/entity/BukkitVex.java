package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Vex;

public class BukkitVex extends BukkitMob<org.bukkit.entity.Vex> implements Vex {
    public BukkitVex(org.bukkit.entity.Vex wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isCharging() {
        return wrapped.isCharging();
    }
}
