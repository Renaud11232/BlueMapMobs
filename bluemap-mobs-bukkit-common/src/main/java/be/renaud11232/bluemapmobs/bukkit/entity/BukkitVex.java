package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Vex;

public class BukkitVex extends BukkitMob<org.bukkit.entity.Vex> implements Vex {
    public BukkitVex(org.bukkit.entity.Vex wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isCharging() {
        return wrapped.isCharging();
    }
}
